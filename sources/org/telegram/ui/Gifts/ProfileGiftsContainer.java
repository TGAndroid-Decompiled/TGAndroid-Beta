package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
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
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.ProfileGiftsView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class ProfileGiftsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final HashMap cachedLastEmojis = new HashMap();
    private final CharSequence addGiftsText;
    private int backgroundColor;
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private int buttonContainerHeightDp;
    private final View buttonShadow;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private int checkboxRequestId;
    private final TextView checkboxTextView;
    public final StarsController.GiftsCollections collections;
    private final int currentAccount;
    public ItemOptions currentMenu;
    private final long dialogId;
    private final BaseFragment fragment;
    private final StarsController.GiftsList list;
    private boolean reorderingCollections;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Runnable sendCollectionsOrder;
    private final CharSequence sendGiftsToFriendsText;
    private final ViewPagerFixed.TabsView tabsView;
    private final ViewPagerFixed viewPager;
    private int visibleHeight;

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
        public boolean isCollection;
        public StarsController.GiftsList list;
        private final UniversalRecyclerView listView;
        private final ProfileGiftsContainer parent;
        private final ItemTouchHelper reorder;
        private boolean reordering;
        private final Theme.ResourcesProvider resourcesProvider;
        private int visibleHeight;

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
                    ProfileGiftsContainer.Page.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ProfileGiftsContainer.Page.this.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, new Utilities.Callback5Return() {
                @Override
                public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return Boolean.valueOf(ProfileGiftsContainer.Page.this.onItemLongPress((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
                }
            }, resourcesProvider, 3, 1);
            this.listView = universalRecyclerView;
            universalRecyclerView.adapter.setApplyBackground(false);
            universalRecyclerView.setSelectorType(9);
            universalRecyclerView.setSelectorDrawableColor(0);
            universalRecyclerView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(30.0f));
            universalRecyclerView.setClipToPadding(false);
            universalRecyclerView.setClipChildren(false);
            addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
            universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    if (Page.this.isAttachedToWindow()) {
                        if (!Page.this.listView.canScrollVertically(1) || Page.this.isLoadingVisible()) {
                            Page.this.list.load();
                        }
                    }
                }
            });
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
                private boolean canReorder(TL_stars.SavedStarGift savedStarGift) {
                    if (!Page.this.reordering) {
                        return false;
                    }
                    if (Page.this.list == profileGiftsContainer.list) {
                        return savedStarGift != null && savedStarGift.pinned_to_top;
                    }
                    return true;
                }

                private TL_stars.SavedStarGift getSavedGift(RecyclerView.ViewHolder viewHolder) {
                    View view = viewHolder.itemView;
                    if (view instanceof GiftSheet.GiftCell) {
                        return ((GiftSheet.GiftCell) view).getSavedGift();
                    }
                    return null;
                }

                @Override
                public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setPressed(false);
                }

                @Override
                public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    return canReorder(getSavedGift(viewHolder)) ? ItemTouchHelper.Callback.makeMovementFlags(15, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }

                @Override
                public boolean isItemViewSwipeEnabled() {
                    return Page.this.reordering;
                }

                @Override
                public boolean isLongPressDragEnabled() {
                    return Page.this.reordering;
                }

                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    ProfileGiftsView profileGiftsView;
                    if (!Page.this.reordering || !canReorder(getSavedGift(viewHolder)) || !canReorder(getSavedGift(viewHolder2))) {
                        return false;
                    }
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    Page page = Page.this;
                    boolean z = page.isCollection;
                    StarsController.GiftsList giftsList = page.list;
                    if (z) {
                        giftsList.reorder(adapterPosition, adapterPosition2);
                        profileGiftsContainer.collections.updateIcon(Page.this.list.collectionId);
                    } else {
                        giftsList.reorderPinned(adapterPosition, adapterPosition2);
                    }
                    Page.this.listView.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                    Page.this.listView.adapter.updateWithoutNotify();
                    if (Page.this.isCollection) {
                        profileGiftsContainer.viewPager.fillTabs(true);
                    }
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if ((safeLastFragment instanceof ProfileActivity) && (profileGiftsView = ((ProfileActivity) safeLastFragment).giftsView) != null) {
                        profileGiftsView.update();
                    }
                    return true;
                }

                @Override
                public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i2) {
                    Page page = Page.this;
                    if (i2 == 0) {
                        page.list.reorderDone();
                    } else {
                        if (page.listView != null) {
                            Page.this.listView.cancelClickRunnables(false);
                        }
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    }
                    super.onSelectedChanged(viewHolder, i2);
                }

                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int i2) {
                }
            });
            this.reorder = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(universalRecyclerView);
            updateEmptyView();
        }

        public boolean isLoadingVisible() {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                    return true;
                }
            }
            return false;
        }

        public void lambda$onItemClick$3() {
            UniversalAdapter universalAdapter;
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
                return;
            }
            universalAdapter.update(false);
        }

        public void lambda$onItemClick$4(TL_stars.SavedStarGift savedStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, Long l) {
            Bulletin createSimpleBulletin;
            this.list.gifts.remove(savedStarGift);
            this.listView.adapter.update(true);
            if (l.longValue() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                createSimpleBulletin = BulletinFactory.of(this.parent.fragment).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftTitle), LocaleController.formatString(R.string.BoughtResoldGiftText, tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
            } else {
                createSimpleBulletin = BulletinFactory.of(this.parent.fragment).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, l.longValue())));
            }
            createSimpleBulletin.hideAfterBottomSheet(false).show();
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.getFireworksOverlay().start(true);
            }
        }

        public BulletinFactory lambda$onItemLongPress$11(View view, boolean z) {
            ((GiftSheet.GiftCell) view).setPinned(z, true);
            this.listView.scrollToPosition(0);
            return BulletinFactory.of(this.parent.fragment);
        }

        public void lambda$onItemLongPress$12(TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell, final View view) {
            if (savedStarGift.unsaved) {
                savedStarGift.unsaved = false;
                giftCell.setStarsGift(savedStarGift, true, false);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = this.list.getInput(savedStarGift);
                savestargift.unsave = savedStarGift.unsaved;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
            }
            final boolean z = !savedStarGift.pinned_to_top;
            if (this.list.togglePinned(savedStarGift, z, false)) {
                new UnpinSheet(getContext(), this.parent.dialogId, savedStarGift, this.resourcesProvider, new Utilities.Callback0Return() {
                    @Override
                    public final Object run() {
                        BulletinFactory lambda$onItemLongPress$11;
                        lambda$onItemLongPress$11 = ProfileGiftsContainer.Page.this.lambda$onItemLongPress$11(view, z);
                        return lambda$onItemLongPress$11;
                    }
                }).show();
                return;
            }
            BulletinFactory of = BulletinFactory.of(this.parent.fragment);
            (z ? of.createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)) : of.createSimpleBulletin(R.raw.ic_unpin, LocaleController.getString(R.string.Gift2Unpinned))).show();
            ((GiftSheet.GiftCell) view).setPinned(z, true);
            this.listView.scrollToPosition(0);
        }

        public void lambda$onItemLongPress$13() {
            setReordering(true);
        }

        public void lambda$onItemLongPress$14() {
            setReordering(true);
        }

        public void lambda$onItemLongPress$15(TL_stars.SavedStarGift savedStarGift) {
            new StarGiftSheet(getContext(), this.currentAccount, this.parent.dialogId, this.resourcesProvider) {
                @Override
                public BulletinFactory getBulletinFactory() {
                    return BulletinFactory.of(Page.this.parent.fragment);
                }
            }.set(savedStarGift, null).toggleWear(false);
        }

        public void lambda$onItemLongPress$16(String str) {
            AndroidUtilities.addToClipboard(str);
            BulletinFactory.of(this.parent.fragment).createCopyLinkBulletin(false).show();
        }

        public void lambda$onItemLongPress$17(TL_stars.SavedStarGift savedStarGift) {
            new StarGiftSheet(getContext(), this.currentAccount, this.parent.dialogId, this.resourcesProvider) {
                @Override
                public BulletinFactory getBulletinFactory() {
                    return BulletinFactory.of(Page.this.parent.fragment);
                }
            }.set(savedStarGift, null).onSharePressed(null);
        }

        public void lambda$onItemLongPress$18() {
            setReordering(true);
        }

        public void lambda$onItemLongPress$19(TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell) {
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                giftCell.setPinned(false, true);
                this.list.togglePinned(savedStarGift, false, false);
            }
            savedStarGift.unsaved = !savedStarGift.unsaved;
            giftCell.setStarsGift(savedStarGift, true, false);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = this.list.getInput(savedStarGift);
            savestargift.unsave = savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null);
        }

        public void lambda$onItemLongPress$20(TL_stars.SavedStarGift savedStarGift) {
            new StarGiftSheet(getContext(), this.currentAccount, this.parent.dialogId, this.resourcesProvider) {
                @Override
                public BulletinFactory getBulletinFactory() {
                    return BulletinFactory.of(Page.this.parent.fragment);
                }
            }.set(savedStarGift, null).openTransfer();
        }

        public void lambda$onItemLongPress$21(TL_stars.SavedStarGift savedStarGift, ItemOptions itemOptions) {
            this.parent.collections.removeGift(this.list.collectionId, savedStarGift);
            itemOptions.dismiss();
            this.parent.updateTabsShown(true);
        }

        public void lambda$onItemLongPress$6(TL_stars.SavedStarGift savedStarGift, TL_stars.TL_starGiftCollection tL_starGiftCollection) {
            this.parent.collections.addGift(tL_starGiftCollection.collection_id, savedStarGift, true);
            this.parent.viewPager.fillTabs(true);
            ViewPagerFixed.TabsView tabsView = this.parent.tabsView;
            int i = tL_starGiftCollection.collection_id;
            tabsView.scrollToTab(i, this.parent.collections.indexOf(i) + 1);
            if (this.parent.fragment instanceof ProfileActivity) {
                ((ProfileActivity) this.parent.fragment).scrollToSharedMedia(true);
            }
            this.parent.updateTabsShown(true);
        }

        public void lambda$onItemLongPress$7(final TL_stars.SavedStarGift savedStarGift, String str) {
            this.parent.collections.createCollection(str, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ProfileGiftsContainer.Page.this.lambda$onItemLongPress$6(savedStarGift, (TL_stars.TL_starGiftCollection) obj);
                }
            });
        }

        public void lambda$onItemLongPress$8(ItemOptions itemOptions, final TL_stars.SavedStarGift savedStarGift, View view) {
            itemOptions.dismiss();
            this.parent.openEnterNameAlert(null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ProfileGiftsContainer.Page.this.lambda$onItemLongPress$7(savedStarGift, (String) obj);
                }
            });
        }

        public void lambda$onItemLongPress$9(boolean z, TL_stars.TL_starGiftCollection tL_starGiftCollection, TL_stars.SavedStarGift savedStarGift, ItemOptions itemOptions, View view) {
            if (z) {
                this.parent.collections.removeGift(tL_starGiftCollection.collection_id, savedStarGift);
            } else {
                this.parent.collections.addGift(tL_starGiftCollection.collection_id, savedStarGift, true);
            }
            itemOptions.dismiss();
            this.parent.updateTabsShown(true);
        }

        public static void lambda$setReordering$2(BaseFragment baseFragment) {
            ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
        }

        public void lambda$updateEmptyView$0(View view) {
            this.list.resetFilters();
        }

        public void lambda$updateEmptyView$1(View view) {
            this.parent.addGifts();
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
                            ProfileGiftsContainer.Page.lambda$setReordering$2(BaseFragment.this);
                        }
                    });
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
            if (this.parent.list != this.list) {
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
                this.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                this.emptyView2Title.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
                this.emptyView2Layout.addView(this.emptyView2Title, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
                TextView textView2 = new TextView(getContext());
                this.emptyView2Subtitle = textView2;
                textView2.setTextSize(1, 14.0f);
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
                        ProfileGiftsContainer.Page.this.lambda$updateEmptyView$1(view);
                    }
                });
                addView(this.emptyView2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
                this.listView.setEmptyView(this.emptyView2);
                LinearLayout linearLayout2 = this.emptyView2Layout;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(this.parent.collections.isMine() ? 0 : 8);
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
            this.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.emptyView1Title.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.emptyView1Layout.addView(this.emptyView1Title, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
            TextView textView4 = new TextView(getContext());
            this.emptyView1Button = textView4;
            textView4.setTextSize(1, 14.0f);
            TextView textView5 = this.emptyView1Button;
            int i = Theme.key_featuredStickers_addButton;
            textView5.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.emptyView1Button.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.emptyView1Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ProfileGiftsContainer.Page.this.lambda$updateEmptyView$0(view);
                }
            });
            this.emptyView1Button.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.1f), 4, 4));
            ScaleStateListAnimator.apply(this.emptyView1Button);
            this.emptyView1Layout.addView(this.emptyView1Button, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            addView(this.emptyView1, LayoutHelper.createFrame(-1, -1, 119));
            this.listView.setEmptyView(this.emptyView1);
        }

        public void bind(boolean z, StarsController.GiftsList giftsList) {
            if (this.list != null) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            }
            this.isCollection = z;
            this.list = giftsList;
            giftsList.load();
            this.listView.adapter.update(false);
            if (this.list != null) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
            }
            LinearLayout linearLayout = this.emptyView2Layout;
            if (linearLayout != null) {
                linearLayout.setVisibility(this.parent.collections.isMine() ? 0 : 8);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            UniversalAdapter universalAdapter;
            if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.list) {
                UniversalRecyclerView universalRecyclerView = this.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                }
                if (isAttachedToWindow()) {
                    if (!canScrollVertically(1) || isLoadingVisible()) {
                        this.list.load();
                    }
                }
            }
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            int i;
            int i2;
            int i3;
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
            int max = Math.max(1, (giftsList3 == null || (i3 = giftsList3.totalCount) == 0) ? 3 : Math.min(3, i3));
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.setSpanCount(max);
            }
            StarsController.GiftsList giftsList4 = this.list;
            if (giftsList4 != null) {
                Iterator it = giftsList4.gifts.iterator();
                loop0: while (true) {
                    i = 3;
                    do {
                        i2 = 0;
                        r4 = false;
                        boolean z = false;
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) it.next();
                        UItem asStarGift = GiftSheet.GiftCell.Factory.asStarGift(0, savedStarGift, true, false, this.isCollection);
                        if (this.reordering && (this.list != this.parent.list || savedStarGift.pinned_to_top)) {
                            z = true;
                        }
                        arrayList.add(asStarGift.setReordering(z));
                        i--;
                    } while (i != 0);
                }
                StarsController.GiftsList giftsList5 = this.list;
                if (giftsList5.loading || !giftsList5.endReached) {
                    while (true) {
                        if (i2 >= (i <= 0 ? 3 : i)) {
                            break;
                        }
                        i2++;
                        arrayList.add(UItem.asFlicker(i2, 34).setSpanCount(1));
                    }
                }
            }
            if (this.parent.list == this.list) {
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(20.0f)));
                if (this.parent.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    arrayList.add(TextFactory.asText(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), 17, 14.0f, LocaleController.getString(R.string.ProfileGiftsInfo), true, AndroidUtilities.dp(24.0f)));
                }
            } else if (arrayList.isEmpty()) {
                return;
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
        }

        public boolean isReordering() {
            return this.reordering;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.list != null) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.list != null) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            }
        }

        public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
            Object obj = uItem.object;
            if (obj instanceof TL_stars.SavedStarGift) {
                final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!this.reordering) {
                    new StarGiftSheet(getContext(), this.currentAccount, this.parent.dialogId, this.resourcesProvider).setOnGiftUpdatedListener(new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.this.lambda$onItemClick$3();
                        }
                    }).setOnBoughtGift(new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            ProfileGiftsContainer.Page.this.lambda$onItemClick$4(savedStarGift, (TL_stars.TL_starGiftUnique) obj2, (Long) obj3);
                        }
                    }).set(savedStarGift, this.list).show();
                    return;
                }
                if (!this.isCollection && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z = !savedStarGift.pinned_to_top;
                    if (z && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = this.list.getInput(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
                    }
                    if (this.list.togglePinned(savedStarGift, z, true)) {
                        BulletinFactory.of(this.parent.fragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit)).show();
                    }
                    if (z) {
                        this.listView.scrollToPosition(0);
                    }
                }
            }
        }

        public boolean onItemLongPress(UItem uItem, final View view, int i, float f, float f2) {
            boolean z;
            boolean z2;
            final String str;
            int i2 = 0;
            if (!(view instanceof GiftSheet.GiftCell)) {
                return false;
            }
            Object obj = uItem.object;
            if (!(obj instanceof TL_stars.SavedStarGift)) {
                return false;
            }
            final GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) view;
            final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            final ItemOptions makeOptions = ItemOptions.makeOptions(this.parent.fragment, view, true);
            ProfileGiftsContainer profileGiftsContainer = this.parent;
            profileGiftsContainer.currentMenu = makeOptions;
            if (profileGiftsContainer.collections.isMine()) {
                if (!this.isCollection) {
                    this.parent.collections.getCollections().size();
                }
                final ItemOptions makeSwipeback = makeOptions.makeSwipeback();
                makeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() {
                    @Override
                    public final void run() {
                        ItemOptions.this.closeSwipeback();
                    }
                });
                makeSwipeback.addGap();
                ScrollView scrollView = new ScrollView(getContext()) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i4)), View.MeasureSpec.getMode(i4)));
                    }
                };
                LinearLayout linearLayout = new LinearLayout(getContext());
                scrollView.addView(linearLayout);
                linearLayout.setOrientation(1);
                makeSwipeback.addView(scrollView, LayoutHelper.createLinear(-1, -2));
                float f3 = 0.12f;
                if (this.parent.collections.getCollections().size() + 1 < MessagesController.getInstance(this.currentAccount).config.stargiftsCollectionsLimit.get()) {
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), false, false, this.resourcesProvider);
                    actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    int i3 = Theme.key_actionBarDefaultSubmenuItem;
                    actionBarMenuSubItem.setColors(Theme.getColor(i3, this.resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
                    actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(Theme.getColor(i3, this.resourcesProvider), 0.12f));
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add);
                    actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ProfileGiftsContainer.Page.this.lambda$onItemLongPress$8(makeOptions, savedStarGift, view2);
                        }
                    });
                    linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                }
                Iterator it = this.parent.collections.getCollections().iterator();
                while (it.hasNext()) {
                    final TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) it.next();
                    final boolean contains = this.parent.collections.getListById(tL_starGiftCollection.collection_id).contains(savedStarGift);
                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), 2, false, false, this.resourcesProvider);
                    actionBarMenuSubItem2.setChecked(contains);
                    actionBarMenuSubItem2.setPadding(AndroidUtilities.dp(18.0f), i2, AndroidUtilities.dp(18.0f), i2);
                    int i4 = Theme.key_actionBarDefaultSubmenuItem;
                    actionBarMenuSubItem2.setColors(Theme.getColor(i4, this.resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
                    actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), f3));
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
                            ProfileGiftsContainer.Page.this.lambda$onItemLongPress$9(contains, tL_starGiftCollection, savedStarGift, makeOptions, view2);
                        }
                    });
                    linearLayout.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
                    it = it;
                    f3 = 0.12f;
                    i2 = 0;
                }
                makeOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new Runnable() {
                    @Override
                    public final void run() {
                        ItemOptions.this.openSwipeback(makeSwipeback);
                    }
                });
                makeOptions.addGap();
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                if (this.parent.canReorder() && !this.isCollection && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                    boolean z3 = savedStarGift.pinned_to_top;
                    makeOptions.add(z3 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z3 ? R.string.Gift2Unpin : R.string.Gift2Pin), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.this.lambda$onItemLongPress$12(savedStarGift, giftCell, view);
                        }
                    });
                    makeOptions.addIf(savedStarGift.pinned_to_top, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.this.lambda$onItemLongPress$13();
                        }
                    });
                } else if (this.parent.canReorder() && this.isCollection) {
                    makeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.this.lambda$onItemLongPress$14();
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
                    boolean isWorn = StarGiftSheet.isWorn(this.currentAccount, tL_starGiftUnique);
                    makeOptions.add(isWorn ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(isWorn ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.Page.this.lambda$onItemLongPress$15(savedStarGift);
                        }
                    });
                }
                makeOptions.addIf(str != null, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.this.lambda$onItemLongPress$16(str);
                    }
                });
                makeOptions.addIf(str != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.this.lambda$onItemLongPress$17(savedStarGift);
                    }
                });
            } else if (this.parent.canReorder() && this.isCollection) {
                makeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.this.lambda$onItemLongPress$18();
                    }
                });
            }
            if (StarGiftSheet.isMineWithActions(this.currentAccount, this.parent.dialogId)) {
                boolean z4 = savedStarGift.unsaved;
                makeOptions.add(z4 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z4 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.this.lambda$onItemLongPress$19(savedStarGift, giftCell);
                    }
                });
            }
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                makeOptions.addIf(DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(this.currentAccount).getClientUserId(), R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.this.lambda$onItemLongPress$20(savedStarGift);
                    }
                });
            }
            if (this.parent.collections.isMine() && this.isCollection) {
                z2 = true;
                z = false;
                makeOptions.add(R.drawable.msg_removefolder, (CharSequence) LocaleController.getString(R.string.Gift2RemoveFromCollection), true, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.Page.this.lambda$onItemLongPress$21(savedStarGift, makeOptions);
                    }
                }).makeMultiline(false).cutTextInFancyHalf();
            } else {
                z = false;
                z2 = true;
            }
            if (makeOptions.getItemsCount() <= 0) {
                return z;
            }
            makeOptions.setGravity(5);
            makeOptions.setBlur(z2);
            makeOptions.allowMoveScrim();
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            makeOptions.animateToSize(min - AndroidUtilities.dp(32.0f), (int) (min * 0.6f));
            makeOptions.hideScrimUnder();
            makeOptions.forceBottom(true);
            makeOptions.show();
            giftCell.imageView.getImageReceiver().startAnimation(true);
            return true;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setVisibleHeight(this.visibleHeight);
        }

        public void resetReordering() {
            if (this.reordering) {
                this.list.sendPinnedOrder();
                setReordering(false);
            }
        }

        public void setVisibleHeight(int i) {
            this.visibleHeight = i;
            float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
            float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
            LinearLayout linearLayout = this.emptyView1Layout;
            if (linearLayout != null) {
                linearLayout.setAlpha(clamp01);
                this.emptyView1Layout.setScaleX(lerp);
                this.emptyView1Layout.setScaleY(lerp);
            }
            FrameLayout frameLayout = this.emptyView1;
            if (frameLayout != null) {
                frameLayout.setTranslationY((-(getMeasuredHeight() - this.visibleHeight)) / 2.0f);
            }
            LinearLayout linearLayout2 = this.emptyView2Layout;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(clamp01);
                this.emptyView2Layout.setScaleX(lerp);
                this.emptyView2Layout.setScaleY(lerp);
            }
            FrameLayout frameLayout2 = this.emptyView2;
            if (frameLayout2 != null) {
                frameLayout2.setTranslationY((-(getMeasuredHeight() - this.visibleHeight)) / 2.0f);
            }
        }

        public void updateColors() {
            if (this.emptyView1 == null) {
                this.emptyView2Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                this.emptyView2Subtitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
                this.emptyView2Button.updateColors();
            } else {
                this.emptyView1Title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                TextView textView = this.emptyView1Button;
                int i = Theme.key_featuredStickers_addButton;
                textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
                this.emptyView1Button.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.1f), 4, 4));
            }
        }
    }

    public static class SelectGiftsBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private UniversalAdapter adapter;
        private final ButtonWithCounterView button;
        private final FrameLayout buttonContainer;
        private final int collectionId;
        private final long dialogId;
        private final ExtendedGridLayoutManager layoutManager;
        private final StarsController.GiftsList list;
        private final HashSet selectedGiftIds;

        public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
            final long val$dialogId;
            final ActionBarMenuItem val$other;

            AnonymousClass1(ActionBarMenuItem actionBarMenuItem, long j) {
                this.val$other = actionBarMenuItem;
                this.val$dialogId = j;
            }

            public void lambda$onItemClick$0(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, ActionBarMenuSubItem actionBarMenuSubItem3, ActionBarMenuSubItem actionBarMenuSubItem4, boolean z, ActionBarMenuSubItem actionBarMenuSubItem5, ActionBarMenuSubItem actionBarMenuSubItem6) {
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(SelectGiftsBottomSheet.this.list.sort_by_date ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), SelectGiftsBottomSheet.this.list.sort_by_date ? R.drawable.menu_sort_value : R.drawable.menu_sort_date);
                }
                actionBarMenuSubItem2.setChecked(SelectGiftsBottomSheet.this.list.include_unlimited);
                actionBarMenuSubItem3.setChecked(SelectGiftsBottomSheet.this.list.include_limited);
                actionBarMenuSubItem4.setChecked(SelectGiftsBottomSheet.this.list.include_unique);
                if (z) {
                    actionBarMenuSubItem5.setChecked(SelectGiftsBottomSheet.this.list.include_displayed);
                    actionBarMenuSubItem6.setChecked(SelectGiftsBottomSheet.this.list.include_hidden);
                }
            }

            public void lambda$onItemClick$1(Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.sort_by_date = !SelectGiftsBottomSheet.this.list.sort_by_date;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }

            public void lambda$onItemClick$10(Runnable runnable, View view) {
                if (!SelectGiftsBottomSheet.this.list.include_hidden || SelectGiftsBottomSheet.this.list.include_displayed) {
                    SelectGiftsBottomSheet.this.list.include_hidden = !SelectGiftsBottomSheet.this.list.include_hidden;
                } else {
                    SelectGiftsBottomSheet.this.list.include_hidden = false;
                    SelectGiftsBottomSheet.this.list.include_displayed = true;
                }
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }

            public boolean lambda$onItemClick$11(Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.include_displayed = false;
                SelectGiftsBottomSheet.this.list.include_hidden = true;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
                return true;
            }

            public void lambda$onItemClick$2(Runnable runnable, View view) {
                if (!SelectGiftsBottomSheet.this.list.include_unlimited || SelectGiftsBottomSheet.this.list.include_limited || SelectGiftsBottomSheet.this.list.include_unique) {
                    SelectGiftsBottomSheet.this.list.include_unlimited = !SelectGiftsBottomSheet.this.list.include_unlimited;
                } else {
                    SelectGiftsBottomSheet.this.list.include_unlimited = false;
                    SelectGiftsBottomSheet.this.list.include_limited = true;
                    SelectGiftsBottomSheet.this.list.include_unique = true;
                }
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }

            public boolean lambda$onItemClick$3(Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.include_unlimited = true;
                SelectGiftsBottomSheet.this.list.include_limited = false;
                SelectGiftsBottomSheet.this.list.include_unique = false;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
                return true;
            }

            public void lambda$onItemClick$4(Runnable runnable, View view) {
                if (!SelectGiftsBottomSheet.this.list.include_limited || SelectGiftsBottomSheet.this.list.include_unlimited || SelectGiftsBottomSheet.this.list.include_unique) {
                    SelectGiftsBottomSheet.this.list.include_limited = !SelectGiftsBottomSheet.this.list.include_limited;
                } else {
                    SelectGiftsBottomSheet.this.list.include_limited = false;
                    SelectGiftsBottomSheet.this.list.include_unlimited = true;
                    SelectGiftsBottomSheet.this.list.include_unique = true;
                }
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }

            public boolean lambda$onItemClick$5(Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.include_unlimited = false;
                SelectGiftsBottomSheet.this.list.include_limited = true;
                SelectGiftsBottomSheet.this.list.include_unique = false;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
                return true;
            }

            public void lambda$onItemClick$6(Runnable runnable, View view) {
                StarsController.GiftsList giftsList;
                boolean z;
                if (!SelectGiftsBottomSheet.this.list.include_unique || SelectGiftsBottomSheet.this.list.include_limited || SelectGiftsBottomSheet.this.list.include_unlimited) {
                    giftsList = SelectGiftsBottomSheet.this.list;
                    z = !SelectGiftsBottomSheet.this.list.include_unique;
                } else {
                    SelectGiftsBottomSheet.this.list.include_limited = true;
                    SelectGiftsBottomSheet.this.list.include_unlimited = true;
                    giftsList = SelectGiftsBottomSheet.this.list;
                    z = false;
                }
                giftsList.include_unique = z;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }

            public boolean lambda$onItemClick$7(Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.include_unlimited = false;
                SelectGiftsBottomSheet.this.list.include_limited = false;
                SelectGiftsBottomSheet.this.list.include_unique = true;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
                return true;
            }

            public void lambda$onItemClick$8(Runnable runnable, View view) {
                if (!SelectGiftsBottomSheet.this.list.include_displayed || SelectGiftsBottomSheet.this.list.include_hidden) {
                    SelectGiftsBottomSheet.this.list.include_displayed = !SelectGiftsBottomSheet.this.list.include_displayed;
                } else {
                    SelectGiftsBottomSheet.this.list.include_displayed = false;
                    SelectGiftsBottomSheet.this.list.include_hidden = true;
                }
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
            }

            public boolean lambda$onItemClick$9(Runnable runnable, View view) {
                SelectGiftsBottomSheet.this.list.include_displayed = true;
                SelectGiftsBottomSheet.this.list.include_hidden = false;
                runnable.run();
                SelectGiftsBottomSheet.this.list.invalidate(true);
                return true;
            }

            @Override
            public void onItemClick(int i) {
                ActionBarMenuSubItem actionBarMenuSubItem;
                ActionBarMenuSubItem actionBarMenuSubItem2;
                final Runnable runnable;
                if (i != 1) {
                    if (i == -1) {
                        SelectGiftsBottomSheet.this.lambda$new$0();
                        return;
                    }
                    return;
                }
                SelectGiftsBottomSheet selectGiftsBottomSheet = SelectGiftsBottomSheet.this;
                ItemOptions makeOptions = ItemOptions.makeOptions(selectGiftsBottomSheet.container, ((BottomSheet) selectGiftsBottomSheet).resourcesProvider, this.val$other);
                boolean canUserDoAction = this.val$dialogId == UserConfig.getInstance(((BottomSheet) SelectGiftsBottomSheet.this).currentAccount).getClientUserId() ? true : this.val$dialogId >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(((BottomSheet) SelectGiftsBottomSheet.this).currentAccount).getChat(Long.valueOf(-this.val$dialogId)), 5);
                final ActionBarMenuSubItem add = makeOptions.add();
                makeOptions.addGap();
                final ActionBarMenuSubItem addChecked = makeOptions.addChecked();
                addChecked.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                final ActionBarMenuSubItem addChecked2 = makeOptions.addChecked();
                addChecked2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                final ActionBarMenuSubItem addChecked3 = makeOptions.addChecked();
                addChecked3.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (canUserDoAction) {
                    makeOptions.addGap();
                    ActionBarMenuSubItem addChecked4 = makeOptions.addChecked();
                    addChecked4.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    ActionBarMenuSubItem addChecked5 = makeOptions.addChecked();
                    addChecked5.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem = addChecked4;
                    actionBarMenuSubItem2 = addChecked5;
                } else {
                    actionBarMenuSubItem = null;
                    actionBarMenuSubItem2 = null;
                }
                final ActionBarMenuSubItem actionBarMenuSubItem3 = actionBarMenuSubItem;
                final boolean z = canUserDoAction;
                final ActionBarMenuSubItem actionBarMenuSubItem4 = actionBarMenuSubItem2;
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$0(add, addChecked, addChecked2, addChecked3, z, actionBarMenuSubItem3, actionBarMenuSubItem4);
                    }
                };
                runnable2.run();
                if (add != null) {
                    runnable = runnable2;
                    add.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$1(runnable, view);
                        }
                    });
                } else {
                    runnable = runnable2;
                }
                addChecked.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$2(runnable, view);
                    }
                });
                addChecked.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean lambda$onItemClick$3;
                        lambda$onItemClick$3 = ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$3(runnable, view);
                        return lambda$onItemClick$3;
                    }
                });
                addChecked2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$4(runnable, view);
                    }
                });
                addChecked2.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean lambda$onItemClick$5;
                        lambda$onItemClick$5 = ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$5(runnable, view);
                        return lambda$onItemClick$5;
                    }
                });
                addChecked3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$6(runnable, view);
                    }
                });
                addChecked3.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean lambda$onItemClick$7;
                        lambda$onItemClick$7 = ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$7(runnable, view);
                        return lambda$onItemClick$7;
                    }
                });
                if (canUserDoAction) {
                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$8(runnable, view);
                        }
                    });
                    actionBarMenuSubItem3.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public final boolean onLongClick(View view) {
                            boolean lambda$onItemClick$9;
                            lambda$onItemClick$9 = ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$9(runnable, view);
                            return lambda$onItemClick$9;
                        }
                    });
                    actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$10(runnable, view);
                        }
                    });
                    actionBarMenuSubItem4.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public final boolean onLongClick(View view) {
                            boolean lambda$onItemClick$11;
                            lambda$onItemClick$11 = ProfileGiftsContainer.SelectGiftsBottomSheet.AnonymousClass1.this.lambda$onItemClick$11(runnable, view);
                            return lambda$onItemClick$11;
                        }
                    });
                }
                makeOptions.setOnTopOfScrim().setDismissWithButtons(false).setDimAlpha(0).show();
            }
        }

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
                    ProfileGiftsContainer.SelectGiftsBottomSheet.this.lambda$new$0(callback, view2);
                }
            });
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
            ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(getContext(), 3);
            this.layoutManager = extendedGridLayoutManager;
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i3) {
                    UItem item;
                    int i4;
                    return (SelectGiftsBottomSheet.this.adapter == null || (item = SelectGiftsBottomSheet.this.adapter.getItem(i3 + (-1))) == null || (i4 = item.spanCount) == -1) ? SelectGiftsBottomSheet.this.layoutManager.getSpanCount() : i4;
                }
            });
            this.recyclerListView.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(9.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(9.0f), 0);
            this.recyclerListView.setSelectorType(9);
            this.recyclerListView.setSelectorDrawableColor(0);
            this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view2, int i3) {
                    ProfileGiftsContainer.SelectGiftsBottomSheet.this.lambda$new$1(view2, i3);
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

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            int i;
            int i2;
            if (this.list == null) {
                return;
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
            Iterator it = this.list.gifts.iterator();
            loop0: while (true) {
                i = 3;
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) it.next();
                    if (!savedStarGift.collection_id.contains(Integer.valueOf(this.collectionId))) {
                        arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, savedStarGift, true, true, false).setChecked(this.selectedGiftIds.contains(Integer.valueOf(savedStarGift.msg_id))).setSpanCount(1));
                        i--;
                        if (i == 0) {
                            break;
                        }
                    }
                }
            }
            StarsController.GiftsList giftsList = this.list;
            if (giftsList.loading || !giftsList.endReached) {
                while (true) {
                    if (i2 >= (i <= 0 ? 3 : i)) {
                        break;
                    }
                    i2++;
                    arrayList.add(UItem.asFlicker(i2, 34).setSpanCount(1));
                }
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(68.0f)));
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

        public void lambda$new$0(Utilities.Callback callback, View view) {
            TL_stars.SavedStarGift savedStarGift;
            if (this.selectedGiftIds.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.selectedGiftIds.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Iterator it2 = this.list.gifts.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        savedStarGift = null;
                        break;
                    } else {
                        savedStarGift = (TL_stars.SavedStarGift) it2.next();
                        if (savedStarGift.msg_id == intValue) {
                            break;
                        }
                    }
                }
                if (savedStarGift != null) {
                    arrayList.add(savedStarGift);
                }
            }
            callback.run(arrayList);
            lambda$new$0();
        }

        public void lambda$new$1(View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            Object obj = item.object;
            if (obj instanceof TL_stars.SavedStarGift) {
                int i2 = ((TL_stars.SavedStarGift) obj).msg_id;
                if (this.selectedGiftIds.contains(Integer.valueOf(i2))) {
                    this.selectedGiftIds.remove(Integer.valueOf(i2));
                    ((GiftSheet.GiftCell) view).setChecked(false, true);
                } else {
                    this.selectedGiftIds.add(Integer.valueOf(i2));
                    ((GiftSheet.GiftCell) view).setChecked(true, true);
                }
                this.button.setEnabled(this.selectedGiftIds.size() > 0);
                this.button.setCount(this.selectedGiftIds.size(), true);
            }
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ProfileGiftsContainer.SelectGiftsBottomSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.setApplyBackground(false);
            return this.adapter;
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

        @Override
        public void lambda$new$0() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            super.lambda$new$0();
        }

        @Override
        protected CharSequence getTitle() {
            return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
        }
    }

    public static class TextFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new TextFactory());
        }

        public static UItem asText(int i, int i2, float f, CharSequence charSequence, boolean z, int i3) {
            UItem ofFactory = UItem.ofFactory(TextFactory.class);
            ofFactory.text = charSequence;
            ofFactory.intValue = i2;
            ofFactory.longValue = i;
            ofFactory.floatValue = f;
            ofFactory.pad = i3;
            ofFactory.checked = z;
            return ofFactory;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) view;
            linksTextView.setGravity(uItem.intValue);
            linksTextView.setTextColor((int) uItem.longValue);
            linksTextView.setTextSize(1, uItem.floatValue);
            linksTextView.setTypeface(uItem.checked ? null : AndroidUtilities.bold());
            int i = uItem.pad;
            linksTextView.setPadding(i, 0, i, 0);
            linksTextView.setText(uItem.text);
        }

        @Override
        public LinkSpanDrawable.LinksTextView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new LinkSpanDrawable.LinksTextView(context) {
                @Override
                public void onMeasure(int i3, int i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
                }
            };
        }
    }

    public static class UnpinSheet extends BottomSheet {
        long selectedGift;

        public UnpinSheet(Context context, long j, final TL_stars.SavedStarGift savedStarGift, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback0Return callback0Return) {
            super(context, false, resourcesProvider);
            this.selectedGift = 0L;
            fixNavigationBar();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView makeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true, resourcesProvider);
            makeTextView.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
            linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
            TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, resourcesProvider);
            makeTextView2.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
            linearLayout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 22.0f, 4.33f, 22.0f, 10.0f));
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            final StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(j);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ProfileGiftsContainer.UnpinSheet.this.lambda$new$0(profileGiftsList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ProfileGiftsContainer.UnpinSheet.this.lambda$new$1(buttonWithCounterView, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
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
                    ProfileGiftsContainer.UnpinSheet.this.lambda$new$2(profileGiftsList, savedStarGift, callback0Return, view);
                }
            });
            setCustomView(linearLayout);
        }

        public void lambda$new$0(StarsController.GiftsList giftsList, ArrayList arrayList, UniversalAdapter universalAdapter) {
            Iterator it = giftsList.gifts.iterator();
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) it.next();
                if (savedStarGift.pinned_to_top) {
                    arrayList.add(PeerColorActivity.GiftCell.Factory.asGiftCell(savedStarGift).setChecked(this.selectedGift == savedStarGift.gift.id).setSpanCount(1));
                }
            }
        }

        public void lambda$new$1(ButtonWithCounterView buttonWithCounterView, UItem uItem, View view, Integer num, Float f, Float f2) {
            long j = ((TL_stars.SavedStarGift) uItem.object).gift.id;
            if (this.selectedGift == j) {
                this.selectedGift = 0L;
            } else {
                this.selectedGift = j;
            }
            buttonWithCounterView.setEnabled(this.selectedGift != 0);
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof PeerColorActivity.GiftCell) {
                        PeerColorActivity.GiftCell giftCell = (PeerColorActivity.GiftCell) childAt;
                        giftCell.setSelected(this.selectedGift == giftCell.getGiftId(), true);
                    }
                }
            }
        }

        public void lambda$new$2(StarsController.GiftsList giftsList, TL_stars.SavedStarGift savedStarGift, Utilities.Callback0Return callback0Return, View view) {
            TL_stars.SavedStarGift savedStarGift2;
            ArrayList pinned = giftsList.getPinned();
            int i = 0;
            while (true) {
                if (i >= pinned.size()) {
                    i = -1;
                    savedStarGift2 = null;
                    break;
                } else {
                    if (((TL_stars.SavedStarGift) pinned.get(i)).gift.id == this.selectedGift) {
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
            lambda$new$0();
            ((BulletinFactory) callback0Return.run()).createSimpleBulletin(R.raw.ic_pin, LocaleController.formatString(R.string.Gift2ReplacedPinTitle, StarGiftSheet.getGiftName(savedStarGift.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, StarGiftSheet.getGiftName(savedStarGift2.gift))).show();
        }
    }

    public ProfileGiftsContainer(final BaseFragment baseFragment, Context context, final int i, long j, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        String string;
        TLRPC.EncryptedChat encryptedChat;
        this.checkboxRequestId = -1;
        this.sendCollectionsOrder = new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$10();
            }
        };
        this.visibleHeight = AndroidUtilities.displaySize.y;
        this.fragment = baseFragment;
        this.currentAccount = i;
        this.dialogId = (!DialogObject.isEncryptedDialog(j) || (encryptedChat = MessagesController.getInstance(i).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) == null) ? j : encryptedChat.user_id;
        StarsController.getInstance(i).invalidateProfileGifts(this.dialogId);
        StarsController.GiftsList profileGiftsList = StarsController.getInstance(i).getProfileGiftsList(this.dialogId);
        this.list = profileGiftsList;
        StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(i).getProfileGiftCollectionsList(this.dialogId, true);
        this.collections = profileGiftCollectionsList;
        profileGiftCollectionsList.all = profileGiftsList;
        profileGiftsList.shown = true;
        profileGiftsList.resetFilters();
        profileGiftsList.load();
        this.resourcesProvider = resourcesProvider;
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public boolean canScroll(MotionEvent motionEvent) {
                return !ProfileGiftsContainer.this.isReordering();
            }

            @Override
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                ProfileGiftsContainer.this.updateButton();
            }

            @Override
            public void onTabScrollEnd(int i2) {
                super.onTabScrollEnd(i2);
                ProfileGiftsContainer.this.updateButton();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void applyReorder(ArrayList arrayList) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    int intValue = num.intValue();
                    if (intValue != -1 && intValue != -2) {
                        arrayList2.add(num);
                    }
                }
                ProfileGiftsContainer.this.collections.reorder(arrayList2);
                Page currentPage = ProfileGiftsContainer.this.getCurrentPage();
                if (currentPage != null) {
                    int indexOf = !currentPage.isCollection ? 0 : ProfileGiftsContainer.this.collections.indexOf(currentPage.list.collectionId) + 1;
                    ProfileGiftsContainer.this.tabsView.selectTab(indexOf, indexOf, 0.0f);
                }
                AndroidUtilities.cancelRunOnUIThread(ProfileGiftsContainer.this.sendCollectionsOrder);
                AndroidUtilities.runOnUIThread(ProfileGiftsContainer.this.sendCollectionsOrder, 1000L);
            }

            @Override
            public void bindView(View view, int i2, int i3) {
                StarsController.GiftsList listByIndex;
                boolean z;
                Page page = (Page) view;
                if (i3 == 0) {
                    listByIndex = ProfileGiftsContainer.this.list;
                    z = false;
                } else {
                    listByIndex = ProfileGiftsContainer.this.collections.getListByIndex(i2 - 1);
                    z = true;
                }
                page.bind(z, listByIndex);
                page.setVisibleHeight(ProfileGiftsContainer.this.visibleHeight);
            }

            @Override
            public boolean canReorder(int i2) {
                if (i2 == 0) {
                    return false;
                }
                return (ProfileGiftsContainer.this.canAdd() && i2 == getItemCount() - 1) ? false : true;
            }

            @Override
            public View createView(int i2) {
                if (i2 == -1) {
                    return null;
                }
                return new Page(ProfileGiftsContainer.this, i, resourcesProvider);
            }

            @Override
            public int getItemCount() {
                return ProfileGiftsContainer.this.collections.getCollections().size() + 1 + (ProfileGiftsContainer.this.canAdd() ? 1 : 0);
            }

            @Override
            public int getItemId(int i2) {
                if (i2 == 0) {
                    return -2;
                }
                if (ProfileGiftsContainer.this.canAdd() && i2 == getItemCount() - 1) {
                    return -1;
                }
                return ((TL_stars.TL_starGiftCollection) ProfileGiftsContainer.this.collections.getCollections().get(i2 - 1)).collection_id;
            }

            @Override
            public CharSequence getItemTitle(int i2) {
                if (i2 == 0) {
                    return LocaleController.getString(R.string.Gift2CollectionAll);
                }
                if (ProfileGiftsContainer.this.canAdd() && i2 == getItemCount() - 1) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ " + LocaleController.getString(R.string.Gift2NewCollection));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
                    coloredImageSpan.spaceScaleX = 0.8f;
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                    return spannableStringBuilder;
                }
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) ProfileGiftsContainer.this.collections.getCollections().get(i2 - 1);
                if (tL_starGiftCollection == null) {
                    return null;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_starGiftCollection.title);
                if (tL_starGiftCollection.icon != null) {
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("e ");
                    spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.insert(0, (CharSequence) spannableStringBuilder3);
                }
                return spannableStringBuilder2;
            }

            @Override
            public int getItemViewType(int i2) {
                if (i2 == 0) {
                    return 0;
                }
                return (ProfileGiftsContainer.this.canAdd() && i2 == getItemCount() - 1) ? 2 : 1;
            }
        });
        addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.TabsView createTabsView = viewPagerFixed.createTabsView(true, 9);
        this.tabsView = createTabsView;
        createTabsView.tabMarginDp = 12;
        createTabsView.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Boolean lambda$new$0;
                lambda$new$0 = ProfileGiftsContainer.this.lambda$new$0((Integer) obj, (Integer) obj2);
                return lambda$new$0;
            }
        });
        createTabsView.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Boolean lambda$new$5;
                lambda$new$5 = ProfileGiftsContainer.this.lambda$new$5(baseFragment, (Integer) obj, (View) obj2);
                return lambda$new$5;
            }
        });
        createTabsView.setBackgroundColor(this.backgroundColor);
        addView(createTabsView, LayoutHelper.createFrame(-1, 42, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        addView(frameLayout, LayoutHelper.createFrame(-1, -2, 87));
        View view = new View(context);
        this.buttonShadow = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, resourcesProvider));
        frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.checkboxLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
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
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-2, 38.0f, 17, 0.0f, (1.0f / AndroidUtilities.density) + 6.0f, 0.0f, 6.0f));
        ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ProfileGiftsContainer.this.lambda$new$8(resourcesProvider, i, view2);
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
            string = j2 < 0 ? LocaleController.getString(R.string.ProfileGiftsSendChannel) : LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j2));
        } else {
            string = LocaleController.getString(R.string.ProfileGiftsSend);
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
        buttonWithCounterView.setText(spannableStringBuilder, false);
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ProfileGiftsContainer.this.lambda$new$9(z, i, view2);
            }
        });
        buttonWithCounterView.setVisibility(canSwitchNotify() ? 8 : 0);
        linearLayout.setVisibility(canSwitchNotify() ? 0 : 8);
        this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
        addView(frameLayout2, LayoutHelper.createFrame(-1, 200, 87));
        updateColors();
        updateTabsShown(false);
    }

    public void lambda$addGifts$18(int i, Page page, ArrayList arrayList) {
        this.collections.addGifts(i, arrayList, true);
        page.listView.adapter.update(true);
        this.viewPager.fillTabs(true);
        updateTabsShown(true);
    }

    public void lambda$createCollection$16(TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        this.viewPager.fillTabs(true);
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        int i = tL_starGiftCollection.collection_id;
        tabsView.scrollToTab(i, this.collections.indexOf(i) + 1);
        BaseFragment baseFragment = this.fragment;
        if (baseFragment instanceof ProfileActivity) {
            ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
        }
        updateTabsShown(true);
    }

    public void lambda$createCollection$17(String str) {
        this.collections.createCollection(str, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer.this.lambda$createCollection$16((TL_stars.TL_starGiftCollection) obj);
            }
        });
    }

    public Boolean lambda$new$0(Integer num, Integer num2) {
        resetReordering();
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        createCollection();
        return Boolean.TRUE;
    }

    public void lambda$new$1(TL_stars.TL_starGiftCollection tL_starGiftCollection, String str) {
        this.collections.rename(tL_starGiftCollection.collection_id, str);
        tL_starGiftCollection.title = str;
        this.viewPager.fillTabs(true);
    }

    public void lambda$new$10() {
        this.collections.sendOrder();
    }

    public void lambda$new$2(final TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        openEnterNameAlert(tL_starGiftCollection.title, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer.this.lambda$new$1(tL_starGiftCollection, (String) obj);
            }
        });
    }

    public void lambda$new$3() {
        setReorderingCollections(true);
    }

    public void lambda$new$4(int i, TL_stars.TL_starGiftCollection tL_starGiftCollection) {
        if (i != -1) {
            this.collections.removeCollection(tL_starGiftCollection.collection_id);
            this.viewPager.fillTabs(true);
            ViewPagerFixed.TabsView tabsView = this.tabsView;
            if (i < this.collections.getCollections().size()) {
                i++;
            }
            tabsView.scrollToTab(-1, i);
            updateTabsShown(true);
        }
    }

    public Boolean lambda$new$5(BaseFragment baseFragment, Integer num, View view) {
        final TL_stars.TL_starGiftCollection tL_starGiftCollection;
        final int i = -1;
        if (num.intValue() == -1 || num.intValue() == -2 || num.intValue() == 0 || this.reorderingCollections) {
            return Boolean.FALSE;
        }
        if (!this.collections.isMine()) {
            return Boolean.FALSE;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.collections.getCollections().size()) {
                tL_starGiftCollection = null;
                break;
            }
            if (((TL_stars.TL_starGiftCollection) this.collections.getCollections().get(i2)).collection_id == num.intValue()) {
                tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.collections.getCollections().get(i2);
                i = i2;
                break;
            }
            i2++;
        }
        ItemOptions add = ItemOptions.makeOptions(baseFragment, view).setScrimViewBackground(new Drawable() {
            private final Drawable bg;
            private final Rect bgBounds = new Rect();

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
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i3) {
                this.bg.setAlpha(i3);
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        }).add(R.drawable.msg_addbot, LocaleController.getString(R.string.Gift2CollectionsAdd), new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.addGifts();
            }
        }).add(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$2(tL_starGiftCollection);
            }
        }).add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$3();
            }
        }).add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Gift2CollectionsDelete), true, new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$4(i, tL_starGiftCollection);
            }
        });
        this.currentMenu = add;
        add.show();
        return Boolean.TRUE;
    }

    public void lambda$new$6(TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider) {
        this.checkboxRequestId = -1;
        if (tL_error != null) {
            BulletinFactory.of(this.bulletinContainer, resourcesProvider).showForError(tL_error);
        }
    }

    public void lambda$new$7(final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$6(tL_error, resourcesProvider);
            }
        });
    }

    public void lambda$new$8(final Theme.ResourcesProvider resourcesProvider, int i, View view) {
        this.checkbox.setChecked(!r7.isChecked(), true);
        boolean isChecked = this.checkbox.isChecked();
        BulletinFactory.of(this.bulletinContainer, resourcesProvider).createSimpleBulletinDetail(isChecked ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(isChecked ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).show();
        this.list.chat_notifications_enabled = Boolean.valueOf(isChecked);
        if (this.checkboxRequestId >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.checkboxRequestId, true);
            this.checkboxRequestId = -1;
        }
        TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
        togglechatstargiftnotifications.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        togglechatstargiftnotifications.enabled = isChecked;
        ConnectionsManager.getInstance(i).sendRequest(togglechatstargiftnotifications, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ProfileGiftsContainer.this.lambda$new$7(resourcesProvider, tLObject, tL_error);
            }
        });
    }

    public void lambda$new$9(boolean z, int i, View view) {
        if (this.collections.isMine() && this.viewPager.getCurrentPosition() != 0) {
            addGifts();
        } else if (z) {
            new GiftSheet(getContext(), i, this.dialogId, null, null).setBirthday(BirthdayController.getInstance(i).isToday(this.dialogId)).show();
        } else {
            UserSelectorBottomSheet.open(2, 0L, BirthdayController.getInstance(i).getState());
        }
    }

    public static void lambda$openEnterNameAlert$12(EditTextCaption editTextCaption, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        String obj = editTextCaption.getText().toString();
        if (obj.length() <= 0 || obj.length() > 12) {
            AndroidUtilities.shakeView(editTextCaption);
        } else {
            callback.run(obj);
            alertDialog.dismiss();
        }
    }

    public void lambda$openEnterNameAlert$14(EditTextCaption editTextCaption, Activity activity, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editTextCaption);
        AndroidUtilities.requestAdjustResize(activity, this.fragment.getClassGuid());
    }

    public static void lambda$openEnterNameAlert$15(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    public static void lambda$setReorderingCollections$11(BaseFragment baseFragment) {
        ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
    }

    public void openEnterNameAlert(String str, final Utilities.Callback callback) {
        ActionBarPopupWindow actionBarPopupWindow;
        Context context = getContext();
        final Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
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
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, ProfileGiftsContainer.this.resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getScrollX() + getWidth(), getHeight());
                this.limit.draw(canvas);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        editTextCaption.lineYFix = true;
        editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                String obj = editTextCaption.getText().toString();
                if (obj.length() <= 0 || obj.length() > 12) {
                    AndroidUtilities.shakeView(editTextCaption);
                    return true;
                }
                callback.run(obj);
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

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
                ProfileGiftsContainer.lambda$openEnterNameAlert$12(EditTextCaption.this, callback, alertDialog, i);
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
        AndroidUtilities.requestAdjustNothing(findActivity, this.fragment.getClassGuid());
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileGiftsContainer.this.lambda$openEnterNameAlert$14(editTextCaption, findActivity, dialogInterface);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                ProfileGiftsContainer.lambda$openEnterNameAlert$15(EditTextCaption.this, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        alertDialogArr[0].setDismissDialogByButtons(false);
        boolean z = alertDialogArr[0].getButton(-1) instanceof TextView;
        editTextCaption.setSelection(editTextCaption.getText().length());
    }

    private boolean shouldHideButton(int i) {
        int i2;
        StarsController.GiftsList listByIndex;
        if (i == 0) {
            return false;
        }
        if (!(canAdd() && i == this.viewPager.adapter.getItemCount() - 1) && (i2 = i - 1) >= 0 && i2 < this.collections.getCollections().size() && (listByIndex = this.collections.getListByIndex(i2)) != null) {
            return listByIndex.gifts.isEmpty();
        }
        return true;
    }

    public void addGifts() {
        final Page currentPage = getCurrentPage();
        if (currentPage == null || !currentPage.isCollection) {
            return;
        }
        final int i = currentPage.list.collectionId;
        new SelectGiftsBottomSheet(this.fragment, this.dialogId, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer.this.lambda$addGifts$18(i, currentPage, (ArrayList) obj);
            }
        }).show();
    }

    public boolean canAdd() {
        return this.collections.isMine() && this.collections.getCollections().size() + 1 < MessagesController.getInstance(this.currentAccount).config.stargiftsCollectionsLimit.get();
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
        return j >= 0 ? j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), 5);
    }

    public boolean canScroll(boolean z) {
        return z ? this.viewPager.getCurrentPosition() >= this.collections.getCollections().size() : this.viewPager.getCurrentPosition() <= 0;
    }

    public boolean canSwitchNotify() {
        return this.dialogId < 0 && this.list.chat_notifications_enabled != null;
    }

    public void createCollection() {
        openEnterNameAlert(null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileGiftsContainer.this.lambda$createCollection$17((String) obj);
            }
        });
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != this.dialogId) {
                return;
            }
            this.button.setVisibility(canSwitchNotify() ? 8 : 0);
            this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
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
            this.viewPager.fillTabs(true);
            updateTabsShown(true);
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            this.button.setVisibility(canSwitchNotify() ? 8 : 0);
            this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
            setVisibleHeight(this.visibleHeight);
        }
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
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null && (i = giftsList.totalCount) > 0) {
            return i;
        }
        long j = this.dialogId;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        long j2 = this.dialogId;
        if (j >= 0) {
            TLRPC.UserFull userFull = messagesController.getUserFull(j2);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = messagesController.getChatFull(-j2);
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
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan((TLRPC.Document) arrayList.get(i2), 0.9f, fontMetricsInt), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        cachedLastEmojis.put(pair, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public long getLastEmojisHash() {
        StarsController.GiftsList giftsList = this.list;
        long j = 0;
        if (giftsList != null && !giftsList.gifts.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < this.list.gifts.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) this.list.gifts.get(i2)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public boolean isReordering() {
        if (this.reorderingCollections) {
            return true;
        }
        Page currentPage = getCurrentPage();
        return currentPage != null && currentPage.isReordering();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        Page currentPage = getCurrentPage();
        if (currentPage != null && currentPage.listView != null && currentPage.listView.adapter != null) {
            currentPage.listView.adapter.update(false);
        }
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            viewPagerFixed.fillTabs(false);
        }
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

    protected abstract int processColor(int i);

    public void resetReordering() {
        Page currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.resetReordering();
        }
        setReorderingCollections(false);
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
            final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment instanceof ProfileActivity) {
                ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileGiftsContainer.lambda$setReorderingCollections$11(BaseFragment.this);
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
        if (canSwitchNotify()) {
            currentPositionAlpha += (((-this.buttonContainer.getTop()) + this.visibleHeight) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1;
        }
        this.bulletinContainer.setTranslationY(currentPositionAlpha - AndroidUtilities.dp(200.0f));
        this.buttonContainer.setTranslationY(currentPositionAlpha);
        this.button.setText((!this.collections.isMine() || this.viewPager.getPositionAnimated() < 0.5f) ? this.sendGiftsToFriendsText : this.addGiftsText, true);
    }

    public void updateColors() {
        int blendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.04f));
        this.backgroundColor = blendOver;
        setBackgroundColor(blendOver);
        this.tabsView.setBackgroundColor(this.backgroundColor);
        this.button.updateColors();
        this.button.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), processColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider))));
        View[] viewPages = this.viewPager.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    ((Page) view).updateColors();
                }
            }
        }
        this.buttonContainer.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        this.buttonShadow.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        this.checkboxTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        this.checkboxLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 6, 6));
    }

    public void updateTabsShown(boolean z) {
        boolean z2 = !this.collections.getCollections().isEmpty();
        if (z) {
            ViewPropertyAnimator duration = this.tabsView.animate().translationY(z2 ? 0.0f : AndroidUtilities.dp(-42.0f)).setDuration(200L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.viewPager.animate().translationY(z2 ? AndroidUtilities.dp(30.0f) : 0.0f).setDuration(200L).setInterpolator(cubicBezierInterpolator).start();
            return;
        }
        this.tabsView.animate().cancel();
        this.tabsView.setTranslationY(z2 ? 0.0f : AndroidUtilities.dp(-42.0f));
        this.viewPager.animate().cancel();
        this.viewPager.setTranslationY(z2 ? AndroidUtilities.dp(30.0f) : 0.0f);
    }

    protected abstract void updatedReordering(boolean z);
}
