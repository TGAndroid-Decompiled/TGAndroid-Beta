package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f27525a;
    public final Object f27526b;
    public final Object f27527c;
    public final Object d;
    public final TLObject f27528e;
    public final Object f27529f;

    public j31(d41 d41Var, org.telegram.ui.ActionBar.f1 f1Var, q80 q80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27526b = d41Var;
        this.f27527c = f1Var;
        this.d = q80Var;
        this.f27525a = j3;
        this.f27528e = user;
        this.f27529f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.s3.M0((yh.s3) this.f27526b, (TL_stars.TL_starGiftUnique) this.f27527c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f27528e, this.f27525a, (CharSequence) this.f27529f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new n31((d41) this.f27526b, z10, (org.telegram.ui.ActionBar.f1) this.f27527c, (q80) this.d, this.f27525a, (TLRPC.User) this.f27528e, (TLRPC.Chat) this.f27529f));
    }

    public j31(yh.s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27526b = s3Var;
        this.f27527c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f27528e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27525a = j3;
        this.f27529f = charSequence;
    }
}
