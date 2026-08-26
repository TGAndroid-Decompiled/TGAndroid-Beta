package org.telegram.ui.Stars;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.web.BotWebViewContainer;

public final class StarGiftSheet$$ExternalSyntheticLambda140 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StarGiftSheet$$ExternalSyntheticLambda140(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj) {
        StoriesController.BotPreviewsList botPreviewsList;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        Object obj4 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                Browser.Progress progress = (Browser.Progress) obj;
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj3;
                starGiftSheet.getClass();
                progress.init();
                starGiftSheet.doTransfer(((Long) obj2).longValue(), new StarGiftSheet$$ExternalSyntheticLambda140(starGiftSheet, progress, (UserSelectorBottomSheet[]) obj4, 3));
                break;
            case 1:
                AuctionBidSheet auctionBidSheet = (AuctionBidSheet) obj3;
                auctionBidSheet.getClass();
                ((boolean[]) obj2)[0] = false;
                new AcquiredGiftsSheet(auctionBidSheet.getContext(), (Theme.ResourcesProvider) obj4, auctionBidSheet.auction, (List) obj).show();
                break;
            case 2:
                List list = (List) obj;
                AuctionJoinSheet auctionJoinSheet = (AuctionJoinSheet) obj3;
                auctionJoinSheet.getClass();
                ((boolean[]) obj2)[0] = false;
                if (auctionJoinSheet.auction != null) {
                    new AcquiredGiftsSheet(auctionJoinSheet.getContext(), (Theme.ResourcesProvider) obj4, auctionJoinSheet.auction, list).show();
                    auctionJoinSheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj3;
                starGiftSheet2.getClass();
                ((Browser.Progress) obj2).end();
                ((UserSelectorBottomSheet[]) obj4)[0].lambda$showGiftOfferSheet$15();
                if (tL_error == null) {
                    starGiftSheet2.lambda$showGiftOfferSheet$15();
                } else {
                    AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(2, starGiftSheet2, tL_error));
                }
                break;
            case 4:
                PeerStoriesView.AnonymousClass5 anonymousClass5 = (PeerStoriesView.AnonymousClass5) obj3;
                anonymousClass5.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(((StoryViewer) obj2).fragment, anonymousClass5.getContext(), (DarkThemeResourceProvider) obj4, (ArrayList<TLRPC.InputStickerSet>) arrayList);
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass5.this$0).delegate;
                if (delegate != null) {
                    StoryViewer.this.showDialog(emojiPacksAlert);
                }
                break;
            case 5:
                Utilities.Callback callback = (Utilities.Callback) obj;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                if ((storyItem instanceof StoriesController.BotPreview) && (botPreviewsList = ((StoriesController.BotPreview) storyItem).list) != null) {
                    StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66 = new StarGiftSheet$$ExternalSyntheticLambda66(botPreviewsList, (TL_stories.StoryItem) obj4, callback, 28);
                    if (botPreviewsList.reqId != 0) {
                        ConnectionsManager.getInstance(botPreviewsList.currentAccount).cancelRequest(botPreviewsList.reqId, true);
                        botPreviewsList.reqId = 0;
                    }
                    botPreviewsList.loading = false;
                    botPreviewsList.loaded = false;
                    botPreviewsList.loadInternal(starGiftSheet$$ExternalSyntheticLambda66);
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(anonymousClass1.currentAccount).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(anonymousClass1.currentAccount).sendRequest(tL_stories_getStoriesByID, new StarGiftSheet$$ExternalSyntheticLambda1(anonymousClass8, storyItem, callback, 14));
                }
                break;
            case 6:
                StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = ((PeerStoriesView.AnonymousClass8) obj3).this$0;
                StoriesController storiesController = anonymousClass2.storiesController;
                long j = anonymousClass2.dialogId;
                int i = storyAlbum.album_id;
                storiesController.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TL_stories.StoryItem) obj2);
                storiesController.addStoriesToAlbum(i, j, arrayList2);
                BulletinFactory.of(anonymousClass2.storyContainer, (DarkThemeResourceProvider) obj4).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title))).show();
                break;
            case 7:
                ((BotWebViewContainer) obj3).lambda$onEventReceived$51((String) obj2, (TL_keyboard.TL_buttonTypeRequestPeer) obj4, (TLRPC.User) obj);
                break;
            default:
                ((BotWebViewContainer) obj3).lambda$onEventReceived$43((String) obj2, (String) obj4, (Boolean) obj);
                break;
        }
    }
}
