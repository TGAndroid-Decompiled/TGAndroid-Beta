package org.telegram.ui.Delegates;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarPreviewPagerIndicator;
import org.telegram.ui.Cells.MemberRequestCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public abstract class MemberRequestsDelegate implements MemberRequestCell.OnClickListener {
    private final long chatId;
    private final MemberRequestsController controller;
    private final int currentAccount;
    private StickerEmptyView emptyView;
    private final BaseFragment fragment;
    private TLRPC.TL_chatInviteImporter importer;
    public final boolean isChannel;
    private boolean isDataLoaded;
    private boolean isLoading;
    public boolean isNeedRestoreList;
    private boolean isSearchExpanded;
    private final FrameLayout layoutContainer;
    private FlickerLoadingView loadingView;
    private PreviewDialog previewDialog;
    private String query;
    private RecyclerListView recyclerView;
    private FrameLayout rootLayout;
    private StickerEmptyView searchEmptyView;
    private int searchRequestId;
    private Runnable searchRunnable;
    private final boolean showSearchMenu;
    private final List currentImporters = new ArrayList();
    private final LongSparseArray users = new LongSparseArray();
    private final ArrayList allImporters = new ArrayList();
    private final Adapter adapter = new Adapter();
    private boolean hasMore = true;
    private boolean isFirstLoading = true;
    private boolean isShowLastItemDivider = true;
    private final Runnable loadMembersRunnable = new Runnable() {
        @Override
        public final void run() {
            MemberRequestsDelegate.this.lambda$new$8();
        }
    };
    private final RecyclerView.OnScrollListener listScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (!MemberRequestsDelegate.this.hasMore || MemberRequestsDelegate.this.isLoading || linearLayoutManager == null) {
                return;
            }
            if (MemberRequestsDelegate.this.adapter.getItemCount() - linearLayoutManager.findLastVisibleItemPosition() < 10) {
                AndroidUtilities.cancelRunOnUIThread(MemberRequestsDelegate.this.loadMembersRunnable);
                AndroidUtilities.runOnUIThread(MemberRequestsDelegate.this.loadMembersRunnable);
            }
        }
    };

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        public int extraFirstHolders() {
            return !MemberRequestsDelegate.this.isShowLastItemDivider ? 1 : 0;
        }

        private int extraLastHolders() {
            return (MemberRequestsDelegate.this.currentImporters.isEmpty() || !MemberRequestsDelegate.this.hasMore) ? 0 : 1;
        }

        public void appendItems(List list) {
            int i = 0;
            while (i < list.size()) {
                long j = ((TLRPC.TL_chatInviteImporter) list.get(i)).user_id;
                int i2 = 0;
                while (true) {
                    if (i2 >= MemberRequestsDelegate.this.currentImporters.size()) {
                        break;
                    }
                    if (((TLRPC.TL_chatInviteImporter) MemberRequestsDelegate.this.currentImporters.get(i2)).user_id == j) {
                        list.remove(i);
                        i--;
                        break;
                    }
                    i2++;
                }
                i++;
            }
            MemberRequestsDelegate.this.currentImporters.addAll(list);
            notifyItemRangeInserted(((!MemberRequestsDelegate.this.isShowLastItemDivider ? 1 : 0) + MemberRequestsDelegate.this.currentImporters.size()) - list.size(), list.size());
        }

        @Override
        public int getItemCount() {
            return extraFirstHolders() + MemberRequestsDelegate.this.currentImporters.size() + extraLastHolders();
        }

        @Override
        public int getItemViewType(int i) {
            if (i != 0 || MemberRequestsDelegate.this.isShowLastItemDivider) {
                return (i != getItemCount() + (-1) || extraLastHolders() <= 0) ? 0 : 4;
            }
            return 2;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() != 0) {
                if (viewHolder.getItemViewType() == 2) {
                    viewHolder.itemView.requestLayout();
                    return;
                }
                return;
            }
            MemberRequestCell memberRequestCell = (MemberRequestCell) viewHolder.itemView;
            int extraFirstHolders = i - extraFirstHolders();
            LongSparseArray longSparseArray = MemberRequestsDelegate.this.users;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) MemberRequestsDelegate.this.currentImporters.get(extraFirstHolders);
            boolean z = true;
            if (extraFirstHolders == MemberRequestsDelegate.this.currentImporters.size() - 1 && !MemberRequestsDelegate.this.hasMore) {
                z = false;
            }
            memberRequestCell.setData(longSparseArray, tL_chatInviteImporter, z);
        }

        @Override
        public RecyclerListView.Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 1) {
                View view2 = new View(viewGroup.getContext());
                view2.setBackground(Theme.getThemedDrawableByKey(viewGroup.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                view = view2;
            } else if (i == 2) {
                view = new View(viewGroup.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                    }
                };
            } else if (i == 3) {
                view = new View(viewGroup.getContext());
            } else if (i != 4) {
                Context context = viewGroup.getContext();
                MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
                MemberRequestCell memberRequestCell = new MemberRequestCell(context, memberRequestsDelegate, memberRequestsDelegate.isChannel);
                memberRequestCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MemberRequestsDelegate.this.fragment.getResourceProvider()));
                view = memberRequestCell;
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(MemberRequestsDelegate.this.fragment.getParentActivity(), MemberRequestsDelegate.this.fragment.getResourceProvider()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        setMeasuredDimension(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(104.0f));
                    }
                };
                if (MemberRequestsDelegate.this.isShowLastItemDivider) {
                    flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MemberRequestsDelegate.this.fragment.getResourceProvider()));
                }
                flickerLoadingView.setColors(Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundGray, -1);
                flickerLoadingView.setViewType(15);
                flickerLoadingView.setMemberRequestButton(MemberRequestsDelegate.this.isChannel);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setItemsCount(1);
                view = flickerLoadingView;
            }
            return new RecyclerListView.Holder(view);
        }

        public void removeItem(TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
            int i = 0;
            while (true) {
                if (i >= MemberRequestsDelegate.this.currentImporters.size()) {
                    i = -1;
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) MemberRequestsDelegate.this.currentImporters.get(i)).user_id == tL_chatInviteImporter.user_id) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                MemberRequestsDelegate.this.currentImporters.remove(i);
                notifyItemRemoved(i + extraFirstHolders());
                if (MemberRequestsDelegate.this.currentImporters.isEmpty()) {
                    notifyItemRemoved(1);
                }
            }
        }

        public void setItems(List list) {
            boolean isEmpty = MemberRequestsDelegate.this.currentImporters.isEmpty();
            int i = 0;
            while (i < list.size()) {
                long j = ((TLRPC.TL_chatInviteImporter) list.get(i)).user_id;
                int i2 = i + 1;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (((TLRPC.TL_chatInviteImporter) list.get(i2)).user_id == j) {
                        list.remove(i);
                        i--;
                        break;
                    }
                    i2++;
                }
                i++;
            }
            MemberRequestsDelegate.this.currentImporters.clear();
            MemberRequestsDelegate.this.currentImporters.addAll(list);
            if (isEmpty) {
                notifyItemRangeInserted(!MemberRequestsDelegate.this.isShowLastItemDivider ? 1 : 0, MemberRequestsDelegate.this.currentImporters.size());
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public class PreviewDialog extends Dialog {
        private float animationProgress;
        private ValueAnimator animator;
        private BitmapDrawable backgroundDrawable;
        private final TextView bioText;
        private final ViewGroup contentView;
        private BackupImageView imageView;
        private TLRPC.TL_chatInviteImporter importer;
        private final TextView nameText;
        private final AvatarPreviewPagerIndicator pagerIndicator;
        private final Drawable pagerShadowDrawable;
        private final ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
        private final int shadowPaddingLeft;
        private final int shadowPaddingTop;
        private final ProfileGalleryView viewPager;

        public PreviewDialog(Context context, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context, R.style.TransparentDialog2);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
            this.pagerShadowDrawable = mutate;
            TextView textView = new TextView(getContext());
            this.nameText = textView;
            TextView textView2 = new TextView(getContext());
            this.bioText = textView2;
            ViewGroup viewGroup = new ViewGroup(getContext()) {
                private final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public boolean onDown(MotionEvent motionEvent) {
                        return true;
                    }

                    @Override
                    public boolean onSingleTapUp(MotionEvent motionEvent) {
                        if (!PreviewDialog.this.pagerShadowDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (PreviewDialog.this.popupLayout.getLeft() >= motionEvent.getX() || motionEvent.getX() >= PreviewDialog.this.popupLayout.getRight() || PreviewDialog.this.popupLayout.getTop() >= motionEvent.getY() || motionEvent.getY() >= PreviewDialog.this.popupLayout.getBottom())) {
                            PreviewDialog.this.dismiss();
                        }
                        return super.onSingleTapUp(motionEvent);
                    }
                });
                private final Path clipPath = new Path();
                private final RectF rectF = new RectF();
                private boolean firstSizeChange = true;

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    canvas.save();
                    canvas.clipPath(this.clipPath);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    PreviewDialog.this.pagerShadowDrawable.draw(canvas);
                    super.onDraw(canvas);
                }

                @Override
                protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                    int height = (getHeight() - PreviewDialog.this.getContentHeight()) / 2;
                    int width = (getWidth() - PreviewDialog.this.viewPager.getMeasuredWidth()) / 2;
                    PreviewDialog.this.viewPager.layout(width, height, PreviewDialog.this.viewPager.getMeasuredWidth() + width, PreviewDialog.this.viewPager.getMeasuredHeight() + height);
                    PreviewDialog.this.pagerIndicator.layout(PreviewDialog.this.viewPager.getLeft(), PreviewDialog.this.viewPager.getTop(), PreviewDialog.this.viewPager.getRight(), PreviewDialog.this.viewPager.getTop() + PreviewDialog.this.pagerIndicator.getMeasuredHeight());
                    int measuredHeight = height + PreviewDialog.this.viewPager.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
                    PreviewDialog.this.nameText.layout(PreviewDialog.this.viewPager.getLeft() + AndroidUtilities.dp(16.0f), measuredHeight, PreviewDialog.this.viewPager.getRight() - AndroidUtilities.dp(16.0f), PreviewDialog.this.nameText.getMeasuredHeight() + measuredHeight);
                    int measuredHeight2 = measuredHeight + PreviewDialog.this.nameText.getMeasuredHeight();
                    if (PreviewDialog.this.bioText.getVisibility() != 8) {
                        int dp = measuredHeight2 + AndroidUtilities.dp(4.0f);
                        PreviewDialog.this.bioText.layout(PreviewDialog.this.nameText.getLeft(), dp, PreviewDialog.this.nameText.getRight(), PreviewDialog.this.bioText.getMeasuredHeight() + dp);
                        measuredHeight2 = dp + PreviewDialog.this.bioText.getMeasuredHeight();
                    }
                    int dp2 = measuredHeight2 + AndroidUtilities.dp(12.0f);
                    PreviewDialog.this.pagerShadowDrawable.setBounds(PreviewDialog.this.viewPager.getLeft() - PreviewDialog.this.shadowPaddingLeft, PreviewDialog.this.viewPager.getTop() - PreviewDialog.this.shadowPaddingTop, PreviewDialog.this.viewPager.getRight() + PreviewDialog.this.shadowPaddingLeft, PreviewDialog.this.shadowPaddingTop + dp2);
                    PreviewDialog.this.popupLayout.layout((PreviewDialog.this.viewPager.getRight() - PreviewDialog.this.popupLayout.getMeasuredWidth()) + PreviewDialog.this.shadowPaddingLeft, dp2, PreviewDialog.this.viewPager.getRight() + PreviewDialog.this.shadowPaddingLeft, PreviewDialog.this.popupLayout.getMeasuredHeight() + dp2);
                    PreviewDialog.this.popupLayout.setVisibility(PreviewDialog.this.popupLayout.getBottom() < i4 ? 0 : 8);
                    int dp3 = AndroidUtilities.dp(6.0f);
                    this.rectF.set(PreviewDialog.this.viewPager.getLeft(), PreviewDialog.this.viewPager.getTop(), PreviewDialog.this.viewPager.getRight(), PreviewDialog.this.viewPager.getTop() + (dp3 * 2));
                    this.clipPath.reset();
                    Path path = this.clipPath;
                    RectF rectF = this.rectF;
                    float f = dp3;
                    Path.Direction direction = Path.Direction.CW;
                    path.addRoundRect(rectF, f, f, direction);
                    this.rectF.set(i, PreviewDialog.this.viewPager.getTop() + dp3, i3, i4);
                    this.clipPath.addRect(this.rectF, direction);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    setWillNotDraw(false);
                    super.onMeasure(i, i2);
                    int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
                    double measuredHeight = getMeasuredHeight();
                    Double.isNaN(measuredHeight);
                    int min2 = Math.min(min, (int) (measuredHeight * 0.66d)) - (AndroidUtilities.dp(12.0f) * 2);
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min2, Integer.MIN_VALUE);
                    PreviewDialog.this.viewPager.measure(makeMeasureSpec, makeMeasureSpec);
                    PreviewDialog.this.pagerIndicator.measure(makeMeasureSpec, makeMeasureSpec);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min2 - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
                    PreviewDialog.this.nameText.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
                    PreviewDialog.this.bioText.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
                    PreviewDialog.this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(PreviewDialog.this.viewPager.getMeasuredWidth() + (PreviewDialog.this.shadowPaddingLeft * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }

                @Override
                protected void onSizeChanged(int i, int i2, int i3, int i4) {
                    super.onSizeChanged(i, i2, i3, i4);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        PreviewDialog.super.dismiss();
                    }
                    if (i == i3 || i2 == i4) {
                        return;
                    }
                    if (!this.firstSizeChange) {
                        PreviewDialog.this.updateBackgroundBitmap();
                    }
                    this.firstSizeChange = false;
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    return this.gestureDetector.onTouchEvent(motionEvent);
                }

                @Override
                protected boolean verifyDrawable(Drawable drawable) {
                    return drawable == PreviewDialog.this.pagerShadowDrawable || super.verifyDrawable(drawable);
                }
            };
            this.contentView = viewGroup;
            setCancelable(true);
            viewGroup.setVisibility(4);
            int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, MemberRequestsDelegate.this.fragment.getResourceProvider());
            mutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            mutate.setCallback(viewGroup);
            Rect rect = new Rect();
            mutate.getPadding(rect);
            this.shadowPaddingTop = rect.top;
            this.shadowPaddingLeft = rect.left;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, resourcesProvider);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setBackgroundColor(color);
            viewGroup.addView(actionBarPopupWindowLayout);
            AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = new AvatarPreviewPagerIndicator(getContext()) {
                @Override
                public void onDraw(Canvas canvas) {
                    if (this.profileGalleryView.getRealCount() > 1) {
                        super.onDraw(canvas);
                    }
                }
            };
            this.pagerIndicator = avatarPreviewPagerIndicator;
            ProfileGalleryView profileGalleryView = new ProfileGalleryView(context, MemberRequestsDelegate.this.fragment.getActionBar(), recyclerListView, avatarPreviewPagerIndicator);
            this.viewPager = profileGalleryView;
            profileGalleryView.setCreateThumbFromParent(true);
            viewGroup.addView(profileGalleryView);
            avatarPreviewPagerIndicator.setProfileGalleryView(profileGalleryView);
            viewGroup.addView(avatarPreviewPagerIndicator);
            textView.setMaxLines(1);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, MemberRequestsDelegate.this.fragment.getResourceProvider()));
            textView.setTextSize(16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            viewGroup.addView(textView);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, MemberRequestsDelegate.this.fragment.getResourceProvider()));
            textView2.setTextSize(14.0f);
            viewGroup.addView(textView2);
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(context, true, false);
            int i = Theme.key_actionBarDefaultSubmenuItem;
            int color2 = Theme.getColor(i, resourcesProvider);
            int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
            actionBarMenuSubItem.setColors(color2, Theme.getColor(i2, resourcesProvider));
            int i3 = Theme.key_dialogButtonSelector;
            actionBarMenuSubItem.setSelectorColor(Theme.getColor(i3, resourcesProvider));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(z ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MemberRequestsDelegate.PreviewDialog.this.lambda$new$0(view);
                }
            });
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(context, false, false);
            actionBarMenuSubItem2.setColors(Theme.getColor(i, resourcesProvider), Theme.getColor(i2, resourcesProvider));
            actionBarMenuSubItem2.setSelectorColor(Theme.getColor(i3, resourcesProvider));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3);
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MemberRequestsDelegate.PreviewDialog.this.lambda$new$1(view);
                }
            });
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem2);
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(context, false, true);
            actionBarMenuSubItem3.setColors(Theme.getColor(Theme.key_text_RedBold, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
            actionBarMenuSubItem3.setSelectorColor(Theme.getColor(i3, resourcesProvider));
            actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove);
            actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MemberRequestsDelegate.PreviewDialog.this.lambda$new$2(view);
                }
            });
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem3);
        }

        private Bitmap getBlurredBitmap() {
            int measuredWidth = (int) (this.contentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.contentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.save();
            ((LaunchActivity) MemberRequestsDelegate.this.fragment.getParentActivity()).getActionBarLayout().getView().draw(canvas);
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
            Dialog visibleDialog = MemberRequestsDelegate.this.fragment.getVisibleDialog();
            if (visibleDialog != null) {
                visibleDialog.getWindow().getDecorView().draw(canvas);
            }
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            return createBitmap;
        }

        public int getContentHeight() {
            int measuredHeight = this.viewPager.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.nameText.getMeasuredHeight();
            if (this.bioText.getVisibility() != 8) {
                measuredHeight += AndroidUtilities.dp(4.0f) + this.bioText.getMeasuredHeight();
            }
            return measuredHeight + AndroidUtilities.dp(12.0f) + this.popupLayout.getMeasuredHeight();
        }

        private int getContentWidth() {
            return this.viewPager.getMeasuredWidth();
        }

        public void lambda$new$0(View view) {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = this.importer;
            if (tL_chatInviteImporter != null) {
                MemberRequestsDelegate.this.onAddClicked(tL_chatInviteImporter);
            }
            MemberRequestsDelegate.this.hidePreview();
        }

        public void lambda$new$1(View view) {
            if (this.importer != null) {
                MemberRequestsDelegate.this.isNeedRestoreList = true;
                super.dismiss();
                MemberRequestsDelegate.this.fragment.dismissCurrentDialog();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.importer.user_id);
                MemberRequestsDelegate.this.fragment.presentFragment(new ChatActivity(bundle));
            }
        }

        public void lambda$new$2(View view) {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = this.importer;
            if (tL_chatInviteImporter != null) {
                MemberRequestsDelegate.this.onDismissClicked(tL_chatInviteImporter);
            }
            MemberRequestsDelegate.this.hidePreview();
        }

        public void lambda$runAnimation$4(float f, float f2, float f3, float f4, int i, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.animationProgress = floatValue;
            float f5 = f + ((1.0f - f) * floatValue);
            this.contentView.setScaleX(f5);
            this.contentView.setScaleY(f5);
            this.contentView.setTranslationX(f2 * (1.0f - this.animationProgress));
            this.contentView.setTranslationY(f3 * (1.0f - this.animationProgress));
            int i2 = (int) (f4 * (1.0f - this.animationProgress));
            this.viewPager.setRoundRadius(i2, i2);
            float clamp = MathUtils.clamp((this.animationProgress * 2.0f) - 1.0f, 0.0f, 1.0f);
            this.pagerShadowDrawable.setAlpha((int) (clamp * 255.0f));
            this.nameText.setAlpha(clamp);
            this.bioText.setAlpha(clamp);
            this.popupLayout.setTranslationY(i * (1.0f - this.animationProgress));
            this.popupLayout.setAlpha(clamp);
            BitmapDrawable bitmapDrawable = this.backgroundDrawable;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (this.animationProgress * 255.0f));
            }
            this.pagerIndicator.setAlpha(clamp);
        }

        public void lambda$show$3() {
            updateBackgroundBitmap();
            runAnimation(true);
        }

        private void runAnimation(final boolean z) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int[] iArr = new int[2];
            this.imageView.getLocationOnScreen(iArr);
            final float width = (this.imageView.getWidth() * 1.0f) / getContentWidth();
            final float width2 = (this.imageView.getWidth() / 2.0f) / width;
            float f = 1.0f - width;
            final float left = iArr[0] - (this.viewPager.getLeft() + ((int) ((getContentWidth() * f) / 2.0f)));
            final float top = iArr[1] - (this.viewPager.getTop() + ((int) ((getContentHeight() * f) / 2.0f)));
            final int i = (-this.popupLayout.getTop()) / 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    MemberRequestsDelegate.PreviewDialog.this.lambda$runAnimation$4(width, left, top, width2, i, valueAnimator2);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (z) {
                        return;
                    }
                    PreviewDialog.super.dismiss();
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    PreviewDialog.this.contentView.setVisibility(0);
                    if (z) {
                        PreviewDialog.this.contentView.setScaleX(width);
                        PreviewDialog.this.contentView.setScaleY(width);
                    }
                }
            });
            this.animator.setDuration(220L);
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.start();
        }

        public void updateBackgroundBitmap() {
            BitmapDrawable bitmapDrawable = this.backgroundDrawable;
            int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getContext().getResources(), getBlurredBitmap());
            this.backgroundDrawable = bitmapDrawable2;
            bitmapDrawable2.setAlpha(alpha);
            getWindow().setBackgroundDrawable(this.backgroundDrawable);
        }

        @Override
        public void dismiss() {
            runAnimation(false);
        }

        @Override
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            getWindow().setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(this.contentView, new ViewGroup.LayoutParams(-1, -1));
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.dimAmount = 0.0f;
            int i = attributes.flags & (-3);
            attributes.flags = i;
            attributes.gravity = 51;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                attributes.flags = i | (-2147417856);
            }
            if (i2 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            getWindow().setAttributes(attributes);
        }

        public void setImporter(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, BackupImageView backupImageView) {
            this.importer = tL_chatInviteImporter;
            this.imageView = backupImageView;
            TLRPC.User user = MessagesController.getInstance(MemberRequestsDelegate.this.currentAccount).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(user, 0);
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user, 1);
            if (MessagesController.getInstance(MemberRequestsDelegate.this.currentAccount).getUserFull(tL_chatInviteImporter.user_id) == null) {
                MessagesController.getInstance(MemberRequestsDelegate.this.currentAccount).loadUserInfo(user, false, 0);
            }
            this.viewPager.setParentAvatarImage(backupImageView);
            this.viewPager.setData(tL_chatInviteImporter.user_id, true);
            this.viewPager.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
            this.nameText.setText(UserObject.getUserName((TLRPC.User) MemberRequestsDelegate.this.users.get(tL_chatInviteImporter.user_id)));
            this.bioText.setText(tL_chatInviteImporter.about);
            this.bioText.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
            this.contentView.requestLayout();
        }

        @Override
        public void show() {
            super.show();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MemberRequestsDelegate.PreviewDialog.this.lambda$show$3();
                }
            }, 80L);
        }
    }

    public MemberRequestsDelegate(BaseFragment baseFragment, FrameLayout frameLayout, long j, boolean z) {
        this.fragment = baseFragment;
        this.layoutContainer = frameLayout;
        this.chatId = j;
        int currentAccount = baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        this.isChannel = ChatObject.isChannelAndNotMegaGroup(j, currentAccount);
        this.showSearchMenu = z;
        this.controller = MemberRequestsController.getInstance(currentAccount);
    }

    private void hideChatJoinRequest(final TLRPC.TL_chatInviteImporter tL_chatInviteImporter, final boolean z) {
        final TLRPC.User user = (TLRPC.User) this.users.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        final TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_hideChatJoinRequest, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MemberRequestsDelegate.this.lambda$hideChatJoinRequest$7(tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest, tLObject, tL_error);
            }
        });
    }

    public void hidePreview() {
        this.previewDialog.dismiss();
        this.importer = null;
    }

    public void lambda$hideChatJoinRequest$6(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this.fragment, tL_messages_hideChatJoinRequest, new Object[0]);
            return;
        }
        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
        if (!tL_updates.chats.isEmpty()) {
            MessagesController.getInstance(this.currentAccount).loadFullChat(tL_updates.chats.get(0).id, 0, true);
        }
        int i = 0;
        while (true) {
            if (i >= this.allImporters.size()) {
                break;
            }
            if (((TLRPC.TL_chatInviteImporter) this.allImporters.get(i)).user_id == tL_chatInviteImporter.user_id) {
                this.allImporters.remove(i);
                break;
            }
            i++;
        }
        this.adapter.removeItem(tL_chatInviteImporter);
        onImportersChanged(this.query, false, true);
        if (z) {
            Bulletin.MultiLineLayout multiLineLayout = new Bulletin.MultiLineLayout(this.fragment.getParentActivity(), this.fragment.getResourceProvider());
            multiLineLayout.imageView.setRoundRadius(AndroidUtilities.dp(15.0f));
            multiLineLayout.imageView.setForUserOrChat(user, new AvatarDrawable(user));
            String firstName = UserObject.getFirstName(user);
            String formatString = this.isChannel ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            int indexOf = formatString.indexOf(firstName);
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
            multiLineLayout.textView.setText(spannableStringBuilder);
            (this.allImporters.isEmpty() ? Bulletin.make(this.fragment, multiLineLayout, 2750) : Bulletin.make(this.layoutContainer, multiLineLayout, 2750)).show();
        }
        ActionBarMenu createMenu = this.fragment.getActionBar().createMenu();
        if (TextUtils.isEmpty(this.query) && this.showSearchMenu) {
            createMenu.getItem(0).setVisibility(this.allImporters.isEmpty() ? 8 : 0);
        }
    }

    public void lambda$hideChatJoinRequest$7(final TLRPC.TL_chatInviteImporter tL_chatInviteImporter, final boolean z, final TLRPC.User user, final TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MemberRequestsDelegate.this.lambda$hideChatJoinRequest$6(tL_error, tLObject, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest);
            }
        });
    }

    public void lambda$loadMembers$2() {
        setViewVisible(this.loadingView, true, true);
    }

    public void lambda$loadMembers$3(boolean z, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.isLoading = false;
        this.isDataLoaded = true;
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        setViewVisible(this.loadingView, false, false);
        if (TextUtils.equals(str, this.query) && tL_error == null) {
            this.isDataLoaded = true;
            onImportersLoaded((TLRPC.TL_messages_chatInviteImporters) tLObject, str, z2, false);
        }
    }

    public void lambda$loadMembers$4(final boolean z, final Runnable runnable, final String str, final boolean z2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MemberRequestsDelegate.this.lambda$loadMembers$3(z, runnable, str, tL_error, tLObject, z2);
            }
        });
    }

    public void lambda$loadMembers$5(boolean z) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        final boolean isEmpty = TextUtils.isEmpty(this.query);
        final String str = this.query;
        this.isLoading = true;
        this.isFirstLoading = false;
        if (!isEmpty || this.currentImporters.isEmpty()) {
            tL_chatInviteImporter = null;
        } else {
            List list = this.currentImporters;
            tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) list.get(list.size() - 1);
        }
        final boolean z2 = tL_chatInviteImporter == null;
        final Runnable runnable = (isEmpty && z2 && z) ? new Runnable() {
            @Override
            public final void run() {
                MemberRequestsDelegate.this.lambda$loadMembers$2();
            }
        } : null;
        if (isEmpty) {
            AndroidUtilities.runOnUIThread(runnable, 300L);
        }
        this.searchRequestId = this.controller.getImporters(this.chatId, str, tL_chatInviteImporter, this.users, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MemberRequestsDelegate.this.lambda$loadMembers$4(isEmpty, runnable, str, z2, tLObject, tL_error);
            }
        });
    }

    public void lambda$onItemClick$0(DialogInterface dialogInterface) {
        this.previewDialog = null;
    }

    public void lambda$onItemClick$1(MemberRequestCell memberRequestCell) {
        TLRPC.TL_chatInviteImporter importer = memberRequestCell.getImporter();
        this.importer = importer;
        TLRPC.User user = (TLRPC.User) this.users.get(importer.user_id);
        if (user == null) {
            return;
        }
        this.fragment.getMessagesController().putUser(user, false);
        Point point = AndroidUtilities.displaySize;
        boolean z = point.x > point.y;
        if (user.photo == null || z) {
            this.isNeedRestoreList = true;
            this.fragment.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            ProfileActivity profileActivity = new ProfileActivity(bundle);
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("removeFragmentOnChatOpen", false);
            this.fragment.presentFragment(profileActivity);
            return;
        }
        if (this.previewDialog == null) {
            PreviewDialog previewDialog = new PreviewDialog(this.fragment.getParentActivity(), (RecyclerListView) memberRequestCell.getParent(), this.fragment.getResourceProvider(), this.isChannel);
            this.previewDialog = previewDialog;
            previewDialog.setImporter(this.importer, memberRequestCell.getAvatarImageView());
            this.previewDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    MemberRequestsDelegate.this.lambda$onItemClick$0(dialogInterface);
                }
            });
            this.previewDialog.show();
        }
    }

    private void onImportersLoaded(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z, boolean z2) {
        boolean z3 = false;
        boolean z4 = !this.currentImporters.isEmpty() && this.hasMore;
        for (int i = 0; i < tL_messages_chatInviteImporters.users.size(); i++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i);
            this.users.put(user.id, user);
        }
        if (z) {
            this.adapter.setItems(tL_messages_chatInviteImporters.importers);
        } else {
            boolean z5 = tL_messages_chatInviteImporters.importers.size() > 0 && this.currentImporters.size() + tL_messages_chatInviteImporters.importers.size() < tL_messages_chatInviteImporters.count;
            if (z5) {
                this.adapter.notifyItemRemoved((!this.isShowLastItemDivider ? 1 : 0) + this.currentImporters.size());
            }
            this.adapter.appendItems(tL_messages_chatInviteImporters.importers);
            if (z5) {
                this.adapter.notifyItemInserted((!this.isShowLastItemDivider ? 1 : 0) + this.currentImporters.size());
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (z) {
                this.allImporters.clear();
            }
            this.allImporters.addAll(tL_messages_chatInviteImporters.importers);
            if (this.showSearchMenu) {
                this.fragment.getActionBar().createMenu().getItem(0).setVisibility(this.allImporters.isEmpty() ? 8 : 0);
            }
        }
        onImportersChanged(str, z2, false);
        this.hasMore = this.currentImporters.size() < tL_messages_chatInviteImporters.count;
        if (!this.currentImporters.isEmpty() && this.hasMore) {
            z3 = true;
        }
        if (z4 != z3) {
            if (this.hasMore) {
                Adapter adapter = this.adapter;
                adapter.notifyItemInserted(adapter.getItemCount() - 1);
            } else {
                Adapter adapter2 = this.adapter;
                adapter2.notifyItemRemoved(adapter2.getItemCount());
            }
        }
    }

    private void setViewVisible(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        boolean z3 = view.getVisibility() == 0;
        float f = z ? 1.0f : 0.0f;
        if (z == z3 && f == view.getAlpha()) {
            return;
        }
        if (!z2) {
            view.setVisibility(z ? 0 : 4);
            return;
        }
        if (z) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f).setDuration(150L).start();
    }

    public Adapter getAdapter() {
        return this.adapter;
    }

    public StickerEmptyView getEmptyView() {
        if (this.emptyView == null) {
            StickerEmptyView stickerEmptyView = new StickerEmptyView(this.fragment.getParentActivity(), null, 16, this.fragment.getResourceProvider());
            this.emptyView = stickerEmptyView;
            stickerEmptyView.title.setText(LocaleController.getString(this.isChannel ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.emptyView.subtitle.setText(LocaleController.getString(this.isChannel ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.emptyView.setAnimateLayoutChange(true);
            this.emptyView.setVisibility(8);
        }
        return this.emptyView;
    }

    public FlickerLoadingView getLoadingView() {
        if (this.loadingView == null) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.fragment.getParentActivity(), this.fragment.getResourceProvider());
            this.loadingView = flickerLoadingView;
            flickerLoadingView.setAlpha(0.0f);
            if (this.isShowLastItemDivider) {
                this.loadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.fragment.getResourceProvider()));
            }
            this.loadingView.setColors(Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundGray, -1);
            this.loadingView.setViewType(15);
            this.loadingView.setMemberRequestButton(this.isChannel);
        }
        return this.loadingView;
    }

    public FrameLayout getRootLayout() {
        if (this.rootLayout == null) {
            FrameLayout frameLayout = new FrameLayout(this.fragment.getParentActivity());
            this.rootLayout = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.fragment.getResourceProvider()));
            FlickerLoadingView loadingView = getLoadingView();
            this.loadingView = loadingView;
            this.rootLayout.addView(loadingView, -1, -1);
            StickerEmptyView searchEmptyView = getSearchEmptyView();
            this.searchEmptyView = searchEmptyView;
            this.rootLayout.addView(searchEmptyView, -1, -1);
            StickerEmptyView emptyView = getEmptyView();
            this.emptyView = emptyView;
            this.rootLayout.addView(emptyView, LayoutHelper.createFrame(-1, -1.0f));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.fragment.getParentActivity());
            RecyclerListView recyclerListView = new RecyclerListView(this.fragment.getParentActivity());
            this.recyclerView = recyclerListView;
            recyclerListView.setAdapter(this.adapter);
            this.recyclerView.setLayoutManager(linearLayoutManager);
            this.recyclerView.setOnItemClickListener(new MemberRequestsDelegate$$ExternalSyntheticLambda2(this));
            this.recyclerView.setOnScrollListener(this.listScrollListener);
            this.recyclerView.setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.fragment.getResourceProvider()));
            this.rootLayout.addView(this.recyclerView, -1, -1);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.recyclerView.setItemAnimator(defaultItemAnimator);
        }
        return this.rootLayout;
    }

    public StickerEmptyView getSearchEmptyView() {
        if (this.searchEmptyView == null) {
            StickerEmptyView stickerEmptyView = new StickerEmptyView(this.fragment.getParentActivity(), null, 1, this.fragment.getResourceProvider());
            this.searchEmptyView = stickerEmptyView;
            if (this.isShowLastItemDivider) {
                stickerEmptyView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.fragment.getResourceProvider()));
            }
            this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
            this.searchEmptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.searchEmptyView.setAnimateLayoutChange(true);
            this.searchEmptyView.setVisibility(8);
        }
        return this.searchEmptyView;
    }

    public boolean hasAllImporters() {
        return !this.allImporters.isEmpty();
    }

    public void lambda$new$8() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        final boolean z = true;
        if (this.isFirstLoading && (cachedImporters = this.controller.getCachedImporters(this.chatId)) != null) {
            this.isDataLoaded = true;
            onImportersLoaded(cachedImporters, null, true, true);
            z = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MemberRequestsDelegate.this.lambda$loadMembers$5(z);
            }
        });
    }

    @Override
    public void onAddClicked(TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        hideChatJoinRequest(tL_chatInviteImporter, true);
    }

    public boolean onBackPressed() {
        PreviewDialog previewDialog = this.previewDialog;
        if (previewDialog == null) {
            return true;
        }
        previewDialog.dismiss();
        return false;
    }

    @Override
    public void onDismissClicked(TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        hideChatJoinRequest(tL_chatInviteImporter, false);
    }

    public void onImportersChanged(String str, boolean z, boolean z2) {
        boolean z3;
        if (TextUtils.isEmpty(str)) {
            z3 = !this.allImporters.isEmpty() || z;
            StickerEmptyView stickerEmptyView = this.emptyView;
            if (stickerEmptyView != null) {
                stickerEmptyView.setVisibility(z3 ? 4 : 0);
            }
            StickerEmptyView stickerEmptyView2 = this.searchEmptyView;
            if (stickerEmptyView2 != null) {
                stickerEmptyView2.setVisibility(4);
            }
        } else {
            z3 = !this.currentImporters.isEmpty() || z;
            StickerEmptyView stickerEmptyView3 = this.emptyView;
            if (stickerEmptyView3 != null) {
                stickerEmptyView3.setVisibility(4);
            }
            StickerEmptyView stickerEmptyView4 = this.searchEmptyView;
            if (stickerEmptyView4 != null) {
                stickerEmptyView4.setVisibility(z3 ? 4 : 0);
            }
        }
        setViewVisible(this.recyclerView, z3, true);
        if (this.allImporters.isEmpty()) {
            StickerEmptyView stickerEmptyView5 = this.emptyView;
            if (stickerEmptyView5 != null) {
                stickerEmptyView5.setVisibility(0);
            }
            StickerEmptyView stickerEmptyView6 = this.searchEmptyView;
            if (stickerEmptyView6 != null) {
                stickerEmptyView6.setVisibility(4);
            }
            setViewVisible(this.loadingView, false, false);
            if (this.isSearchExpanded && this.showSearchMenu) {
                this.fragment.getActionBar().createMenu().closeSearchField(true);
            }
        }
    }

    public void onItemClick(View view, int i) {
        if (view instanceof MemberRequestCell) {
            if (this.isSearchExpanded) {
                AndroidUtilities.hideKeyboard(this.fragment.getParentActivity().getCurrentFocus());
            }
            final MemberRequestCell memberRequestCell = (MemberRequestCell) view;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MemberRequestsDelegate.this.lambda$onItemClick$1(memberRequestCell);
                }
            }, this.isSearchExpanded ? 100L : 0L);
        }
    }

    public void setAdapterItemsEnabled(boolean z) {
        int extraFirstHolders;
        if (this.recyclerView == null || (extraFirstHolders = this.adapter.extraFirstHolders()) < 0 || extraFirstHolders >= this.recyclerView.getChildCount()) {
            return;
        }
        this.recyclerView.getChildAt(extraFirstHolders).setEnabled(z);
    }

    public void setQuery(String str) {
        if (this.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(this.searchRunnable);
            this.searchRunnable = null;
        }
        if (this.searchRequestId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.searchRequestId, false);
            this.searchRequestId = 0;
        }
        this.query = str;
        if (this.isDataLoaded && this.allImporters.isEmpty()) {
            setViewVisible(this.loadingView, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.adapter.setItems(this.allImporters);
            setViewVisible(this.recyclerView, true, true);
            setViewVisible(this.loadingView, false, false);
            StickerEmptyView stickerEmptyView = this.searchEmptyView;
            if (stickerEmptyView != null) {
                stickerEmptyView.setVisibility(4);
            }
            if (str == null && this.showSearchMenu) {
                this.fragment.getActionBar().createMenu().getItem(0).setVisibility(this.allImporters.isEmpty() ? 8 : 0);
            }
        } else {
            this.adapter.setItems(Collections.emptyList());
            setViewVisible(this.recyclerView, false, false);
            setViewVisible(this.loadingView, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    MemberRequestsDelegate.this.lambda$new$8();
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }
        if (str != null) {
            StickerEmptyView stickerEmptyView2 = this.emptyView;
            if (stickerEmptyView2 != null) {
                stickerEmptyView2.setVisibility(4);
            }
            StickerEmptyView stickerEmptyView3 = this.searchEmptyView;
            if (stickerEmptyView3 != null) {
                stickerEmptyView3.setVisibility(4);
            }
        }
    }

    public void setRecyclerView(RecyclerListView recyclerListView) {
        this.recyclerView = recyclerListView;
        recyclerListView.setOnItemClickListener(new MemberRequestsDelegate$$ExternalSyntheticLambda2(this));
        final RecyclerView.OnScrollListener onScrollListener = recyclerListView.getOnScrollListener();
        if (onScrollListener == null) {
            recyclerListView.setOnScrollListener(this.listScrollListener);
        } else {
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    onScrollListener.onScrollStateChanged(recyclerView, i);
                    MemberRequestsDelegate.this.listScrollListener.onScrollStateChanged(recyclerView, i);
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    onScrollListener.onScrolled(recyclerView, i, i2);
                    MemberRequestsDelegate.this.listScrollListener.onScrolled(recyclerView, i, i2);
                }
            });
        }
    }

    public void setSearchExpanded(boolean z) {
        this.isSearchExpanded = z;
    }

    public void setShowLastItemDivider(boolean z) {
        this.isShowLastItemDivider = z;
    }
}
