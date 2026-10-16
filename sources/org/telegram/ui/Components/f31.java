package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f24572a;
    public final Object f24573b;
    public final Object f24574c;
    public final Object d;
    public final TLObject e;
    public final Object f24575f;

    public f31(y31 y31Var, org.telegram.ui.ActionBar.e1 e1Var, l80 l80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f24573b = y31Var;
        this.f24574c = e1Var;
        this.d = l80Var;
        this.f24572a = j10;
        this.e = user;
        this.f24575f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zh.r3.M0((zh.r3) this.f24573b, (TL_stars.TL_starGiftUnique) this.f24574c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f24572a, (CharSequence) this.f24575f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j31((y31) this.f24573b, z10, (org.telegram.ui.ActionBar.e1) this.f24574c, (l80) this.d, this.f24572a, (TLRPC.User) this.e, (TLRPC.Chat) this.f24575f));
    }

    public f31(zh.r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f24573b = r3Var;
        this.f24574c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f24572a = j10;
        this.f24575f = charSequence;
    }
}
