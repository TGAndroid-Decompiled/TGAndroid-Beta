package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f27739a;
    public final Object f27740b;
    public final Object f27741c;
    public final Object d;
    public final TLObject e;
    public final Object f27742f;

    public r21(l31 l31Var, org.telegram.ui.ActionBar.f1 f1Var, v70 v70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27740b = l31Var;
        this.f27741c = f1Var;
        this.d = v70Var;
        this.f27739a = j3;
        this.e = user;
        this.f27742f = chat;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.y3.L0((yh.y3) this.f27740b, (TL_stars.TL_starGiftUnique) this.f27741c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f27739a, (CharSequence) this.f27742f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new v21((l31) this.f27740b, z10, (org.telegram.ui.ActionBar.f1) this.f27741c, (v70) this.d, this.f27739a, (TLRPC.User) this.e, (TLRPC.Chat) this.f27742f));
    }

    public r21(yh.y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27740b = y3Var;
        this.f27741c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27739a = j3;
        this.f27742f = charSequence;
    }
}
