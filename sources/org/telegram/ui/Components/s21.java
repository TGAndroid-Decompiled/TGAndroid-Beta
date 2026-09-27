package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.b2 {
    public final long f28149a;
    public final Object f28150b;
    public final Object f28151c;
    public final Object d;
    public final TLObject e;
    public final Object f28152f;

    public s21(m31 m31Var, org.telegram.ui.ActionBar.g1 g1Var, a80 a80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f28150b = m31Var;
        this.f28151c = g1Var;
        this.d = a80Var;
        this.f28149a = j3;
        this.e = user;
        this.f28152f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        yh.x3.L0((yh.x3) this.f28150b, (TL_stars.TL_starGiftUnique) this.f28151c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f28149a, (CharSequence) this.f28152f, c2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new w21((m31) this.f28150b, z10, (org.telegram.ui.ActionBar.g1) this.f28151c, (a80) this.d, this.f28149a, (TLRPC.User) this.e, (TLRPC.Chat) this.f28152f));
    }

    public s21(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f28150b = x3Var;
        this.f28151c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f28149a = j3;
        this.f28152f = charSequence;
    }
}
