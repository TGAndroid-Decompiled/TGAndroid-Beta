package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f27816a;
    public final Object f27817b;
    public final Object f27818c;
    public final Object d;
    public final TLObject e;
    public final Object f27819f;

    public r21(l31 l31Var, org.telegram.ui.ActionBar.e1 e1Var, z70 z70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27817b = l31Var;
        this.f27818c = e1Var;
        this.d = z70Var;
        this.f27816a = j3;
        this.e = user;
        this.f27819f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.x3.L0((yh.x3) this.f27817b, (TL_stars.TL_starGiftUnique) this.f27818c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f27816a, (CharSequence) this.f27819f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new v21((l31) this.f27817b, z10, (org.telegram.ui.ActionBar.e1) this.f27818c, (z70) this.d, this.f27816a, (TLRPC.User) this.e, (TLRPC.Chat) this.f27819f));
    }

    public r21(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27817b = x3Var;
        this.f27818c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27816a = j3;
        this.f27819f = charSequence;
    }
}
