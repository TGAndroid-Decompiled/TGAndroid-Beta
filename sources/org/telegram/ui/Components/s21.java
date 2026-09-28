package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f28114a;
    public final Object f28115b;
    public final Object f28116c;
    public final Object d;
    public final TLObject e;
    public final Object f28117f;

    public s21(m31 m31Var, org.telegram.ui.ActionBar.e1 e1Var, a80 a80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f28115b = m31Var;
        this.f28116c = e1Var;
        this.d = a80Var;
        this.f28114a = j3;
        this.e = user;
        this.f28117f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.x3.L0((yh.x3) this.f28115b, (TL_stars.TL_starGiftUnique) this.f28116c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f28114a, (CharSequence) this.f28117f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new w21((m31) this.f28115b, z10, (org.telegram.ui.ActionBar.e1) this.f28116c, (a80) this.d, this.f28114a, (TLRPC.User) this.e, (TLRPC.Chat) this.f28117f));
    }

    public s21(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f28115b = x3Var;
        this.f28116c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f28114a = j3;
        this.f28117f = charSequence;
    }
}
