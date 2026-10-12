package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f24583a;
    public final Object f24584b;
    public final Object f24585c;
    public final Object d;
    public final TLObject e;
    public final Object f24586f;

    public e31(y31 y31Var, org.telegram.ui.ActionBar.e1 e1Var, m80 m80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f24584b = y31Var;
        this.f24585c = e1Var;
        this.d = m80Var;
        this.f24583a = j10;
        this.e = user;
        this.f24586f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zh.r3.M0((zh.r3) this.f24584b, (TL_stars.TL_starGiftUnique) this.f24585c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f24583a, (CharSequence) this.f24586f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new i31((y31) this.f24584b, z10, (org.telegram.ui.ActionBar.e1) this.f24585c, (m80) this.d, this.f24583a, (TLRPC.User) this.e, (TLRPC.Chat) this.f24586f));
    }

    public e31(zh.r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f24584b = r3Var;
        this.f24585c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f24583a = j10;
        this.f24586f = charSequence;
    }
}
