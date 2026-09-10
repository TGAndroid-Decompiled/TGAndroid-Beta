package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.c2 {
    public final long f26555a;
    public final Object f26556b;
    public final Object f26557c;
    public final Object d;
    public final TLObject e;
    public final Object f26558f;

    public r21(k31 k31Var, org.telegram.ui.ActionBar.g1 g1Var, w70 w70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f26556b = k31Var;
        this.f26557c = g1Var;
        this.d = w70Var;
        this.f26555a = j3;
        this.e = user;
        this.f26558f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xh.x3.L0((xh.x3) this.f26556b, (TL_stars.TL_starGiftUnique) this.f26557c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f26555a, (CharSequence) this.f26558f, d2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new v21((k31) this.f26556b, z10, (org.telegram.ui.ActionBar.g1) this.f26557c, (w70) this.d, this.f26555a, (TLRPC.User) this.e, (TLRPC.Chat) this.f26558f));
    }

    public r21(xh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f26556b = x3Var;
        this.f26557c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f26555a = j3;
        this.f26558f = charSequence;
    }
}
