package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;
import org.telegram.ui.Stories.recorder.Weather$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.Weather$$ExternalSyntheticLambda4;

public final class StarsController$$ExternalSyntheticLambda119 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public StarsController$$ExternalSyntheticLambda119(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda67(starsController, tLObject, (MessageObject) this.f$1, (TLRPC.InputInvoice) this.f$2, (Utilities.Callback) this.f$3, (BulletinFactory) this.f$4, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda67(tL_error, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0, tLObject, (MessagesController) this.f$1, (TLRPC.TL_inputInvoicePremiumGiftCode) this.f$2, (BaseFragment) this.f$3, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$4, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda67(tL_error, (Utilities.Callback) this.f$3, tLObject, (MessagesController) this.f$0, (TLRPC.TL_inputInvoicePremiumGiftCode) this.f$1, (BaseFragment) this.f$2, (Utilities.Callback) this.f$4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24((int[]) this.f$0, tLObject, (MessagesController) this.f$1, (TLRPC.User[]) this.f$2, (Weather$$ExternalSyntheticLambda4) this.f$3, (Weather$$ExternalSyntheticLambda1) this.f$4, 13, false));
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda119(Utilities.Callback callback, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, BaseFragment baseFragment, Utilities.Callback callback2) {
        this.$r8$classId = 2;
        this.f$3 = callback;
        this.f$0 = messagesController;
        this.f$1 = tL_inputInvoicePremiumGiftCode;
        this.f$2 = baseFragment;
        this.f$4 = callback2;
    }
}
