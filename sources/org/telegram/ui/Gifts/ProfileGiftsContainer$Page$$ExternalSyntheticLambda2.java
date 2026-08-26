package org.telegram.ui.Gifts;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda89;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda133;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;

public final class ProfileGiftsContainer$Page$$ExternalSyntheticLambda2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final ProfileGiftsContainer.Page f$0;

    public ProfileGiftsContainer$Page$$ExternalSyntheticLambda2(ProfileGiftsContainer.Page page) {
        this.f$0 = page;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        StarsController.GiftsCollections giftsCollections;
        GiftSheet.GiftCell giftCell;
        int i;
        String str;
        ProfileGiftsContainer.Page page;
        int i2;
        final ProfileGiftsContainer.Page page2;
        GiftSheet.GiftCell giftCell2;
        boolean z;
        String str2;
        boolean z2;
        Object obj6;
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ProfileGiftsContainer.Page page3 = this.f$0;
        boolean z3 = false;
        if (page3.list != null) {
            if (view instanceof GiftSheet.GiftCell) {
                Object obj7 = uItem.object;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    GiftSheet.GiftCell giftCell3 = (GiftSheet.GiftCell) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    SharedMediaLayout.AnonymousClass13 anonymousClass13 = page3.parent;
                    ItemOptions itemOptions = new ItemOptions(anonymousClass13.fragment, view, true, true);
                    anonymousClass13.currentMenu = itemOptions;
                    StarsController.GiftsCollections giftsCollections2 = anonymousClass13.collections;
                    boolean zIsMine = giftsCollections2.isMine();
                    int i3 = page3.currentAccount;
                    if (zIsMine) {
                        if (!page3.isCollection) {
                            giftsCollections2.getCollections().size();
                        }
                        ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
                        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(2, itemOptions), false);
                        itemOptionsMakeSwipeback.addGap();
                        DialogsActivity.AnonymousClass34 anonymousClass34 = new DialogsActivity.AnonymousClass34(page3.getContext(), 1);
                        LinearLayout linearLayout = new LinearLayout(page3.getContext());
                        anonymousClass34.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        itemOptionsMakeSwipeback.addView(anonymousClass34, LayoutHelper.createLinear(-1, -2));
                        int size = giftsCollections2.getCollections().size() + 1;
                        int i4 = MessagesController.getInstance(i3).config.stargiftsCollectionsLimit.get();
                        Theme.ResourcesProvider resourcesProvider = page3.resourcesProvider;
                        if (size < i4) {
                            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, page3.getContext(), page3.resourcesProvider, false, false);
                            actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i5 = Theme.key_actionBarDefaultSubmenuItem;
                            int color = Theme.getColor(i5, resourcesProvider);
                            int color2 = Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
                            actionBarMenuSubItem.setTextColor(color);
                            actionBarMenuSubItem.setIconColor(color2);
                            actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i5, resourcesProvider)));
                            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            actionBarMenuSubItem.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(page3, itemOptions, savedStarGift, 7));
                            linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                        }
                        ArrayList collections = giftsCollections2.getCollections();
                        int size2 = collections.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            int i7 = i6 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) collections.get(i6);
                            ArrayList arrayList = collections;
                            ArrayList arrayList2 = ((StarsController.GiftsList) giftsCollections2.gifts.get(Integer.valueOf(tL_starGiftCollection.collection_id))).gifts;
                            int size3 = arrayList2.size();
                            StarsController.GiftsCollections giftsCollections3 = giftsCollections2;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size3) {
                                    z2 = false;
                                    break;
                                }
                                Object obj8 = arrayList2.get(i8);
                                int i9 = i8 + 1;
                                if (StarsController.eq((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    z2 = true;
                                    break;
                                }
                                i8 = i9;
                            }
                            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(2, page3.getContext(), page3.resourcesProvider, false, false);
                            actionBarMenuSubItem2.setChecked(z2);
                            LinearLayout linearLayout2 = linearLayout;
                            ProfileGiftsContainer.Page page4 = page3;
                            actionBarMenuSubItem2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i10 = Theme.key_actionBarDefaultSubmenuItem;
                            int color3 = Theme.getColor(i10, resourcesProvider);
                            int color4 = Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
                            actionBarMenuSubItem2.setTextColor(color3);
                            actionBarMenuSubItem2.setIconColor(color4);
                            actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i10, resourcesProvider)));
                            if (tL_starGiftCollection.icon != null) {
                                ProfileGiftsContainer.Page.AnonymousClass6 anonymousClass6 = new ProfileGiftsContainer.Page.AnonymousClass6(3, i3, tL_starGiftCollection.icon);
                                actionBarMenuSubItem2.getImageView().addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(anonymousClass6, 4));
                                actionBarMenuSubItem2.setTextAndIcon(tL_starGiftCollection.title, 0, anonymousClass6);
                                obj6 = null;
                            } else {
                                obj6 = null;
                                actionBarMenuSubItem2.setTextAndIcon(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            actionBarMenuSubItem2.setOnClickListener(new ProfileGiftsContainer$Page$$ExternalSyntheticLambda16(page4, z2, tL_starGiftCollection, savedStarGift, itemOptions, 0));
                            linearLayout2.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
                            linearLayout = linearLayout2;
                            page3 = page4;
                            collections = arrayList;
                            i6 = i7;
                            giftsCollections2 = giftsCollections3;
                            giftCell3 = giftCell3;
                            resourcesProvider = resourcesProvider;
                            i3 = i3;
                        }
                        giftsCollections = giftsCollections2;
                        giftCell = giftCell3;
                        i = i3;
                        str = null;
                        page = page3;
                        itemOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new PhotoViewer$$ExternalSyntheticLambda133(itemOptions, itemOptionsMakeSwipeback, 8), false);
                        itemOptions.addGap();
                    } else {
                        giftsCollections = giftsCollections2;
                        giftCell = giftCell3;
                        i = i3;
                        str = null;
                        page = page3;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!anonymousClass13.canReorder() || page.isCollection || (savedStarGift.unsaved && savedStarGift.pinned_to_top)) {
                            i2 = i;
                            page2 = page;
                            giftCell2 = giftCell;
                            z = true;
                            if (anonymousClass13.canReorder() && page2.isCollection) {
                                itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda6(page2, 3), false);
                            }
                        } else {
                            boolean z4 = savedStarGift.pinned_to_top;
                            int i11 = z4 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            String string = LocaleController.getString(z4 ? R.string.Gift2Unpin : R.string.Gift2Pin);
                            i2 = i;
                            page2 = page;
                            GiftSheet.GiftCell giftCell4 = giftCell;
                            z = true;
                            ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(page2, savedStarGift, giftCell4, view, 28);
                            giftCell2 = giftCell4;
                            itemOptions.add(i11, string, chatUsersActivity$$ExternalSyntheticLambda13, false);
                            itemOptions.addIf(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda6(page2, 2), savedStarGift.pinned_to_top);
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i2).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (StarGiftSheet.isMineWithActions(i2, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean zIsWorn = StarGiftSheet.isWorn(i2, tL_starGiftUnique);
                            final int i12 = 1;
                            itemOptions.add(zIsWorn ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(zIsWorn ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            ProfileGiftsContainer.Page page5 = page2;
                                            page5.getClass();
                                            StarGiftSheet.AnonymousClass9 anonymousClass9 = new StarGiftSheet.AnonymousClass9(page5, page5.getContext(), page5.currentAccount, page5.parent.dialogId, page5.resourcesProvider, 3);
                                            anonymousClass9.set(savedStarGift, (StarsController.IGiftsList) null);
                                            anonymousClass9.openTransfer();
                                            break;
                                        case 1:
                                            ProfileGiftsContainer.Page page6 = page2;
                                            page6.getClass();
                                            StarGiftSheet.AnonymousClass9 anonymousClass10 = new StarGiftSheet.AnonymousClass9(page6, page6.getContext(), page6.currentAccount, page6.parent.dialogId, page6.resourcesProvider, 1);
                                            anonymousClass10.set(savedStarGift, (StarsController.IGiftsList) null);
                                            anonymousClass10.toggleWear(false);
                                            break;
                                        default:
                                            ProfileGiftsContainer.Page page7 = page2;
                                            page7.getClass();
                                            StarGiftSheet.AnonymousClass9 anonymousClass11 = new StarGiftSheet.AnonymousClass9(page7, page7.getContext(), page7.currentAccount, page7.parent.dialogId, page7.resourcesProvider, 2);
                                            anonymousClass11.set(savedStarGift, (StarsController.IGiftsList) null);
                                            anonymousClass11.onSharePressed();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        itemOptions.addIf(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new LaunchActivity$$ExternalSyntheticLambda13(10, page2, str2), str2 != null);
                        boolean z5 = str2 != null;
                        final int i13 = 2;
                        itemOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ProfileGiftsContainer.Page page5 = page2;
                                        page5.getClass();
                                        StarGiftSheet.AnonymousClass9 anonymousClass9 = new StarGiftSheet.AnonymousClass9(page5, page5.getContext(), page5.currentAccount, page5.parent.dialogId, page5.resourcesProvider, 3);
                                        anonymousClass9.set(savedStarGift, (StarsController.IGiftsList) null);
                                        anonymousClass9.openTransfer();
                                        break;
                                    case 1:
                                        ProfileGiftsContainer.Page page6 = page2;
                                        page6.getClass();
                                        StarGiftSheet.AnonymousClass9 anonymousClass10 = new StarGiftSheet.AnonymousClass9(page6, page6.getContext(), page6.currentAccount, page6.parent.dialogId, page6.resourcesProvider, 1);
                                        anonymousClass10.set(savedStarGift, (StarsController.IGiftsList) null);
                                        anonymousClass10.toggleWear(false);
                                        break;
                                    default:
                                        ProfileGiftsContainer.Page page7 = page2;
                                        page7.getClass();
                                        StarGiftSheet.AnonymousClass9 anonymousClass11 = new StarGiftSheet.AnonymousClass9(page7, page7.getContext(), page7.currentAccount, page7.parent.dialogId, page7.resourcesProvider, 2);
                                        anonymousClass11.set(savedStarGift, (StarsController.IGiftsList) null);
                                        anonymousClass11.onSharePressed();
                                        break;
                                }
                            }
                        }, z5);
                    } else {
                        i2 = i;
                        page2 = page;
                        giftCell2 = giftCell;
                        z = true;
                        if (anonymousClass13.canReorder() && page2.isCollection) {
                            itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda6(page2, 1), false);
                        }
                    }
                    if (StarGiftSheet.isMineWithActions(i2, anonymousClass13.dialogId)) {
                        boolean z6 = savedStarGift.unsaved;
                        itemOptions.add(z6 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z6 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new IntroActivity$$ExternalSyntheticLambda5(page2, savedStarGift, giftCell2, 24), false);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i14 = 0;
                        itemOptions.addIf(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        ProfileGiftsContainer.Page page5 = page2;
                                        page5.getClass();
                                        StarGiftSheet.AnonymousClass9 anonymousClass9 = new StarGiftSheet.AnonymousClass9(page5, page5.getContext(), page5.currentAccount, page5.parent.dialogId, page5.resourcesProvider, 3);
                                        anonymousClass9.set(savedStarGift, (StarsController.IGiftsList) null);
                                        anonymousClass9.openTransfer();
                                        break;
                                    case 1:
                                        ProfileGiftsContainer.Page page6 = page2;
                                        page6.getClass();
                                        StarGiftSheet.AnonymousClass9 anonymousClass10 = new StarGiftSheet.AnonymousClass9(page6, page6.getContext(), page6.currentAccount, page6.parent.dialogId, page6.resourcesProvider, 1);
                                        anonymousClass10.set(savedStarGift, (StarsController.IGiftsList) null);
                                        anonymousClass10.toggleWear(false);
                                        break;
                                    default:
                                        ProfileGiftsContainer.Page page7 = page2;
                                        page7.getClass();
                                        StarGiftSheet.AnonymousClass9 anonymousClass11 = new StarGiftSheet.AnonymousClass9(page7, page7.getContext(), page7.currentAccount, page7.parent.dialogId, page7.resourcesProvider, 2);
                                        anonymousClass11.set(savedStarGift, (StarsController.IGiftsList) null);
                                        anonymousClass11.onSharePressed();
                                        break;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i2).getClientUserId());
                    }
                    if (giftsCollections.isMine() && page2.isCollection) {
                        itemOptions.add(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new IntroActivity$$ExternalSyntheticLambda5(page2, savedStarGift, itemOptions, 25), z);
                        itemOptions.makeMultiline();
                        itemOptions.cutTextInFancyHalf();
                    }
                    if (itemOptions.getItemsCount() > 0) {
                        itemOptions.setGravity(5);
                        itemOptions.blur = z;
                        itemOptions.blurForMenu = z;
                        itemOptions.allowMoveScrim = z;
                        Point point = AndroidUtilities.displaySize;
                        int iMin = Math.min(point.x, point.y);
                        itemOptions.animateToWidth = iMin - AndroidUtilities.dp(32.0f);
                        itemOptions.animateToHeight = (int) (iMin * 0.6f);
                        itemOptions.hideScrimUnder = z;
                        itemOptions.forceBottom = z;
                        itemOptions.show();
                        giftCell2.imageView.getImageReceiver().startAnimation(z);
                        z3 = true;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
            }
        }
        return Boolean.valueOf(z3);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ProfileGiftsContainer.Page page = this.f$0;
        if (page.list == null) {
            return;
        }
        Object obj6 = uItem.object;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            boolean z = page.reordering;
            SharedMediaLayout.AnonymousClass13 anonymousClass13 = page.parent;
            if (z) {
                if (!page.isCollection && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z2 = savedStarGift.pinned_to_top;
                    boolean z3 = !z2;
                    int i = page.currentAccount;
                    if (!z2 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = page.list.getInput(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                    }
                    if (page.list.togglePinned(savedStarGift, z3, true)) {
                        BulletinFactory.of(anonymousClass13.fragment).createSimpleBulletinWithIconSize(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i).stargiftsPinnedToTopLimit)).show();
                    }
                    if (z2) {
                        return;
                    }
                    page.listView.scrollToPosition(0);
                    return;
                }
                return;
            }
            StarGiftSheet starGiftSheet = new StarGiftSheet(page.currentAccount, page.getContext(), page.resourcesProvider, anonymousClass13.dialogId, null);
            starGiftSheet.onGiftUpdatedListener = new ProfileGiftsContainer$Page$$ExternalSyntheticLambda6(page, 0);
            starGiftSheet.boughtGift = new DialogsActivity$$ExternalSyntheticLambda89(7, page, savedStarGift);
            starGiftSheet.set(savedStarGift, page.list);
            starGiftSheet.show();
        }
    }
}
