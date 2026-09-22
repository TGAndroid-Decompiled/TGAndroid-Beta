package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f23190a;
    public final Object f23191b;
    public final Object f23192c;
    public final Object d;
    public final TLObject e;
    public final Object f23193f;

    public d21(x21 x21Var, org.telegram.ui.ActionBar.f1 f1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f23191b = x21Var;
        this.f23192c = f1Var;
        this.d = n70Var;
        this.f23190a = j3;
        this.e = user;
        this.f23193f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.z3.L0((yh.z3) this.f23191b, (TL_stars.TL_starGiftUnique) this.f23192c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f23190a, (CharSequence) this.f23193f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new h21((x21) this.f23191b, z10, (org.telegram.ui.ActionBar.f1) this.f23192c, (n70) this.d, this.f23190a, (TLRPC.User) this.e, (TLRPC.Chat) this.f23193f));
    }

    public d21(yh.z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f23191b = z3Var;
        this.f23192c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f23190a = j3;
        this.f23193f = charSequence;
    }
}
