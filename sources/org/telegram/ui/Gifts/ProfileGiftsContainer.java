package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CacheControlActivity$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.WallpaperCell$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda89;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda4;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda66;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda97;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ProfileGiftsView;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda14;

public abstract class ProfileGiftsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap cachedLastEmojis = new HashMap();
    public SpannableStringBuilder addCollectionTabText;
    public final SpannableStringBuilder addGiftsText;
    public final BoolAnimator animatorBottomButtonVisibility;
    public final FrameLayout bulletinContainer;
    public final ButtonWithCounterView button;
    public final FrameLayout buttonContainer;
    public int buttonContainerHeightDp;
    public int buttonContainerOffset;
    public final CheckBox2 checkbox;
    public final LinearLayout checkboxLayout;
    public int checkboxRequestId;
    public final TextView checkboxTextView;
    public final StarsController.GiftsCollections collections;
    public final int currentAccount;
    public ItemOptions currentMenu;
    public final long dialogId;
    public int externalPaddingTop;
    public final BaseFragment fragment;
    public EmojiView$$ExternalSyntheticLambda18 iBlur3Capture;
    public ViewGroup iBlur3CaptureParent;
    public final StarsController.GiftsList list;
    public int pendingScrollToCollectionId;
    public boolean reorderingCollections;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ProfileGiftsContainer$$ExternalSyntheticLambda0 sendCollectionsOrder;
    public final SpannableStringBuilder sendGiftsToFriendsText;
    public final ViewPagerFixed.AnonymousClass3 tabsView;
    public final AnonymousClass1 viewPager;
    public int visibleHeight;

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
        public final SharedMediaLayout.AnonymousClass13 parent;
        public boolean reordering;
        public final Theme.ResourcesProvider resourcesProvider;
        public int visibleHeight;

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

        public Page(final SharedMediaLayout.AnonymousClass13 anonymousClass13, int i, Theme.ResourcesProvider resourcesProvider) {
            super(anonymousClass13.getContext());
            this.visibleHeight = AndroidUtilities.displaySize.y;
            Context context = anonymousClass13.getContext();
            this.parent = anonymousClass13;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ?? r1 = new UniversalRecyclerView(context, i, new GiftSheet$$ExternalSyntheticLambda8(this, 27), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda2(this), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda2(this), resourcesProvider) {
                @Override
                public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    anonymousClass13.updateTabsY();
                }
            };
            this.listView = r1;
            r1.adapter.applyBackground = false;
            r1.setSelectorType(9);
            r1.setSelectorDrawableColor(0);
            r1.setPadding(AndroidUtilities.dp(9.0f), anonymousClass13.externalPaddingTop, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
            r1.setClipToPadding(false);
            r1.setClipChildren(false);
            addView((View) r1, LayoutHelper.createFrame(-1, -1, 119));
            r1.addOnScrollListener(new ChatActivity.AnonymousClass35(6, this, anonymousClass13));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public final void onAddAnimationUpdate() {
                    anonymousClass13.updateTabsY();
                }

                @Override
                public final void onChangeAnimationUpdate() {
                    anonymousClass13.updateTabsY();
                }

                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    anonymousClass13.updateTabsY();
                }

                @Override
                public final void onRemoveAnimationUpdate() {
                    anonymousClass13.updateTabsY();
                }
            };
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            r1.setItemAnimator(defaultItemAnimator);
            new ItemTouchHelper(new ItemTouchHelper.Callback() {
                public final boolean canReorder(TL_stars.SavedStarGift savedStarGift) {
                    Page page = Page.this;
                    if (!page.reordering) {
                        return false;
                    }
                    if (page.list == anonymousClass13.list) {
                        return savedStarGift != null && savedStarGift.pinned_to_top;
                    }
                    return true;
                }

                @Override
                public final void clearView(RecyclerView.ViewHolder viewHolder) {
                    View view = viewHolder.itemView;
                    Object tag = view.getTag();
                    if (tag instanceof Float) {
                        float fFloatValue = ((Float) tag).floatValue();
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        ViewCompat.Api21Impl.setElevation(view, fFloatValue);
                    }
                    view.setTag(null);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    viewHolder.itemView.setPressed(false);
                }

                @Override
                public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
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
                public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
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
                    SharedMediaLayout.AnonymousClass13 anonymousClass14 = anonymousClass13;
                    if (z) {
                        page.list.reorder(adapterPosition, adapterPosition2);
                        anonymousClass14.collections.updateIcon(page.list.collectionId);
                    } else {
                        StarsController.GiftsList giftsList = page.list;
                        if (giftsList.savedPinnedState == null) {
                            giftsList.savedPinnedState = giftsList.getPinned();
                        }
                        giftsList.reorder(adapterPosition, adapterPosition2);
                    }
                    AnonymousClass1 anonymousClass1 = page.listView;
                    anonymousClass1.adapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                    anonymousClass1.adapter.updateWithoutNotify();
                    if (page.isCollection) {
                        HashMap map = ProfileGiftsContainer.cachedLastEmojis;
                        anonymousClass14.fillTabs(true);
                    }
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if ((safeLastFragment instanceof ProfileActivity) && (profileGiftsView = ((ProfileActivity) safeLastFragment).giftsView) != null) {
                        profileGiftsView.update();
                    }
                    return true;
                }

                @Override
                public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i2) {
                    Page page = Page.this;
                    if (i2 != 0) {
                        AnonymousClass1 anonymousClass1 = page.listView;
                        if (anonymousClass1 != null) {
                            anonymousClass1.cancelClickRunnables(false);
                        }
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                            return;
                        }
                        return;
                    }
                    StarsController.GiftsList giftsList = page.list;
                    if (giftsList != null) {
                        ArrayList arrayList = giftsList.savedPinnedState;
                        if (arrayList != null) {
                            ArrayList pinned = giftsList.getPinned();
                            if (arrayList.size() == pinned.size()) {
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    if (arrayList.get(i3) == pinned.get(i3)) {
                                    }
                                }
                            }
                            giftsList.sendPinnedOrder();
                            giftsList.savedPinnedState = null;
                            return;
                        }
                        giftsList.savedPinnedState = null;
                    }
                }

                @Override
                public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
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
            if (anonymousClass13.list != this.list) {
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
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), resourcesProvider, true);
                this.emptyView2Button = buttonWithCounterView;
                buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
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
                    linearLayout2.setVisibility(anonymousClass13.collections.isMine() ? 0 : 8);
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
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null));
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
            ScaleStateListAnimator.apply(this.emptyView1Button, 0.1f, 1.5f);
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
            SharedMediaLayout.AnonymousClass13 anonymousClass13 = this.parent;
            anonymousClass13.updatedReordering(anonymousClass13.isReordering());
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
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda4((ProfileActivity) safeLastFragment, 2));
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
                anonymousClass1.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
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
            UniversalAdapter universalAdapter;
            AnonymousClass1 anonymousClass1 = this.listView;
            if (anonymousClass1 == null || (universalAdapter = anonymousClass1.adapter) == null) {
                return;
            }
            boolean zCanScrollVertically = anonymousClass1.canScrollVertically(-1);
            universalAdapter.update(z);
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
                ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, itemOptionsMakeOptions.context, itemOptionsMakeOptions.resourcesProvider, false, false);
                itemOptionsMakeOptions.add(actionBarMenuSubItem3);
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
                    actionBarMenuSubItem = actionBarMenuSubItemAddChecked5;
                    actionBarMenuSubItem2 = actionBarMenuSubItemAddChecked6;
                } else {
                    actionBarMenuSubItem = null;
                    actionBarMenuSubItem2 = null;
                }
                SendMessagesHelper$$ExternalSyntheticLambda7 sendMessagesHelper$$ExternalSyntheticLambda7 = new SendMessagesHelper$$ExternalSyntheticLambda7(this, actionBarMenuSubItem3, actionBarMenuSubItemAddChecked, actionBarMenuSubItemAddChecked2, actionBarMenuSubItemAddChecked3, actionBarMenuSubItemAddChecked4, zCanUserDoAction, actionBarMenuSubItem, actionBarMenuSubItem2, 4);
                sendMessagesHelper$$ExternalSyntheticLambda7.run();
                actionBarMenuSubItem3.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(13, this, sendMessagesHelper$$ExternalSyntheticLambda7));
                StarsController.GiftsList giftsList = selectGiftsBottomSheet.list;
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked2, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked3, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked4, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 8);
                if (zCanUserDoAction) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem2, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 512);
                }
                itemOptionsMakeOptions.onTopOfScrim = true;
                itemOptionsMakeOptions.dismissWithButtons = false;
                itemOptionsMakeOptions.dimAlpha = 0;
                itemOptionsMakeOptions.show();
            }
        }

        public SelectGiftsBottomSheet(BaseFragment baseFragment, long j, int i, CacheControlActivity$$ExternalSyntheticLambda23 cacheControlActivity$$ExternalSyntheticLambda23) {
            super(baseFragment);
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
            frameLayout.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 55));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider, true);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(12, this, cacheControlActivity$$ExternalSyntheticLambda23));
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
            getContext();
            ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(3, false);
            this.layoutManager = extendedGridLayoutManager;
            extendedGridLayoutManager.mSpanSizeLookup = new BaseMenuWrapper() {
                @Override
                public final int getSpanSize(int i3) {
                    int i4;
                    SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                    UniversalAdapter universalAdapter = selectGiftsBottomSheet.adapter;
                    ExtendedGridLayoutManager extendedGridLayoutManager2 = selectGiftsBottomSheet.layoutManager;
                    if (universalAdapter == null) {
                        return extendedGridLayoutManager2.mSpanCount;
                    }
                    UItem item = universalAdapter.getItem(i3 - 1);
                    return (item == null || (i4 = item.spanCount) == -1) ? extendedGridLayoutManager2.mSpanCount : i4;
                }
            };
            this.recyclerListView.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
            this.recyclerListView.setSelectorType(9);
            this.recyclerListView.setSelectorDrawableColor(0);
            this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
            this.recyclerListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 14));
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                    RecyclerListView recyclerListView = selectGiftsBottomSheet.recyclerListView;
                    if (recyclerListView == null || !recyclerListView.mIsAttached) {
                        return;
                    }
                    int i5 = 0;
                    while (true) {
                        RecyclerListView recyclerListView2 = selectGiftsBottomSheet.recyclerListView;
                        if (i5 >= recyclerListView2.getChildCount()) {
                            return;
                        }
                        if (recyclerListView2.getChildAt(i5) instanceof FlickerLoadingView) {
                            selectGiftsBottomSheet.list.load();
                            return;
                        }
                        i5++;
                    }
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            this.adapter.update(true);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, false, new GiftSheet$$ExternalSyntheticLambda8(this, 28), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.applyBackground = false;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if (i != NotificationCenter.starUserGiftsLoaded || (universalAdapter = this.adapter) == null) {
                return;
            }
            universalAdapter.update(true);
            RecyclerListView recyclerListView = this.recyclerListView;
            if (recyclerListView == null || !recyclerListView.mIsAttached) {
                return;
            }
            for (int i3 = 0; i3 < recyclerListView.getChildCount(); i3++) {
                if (recyclerListView.getChildAt(i3) instanceof FlickerLoadingView) {
                    this.list.load();
                    return;
                }
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
    }

    public final class TextFactory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

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
            return new ProfileActivity.AnonymousClass54(context, 5, null);
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
            super(context, resourcesProvider, false, false);
            this.selectedGift = 0L;
            fixNavigationBar();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true, resourcesProvider);
            textViewMakeTextView.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
            linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, resourcesProvider);
            textViewMakeTextView2.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
            linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
            StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount, false).getProfileGiftsList(j, true);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.currentAccount, 0, new OAuthSheet$$ExternalSyntheticLambda18(14, this, profileGiftsList), new DialogsActivity$$ExternalSyntheticLambda89(8, this, buttonWithCounterView), null, resourcesProvider);
            anonymousClass1.setSpanCount(3);
            anonymousClass1.setOverScrollMode(2);
            anonymousClass1.setScrollEnabled(false);
            linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
            buttonWithCounterView.setEnabled(false);
            buttonWithCounterView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, profileGiftsList, savedStarGift, callback0Return, 11));
            setCustomView(linearLayout);
        }
    }

    public ProfileGiftsContainer(final int i, long j, Context context, final BaseFragment baseFragment, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        String string;
        int i3;
        int i4;
        TLRPC.EncryptedChat encryptedChatM;
        super(context);
        this.checkboxRequestId = -1;
        SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) this;
        this.sendCollectionsOrder = new ProfileGiftsContainer$$ExternalSyntheticLambda0(anonymousClass13, 0);
        this.animatorBottomButtonVisibility = new BoolAnimator(0, new ProfileGiftsContainer$$ExternalSyntheticLambda1(anonymousClass13), CubicBezierInterpolator.EASE_OUT_QUINT, 380L, true);
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
        final SharedMediaLayout.AnonymousClass13 anonymousClass14 = (SharedMediaLayout.AnonymousClass13) this;
        ?? r1 = new ViewPagerFixed(context) {
            @Override
            public final void addMoreTabs() {
                ViewPagerFixed.AnonymousClass3 anonymousClass3;
                SharedMediaLayout.AnonymousClass13 anonymousClass15 = anonymousClass14;
                if (!anonymousClass15.canAdd() || (anonymousClass3 = anonymousClass15.tabsView) == null) {
                    return;
                }
                if (anonymousClass15.addCollectionTabText == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("+ "), R.string.Gift2NewCollection));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
                    coloredImageSpan.spaceScaleX = 0.8f;
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                    anonymousClass15.addCollectionTabText = spannableStringBuilder;
                }
                anonymousClass3.addTab(-1, anonymousClass15.addCollectionTabText);
            }

            @Override
            public final boolean canScroll(MotionEvent motionEvent) {
                return !anonymousClass14.isReordering();
            }

            @Override
            public final void onTabAnimationUpdate(boolean z) {
                SharedMediaLayout.AnonymousClass13 anonymousClass15 = anonymousClass14;
                anonymousClass15.updateButton$3();
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).updateSelectedMediaTabText();
                }
                anonymousClass15.updateTabsY();
            }

            @Override
            public final void onTabScrollEnd(int i5) {
                anonymousClass14.updateButton$3();
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).updateSelectedMediaTabText();
                }
            }
        };
        this.viewPager = r1;
        r1.setAllowDisallowInterceptTouch(true);
        r1.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void applyReorder(ArrayList arrayList) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    if (iIntValue != -1 && iIntValue != -2) {
                        arrayList2.add(num);
                    }
                }
                SharedMediaLayout.AnonymousClass13 anonymousClass15 = anonymousClass14;
                StarsController.GiftsCollections giftsCollections = anonymousClass15.collections;
                giftsCollections.getClass();
                HashMap map = new HashMap();
                ArrayList arrayList3 = giftsCollections.collections;
                int size2 = arrayList3.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList3.get(i6);
                    i6++;
                    TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                    map.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList2.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj3 = arrayList2.get(i7);
                    i7++;
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
                Page currentPage = anonymousClass15.getCurrentPage();
                if (currentPage != null) {
                    int iIndexOf = currentPage.isCollection ? giftsCollections.indexOf(currentPage.list.collectionId) + 1 : 0;
                    anonymousClass15.tabsView.selectTab(0.0f, iIndexOf, iIndexOf);
                }
                ProfileGiftsContainer$$ExternalSyntheticLambda0 profileGiftsContainer$$ExternalSyntheticLambda0 = anonymousClass15.sendCollectionsOrder;
                AndroidUtilities.cancelRunOnUIThread(profileGiftsContainer$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(profileGiftsContainer$$ExternalSyntheticLambda0, 1000L);
            }

            @Override
            public final void bindView(View view, int i5, int i6) {
                StarsController.GiftsList giftsList;
                boolean z;
                Page page = (Page) view;
                SharedMediaLayout.AnonymousClass13 anonymousClass15 = anonymousClass14;
                if (i6 == 0) {
                    giftsList = anonymousClass15.list;
                    z = false;
                } else {
                    StarsController.GiftsCollections giftsCollections = anonymousClass15.collections;
                    int i7 = i5 - 1;
                    if (i7 >= 0) {
                        if (i7 < giftsCollections.getCollections().size()) {
                            giftsList = (StarsController.GiftsList) giftsCollections.gifts.get(Integer.valueOf(((TL_stars.TL_starGiftCollection) giftsCollections.getCollections().get(i7)).collection_id));
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
                page.setVisibleHeight(anonymousClass15.visibleHeight);
                page.setHasTabs(!anonymousClass15.collections.getCollections().isEmpty());
            }

            @Override
            public final boolean canReorder(int i5) {
                return i5 != 0;
            }

            @Override
            public final View createView(int i5) {
                if (i5 == -1) {
                    return null;
                }
                return new Page(anonymousClass14, i, resourcesProvider);
            }

            @Override
            public final int getItemCount() {
                return anonymousClass14.collections.getCollections().size() + 1;
            }

            @Override
            public final int getItemId(int i5) {
                if (i5 == 0) {
                    return -2;
                }
                return ((TL_stars.TL_starGiftCollection) anonymousClass14.collections.getCollections().get(i5 - 1)).collection_id;
            }

            @Override
            public final CharSequence getItemTitle(int i5) {
                if (i5 == 0) {
                    return LocaleController.getString(R.string.Gift2CollectionAll);
                }
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) anonymousClass14.collections.getCollections().get(i5 - 1);
                if (tL_starGiftCollection == null) {
                    return null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
                if (tL_starGiftCollection.icon != null) {
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
                    TLRPC.Document document = tL_starGiftCollection.icon;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, textPaint.getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                    spannableStringBuilder2.setSpan(animatedEmojiSpan, 0, 1, 33);
                    spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
                }
                return spannableStringBuilder;
            }

            @Override
            public final int getItemViewType(int i5) {
                return i5 == 0 ? 0 : 1;
            }
        });
        addView((View) r1, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.AnonymousClass3 anonymousClass3CreateTabsView = r1.createTabsView(10, true);
        this.tabsView = anonymousClass3CreateTabsView;
        int i5 = Theme.key_profile_tabSelectedLine;
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        int i7 = Theme.key_profile_tabText;
        int i8 = Theme.key_profile_tabSelector;
        int i9 = Theme.key_actionBarDefault;
        anonymousClass3CreateTabsView.tabLineColorKey = i5;
        anonymousClass3CreateTabsView.activeTextColorKey = i6;
        anonymousClass3CreateTabsView.unactiveTextColorKey = i7;
        anonymousClass3CreateTabsView.selectorColorKey = i8;
        anonymousClass3CreateTabsView.backgroundColorKey = i9;
        anonymousClass3CreateTabsView.selectorDrawable.setColor(Theme.getColor(i5, anonymousClass3CreateTabsView.resourcesProvider));
        anonymousClass3CreateTabsView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        anonymousClass3CreateTabsView.setClipToPadding(false);
        anonymousClass3CreateTabsView.tabMarginDp = 12;
        anonymousClass3CreateTabsView.setPreTabClick(new ProfileGiftsContainer$$ExternalSyntheticLambda1(anonymousClass13));
        anonymousClass3CreateTabsView.setOnTabLongClick(new PassportActivity$$ExternalSyntheticLambda66(anonymousClass13, i, baseFragment, context, resourcesProvider, 4));
        addView(anonymousClass3CreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        int i10 = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.paint.setColor(Theme.getColor(i10, resourcesProvider));
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = new BlurredBackgroundColorProviderThemed(i10, resourcesProvider);
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceColor);
        blurredBackgroundDrawableSource.setColorProvider(blurredBackgroundColorProviderThemed);
        blurredBackgroundDrawableSource.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableSource.setRadius(AndroidUtilities.dp(22.0f));
        anonymousClass19.setBackground(blurredBackgroundDrawableSource);
        ScaleStateListAnimator.apply(anonymousClass19, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 60, 87);
        layoutParamsCreateFrame.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, layoutParamsCreateFrame);
        frameLayout.addView(anonymousClass19, LayoutHelper.createFrame(-2, 60, 1));
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
        int i11 = Theme.key_radioBackgroundChecked;
        int i12 = Theme.key_checkboxDisabled;
        int i13 = Theme.key_checkboxCheck;
        CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
        checkBoxBase.setColor(i11, i12, i13);
        checkBox2.setDrawUnchecked(true);
        checkBoxBase.setChecked(-1, false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.checkboxTextView = textView;
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        anonymousClass19.addView(linearLayout, LayoutHelper.createFrame(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(anonymousClass13, baseFragment, i, 15));
        Boolean bool = profileGiftsList.chat_notifications_enabled;
        if (bool != null) {
            checkBoxBase.setChecked(-1, bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(this.dialogId));
        boolean z = this.dialogId < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
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
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setUseWrapContent(true);
            buttonWithCounterView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            buttonWithCounterView.setRoundRadius(AndroidUtilities.dp(19.0f));
            buttonWithCounterView.setText(spannableStringBuilder, false, true);
            buttonWithCounterView.setStateListAnimator(null);
            anonymousClass19.addView(buttonWithCounterView, LayoutHelper.createFrame(-2, -1, 17));
            anonymousClass19.setOnClickListener(new ProfileGiftsContainer$$ExternalSyntheticLambda5(anonymousClass13, z, i, 0));
            if (canSwitchNotify()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            buttonWithCounterView.setVisibility(i3);
            if (canSwitchNotify()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            linearLayout.setVisibility(i4);
            this.buttonContainerHeightDp = 60;
            addView(frameLayout2, LayoutHelper.createFrame(-1, 200, 87));
            updateColors$1();
            updateTabsShown();
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
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider, true);
        this.button = buttonWithCounterView2;
        buttonWithCounterView2.setUseWrapContent(true);
        buttonWithCounterView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        buttonWithCounterView2.setRoundRadius(AndroidUtilities.dp(19.0f));
        buttonWithCounterView2.setText(spannableStringBuilder3, false, true);
        buttonWithCounterView2.setStateListAnimator(null);
        anonymousClass19.addView(buttonWithCounterView2, LayoutHelper.createFrame(-2, -1, 17));
        anonymousClass19.setOnClickListener(new ProfileGiftsContainer$$ExternalSyntheticLambda5(anonymousClass13, z, i, 0));
        if (canSwitchNotify()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        buttonWithCounterView2.setVisibility(i3);
        if (canSwitchNotify()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        linearLayout.setVisibility(i4);
        this.buttonContainerHeightDp = 60;
        addView(frameLayout2, LayoutHelper.createFrame(-1, 200, 87));
        updateColors$1();
        updateTabsShown();
    }

    public static void setGiftFilterOptionsClickListeners(ActionBarMenuSubItem actionBarMenuSubItem, StarsController.GiftsList giftsList, Runnable runnable, int i) {
        actionBarMenuSubItem.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(giftsList, i, runnable, 14));
        actionBarMenuSubItem.setOnLongClickListener(new WallpaperCell$$ExternalSyntheticLambda1(giftsList, i, runnable));
    }

    public final void addGifts() {
        StarsController.GiftsList giftsList;
        Page currentPage = getCurrentPage();
        if (currentPage == null || (giftsList = currentPage.list) == null || !currentPage.isCollection) {
            return;
        }
        int i = giftsList.collectionId;
        new SelectGiftsBottomSheet(this.fragment, this.dialogId, i, new CacheControlActivity$$ExternalSyntheticLambda23(this, i, currentPage, 3)).show();
    }

    public final boolean canAdd() {
        StarsController.GiftsCollections giftsCollections = this.collections;
        return giftsCollections.isMine() && giftsCollections.getCollections().size() < MessagesController.getInstance(this.currentAccount).config.stargiftsCollectionsLimit.get();
    }

    public final boolean canReorder() {
        int i = this.currentAccount;
        long j = this.dialogId;
        if (j >= 0) {
            return j == 0 || j == UserConfig.getInstance(i).getClientUserId();
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 5);
    }

    public final boolean canSwitchNotify() {
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.checkboxLayout;
        ButtonWithCounterView buttonWithCounterView = this.button;
        long j = this.dialogId;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() != j) {
                return;
            }
            buttonWithCounterView.setVisibility(canSwitchNotify() ? 8 : 0);
            linearLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = 60;
            Boolean bool = this.list.chat_notifications_enabled;
            if (bool != null) {
                this.checkbox.checkBoxBase.setChecked(-1, bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() != j) {
                return;
            }
            fillTabs(true);
            updateTabsShown();
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            buttonWithCounterView.setVisibility(canSwitchNotify() ? 8 : 0);
            linearLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = 60;
            setVisibleHeight(this.visibleHeight);
        }
    }

    public final void fillTabs(boolean z) {
        AnonymousClass1 anonymousClass1 = this.viewPager;
        if (anonymousClass1 == null || this.tabsView == null) {
            return;
        }
        anonymousClass1.fillTabs$1(z);
        checkScrollToCollection();
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.buttonContainer;
        float translationY = frameLayout.getTranslationY() - RichMessageLayout$$ExternalSyntheticOutline2.m(Math.max(AndroidUtilities.dp(240.0f), this.visibleHeight) + (-frameLayout.getTop()), this.buttonContainerHeightDp, 1);
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
        View currentView = getCurrentView();
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
        StarsController.GiftsList giftsList2 = this.list;
        if (currentPage == null || (giftsList = currentPage.list) == giftsList2) {
            if (giftsList2 != null && (i = giftsList2.totalCount) > 0) {
                return i;
            }
        } else if (giftsList != null && (i2 = giftsList.totalCount) > 0) {
            return i2;
        }
        int i3 = this.currentAccount;
        long j = this.dialogId;
        if (j >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i3).getUserFull(j);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i3).getChatFull(-j);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long jHash = 0;
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null && !giftsList.gifts.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < giftsList.gifts.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) giftsList.gifts.get(i2)).gift.getDocument();
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
        AnonymousClass1 anonymousClass1 = this.viewPager;
        float tabsHeight = 0.0f;
        if (anonymousClass1.getViewPages() != null) {
            for (View view : anonymousClass1.getViewPages()) {
                if (view instanceof Page) {
                    tabsHeight = (((Page) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + tabsHeight;
                }
            }
        }
        return tabsHeight;
    }

    public float getTabsVisibility() {
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
        if (anonymousClass3 != null) {
            return anonymousClass3.getAlpha();
        }
        return 0.0f;
    }

    public final boolean isReordering() {
        if (this.reorderingCollections) {
            return true;
        }
        Page currentPage = getCurrentPage();
        return currentPage != null && currentPage.reordering;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.updateInterfaces);
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.update(false);
        }
        fillTabs(false);
        updateTabsShown();
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
    public final void onDetachedFromWindow() {
        Page currentPage = getCurrentPage();
        Page currentPage2 = getCurrentPage();
        if (currentPage2 != null) {
            currentPage2.resetReordering();
        }
        setReorderingCollections(false);
        if (currentPage != null) {
            currentPage.resetReordering();
        }
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.updateInterfaces);
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
        ItemOptions.AnonymousClass4 anonymousClass4;
        Context context = getContext();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        AlertDialog alertDialog = builder.alertDialog;
        if (str != null) {
            alertDialog.title = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog.title = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog.message = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        final ?? r13 = new EditTextCaption(context, resourcesProvider) {
            public final AnimatedTextView.AnimatedTextDrawable limit;
            public final AnimatedColor limitColor = new AnimatedColor(this);
            public int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
                this.limit = animatedTextDrawable;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                animatedTextDrawable.moveAmplitude = 0.2f;
                animatedTextDrawable.animateDuration = 160L;
                animatedTextDrawable.animateWave = 1.0f;
                animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.gravity = 5;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                int i = this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, ProfileGiftsContainer.this.resourcesProvider), false);
                animatedTextDrawable.textPaint.setColor(i);
                animatedTextDrawable.alpha = Color.alpha(i);
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
                    animatedTextDrawable.setText(str2, true, true);
                }
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        r13.lineYFix = true;
        r13.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                AnonymousClass5 anonymousClass5 = r13;
                String string = anonymousClass5.getText().toString();
                if (string.length() <= 0 || string.length() > 12) {
                    AndroidUtilities.shakeView(anonymousClass5);
                    return true;
                }
                callback.run(string);
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r13.setTextSize(1, 18.0f);
        r13.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        r13.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        r13.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        r13.setFocusable(true);
        r13.setInputType(147457);
        r13.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        r13.setImeOptions(6);
        r13.setBackgroundDrawable(null);
        r13.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        r13.addTextChangedListener(new TextWatcher() {
            public boolean ignoreTextChange;

            @Override
            public final void afterTextChanged(Editable editable) {
                if (!this.ignoreTextChange && editable.length() > 12) {
                    this.ignoreTextChange = true;
                    editable.delete(12, editable.length());
                    AnonymousClass5 anonymousClass5 = r13;
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
        r13.setText(str);
        linearLayout.addView((View) r13, LayoutHelper.createLinear(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        alertDialog.customWidth = AndroidUtilities.dp(292.0f);
        builder.setPositiveButton(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new DialogsActivity$$ExternalSyntheticLambda89(6, r13, callback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new PhotoViewer$$ExternalSyntheticLambda97(5));
        alertDialogArr[0] = alertDialog;
        ItemOptions itemOptions = this.currentMenu;
        if (itemOptions != null && (anonymousClass4 = itemOptions.actionBarPopupWindow) != null) {
            anonymousClass4.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(activityFindActivity, this.fragment.getClassGuid());
        int i = 4;
        alertDialogArr[0].setOnDismissListener(new BotLocation$$ExternalSyntheticLambda14(this, r13, activityFindActivity, i));
        alertDialogArr[0].setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(i, r13));
        alertDialogArr[0].show();
        AlertDialog alertDialog2 = alertDialogArr[0];
        alertDialog2.dismissDialogByButtons = false;
        boolean z = alertDialog2.getButton(-1) instanceof TextView;
        r13.setSelection(r13.getText().length());
    }

    public void setButtonOffset(int i) {
        if (this.buttonContainerOffset != i) {
            this.buttonContainerOffset = i;
            updateButton$3();
        }
    }

    public void setPaddingTop(int i) {
        if (this.externalPaddingTop != i) {
            this.externalPaddingTop = i;
            for (View view : getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    int paddingTop = page.listView.getPaddingTop();
                    int iDp = AndroidUtilities.dp(9.0f);
                    int i2 = this.externalPaddingTop;
                    int iDp2 = AndroidUtilities.dp(9.0f);
                    int iDp3 = AndroidUtilities.dp(86.0f);
                    Page.AnonymousClass1 anonymousClass1 = page.listView;
                    anonymousClass1.setPadding(iDp, i2, iDp2, iDp3);
                    AndroidUtilities.doOnLayout(anonymousClass1, new ProfileGiftsContainer$$ExternalSyntheticLambda7(page, paddingTop - anonymousClass1.getPaddingTop(), 0));
                }
            }
            updateTabsY();
            updateButton$3();
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
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda4((ProfileActivity) safeLastFragment, 1));
            }
        }
        if (z) {
            return;
        }
        ProfileGiftsContainer$$ExternalSyntheticLambda0 profileGiftsContainer$$ExternalSyntheticLambda0 = this.sendCollectionsOrder;
        AndroidUtilities.cancelRunOnUIThread(profileGiftsContainer$$ExternalSyntheticLambda0);
        AndroidUtilities.runOnUIThread(profileGiftsContainer$$ExternalSyntheticLambda0);
    }

    public void setVisibleHeight(int i) {
        this.visibleHeight = i;
        updateButton$3();
        AnonymousClass1 anonymousClass1 = this.viewPager;
        if (anonymousClass1 != null) {
            for (View view : anonymousClass1.getViewPages()) {
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
        if (i2 >= 0) {
            StarsController.GiftsCollections giftsCollections = this.collections;
            if (i2 < giftsCollections.getCollections().size()) {
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
        }
        return true;
    }

    public final void updateButton$3() {
        float nextPositionAlpha;
        Bulletin.Layout layout;
        AnonymousClass1 anonymousClass1 = this.viewPager;
        if (anonymousClass1 == null) {
            return;
        }
        if (anonymousClass1.getCurrentPosition() == anonymousClass1.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (shouldHideButton(anonymousClass1.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((anonymousClass1.getNextPositionAlpha() * (shouldHideButton(anonymousClass1.getNextPosition()) ? 1.0f : 0.0f)) + (anonymousClass1.getCurrentPositionAlpha() * (shouldHideButton(anonymousClass1.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.buttonContainer;
        float fM = nextPositionAlpha + RichMessageLayout$$ExternalSyntheticOutline2.m((-frameLayout.getTop()) + this.visibleHeight, this.buttonContainerHeightDp, 1);
        boolean z = this.visibleHeight > AndroidUtilities.dp(184.0f);
        BoolAnimator boolAnimator = this.animatorBottomButtonVisibility;
        boolAnimator.setValue(z, true);
        float f = boolAnimator.floatValue;
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + fM, fM, f);
        this.bulletinContainer.setTranslationY(fLerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(fLerp - this.buttonContainerOffset);
        frameLayout.setAlpha(f);
        frameLayout.setVisibility(f <= 0.0f ? 4 : 0);
        this.button.setText((!this.collections.isMine() || anonymousClass1.getPositionAnimated() < 0.5f) ? this.sendGiftsToFriendsText : this.addGiftsText, true, true);
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin == null || (layout = bulletin.layout) == null) {
            return;
        }
        layout.updatePosition();
    }

    public final void updateColors$1() {
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.updateColors$1();
        int iDp = AndroidUtilities.dp(19.0f);
        int i = Theme.key_featuredStickers_addButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        buttonWithCounterView.setBackground(Theme.createRoundRectDrawable(iDp, ((SharedMediaLayout.AnonymousClass13) this).this$0.processColor(Theme.getColor(i, resourcesProvider))));
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    FrameLayout frameLayout = page.emptyView1;
                    Theme.ResourcesProvider resourcesProvider2 = page.resourcesProvider;
                    if (frameLayout != null) {
                        page.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
                        TextView textView = page.emptyView1Button;
                        int i2 = Theme.key_featuredStickers_addButton;
                        textView.setTextColor(Theme.getColor(i2, resourcesProvider2));
                        page.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i2, resourcesProvider2)), 4, 4));
                    } else {
                        page.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
                        page.emptyView2Subtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider2));
                        page.emptyView2Button.updateColors$1();
                    }
                }
            }
        }
        this.checkboxTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        this.checkboxLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 24, 24));
    }

    public final void updateTabsShown() {
        boolean z = !this.collections.getCollections().isEmpty() || canAdd();
        AnonymousClass1 anonymousClass1 = this.viewPager;
        if (anonymousClass1.getViewPages() != null) {
            for (View view : anonymousClass1.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).setHasTabs(z);
                }
            }
        }
    }

    public final void updateTabsY() {
        float f;
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
        if (anonymousClass3 == null) {
            return;
        }
        float fMin = Math.min(this.externalPaddingTop, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(fMin - this.externalPaddingTop, -AndroidUtilities.dp(42.0f), 0.0f));
        float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp01);
        anonymousClass3.setTranslationY(fMin);
        anonymousClass3.setScaleX(fLerp);
        anonymousClass3.setScaleY(fLerp);
        AnonymousClass1 anonymousClass1 = this.viewPager;
        if (anonymousClass1.getViewPages() != null) {
            f = 0.0f;
            for (View view : anonymousClass1.getViewPages()) {
                if (view instanceof Page) {
                    f += ((Page) view).hasTabs ? 1.0f : 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        anonymousClass3.setAlpha(MathUtils.clamp(f, 0.0f, 1.0f) * fClamp01);
    }

    public abstract void updatedReordering(boolean z);

    public final class AnonymousClass3 extends Drawable {
        public final int $r8$classId;
        public final ShapeDrawable bg;
        public final Rect bgBounds;

        public AnonymousClass3() {
            this.$r8$classId = 0;
            this.bg = Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
            this.bgBounds = new Rect();
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    Rect bounds = getBounds();
                    Rect rect = this.bgBounds;
                    rect.set(bounds);
                    rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                    ShapeDrawable shapeDrawable = this.bg;
                    shapeDrawable.setBounds(rect);
                    shapeDrawable.draw(canvas);
                    break;
                default:
                    Rect bounds2 = getBounds();
                    Rect rect2 = this.bgBounds;
                    rect2.set(bounds2);
                    rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                    ShapeDrawable shapeDrawable2 = this.bg;
                    shapeDrawable2.setBounds(rect2);
                    shapeDrawable2.draw(canvas);
                    break;
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
            }
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                    this.bg.setAlpha(i);
                    break;
                default:
                    this.bg.setAlpha(i);
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            int i = this.$r8$classId;
        }

        public AnonymousClass3(SharedMediaLayout.AnonymousClass14 anonymousClass14) {
            this.$r8$classId = 1;
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            int i = Theme.key_windowBackgroundWhite;
            Theme.ResourcesProvider resourcesProvider = anonymousClass14.val$resourcesProvider;
            this.bg = Theme.createRoundRectDrawable(iDp, iDp2, Theme.blendOver(Theme.getColor(i, resourcesProvider), Theme.multAlpha(0.04f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider))));
            this.bgBounds = new Rect();
        }

        private final void setColorFilter$org$telegram$ui$Components$SharedMediaLayout$14$1(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Gifts$ProfileGiftsContainer$3(ColorFilter colorFilter) {
        }
    }
}
