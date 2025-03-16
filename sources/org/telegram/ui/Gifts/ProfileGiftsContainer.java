package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class ProfileGiftsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private int buttonContainerHeightDp;
    private final View buttonShadow;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private int checkboxRequestId;
    private final TextView checkboxTextView;
    private final int currentAccount;
    private final long dialogId;
    private final FrameLayout emptyView;
    private final TextView emptyViewButton;
    private final TextView emptyViewTitle;
    private final BaseFragment fragment;
    private final StarsController.GiftsList list;
    private final UniversalRecyclerView listView;
    private final ItemTouchHelper reorder;
    private boolean reordering;
    private final Theme.ResourcesProvider resourcesProvider;
    private int visibleHeight;

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
        public void bindView(View view, UItem uItem, boolean z) {
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

    public ProfileGiftsContainer(final org.telegram.ui.ActionBar.BaseFragment r34, android.content.Context r35, final int r36, final long r37, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Gifts.ProfileGiftsContainer.<init>(org.telegram.ui.ActionBar.BaseFragment, android.content.Context, int, long, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    public void lambda$new$0(View view) {
        this.list.resetFilters();
    }

    public void lambda$new$1(TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider) {
        this.checkboxRequestId = -1;
        if (tL_error != null) {
            BulletinFactory.of(this.bulletinContainer, resourcesProvider).showForError(tL_error);
        }
    }

    public void lambda$new$2(final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileGiftsContainer.this.lambda$new$1(tL_error, resourcesProvider);
            }
        });
    }

    public void lambda$new$3(final Theme.ResourcesProvider resourcesProvider, int i, long j, View view) {
        this.checkbox.setChecked(!r9.isChecked(), true);
        boolean isChecked = this.checkbox.isChecked();
        BulletinFactory.of(this.bulletinContainer, resourcesProvider).createSimpleBulletinDetail(isChecked ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(isChecked ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).show();
        this.list.chat_notifications_enabled = Boolean.valueOf(isChecked);
        if (this.checkboxRequestId >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.checkboxRequestId, true);
            this.checkboxRequestId = -1;
        }
        TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
        togglechatstargiftnotifications.peer = MessagesController.getInstance(i).getInputPeer(j);
        togglechatstargiftnotifications.enabled = isChecked;
        ConnectionsManager.getInstance(i).sendRequest(togglechatstargiftnotifications, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ProfileGiftsContainer.this.lambda$new$2(resourcesProvider, tLObject, tL_error);
            }
        });
    }

    public void lambda$new$4(boolean z, int i, long j, View view) {
        if (z) {
            new GiftSheet(getContext(), i, j, null, null).setBirthday(BirthdayController.getInstance(i).isToday(j)).show();
        } else {
            UserSelectorBottomSheet.open(2, 0L, BirthdayController.getInstance(i).getState());
        }
    }

    public void lambda$onItemLongPress$10(TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell) {
        savedStarGift.unsaved = !savedStarGift.unsaved;
        giftCell.setStarsGift(savedStarGift, true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.stargift = this.list.getInput(savedStarGift);
        savestargift.unsave = savedStarGift.unsaved;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null);
        if (savedStarGift.pinned_to_top && savedStarGift.unsaved) {
            giftCell.setPinned(false, true);
            this.list.togglePinned(savedStarGift, false);
        }
    }

    public void lambda$onItemLongPress$11(TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider) {
            @Override
            protected BulletinFactory getBulletinFactory() {
                return BulletinFactory.of(ProfileGiftsContainer.this.fragment);
            }
        }.set(savedStarGift, (StarsController.GiftsList) null).openTransfer();
    }

    public void lambda$onItemLongPress$5(TL_stars.SavedStarGift savedStarGift, GiftSheet.GiftCell giftCell, View view) {
        BulletinFactory of;
        int i;
        String string;
        Bulletin createSimpleBulletin;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            giftCell.setStarsGift(savedStarGift, true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = this.list.getInput(savedStarGift);
            savestargift.unsave = savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
        }
        boolean z = !savedStarGift.pinned_to_top;
        ((GiftSheet.GiftCell) view).setPinned(z, true);
        if (this.list.togglePinned(savedStarGift, z)) {
            of = BulletinFactory.of(this.fragment);
            i = R.raw.chats_infotip;
            string = LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit);
        } else {
            of = BulletinFactory.of(this.fragment);
            if (z) {
                createSimpleBulletin = of.createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle));
                createSimpleBulletin.show();
                this.listView.smoothScrollToPosition(0);
            }
            i = R.raw.ic_unpin;
            string = LocaleController.getString(R.string.Gift2Unpinned);
        }
        createSimpleBulletin = of.createSimpleBulletin(i, string);
        createSimpleBulletin.show();
        this.listView.smoothScrollToPosition(0);
    }

    public void lambda$onItemLongPress$6() {
        setReordering(true);
    }

    public void lambda$onItemLongPress$7(TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider) {
            @Override
            protected BulletinFactory getBulletinFactory() {
                return BulletinFactory.of(ProfileGiftsContainer.this.fragment);
            }
        }.set(savedStarGift, (StarsController.GiftsList) null).toggleWear(false);
    }

    public void lambda$onItemLongPress$8(String str) {
        AndroidUtilities.addToClipboard(str);
        BulletinFactory.of(this.fragment).createCopyLinkBulletin(false).show();
    }

    public void lambda$onItemLongPress$9(TL_stars.SavedStarGift savedStarGift) {
        new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider) {
            @Override
            protected BulletinFactory getBulletinFactory() {
                return BulletinFactory.of(ProfileGiftsContainer.this.fragment);
            }
        }.set(savedStarGift, (StarsController.GiftsList) null).onSharePressed(null);
    }

    private void setReordering(boolean z) {
        if (this.reordering == z) {
            return;
        }
        this.reordering = z;
        updatedReordering(z);
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
            BaseFragment baseFragment = this.fragment;
            if (baseFragment instanceof ProfileActivity) {
                ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
            }
        }
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

    public boolean canSwitchNotify() {
        return this.dialogId < 0 && this.list.chat_notifications_enabled != null;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.starUserGiftsLoaded) {
            if (i == NotificationCenter.updateInterfaces) {
                this.button.setVisibility(canSwitchNotify() ? 8 : 0);
                this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
                this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
                setVisibleHeight(this.visibleHeight);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == this.dialogId) {
            this.button.setVisibility(canSwitchNotify() ? 8 : 0);
            this.checkboxLayout.setVisibility(canSwitchNotify() ? 0 : 8);
            this.buttonContainerHeightDp = canSwitchNotify() ? 50 : 68;
            Boolean bool = this.list.chat_notifications_enabled;
            if (bool != null) {
                this.checkbox.setChecked(bool.booleanValue(), true);
            }
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                universalAdapter.update(true);
            }
            if (!this.listView.canScrollVertically(1) || isLoadingVisible()) {
                this.list.load();
            }
        }
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        int i;
        int i2;
        int i3;
        if (this.list.hasFilters() && this.list.gifts.size() <= 0) {
            StarsController.GiftsList giftsList = this.list;
            if (giftsList.endReached && !giftsList.loading) {
                return;
            }
        }
        StarsController.GiftsList giftsList2 = this.list;
        int max = Math.max(1, (giftsList2 == null || (i3 = giftsList2.totalCount) == 0) ? 3 : Math.min(3, i3));
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.setSpanCount(max);
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
        StarsController.GiftsList giftsList3 = this.list;
        if (giftsList3 != null) {
            Iterator it = giftsList3.gifts.iterator();
            loop0: while (true) {
                i = 3;
                do {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.SavedStarGift) it.next(), true).setReordering(this.reordering));
                    i--;
                } while (i != 0);
            }
            StarsController.GiftsList giftsList4 = this.list;
            if (giftsList4.loading || !giftsList4.endReached) {
                while (true) {
                    if (i2 >= (i <= 0 ? 3 : i)) {
                        break;
                    }
                    i2++;
                    arrayList.add(UItem.asFlicker(i2, 34).setSpanCount(1));
                }
            }
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(20.0f)));
        if (this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            arrayList.add(TextFactory.asText(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), 17, 14.0f, LocaleController.getString(R.string.ProfileGiftsInfo), true, AndroidUtilities.dp(24.0f)));
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(82.0f)));
    }

    public RecyclerListView getCurrentListView() {
        return this.listView;
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
        StarsController.GiftsList giftsList = this.list;
        if (giftsList == null || giftsList.gifts.isEmpty()) {
            return "";
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

    public StarsController.GiftsList getList() {
        return this.list;
    }

    public boolean isReordering() {
        return this.reordering;
    }

    @Override
    protected void onAttachedToWindow() {
        UniversalAdapter universalAdapter;
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(false);
        }
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null) {
            giftsList.shown = true;
            giftsList.load();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        resetReordering();
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        StarsController.GiftsList giftsList = this.list;
        if (giftsList != null) {
            giftsList.shown = false;
        }
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            if (!this.reordering) {
                new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider).set(savedStarGift, this.list).show();
                return;
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                boolean z = !savedStarGift.pinned_to_top;
                if (z && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = this.list.getInput(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
                }
                if (this.list.togglePinned(savedStarGift, z)) {
                    BulletinFactory.of(this.fragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit)).show();
                }
                if (z) {
                    this.listView.smoothScrollToPosition(0);
                }
            }
        }
    }

    public boolean onItemLongPress(UItem uItem, final View view, int i, float f, float f2) {
        final String str;
        if (view instanceof GiftSheet.GiftCell) {
            Object obj = uItem.object;
            if (obj instanceof TL_stars.SavedStarGift) {
                final GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) view;
                final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                ItemOptions makeOptions = ItemOptions.makeOptions(this.fragment, view);
                if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    if (canReorder() && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                        boolean z = savedStarGift.pinned_to_top;
                        makeOptions.add(z ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z ? R.string.Gift2Unpin : R.string.Gift2Pin), new Runnable() {
                            @Override
                            public final void run() {
                                ProfileGiftsContainer.this.lambda$onItemLongPress$5(savedStarGift, giftCell, view);
                            }
                        });
                        makeOptions.addIf(savedStarGift.pinned_to_top, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                            @Override
                            public final void run() {
                                ProfileGiftsContainer.this.lambda$onItemLongPress$6();
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
                                ProfileGiftsContainer.this.lambda$onItemLongPress$7(savedStarGift);
                            }
                        });
                    }
                    makeOptions.addIf(str != null, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$8(str);
                        }
                    });
                    makeOptions.addIf(str != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$9(savedStarGift);
                        }
                    });
                }
                if (StarGiftSheet.isMineWithActions(this.currentAccount, this.dialogId)) {
                    boolean z2 = savedStarGift.unsaved;
                    makeOptions.add(z2 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z2 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$10(savedStarGift, giftCell);
                        }
                    });
                }
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    makeOptions.addIf(DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(this.currentAccount).getClientUserId(), R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileGiftsContainer.this.lambda$onItemLongPress$11(savedStarGift);
                        }
                    });
                }
                if (makeOptions.getItemsCount() <= 0) {
                    return false;
                }
                makeOptions.setGravity(3);
                makeOptions.setBlur(true);
                makeOptions.show();
                return true;
            }
        }
        return false;
    }

    protected abstract int processColor(int i);

    public void resetReordering() {
        if (this.reordering) {
            this.list.sendPinnedOrder();
            setReordering(false);
        }
    }

    public void setVisibleHeight(int i) {
        this.visibleHeight = i;
        if (!canSwitchNotify()) {
            this.bulletinContainer.setTranslationY(0.0f);
            this.buttonContainer.setTranslationY(0.0f);
        } else {
            this.bulletinContainer.setTranslationY(((((-r0.getTop()) + i) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1) - AndroidUtilities.dp(200.0f));
            this.buttonContainer.setTranslationY((((-r0.getTop()) + i) - AndroidUtilities.dp(this.buttonContainerHeightDp)) - 1);
        }
    }

    public void updateColors() {
        this.button.updateColors();
        ButtonWithCounterView buttonWithCounterView = this.button;
        int dp = AndroidUtilities.dp(8.0f);
        int i = Theme.key_featuredStickers_addButton;
        buttonWithCounterView.setBackground(Theme.createRoundRectDrawable(dp, processColor(Theme.getColor(i, this.resourcesProvider))));
        this.emptyViewTitle.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.emptyViewButton.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.emptyViewButton.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.1f), 4, 4));
        this.buttonContainer.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        this.buttonShadow.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        this.checkboxTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        this.checkboxLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 6, 6));
    }

    protected abstract void updatedReordering(boolean z);
}
