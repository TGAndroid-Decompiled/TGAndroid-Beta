package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f24786a;
    public final Object f24787b;
    public final Object f24788c;
    public final Object d;
    public final TLObject f24789e;
    public final Object f24790f;

    public b31(v31 v31Var, org.telegram.ui.ActionBar.f1 f1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f24787b = v31Var;
        this.f24788c = f1Var;
        this.d = b80Var;
        this.f24786a = j3;
        this.f24789e = user;
        this.f24790f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.x3.L0((yh.x3) this.f24787b, (TL_stars.TL_starGiftUnique) this.f24788c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f24789e, this.f24786a, (CharSequence) this.f24790f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f31((v31) this.f24787b, z10, (org.telegram.ui.ActionBar.f1) this.f24788c, (b80) this.d, this.f24786a, (TLRPC.User) this.f24789e, (TLRPC.Chat) this.f24790f));
    }

    public b31(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f24787b = x3Var;
        this.f24788c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f24789e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f24786a = j3;
        this.f24790f = charSequence;
    }
}
