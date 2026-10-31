package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y11 implements org.telegram.messenger.ip, org.telegram.ui.ActionBar.u1 {
    public final long f32606a;
    public final Object f32607b;
    public final Object f32608c;
    public final Object d;
    public final TLObject e;
    public final Object f32609f;

    public y11(o21 o21Var, org.telegram.ui.ActionBar.b1 b1Var, z60 z60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f32607b = o21Var;
        this.f32608c = b1Var;
        this.d = z60Var;
        this.f32606a = j10;
        this.e = user;
        this.f32609f = chat;
    }

    @Override
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.i0.g3(new org.telegram.messenger.bh((o21) this.f32607b, z10, (org.telegram.ui.ActionBar.b1) this.f32608c, (z60) this.d, this.f32606a, (TLRPC.User) this.e, (TLRPC.Chat) this.f32609f));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        rh.e4 e4Var = (rh.e4) this.f32607b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f32608c;
        CharSequence charSequence = (CharSequence) this.f32609f;
        gf.e h = x1Var.h(-1, true, true);
        h.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = ((TLRPC.PaymentForm) this.d).form_id;
        tL_payments_sendStarsForm.invoice = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e;
        ConnectionsManager.getInstance(e4Var.f21583a).sendRequest(tL_payments_sendStarsForm, new org.telegram.messenger.vm(e4Var, h, x1Var, tL_starGiftUnique, this.f32606a, charSequence, 2));
    }

    public y11(rh.e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f32607b = e4Var;
        this.f32608c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f32606a = j10;
        this.f32609f = charSequence;
    }
}
