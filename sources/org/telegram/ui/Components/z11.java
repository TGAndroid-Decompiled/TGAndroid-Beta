package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z11 implements org.telegram.messenger.jp, org.telegram.ui.ActionBar.u1 {
    public final long f32966a;
    public final Object f32967b;
    public final Object f32968c;
    public final Object d;
    public final TLObject e;
    public final Object f32969f;

    public z11(p21 p21Var, org.telegram.ui.ActionBar.b1 b1Var, z60 z60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f32967b = p21Var;
        this.f32968c = b1Var;
        this.d = z60Var;
        this.f32966a = j10;
        this.e = user;
        this.f32969f = chat;
    }

    @Override
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.i0.g3(new org.telegram.messenger.ch((p21) this.f32967b, z10, (org.telegram.ui.ActionBar.b1) this.f32968c, (z60) this.d, this.f32966a, (TLRPC.User) this.e, (TLRPC.Chat) this.f32969f));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        rh.e4 e4Var = (rh.e4) this.f32967b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f32968c;
        CharSequence charSequence = (CharSequence) this.f32969f;
        gf.e h = x1Var.h(-1, true, true);
        h.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = ((TLRPC.PaymentForm) this.d).form_id;
        tL_payments_sendStarsForm.invoice = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e;
        ConnectionsManager.getInstance(e4Var.f21584a).sendRequest(tL_payments_sendStarsForm, new org.telegram.messenger.wm(e4Var, h, x1Var, tL_starGiftUnique, this.f32966a, charSequence, 2));
    }

    public z11(rh.e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.f32967b = e4Var;
        this.f32968c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f32966a = j10;
        this.f32969f = charSequence;
    }
}
