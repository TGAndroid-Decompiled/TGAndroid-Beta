package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f24782a;
    public final Object f24783b;
    public final Object f24784c;
    public final Object d;
    public final TLObject f24785e;
    public final Object f24786f;

    public b31(v31 v31Var, org.telegram.ui.ActionBar.f1 f1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f24783b = v31Var;
        this.f24784c = f1Var;
        this.d = b80Var;
        this.f24782a = j3;
        this.f24785e = user;
        this.f24786f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.x3.L0((yh.x3) this.f24783b, (TL_stars.TL_starGiftUnique) this.f24784c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f24785e, this.f24782a, (CharSequence) this.f24786f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f31((v31) this.f24783b, z10, (org.telegram.ui.ActionBar.f1) this.f24784c, (b80) this.d, this.f24782a, (TLRPC.User) this.f24785e, (TLRPC.Chat) this.f24786f));
    }

    public b31(yh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f24783b = x3Var;
        this.f24784c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f24785e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f24782a = j3;
        this.f24786f = charSequence;
    }
}
