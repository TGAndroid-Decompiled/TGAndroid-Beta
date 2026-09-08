package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f24895a;
    public final Object f24896b;
    public final Object f24897c;
    public final Object d;
    public final TLObject f24898e;
    public final Object f24899f;

    public c21(w21 w21Var, org.telegram.ui.ActionBar.f1 f1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f24896b = w21Var;
        this.f24897c = f1Var;
        this.d = n70Var;
        this.f24895a = j3;
        this.f24898e = user;
        this.f24899f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zh.w3.L0((zh.w3) this.f24896b, (TL_stars.TL_starGiftUnique) this.f24897c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f24898e, this.f24895a, (CharSequence) this.f24899f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new g21((w21) this.f24896b, z10, (org.telegram.ui.ActionBar.f1) this.f24897c, (n70) this.d, this.f24895a, (TLRPC.User) this.f24898e, (TLRPC.Chat) this.f24899f));
    }

    public c21(zh.w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f24896b = w3Var;
        this.f24897c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f24898e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f24895a = j3;
        this.f24899f = charSequence;
    }
}
