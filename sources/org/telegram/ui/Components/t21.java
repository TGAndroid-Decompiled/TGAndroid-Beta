package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f28381a;
    public final Object f28382b;
    public final Object f28383c;
    public final Object d;
    public final TLObject e;
    public final Object f28384f;

    public t21(n31 n31Var, org.telegram.ui.ActionBar.f1 f1Var, y70 y70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f28382b = n31Var;
        this.f28383c = f1Var;
        this.d = y70Var;
        this.f28381a = j3;
        this.e = user;
        this.f28384f = chat;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.y3.L0((yh.y3) this.f28382b, (TL_stars.TL_starGiftUnique) this.f28383c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f28381a, (CharSequence) this.f28384f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new x21((n31) this.f28382b, z10, (org.telegram.ui.ActionBar.f1) this.f28383c, (y70) this.d, this.f28381a, (TLRPC.User) this.e, (TLRPC.Chat) this.f28384f));
    }

    public t21(yh.y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f28382b = y3Var;
        this.f28383c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f28381a = j3;
        this.f28384f = charSequence;
    }
}
