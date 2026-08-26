package org.telegram.ui.Delegates;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
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
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController$$ExternalSyntheticLambda37;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarPreviewPagerIndicator;
import org.telegram.ui.Cells.MemberRequestCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTabStrip;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PaymentFormActivity;

public abstract class MemberRequestsDelegate implements MemberRequestCell.OnClickListener {
    public final long chatId;
    public final MemberRequestsController controller;
    public final int currentAccount;
    public StickerEmptyView emptyView;
    public final BaseFragment fragment;
    public TLRPC.TL_chatInviteImporter importer;
    public final boolean isChannel;
    public boolean isDataLoaded;
    public boolean isLoading;
    public boolean isNeedRestoreList;
    public boolean isSearchExpanded;
    public final FrameLayout layoutContainer;
    public FlickerLoadingView loadingView;
    public PreviewDialog previewDialog;
    public String query;
    public RecyclerListView recyclerView;
    public FrameLayout rootLayout;
    public StickerEmptyView searchEmptyView;
    public int searchRequestId;
    public MemberRequestsDelegate$$ExternalSyntheticLambda2 searchRunnable;
    public final boolean showSearchMenu;
    public final ArrayList currentImporters = new ArrayList();
    public final LongSparseArray users = new LongSparseArray();
    public final ArrayList allImporters = new ArrayList();
    public final Adapter adapter = new Adapter();
    public boolean hasMore = true;
    public boolean isFirstLoading = true;
    public boolean isShowLastItemDivider = true;
    public final MemberRequestsDelegate$$ExternalSyntheticLambda2 loadMembersRunnable = new MemberRequestsDelegate$$ExternalSyntheticLambda2(this, 0);
    public final LocationActivity.AnonymousClass10 listScrollListener = new LocationActivity.AnonymousClass10(this, 15);

    public final class Adapter extends RecyclerListView.SelectionAdapter {

