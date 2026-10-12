package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f29041a;
    public final Object f29042b;
    public final Object f29043c;
    public final Object d;
    public final TLObject f29044e;
    public final Object f29045f;

    public o31(h41 h41Var, org.telegram.ui.ActionBar.e1 e1Var, s80 s80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f29042b = h41Var;
        this.f29043c = e1Var;
        this.d = s80Var;
        this.f29041a = j3;
        this.f29044e = user;
        this.f29045f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.s3.M0((yh.s3) this.f29042b, (TL_stars.TL_starGiftUnique) this.f29043c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f29044e, this.f29041a, (CharSequence) this.f29045f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new s31((h41) this.f29042b, z10, (org.telegram.ui.ActionBar.e1) this.f29043c, (s80) this.d, this.f29041a, (TLRPC.User) this.f29044e, (TLRPC.Chat) this.f29045f));
    }

    public o31(yh.s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f29042b = s3Var;
        this.f29043c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f29044e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f29041a = j3;
        this.f29045f = charSequence;
    }
}
