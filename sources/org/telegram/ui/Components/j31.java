package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f27582a;
    public final Object f27583b;
    public final Object f27584c;
    public final Object d;
    public final TLObject f27585e;
    public final Object f27586f;

    public j31(d41 d41Var, org.telegram.ui.ActionBar.e1 e1Var, p80 p80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27583b = d41Var;
        this.f27584c = e1Var;
        this.d = p80Var;
        this.f27582a = j3;
        this.f27585e = user;
        this.f27586f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.s3.M0((yh.s3) this.f27583b, (TL_stars.TL_starGiftUnique) this.f27584c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f27585e, this.f27582a, (CharSequence) this.f27586f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new n31((d41) this.f27583b, z10, (org.telegram.ui.ActionBar.e1) this.f27584c, (p80) this.d, this.f27582a, (TLRPC.User) this.f27585e, (TLRPC.Chat) this.f27586f));
    }

    public j31(yh.s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27583b = s3Var;
        this.f27584c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f27585e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27582a = j3;
        this.f27586f = charSequence;
    }
}
