package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f27483a;
    public final Object f27484b;
    public final Object f27485c;
    public final Object d;
    public final TLObject e;
    public final Object f27486f;

    public q21(k31 k31Var, org.telegram.ui.ActionBar.e1 e1Var, y70 y70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27484b = k31Var;
        this.f27485c = e1Var;
        this.d = y70Var;
        this.f27483a = j3;
        this.e = user;
        this.f27486f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.x3.L0((yh.x3) this.f27484b, (TL_stars.TL_starGiftUnique) this.f27485c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f27483a, (CharSequence) this.f27486f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new u21((k31) this.f27484b, z10, (org.telegram.ui.ActionBar.e1) this.f27485c, (y70) this.d, this.f27483a, (TLRPC.User) this.e, (TLRPC.Chat) this.f27486f));
    }

    public q21(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27484b = x3Var;
        this.f27485c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27483a = j3;
        this.f27486f = charSequence;
    }
}
