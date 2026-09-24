package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f27476a;
    public final Object f27477b;
    public final Object f27478c;
    public final Object d;
    public final TLObject e;
    public final Object f27479f;

    public q21(k31 k31Var, org.telegram.ui.ActionBar.e1 e1Var, y70 y70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27477b = k31Var;
        this.f27478c = e1Var;
        this.d = y70Var;
        this.f27476a = j3;
        this.e = user;
        this.f27479f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.x3.L0((yh.x3) this.f27477b, (TL_stars.TL_starGiftUnique) this.f27478c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f27476a, (CharSequence) this.f27479f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new u21((k31) this.f27477b, z10, (org.telegram.ui.ActionBar.e1) this.f27478c, (y70) this.d, this.f27476a, (TLRPC.User) this.e, (TLRPC.Chat) this.f27479f));
    }

    public q21(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27477b = x3Var;
        this.f27478c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27476a = j3;
        this.f27479f = charSequence;
    }
}
