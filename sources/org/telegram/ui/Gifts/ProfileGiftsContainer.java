package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.math.MathUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda20;
import org.telegram.ui.Cells.WallpaperCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.WallpaperCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda37;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ProfileGiftsView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda13;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public abstract class ProfileGiftsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final HashMap<Pair<Integer, Long>, CharSequence> cachedLastEmojis = new HashMap<>();
    private CharSequence addCollectionTabText;
    private final CharSequence addGiftsText;
    private final BoolAnimator animatorBottomButtonVisibility;
    private int backgroundColor;
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private int buttonContainerHeightDp;
    private int buttonContainerOffset;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private int checkboxRequestId;
    private final TextView checkboxTextView;
    public final StarsController.GiftsCollections collections;
    private final int currentAccount;
    public ItemOptions currentMenu;
    private final long dialogId;
    private int externalPaddingTop;
    private final BaseFragment fragment;
    public IBlur3Capture iBlur3Capture;
    private ViewGroup iBlur3CaptureParent;
    private final StarsController.GiftsList list;
    private int pendingScrollToCollectionId;
    private boolean reorderingCollections;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Runnable sendCollectionsOrder;
    private final CharSequence sendGiftsToFriendsText;
    private final ViewPagerFixed.TabsView tabsView;
    private final ViewPagerFixed viewPager;
    private int visibleHeight;

    public final class Page extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        public final int currentAccount;
        public final FrameLayout emptyView1;
        public final TextView emptyView1Button;
        public final LinearLayout emptyView1Layout;
        public final TextView emptyView1Title;
        public final FrameLayout emptyView2;
        public final ButtonWithCounterView emptyView2Button;
        public final LinearLayout emptyView2Layout;
        public final TextView emptyView2Subtitle;
        public final TextView emptyView2Title;
        public boolean hasTabs;
        public ViewGroupPartRenderer iBlur3Capture;
        public boolean isCollection;
        public StarsController.GiftsList list;
        public final AnonymousClass1 listView;
        public final ProfileGiftsContainer parent;
        public boolean reordering;
        public final Theme.ResourcesProvider resourcesProvider;
        public int visibleHeight;

        public final class AnonymousClass5 extends ScrollView {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
            }
        }

        public final class AnonymousClass6 extends AnimatedEmojiDrawable {
            @Override
            public final int getIntrinsicHeight() {
                return AndroidUtilities.dp(24.0f);
            }

            @Override
            public final int getIntrinsicWidth() {
                return AndroidUtilities.dp(24.0f);
            }
        }

        public Page(final ProfileGiftsContainer profileGiftsContainer, int i, Theme.ResourcesProvider resourcesProvider) {
            super(profileGiftsContainer.getContext());
            this.visibleHeight = AndroidUtilities.displaySize.y;
            Context context = profileGiftsContainer.getContext();
            this.parent = profileGiftsContainer;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ?? r1 = new UniversalRecyclerView(context, i, new GiftSheet$$ExternalSyntheticLambda8(this, 20), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda2(this), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda2(this), resourcesProvider) {
                @Override
                public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    profileGiftsContainer.updateTabsY();
                }
            };
            this.listView = r1;
            r1.adapter.setApplyBackground(false);
            r1.setSelectorType(9);
            r1.setSelectorDrawableColor(0);
            r1.setPadding(AndroidUtilities.dp(9.0f), profileGiftsContainer.externalPaddingTop, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
            r1.setClipToPadding(false);
            r1.setClipChildren(false);
            addView((View) r1, LayoutHelper.createFrame(-1, -1, 119));
            r1.addOnScrollListener(new RichEditorListView.AnonymousClass3(2, this, profileGiftsContainer));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public final void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onAddAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }

                @Override
                public final void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onChangeAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }

                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onMoveAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }

                @Override
                public final void onRemoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onRemoveAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }
            };
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            r1.lambda$onCellEnter$52(defaultItemAnimator);
            new ItemTouchHelper(new ItemTouchHelper.Callback() {
                public final boolean canReorder(TL_stars.SavedStarGift savedStarGift) {
                    Page page = Page.this;
                    if (!page.reordering) {
                        return false;
                    }
                    if (page.list == profileGiftsContainer.list) {
                        return savedStarGift != null && savedStarGift.pinned_to_top;
                    }
                    return true;
                }

                @Override
                public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setPressed(false);
                }

                @Override
                public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    View view = viewHolder.itemView;
                    return canReorder(view instanceof GiftSheet.GiftCell ? ((GiftSheet.GiftCell) view).getSavedGift() : null) ? ItemTouchHelper.Callback.makeMovementFlags(15, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }

                @Override
                public final boolean isItemViewSwipeEnabled() {
                    return Page.this.reordering;
                }

                @Override
                public final boolean isLongPressDragEnabled() {
                    return Page.this.reordering;
                }

                @Override
                public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    ProfileGiftsView profileGiftsView;
                    Page page = Page.this;
                    if (page.list == null || !page.reordering) {
                        return false;
                    }
                    View view = viewHolder.itemView;
                    if (!canReorder(view instanceof GiftSheet.GiftCell ? ((GiftSheet.GiftCell) view).getSavedGift() : null)) {
                        return false;
                    }
                    View view2 = viewHolder2.itemView;
                    if (!canReorder(view2 instanceof GiftSheet.GiftCell ? ((GiftSheet.GiftCell) view2).getSavedGift() : null)) {
                        return false;
                    }
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    boolean z = page.isCollection;
                    ProfileGiftsContainer profileGiftsContainer2 = profileGiftsContainer;
                    if (z) {
                        page.list.reorder(adapterPosition, adapterPosition2);
                        profileGiftsContainer2.collections.updateIcon(page.list.collectionId);
                    } else {
                        StarsController.GiftsList giftsList = page.list;
                        if (giftsList.savedPinnedState == null) {
                            giftsList.savedPinnedState = giftsList.getPinned();
                        }
                        giftsList.reorder(adapterPosition, adapterPosition2);
                    }
                    AnonymousClass1 anonymousClass1 = page.listView;
                    anonymousClass1.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                    anonymousClass1.adapter.updateWithoutNotify();
                    if (page.isCollection) {
                        profileGiftsContainer2.fillTabs$1(true);
                    }
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if ((safeLastFragment instanceof ProfileActivity) && (profileGiftsView = ((ProfileActivity) safeLastFragment).giftsView) != null) {
                        profileGiftsView.update();
                    }
                    return true;
                }

                @Override
                public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i2) {
                    int i3 = 0;
                    Page page = Page.this;
                    if (i2 == 0) {
                        StarsController.GiftsList giftsList = page.list;
                        if (giftsList != null) {
                            ArrayList arrayList = giftsList.savedPinnedState;
                            if (arrayList != null) {
                                ArrayList pinned = giftsList.getPinned();
                                if (arrayList.size() == pinned.size()) {
                                    while (true) {
                                        if (i3 >= arrayList.size()) {
                                            giftsList.savedPinnedState = null;
                                        } else if (arrayList.get(i3) == pinned.get(i3)) {
                                            i3++;
                                        }
                                    }
                                }
                                giftsList.sendPinnedOrder();
                                giftsList.savedPinnedState = null;
                            } else {
                                giftsList.savedPinnedState = null;
                            }
                        }
                    } else {
                        AnonymousClass1 anonymousClass1 = page.listView;
                        if (anonymousClass1 != null) {
                            anonymousClass1.cancelClickRunnables(false);
                        }
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    }
                    super.onSelectedChanged(viewHolder, i2);
                }

                @Override
                public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i2) {
                }
            }).attachToRecyclerView(r1);
            FrameLayout frameLayout = this.emptyView1;
            if (frameLayout != null) {
                removeView(frameLayout);
            }
            FrameLayout frameLayout2 = this.emptyView2;
            if (frameLayout2 != null) {
                removeView(frameLayout2);
            }
            if (profileGiftsContainer.list != this.list) {
                this.emptyView1 = null;
                this.emptyView1Title = null;
                this.emptyView1Button = null;
                this.emptyView1Layout = null;
                this.emptyView2 = new FrameLayout(getContext());
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.emptyView2Layout = linearLayout;
                linearLayout.setOrientation(1);
                this.emptyView2.addView(this.emptyView2Layout, LayoutHelper.createFrame(-2, -2, 17));
                TextView textView = new TextView(getContext());
                this.emptyView2Title = textView;
                textView.setTextSize(1, 20.0f);
                this.emptyView2Title.setTypeface(AndroidUtilities.bold());
                this.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                this.emptyView2Title.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
                this.emptyView2Layout.addView(this.emptyView2Title, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
                TextView textView2 = new TextView(getContext());
                this.emptyView2Subtitle = textView2;
                textView2.setTextSize(1, 14.0f);
                this.emptyView2Subtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
                this.emptyView2Subtitle.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
                this.emptyView2Layout.addView(this.emptyView2Subtitle, LayoutHelper.createLinear(-2, -2, 1, 0, 10, 0, 0));
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, resourcesProvider);
                this.emptyView2Button = buttonWithCounterView;
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false);
                this.emptyView2Layout.addView(this.emptyView2Button, LayoutHelper.createLinear(200, 44, 1, 0, 19, 0, 12));
                final int i2 = 1;
                this.emptyView2Button.setOnClickListener(new View.OnClickListener(this) {
                    public final ProfileGiftsContainer.Page f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                StarsController.GiftsList giftsList = this.f$0.list;
                                if (giftsList != null) {
                                    if (!giftsList.sort_by_date || giftsList.includeFlags != 783) {
                                        giftsList.includeFlags = 783;
                                        giftsList.sort_by_date = true;
                                        giftsList.invalidate(true);
                                    }
                                }
                                break;
                            default:
                                this.f$0.parent.addGifts();
                                break;
                        }
                    }
                });
                addView(this.emptyView2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
                r1.setEmptyView(this.emptyView2);
                LinearLayout linearLayout2 = this.emptyView2Layout;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(profileGiftsContainer.collections.isMine() ? 0 : 8);
                    return;
                }
                return;
            }
            this.emptyView2 = null;
            this.emptyView2Title = null;
            this.emptyView2Subtitle = null;
            this.emptyView2Button = null;
            this.emptyView2Layout = null;
            this.emptyView1 = new FrameLayout(getContext());
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.emptyView1Layout = linearLayout3;
            linearLayout3.setOrientation(1);
            this.emptyView1.addView(this.emptyView1Layout, LayoutHelper.createFrame(-2, -2, 17));
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.emptyView1Layout.addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 0));
            TextView textView3 = new TextView(getContext());
            this.emptyView1Title = textView3;
            textView3.setTextSize(1, 17.0f);
            this.emptyView1Title.setTypeface(AndroidUtilities.bold());
            this.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            this.emptyView1Title.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.emptyView1Layout.addView(this.emptyView1Title, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
            TextView textView4 = new TextView(getContext());
            this.emptyView1Button = textView4;
            textView4.setTextSize(1, 14.0f);
            TextView textView5 = this.emptyView1Button;
            int i3 = Theme.key_featuredStickers_addButton;
            textView5.setTextColor(Theme.getColor(i3, resourcesProvider));
            this.emptyView1Button.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            final int i4 = 0;
            this.emptyView1Button.setOnClickListener(new View.OnClickListener(this) {
                public final ProfileGiftsContainer.Page f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            StarsController.GiftsList giftsList = this.f$0.list;
                            if (giftsList != null) {
                                if (!giftsList.sort_by_date || giftsList.includeFlags != 783) {
                                    giftsList.includeFlags = 783;
                                    giftsList.sort_by_date = true;
                                    giftsList.invalidate(true);
                                }
                            }
                            break;
                        default:
                            this.f$0.parent.addGifts();
                            break;
                    }
                }
            });
            this.emptyView1Button.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i3, resourcesProvider)), 4, 4));
            ScaleStateListAnimator.apply(this.emptyView1Button);
            this.emptyView1Layout.addView(this.emptyView1Button, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            addView(this.emptyView1, LayoutHelper.createFrame(-1, -1, 119));
            r1.setEmptyView(this.emptyView1);
        }

        public void setReordering(boolean z) {
            AnonymousClass1 anonymousClass1;
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            ProfileGiftsContainer profileGiftsContainer = this.parent;
            profileGiftsContainer.updatedReordering(profileGiftsContainer.isReordering());
            int i = 0;
            while (true) {
                anonymousClass1 = this.listView;
                if (i >= anonymousClass1.getChildCount()) {
                    break;
                }
                View childAt = anonymousClass1.getChildAt(i);
                if (childAt instanceof GiftSheet.GiftCell) {
                    ((GiftSheet.GiftCell) childAt).setReordering(z, true);
                }
                i++;
            }
            UniversalAdapter universalAdapter = anonymousClass1.adapter;
            if (universalAdapter != null) {
                universalAdapter.updateWithoutNotify();
            }
            if (z) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment instanceof ProfileActivity) {
                    ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda18((ProfileActivity) safeLastFragment, 2));
                }
            }
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.list) {
                update(true);
                if (this.list == null || !isAttachedToWindow()) {
                    return;
                }
                AnonymousClass1 anonymousClass1 = this.listView;
                if (anonymousClass1.canScrollVertically(1)) {
                    for (int i3 = 0; i3 < anonymousClass1.getChildCount(); i3++) {
                        if (!(anonymousClass1.getChildAt(i3) instanceof FlickerLoadingView)) {
                        }
                    }
                    return;
                }
                this.list.load();
            }
        }

        public float getTabsHeight() {
            int i = 0;
            while (true) {
                AnonymousClass1 anonymousClass1 = this.listView;
                if (i >= anonymousClass1.getChildCount()) {
                    return 0.0f;
                }
                View childAt = anonymousClass1.getChildAt(i);
                int childAdapterPosition = anonymousClass1.getChildAdapterPosition(childAt);
                if (childAt instanceof GiftSheet.GiftCell) {
                    if (childAdapterPosition == 0) {
                        return Math.max(0.0f, childAt.getY());
                    }
                } else if (childAdapterPosition == 0) {
                    return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
                }
                i++;
            }
        }

        public final void lambda$onItemLongPress$14() {
            setReordering(true);
        }

        public final void lambda$onItemLongPress$15() {
            setReordering(true);
        }

        public final void lambda$onItemLongPress$19() {
            setReordering(true);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setVisibleHeight(this.visibleHeight);
        }

        public final void resetReordering() {
            if (this.reordering) {
                StarsController.GiftsList giftsList = this.list;
                if (giftsList != null) {
                    giftsList.sendPinnedOrder();
                }
                setReordering(false);
            }
        }

        public void setHasTabs(boolean z) {
            if (this.hasTabs == z) {
                return;
            }
            this.hasTabs = z;
            AnonymousClass1 anonymousClass1 = this.listView;
            boolean zCanScrollVertically = anonymousClass1.canScrollVertically(-1);
            anonymousClass1.adapter.update(true);
            if (!zCanScrollVertically) {
                anonymousClass1.scrollToPosition(0);
            }
            this.parent.updateTabsY();
        }

        public void setVisibleHeight(int i) {
            this.visibleHeight = i;
            float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
            float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, fClamp01);
            LinearLayout linearLayout = this.emptyView1Layout;
            if (linearLayout != null) {
                linearLayout.setAlpha(fClamp01);
                this.emptyView1Layout.setScaleX(fLerp);
                this.emptyView1Layout.setScaleY(fLerp);
            }
            FrameLayout frameLayout = this.emptyView1;
            if (frameLayout != null) {
                frameLayout.setTranslationY((-(getMeasuredHeight() - this.visibleHeight)) / 2.0f);
            }
            LinearLayout linearLayout2 = this.emptyView2Layout;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(fClamp01);
                this.emptyView2Layout.setScaleX(fLerp);
                this.emptyView2Layout.setScaleY(fLerp);
            }
            FrameLayout frameLayout2 = this.emptyView2;
            if (frameLayout2 != null) {
                frameLayout2.setTranslationY((-(getMeasuredHeight() - this.visibleHeight)) / 2.0f);
            }
        }

        public final void update(boolean z) {
            AnonymousClass1 anonymousClass1 = this.listView;
            if (anonymousClass1 == null || anonymousClass1.adapter == null) {
                return;
            }
            boolean zCanScrollVertically = anonymousClass1.canScrollVertically(-1);
            anonymousClass1.adapter.update(z);
            if (zCanScrollVertically) {
                return;
            }
            anonymousClass1.scrollToPosition(0);
        }
    }

    public final class SelectGiftsBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public final ButtonWithCounterView button;
        public final int collectionId;
        public ItemOptions lastMenu;
        public final ExtendedGridLayoutManager layoutManager;
        public final StarsController.GiftsList list;
        public final HashSet selectedGiftIds;

        public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
            public final long val$dialogId;
            public final ActionBarMenuItem val$other;

            public AnonymousClass1(ActionBarMenuItem actionBarMenuItem, long j) {
                this.val$other = actionBarMenuItem;
                this.val$dialogId = j;
            }

            @Override
            public final void onItemClick(int i) {
                boolean zCanUserDoAction;
                ActionBarMenuSubItem actionBarMenuSubItem;
                ActionBarMenuSubItem actionBarMenuSubItem2;
                SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                if (i != 1) {
                    if (i == -1) {
                        selectGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                        return;
                    }
                    return;
                }
                ItemOptions itemOptions = selectGiftsBottomSheet.lastMenu;
                if (itemOptions != null) {
                    itemOptions.dismiss();
                }
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(selectGiftsBottomSheet.container, ((BottomSheet) selectGiftsBottomSheet).resourcesProvider, this.val$other);
                selectGiftsBottomSheet.lastMenu = itemOptionsMakeOptions;
                long clientUserId = UserConfig.getInstance(((BottomSheet) selectGiftsBottomSheet).currentAccount).getClientUserId();
                long j = this.val$dialogId;
                if (j == clientUserId) {
                    zCanUserDoAction = true;
                } else {
                    zCanUserDoAction = j >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(((BottomSheet) selectGiftsBottomSheet).currentAccount).getChat(Long.valueOf(-j)), 5);
                }
                ActionBarMenuSubItem actionBarMenuSubItemAdd = itemOptionsMakeOptions.add();
                itemOptionsMakeOptions.addGap();
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked2 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked3 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked4 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (zCanUserDoAction) {
                    itemOptionsMakeOptions.addGap();
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked5 = itemOptionsMakeOptions.addChecked();
                    actionBarMenuSubItemAddChecked5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked6 = itemOptionsMakeOptions.addChecked();
                    actionBarMenuSubItemAddChecked6.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem2 = actionBarMenuSubItemAddChecked6;
                    actionBarMenuSubItem = actionBarMenuSubItemAddChecked5;
                } else {
                    actionBarMenuSubItem = null;
                    actionBarMenuSubItem2 = null;
                }
                SendMessagesHelper$$ExternalSyntheticLambda7 sendMessagesHelper$$ExternalSyntheticLambda7 = new SendMessagesHelper$$ExternalSyntheticLambda7(this, actionBarMenuSubItemAdd, actionBarMenuSubItemAddChecked, actionBarMenuSubItemAddChecked2, actionBarMenuSubItemAddChecked3, actionBarMenuSubItemAddChecked4, zCanUserDoAction, actionBarMenuSubItem, actionBarMenuSubItem2);
                sendMessagesHelper$$ExternalSyntheticLambda7.run();
                if (actionBarMenuSubItemAdd != null) {
                    actionBarMenuSubItemAdd.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(1, this, sendMessagesHelper$$ExternalSyntheticLambda7));
                }
                StarsController.GiftsList giftsList = selectGiftsBottomSheet.list;
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked2, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked3, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked4, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 8);
                if (zCanUserDoAction) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem2, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 512);
                }
                itemOptionsMakeOptions.setOnTopOfScrim().setDismissWithButtons(false).setDimAlpha(0).show();
            }
        }

        public SelectGiftsBottomSheet(BaseFragment baseFragment, long j, int i, CommunityUtils$$ExternalSyntheticLambda2 communityUtils$$ExternalSyntheticLambda2) {
            super(baseFragment, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING);
            this.selectedGiftIds = new HashSet();
            this.ignoreTouchActionBar = false;
            this.headerMoveTop = AndroidUtilities.dp(12.0f);
            fixNavigationBar();
            setSlidingActionBar();
            this.collectionId = i;
            this.list = new StarsController.GiftsList(this.currentAccount, j, true);
            this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(this.actionBar.createMenu().addItem(1, R.drawable.ic_ab_other), j));
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
            int i2 = this.backgroundPaddingLeft;
            frameLayout.setPadding(i2, 0, i2, 0);
            this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            View view = new View(getContext());
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, this.resourcesProvider);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false);
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(29, this, communityUtils$$ExternalSyntheticLambda2));
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
            ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(getContext(), 3);
            this.layoutManager = extendedGridLayoutManager;
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public final int getSpanSize(int i3) {
                    int i4;
                    SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                    UniversalAdapter universalAdapter = selectGiftsBottomSheet.adapter;
                    if (universalAdapter == null) {
                        return selectGiftsBottomSheet.layoutManager.getSpanCount();
                    }
                    UItem item = universalAdapter.getItem(i3 - 1);
                    return (item == null || (i4 = item.spanCount) == -1) ? selectGiftsBottomSheet.layoutManager.getSpanCount() : i4;
                }
            });
            this.recyclerListView.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
            this.recyclerListView.setSelectorType(9);
            this.recyclerListView.setSelectorDrawableColor(0);
            this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
            this.recyclerListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 9));
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                    if (selectGiftsBottomSheet.isLoadingVisible$1()) {
                        selectGiftsBottomSheet.list.load();
                    }
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
            this.adapter.update(true);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new GiftSheet$$ExternalSyntheticLambda8(this, 21), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.setApplyBackground(false);
            return this.adapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if (i != NotificationCenter.starUserGiftsLoaded || (universalAdapter = this.adapter) == null) {
                return;
            }
            universalAdapter.update(true);
            if (isLoadingVisible$1()) {
                this.list.load();
            }
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            super.lambda$showGiftOfferSheet$15();
        }

        @Override
        public final CharSequence getTitle() {
            return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
        }

        public final boolean isLoadingVisible$1() {
            RecyclerListView recyclerListView = this.recyclerListView;
            if (recyclerListView != null && recyclerListView.isAttachedToWindow()) {
                for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
                    if (this.recyclerListView.getChildAt(i) instanceof FlickerLoadingView) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class TextFactory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        public final class AnonymousClass1 extends LinkSpanDrawable.LinksTextView {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            }
        }

        static {
            UItem.UItemFactory.setup(new TextFactory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) view;
            linksTextView.setGravity(uItem.intValue);
            linksTextView.setTextColor((int) uItem.longValue);
            linksTextView.setTextSize(1, uItem.floatValue);
            linksTextView.setTypeface(uItem.accent ? AndroidUtilities.bold() : null);
            int i = uItem.pad;
            linksTextView.setPadding(i, 0, i, uItem.iconResId);
            linksTextView.setText(uItem.text);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new AnonymousClass1(context);
        }
    }

    public final class UnpinSheet extends BottomSheet {
        public long selectedGift;

        public final class AnonymousClass1 extends UniversalRecyclerView {
            @Override
            public final Integer getSelectorColor(int i) {
                return 0;
            }
        }

        public UnpinSheet(Context context, long j, TL_stars.SavedStarGift savedStarGift, Theme.ResourcesProvider resourcesProvider, Utilities.Callback0Return callback0Return) {
            super(context, false, false, resourcesProvider);
            this.selectedGift = 0L;
            fixNavigationBar();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true, resourcesProvider);
            textViewMakeTextView.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
            linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, resourcesProvider);
            textViewMakeTextView2.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
            linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 22.0f, 4.33f, 22.0f, 10.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
            StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(j, true);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.currentAccount, 0, new BotBiometry$$ExternalSyntheticLambda10(4, this, profileGiftsList), new RateCallLayout$$ExternalSyntheticLambda1(14, this, buttonWithCounterView), null, resourcesProvider);
            anonymousClass1.setSpanCount(3);
            anonymousClass1.setOverScrollMode(2);
            anonymousClass1.setScrollEnabled(false);
            linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(-1, -2, 11.0f, 0.0f, 11.0f, 0.0f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2UnpinAlertButton), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 22.0f, 9.0f, 22.0f, 9.0f));
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda3(2, this, profileGiftsList, savedStarGift, callback0Return));
            setCustomView(linearLayout);
        }
    }

    public ProfileGiftsContainer(Context context, final int i, long j, final BaseFragment baseFragment, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        String string;
        int i3;
        TLRPC.EncryptedChat encryptedChatM;
        super(context);
        this.checkboxRequestId = -1;
        this.sendCollectionsOrder = new ProfileGiftsContainer$$ExternalSyntheticLambda8(this, 2);
        this.animatorBottomButtonVisibility = new BoolAnimator(0, new ProfileGiftsContainer$$ExternalSyntheticLambda22(this), CubicBezierInterpolator.EASE_OUT_QUINT, 380L, true);
        this.visibleHeight = AndroidUtilities.displaySize.y;
        this.fragment = baseFragment;
        this.currentAccount = i;
        if (!DialogObject.isEncryptedDialog(j) || (encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(i), j)) == null) {
            this.dialogId = j;
        } else {
            this.dialogId = encryptedChatM.user_id;
        }
        StarsController.getInstance(i, false).invalidateProfileGifts(this.dialogId);
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(i, false).getProfileGiftsList(this.dialogId, true);
        this.list = profileGiftsList;
        StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(i, false).getProfileGiftCollectionsList(this.dialogId, true);
        this.collections = profileGiftCollectionsList;
        profileGiftCollectionsList.all = profileGiftsList;
        profileGiftsList.shown = true;
        if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).openGiftsUpgradable) {
            profileGiftsList.includeFlags = 4;
            profileGiftsList.sort_by_date = true;
            profileGiftsList.invalidate(true);
        } else if (!profileGiftsList.sort_by_date || profileGiftsList.includeFlags != 783) {
            profileGiftsList.includeFlags = 783;
            profileGiftsList.sort_by_date = true;
            profileGiftsList.invalidate(true);
        }
        profileGiftsList.load();
        this.resourcesProvider = resourcesProvider;
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public final void addMoreTabs() {
                ProfileGiftsContainer profileGiftsContainer = ProfileGiftsContainer.this;
                if (!profileGiftsContainer.canAdd() || profileGiftsContainer.tabsView == null) {
                    return;
                }
                if (profileGiftsContainer.addCollectionTabText == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("+ "), R.string.Gift2NewCollection));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
                    coloredImageSpan.spaceScaleX = 0.8f;
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                    profileGiftsContainer.addCollectionTabText = spannableStringBuilder;
                }
                profileGiftsContainer.tabsView.addTab(-1, profileGiftsContainer.addCollectionTabText);
            }

            @Override
            public final boolean canScroll(MotionEvent motionEvent) {
                return !ProfileGiftsContainer.this.isReordering();
            }

            @Override
            public final void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                ProfileGiftsContainer profileGiftsContainer = ProfileGiftsContainer.this;
                profileGiftsContainer.updateButton();
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).updateSelectedMediaTabText();
                }
                profileGiftsContainer.updateTabsY();
            }

            @Override
            public final void onTabScrollEnd(int i4) {
                super.onTabScrollEnd(i4);
                ProfileGiftsContainer.this.updateButton();
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).updateSelectedMediaTabText();
                }
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void applyReorder(ArrayList arrayList) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    if (iIntValue != -1 && iIntValue != -2) {
                        arrayList2.add(num);
                    }
                }
                ProfileGiftsContainer profileGiftsContainer = ProfileGiftsContainer.this;
                StarsController.GiftsCollections giftsCollections = profileGiftsContainer.collections;
                giftsCollections.getClass();
                HashMap map = new HashMap();
                ArrayList arrayList3 = giftsCollections.collections;
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                    map.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList2.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList2.get(i6);
                    i6++;
                    Integer num2 = (Integer) obj3;
                    num2.getClass();
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) map.get(num2);
                    if (tL_starGiftCollection2 != null) {
                        arrayList4.add(tL_starGiftCollection2);
                    }
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                giftsCollections.refilterCollections();
                Page currentPage = profileGiftsContainer.getCurrentPage();
                if (currentPage != null) {
                    int iIndexOf = currentPage.isCollection ? profileGiftsContainer.collections.indexOf(currentPage.list.collectionId) + 1 : 0;
                    profileGiftsContainer.tabsView.selectTab(iIndexOf, iIndexOf, 0.0f);
                }
                AndroidUtilities.cancelRunOnUIThread(profileGiftsContainer.sendCollectionsOrder);
                AndroidUtilities.runOnUIThread(profileGiftsContainer.sendCollectionsOrder, 1000L);
            }

            @Override
            public final void bindView(View view, int i4, int i5) {
                StarsController.GiftsList giftsList;
                boolean z;
                Page page = (Page) view;
                ProfileGiftsContainer profileGiftsContainer = ProfileGiftsContainer.this;
                if (i5 == 0) {
                    giftsList = profileGiftsContainer.list;
                    z = false;
                } else {
                    StarsController.GiftsCollections giftsCollections = profileGiftsContainer.collections;
                    int i6 = i4 - 1;
                    if (i6 >= 0) {
                        if (i6 < giftsCollections.getCollections().size()) {
                            giftsList = (StarsController.GiftsList) giftsCollections.gifts.get(Integer.valueOf(((TL_stars.TL_starGiftCollection) giftsCollections.getCollections().get(i6)).collection_id));
                        }
                        z = true;
                    } else {
                        giftsCollections.getClass();
                    }
                    giftsList = null;
                    z = true;
                }
                page.isCollection = z;
                page.list = giftsList;
                if (giftsList != null) {
                    giftsList.load();
                }
                page.update(false);
                LinearLayout linearLayout = page.emptyView2Layout;
                if (linearLayout != null) {
                    linearLayout.setVisibility(page.parent.collections.isMine() ? 0 : 8);
                }
                page.setVisibleHeight(profileGiftsContainer.visibleHeight);
                page.setHasTabs(!profileGiftsContainer.collections.getCollections().isEmpty());
            }

            @Override
            public final boolean canReorder(int i4) {
                return i4 != 0;
            }

            @Override
            public final View createView(int i4) {
                if (i4 == -1) {
                    return null;
                }
                return new Page(ProfileGiftsContainer.this, i, resourcesProvider);
            }

            @Override
            public final int getItemCount() {
                return ProfileGiftsContainer.this.collections.getCollections().size() + 1;
            }

            @Override
            public final int getItemId(int i4) {
                if (i4 == 0) {
                    return -2;
                }
                return ((TL_stars.TL_starGiftCollection) ProfileGiftsContainer.this.collections.getCollections().get(i4 - 1)).collection_id;
            }

            @Override
            public final CharSequence getItemTitle(int i4) {
                if (i4 == 0) {
                    return LocaleController.getString(R.string.Gift2CollectionAll);
                }
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) ProfileGiftsContainer.this.collections.getCollections().get(i4 - 1);
                if (tL_starGiftCollection == null) {
                    return null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
                if (tL_starGiftCollection.icon != null) {
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
                    spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
                }
                return spannableStringBuilder;
            }

            @Override
            public final int getItemViewType(int i4) {
                return i4 == 0 ? 0 : 1;
            }
        });
        addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.TabsView tabsViewCreateTabsView = viewPagerFixed.createTabsView(true, 10);
        this.tabsView = tabsViewCreateTabsView;
        tabsViewCreateTabsView.setColors(Theme.key_profile_tabSelectedLine, Theme.key_windowBackgroundWhiteBlackText, Theme.key_profile_tabText, Theme.key_profile_tabSelector, Theme.key_actionBarDefault);
        tabsViewCreateTabsView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tabsViewCreateTabsView.setClipToPadding(false);
        tabsViewCreateTabsView.tabMarginDp = 12;
        tabsViewCreateTabsView.setPreTabClick(new ProfileGiftsContainer$$ExternalSyntheticLambda22(this));
        tabsViewCreateTabsView.setOnTabLongClick(new AlertsCreator$$ExternalSyntheticLambda37(i, this, baseFragment, context, resourcesProvider));
        addView(tabsViewCreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        int i4 = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.paint.setColor(Theme.getColor(i4, resourcesProvider));
        ProfileActivity.Button2 button2 = new ProfileActivity.Button2(context);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = new BlurredBackgroundColorProviderThemed(resourcesProvider, i4);
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceColor);
        blurredBackgroundDrawableSource.setColorProvider(blurredBackgroundColorProviderThemed);
        blurredBackgroundDrawableSource.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableSource.setRadius(AndroidUtilities.dp(22.0f));
        button2.setBackground(blurredBackgroundDrawableSource);
        ScaleStateListAnimator.apply(button2, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 60, 87);
        layoutParamsCreateFrame.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, layoutParamsCreateFrame);
        frameLayout.addView(button2, LayoutHelper.createFrame(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.checkboxLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 24, 24));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkbox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.checkboxTextView = textView;
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        button2.addView(linearLayout, LayoutHelper.createFrame(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new WallpaperCell$$ExternalSyntheticLambda0(this, baseFragment, i, 4));
        Boolean bool = profileGiftsList.chat_notifications_enabled;
        if (bool != null) {
            checkBox2.setChecked(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(this.dialogId));
        final boolean z = this.dialogId < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb = new StringBuilder("G ");
        if (z) {
            long j2 = this.dialogId;
            if (j2 < 0) {
                i2 = R.string.ProfileGiftsSendChannel;
            } else {
                string = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j2));
            }
            sb.append(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_gift_simple), 0, 1, 33);
            this.sendGiftsToFriendsText = spannableStringBuilder;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("+ "), R.string.ProfileGiftsAdd));
            spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_add_album), 0, 1, 33);
            this.addGiftsText = spannableStringBuilder2;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setUseWrapContent(true);
            buttonWithCounterView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            buttonWithCounterView.setRoundRadius(AndroidUtilities.dp(19.0f));
            buttonWithCounterView.setText(spannableStringBuilder, false);
            buttonWithCounterView.setStateListAnimator(null);
            button2.addView(buttonWithCounterView, LayoutHelper.createFrame(-2, -1, 17));
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$11(z, i, view);
                }
            });
            if (canSwitchNotify()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            buttonWithCounterView.setVisibility(i3);
            linearLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = 60;
            addView(frameLayout2, LayoutHelper.createFrame(-1, 200, 87));
            updateColors();
            updateTabsShown(false);
        }
        i2 = R.string.ProfileGiftsSend;
        string = LocaleController.getString(i2);
        sb.append(string);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder3.setSpan(new ColoredImageSpan(R.drawable.filled_gift_simple), 0, 1, 33);
        this.sendGiftsToFriendsText = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("+ "), R.string.ProfileGiftsAdd));
        spannableStringBuilder4.setSpan(new ColoredImageSpan(R.drawable.filled_add_album), 0, 1, 33);
        this.addGiftsText = spannableStringBuilder4;
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, resourcesProvider);
        this.button = buttonWithCounterView2;
        buttonWithCounterView2.setUseWrapContent(true);
        buttonWithCounterView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        buttonWithCounterView2.setRoundRadius(AndroidUtilities.dp(19.0f));
        buttonWithCounterView2.setText(spannableStringBuilder3, false);
        buttonWithCounterView2.setStateListAnimator(null);
        button2.addView(buttonWithCounterView2, LayoutHelper.createFrame(-2, -1, 17));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$11(z, i, view);
            }
        });
        if (canSwitchNotify()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        buttonWithCounterView2.setVisibility(i3);
        linearLayout.setVisibility(canSwitchNotify() ? 0 : 8);
        this.buttonContainerHeightDp = 60;
        addView(frameLayout2, LayoutHelper.createFrame(-1, 200, 87));
        updateColors();
        updateTabsShown(false);
    }

    public static void lambda$openEnterNameAlert$15(EditTextCaption editTextCaption, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        String string = editTextCaption.getText().toString();
        if (string.length() <= 0 || string.length() > 12) {
            AndroidUtilities.shakeView(editTextCaption);
        } else {
            callback.run(string);
            alertDialog.dismiss();
        }
    }

    public static void lambda$openEnterNameAlert$18(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    public static void lambda$setGiftFilterOptionsClickListeners$22(StarsController.GiftsList giftsList, int i, Runnable runnable, View view) {
        int i2;
        giftsList.getClass();
        if ((i & 15) != 0) {
            i2 = 15;
        } else {
            i2 = (i & 768) != 0 ? 768 : 0;
        }
        int i3 = giftsList.includeFlags & i2;
        int flag = TLObject.setFlag(i3, i, !TLObject.hasFlag(i3, i));
        if (flag == 0) {
            flag = i2 & (~i);
        }
        int i4 = giftsList.includeFlags;
        int i5 = ((~i2) & i4) | flag;
        if (i4 != i5) {
            giftsList.includeFlags = i5;
            giftsList.invalidate(true);
        }
        runnable.run();
    }

    public static boolean lambda$setGiftFilterOptionsClickListeners$23(StarsController.GiftsList giftsList, int i, Runnable runnable, View view) {
        int i2;
        giftsList.getClass();
        if ((i & 15) != 0) {
            i2 = 15;
        } else {
            i2 = (i & 768) != 0 ? 768 : 0;
        }
        int i3 = giftsList.includeFlags;
        int i4 = i | ((~i2) & i3);
        if (i3 != i4) {
            giftsList.includeFlags = i4;
            giftsList.invalidate(true);
        }
        runnable.run();
        return true;
    }

    public static void setGiftFilterOptionsClickListeners(View view, StarsController.GiftsList giftsList, Runnable runnable, int i) {
        view.setOnClickListener(new WallpaperCell$$ExternalSyntheticLambda0(giftsList, i, runnable, 3));
        view.setOnLongClickListener(new WallpaperCell$$ExternalSyntheticLambda1(giftsList, i, runnable));
    }

    public void addGifts() {
        StarsController.GiftsList giftsList;
        Page currentPage = getCurrentPage();
        if (currentPage == null || (giftsList = currentPage.list) == null || !currentPage.isCollection) {
            return;
        }
        int i = giftsList.collectionId;
        new SelectGiftsBottomSheet(this.fragment, this.dialogId, i, new CommunityUtils$$ExternalSyntheticLambda2(this, i, currentPage, 2)).show();
    }

    public boolean canAdd() {
        return this.collections.isMine() && this.collections.getCollections().size() < MessagesController.getInstance(this.currentAccount).config.stargiftsCollectionsLimit.get();
    }

    public boolean canFilter() {
        return true;
    }

    public boolean canFilterHidden() {
        if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return true;
        }
        if (this.dialogId >= 0) {
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), 5);
    }

    public boolean canReorder() {
        long j = this.dialogId;
        if (j >= 0) {
            return j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), 5);
    }

    public boolean canScroll(boolean z) {
        if (z) {
            return this.viewPager.getCurrentPosition() >= this.collections.getCollections().size();
        }
        return this.viewPager.getCurrentPosition() <= 0;
    }

    public boolean canSwitchNotify() {
        return this.dialogId < 0 && this.list.chat_notifications_enabled != null;
    }

    public final void checkScrollToCollection() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.pendingScrollToCollectionId <= 0) {
            return;
        }
        ArrayList collections = this.collections.getCollections();
        int i = 0;
        while (true) {
            if (i >= collections.size()) {
                i = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) collections.get(i)).collection_id == this.pendingScrollToCollectionId) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) collections.get(i);
                    break;
                }
                i++;
            }
        }
        if (i < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.pendingScrollToCollectionId = 0;
        this.tabsView.scrollToTab(tL_starGiftCollection.collection_id, i + 1);
    }

    public void createCollection() {
        openEnterNameAlert(null, new ProfileGiftsContainer$$ExternalSyntheticLambda7(this, 0));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != this.dialogId) {
                return;
            }
            this.button.setVisibility(canSwitchNotify() ? 8 : 0);
            this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = 60;
            Boolean bool = this.list.chat_notifications_enabled;
            if (bool != null) {
                this.checkbox.setChecked(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() != this.dialogId) {
                return;
            }
            fillTabs$1(true);
            updateTabsShown(true);
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            this.button.setVisibility(canSwitchNotify() ? 8 : 0);
            this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = 60;
            setVisibleHeight(this.visibleHeight);
        }
    }

    public final void fillTabs$1(boolean z) {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null || this.tabsView == null) {
            return;
        }
        viewPagerFixed.fillTabs(z);
        checkScrollToCollection();
    }

    public int getBottomOffset() {
        float translationY = this.buttonContainer.getTranslationY() - RichMessageLayout$$ExternalSyntheticOutline1.m(this.buttonContainerHeightDp, Math.max(AndroidUtilities.dp(240.0f), this.visibleHeight) + (-this.buttonContainer.getTop()), 1);
        if (this.visibleHeight < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.visibleHeight, AndroidUtilities.dp(this.buttonContainerHeightDp));
        }
        return (int) (AndroidUtilities.dp(this.buttonContainerHeightDp) - translationY);
    }

    public StarsController.GiftsList getCurrentList() {
        Page currentPage = getCurrentPage();
        return currentPage != null ? currentPage.list : this.list;
    }

    public RecyclerListView getCurrentListView() {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.listView;
        }
        return null;
    }

    public Page getCurrentPage() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (Page) currentView;
    }

    public int getGiftsCount() {
        int i;
        StarsController.GiftsList giftsList;
        int i2;
        Page currentPage = getCurrentPage();
        if (currentPage == null || (giftsList = currentPage.list) == this.list) {
            StarsController.GiftsList giftsList2 = this.list;
            if (giftsList2 != null && (i = giftsList2.totalCount) > 0) {
                return i;
            }
        } else if (giftsList != null && (i2 = giftsList.totalCount) > 0) {
            return i2;
        }
        if (this.dialogId >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public CharSequence getLastEmojis(Paint.FontMetricsInt fontMetricsInt) {
        CharSequence charSequence;
        if (this.list == null) {
            return "";
        }
        Pair<Integer, Long> pair = new Pair<>(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(this.dialogId));
        if (this.list.gifts.isEmpty()) {
            return (!this.list.loading || (charSequence = cachedLastEmojis.get(pair)) == null) ? "" : charSequence;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; arrayList.size() < 3 && i < this.list.gifts.size(); i++) {
            TLRPC.Document document = ((TL_stars.SavedStarGift) this.list.gifts.get(i)).gift.getDocument();
            if (document != null && !hashSet.contains(Long.valueOf(document.id))) {
                hashSet.add(Long.valueOf(document.id));
                arrayList.add(document);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList.get(i2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(document2, 0.9f, fontMetricsInt), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        cachedLastEmojis.put(pair, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public long getLastEmojisHash() {
        StarsController.GiftsList giftsList = this.list;
        long jHash = 0;
        if (giftsList != null && !giftsList.gifts.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < this.list.gifts.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) this.list.gifts.get(i2)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    jHash = Objects.hash(Long.valueOf(jHash), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return jHash;
    }

    public float getTabsHeight() {
        float tabsHeight = 0.0f;
        if (this.viewPager.getViewPages() != null) {
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    tabsHeight = (((Page) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + tabsHeight;
                }
            }
        }
        return tabsHeight;
    }

    public float getTabsVisibility() {
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        if (tabsView != null) {
            return tabsView.getAlpha();
        }
        return 0.0f;
    }

    public void initBlurCapture(ViewGroup viewGroup) {
        this.iBlur3CaptureParent = viewGroup;
        this.iBlur3Capture = new IBlur3Capture() {
            @Override
            public final void capture(Canvas canvas, RectF rectF) {
                this.f$0.lambda$initBlurCapture$24(canvas, rectF);
            }

            @Override
            public final void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
                ((Blur3HashImpl) iBlur3Hash).unsupported = true;
            }
        };
    }

    public boolean isReordering() {
        if (this.reorderingCollections) {
            return true;
        }
        Page currentPage = getCurrentPage();
        return currentPage != null && currentPage.reordering;
    }

    public final void lambda$addGifts$21(int i, Page page, ArrayList arrayList) {
        this.collections.addGifts(i, arrayList);
        page.update(true);
        fillTabs$1(true);
        updateTabsShown(true);
        TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = this.collections.findById(i);
        if (tL_starGiftCollectionFindById != null) {
            if (arrayList.size() > 1) {
                Bulletin bulletinCreateSimpleMultiBulletin = BulletinFactory.of(this.fragment).createSimpleMultiBulletin(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), tL_starGiftCollectionFindById.title)));
                bulletinCreateSimpleMultiBulletin.hideAfterBottomSheet = false;
                bulletinCreateSimpleMultiBulletin.show();
                return;
            }
            if (arrayList.size() == 1) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                Bulletin bulletinCreateSimpleMultiBulletin2 = BulletinFactory.of(this.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollectionFindById.title)));
                bulletinCreateSimpleMultiBulletin2.hideAfterBottomSheet = false;
                bulletinCreateSimpleMultiBulletin2.show();
            }
        }
    }

    public final void lambda$createCollection$19(TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        fillTabs$1(true);
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        int i = tL_starGiftCollection.collection_id;
        tabsView.scrollToTab(i, this.collections.indexOf(i) + 1);
        BaseFragment baseFragment = this.fragment;
        if (baseFragment instanceof ProfileActivity) {
            ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
        }
        updateTabsShown(true);
    }

    public final void lambda$createCollection$20(String str) {
        this.collections.createCollection(str, new ProfileGiftsContainer$$ExternalSyntheticLambda7(this, 1));
    }

    public final void lambda$initBlurCapture$24(Canvas canvas, RectF rectF) {
        for (View view : this.viewPager.getViewPages()) {
            if (view instanceof Page) {
                Page page = (Page) view;
                if (page.iBlur3Capture == null) {
                    ViewGroup viewGroup = this.iBlur3CaptureParent;
                    final Page.AnonymousClass1 anonymousClass1 = page.listView;
                    Objects.requireNonNull(anonymousClass1);
                    page.iBlur3Capture = new ViewGroupPartRenderer(anonymousClass1, viewGroup, new ViewGroupPartRenderer.DrawChildMethod() {
                        @Override
                        public final boolean drawChild(Canvas canvas2, View view2, long j) {
                            return drawChild(canvas2, view2, j);
                        }
                    });
                }
                page.iBlur3Capture.capture(canvas, rectF);
            }
        }
    }

    public final Boolean lambda$new$1(Integer num, Integer num2) {
        resetReordering();
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        createCollection();
        return Boolean.TRUE;
    }

    public final void lambda$new$10(BaseFragment baseFragment, int i, View view) {
        CheckBox2 checkBox2 = this.checkbox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        boolean zIsChecked = this.checkbox.isChecked();
        BulletinFactory.of(baseFragment).createSimpleBulletinDetail(zIsChecked ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(zIsChecked ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).show();
        this.list.chat_notifications_enabled = Boolean.valueOf(zIsChecked);
        if (this.checkboxRequestId >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.checkboxRequestId, true);
            this.checkboxRequestId = -1;
        }
        TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
        togglechatstargiftnotifications.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        togglechatstargiftnotifications.enabled = zIsChecked;
        ConnectionsManager.getInstance(i).sendRequest(togglechatstargiftnotifications, new StarGiftSheet$$ExternalSyntheticLambda0(16, this, baseFragment));
    }

    public final void lambda$new$11(boolean z, int i, View view) {
        if (this.collections.isMine() && this.viewPager.getCurrentPosition() != 0) {
            addGifts();
            return;
        }
        if (!z) {
            UserSelectorBottomSheet.open(2, BirthdayController.getInstance(i).getState());
            return;
        }
        GiftSheet giftSheet = new GiftSheet(getContext(), i, this.dialogId, null, null);
        giftSheet.birthday = BirthdayController.getInstance(i).isToday(this.dialogId);
        giftSheet.adapter.update(false);
        giftSheet.show();
    }

    public final void lambda$new$12$1() {
        StarsController.GiftsCollections giftsCollections = this.collections;
        giftsCollections.getClass();
        TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
        int i = giftsCollections.currentAccount;
        reorderstargiftcollections.peer = MessagesController.getInstance(i).getInputPeer(giftsCollections.dialogId);
        ArrayList arrayList = giftsCollections.collections;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
        }
        ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
        giftsCollections.refilterCollections();
    }

    public final void lambda$new$14(int i, float f, float f2, FactorAnimator factorAnimator) {
        updateButton();
    }

    public final void lambda$new$2(int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, Theme.ResourcesProvider resourcesProvider, final BaseFragment baseFragment) {
        StringBuilder sb = new StringBuilder();
        Fragment$$ExternalSyntheticOutline0.m(sb, MessagesController.getInstance(i).linkPrefix, "/", str, "/c/");
        sb.append(tL_starGiftCollection.collection_id);
        String string = sb.toString();
        new ShareAlert(context, string, string, resourcesProvider) {
            @Override
            public final void onSend(LongSparseArray longSparseArray, int i2, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                BulletinFactory bulletinFactoryOf;
                if (z && (bulletinFactoryOf = BulletinFactory.of(baseFragment)) != null) {
                    if (longSparseArray.size() == 1) {
                        long jKeyAt = longSparseArray.keyAt(0);
                        if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])), 5000).hideAfterBottomSheet(false).show();
                        } else if (jKeyAt < 0) {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)), 5000).hideAfterBottomSheet(false).show();
                        } else {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)), 5000).hideAfterBottomSheet(false).show();
                        }
                    } else {
                        bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size())))).hideAfterBottomSheet(false).show();
                    }
                    try {
                        ProfileGiftsContainer.this.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
        }.show();
    }

    public final void lambda$new$3(TL_stars.TL_starGiftCollection tL_starGiftCollection, String str) {
        StarsController.GiftsCollections giftsCollections = this.collections;
        int i = tL_starGiftCollection.collection_id;
        giftsCollections.getClass();
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i2 = giftsCollections.currentAccount;
        updatestargiftcollection.peer = MessagesController.getInstance(i2).getInputPeer(giftsCollections.dialogId);
        updatestargiftcollection.collection_id = i;
        updatestargiftcollection.flags |= 1;
        updatestargiftcollection.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(updatestargiftcollection, null);
        tL_starGiftCollection.title = str;
        fillTabs$1(true);
    }

    public final void lambda$new$4(TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        openEnterNameAlert(tL_starGiftCollection.title, new GiftSheet$$ExternalSyntheticLambda4(9, this, tL_starGiftCollection));
    }

    public final void lambda$new$5() {
        setReorderingCollections(true);
    }

    public final void lambda$new$6(int i, TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        if (i != -1) {
            StarsController.GiftsCollections giftsCollections = this.collections;
            int iIndexOf = giftsCollections.indexOf(tL_starGiftCollection.collection_id);
            if (iIndexOf != -1) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) giftsCollections.collections.remove(iIndexOf);
                giftsCollections.gifts.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                int i2 = giftsCollections.currentAccount;
                deletestargiftcollection.peer = MessagesController.getInstance(i2).getInputPeer(giftsCollections.dialogId);
                deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                ConnectionsManager.getInstance(i2).sendRequest(deletestargiftcollection, null);
            }
            fillTabs$1(true);
            ViewPagerFixed.TabsView tabsView = this.tabsView;
            if (i < this.collections.getCollections().size()) {
                i++;
            }
            tabsView.scrollToTab(-1, i);
            updateTabsShown(true);
        }
    }

    public final Boolean lambda$new$7(int i, BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, Integer num, View view) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i2 = -1;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || this.reorderingCollections) {
            return Boolean.FALSE;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.collections.getCollections().size()) {
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) this.collections.getCollections().get(i3)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.collections.getCollections().get(i3);
                i2 = i3;
                break;
            }
            i3++;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i).getUserOrChat(this.dialogId));
        boolean zIsMine = this.collections.isMine();
        if (TextUtils.isEmpty(publicUsername) && !zIsMine) {
            return Boolean.FALSE;
        }
        ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(baseFragment, view).setScrimViewBackground(new AnonymousClass3(this)).addIf(zIsMine, R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new ProfileGiftsContainer$$ExternalSyntheticLambda8(this, 0)).addIf(!TextUtils.isEmpty(publicUsername), R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new ArticleViewer$$ExternalSyntheticLambda20(this, i, publicUsername, tL_starGiftCollection, context, resourcesProvider, baseFragment)).addIf(zIsMine, R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new GiftSheet$$ExternalSyntheticLambda26(23, this, tL_starGiftCollection)).addIf(zIsMine, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new ProfileGiftsContainer$$ExternalSyntheticLambda8(this, 1)).addIf(zIsMine, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Gift2CollectionsDelete), true, (Runnable) new RichTextCell$2$$ExternalSyntheticLambda1(this, i2, tL_starGiftCollection, 12));
        this.currentMenu = itemOptionsAddIf;
        itemOptionsAddIf.show();
        return Boolean.TRUE;
    }

    public final void lambda$new$8(TLRPC.TL_error tL_error, BaseFragment baseFragment) {
        this.checkboxRequestId = -1;
        if (tL_error != null) {
            BulletinFactory.of(baseFragment).showForError(tL_error);
        }
    }

    public final void lambda$new$9(BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(this, tL_error, baseFragment, 10));
    }

    public final void lambda$openEnterNameAlert$17(EditTextCaption editTextCaption, Activity activity, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editTextCaption);
        AndroidUtilities.requestAdjustResize(activity, this.fragment.getClassGuid());
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.update(false);
        }
        fillTabs$1(false);
        updateTabsShown(false);
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null) {
            giftsList.shown = true;
            giftsList.load();
        }
        StarsController.GiftsCollections giftsCollections = this.collections;
        if (giftsCollections != null) {
            giftsCollections.shown = true;
            giftsCollections.load();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        Page currentPage = getCurrentPage();
        resetReordering();
        if (currentPage != null) {
            currentPage.resetReordering();
        }
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null) {
            giftsList.shown = false;
        }
        StarsController.GiftsCollections giftsCollections = this.collections;
        if (giftsCollections != null) {
            giftsCollections.shown = false;
        }
    }

    public final void openEnterNameAlert(String str, final Utilities.Callback callback) {
        ActionBarPopupWindow actionBarPopupWindow;
        Context context = getContext();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, this.resourcesProvider);
        if (str != null) {
            builder.setTitle(LocaleController.getString(R.string.Gift2EditCollectionNameTitle));
        } else {
            builder.setTitle(LocaleController.getString(R.string.Gift2NewCollectionTitle));
            builder.setMessage(LocaleController.getString(R.string.Gift2NewCollectionText));
        }
        final ?? r10 = new EditTextCaption(context, this.resourcesProvider) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.setGravity(5);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                animatedTextDrawable.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, ProfileGiftsContainer.this.resourcesProvider)));
                animatedTextDrawable.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                animatedTextDrawable.draw(canvas);
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.onTextChanged(charSequence, i, i2, i3);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                if (animatedTextDrawable != null) {
                    this.limitCount = 12 - charSequence.length();
                    animatedTextDrawable.cancelAnimation();
                    String str2 = "";
                    if (this.limitCount <= 4) {
                        str2 = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str2);
                }
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        r10.lineYFix = true;
        r10.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                AnonymousClass5 anonymousClass5 = r10;
                String string = anonymousClass5.getText().toString();
                if (string.length() <= 0 || string.length() > 12) {
                    AndroidUtilities.shakeView(anonymousClass5);
                    return true;
                }
                callback.run(string);
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r10.setTextSize(1, 18.0f);
        r10.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        r10.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, this.resourcesProvider));
        r10.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        r10.setFocusable(true);
        r10.setInputType(147457);
        r10.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, this.resourcesProvider));
        r10.setImeOptions(6);
        r10.setBackgroundDrawable(null);
        r10.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        r10.addTextChangedListener(new TextWatcher() {
            public boolean ignoreTextChange;

            @Override
            public final void afterTextChanged(Editable editable) {
                if (!this.ignoreTextChange && editable.length() > 12) {
                    this.ignoreTextChange = true;
                    editable.delete(12, editable.length());
                    AnonymousClass5 anonymousClass5 = r10;
                    AndroidUtilities.shakeView(anonymousClass5);
                    try {
                        anonymousClass5.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        r10.setText(str);
        linearLayout.addView((View) r10, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        builder.setPositiveButton(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new RateCallLayout$$ExternalSyntheticLambda1(12, r10, callback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new LivePlayer$$ExternalSyntheticLambda1(26));
        alertDialogArr[0] = builder.create();
        ItemOptions itemOptions = this.currentMenu;
        if (itemOptions != null && (actionBarPopupWindow = itemOptions.actionBarPopupWindow) != null) {
            actionBarPopupWindow.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(activityFindActivity, this.fragment.getClassGuid());
        int i = 2;
        alertDialogArr[0].setOnDismissListener(new BotLocation$$ExternalSyntheticLambda13(this, r10, activityFindActivity, i));
        alertDialogArr[0].setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(i, r10));
        alertDialogArr[0].show();
        AlertDialog alertDialog = alertDialogArr[0];
        alertDialog.dismissDialogByButtons = false;
        boolean z = alertDialog.getButton(-1) instanceof TextView;
        r10.setSelection(r10.getText().length());
    }

    public abstract int processColor(int i);

    public void resetReordering() {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.resetReordering();
        }
        setReorderingCollections(false);
    }

    public void scrollToCollectionId(int i) {
        this.pendingScrollToCollectionId = i;
        checkScrollToCollection();
    }

    public void setButtonOffset(int i) {
        if (this.buttonContainerOffset != i) {
            this.buttonContainerOffset = i;
            updateButton();
        }
    }

    public void setPaddingTop(int i) {
        if (this.externalPaddingTop != i) {
            this.externalPaddingTop = i;
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    int paddingTop = page.listView.getPaddingTop();
                    int iDp = AndroidUtilities.dp(9.0f);
                    int i2 = this.externalPaddingTop;
                    int iDp2 = AndroidUtilities.dp(9.0f);
                    int iDp3 = AndroidUtilities.dp(86.0f);
                    Page.AnonymousClass1 anonymousClass1 = page.listView;
                    anonymousClass1.setPadding(iDp, i2, iDp2, iDp3);
                    AndroidUtilities.doOnLayout(anonymousClass1, new ProfileGiftsContainer$$ExternalSyntheticLambda16(page, paddingTop - anonymousClass1.getPaddingTop(), 0));
                }
            }
            updateTabsY();
            updateButton();
        }
    }

    public void setReordering(boolean z) {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.reorderingCollections == z) {
            return;
        }
        this.reorderingCollections = z;
        updatedReordering(isReordering());
        this.tabsView.setReordering(z);
        if (z) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment instanceof ProfileActivity) {
                ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda18((ProfileActivity) safeLastFragment, 1));
            }
        }
        if (z) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.sendCollectionsOrder);
        AndroidUtilities.runOnUIThread(this.sendCollectionsOrder);
    }

    public void setVisibleHeight(int i) {
        this.visibleHeight = i;
        updateButton();
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).setVisibleHeight(this.visibleHeight);
                }
            }
        }
    }

    public final boolean shouldHideButton(int i) {
        StarsController.GiftsList giftsList;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.collections.getCollections().size()) {
            return true;
        }
        StarsController.GiftsCollections giftsCollections = this.collections;
        if (i2 >= 0) {
            if (i2 < giftsCollections.getCollections().size()) {
                giftsList = (StarsController.GiftsList) giftsCollections.gifts.get(Integer.valueOf(((TL_stars.TL_starGiftCollection) giftsCollections.getCollections().get(i2)).collection_id));
            }
            if (giftsList == null) {
                return true;
            }
            return giftsList.gifts.isEmpty();
        }
        giftsCollections.getClass();
        giftsList = null;
        if (giftsList == null) {
            return true;
        }
        return giftsList.gifts.isEmpty();
    }

    public void updateButton() {
        float nextPositionAlpha;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null) {
            return;
        }
        if (viewPagerFixed.getCurrentPosition() == this.viewPager.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (shouldHideButton(this.viewPager.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((this.viewPager.getNextPositionAlpha() * (shouldHideButton(this.viewPager.getNextPosition()) ? 1.0f : 0.0f)) + (this.viewPager.getCurrentPositionAlpha() * (shouldHideButton(this.viewPager.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        float fM = nextPositionAlpha + RichMessageLayout$$ExternalSyntheticOutline1.m(this.buttonContainerHeightDp, (-this.buttonContainer.getTop()) + this.visibleHeight, 1);
        this.animatorBottomButtonVisibility.setValue(this.visibleHeight > AndroidUtilities.dp(184.0f), true);
        float f = this.animatorBottomButtonVisibility.floatValue;
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + fM, fM, f);
        this.bulletinContainer.setTranslationY(fLerp - AndroidUtilities.dp(200.0f));
        this.buttonContainer.setTranslationY(fLerp - this.buttonContainerOffset);
        this.buttonContainer.setAlpha(f);
        this.buttonContainer.setVisibility(f <= 0.0f ? 4 : 0);
        this.button.setText((!this.collections.isMine() || this.viewPager.getPositionAnimated() < 0.5f) ? this.sendGiftsToFriendsText : this.addGiftsText, true);
        Bulletin.updateCurrentPosition();
    }

    public void updateColors() {
        this.button.updateColors();
        this.button.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(19.0f), processColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider))));
        View[] viewPages = this.viewPager.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    FrameLayout frameLayout = page.emptyView1;
                    Theme.ResourcesProvider resourcesProvider = page.resourcesProvider;
                    if (frameLayout != null) {
                        page.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                        TextView textView = page.emptyView1Button;
                        int i = Theme.key_featuredStickers_addButton;
                        textView.setTextColor(Theme.getColor(i, resourcesProvider));
                        page.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i, resourcesProvider)), 4, 4));
                    } else {
                        page.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                        page.emptyView2Subtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
                        page.emptyView2Button.updateColors();
                    }
                }
            }
        }
        this.checkboxTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        this.checkboxLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 24, 24));
    }

    public void updateTabsShown(boolean z) {
        boolean z2 = !this.collections.getCollections().isEmpty() || canAdd();
        if (this.viewPager.getViewPages() != null) {
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).setHasTabs(z2);
                }
            }
        }
    }

    public void updateTabsY() {
        float f;
        if (this.tabsView == null) {
            return;
        }
        float fMin = Math.min(this.externalPaddingTop, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(fMin - this.externalPaddingTop, -AndroidUtilities.dp(42.0f), 0.0f));
        float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp01);
        this.tabsView.setTranslationY(fMin);
        this.tabsView.setScaleX(fLerp);
        this.tabsView.setScaleY(fLerp);
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        if (this.viewPager.getViewPages() != null) {
            f = 0.0f;
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    f += ((Page) view).hasTabs ? 1.0f : 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        tabsView.setAlpha(MathUtils.clamp(f, 0.0f, 1.0f) * fClamp01);
    }

    public abstract void updatedReordering(boolean z);

    public final class AnonymousClass3 extends Drawable {
        public final int $r8$classId;
        public final Object bg;
        public final Object bgBounds;

        public AnonymousClass3(Bitmap bitmap) {
            this.$r8$classId = 1;
            this.bgBounds = new Rect();
            this.bg = bitmap;
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    Rect bounds = getBounds();
                    Rect rect = (Rect) this.bgBounds;
                    rect.set(bounds);
                    rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                    ShapeDrawable shapeDrawable = (ShapeDrawable) this.bg;
                    shapeDrawable.setBounds(rect);
                    shapeDrawable.draw(canvas);
                    break;
                case 1:
                    Bitmap bitmap = (Bitmap) this.bg;
                    if (!bitmap.isRecycled()) {
                        canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.bgBounds, (Paint) null);
                        break;
                    }
                    break;
                default:
                    ImageReceiver imageReceiver = (ImageReceiver) this.bg;
                    imageReceiver.draw(canvas);
                    Drawable drawable = (Drawable) this.bgBounds;
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                    int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    drawable.setBounds(iM, imageHeight, intrinsicWidth + iM, intrinsicHeight + imageHeight);
                    drawable.draw(canvas);
                    break;
            }
        }

        @Override
        public int getAlpha() {
            switch (this.$r8$classId) {
                case 2:
                    return (int) (((ImageReceiver) this.bg).getAlpha() * 255.0f);
                default:
                    return super.getAlpha();
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
                case 0:
                    return -2;
                case 1:
                    return -3;
                default:
                    return 0;
            }
        }

        @Override
        public void onBoundsChange(Rect rect) {
            switch (this.$r8$classId) {
                case 2:
                    ((ImageReceiver) this.bg).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, OKLCH.m$1(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), OKLCH.m$1(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                    break;
                default:
                    super.onBoundsChange(rect);
                    break;
            }
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                    ((ShapeDrawable) this.bg).setAlpha(i);
                    break;
                case 1:
                    break;
                default:
                    ((ImageReceiver) this.bg).setAlpha(i / 255.0f);
                    break;
            }
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 1:
                    super.setBounds(i, i2, i3, i4);
                    Bitmap bitmap = (Bitmap) this.bg;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMin = Math.min(i5 / width, i6 / height);
                        int iRound = Math.round(width * fMin);
                        int iRound2 = Math.round(height * fMin);
                        int i7 = i + ((i5 - iRound) / 2);
                        int i8 = i2 + ((i6 - iRound2) / 2);
                        ((Rect) this.bgBounds).set(i7, i8, iRound + i7, iRound2 + i8);
                        break;
                    }
                    break;
                default:
                    super.setBounds(i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            int i = this.$r8$classId;
        }

        public AnonymousClass3(ImageReceiver imageReceiver, Drawable drawable) {
            this.$r8$classId = 2;
            this.bg = imageReceiver;
            this.bgBounds = drawable;
        }

        public AnonymousClass3(ProfileGiftsContainer profileGiftsContainer) {
            this.$r8$classId = 0;
            this.bg = Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), profileGiftsContainer.backgroundColor);
            this.bgBounds = new Rect();
        }

        private final void setAlpha$org$telegram$messenger$pip$source$PipSourcePlaceholder$PlaceholderDrawable(int i) {
        }

        private final void setColorFilter$org$telegram$messenger$pip$source$PipSourcePlaceholder$PlaceholderDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$poll$attached$PollAttachedMediaLocation$2(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Gifts$ProfileGiftsContainer$3(ColorFilter colorFilter) {
        }
    }
}
