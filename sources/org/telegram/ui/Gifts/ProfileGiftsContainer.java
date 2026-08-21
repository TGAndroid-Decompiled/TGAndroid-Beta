package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda6;
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
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ProfileGiftsView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class ProfileGiftsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final HashMap cachedLastEmojis = new HashMap();
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

    public boolean canFilter() {
        return true;
    }

    protected abstract int processColor(int i);

    protected abstract void updatedReordering(boolean z);

    public void fillTabs(boolean z) {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null || this.tabsView == null) {
            return;
        }
        viewPagerFixed.fillTabs(z);
        checkScrollToCollection();
    }

    public void setPaddingTop(int i) {
        if (this.externalPaddingTop != i) {
            this.externalPaddingTop = i;
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    final Page page = (Page) view;
                    int paddingTop = page.listView.getPaddingTop();
                    page.listView.setPadding(AndroidUtilities.dp(9.0f), this.externalPaddingTop, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    final int paddingTop2 = paddingTop - page.listView.getPaddingTop();
                    AndroidUtilities.doOnLayout(page.listView, new Runnable() {
                        @Override
                        public final void run() {
                            page.listView.scrollBy(0, paddingTop2);
                        }
                    });
                }
            }
            updateTabsY();
            updateButton();
        }
    }

    public static class Page extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        private final int currentAccount;
        private FrameLayout emptyView1;
        private TextView emptyView1Button;
        private LinearLayout emptyView1Layout;
        private TextView emptyView1Title;
        private FrameLayout emptyView2;
        private ButtonWithCounterView emptyView2Button;
        private LinearLayout emptyView2Layout;
        private TextView emptyView2Subtitle;
        private TextView emptyView2Title;
        private boolean hasTabs;
        public IBlur3Capture iBlur3Capture;
        public boolean isCollection;
        public StarsController.GiftsList list;
        private final UniversalRecyclerView listView;
        private final ProfileGiftsContainer parent;
        private final ItemTouchHelper reorder;
        private boolean reordering;
        private final Theme.ResourcesProvider resourcesProvider;
        private int visibleHeight;

        public void update(boolean z) {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView == null || universalRecyclerView.adapter == null) {
                return;
            }
            boolean zCanScrollVertically = universalRecyclerView.canScrollVertically(-1);
            this.listView.adapter.update(z);
            if (zCanScrollVertically) {
                return;
            }
            this.listView.scrollToPosition(0);
        }

        public Page(final ProfileGiftsContainer profileGiftsContainer, int i, Theme.ResourcesProvider resourcesProvider) {
            super(profileGiftsContainer.getContext());
            this.visibleHeight = AndroidUtilities.displaySize.y;
            Context context = profileGiftsContainer.getContext();
            this.parent = profileGiftsContainer;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i, 0, false, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, new Utilities.Callback5Return() {
                @Override
                public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return Boolean.valueOf(this.f$0.onItemLongPress((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
                }
            }, resourcesProvider, 3, 1) {
                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    profileGiftsContainer.updateTabsY();
                }
            };
            this.listView = universalRecyclerView;
            universalRecyclerView.adapter.setApplyBackground(false);
            universalRecyclerView.setSelectorType(9);
            universalRecyclerView.setSelectorDrawableColor(0);
            universalRecyclerView.setPadding(AndroidUtilities.dp(9.0f), profileGiftsContainer.externalPaddingTop, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
            universalRecyclerView.setClipToPadding(false);
            universalRecyclerView.setClipChildren(false);
            addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
            universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    if (Page.this.isAttachedToWindow() && (!Page.this.listView.canScrollVertically(1) || Page.this.isLoadingVisible())) {
                        Page.this.list.load();
                    }
                    profileGiftsContainer.updateTabsY();
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onMoveAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }

                @Override
                protected void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onAddAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }

                @Override
                protected void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onChangeAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }

                @Override
                protected void onRemoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    super.onRemoveAnimationUpdate(viewHolder);
                    profileGiftsContainer.updateTabsY();
                }
            };
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            universalRecyclerView.setItemAnimator(defaultItemAnimator);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int i2) {
                }

                private TL_stars.SavedStarGift getSavedGift(RecyclerView.ViewHolder viewHolder) {
                    View view = viewHolder.itemView;
                    if (view instanceof GiftSheet.GiftCell) {
                        return ((GiftSheet.GiftCell) view).getSavedGift();
                    }
                    return null;
                }

                private boolean canReorder(TL_stars.SavedStarGift savedStarGift) {
                    if (!Page.this.reordering) {
                        return false;
                    }
                    if (Page.this.list == profileGiftsContainer.list) {
                        return savedStarGift != null && savedStarGift.pinned_to_top;
                    }
                    return true;
                }

                @Override
                public boolean isLongPressDragEnabled() {
                    return Page.this.reordering;
                }

                @Override
                public boolean isItemViewSwipeEnabled() {
                    return Page.this.reordering;
                }

                @Override
                public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    if (canReorder(getSavedGift(viewHolder))) {
                        return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                    }
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }

                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    ProfileGiftsView profileGiftsView;
                    Page page = Page.this;
                    if (page.list == null || !page.reordering || !canReorder(getSavedGift(viewHolder)) || !canReorder(getSavedGift(viewHolder2))) {
                        return false;
                    }
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    Page page2 = Page.this;
                    if (page2.isCollection) {
                        page2.list.reorder(adapterPosition, adapterPosition2);
                        profileGiftsContainer.collections.updateIcon(Page.this.list.collectionId);
                    } else {
                        page2.list.reorderPinned(adapterPosition, adapterPosition2);
                    }
                    Page.this.listView.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                    Page.this.listView.adapter.updateWithoutNotify();
                    if (Page.this.isCollection) {
                        profileGiftsContainer.fillTabs(true);
                    }
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if ((safeLastFragment instanceof ProfileActivity) && (profileGiftsView = ((ProfileActivity) safeLastFragment).giftsView) != null) {
                        profileGiftsView.update();
                    }
                    return true;
                }

                @Override
                public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i2) {
                    if (i2 != 0) {
                        if (Page.this.listView != null) {
                            Page.this.listView.cancelClickRunnables(false);
                        }
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    } else {
                        StarsController.GiftsList giftsList = Page.this.list;
                        if (giftsList != null) {
                            giftsList.reorderDone();
                        }
                    }
                    super.onSelectedChanged(viewHolder, i2);
                }

                @Override
                public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setPressed(false);
                }
            });
            this.reorder = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(universalRecyclerView);
            updateEmptyView();
        }

        public void bind(boolean z, StarsController.GiftsList giftsList) {
            this.isCollection = z;
            this.list = giftsList;
            if (giftsList != null) {
                giftsList.load();
            }
            update(false);
            LinearLayout linearLayout = this.emptyView2Layout;
            if (linearLayout != null) {
                linearLayout.setVisibility(this.parent.collections.isMine() ? 0 : 8);
            }
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

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setVisibleHeight(this.visibleHeight);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.list) {
                update(true);
                if (this.list == null || !isAttachedToWindow()) {
                    return;
                }
                if (!this.listView.canScrollVertically(1) || isLoadingVisible()) {
                    this.list.load();
                }
            }
        }

        private void updateEmptyView() {
            FrameLayout frameLayout = this.emptyView1;
            if (frameLayout != null) {
                removeView(frameLayout);
            }
            FrameLayout frameLayout2 = this.emptyView2;
            if (frameLayout2 != null) {
                removeView(frameLayout2);
            }
            if (this.parent.list == this.list) {
                this.emptyView2 = null;
                this.emptyView2Title = null;
                this.emptyView2Subtitle = null;
                this.emptyView2Button = null;
                this.emptyView2Layout = null;
                this.emptyView1 = new FrameLayout(getContext());
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.emptyView1Layout = linearLayout;
                linearLayout.setOrientation(1);
                this.emptyView1.addView(this.emptyView1Layout, LayoutHelper.createFrame(-2, -2, 17));
                BackupImageView backupImageView = new BackupImageView(getContext());
                backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                this.emptyView1Layout.addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 0));
                TextView textView = new TextView(getContext());
                this.emptyView1Title = textView;
                textView.setTextSize(1, 17.0f);
                this.emptyView1Title.setTypeface(AndroidUtilities.bold());
                this.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                this.emptyView1Title.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
                this.emptyView1Layout.addView(this.emptyView1Title, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
                TextView textView2 = new TextView(getContext());
                this.emptyView1Button = textView2;
                textView2.setTextSize(1, 14.0f);
                TextView textView3 = this.emptyView1Button;
                int i = Theme.key_featuredStickers_addButton;
                textView3.setTextColor(Theme.getColor(i, this.resourcesProvider));
                this.emptyView1Button.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
                this.emptyView1Button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ProfileGiftsContainer.Page.m3237$r8$lambda$r7UCm0UBKiqRUvT2lVOdhhAc0(this.f$0, view);
                    }
                });
                this.emptyView1Button.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
                this.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.1f), 4, 4));
                ScaleStateListAnimator.apply(this.emptyView1Button);
                this.emptyView1Layout.addView(this.emptyView1Button, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
                addView(this.emptyView1, LayoutHelper.createFrame(-1, -1, 119));
                this.listView.setEmptyView(this.emptyView1);
                return;
            }
            this.emptyView1 = null;
            this.emptyView1Title = null;
            this.emptyView1Button = null;
            this.emptyView1Layout = null;
            this.emptyView2 = new FrameLayout(getContext());
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.emptyView2Layout = linearLayout2;
            linearLayout2.setOrientation(1);
            this.emptyView2.addView(this.emptyView2Layout, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView4 = new TextView(getContext());
            this.emptyView2Title = textView4;
            textView4.setTextSize(1, 20.0f);
            this.emptyView2Title.setTypeface(AndroidUtilities.bold());
            this.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.emptyView2Title.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.emptyView2Layout.addView(this.emptyView2Title, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
            TextView textView5 = new TextView(getContext());
            this.emptyView2Subtitle = textView5;
            textView5.setTextSize(1, 14.0f);
            this.emptyView2Subtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
            this.emptyView2Subtitle.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.emptyView2Layout.addView(this.emptyView2Subtitle, LayoutHelper.createLinear(-2, -2, 1, 0, 10, 0, 0));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
            this.emptyView2Button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false);
            this.emptyView2Layout.addView(this.emptyView2Button, LayoutHelper.createLinear(200, 44, 1, 0, 19, 0, 12));
            this.emptyView2Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.parent.addGifts();
                }
            });
            addView(this.emptyView2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            this.listView.setEmptyView(this.emptyView2);
            LinearLayout linearLayout3 = this.emptyView2Layout;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(this.parent.collections.isMine() ? 0 : 8);
            }
        }

        public static void m3237$r8$lambda$r7UCm0UBKiqRUvT2lVOdhhAc0(Page page, View view) {
            StarsController.GiftsList giftsList = page.list;
            if (giftsList != null) {
                giftsList.resetFilters();
            }
        }

        public boolean isLoadingVisible() {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                    return true;
                }
            }
            return false;
        }

        public void setReordering(boolean z) {
            if (this.reordering == z) {
                return;
            }
            this.reordering = z;
            ProfileGiftsContainer profileGiftsContainer = this.parent;
            profileGiftsContainer.updatedReordering(profileGiftsContainer.isReordering());
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof GiftSheet.GiftCell) {
                    ((GiftSheet.GiftCell) childAt).setReordering(z, true);
                }
            }
            UniversalAdapter universalAdapter = this.listView.adapter;
            if (universalAdapter != null) {
                universalAdapter.updateWithoutNotify();
            }
            if (z) {
                final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment instanceof ProfileActivity) {
                    ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ((ProfileActivity) safeLastFragment).scrollToSharedMedia(true);
                        }
                    });
                }
            }
        }

        public void resetReordering() {
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
            boolean zCanScrollVertically = this.listView.canScrollVertically(-1);
            this.listView.adapter.update(true);
            if (!zCanScrollVertically) {
                this.listView.scrollToPosition(0);
            }
            this.parent.updateTabsY();
        }

        public float getTabsHeight() {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                if (childAt instanceof GiftSheet.GiftCell) {
                    if (childAdapterPosition == 0) {
                        return Math.max(0.0f, childAt.getY());
                    }
                } else if (childAdapterPosition == 0) {
                    return Math.max(0.0f, childAt.getY() + (childAt.getHeight() * childAt.getAlpha()));
                }
            }
            return 0.0f;
        }

        public boolean isReordering() {
            return this.reordering;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            int i;
            int i2;
            StarsController.GiftsList giftsList = this.list;
            if (giftsList == null) {
                return;
            }
            if (giftsList.hasFilters() && this.list.gifts.size() <= 0) {
                StarsController.GiftsList giftsList2 = this.list;
                if (giftsList2.endReached && !giftsList2.loading) {
                    return;
                }
            }
            StarsController.GiftsList giftsList3 = this.list;
            final int iMax = Math.max(1, (giftsList3 == null || (i2 = giftsList3.totalCount) == 0) ? 3 : Math.min(3, i2));
            StarsController.GiftsList giftsList4 = this.list;
            if (giftsList4 != null) {
                ArrayList arrayList2 = giftsList4.gifts;
                int size = arrayList2.size();
                int i3 = 0;
                loop0: while (true) {
                    i = 3;
                    while (true) {
                        if (i3 >= size) {
                            break loop0;
                        }
                        Object obj = arrayList2.get(i3);
                        i3++;
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, savedStarGift, true, false, this.isCollection).setReordering(this.reordering && (this.list != this.parent.list || savedStarGift.pinned_to_top)));
                        i--;
                        if (i == 0) {
                        }
                    }
                }
                StarsController.GiftsList giftsList5 = this.list;
                if (giftsList5.loading || !giftsList5.endReached) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= (i <= 0 ? 3 : i)) {
                            break;
                        }
                        i4++;
                        arrayList.add(UItem.asFlicker(i4, 34).setSpanCount(1));
                    }
                }
            }
            if (this.parent.list == this.list) {
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(20.0f)));
                if (this.parent.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    arrayList.add(TextFactory.asText(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), 17, 14.0f, LocaleController.getString(R.string.ProfileGiftsInfo), false, AndroidUtilities.dp(24.0f), 0));
                }
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
            } else if (!arrayList.isEmpty()) {
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
            }
            if (!arrayList.isEmpty()) {
                arrayList.add(0, UItem.asSpace(AndroidUtilities.dp(this.hasTabs ? 42.0f : 12.0f)));
            }
            if (this.listView.getSpanCount() != iMax) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.$r8$lambda$Z7amVsYW_UG8VPYOeJYnupeOwHw(this.f$0, iMax);
                    }
                });
            }
            ProfileGiftsContainer profileGiftsContainer = this.parent;
            if (profileGiftsContainer != null) {
                profileGiftsContainer.updateTabsY();
                final ProfileGiftsContainer profileGiftsContainer2 = this.parent;
                Objects.requireNonNull(profileGiftsContainer2);
                profileGiftsContainer2.post(new Runnable() {
                    @Override
                    public final void run() {
                        profileGiftsContainer2.updateTabsY();
                    }
                });
            }
        }

        public static void $r8$lambda$Z7amVsYW_UG8VPYOeJYnupeOwHw(Page page, int i) {
            UniversalRecyclerView universalRecyclerView = page.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.setSpanCount(i);
            }
        }

        public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
            if (this.list == null) {
                return;
            }
            Object obj = uItem.object;
            if (obj instanceof TL_stars.SavedStarGift) {
                final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (this.reordering) {
                    if (!this.isCollection && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z = savedStarGift.pinned_to_top;
                        boolean z2 = !z;
                        if (!z && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = this.list.getInput(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
                        }
                        if (this.list.togglePinned(savedStarGift, z2, true)) {
                            BulletinFactory.of(this.parent.fragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit)).show();
                        }
                        if (z) {
                            return;
                        }
                        this.listView.scrollToPosition(0);
                        return;
                    }
                    return;
                }
                new StarGiftSheet(getContext(), this.currentAccount, this.parent.dialogId, this.resourcesProvider).setOnGiftUpdatedListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.update(false);
                    }
                }).setOnBoughtGift(new StarGiftSheet.BoughtGiftCallback() {
                    @Override
                    public final void onBoughtGift(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z3) {
                        ProfileGiftsContainer.Page.$r8$lambda$yqZwdVAm3lL53bxx4s379M06_NY(this.f$0, savedStarGift, tL_starGiftUnique, j, z3);
                    }
                }).set(savedStarGift, this.list).show();
            }
        }

        public static void $r8$lambda$yqZwdVAm3lL53bxx4s379M06_NY(Page page, TL_stars.SavedStarGift savedStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
            page.list.gifts.remove(savedStarGift);
            page.update(true);
            if (j == UserConfig.getInstance(page.currentAccount).getClientUserId()) {
                BulletinFactory.of(page.parent.fragment).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftTitle), LocaleController.formatString(R.string.BoughtResoldGiftText, tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ','))).hideAfterBottomSheet(false).show();
            } else {
                BulletinFactory.of(page.parent.fragment).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(page.currentAccount, j))).hideAfterBottomSheet(false).show();
            }
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.getFireworksOverlay().start(true);
            }
        }

        public boolean onItemLongPress(UItem uItem, final View view, int i, float f, float f2) {
            boolean z;
            boolean z2;
            final String str;
            float f3;
            int i2 = 0;
            if (this.list == null || !(view instanceof GiftSheet.GiftCell)) {
                return false;
            }
            Object obj = uItem.object;
            if (!(obj instanceof TL_stars.SavedStarGift)) {
                return false;
            }
            final GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) view;
            final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.parent.fragment, view, true);
            ProfileGiftsContainer profileGiftsContainer = this.parent;
            profileGiftsContainer.currentMenu = itemOptionsMakeOptions;
            if (profileGiftsContainer.collections.isMine()) {
                if (!this.isCollection) {
                    this.parent.collections.getCollections().size();
                }
                final ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() {
                    @Override
                    public final void run() {
                        itemOptionsMakeOptions.closeSwipeback();
                    }
                });
                itemOptionsMakeSwipeback.addGap();
                ScrollView scrollView = new ScrollView(getContext()) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i4)), View.MeasureSpec.getMode(i4)));
                    }
                };
                LinearLayout linearLayout = new LinearLayout(getContext());
                scrollView.addView(linearLayout);
                linearLayout.setOrientation(1);
                itemOptionsMakeSwipeback.addView(scrollView, LayoutHelper.createLinear(-1, -2));
                if (this.parent.collections.getCollections().size() + 1 < MessagesController.getInstance(this.currentAccount).config.stargiftsCollectionsLimit.get()) {
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), false, false, this.resourcesProvider);
                    actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    int i3 = Theme.key_actionBarDefaultSubmenuItem;
                    f3 = 18.0f;
                    actionBarMenuSubItem.setColors(Theme.getColor(i3, this.resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
                    actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(Theme.getColor(i3, this.resourcesProvider), 0.12f));
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add);
                    actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ProfileGiftsContainer.Page.$r8$lambda$gsNSXepkzRMHwxJ28XR3xVrTcuM(this.f$0, itemOptionsMakeOptions, savedStarGift, view2);
                        }
                    });
                    linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                } else {
                    f3 = 18.0f;
                }
                ArrayList collections = this.parent.collections.getCollections();
                int size = collections.size();
                int i4 = 0;
                while (i4 < size) {
                    int i5 = i4 + 1;
                    final TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) collections.get(i4);
                    final boolean zContains = this.parent.collections.getListById(tL_starGiftCollection.collection_id).contains(savedStarGift);
                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), 2, false, false, this.resourcesProvider);
                    actionBarMenuSubItem2.setChecked(zContains);
                    actionBarMenuSubItem2.setPadding(AndroidUtilities.dp(f3), i2, AndroidUtilities.dp(f3), i2);
                    int i6 = Theme.key_actionBarDefaultSubmenuItem;
                    actionBarMenuSubItem2.setColors(Theme.getColor(i6, this.resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
                    actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(Theme.getColor(i6, this.resourcesProvider), 0.12f));
                    if (tL_starGiftCollection.icon != null) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(3, this.currentAccount, tL_starGiftCollection.icon) {
                            @Override
                            public int getIntrinsicHeight() {
                                return AndroidUtilities.dp(24.0f);
                            }

                            @Override
                            public int getIntrinsicWidth() {
                                return AndroidUtilities.dp(24.0f);
                            }
                        };
                        animatedEmojiDrawable.addViewListening(actionBarMenuSubItem2.getImageView());
                        actionBarMenuSubItem2.setTextAndIcon(tL_starGiftCollection.title, 0, animatedEmojiDrawable);
                    } else {
                        actionBarMenuSubItem2.setTextAndIcon(tL_starGiftCollection.title, R.drawable.msg_folders);
                    }
                    actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ProfileGiftsContainer.Page.$r8$lambda$IrBRExhSkIiff6P_cKay1kcH2lE(this.f$0, zContains, tL_starGiftCollection, savedStarGift, itemOptionsMakeOptions, view2);
                        }
                    });
                    linearLayout.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
                    i4 = i5;
                    i2 = 0;
                }
                itemOptionsMakeOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new Runnable() {
                    @Override
                    public final void run() {
                        itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                    }
                });
                itemOptionsMakeOptions.addGap();
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                if (this.parent.canReorder() && !this.isCollection && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                    boolean z3 = savedStarGift.pinned_to_top;
                    itemOptionsMakeOptions.add(z3 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z3 ? R.string.Gift2Unpin : R.string.Gift2Pin), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.$r8$lambda$NmMafLmZUQ_uhp7q9xhzhRGfNys(this.f$0, savedStarGift, giftCell, view);
                        }
                    });
                    itemOptionsMakeOptions.addIf(savedStarGift.pinned_to_top, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.setReordering(true);
                        }
                    });
                } else if (this.parent.canReorder() && this.isCollection) {
                    itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.setReordering(true);
                        }
                    });
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                if (starGift.slug != null) {
                    str = MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                } else {
                    str = null;
                }
                if (StarGiftSheet.isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    boolean zIsWorn = StarGiftSheet.isWorn(this.currentAccount, tL_starGiftUnique);
                    itemOptionsMakeOptions.add(zIsWorn ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(zIsWorn ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.m3227$r8$lambda$22Zu72yvascISDCaFcGuXSK9Co(this.f$0, savedStarGift);
                        }
                    });
                }
                itemOptionsMakeOptions.addIf(str != null, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.$r8$lambda$Q9jx5wy94RN0WjaZIWVsi3GGGrY(this.f$0, str);
                    }
                });
                itemOptionsMakeOptions.addIf(str != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.m3231$r8$lambda$BjZEjQRhu0EVIM2b9dGbCKJIcI(this.f$0, savedStarGift);
                    }
                });
            } else if (this.parent.canReorder() && this.isCollection) {
                itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.setReordering(true);
                    }
                });
            }
            if (StarGiftSheet.isMineWithActions(this.currentAccount, this.parent.dialogId)) {
                boolean z4 = savedStarGift.unsaved;
                itemOptionsMakeOptions.add(z4 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z4 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.m3233$r8$lambda$Cl4M4mawd6yFaa2_xBdqB_GKI8(this.f$0, savedStarGift, giftCell);
                    }
                });
            }
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                itemOptionsMakeOptions.addIf(DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(this.currentAccount).getClientUserId(), R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.m3232$r8$lambda$CehAtahLdAkMlaP_9tgjrzAew(this.f$0, savedStarGift);
                    }
                });
            }
            if (this.parent.collections.isMine() && this.isCollection) {
                int i7 = R.drawable.msg_removefolder;
                String string = LocaleController.getString(R.string.Gift2RemoveFromCollection);
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.$r8$lambda$Rq9AYj9DSvTbJ41LS_QJsaeHnQA(this.f$0, savedStarGift, itemOptionsMakeOptions);
                    }
                };
                z = true;
                z2 = false;
                itemOptionsMakeOptions.add(i7, (CharSequence) string, true, runnable).makeMultiline(false).cutTextInFancyHalf();
            } else {
                z = true;
                z2 = false;
            }
            if (itemOptionsMakeOptions.getItemsCount() <= 0) {
                return z2;
            }
            itemOptionsMakeOptions.setGravity(5);
            itemOptionsMakeOptions.setBlur(z);
            itemOptionsMakeOptions.allowMoveScrim();
            Point point = AndroidUtilities.displaySize;
            int iMin = Math.min(point.x, point.y);
            itemOptionsMakeOptions.animateToSize(iMin - AndroidUtilities.dp(32.0f), (int) (iMin * 0.6f));
            itemOptionsMakeOptions.hideScrimUnder();
            itemOptionsMakeOptions.forceBottom(true);
            itemOptionsMakeOptions.show();
            giftCell.imageView.getImageReceiver().startAnimation(true);
            return true;
        }

        public static void $r8$lambda$gsNSXepkzRMHwxJ28XR3xVrTcuM(final Page page, ItemOptions itemOptions, final TL_stars.SavedStarGift savedStarGift, View view) {
            page.getClass();
            itemOptions.dismiss();
            page.parent.openEnterNameAlert(null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ProfileGiftsContainer.Page page2 = this.f$0;
                    page2.parent.collections.createCollection((String) obj, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            ProfileGiftsContainer.Page.$r8$lambda$LVzc1fU4JWmf4dww4iE92nc8t0U(page2, savedStarGift, (TL_stars.TL_starGiftCollection) obj2);
                        }
                    });
                }
            });
        }

        public static void $r8$lambda$LVzc1fU4JWmf4dww4iE92nc8t0U(Page page, TL_stars.SavedStarGift savedStarGift, TL_stars.TL_starGiftCollection tL_starGiftCollection) {
            page.parent.collections.addGift(tL_starGiftCollection.collection_id, savedStarGift, true);
            page.parent.fillTabs(true);
            ViewPagerFixed.TabsView tabsView = page.parent.tabsView;
            int i = tL_starGiftCollection.collection_id;
            tabsView.scrollToTab(i, page.parent.collections.indexOf(i) + 1);
            if (page.parent.fragment instanceof ProfileActivity) {
                ((ProfileActivity) page.parent.fragment).scrollToSharedMedia(true);
            }
            page.parent.updateTabsShown(true);
            BulletinFactory.of(page.parent.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollection.title))).show();
        }

        public static void $r8$lambda$IrBRExhSkIiff6P_cKay1kcH2lE(Page page, boolean z, TL_stars.TL_starGiftCollection tL_starGiftCollection, TL_stars.SavedStarGift savedStarGift, ItemOptions itemOptions, View view) {
            if (!z) {
                page.parent.collections.addGift(tL_starGiftCollection.collection_id, savedStarGift, true);
                BulletinFactory.of(page.parent.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollection.title))).show();
            } else {
                page.parent.collections.removeGift(tL_starGiftCollection.collection_id, savedStarGift);
                BulletinFactory.of(page.parent.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollection.title))).show();
            }
            itemOptions.dismiss();
            page.parent.updateTabsShown(true);
        }

        public static void $r8$lambda$NmMafLmZUQ_uhp7q9xhzhRGfNys(final Page page, TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell, final View view) {
            page.getClass();
            if (savedStarGift.unsaved) {
                savedStarGift.unsaved = false;
                giftCell.setStarsGift(savedStarGift, true, false);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = page.list.getInput(savedStarGift);
                savestargift.unsave = savedStarGift.unsaved;
                ConnectionsManager.getInstance(page.currentAccount).sendRequest(savestargift, null, 64);
            }
            boolean z = savedStarGift.pinned_to_top;
            final boolean z2 = !z;
            if (page.list.togglePinned(savedStarGift, z2, false)) {
                new UnpinSheet(page.getContext(), page.parent.dialogId, savedStarGift, page.resourcesProvider, new Utilities.Callback0Return() {
                    @Override
                    public final Object run() {
                        return ProfileGiftsContainer.Page.m3234$r8$lambda$E5J4QxWroAcuPvxCjutkkaJKVY(this.f$0, view, z2);
                    }
                }).show();
                return;
            }
            if (!z) {
                BulletinFactory.of(page.parent.fragment).createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)).show();
            } else {
                BulletinFactory.of(page.parent.fragment).createSimpleBulletin(R.raw.ic_unpin, LocaleController.getString(R.string.Gift2Unpinned)).show();
            }
            ((GiftSheet.GiftCell) view).setPinned(z2, true);
            page.listView.scrollToPosition(0);
        }

        public static BulletinFactory m3234$r8$lambda$E5J4QxWroAcuPvxCjutkkaJKVY(Page page, View view, boolean z) {
            page.getClass();
            ((GiftSheet.GiftCell) view).setPinned(z, true);
            page.listView.scrollToPosition(0);
            return BulletinFactory.of(page.parent.fragment);
        }

        public static void m3227$r8$lambda$22Zu72yvascISDCaFcGuXSK9Co(Page page, TL_stars.SavedStarGift savedStarGift) {
            page.getClass();
            new StarGiftSheet(page.getContext(), page.currentAccount, page.parent.dialogId, page.resourcesProvider) {
                @Override
                public BulletinFactory getBulletinFactory() {
                    return BulletinFactory.of(Page.this.parent.fragment);
                }
            }.set(savedStarGift, (StarsController.IGiftsList) null).toggleWear(false);
        }

        public static void $r8$lambda$Q9jx5wy94RN0WjaZIWVsi3GGGrY(Page page, String str) {
            page.getClass();
            AndroidUtilities.addToClipboard(str);
            BulletinFactory.of(page.parent.fragment).createCopyLinkBulletin(false).show();
        }

        public static void m3231$r8$lambda$BjZEjQRhu0EVIM2b9dGbCKJIcI(Page page, TL_stars.SavedStarGift savedStarGift) {
            page.getClass();
            new StarGiftSheet(page.getContext(), page.currentAccount, page.parent.dialogId, page.resourcesProvider) {
                @Override
                public BulletinFactory getBulletinFactory() {
                    return BulletinFactory.of(Page.this.parent.fragment);
                }
            }.set(savedStarGift, (StarsController.IGiftsList) null).onSharePressed(null);
        }

        public static void m3233$r8$lambda$Cl4M4mawd6yFaa2_xBdqB_GKI8(Page page, TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell) {
            if (!page.isCollection && savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                giftCell.setPinned(false, true);
                page.list.togglePinned(savedStarGift, false, false);
            }
            savedStarGift.unsaved = !savedStarGift.unsaved;
            giftCell.setStarsGift(savedStarGift, true, page.isCollection);
            page.parent.collections.updateGiftsUnsaved(savedStarGift, savedStarGift.unsaved);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = page.list.getInput(savedStarGift);
            savestargift.unsave = savedStarGift.unsaved;
            ConnectionsManager.getInstance(page.currentAccount).sendRequest(savestargift, null);
        }

        public static void m3232$r8$lambda$CehAtahLdAkMlaP_9tgjrzAew(Page page, TL_stars.SavedStarGift savedStarGift) {
            page.getClass();
            new StarGiftSheet(page.getContext(), page.currentAccount, page.parent.dialogId, page.resourcesProvider) {
                @Override
                public BulletinFactory getBulletinFactory() {
                    return BulletinFactory.of(Page.this.parent.fragment);
                }
            }.set(savedStarGift, (StarsController.IGiftsList) null).openTransfer();
        }

        public static void $r8$lambda$Rq9AYj9DSvTbJ41LS_QJsaeHnQA(Page page, TL_stars.SavedStarGift savedStarGift, ItemOptions itemOptions) {
            page.parent.collections.removeGift(page.list.collectionId, savedStarGift);
            itemOptions.dismiss();
            page.parent.updateTabsShown(true);
            TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = page.parent.collections.findById(page.list.collectionId);
            if (tL_starGiftCollectionFindById != null) {
                BulletinFactory.of(page.parent.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollectionFindById.title))).show();
            }
        }

        public void updateColors() {
            if (this.emptyView1 != null) {
                this.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                TextView textView = this.emptyView1Button;
                int i = Theme.key_featuredStickers_addButton;
                textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
                this.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.1f), 4, 4));
                return;
            }
            this.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.emptyView2Subtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
            this.emptyView2Button.updateColors();
        }
    }

    public boolean canScroll(boolean z) {
        if (z) {
            return this.viewPager.getCurrentPosition() >= this.collections.getCollections().size();
        }
        return this.viewPager.getCurrentPosition() <= 0;
    }

    public ProfileGiftsContainer(final BaseFragment baseFragment, final Context context, final int i, long j, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        String string;
        int i3;
        TLRPC.EncryptedChat encryptedChat;
        super(context);
        this.checkboxRequestId = -1;
        this.sendCollectionsOrder = new Runnable() {
            @Override
            public final void run() {
                this.f$0.collections.sendOrder();
            }
        };
        this.animatorBottomButtonVisibility = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i4, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i4, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i4, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.updateButton();
            }
        }, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, true);
        this.visibleHeight = AndroidUtilities.displaySize.y;
        this.fragment = baseFragment;
        this.currentAccount = i;
        if (DialogObject.isEncryptedDialog(j) && (encryptedChat = MessagesController.getInstance(i).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
            this.dialogId = encryptedChat.user_id;
        } else {
            this.dialogId = j;
        }
        StarsController.getInstance(i).invalidateProfileGifts(this.dialogId);
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(i).getProfileGiftsList(this.dialogId);
        this.list = profileGiftsList;
        StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(i).getProfileGiftCollectionsList(this.dialogId, true);
        this.collections = profileGiftCollectionsList;
        profileGiftCollectionsList.all = profileGiftsList;
        profileGiftsList.shown = true;
        if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).openGiftsUpgradable) {
            profileGiftsList.setFilters(4);
        } else {
            profileGiftsList.resetFilters();
        }
        profileGiftsList.load();
        this.resourcesProvider = resourcesProvider;
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                ProfileGiftsContainer.this.updateButton();
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).updateSelectedMediaTabText();
                }
                ProfileGiftsContainer.this.updateTabsY();
            }

            @Override
            protected void onTabScrollEnd(int i4) {
                super.onTabScrollEnd(i4);
                ProfileGiftsContainer.this.updateButton();
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).updateSelectedMediaTabText();
                }
            }

            @Override
            protected boolean canScroll(MotionEvent motionEvent) {
                return !ProfileGiftsContainer.this.isReordering();
            }

            @Override
            protected void addMoreTabs() {
                if (!ProfileGiftsContainer.this.canAdd() || ProfileGiftsContainer.this.tabsView == null) {
                    return;
                }
                if (ProfileGiftsContainer.this.addCollectionTabText == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ " + LocaleController.getString(R.string.Gift2NewCollection));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
                    coloredImageSpan.spaceScaleX = 0.8f;
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                    ProfileGiftsContainer.this.addCollectionTabText = spannableStringBuilder;
                }
                ProfileGiftsContainer.this.tabsView.addTab(-1, ProfileGiftsContainer.this.addCollectionTabText);
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public boolean canReorder(int i4) {
                return i4 != 0;
            }

            @Override
            public int getItemViewType(int i4) {
                return i4 == 0 ? 0 : 1;
            }

            @Override
            public int getItemCount() {
                return ProfileGiftsContainer.this.collections.getCollections().size() + 1;
            }

            @Override
            public View createView(int i4) {
                if (i4 == -1) {
                    return null;
                }
                return new Page(ProfileGiftsContainer.this, i, resourcesProvider);
            }

            @Override
            public int getItemId(int i4) {
                if (i4 == 0) {
                    return -2;
                }
                return ((TL_stars.TL_starGiftCollection) ProfileGiftsContainer.this.collections.getCollections().get(i4 - 1)).collection_id;
            }

            @Override
            public void bindView(View view, int i4, int i5) {
                StarsController.GiftsList listByIndex;
                boolean z;
                Page page = (Page) view;
                if (i5 == 0) {
                    listByIndex = ProfileGiftsContainer.this.list;
                    z = false;
                } else {
                    listByIndex = ProfileGiftsContainer.this.collections.getListByIndex(i4 - 1);
                    z = true;
                }
                page.bind(z, listByIndex);
                page.setVisibleHeight(ProfileGiftsContainer.this.visibleHeight);
                page.setHasTabs(!ProfileGiftsContainer.this.collections.getCollections().isEmpty());
            }

            @Override
            public CharSequence getItemTitle(int i4) {
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
            public void applyReorder(ArrayList arrayList) {
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
                ProfileGiftsContainer.this.collections.reorder(arrayList2);
                Page currentPage = ProfileGiftsContainer.this.getCurrentPage();
                if (currentPage != null) {
                    int iIndexOf = currentPage.isCollection ? ProfileGiftsContainer.this.collections.indexOf(currentPage.list.collectionId) + 1 : 0;
                    ProfileGiftsContainer.this.tabsView.selectTab(iIndexOf, iIndexOf, 0.0f);
                }
                AndroidUtilities.cancelRunOnUIThread(ProfileGiftsContainer.this.sendCollectionsOrder);
                AndroidUtilities.runOnUIThread(ProfileGiftsContainer.this.sendCollectionsOrder, 1000L);
            }
        });
        addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.TabsView tabsViewCreateTabsView = viewPagerFixed.createTabsView(true, 10);
        this.tabsView = tabsViewCreateTabsView;
        tabsViewCreateTabsView.setColors(Theme.key_profile_tabSelectedLine, Theme.key_windowBackgroundWhiteBlackText, Theme.key_profile_tabText, Theme.key_profile_tabSelector, Theme.key_actionBarDefault);
        tabsViewCreateTabsView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tabsViewCreateTabsView.setClipToPadding(false);
        tabsViewCreateTabsView.tabMarginDp = 12;
        tabsViewCreateTabsView.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                return ProfileGiftsContainer.m3226$r8$lambda$nqMuvew_6VlglUV0Nu5O9lHCPo(this.f$0, (Integer) obj, (Integer) obj2);
            }
        });
        tabsViewCreateTabsView.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                return ProfileGiftsContainer.$r8$lambda$iNCuUGGvJ_hcvtZVhlYkighZiNw(this.f$0, i, baseFragment, context, resourcesProvider, (Integer) obj, (View) obj2);
            }
        });
        addView(tabsViewCreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        int i4 = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.setColor(Theme.getColor(i4, resourcesProvider));
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        ProfileActivity.Button2 button2 = new ProfileActivity.Button2(context);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(button2, new BlurredBackgroundColorProviderThemed(resourcesProvider, i4));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(22.0f));
        button2.setBackground(blurredBackgroundDrawableCreate);
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
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        button2.addView(linearLayout, LayoutHelper.createFrame(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ProfileGiftsContainer.$r8$lambda$knJkllwhqy7jjL3FgBDFE0n1qwE(this.f$0, baseFragment, i, view);
            }
        });
        Boolean bool = profileGiftsList.chat_notifications_enabled;
        if (bool != null) {
            checkBox2.setChecked(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(this.dialogId));
        final boolean z = this.dialogId < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb = new StringBuilder();
        sb.append("G ");
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
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ " + LocaleController.getString(R.string.ProfileGiftsAdd));
            spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_add_album), 0, 1, 33);
            this.addGiftsText = spannableStringBuilder2;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
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
                    ProfileGiftsContainer.m3216$r8$lambda$5u9VbnJFYji5X9X63yk70xCBNk(this.f$0, z, i, view);
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
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("+ " + LocaleController.getString(R.string.ProfileGiftsAdd));
        spannableStringBuilder4.setSpan(new ColoredImageSpan(R.drawable.filled_add_album), 0, 1, 33);
        this.addGiftsText = spannableStringBuilder4;
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
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
                ProfileGiftsContainer.m3216$r8$lambda$5u9VbnJFYji5X9X63yk70xCBNk(this.f$0, z, i, view);
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

    public static Boolean m3226$r8$lambda$nqMuvew_6VlglUV0Nu5O9lHCPo(ProfileGiftsContainer profileGiftsContainer, Integer num, Integer num2) {
        profileGiftsContainer.resetReordering();
        if (num.intValue() == -1) {
            profileGiftsContainer.createCollection();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static Boolean $r8$lambda$iNCuUGGvJ_hcvtZVhlYkighZiNw(final ProfileGiftsContainer profileGiftsContainer, final int i, final BaseFragment baseFragment, final Context context, final Theme.ResourcesProvider resourcesProvider, Integer num, View view) {
        final TL_stars.TL_starGiftCollection tL_starGiftCollection;
        profileGiftsContainer.getClass();
        final int i2 = -1;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || profileGiftsContainer.reorderingCollections) {
            return Boolean.FALSE;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= profileGiftsContainer.collections.getCollections().size()) {
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) profileGiftsContainer.collections.getCollections().get(i3)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) profileGiftsContainer.collections.getCollections().get(i3);
                i2 = i3;
                break;
            }
            i3++;
        }
        final String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i).getUserOrChat(profileGiftsContainer.dialogId));
        boolean zIsMine = profileGiftsContainer.collections.isMine();
        if (TextUtils.isEmpty(publicUsername) && !zIsMine) {
            return Boolean.FALSE;
        }
        ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(baseFragment, view).setScrimViewBackground(new Drawable() {
            private final Drawable bg;
            private final Rect bgBounds = new Rect();

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            {
                this.bg = Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), ProfileGiftsContainer.this.backgroundColor);
            }

            @Override
            public void draw(Canvas canvas) {
                this.bgBounds.set(getBounds());
                this.bgBounds.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                this.bg.setBounds(this.bgBounds);
                this.bg.draw(canvas);
            }

            @Override
            public void setAlpha(int i4) {
                this.bg.setAlpha(i4);
            }
        }).addIf(zIsMine, R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new Runnable() {
            @Override
            public final void run() {
                this.f$0.addGifts();
            }
        }).addIf(!TextUtils.isEmpty(publicUsername), R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.$r8$lambda$ItGKC0q6jYyNj8CmF3DK6YWucmM(this.f$0, i, publicUsername, tL_starGiftCollection, context, resourcesProvider, baseFragment);
            }
        }).addIf(zIsMine, R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.$r8$lambda$pbVQKPliF9W73NVDudVT3BJDA4U(this.f$0, tL_starGiftCollection);
            }
        }).addIf(zIsMine, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new Runnable() {
            @Override
            public final void run() {
                this.f$0.setReorderingCollections(true);
            }
        }).addIf(zIsMine, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Gift2CollectionsDelete), true, new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.$r8$lambda$Io6EIMLsRSpnqPtoHV2mKImOUKo(this.f$0, i2, tL_starGiftCollection);
            }
        });
        profileGiftsContainer.currentMenu = itemOptionsAddIf;
        itemOptionsAddIf.show();
        return Boolean.TRUE;
    }

    public static void $r8$lambda$ItGKC0q6jYyNj8CmF3DK6YWucmM(ProfileGiftsContainer profileGiftsContainer, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, Theme.ResourcesProvider resourcesProvider, final BaseFragment baseFragment) {
        profileGiftsContainer.getClass();
        String str2 = MessagesController.getInstance(i).linkPrefix + "/" + str + "/c/" + tL_starGiftCollection.collection_id;
        new ShareAlert(context, null, str2, false, str2, false, resourcesProvider) {
            @Override
            protected void onSend(LongSparseArray longSparseArray, int i2, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
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

    public static void $r8$lambda$pbVQKPliF9W73NVDudVT3BJDA4U(final ProfileGiftsContainer profileGiftsContainer, final TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        profileGiftsContainer.getClass();
        profileGiftsContainer.openEnterNameAlert(tL_starGiftCollection.title, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer.m3224$r8$lambda$ln7RHkliEqD8aJkdyIHSL50q5Y(this.f$0, tL_starGiftCollection, (String) obj);
            }
        });
    }

    public static void m3224$r8$lambda$ln7RHkliEqD8aJkdyIHSL50q5Y(ProfileGiftsContainer profileGiftsContainer, TL_stars.TL_starGiftCollection tL_starGiftCollection, String str) {
        profileGiftsContainer.collections.rename(tL_starGiftCollection.collection_id, str);
        tL_starGiftCollection.title = str;
        profileGiftsContainer.fillTabs(true);
    }

    public static void $r8$lambda$Io6EIMLsRSpnqPtoHV2mKImOUKo(ProfileGiftsContainer profileGiftsContainer, int i, TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        if (i == -1) {
            profileGiftsContainer.getClass();
            return;
        }
        profileGiftsContainer.collections.removeCollection(tL_starGiftCollection.collection_id);
        profileGiftsContainer.fillTabs(true);
        ViewPagerFixed.TabsView tabsView = profileGiftsContainer.tabsView;
        if (i < profileGiftsContainer.collections.getCollections().size()) {
            i++;
        }
        tabsView.scrollToTab(-1, i);
        profileGiftsContainer.updateTabsShown(true);
    }

    public static void $r8$lambda$knJkllwhqy7jjL3FgBDFE0n1qwE(final ProfileGiftsContainer profileGiftsContainer, final BaseFragment baseFragment, int i, View view) {
        CheckBox2 checkBox2 = profileGiftsContainer.checkbox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        boolean zIsChecked = profileGiftsContainer.checkbox.isChecked();
        BulletinFactory.of(baseFragment).createSimpleBulletinDetail(zIsChecked ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(zIsChecked ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).show();
        profileGiftsContainer.list.chat_notifications_enabled = Boolean.valueOf(zIsChecked);
        if (profileGiftsContainer.checkboxRequestId >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(profileGiftsContainer.checkboxRequestId, true);
            profileGiftsContainer.checkboxRequestId = -1;
        }
        TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
        togglechatstargiftnotifications.peer = MessagesController.getInstance(i).getInputPeer(profileGiftsContainer.dialogId);
        togglechatstargiftnotifications.enabled = zIsChecked;
        ConnectionsManager.getInstance(i).sendRequest(togglechatstargiftnotifications, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ProfileGiftsContainer.$r8$lambda$z8BNUWEdK7MuTk_xgGllt0lhCyA(this.f$0, baseFragment, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$z8BNUWEdK7MuTk_xgGllt0lhCyA(final ProfileGiftsContainer profileGiftsContainer, final BaseFragment baseFragment, TLObject tLObject, final TLRPC.TL_error tL_error) {
        profileGiftsContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.$r8$lambda$RLwQZlri75BAIVuT550QNAMFLlE(this.f$0, tL_error, baseFragment);
            }
        });
    }

    public static void $r8$lambda$RLwQZlri75BAIVuT550QNAMFLlE(ProfileGiftsContainer profileGiftsContainer, TLRPC.TL_error tL_error, BaseFragment baseFragment) {
        profileGiftsContainer.checkboxRequestId = -1;
        if (tL_error != null) {
            BulletinFactory.of(baseFragment).showForError(tL_error);
        }
    }

    public static void m3216$r8$lambda$5u9VbnJFYji5X9X63yk70xCBNk(ProfileGiftsContainer profileGiftsContainer, boolean z, int i, View view) {
        if (profileGiftsContainer.collections.isMine() && profileGiftsContainer.viewPager.getCurrentPosition() != 0) {
            profileGiftsContainer.addGifts();
        } else if (z) {
            new GiftSheet(profileGiftsContainer.getContext(), i, profileGiftsContainer.dialogId, null, null).setBirthday(BirthdayController.getInstance(i).isToday(profileGiftsContainer.dialogId)).show();
        } else {
            UserSelectorBottomSheet.open(2, 0L, BirthdayController.getInstance(i).getState());
        }
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

    public float getTabsHeight() {
        float translationX = 0.0f;
        if (this.viewPager.getViewPages() != null) {
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    translationX += (1.0f - (view.getTranslationX() / view.getWidth())) * ((Page) view).getTabsHeight();
                }
            }
        }
        return translationX;
    }

    private float hasTabs() {
        float f;
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
        return MathUtils.clamp(f, 0.0f, 1.0f);
    }

    public void updateTabsY() {
        if (this.tabsView == null) {
            return;
        }
        float fMin = Math.min(this.externalPaddingTop, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(fMin - this.externalPaddingTop, -AndroidUtilities.dp(42.0f), 0.0f));
        float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp01);
        this.tabsView.setTranslationY(fMin);
        this.tabsView.setScaleX(fLerp);
        this.tabsView.setScaleY(fLerp);
        this.tabsView.setAlpha(fClamp01 * hasTabs());
    }

    public float getTabsVisibility() {
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        if (tabsView != null) {
            return tabsView.getAlpha();
        }
        return 0.0f;
    }

    public boolean isReordering() {
        if (this.reorderingCollections) {
            return true;
        }
        Page currentPage = getCurrentPage();
        return currentPage != null && currentPage.isReordering();
    }

    public void setReordering(boolean z) {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z);
        }
    }

    public void scrollToCollectionId(int i) {
        this.pendingScrollToCollectionId = i;
        checkScrollToCollection();
    }

    private void checkScrollToCollection() {
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

    public void setReorderingCollections(boolean z) {
        if (this.reorderingCollections == z) {
            return;
        }
        this.reorderingCollections = z;
        updatedReordering(isReordering());
        this.tabsView.setReordering(z);
        if (z) {
            final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment instanceof ProfileActivity) {
                ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ((ProfileActivity) safeLastFragment).scrollToSharedMedia(true);
                    }
                });
            }
        }
        if (z) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.sendCollectionsOrder);
        AndroidUtilities.runOnUIThread(this.sendCollectionsOrder);
    }

    public void resetReordering() {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.resetReordering();
        }
        setReorderingCollections(false);
    }

    public boolean canAdd() {
        return this.collections.isMine() && this.collections.getCollections().size() < MessagesController.getInstance(this.currentAccount).config.stargiftsCollectionsLimit.get();
    }

    private boolean shouldHideButton(int i) {
        StarsController.GiftsList listByIndex;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.collections.getCollections().size() || (listByIndex = this.collections.getListByIndex(i2)) == null) {
            return true;
        }
        return listByIndex.gifts.isEmpty();
    }

    public void updateButton() {
        float currentPositionAlpha;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null) {
            return;
        }
        if (viewPagerFixed.getCurrentPosition() == this.viewPager.getNextPosition()) {
            currentPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (shouldHideButton(this.viewPager.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            currentPositionAlpha = (((shouldHideButton(this.viewPager.getCurrentPosition()) ? 1.0f : 0.0f) * this.viewPager.getCurrentPositionAlpha()) + ((shouldHideButton(this.viewPager.getNextPosition()) ? 1.0f : 0.0f) * this.viewPager.getNextPositionAlpha())) * (AndroidUtilities.dp(68.0f) + 2);
        }
        float fDp = currentPositionAlpha + ((((-this.buttonContainer.getTop()) + this.visibleHeight) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1);
        this.animatorBottomButtonVisibility.setValue(this.visibleHeight > AndroidUtilities.dp(184.0f), true);
        float floatValue = this.animatorBottomButtonVisibility.getFloatValue();
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + fDp, fDp, floatValue);
        this.bulletinContainer.setTranslationY(fLerp - AndroidUtilities.dp(200.0f));
        this.buttonContainer.setTranslationY(fLerp - this.buttonContainerOffset);
        this.buttonContainer.setAlpha(floatValue);
        this.buttonContainer.setVisibility(floatValue <= 0.0f ? 4 : 0);
        this.button.setText((!this.collections.isMine() || this.viewPager.getPositionAnimated() < 0.5f) ? this.sendGiftsToFriendsText : this.addGiftsText, true);
        Bulletin.updateCurrentPosition();
    }

    public void setButtonOffset(int i) {
        if (this.buttonContainerOffset != i) {
            this.buttonContainerOffset = i;
            updateButton();
        }
    }

    public int getBottomOffset() {
        float translationY = this.buttonContainer.getTranslationY() - ((((-this.buttonContainer.getTop()) + Math.max(AndroidUtilities.dp(240.0f), this.visibleHeight)) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1);
        if (this.visibleHeight < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.visibleHeight, AndroidUtilities.dp(this.buttonContainerHeightDp));
        }
        return (int) (AndroidUtilities.dp(this.buttonContainerHeightDp) - translationY);
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

    public boolean canSwitchNotify() {
        return this.dialogId < 0 && this.list.chat_notifications_enabled != null;
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
            fillTabs(true);
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

    public Page getCurrentPage() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (Page) currentView;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.update(false);
        }
        fillTabs(false);
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
    protected void onDetachedFromWindow() {
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

    public StarsController.GiftsList getCurrentList() {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.list;
        }
        return this.list;
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
        Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(this.dialogId));
        if (this.list.gifts.isEmpty()) {
            return (!this.list.loading || (charSequence = (CharSequence) cachedLastEmojis.get(pair)) == null) ? "" : charSequence;
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

    public RecyclerListView getCurrentListView() {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.listView;
        }
        return null;
    }

    public static class TextFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new TextFactory());
        }

        @Override
        public LinkSpanDrawable.LinksTextView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new LinkSpanDrawable.LinksTextView(context) {
                @Override
                protected void onMeasure(int i3, int i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
                }
            };
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) view;
            linksTextView.setGravity(uItem.intValue);
            linksTextView.setTextColor((int) uItem.longValue);
            linksTextView.setTextSize(1, uItem.floatValue);
            linksTextView.setTypeface(uItem.accent ? AndroidUtilities.bold() : null);
            int i = uItem.pad;
            linksTextView.setPadding(i, 0, i, uItem.iconResId);
            linksTextView.setText(uItem.text);
        }

        public static UItem asText(int i, int i2, float f, CharSequence charSequence, boolean z, int i3, int i4) {
            UItem uItemOfFactory = UItem.ofFactory(TextFactory.class);
            uItemOfFactory.text = charSequence;
            uItemOfFactory.intValue = i2;
            uItemOfFactory.longValue = i;
            uItemOfFactory.floatValue = f;
            uItemOfFactory.pad = i3;
            uItemOfFactory.iconResId = i4;
            uItemOfFactory.accent = z;
            return uItemOfFactory;
        }
    }

    public void updateColors() {
        this.button.updateColors();
        this.button.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(19.0f), processColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider))));
        View[] viewPages = this.viewPager.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    ((Page) view).updateColors();
                }
            }
        }
        this.checkboxTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        this.checkboxLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 24, 24));
    }

    public static class UnpinSheet extends BottomSheet {
        long selectedGift;

        public UnpinSheet(Context context, long j, final TL_stars.SavedStarGift savedStarGift, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback0Return callback0Return) {
            super(context, false, resourcesProvider);
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
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            final StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(j);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ProfileGiftsContainer.UnpinSheet.$r8$lambda$H2kIg_bpVwz0vNtLLQ9jICs4F9g(this.f$0, profileGiftsList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ProfileGiftsContainer.UnpinSheet.$r8$lambda$LhIG8GHn3VvY_40ORQaJjKX6EAs(this.f$0, buttonWithCounterView, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null, resourcesProvider) {
                @Override
                public Integer getSelectorColor(int i) {
                    return 0;
                }
            };
            universalRecyclerView.setSpanCount(3);
            universalRecyclerView.setOverScrollMode(2);
            universalRecyclerView.setScrollEnabled(false);
            linearLayout.addView(universalRecyclerView, LayoutHelper.createLinear(-1, -2, 11.0f, 0.0f, 11.0f, 0.0f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2UnpinAlertButton), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 22.0f, 9.0f, 22.0f, 9.0f));
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ProfileGiftsContainer.UnpinSheet.$r8$lambda$6pIFgVTl_FsF9f0TO8OvnwRE7lc(this.f$0, profileGiftsList, savedStarGift, callback0Return, view);
                }
            });
            setCustomView(linearLayout);
        }

        public static void $r8$lambda$H2kIg_bpVwz0vNtLLQ9jICs4F9g(UnpinSheet unpinSheet, StarsController.GiftsList giftsList, ArrayList arrayList, UniversalAdapter universalAdapter) {
            unpinSheet.getClass();
            ArrayList arrayList2 = giftsList.gifts;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift.pinned_to_top) {
                    arrayList.add(PeerColorActivity.GiftCell.Factory.asGiftCell(savedStarGift).setChecked(unpinSheet.selectedGift == savedStarGift.gift.id).setSpanCount(1));
                }
            }
        }

        public static void $r8$lambda$LhIG8GHn3VvY_40ORQaJjKX6EAs(UnpinSheet unpinSheet, ButtonWithCounterView buttonWithCounterView, UItem uItem, View view, Integer num, Float f, Float f2) {
            unpinSheet.getClass();
            long j = ((TL_stars.SavedStarGift) uItem.object).gift.id;
            if (unpinSheet.selectedGift == j) {
                unpinSheet.selectedGift = 0L;
            } else {
                unpinSheet.selectedGift = j;
            }
            buttonWithCounterView.setEnabled(unpinSheet.selectedGift != 0);
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof PeerColorActivity.GiftCell) {
                        PeerColorActivity.GiftCell giftCell = (PeerColorActivity.GiftCell) childAt;
                        giftCell.setSelected(unpinSheet.selectedGift == giftCell.getGiftId(), true);
                    }
                }
            }
        }

        public static void $r8$lambda$6pIFgVTl_FsF9f0TO8OvnwRE7lc(UnpinSheet unpinSheet, StarsController.GiftsList giftsList, TL_stars.SavedStarGift savedStarGift, Utilities.Callback0Return callback0Return, View view) {
            TL_stars.SavedStarGift savedStarGift2;
            unpinSheet.getClass();
            ArrayList pinned = giftsList.getPinned();
            int i = 0;
            while (true) {
                if (i >= pinned.size()) {
                    i = -1;
                    savedStarGift2 = null;
                    break;
                } else {
                    if (((TL_stars.SavedStarGift) pinned.get(i)).gift.id == unpinSheet.selectedGift) {
                        savedStarGift2 = (TL_stars.SavedStarGift) pinned.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (savedStarGift2 == null) {
                return;
            }
            savedStarGift2.pinned_to_top = false;
            pinned.set(i, savedStarGift);
            savedStarGift.pinned_to_top = true;
            giftsList.setPinned(pinned);
            unpinSheet.dismiss();
            ((BulletinFactory) callback0Return.run()).createSimpleBulletin(R.raw.ic_pin, LocaleController.formatString(R.string.Gift2ReplacedPinTitle, StarGiftSheet.getGiftName(savedStarGift.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, StarGiftSheet.getGiftName(savedStarGift2.gift))).show();
        }
    }

    public void openEnterNameAlert(String str, final Utilities.Callback callback) {
        ActionBarPopupWindow actionBarPopupWindow;
        Context context = getContext();
        final Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, this.resourcesProvider);
        if (str != null) {
            builder.setTitle(LocaleController.getString(R.string.Gift2EditCollectionNameTitle));
        } else {
            builder.setTitle(LocaleController.getString(R.string.Gift2NewCollectionTitle));
            builder.setMessage(LocaleController.getString(R.string.Gift2NewCollectionText));
        }
        final EditTextCaption editTextCaption = new EditTextCaption(context, this.resourcesProvider) {
            AnimatedTextView.AnimatedTextDrawable limit;
            AnimatedColor limitColor = new AnimatedColor(this);
            private int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.limit.setTextSize(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.setGravity(5);
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }

            @Override
            protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.onTextChanged(charSequence, i, i2, i3);
                if (this.limit != null) {
                    this.limitCount = 12 - charSequence.length();
                    this.limit.cancelAnimation();
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                    String str2 = "";
                    if (this.limitCount <= 4) {
                        str2 = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str2);
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, ProfileGiftsContainer.this.resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getScrollX() + getWidth(), getHeight());
                this.limit.draw(canvas);
            }
        };
        editTextCaption.lineYFix = true;
        editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                String string = editTextCaption.getText().toString();
                if (string.length() <= 0 || string.length() > 12) {
                    AndroidUtilities.shakeView(editTextCaption);
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
        editTextCaption.setTextSize(1, 18.0f);
        editTextCaption.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        editTextCaption.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, this.resourcesProvider));
        editTextCaption.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        editTextCaption.setFocusable(true);
        editTextCaption.setInputType(147457);
        editTextCaption.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, this.resourcesProvider));
        editTextCaption.setImeOptions(6);
        editTextCaption.setBackgroundDrawable(null);
        editTextCaption.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        editTextCaption.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!this.ignoreTextChange && editable.length() > 12) {
                    this.ignoreTextChange = true;
                    editable.delete(12, editable.length());
                    AndroidUtilities.shakeView(editTextCaption);
                    try {
                        editTextCaption.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        editTextCaption.setText(str);
        linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        builder.setPositiveButton(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                ProfileGiftsContainer.$r8$lambda$HGXLJ2bQdDYNtuoDGUnONnEuUXI(editTextCaption, callback, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        alertDialogArr[0] = builder.create();
        ItemOptions itemOptions = this.currentMenu;
        if (itemOptions != null && (actionBarPopupWindow = itemOptions.actionBarPopupWindow) != null) {
            actionBarPopupWindow.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(activityFindActivity, this.fragment.getClassGuid());
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileGiftsContainer.$r8$lambda$KpN26ErhhEMNb2M5wC34bqmpPN0(this.f$0, editTextCaption, activityFindActivity, dialogInterface);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                ProfileGiftsContainer.m3222$r8$lambda$Y_hy7wxb_R6l3jqf9bz9a6WDA(editTextCaption, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        alertDialogArr[0].setDismissDialogByButtons(false);
        boolean z = alertDialogArr[0].getButton(-1) instanceof TextView;
        editTextCaption.setSelection(editTextCaption.getText().length());
    }

    public static void $r8$lambda$HGXLJ2bQdDYNtuoDGUnONnEuUXI(EditTextCaption editTextCaption, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        String string = editTextCaption.getText().toString();
        if (string.length() <= 0 || string.length() > 12) {
            AndroidUtilities.shakeView(editTextCaption);
        } else {
            callback.run(string);
            alertDialog.dismiss();
        }
    }

    public static void $r8$lambda$KpN26ErhhEMNb2M5wC34bqmpPN0(ProfileGiftsContainer profileGiftsContainer, EditTextCaption editTextCaption, Activity activity, DialogInterface dialogInterface) {
        profileGiftsContainer.getClass();
        AndroidUtilities.hideKeyboard(editTextCaption);
        AndroidUtilities.requestAdjustResize(activity, profileGiftsContainer.fragment.getClassGuid());
    }

    public static void m3222$r8$lambda$Y_hy7wxb_R6l3jqf9bz9a6WDA(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    public void createCollection() {
        openEnterNameAlert(null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer profileGiftsContainer = this.f$0;
                profileGiftsContainer.collections.createCollection((String) obj, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        ProfileGiftsContainer.m3217$r8$lambda$KN1YaDbg7zlBj3GSgHPGTim04(profileGiftsContainer, (TL_stars.TL_starGiftCollection) obj2);
                    }
                });
            }
        });
    }

    public static void m3217$r8$lambda$KN1YaDbg7zlBj3GSgHPGTim04(ProfileGiftsContainer profileGiftsContainer, TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        profileGiftsContainer.fillTabs(true);
        ViewPagerFixed.TabsView tabsView = profileGiftsContainer.tabsView;
        int i = tL_starGiftCollection.collection_id;
        tabsView.scrollToTab(i, profileGiftsContainer.collections.indexOf(i) + 1);
        BaseFragment baseFragment = profileGiftsContainer.fragment;
        if (baseFragment instanceof ProfileActivity) {
            ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
        }
        profileGiftsContainer.updateTabsShown(true);
    }

    public void addGifts() {
        StarsController.GiftsList giftsList;
        final Page currentPage = getCurrentPage();
        if (currentPage == null || (giftsList = currentPage.list) == null || !currentPage.isCollection) {
            return;
        }
        final int i = giftsList.collectionId;
        new SelectGiftsBottomSheet(this.fragment, this.dialogId, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer.m3221$r8$lambda$Ue3HPN3KWnvCgt7PGnou2FpIfc(this.f$0, i, currentPage, (ArrayList) obj);
            }
        }).show();
    }

    public static void m3221$r8$lambda$Ue3HPN3KWnvCgt7PGnou2FpIfc(ProfileGiftsContainer profileGiftsContainer, int i, Page page, ArrayList arrayList) {
        profileGiftsContainer.collections.addGifts(i, arrayList, true);
        page.update(true);
        profileGiftsContainer.fillTabs(true);
        profileGiftsContainer.updateTabsShown(true);
        TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = profileGiftsContainer.collections.findById(i);
        if (tL_starGiftCollectionFindById != null) {
            if (arrayList.size() > 1) {
                Bulletin bulletinCreateSimpleMultiBulletin = BulletinFactory.of(profileGiftsContainer.fragment).createSimpleMultiBulletin(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), tL_starGiftCollectionFindById.title)));
                bulletinCreateSimpleMultiBulletin.hideAfterBottomSheet = false;
                bulletinCreateSimpleMultiBulletin.show();
                return;
            }
            if (arrayList.size() == 1) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                Bulletin bulletinCreateSimpleMultiBulletin2 = BulletinFactory.of(profileGiftsContainer.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollectionFindById.title)));
                bulletinCreateSimpleMultiBulletin2.hideAfterBottomSheet = false;
                bulletinCreateSimpleMultiBulletin2.show();
            }
        }
    }

    public static class SelectGiftsBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private UniversalAdapter adapter;
        private final ButtonWithCounterView button;
        private final FrameLayout buttonContainer;
        private final int collectionId;
        private final long dialogId;
        private ItemOptions lastMenu;
        private final ExtendedGridLayoutManager layoutManager;
        private final StarsController.GiftsList list;
        private final HashSet selectedGiftIds;

        public SelectGiftsBottomSheet(BaseFragment baseFragment, long j, int i, final Utilities.Callback callback) {
            super(baseFragment, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING);
            this.selectedGiftIds = new HashSet();
            this.ignoreTouchActionBar = false;
            this.headerMoveTop = AndroidUtilities.dp(12.0f);
            fixNavigationBar();
            setSlidingActionBar();
            this.dialogId = j;
            this.collectionId = i;
            this.list = new StarsController.GiftsList(this.currentAccount, j);
            this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(this.actionBar.createMenu().addItem(1, R.drawable.ic_ab_other), j));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.buttonContainer = frameLayout;
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
            int i2 = this.backgroundPaddingLeft;
            frameLayout.setPadding(i2, 0, i2, 0);
            this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            View view = new View(getContext());
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false);
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ProfileGiftsContainer.SelectGiftsBottomSheet.m3239$r8$lambda$Dl2KMO6KZDYNJexOVjsPeoWN38(this.f$0, callback, view2);
                }
            });
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
            ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(getContext(), 3);
            this.layoutManager = extendedGridLayoutManager;
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i3) {
                    int i4;
                    if (SelectGiftsBottomSheet.this.adapter == null) {
                        return SelectGiftsBottomSheet.this.layoutManager.getSpanCount();
                    }
                    UItem item = SelectGiftsBottomSheet.this.adapter.getItem(i3 - 1);
                    return (item == null || (i4 = item.spanCount) == -1) ? SelectGiftsBottomSheet.this.layoutManager.getSpanCount() : i4;
                }
            });
            this.recyclerListView.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(9.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(9.0f), 0);
            this.recyclerListView.setSelectorType(9);
            this.recyclerListView.setSelectorDrawableColor(0);
            this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view2, int i3) {
                    ProfileGiftsContainer.SelectGiftsBottomSheet.$r8$lambda$6kek0Y656Ab2fw4vKC0lusCPj1k(this.f$0, view2, i3);
                }
            });
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    if (SelectGiftsBottomSheet.this.isLoadingVisible()) {
                        SelectGiftsBottomSheet.this.list.load();
                    }
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            this.adapter.update(true);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
            final long val$dialogId;
            final ActionBarMenuItem val$other;

            AnonymousClass1(ActionBarMenuItem actionBarMenuItem, long j) {
                this.val$other = actionBarMenuItem;
                this.val$dialogId = j;
            }

            @Override
            public void onItemClick(int i) {
                final boolean zCanUserDoAction;
                final ActionBarMenuSubItem actionBarMenuSubItem;
                final ActionBarMenuSubItem actionBarMenuSubItem2;
                if (i != 1) {
                    if (i == -1) {
                        SelectGiftsBottomSheet.this.dismiss();
                        return;
                    }
                    return;
                }
                if (SelectGiftsBottomSheet.this.lastMenu != null) {
                    SelectGiftsBottomSheet.this.lastMenu.dismiss();
                }
                SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                ItemOptions itemOptions = selectGiftsBottomSheet.lastMenu = ItemOptions.makeOptions(selectGiftsBottomSheet.container, ((BottomSheet) selectGiftsBottomSheet).resourcesProvider, this.val$other);
                if (this.val$dialogId == UserConfig.getInstance(((BottomSheet) SelectGiftsBottomSheet.this).currentAccount).getClientUserId()) {
                    zCanUserDoAction = true;
                } else {
                    zCanUserDoAction = this.val$dialogId >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(((BottomSheet) SelectGiftsBottomSheet.this).currentAccount).getChat(Long.valueOf(-this.val$dialogId)), 5);
                }
                final ActionBarMenuSubItem actionBarMenuSubItemAdd = itemOptions.add();
                itemOptions.addGap();
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked = itemOptions.addChecked();
                actionBarMenuSubItemAddChecked.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked2 = itemOptions.addChecked();
                actionBarMenuSubItemAddChecked2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked3 = itemOptions.addChecked();
                actionBarMenuSubItemAddChecked3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked4 = itemOptions.addChecked();
                actionBarMenuSubItemAddChecked4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (zCanUserDoAction) {
                    itemOptions.addGap();
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked5 = itemOptions.addChecked();
                    actionBarMenuSubItemAddChecked5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked6 = itemOptions.addChecked();
                    actionBarMenuSubItemAddChecked6.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem2 = actionBarMenuSubItemAddChecked6;
                    actionBarMenuSubItem = actionBarMenuSubItemAddChecked5;
                } else {
                    actionBarMenuSubItem = null;
                    actionBarMenuSubItem2 = null;
                }
                final Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.$r8$lambda$IcdlJC7TVfsKOHnB6Be7V6jgB84(this.f$0, actionBarMenuSubItemAdd, actionBarMenuSubItemAddChecked, actionBarMenuSubItemAddChecked2, actionBarMenuSubItemAddChecked3, actionBarMenuSubItemAddChecked4, zCanUserDoAction, actionBarMenuSubItem, actionBarMenuSubItem2);
                    }
                };
                runnable.run();
                if (actionBarMenuSubItemAdd != null) {
                    actionBarMenuSubItemAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.$r8$lambda$XRhR24oKa1QANegvfiMTd7fTHmo(this.f$0, runnable, view);
                        }
                    });
                }
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked, SelectGiftsBottomSheet.this.list, runnable, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked2, SelectGiftsBottomSheet.this.list, runnable, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked3, SelectGiftsBottomSheet.this.list, runnable, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked4, SelectGiftsBottomSheet.this.list, runnable, 8);
                if (zCanUserDoAction) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem, SelectGiftsBottomSheet.this.list, runnable, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem2, SelectGiftsBottomSheet.this.list, runnable, 512);
                }
                itemOptions.setOnTopOfScrim().setDismissWithButtons(false).setDimAlpha(0).show();
            }

            public static void $r8$lambda$IcdlJC7TVfsKOHnB6Be7V6jgB84(AnonymousClass1 anonymousClass1, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, ActionBarMenuSubItem actionBarMenuSubItem3, ActionBarMenuSubItem actionBarMenuSubItem4, ActionBarMenuSubItem actionBarMenuSubItem5, boolean z, ActionBarMenuSubItem actionBarMenuSubItem6, ActionBarMenuSubItem actionBarMenuSubItem7) {
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(SelectGiftsBottomSheet.this.list.sort_by_date ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), SelectGiftsBottomSheet.this.list.sort_by_date ? R.drawable.menu_sort_value : R.drawable.menu_sort_date);
                }
                actionBarMenuSubItem2.setChecked(SelectGiftsBottomSheet.this.list.isInclude_unlimited());
                actionBarMenuSubItem3.setChecked(SelectGiftsBottomSheet.this.list.isInclude_limited());
                actionBarMenuSubItem4.setChecked(SelectGiftsBottomSheet.this.list.isInclude_upgradable());
                actionBarMenuSubItem5.setChecked(SelectGiftsBottomSheet.this.list.isInclude_unique());
                if (z) {
                    actionBarMenuSubItem6.setChecked(SelectGiftsBottomSheet.this.list.isInclude_displayed());
                    actionBarMenuSubItem7.setChecked(SelectGiftsBottomSheet.this.list.isInclude_hidden());
                }
            }

            public static void $r8$lambda$XRhR24oKa1QANegvfiMTd7fTHmo(AnonymousClass1 anonymousClass1, Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.sort_by_date = !SelectGiftsBottomSheet.this.list.sort_by_date;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }
        }

        public static void m3239$r8$lambda$Dl2KMO6KZDYNJexOVjsPeoWN38(SelectGiftsBottomSheet selectGiftsBottomSheet, Utilities.Callback callback, View view) {
            TL_stars.SavedStarGift savedStarGift;
            if (selectGiftsBottomSheet.selectedGiftIds.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = selectGiftsBottomSheet.selectedGiftIds.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Long) it.next()).longValue();
                ArrayList arrayList2 = selectGiftsBottomSheet.list.gifts;
                int size = arrayList2.size();
                int i = 0;
                do {
                    if (i >= size) {
                        savedStarGift = null;
                        break;
                    }
                    Object obj = arrayList2.get(i);
                    i++;
                    savedStarGift = (TL_stars.SavedStarGift) obj;
                    int i2 = savedStarGift.msg_id;
                    if (i2 != 0 && i2 == jLongValue) {
                        break;
                    }
                } while (savedStarGift.saved_id != jLongValue);
                if (savedStarGift != null) {
                    arrayList.add(savedStarGift);
                }
            }
            callback.run(arrayList);
            selectGiftsBottomSheet.dismiss();
        }

        public static void $r8$lambda$6kek0Y656Ab2fw4vKC0lusCPj1k(SelectGiftsBottomSheet selectGiftsBottomSheet, View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = selectGiftsBottomSheet.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            Object obj = item.object;
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                int i2 = savedStarGift.msg_id;
                long j = i2 == 0 ? savedStarGift.saved_id : i2;
                if (selectGiftsBottomSheet.selectedGiftIds.contains(Long.valueOf(j))) {
                    selectGiftsBottomSheet.selectedGiftIds.remove(Long.valueOf(j));
                    ((GiftSheet.GiftCell) view).setChecked(false, true);
                } else {
                    selectGiftsBottomSheet.selectedGiftIds.add(Long.valueOf(j));
                    ((GiftSheet.GiftCell) view).setChecked(true, true);
                }
                selectGiftsBottomSheet.button.setEnabled(selectGiftsBottomSheet.selectedGiftIds.size() > 0);
                selectGiftsBottomSheet.button.setCount(selectGiftsBottomSheet.selectedGiftIds.size(), true);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if (i != NotificationCenter.starUserGiftsLoaded || (universalAdapter = this.adapter) == null) {
                return;
            }
            universalAdapter.update(true);
            if (isLoadingVisible()) {
                this.list.load();
            }
        }

        public boolean isLoadingVisible() {
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

        @Override
        public void dismiss() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            super.dismiss();
        }

        @Override
        protected CharSequence getTitle() {
            return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.setApplyBackground(false);
            return this.adapter;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            int i;
            if (this.list == null) {
                return;
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
            StarsController.GiftsList giftsList = this.list;
            if (giftsList.loading && giftsList.gifts.isEmpty()) {
                arrayList.add(UItem.asFlicker(1, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(2, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(3, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(4, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(5, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(6, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(7, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(8, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(9, 34).setSpanCount(1));
            } else {
                ArrayList arrayList2 = this.list.gifts;
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                loop0: while (true) {
                    i = 3;
                    while (true) {
                        if (i3 >= size) {
                            break loop0;
                        }
                        Object obj = arrayList2.get(i3);
                        i3++;
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        if (!savedStarGift.collection_id.contains(Integer.valueOf(this.collectionId))) {
                            UItem uItemAsStarGift = GiftSheet.GiftCell.Factory.asStarGift(0, savedStarGift, true, true, false);
                            HashSet hashSet = this.selectedGiftIds;
                            int i4 = savedStarGift.msg_id;
                            arrayList.add(uItemAsStarGift.setChecked(hashSet.contains(Long.valueOf(i4 == 0 ? savedStarGift.saved_id : i4))).setSpanCount(1));
                            i--;
                            if (i == 0) {
                                break;
                            }
                        }
                    }
                }
                StarsController.GiftsList giftsList2 = this.list;
                if (giftsList2.loading || !giftsList2.endReached) {
                    while (true) {
                        if (i2 >= (i <= 0 ? 3 : i)) {
                            break;
                        }
                        i2++;
                        arrayList.add(UItem.asFlicker(i2, 34).setSpanCount(1));
                    }
                }
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(68.0f)));
        }
    }

    public static void setGiftFilterOptionsClickListeners(View view, final StarsController.GiftsList giftsList, final Runnable runnable, final int i) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ProfileGiftsContainer.$r8$lambda$tYVcLJaoSuZkHNIzrEi_rPUek2E(giftsList, i, runnable, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                return ProfileGiftsContainer.$r8$lambda$bEzDNpga9c41IzwYlyeh3jZ7Fbo(giftsList, i, runnable, view2);
            }
        });
    }

    public static void $r8$lambda$tYVcLJaoSuZkHNIzrEi_rPUek2E(StarsController.GiftsList giftsList, int i, Runnable runnable, View view) {
        giftsList.toggleTypeIncludeFlag(i);
        runnable.run();
    }

    public static boolean $r8$lambda$bEzDNpga9c41IzwYlyeh3jZ7Fbo(StarsController.GiftsList giftsList, int i, Runnable runnable, View view) {
        giftsList.forceTypeIncludeFlag(i, true);
        runnable.run();
        return true;
    }

    public void initBlurCapture(ViewGroup viewGroup) {
        this.iBlur3CaptureParent = viewGroup;
        this.iBlur3Capture = new IBlur3Capture() {
            @Override
            public final void capture(Canvas canvas, RectF rectF) {
                ProfileGiftsContainer.m3225$r8$lambda$mXcSTQyN3FqX_PyRQqOzAu7dhY(this.f$0, canvas, rectF);
            }

            @Override
            public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
                iBlur3Hash.unsupported();
            }
        };
    }

    public static void m3225$r8$lambda$mXcSTQyN3FqX_PyRQqOzAu7dhY(ProfileGiftsContainer profileGiftsContainer, Canvas canvas, RectF rectF) {
        for (View view : profileGiftsContainer.viewPager.getViewPages()) {
            if (view instanceof Page) {
                Page page = (Page) view;
                if (page.iBlur3Capture == null) {
                    UniversalRecyclerView universalRecyclerView = page.listView;
                    ViewGroup viewGroup = profileGiftsContainer.iBlur3CaptureParent;
                    UniversalRecyclerView universalRecyclerView2 = page.listView;
                    Objects.requireNonNull(universalRecyclerView2);
                    page.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView, viewGroup, new CallLogActivity$$ExternalSyntheticLambda6(universalRecyclerView2));
                }
                page.iBlur3Capture.capture(canvas, rectF);
            }
        }
    }
}
