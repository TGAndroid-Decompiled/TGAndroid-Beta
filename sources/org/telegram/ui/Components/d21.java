package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f23191a;
    public final Object f23192b;
    public final Object f23193c;
    public final Object d;
    public final TLObject e;
    public final Object f23194f;

    public d21(x21 x21Var, org.telegram.ui.ActionBar.f1 f1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f23192b = x21Var;
        this.f23193c = f1Var;
        this.d = n70Var;
        this.f23191a = j3;
        this.e = user;
        this.f23194f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.a4.L0((yh.a4) this.f23192b, (TL_stars.TL_starGiftUnique) this.f23193c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f23191a, (CharSequence) this.f23194f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new h21((x21) this.f23192b, z10, (org.telegram.ui.ActionBar.f1) this.f23193c, (n70) this.d, this.f23191a, (TLRPC.User) this.e, (TLRPC.Chat) this.f23194f));
    }

    public d21(yh.a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f23192b = a4Var;
        this.f23193c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f23191a = j3;
        this.f23194f = charSequence;
    }
}
