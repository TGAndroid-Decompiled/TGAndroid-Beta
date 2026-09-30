package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f28409a;
    public final Object f28410b;
    public final Object f28411c;
    public final Object d;
    public final TLObject e;
    public final Object f28412f;

    public t21(n31 n31Var, org.telegram.ui.ActionBar.e1 e1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f28410b = n31Var;
        this.f28411c = e1Var;
        this.d = b80Var;
        this.f28409a = j3;
        this.e = user;
        this.f28412f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.x3.L0((yh.x3) this.f28410b, (TL_stars.TL_starGiftUnique) this.f28411c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f28409a, (CharSequence) this.f28412f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new x21((n31) this.f28410b, z10, (org.telegram.ui.ActionBar.e1) this.f28411c, (b80) this.d, this.f28409a, (TLRPC.User) this.e, (TLRPC.Chat) this.f28412f));
    }

    public t21(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f28410b = x3Var;
        this.f28411c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f28409a = j3;
        this.f28412f = charSequence;
    }
}
