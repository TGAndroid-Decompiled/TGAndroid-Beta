package org.telegram.ui.Gifts;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda73;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryEntry$$ExternalSyntheticLambda12;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.web.BotWebViewContainer;

public final class GiftSheet$$ExternalSyntheticLambda16 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public GiftSheet$$ExternalSyntheticLambda16(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                GiftSheet giftSheet = (GiftSheet) obj2;
                giftSheet.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(giftSheet, (AlertDialog) obj, tLObject, (GiftSheet$$ExternalSyntheticLambda15) obj4, (Utilities.Callback) obj3, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24((MentionsAdapter.AnonymousClass4) obj2, (String) obj, tL_error, tLObject, (MessagesController) obj4, (MessagesStorage) obj3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(obj2, obj, tLObject, obj4, obj3, 2));
                break;
            case 3:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(starGiftSheet, tLObject, (CharSequence) obj, (TL_stars.TL_starGiftUnique) obj4, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj3, tL_error, 5, false));
                break;
            case 4:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj2;
                starGiftSheet2.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(starGiftSheet2, tLObject, (UserSelectorBottomSheet[]) obj, (Long) obj4, (StarGiftSheet$$ExternalSyntheticLambda66) obj3, tL_error, 6, false));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24((StarsController) obj2, tLObject, (MessageObject) obj, (TLRPC.TL_inputInvoiceMessage) obj4, (LaunchActivity$$ExternalSyntheticLambda73) obj3, tL_error, 9, false));
                break;
            case 6:
                StarsController starsController = (StarsController) obj2;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((Object) starsController, obj, tLObject, obj4, obj3, 14));
                break;
            case 7:
                StarsController.GiftsCollections giftsCollections = (StarsController.GiftsCollections) obj2;
                giftsCollections.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(giftsCollections, tLObject, (TL_stars.TL_starGiftCollection) obj, (StarsController.GiftsList) obj4, (Utilities.Callback) obj3, tL_error, 11, false));
                break;
            case 8:
                PeerStoriesView peerStoriesView = (PeerStoriesView) obj2;
                peerStoriesView.getClass();
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(peerStoriesView, (ButtonWithCounterView$$ExternalSyntheticLambda1) obj, tL_error, (TL_stories.StoryItem) obj4, (StoryPrivacyBottomSheet.StoryPrivacy) obj3));
                break;
            case 9:
                StoryEntry storyEntry = (StoryEntry) obj2;
                storyEntry.getClass();
                StoryEntry$$ExternalSyntheticLambda12 storyEntry$$ExternalSyntheticLambda12 = (StoryEntry$$ExternalSyntheticLambda12) obj3;
                if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || (storyItem = (TL_stories.StoryItem) obj) == null) {
                    storyEntry$$ExternalSyntheticLambda12.run(tLObject, tL_error);
                } else {
                    FileRefController.getInstance(storyEntry.currentAccount).requestReference(storyItem, (TLRPC.TL_messages_getAttachedStickers) obj4, storyEntry$$ExternalSyntheticLambda12);
                }
                break;
            default:
                ((BotWebViewContainer) obj2).lambda$onWebEventReceived$6((TLRPC.TL_messages_requestUrlAuth) obj, (String) obj4, (String) obj3, tLObject, tL_error);
                break;
        }
    }
}
