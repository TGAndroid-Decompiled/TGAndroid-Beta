package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f24896a;
    public final Object f24897b;
    public final Object f24898c;
    public final Object d;
    public final TLObject f24899e;
    public final Object f24900f;

    public c21(w21 w21Var, org.telegram.ui.ActionBar.f1 f1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f24897b = w21Var;
        this.f24898c = f1Var;
        this.d = n70Var;
        this.f24896a = j3;
        this.f24899e = user;
        this.f24900f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zh.w3.L0((zh.w3) this.f24897b, (TL_stars.TL_starGiftUnique) this.f24898c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f24899e, this.f24896a, (CharSequence) this.f24900f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new g21((w21) this.f24897b, z10, (org.telegram.ui.ActionBar.f1) this.f24898c, (n70) this.d, this.f24896a, (TLRPC.User) this.f24899e, (TLRPC.Chat) this.f24900f));
    }

    public c21(zh.w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f24897b = w3Var;
        this.f24898c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f24899e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f24896a = j3;
        this.f24900f = charSequence;
    }
}
