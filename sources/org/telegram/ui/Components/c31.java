package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c31 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.a2 {
    public final long f25249a;
    public final Object f25250b;
    public final Object f25251c;
    public final Object d;
    public final TLObject f25252e;
    public final Object f25253f;

    public c31(w31 w31Var, org.telegram.ui.ActionBar.f1 f1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.f25250b = w31Var;
        this.f25251c = f1Var;
        this.d = b80Var;
        this.f25249a = j3;
        this.f25252e = user;
        this.f25253f = chat;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yh.y3.L0((yh.y3) this.f25250b, (TL_stars.TL_starGiftUnique) this.f25251c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f25252e, this.f25249a, (CharSequence) this.f25253f, b2Var);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new g31((w31) this.f25250b, z10, (org.telegram.ui.ActionBar.f1) this.f25251c, (b80) this.d, this.f25249a, (TLRPC.User) this.f25252e, (TLRPC.Chat) this.f25253f));
    }

    public c31(yh.y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.f25250b = y3Var;
        this.f25251c = tL_starGiftUnique;
        this.d = paymentForm;
        this.f25252e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f25249a = j3;
        this.f25253f = charSequence;
    }
}