        public final class AnonymousClass2 extends FlickerLoadingView {
            @Override
            public final void onMeasure(int i, int i2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(104.0f));
            }
        }

        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
            int i = !memberRequestsDelegate.isShowLastItemDivider ? 1 : 0;
            ArrayList arrayList = memberRequestsDelegate.currentImporters;
            return ((arrayList.isEmpty() || !memberRequestsDelegate.hasMore) ? 0 : 1) + arrayList.size() + i;
        }

        @Override
        public final int getItemViewType(int i) {
            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
            if (i != 0 || memberRequestsDelegate.isShowLastItemDivider) {
                return (i == getItemCount() + (-1) && !memberRequestsDelegate.currentImporters.isEmpty() && memberRequestsDelegate.hasMore) ? 4 : 0;
            }
            return 2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 == 2) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            MemberRequestCell memberRequestCell = (MemberRequestCell) view;
            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
            int i3 = i - (!memberRequestsDelegate.isShowLastItemDivider ? 1 : 0);
            LongSparseArray longSparseArray = memberRequestsDelegate.users;
            ArrayList arrayList = memberRequestsDelegate.currentImporters;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i3);
            boolean z = i3 != arrayList.size() - 1 || memberRequestsDelegate.hasMore;
            memberRequestCell.importer = tL_chatInviteImporter;
            memberRequestCell.isNeedDivider = z;
            memberRequestCell.setWillNotDraw(!z);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            AvatarDrawable avatarDrawable = memberRequestCell.avatarDrawable;
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            BackupImageView backupImageView = memberRequestCell.avatarImageView;
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
            memberRequestCell.nameTextView.setText(UserObject.getUserName(user), false);
            String dateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            boolean z2 = tL_chatInviteImporter.via_chatlist;
            SimpleTextView simpleTextView = memberRequestCell.statusTextView;
            if (z2) {
                simpleTextView.setText(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j = tL_chatInviteImporter.approved_by;
            if (j == 0) {
                simpleTextView.setText(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, dateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j);
            if (user2 != null) {
                simpleTextView.setText(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), dateAudio), false);
            } else {
                simpleTextView.setText("", false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 1) {
                view = new View(viewGroup.getContext());
            } else if (i == 2) {
                PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(viewGroup.getContext(), 15);
                anonymousClass2.setTag(-33024);
                view = anonymousClass2;
            } else if (i != 3) {
                MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
                if (i != 4) {
                    view = new MemberRequestCell(viewGroup.getContext(), memberRequestsDelegate, memberRequestsDelegate.isChannel);
                } else {
                    Activity parentActivity = memberRequestsDelegate.fragment.getParentActivity();
                    BaseFragment baseFragment = memberRequestsDelegate.fragment;
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2(parentActivity, baseFragment.getResourceProvider());
                    if (memberRequestsDelegate.isShowLastItemDivider) {
                        anonymousClass3.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, baseFragment.getResourceProvider()));
                    }
                    int i2 = Theme.key_windowBackgroundWhite;
                    int i3 = Theme.key_windowBackgroundGray;
                    anonymousClass3.colorKey1 = i2;
                    anonymousClass3.colorKey2 = i3;
                    anonymousClass3.colorKey3 = -1;
                    anonymousClass3.invalidate();
                    anonymousClass3.setViewType(15);
                    anonymousClass3.setMemberRequestButton(memberRequestsDelegate.isChannel);
                    anonymousClass3.setIsSingleCell(true);
                    anonymousClass3.setItemsCount(1);
                    anonymousClass3.setTag(-33024);
                    view = anonymousClass3;
                }
            } else {
                view = new View(viewGroup.getContext());
            }
            return new RecyclerListView.Holder(view);
        }

        public final void setItems(List list) {
            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
            boolean zIsEmpty = memberRequestsDelegate.currentImporters.isEmpty();
            int i = 0;
            while (i < list.size()) {
                long j = ((TLRPC.TL_chatInviteImporter) list.get(i)).user_id;
                for (int i2 = i + 1; i2 < list.size(); i2++) {
                    if (((TLRPC.TL_chatInviteImporter) list.get(i2)).user_id == j) {
                        list.remove(i);
                        i--;
                        break;
                    }
                }
                i++;
            }
            ArrayList arrayList = memberRequestsDelegate.currentImporters;
            arrayList.clear();
            arrayList.addAll(list);
            RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
            if (zIsEmpty) {
                adapterDataObservable.notifyItemRangeInserted(!memberRequestsDelegate.isShowLastItemDivider ? 1 : 0, arrayList.size());
            } else {
                adapterDataObservable.notifyChanged();
            }
        }
    }

    public final class PreviewDialog extends Dialog {
        public float animationProgress;
        public ValueAnimator animator;
        public BitmapDrawable backgroundDrawable;
        public final TextView bioText;
        public final AnonymousClass3 contentView;
        public BackupImageView imageView;
        public TLRPC.TL_chatInviteImporter importer;
        public final TextView nameText;
        public final AnonymousClass1 pagerIndicator;
        public final Drawable pagerShadowDrawable;
        public final ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
        public final int shadowPaddingLeft;
        public final int shadowPaddingTop;
        public final ProfileGalleryView viewPager;

        public final class AnonymousClass1 extends AvatarPreviewPagerIndicator {
            @Override
            public final void onDraw(Canvas canvas) {
                if (this.profileGalleryView.getRealCount() > 1) {
                    super.onDraw(canvas);
                }
            }
        }

        public PreviewDialog(Activity activity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(activity, R.style.TransparentDialog2);
            Resources resources = getContext().getResources();
            int i = R.drawable.popup_fixed_alert2;
            Drawable drawableMutate = resources.getDrawable(i).mutate();
            this.pagerShadowDrawable = drawableMutate;
            TextView textView = new TextView(getContext());
            this.nameText = textView;
            TextView textView2 = new TextView(getContext());
            this.bioText = textView2;
            ?? r7 = new ViewGroup(getContext()) {
                public final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public final boolean onDown(MotionEvent motionEvent) {
                        return true;
                    }

                    @Override
                    public final boolean onSingleTapUp(MotionEvent motionEvent) {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        if (!PreviewDialog.this.pagerShadowDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (PreviewDialog.this.popupLayout.getLeft() >= motionEvent.getX() || motionEvent.getX() >= PreviewDialog.this.popupLayout.getRight() || PreviewDialog.this.popupLayout.getTop() >= motionEvent.getY() || motionEvent.getY() >= PreviewDialog.this.popupLayout.getBottom())) {
                            PreviewDialog.this.runAnimation(false);
                        }
                        return super.onSingleTapUp(motionEvent);
                    }
                });
                public final Path clipPath = new Path();
                public final RectF rectF = new RectF();
                public boolean firstSizeChange = true;

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    canvas.save();
                    canvas.clipPath(this.clipPath);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    PreviewDialog.this.pagerShadowDrawable.draw(canvas);
                    super.onDraw(canvas);
                }

                @Override
                public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                    int height = getHeight();
                    PreviewDialog previewDialog = PreviewDialog.this;
                    int measuredHeight = previewDialog.nameText.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + previewDialog.viewPager.getMeasuredHeight();
                    TextView textView3 = previewDialog.bioText;
                    if (textView3.getVisibility() != 8) {
                        measuredHeight += textView3.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
                    }
                    int measuredHeight2 = (height - ((previewDialog.popupLayout.getMeasuredHeight() + AndroidUtilities.dp(12.0f)) + measuredHeight)) / 2;
                    int width = (getWidth() - previewDialog.viewPager.getMeasuredWidth()) / 2;
                    ProfileGalleryView profileGalleryView = previewDialog.viewPager;
                    profileGalleryView.layout(width, measuredHeight2, profileGalleryView.getMeasuredWidth() + width, previewDialog.viewPager.getMeasuredHeight() + measuredHeight2);
                    previewDialog.pagerIndicator.layout(previewDialog.viewPager.getLeft(), previewDialog.viewPager.getTop(), previewDialog.viewPager.getRight(), previewDialog.pagerIndicator.getMeasuredHeight() + previewDialog.viewPager.getTop());
                    int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(previewDialog.viewPager.getMeasuredHeight(), 12.0f, measuredHeight2);
                    previewDialog.nameText.layout(AndroidUtilities.dp(16.0f) + previewDialog.viewPager.getLeft(), iM, previewDialog.viewPager.getRight() - AndroidUtilities.dp(16.0f), previewDialog.nameText.getMeasuredHeight() + iM);
                    int measuredHeight3 = previewDialog.nameText.getMeasuredHeight() + iM;
                    if (previewDialog.bioText.getVisibility() != 8) {
                        int iDp = AndroidUtilities.dp(4.0f) + measuredHeight3;
                        previewDialog.bioText.layout(previewDialog.nameText.getLeft(), iDp, previewDialog.nameText.getRight(), previewDialog.bioText.getMeasuredHeight() + iDp);
                        measuredHeight3 = previewDialog.bioText.getMeasuredHeight() + iDp;
                    }
                    int iDp2 = AndroidUtilities.dp(12.0f) + measuredHeight3;
                    previewDialog.pagerShadowDrawable.setBounds(previewDialog.viewPager.getLeft() - previewDialog.shadowPaddingLeft, previewDialog.viewPager.getTop() - previewDialog.shadowPaddingTop, previewDialog.viewPager.getRight() + previewDialog.shadowPaddingLeft, previewDialog.shadowPaddingTop + iDp2);
                    previewDialog.popupLayout.layout((previewDialog.viewPager.getRight() - previewDialog.popupLayout.getMeasuredWidth()) + previewDialog.shadowPaddingLeft, iDp2, previewDialog.viewPager.getRight() + previewDialog.shadowPaddingLeft, previewDialog.popupLayout.getMeasuredHeight() + iDp2);
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = previewDialog.popupLayout;
                    actionBarPopupWindowLayout.setVisibility(actionBarPopupWindowLayout.getBottom() < i5 ? 0 : 8);
                    int iDp3 = AndroidUtilities.dp(6.0f);
                    RectF rectF = this.rectF;
                    rectF.set(previewDialog.viewPager.getLeft(), previewDialog.viewPager.getTop(), previewDialog.viewPager.getRight(), (iDp3 * 2) + previewDialog.viewPager.getTop());
                    Path path = this.clipPath;
                    path.reset();
                    float f = iDp3;
                    Path.Direction direction = Path.Direction.CW;
                    path.addRoundRect(rectF, f, f, direction);
                    rectF.set(i2, previewDialog.viewPager.getTop() + iDp3, i4, i5);
                    path.addRect(rectF, direction);
                }

                @Override
                public final void onMeasure(int i2, int i3) {
                    setWillNotDraw(false);
                    super.onMeasure(i2, i3);
                    int iM$3 = OKLCH.m$3(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (((double) getMeasuredHeight()) * 0.66d)));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM$3, Integer.MIN_VALUE);
                    PreviewDialog previewDialog = PreviewDialog.this;
                    previewDialog.viewPager.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    previewDialog.pagerIndicator.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iM$3 - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
                    previewDialog.nameText.measure(iMakeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
                    previewDialog.bioText.measure(iMakeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
                    previewDialog.popupLayout.measure(View.MeasureSpec.makeMeasureSpec((previewDialog.shadowPaddingLeft * 2) + previewDialog.viewPager.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }

                @Override
                public final void onSizeChanged(int i2, int i3, int i4, int i5) {
                    super.onSizeChanged(i2, i3, i4, i5);
                    Point point = AndroidUtilities.displaySize;
                    int i6 = point.x;
                    int i7 = point.y;
                    PreviewDialog previewDialog = PreviewDialog.this;
                    if (i6 > i7) {
                        PreviewDialog.super.dismiss();
                    }
                    if (i2 == i4 || i3 == i5) {
                        return;
                    }
                    if (!this.firstSizeChange) {
                        previewDialog.updateBackgroundBitmap();
                    }
                    this.firstSizeChange = false;
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    return this.gestureDetector.onTouchEvent(motionEvent);
                }

                @Override
                public final boolean verifyDrawable(Drawable drawable) {
                    return drawable == PreviewDialog.this.pagerShadowDrawable || super.verifyDrawable(drawable);
                }
            };
            this.contentView = r7;
            setCancelable(true);
            r7.setVisibility(4);
            int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, MemberRequestsDelegate.this.fragment.getResourceProvider());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            drawableMutate.setCallback(r7);
            Rect rect = new Rect();
            drawableMutate.getPadding(rect);
            this.shadowPaddingTop = rect.top;
            this.shadowPaddingLeft = rect.left;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(i, 0, activity, resourcesProvider);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setBackgroundColor(color);
            r7.addView(actionBarPopupWindowLayout);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext());
            this.pagerIndicator = anonymousClass1;
            BaseFragment baseFragment = MemberRequestsDelegate.this.fragment;
            ProfileGalleryView profileGalleryView = new ProfileGalleryView(activity, baseFragment.getActionBar(), recyclerListView, anonymousClass1);
            this.viewPager = profileGalleryView;
            profileGalleryView.setCreateThumbFromParent(true);
            r7.addView(profileGalleryView);
            anonymousClass1.setProfileGalleryView(profileGalleryView);
            r7.addView(anonymousClass1);
            textView.setMaxLines(1);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, baseFragment.getResourceProvider()));
            textView.setTextSize(16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            r7.addView(textView);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, baseFragment.getResourceProvider()));
            textView2.setTextSize(14.0f);
            r7.addView(textView2);
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, activity, null, true, false);
            int i2 = Theme.key_actionBarDefaultSubmenuItem;
            int color2 = Theme.getColor(i2, resourcesProvider);
            int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
            int color3 = Theme.getColor(i3, resourcesProvider);
            actionBarMenuSubItem.setTextColor(color2);
            actionBarMenuSubItem.setIconColor(color3);
            int i4 = Theme.key_dialogButtonSelector;
            actionBarMenuSubItem.setSelectorColor(Theme.getColor(i4, resourcesProvider));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(z ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
            final int i5 = 0;
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(this) {
                public final MemberRequestsDelegate.PreviewDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            MemberRequestsDelegate.PreviewDialog previewDialog = this.f$0;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = previewDialog.importer;
                            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
                            if (tL_chatInviteImporter != null) {
                                memberRequestsDelegate.hideChatJoinRequest(tL_chatInviteImporter, true);
                            }
                            memberRequestsDelegate.previewDialog.runAnimation(false);
                            memberRequestsDelegate.importer = null;
                            break;
                        case 1:
                            this.f$0.lambda$new$1();
                            break;
                        default:
                            MemberRequestsDelegate.PreviewDialog previewDialog2 = this.f$0;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = previewDialog2.importer;
                            MemberRequestsDelegate memberRequestsDelegate2 = MemberRequestsDelegate.this;
                            if (tL_chatInviteImporter2 != null) {
                                memberRequestsDelegate2.hideChatJoinRequest(tL_chatInviteImporter2, false);
                            }
                            memberRequestsDelegate2.previewDialog.runAnimation(false);
                            memberRequestsDelegate2.importer = null;
                            break;
                    }
                }
            });
            ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
            anonymousClass2.addView(actionBarMenuSubItem);
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, activity, null, false, false);
            int color4 = Theme.getColor(i2, resourcesProvider);
            int color5 = Theme.getColor(i3, resourcesProvider);
            actionBarMenuSubItem2.setTextColor(color4);
            actionBarMenuSubItem2.setIconColor(color5);
            actionBarMenuSubItem2.setSelectorColor(Theme.getColor(i4, resourcesProvider));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
            final int i6 = 1;
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(this) {
                public final MemberRequestsDelegate.PreviewDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            MemberRequestsDelegate.PreviewDialog previewDialog = this.f$0;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = previewDialog.importer;
                            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
                            if (tL_chatInviteImporter != null) {
                                memberRequestsDelegate.hideChatJoinRequest(tL_chatInviteImporter, true);
                            }
                            memberRequestsDelegate.previewDialog.runAnimation(false);
                            memberRequestsDelegate.importer = null;
                            break;
                        case 1:
                            this.f$0.lambda$new$1();
                            break;
                        default:
                            MemberRequestsDelegate.PreviewDialog previewDialog2 = this.f$0;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = previewDialog2.importer;
                            MemberRequestsDelegate memberRequestsDelegate2 = MemberRequestsDelegate.this;
                            if (tL_chatInviteImporter2 != null) {
                                memberRequestsDelegate2.hideChatJoinRequest(tL_chatInviteImporter2, false);
                            }
                            memberRequestsDelegate2.previewDialog.runAnimation(false);
                            memberRequestsDelegate2.importer = null;
                            break;
                    }
                }
            });
            anonymousClass2.addView(actionBarMenuSubItem2);
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, activity, null, false, true);
            int color6 = Theme.getColor(Theme.key_text_RedBold, resourcesProvider);
            int color7 = Theme.getColor(Theme.key_text_RedRegular, resourcesProvider);
            actionBarMenuSubItem3.setTextColor(color6);
            actionBarMenuSubItem3.setIconColor(color7);
            actionBarMenuSubItem3.setSelectorColor(Theme.getColor(i4, resourcesProvider));
            actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
            final int i7 = 2;
            actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener(this) {
                public final MemberRequestsDelegate.PreviewDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            MemberRequestsDelegate.PreviewDialog previewDialog = this.f$0;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = previewDialog.importer;
                            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
                            if (tL_chatInviteImporter != null) {
                                memberRequestsDelegate.hideChatJoinRequest(tL_chatInviteImporter, true);
                            }
                            memberRequestsDelegate.previewDialog.runAnimation(false);
                            memberRequestsDelegate.importer = null;
                            break;
                        case 1:
                            this.f$0.lambda$new$1();
                            break;
                        default:
                            MemberRequestsDelegate.PreviewDialog previewDialog2 = this.f$0;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = previewDialog2.importer;
                            MemberRequestsDelegate memberRequestsDelegate2 = MemberRequestsDelegate.this;
                            if (tL_chatInviteImporter2 != null) {
                                memberRequestsDelegate2.hideChatJoinRequest(tL_chatInviteImporter2, false);
                            }
                            memberRequestsDelegate2.previewDialog.runAnimation(false);
                            memberRequestsDelegate2.importer = null;
                            break;
                    }
                }
            });
            anonymousClass2.addView(actionBarMenuSubItem3);
        }

        @Override
        public final void dismiss() {
            runAnimation(false);
        }

        public final void lambda$new$1() {
            if (this.importer != null) {
                MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
                memberRequestsDelegate.isNeedRestoreList = true;
                super.dismiss();
                BaseFragment baseFragment = memberRequestsDelegate.fragment;
                baseFragment.dismissCurrentDialog();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.importer.user_id);
                baseFragment.presentFragment(new ChatActivity(bundle));
            }
        }

        @Override
        public final void onCreate(Bundle bundle) {
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
            attributes.flags = i | (-2147417856);
            if (i2 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            getWindow().setAttributes(attributes);
        }

        public final void runAnimation(boolean z) {
            int i = 1;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int[] iArr = new int[2];
            this.imageView.getLocationOnScreen(iArr);
            float width = this.imageView.getWidth() * 1.0f;
            ProfileGalleryView profileGalleryView = this.viewPager;
            final float measuredWidth = width / profileGalleryView.getMeasuredWidth();
            final float width2 = (this.imageView.getWidth() / 2.0f) / measuredWidth;
            float f = 1.0f - measuredWidth;
            final float left = iArr[0] - (profileGalleryView.getLeft() + ((int) ((profileGalleryView.getMeasuredWidth() * f) / 2.0f)));
            int i2 = iArr[1];
            int top = profileGalleryView.getTop();
            int measuredHeight = this.nameText.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + profileGalleryView.getMeasuredHeight();
            TextView textView = this.bioText;
            if (textView.getVisibility() != 8) {
                measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
            }
            int iDp = AndroidUtilities.dp(12.0f);
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
            final float measuredHeight2 = i2 - (top + ((int) ((((actionBarPopupWindowLayout.getMeasuredHeight() + iDp) + measuredHeight) * f) / 2.0f)));
            final int i3 = (-actionBarPopupWindowLayout.getTop()) / 2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    MemberRequestsDelegate.PreviewDialog previewDialog = this.f$0;
                    previewDialog.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    previewDialog.animationProgress = fFloatValue;
                    float f2 = measuredWidth;
                    float fM = DiffUtil.m(1.0f, f2, fFloatValue, f2);
                    MemberRequestsDelegate.PreviewDialog.AnonymousClass3 anonymousClass3 = previewDialog.contentView;
                    anonymousClass3.setScaleX(fM);
                    anonymousClass3.setScaleY(fM);
                    anonymousClass3.setTranslationX((1.0f - previewDialog.animationProgress) * left);
                    anonymousClass3.setTranslationY((1.0f - previewDialog.animationProgress) * measuredHeight2);
                    int i4 = (int) ((1.0f - previewDialog.animationProgress) * width2);
                    previewDialog.viewPager.setRoundRadius(i4, i4);
                    float fClamp = MathUtils.clamp((previewDialog.animationProgress * 2.0f) - 1.0f, 0.0f, 1.0f);
                    previewDialog.pagerShadowDrawable.setAlpha((int) (fClamp * 255.0f));
                    previewDialog.nameText.setAlpha(fClamp);
                    previewDialog.bioText.setAlpha(fClamp);
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = previewDialog.popupLayout;
                    actionBarPopupWindowLayout2.setTranslationY((1.0f - previewDialog.animationProgress) * i3);
                    actionBarPopupWindowLayout2.setAlpha(fClamp);
                    BitmapDrawable bitmapDrawable = previewDialog.backgroundDrawable;
                    if (bitmapDrawable != null) {
                        bitmapDrawable.setAlpha((int) (previewDialog.animationProgress * 255.0f));
                    }
                    previewDialog.pagerIndicator.setAlpha(fClamp);
                }
            });
            this.animator.addListener(new ScrollSlidingTabStrip.AnonymousClass4(this, z, measuredWidth, i));
            this.animator.setDuration(220L);
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.start();
        }

        @Override
        public final void show() {
            super.show();
            AndroidUtilities.runOnUIThread(new ComposeDrawable$$ExternalSyntheticLambda0(this, 7), 80L);
        }

        public final void updateBackgroundBitmap() {
            BitmapDrawable bitmapDrawable = this.backgroundDrawable;
            int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
            Resources resources = getContext().getResources();
            AnonymousClass3 anonymousClass3 = this.contentView;
            int measuredWidth = (int) (anonymousClass3.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (anonymousClass3.getMeasuredHeight() / 6.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.save();
            MemberRequestsDelegate memberRequestsDelegate = MemberRequestsDelegate.this;
            ((ActionBarLayout) ((LaunchActivity) memberRequestsDelegate.fragment.getParentActivity()).getActionBarLayout()).getView().draw(canvas);
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
            Dialog visibleDialog = memberRequestsDelegate.fragment.getVisibleDialog();
            if (visibleDialog != null) {
                visibleDialog.getWindow().getDecorView().draw(canvas);
            }
            Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, bitmapCreateBitmap);
            this.backgroundDrawable = bitmapDrawable2;
            bitmapDrawable2.setAlpha(alpha);
            getWindow().setBackgroundDrawable(this.backgroundDrawable);
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

    public static void setViewVisible(View view, boolean z, boolean z2) {
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

    public final StickerEmptyView getEmptyView() {
        if (this.emptyView == null) {
            BaseFragment baseFragment = this.fragment;
            StickerEmptyView stickerEmptyView = new StickerEmptyView(16, baseFragment.getResourceProvider(), baseFragment.getParentActivity(), null);
            this.emptyView = stickerEmptyView;
            SpoilersTextView spoilersTextView = stickerEmptyView.title;
            boolean z = this.isChannel;
            spoilersTextView.setText(LocaleController.getString(z ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.emptyView.subtitle.setText(LocaleController.getString(z ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.emptyView.setAnimateLayoutChange(true);
            this.emptyView.setVisibility(8);
        }
        return this.emptyView;
    }

    public final FlickerLoadingView getLoadingView() {
        if (this.loadingView == null) {
            BaseFragment baseFragment = this.fragment;
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
            this.loadingView = flickerLoadingView;
            flickerLoadingView.setAlpha(0.0f);
            if (this.isShowLastItemDivider) {
                this.loadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, baseFragment.getResourceProvider()));
            }
            FlickerLoadingView flickerLoadingView2 = this.loadingView;
            int i = Theme.key_windowBackgroundWhite;
            int i2 = Theme.key_windowBackgroundGray;
            flickerLoadingView2.colorKey1 = i;
            flickerLoadingView2.colorKey2 = i2;
            flickerLoadingView2.colorKey3 = -1;
            flickerLoadingView2.invalidate();
            this.loadingView.setViewType(15);
            this.loadingView.setMemberRequestButton(this.isChannel);
        }
        return this.loadingView;
    }

    public final StickerEmptyView getSearchEmptyView() {
        if (this.searchEmptyView == null) {
            BaseFragment baseFragment = this.fragment;
            StickerEmptyView stickerEmptyView = new StickerEmptyView(1, baseFragment.getResourceProvider(), baseFragment.getParentActivity(), null);
            this.searchEmptyView = stickerEmptyView;
            if (this.isShowLastItemDivider) {
                stickerEmptyView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, baseFragment.getResourceProvider()));
            }
            this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
            this.searchEmptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.searchEmptyView.setAnimateLayoutChange(true);
            this.searchEmptyView.setVisibility(8);
        }
        return this.searchEmptyView;
    }

    public final void hideChatJoinRequest(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z) {
        TLRPC.User user = (TLRPC.User) this.users.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z;
        int i = this.currentAccount;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i).getInputPeer(-this.chatId);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i).getInputUser(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new ContactsController$$ExternalSyntheticLambda37(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
    }

    public final void loadMembers() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z = true;
        if (this.isFirstLoading && (cachedImporters = this.controller.getCachedImporters(this.chatId)) != null) {
            this.isDataLoaded = true;
            onImportersLoaded(cachedImporters, null, true, true);
            z = false;
        }
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(29, this, z));
    }

    public void onImportersChanged(String str, boolean z, boolean z2) {
        boolean z3;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.allImporters;
        if (zIsEmpty) {
            z3 = !arrayList.isEmpty() || z;
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
        if (arrayList.isEmpty()) {
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

    public final void onImportersLoaded(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z, boolean z2) {
        boolean z3;
        MemberRequestsDelegate memberRequestsDelegate;
        ArrayList arrayList = this.currentImporters;
        boolean z4 = false;
        boolean z5 = !arrayList.isEmpty() && this.hasMore;
        for (int i = 0; i < tL_messages_chatInviteImporters.users.size(); i++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i);
            this.users.put(user.id, user);
        }
        Adapter adapter = this.adapter;
        if (z) {
            adapter.setItems(tL_messages_chatInviteImporters.importers);
        } else {
            if (tL_messages_chatInviteImporters.importers.size() <= 0) {
                z3 = false;
            } else if (tL_messages_chatInviteImporters.importers.size() + arrayList.size() < tL_messages_chatInviteImporters.count) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                adapter.mObservable.notifyItemRangeRemoved(arrayList.size() + (!this.isShowLastItemDivider ? 1 : 0), 1);
            }
            ArrayList<TLRPC.TL_chatInviteImporter> arrayList2 = tL_messages_chatInviteImporters.importers;
            adapter.getClass();
            int i2 = 0;
            while (true) {
                int size = arrayList2.size();
                memberRequestsDelegate = MemberRequestsDelegate.this;
                if (i2 >= size) {
                    break;
                }
                long j = arrayList2.get(i2).user_id;
                for (int i3 = 0; i3 < memberRequestsDelegate.currentImporters.size(); i3++) {
                    if (((TLRPC.TL_chatInviteImporter) memberRequestsDelegate.currentImporters.get(i3)).user_id == j) {
                        arrayList2.remove(i2);
                        i2--;
                        break;
                    }
                }
                i2++;
            }
            memberRequestsDelegate.currentImporters.addAll(arrayList2);
            int size2 = (memberRequestsDelegate.currentImporters.size() + (!memberRequestsDelegate.isShowLastItemDivider ? 1 : 0)) - arrayList2.size();
            int size3 = arrayList2.size();
            RecyclerView.AdapterDataObservable adapterDataObservable = adapter.mObservable;
            adapterDataObservable.notifyItemRangeInserted(size2, size3);
            if (z3) {
                adapterDataObservable.notifyItemRangeInserted(arrayList.size() + (!this.isShowLastItemDivider ? 1 : 0), 1);
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList3 = this.allImporters;
            if (z) {
                arrayList3.clear();
            }
            arrayList3.addAll(tL_messages_chatInviteImporters.importers);
            if (this.showSearchMenu) {
                this.fragment.getActionBar().createMenu().getItem(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
            }
        }
        onImportersChanged(str, z2, false);
        this.hasMore = arrayList.size() < tL_messages_chatInviteImporters.count;
        if (!arrayList.isEmpty() && this.hasMore) {
            z4 = true;
        }
        if (z5 != z4) {
            if (this.hasMore) {
                adapter.mObservable.notifyItemRangeInserted(adapter.getItemCount() - 1, 1);
            } else {
                adapter.mObservable.notifyItemRangeRemoved(adapter.getItemCount(), 1);
            }
        }
    }

    public final void onItemClick(View view) {
        if (view instanceof MemberRequestCell) {
            if (this.isSearchExpanded) {
                AndroidUtilities.hideKeyboard(this.fragment.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(17, this, (MemberRequestCell) view), this.isSearchExpanded ? 100L : 0L);
        }
    }

    public final void setQuery(String str) {
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
            this.adapter.setItems(Collections.EMPTY_LIST);
            setViewVisible(this.recyclerView, false, false);
            setViewVisible(this.loadingView, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            MemberRequestsDelegate$$ExternalSyntheticLambda2 memberRequestsDelegate$$ExternalSyntheticLambda2 = new MemberRequestsDelegate$$ExternalSyntheticLambda2(this, 2);
            this.searchRunnable = memberRequestsDelegate$$ExternalSyntheticLambda2;
            dispatchQueue.postRunnable(memberRequestsDelegate$$ExternalSyntheticLambda2, 300L);
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
}
