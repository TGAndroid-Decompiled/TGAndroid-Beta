package org.telegram.ui.bots;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class BotAdView$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public BotAdView$$ExternalSyntheticLambda3(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                BotAdView botAdView = (BotAdView) obj4;
                ChatActivity chatActivity = (ChatActivity) obj3;
                if (chatActivity != null) {
                    botAdView.getClass();
                    chatActivity.logSponsoredClicked((MessageObject) obj2, false, false);
                }
                Browser.openUrl(botAdView.getContext(), Uri.parse((String) obj), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 1:
                ((VideoAds) obj4).lambda$show$7((ItemOptions) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 2:
                ProfileGiftsContainer.UnpinSheet unpinSheet = (ProfileGiftsContainer.UnpinSheet) obj4;
                unpinSheet.getClass();
                StarsController.GiftsList giftsList = (StarsController.GiftsList) obj3;
                ArrayList pinned = giftsList.getPinned();
                int i = 0;
                while (true) {
                    if (i >= pinned.size()) {
                        i = -1;
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) pinned.get(i)).gift.id == unpinSheet.selectedGift) {
                        savedStarGift = (TL_stars.SavedStarGift) pinned.get(i);
                    } else {
                        i++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    pinned.set(i, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = giftsList.gifts;
                    arrayList.removeAll(pinned);
                    if (giftsList.sort_by_date && !giftsList.isCollection) {
                        Collections.sort(arrayList, new CacheModel$$ExternalSyntheticLambda0(7));
                    }
                    arrayList.addAll(0, pinned);
                    NotificationCenter.getInstance(giftsList.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                    giftsList.sendPinnedOrder();
                    unpinSheet.lambda$showGiftOfferSheet$15();
                    ((BulletinFactory) ((Utilities.Callback0Return) obj).run()).createSimpleBulletin(R.raw.ic_pin, LocaleController.formatString(R.string.Gift2ReplacedPinTitle, StarGiftSheet.getGiftName(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, StarGiftSheet.getGiftName(savedStarGift.gift))).show();
                    break;
                }
                break;
            case 3:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass8) obj4).this$0;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null) {
                    anonymousClass8.dismiss();
                }
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                storyItem.dialogId = anonymousClass1.dialogId;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(anonymousClass1.currentAccount, storyItem);
                messageObject.generateThumbs(false);
                ((StoryViewer) obj2).presentFragment(new PeerStoriesView.AnonymousClass8.AnonymousClass1(messageObject, ((TLRPC.Chat) obj).id, false));
                break;
            case 4:
                String[] strArr = (String[]) obj4;
                strArr[0] = ((BotStorage.StorageConfig) obj3).storage_id;
                ArrayList arrayList2 = (ArrayList) obj2;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj5 = arrayList2.get(i2);
                    i2++;
                    BotStorage.C1StorageCell c1StorageCell = (BotStorage.C1StorageCell) obj5;
                    c1StorageCell.radioButton.setChecked(TextUtils.equals(c1StorageCell.id, strArr[0]), true);
                }
                ((ButtonWithCounterView) obj).setEnabled(strArr[0] != null);
                break;
            default:
                boolean[] zArr = (boolean[]) obj4;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((GiftSheet$$ExternalSyntheticLambda23) obj3).run(((String[]) obj2)[0]);
                }
                ((BottomSheet) obj).lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
