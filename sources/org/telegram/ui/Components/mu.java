package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mu implements org.telegram.ui.ls {
    public final bv f37627a;

    public mu(bv bvVar) {
        this.f37627a = bvVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        bv bvVar = this.f37627a;
        org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
        if (h2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) h2Var).Gb(document);
        }
        bvVar.M0();
        bvVar.dismiss();
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q() && org.telegram.messenger.fj.H2(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            bv bvVar = this.f37627a;
            org.telegram.messenger.n10.t(null, 2131751173, new lc((FrameLayout) bvVar.f30190b, bvVar.J0));
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
        if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q() || !org.telegram.messenger.fj.H2(document) || (f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.o10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28409id)) {
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
        org.telegram.ui.ActionBar.h2 h2Var = this.f37627a.n1;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) h2Var).c();
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
        bv bvVar = this.f37627a;
        org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
        if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).T6()) {
            if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q()) {
                if (((org.telegram.ui.bn) bvVar.n1).j() != null && org.telegram.messenger.o10.C(((org.telegram.ui.bn) bvVar.n1).j())) {
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
            tL_emojiStatus.document_id = document.f28409id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        bv bvVar = this.f37627a;
        org.telegram.messenger.mp.u1(bvVar.f30187a).t5(emojiStatus, null);
        mg mgVar = new mg(28, this, obj);
        if (document == null) {
            yb ybVar = new yb(bvVar.getContext(), bvVar.J0);
            ybVar.f42447b.setText(org.telegram.messenger.gd.M0(2131746092, null));
            ybVar.f42446a.setImageResource(2131232364);
            ec ecVar = new ec(bvVar.getContext(), bvVar.J0, true);
            ecVar.f34666b = mgVar;
            ybVar.setButton(ecVar);
            gc.f((FrameLayout) bvVar.f30190b, ybVar, 1500).j();
            return;
        }
        new lc((FrameLayout) bvVar.f30190b, bvVar.J0).r(document, org.telegram.messenger.gd.M0(2131745350, null), org.telegram.messenger.gd.M0(2131743648, null), mgVar).j();
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.fj z() {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.sy syVar) {
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
    public final void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
