package org.telegram.ui.Stars;

import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda7;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class StarGiftSheet$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StarGiftSheet$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$show$114((TLRPC.TL_messageActionStarGift) this.f$1, (AlertDialog) this.f$2, tLObject);
                break;
            case 1:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.getClass();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17((Object) businessLinksController, tLObject, this.f$1, this.f$2, 12));
                break;
            case 2:
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                chatbotSheet.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(chatbotSheet, (TL_account.TL_connectedBot) this.f$1, (TL_account.TL_businessBotRecipients) this.f$2, 27));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(this.f$0, (Object) tLObject, this.f$1, (TLObject) this.f$2, tL_error, 5));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(tL_error, (Utilities.Callback) this.f$0, tLObject, (MessagesController) this.f$1, (Utilities.Callback) this.f$2, 7));
                break;
            case 5:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(4, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0, tL_error));
                } else if (tLObject != null) {
                    ((MessagesController) this.f$1).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21) this.f$2, 28));
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(tLObject, (MessagesController) this.f$0, (GiftSheet$$ExternalSyntheticLambda23) this.f$1, (BoostDialogs$$ExternalSyntheticLambda6) this.f$2, tL_error));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(tL_error, (Utilities.Callback) this.f$0, tLObject, (MessagesController) this.f$1, (Utilities.Callback) this.f$2, 8));
                break;
            case 8:
                UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.f$0;
                userSelectorBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((Object) userSelectorBottomSheet, (Object) tLObject, this.f$1, (TLObject) this.f$2, tL_error, 9));
                break;
            case 9:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) this.f$0;
                sendGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((Object) sendGiftSheet, (Object) tLObject, this.f$1, (Object) tL_error, this.f$2, 0));
                break;
            case 10:
                ((StarGiftSheet) this.f$0).lambda$onResellPressed$33((Browser.Progress) this.f$1, (TL_stars.TL_starGiftUnique) this.f$2, tLObject, tL_error);
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((StarsController) this.f$0, tL_error, (Utilities.Callback2) this.f$1, tLObject, (TLRPC.TL_inputInvoiceStars) this.f$2, 12));
                break;
            case 12:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(starsController, tL_error, (Utilities.Callback2) this.f$1, tLObject, (TLRPC.TL_inputInvoiceStars) this.f$2, 15));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((StarsController) this.f$0, tL_error, (Utilities.Callback2) this.f$1, tLObject, (TLRPC.TL_inputInvoiceStars) this.f$2, 17));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(this.f$0, tLObject, this.f$1, this.f$2, 28));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new BotVerifySheet$$ExternalSyntheticLambda7(0, (ButtonWithCounterView) this.f$0, tLObject, (BottomSheet) this.f$1, (BotVerifySheet$$ExternalSyntheticLambda1) this.f$2));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new BotVerifySheet$$ExternalSyntheticLambda7(tLObject, (boolean[]) this.f$0, (BotWebViewContainer$$ExternalSyntheticLambda22) this.f$1, (TLRPC.UserFull) this.f$2));
                break;
            case 17:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$12((String) this.f$1, (TLRPC.TL_inputInvoiceSlug) this.f$2, tLObject, tL_error);
                break;
            case 18:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$45((String) this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            default:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$14((String[]) this.f$1, (AlertDialog) this.f$2, tLObject, tL_error);
                break;
        }
    }
}
