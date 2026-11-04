package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class au implements org.telegram.ui.gs {
    public final pu f31988a;

    public au(pu puVar) {
        this.f31988a = puVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        pu puVar = this.f31988a;
        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
        if (d2Var instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) d2Var).Cb(document);
        }
        puVar.L0();
        puVar.dismiss();
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() && org.telegram.messenger.zi.I2(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.zi.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            pu puVar = this.f31988a;
            org.telegram.messenger.camera.q.r(null, 2131751185, new fc((FrameLayout) puVar.f28586b, puVar.J0));
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        boolean z10;
        if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() || !org.telegram.messenger.zi.I2(document) || (f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.l10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f27007id)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f31988a.k1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).c();
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i3) {
        pu puVar = this.f31988a;
        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
        if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).S6()) {
            if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()) {
                if (((org.telegram.ui.wm) puVar.k1).j() != null && org.telegram.messenger.l10.B(((org.telegram.ui.wm) puVar.k1).j())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f27007id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        pu puVar = this.f31988a;
        org.telegram.messenger.hp.s1(puVar.f28583a).h5(emojiStatus, null);
        cl clVar = new cl(13, this, obj);
        if (document == null) {
            sb sbVar = new sb(puVar.getContext(), puVar.J0);
            sbVar.f37963b.setText(org.telegram.messenger.bd.M0(2131746295, null));
            sbVar.f37962a.setImageResource(2131232362);
            yb ybVar = new yb(puVar.getContext(), puVar.J0, true);
            ybVar.f40672b = clVar;
            sbVar.setButton(ybVar);
            ac.f((FrameLayout) puVar.f28586b, sbVar, 1500).j();
            return;
        }
        new fc((FrameLayout) puVar.f28586b, puVar.J0).r(document, org.telegram.messenger.bd.M0(2131745555, null), org.telegram.messenger.bd.M0(2131743895, null), clVar).j();
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final org.telegram.messenger.zi z() {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.ry ryVar) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
