package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pu implements org.telegram.ui.ls {
    public final ev f38664a;

    public pu(ev evVar) {
        this.f38664a = evVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        ev evVar = this.f38664a;
        org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).Gb(document);
        }
        evVar.M0();
        evVar.dismiss();
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q() && org.telegram.messenger.gj.H2(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final a70 E(ai.l0 l0Var) {
        return null;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ev evVar = this.f38664a;
            org.telegram.messenger.o10.t(null, 2131751172, new lc((FrameLayout) evVar.f30176b, evVar.J0));
        }
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
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
        if (!org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q() || !org.telegram.messenger.gj.H2(document) || (f10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.p10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28440id)) {
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f38664a.n1;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).c();
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
    public final boolean k(int i7) {
        ev evVar = this.f38664a;
        org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).T6()) {
            if (!org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q()) {
                if (((org.telegram.ui.bn) evVar.n1).j() != null && org.telegram.messenger.p10.C(((org.telegram.ui.bn) evVar.n1).j())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28440id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        ev evVar = this.f38664a;
        org.telegram.messenger.np.u1(evVar.f30173a).t5(emojiStatus, null);
        ou ouVar = new ou(0, this, obj);
        if (document == null) {
            yb ybVar = new yb(evVar.getContext(), evVar.J0);
            ybVar.f42374b.setText(org.telegram.messenger.hd.N0(2131746091, null));
            ybVar.f42373a.setImageResource(2131232364);
            ec ecVar = new ec(evVar.getContext(), evVar.J0, true);
            ecVar.f34725b = ouVar;
            ybVar.setButton(ecVar);
            gc.f((FrameLayout) evVar.f30176b, ybVar, 1500).j();
            return;
        }
        new lc((FrameLayout) evVar.f30176b, evVar.J0).r(document, org.telegram.messenger.hd.N0(2131745349, null), org.telegram.messenger.hd.N0(2131743640, null), ouVar).j();
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.gj z() {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.ty tyVar) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void y(CharSequence charSequence, String str, rh rhVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
