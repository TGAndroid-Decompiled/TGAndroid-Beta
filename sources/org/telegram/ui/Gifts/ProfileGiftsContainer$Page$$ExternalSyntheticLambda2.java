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
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda30;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda40;

public final class ProfileGiftsContainer$Page$$ExternalSyntheticLambda2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final ProfileGiftsContainer.Page f$0;

    public ProfileGiftsContainer$Page$$ExternalSyntheticLambda2(ProfileGiftsContainer.Page page) {
        this.f$0 = page;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ProfileGiftsContainer.Page page;
        final ProfileGiftsContainer.Page page2;
        int i2;
        boolean z;
        String str;
        boolean z2;
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ProfileGiftsContainer.Page page3 = this.f$0;
        boolean z3 = false;
        if (page3.list != null) {
            if (view instanceof GiftSheet.GiftCell) {
                Object obj6 = uItem.object;
                if (obj6 instanceof TL_stars.SavedStarGift) {
                    GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    ProfileGiftsContainer profileGiftsContainer = page3.parent;
                    final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(profileGiftsContainer.fragment, view, true);
                    profileGiftsContainer.currentMenu = itemOptionsMakeOptions;
                    boolean zIsMine = profileGiftsContainer.collections.isMine();
                    int i3 = page3.currentAccount;
                    if (zIsMine) {
                        if (!page3.isCollection) {
                            profileGiftsContainer.collections.getCollections().size();
                        }
                        ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new RichEditor$$ExternalSyntheticLambda30(1, itemOptionsMakeOptions));
                        itemOptionsMakeSwipeback.addGap();
                        ProfileGiftsContainer.Page.AnonymousClass5 anonymousClass5 = new ProfileGiftsContainer.Page.AnonymousClass5(page3.getContext());
                        LinearLayout linearLayout = new LinearLayout(page3.getContext());
                        anonymousClass5.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        itemOptionsMakeSwipeback.addView(anonymousClass5, LayoutHelper.createLinear(-1, -2));
                        int size = profileGiftsContainer.collections.getCollections().size() + 1;
                        int i4 = MessagesController.getInstance(i3).config.stargiftsCollectionsLimit.get();
                        Theme.ResourcesProvider resourcesProvider = page3.resourcesProvider;
                        if (size < i4) {
                            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, page3.getContext(), page3.resourcesProvider, false, false);
                            actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i5 = Theme.key_actionBarDefaultSubmenuItem;
                            actionBarMenuSubItem.setColors(Theme.getColor(i5, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
                            actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i5, resourcesProvider)));
                            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add);
                            actionBarMenuSubItem.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(page3, itemOptionsMakeOptions, savedStarGift, 9));
                            linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                        }
                        ArrayList collections = profileGiftsContainer.collections.getCollections();
                        int size2 = collections.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            int i7 = i6 + 1;
                            final TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) collections.get(i6);
                            ArrayList arrayList = ((StarsController.GiftsList) profileGiftsContainer.collections.gifts.get(Integer.valueOf(tL_starGiftCollection.collection_id))).gifts;
                            int size3 = arrayList.size();
                            ArrayList arrayList2 = collections;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size3) {
                                    z2 = false;
                                    break;
                                }
                                Object obj7 = arrayList.get(i8);
                                int i9 = i8 + 1;
                                if (StarsController.eq((TL_stars.SavedStarGift) obj7, savedStarGift)) {
                                    z2 = true;
                                    break;
                                }
                                i8 = i9;
                            }
                            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(2, page3.getContext(), page3.resourcesProvider, false, false);
                            actionBarMenuSubItem2.setChecked(z2);
                            final ProfileGiftsContainer.Page page4 = page3;
                            final boolean z4 = z2;
                            actionBarMenuSubItem2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i10 = Theme.key_actionBarDefaultSubmenuItem;
                            actionBarMenuSubItem2.setColors(Theme.getColor(i10, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
                            actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i10, resourcesProvider)));
                            if (tL_starGiftCollection.icon != null) {
                                ProfileGiftsContainer.Page.AnonymousClass6 anonymousClass6 = new ProfileGiftsContainer.Page.AnonymousClass6(3, i3, tL_starGiftCollection.icon);
                                anonymousClass6.addViewListening(actionBarMenuSubItem2.getImageView());
                                actionBarMenuSubItem2.setTextAndIcon(tL_starGiftCollection.title, 0, anonymousClass6);
                            } else {
                                actionBarMenuSubItem2.setTextAndIcon(tL_starGiftCollection.title, R.drawable.msg_folders);
                            }
                            LinearLayout linearLayout2 = linearLayout;
                            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view2) {
                                    ProfileGiftsContainer profileGiftsContainer2 = page4.parent;
                                    boolean z5 = z4;
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
                                    TL_stars.SavedStarGift savedStarGift2 = savedStarGift;
                                    if (z5) {
                                        StarsController.GiftsCollections giftsCollections = profileGiftsContainer2.collections;
                                        int i11 = tL_starGiftCollection2.collection_id;
                                        giftsCollections.getClass();
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(savedStarGift2);
                                        giftsCollections.removeGifts(i11, arrayList3);
                                        BulletinFactory.of(profileGiftsContainer2.fragment).createSimpleMultiBulletin(savedStarGift2.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, StarGiftSheet.getGiftName(savedStarGift2.gift), tL_starGiftCollection2.title))).show();
                                    } else {
                                        StarsController.GiftsCollections giftsCollections2 = profileGiftsContainer2.collections;
                                        int i12 = tL_starGiftCollection2.collection_id;
                                        giftsCollections2.getClass();
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(savedStarGift2);
                                        giftsCollections2.addGifts(i12, arrayList4);
                                        BulletinFactory.of(profileGiftsContainer2.fragment).createSimpleMultiBulletin(savedStarGift2.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift2.gift), tL_starGiftCollection2.title))).show();
                                    }
                                    itemOptionsMakeOptions.dismiss();
                                    profileGiftsContainer2.updateTabsShown(true);
                                }
                            });
                            linearLayout2.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
                            linearLayout = linearLayout2;
                            page3 = page4;
                            collections = arrayList2;
                            i6 = i7;
                            i3 = i3;
                            resourcesProvider = resourcesProvider;
                        }
                        i = i3;
                        page = page3;
                        itemOptionsMakeOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new RichEditor$$ExternalSyntheticLambda40(itemOptionsMakeOptions, itemOptionsMakeSwipeback, 2));
                        itemOptionsMakeOptions.addGap();
                    } else {
                        i = i3;
                        page = page3;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!profileGiftsContainer.canReorder() || page.isCollection || (savedStarGift.unsaved && savedStarGift.pinned_to_top)) {
                            page2 = page;
                            i2 = i;
                            if (profileGiftsContainer.canReorder() && page2.isCollection) {
                                itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda4(page2, 2));
                            }
                        } else {
                            boolean z5 = savedStarGift.pinned_to_top;
                            page2 = page;
                            i2 = i;
                            itemOptionsMakeOptions.add(z5 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z5 ? R.string.Gift2Unpin : R.string.Gift2Pin), new Theme$$ExternalSyntheticLambda17(18, page2, savedStarGift, giftCell, view));
                            itemOptionsMakeOptions.addIf(savedStarGift.pinned_to_top, R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda4(page2, 1));
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str = MessagesController.getInstance(i2).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str = null;
                        }
                        if (StarGiftSheet.isMineWithActions(i2, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean zIsWorn = StarGiftSheet.isWorn(i2, tL_starGiftUnique);
                            final int i11 = 1;
                            itemOptionsMakeOptions.add(zIsWorn ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(zIsWorn ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i11) {
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
                                            anonymousClass11.onSharePressed$1();
                                            break;
                                    }
                                }
                            });
                        }
                        itemOptionsMakeOptions.addIf(str != null, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new GiftSheet$$ExternalSyntheticLambda26(24, page2, str));
                        final int i12 = 2;
                        itemOptionsMakeOptions.addIf(str != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
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
                                        anonymousClass11.onSharePressed$1();
                                        break;
                                }
                            }
                        });
                    } else {
                        page2 = page;
                        i2 = i;
                        if (profileGiftsContainer.canReorder() && page2.isCollection) {
                            itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new ProfileGiftsContainer$Page$$ExternalSyntheticLambda4(page2, 3));
                        }
                    }
                    if (StarGiftSheet.isMineWithActions(i2, profileGiftsContainer.dialogId)) {
                        boolean z6 = savedStarGift.unsaved;
                        itemOptionsMakeOptions.add(z6 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z6 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new StarGiftSheet$$ExternalSyntheticLambda66(page2, savedStarGift, giftCell, 11));
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i13 = 0;
                        itemOptionsMakeOptions.addIf(DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i2).getClientUserId(), R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
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
                                        anonymousClass11.onSharePressed$1();
                                        break;
                                }
                            }
                        });
                    }
                    if (profileGiftsContainer.collections.isMine() && page2.isCollection) {
                        int i14 = R.drawable.msg_removefolder;
                        String string = LocaleController.getString(R.string.Gift2RemoveFromCollection);
                        StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66 = new StarGiftSheet$$ExternalSyntheticLambda66(page2, savedStarGift, itemOptionsMakeOptions, 12);
                        z = true;
                        itemOptionsMakeOptions.add(i14, (CharSequence) string, true, (Runnable) starGiftSheet$$ExternalSyntheticLambda66).makeMultiline(false).cutTextInFancyHalf();
                    } else {
                        z = true;
                    }
                    if (itemOptionsMakeOptions.getItemsCount() > 0) {
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
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
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
            ProfileGiftsContainer profileGiftsContainer = page.parent;
            if (!z) {
                StarGiftSheet starGiftSheet = new StarGiftSheet(page.currentAccount, page.getContext(), page.resourcesProvider, profileGiftsContainer.dialogId, null);
                starGiftSheet.onGiftUpdatedListener = new ProfileGiftsContainer$Page$$ExternalSyntheticLambda4(page, 0);
                starGiftSheet.boughtGift = new RateCallLayout$$ExternalSyntheticLambda1(13, page, savedStarGift);
                starGiftSheet.set(savedStarGift, page.list);
                starGiftSheet.show();
                return;
            }
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
                    BulletinFactory.of(profileGiftsContainer.fragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i).stargiftsPinnedToTopLimit)).show();
                }
                if (z2) {
                    return;
                }
                page.listView.scrollToPosition(0);
            }
        }
    }
}
