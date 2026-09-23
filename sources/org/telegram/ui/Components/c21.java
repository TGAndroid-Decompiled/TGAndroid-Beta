package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f22895a;
    public final Object f22896b;
    public final Object f22897c;
    public final Object d;
    public final TLObject e;
    public final Object f22898f;

    public c21(w21 w21Var, org.telegram.ui.ActionBar.f1 f1Var, o70 o70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f22896b = w21Var;
        this.f22897c = f1Var;
        this.d = o70Var;
        this.f22895a = j3;
        this.e = user;
        this.f22898f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.y3.L0((yh.y3) this.f22896b, (TL_stars.TL_starGiftUnique) this.f22897c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f22895a, (CharSequence) this.f22898f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new g21((w21) this.f22896b, z10, (org.telegram.ui.ActionBar.f1) this.f22897c, (o70) this.d, this.f22895a, (TLRPC.User) this.e, (TLRPC.Chat) this.f22898f));
    }

    public c21(yh.y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f22896b = y3Var;
        this.f22897c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f22895a = j3;
        this.f22898f = charSequence;
    }
}
