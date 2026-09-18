package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.b2 {
    public final long f23462a;
    public final Object f23463b;
    public final Object f23464c;
    public final Object d;
    public final TLObject e;
    public final Object f23465f;

    public e21(y21 y21Var, org.telegram.ui.ActionBar.g1 g1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f23463b = y21Var;
        this.f23464c = g1Var;
        this.d = n70Var;
        this.f23462a = j3;
        this.e = user;
        this.f23465f = chat;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        yh.a4.L0((yh.a4) this.f23463b, (TL_stars.TL_starGiftUnique) this.f23464c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.f23462a, (CharSequence) this.f23465f, c2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new i21((y21) this.f23463b, z10, (org.telegram.ui.ActionBar.g1) this.f23464c, (n70) this.d, this.f23462a, (TLRPC.User) this.e, (TLRPC.Chat) this.f23465f));
    }

    public e21(yh.a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f23463b = a4Var;
        this.f23464c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f23462a = j3;
        this.f23465f = charSequence;
    }
}
