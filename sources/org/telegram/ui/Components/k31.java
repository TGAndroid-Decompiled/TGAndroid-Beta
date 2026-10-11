package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.z1 {
    public final long f27833a;
    public final Object f27834b;
    public final Object f27835c;
    public final Object d;
    public final TLObject f27836e;
    public final Object f27837f;

    public k31(e41 e41Var, org.telegram.ui.ActionBar.e1 e1Var, q80 q80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27834b = e41Var;
        this.f27835c = e1Var;
        this.d = q80Var;
        this.f27833a = j3;
        this.f27836e = user;
        this.f27837f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yh.s3.M0((yh.s3) this.f27834b, (TL_stars.TL_starGiftUnique) this.f27835c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f27836e, this.f27833a, (CharSequence) this.f27837f, a2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new o31((e41) this.f27834b, z10, (org.telegram.ui.ActionBar.e1) this.f27835c, (q80) this.d, this.f27833a, (TLRPC.User) this.f27836e, (TLRPC.Chat) this.f27837f));
    }

    public k31(yh.s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27834b = s3Var;
        this.f27835c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f27836e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27833a = j3;
        this.f27837f = charSequence;
    }
}
