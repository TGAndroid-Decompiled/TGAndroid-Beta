package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f27216a;
    public final Object f27217b;
    public final Object f27218c;
    public final Object d;
    public final TLObject f27219e;
    public final Object f27220f;

    public i31(c41 c41Var, org.telegram.ui.ActionBar.f1 f1Var, p80 p80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f27217b = c41Var;
        this.f27218c = f1Var;
        this.d = p80Var;
        this.f27216a = j3;
        this.f27219e = user;
        this.f27220f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.s3.M0((yh.s3) this.f27217b, (TL_stars.TL_starGiftUnique) this.f27218c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f27219e, this.f27216a, (CharSequence) this.f27220f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new m31((c41) this.f27217b, z10, (org.telegram.ui.ActionBar.f1) this.f27218c, (p80) this.d, this.f27216a, (TLRPC.User) this.f27219e, (TLRPC.Chat) this.f27220f));
    }

    public i31(yh.s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f27217b = s3Var;
        this.f27218c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f27219e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f27216a = j3;
        this.f27220f = charSequence;
    }
}
