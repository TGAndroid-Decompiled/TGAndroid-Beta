package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hu implements org.telegram.ui.ls {
    public final wu f35336a;

    public hu(wu wuVar) {
        this.f35336a = wuVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        wu wuVar = this.f35336a;
        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
        if (e2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) e2Var).Gb(document);
        }
        wuVar.L0();
        wuVar.dismiss();
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() && org.telegram.messenger.gj.H2(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            wu wuVar = this.f35336a;
            org.telegram.messenger.i20.s(null, 2131751184, new cc((FrameLayout) wuVar.f29682b, wuVar.J0));
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
        if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() || !org.telegram.messenger.gj.H2(document) || (f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.q10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f28057id)) {
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
        org.telegram.ui.ActionBar.e2 e2Var = this.f35336a.n1;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).c();
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
        wu wuVar = this.f35336a;
        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
        if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).T6()) {
            if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q()) {
                if (((org.telegram.ui.an) wuVar.n1).j() != null && org.telegram.messenger.q10.B(((org.telegram.ui.an) wuVar.n1).j())) {
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
            tL_emojiStatus.document_id = document.f28057id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        wu wuVar = this.f35336a;
        org.telegram.messenger.np.s1(wuVar.f29679a).i5(emojiStatus, null);
        vs vsVar = new vs(2, this, obj);
        if (document == null) {
            pb pbVar = new pb(wuVar.getContext(), wuVar.J0);
            pbVar.f38262b.setText(org.telegram.messenger.hd.M0(2131746287, null));
            pbVar.f38261a.setImageResource(2131232363);
            vb vbVar = new vb(wuVar.getContext(), wuVar.J0, true);
            vbVar.f40372b = vsVar;
            pbVar.setButton(vbVar);
            xb.f((FrameLayout) wuVar.f29682b, pbVar, 1500).j();
            return;
        }
        new cc((FrameLayout) wuVar.f29682b, wuVar.J0).r(document, org.telegram.messenger.hd.M0(2131745545, null), org.telegram.messenger.hd.M0(2131743885, null), vsVar).j();
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
    public final void i(org.telegram.messenger.xy xyVar) {
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
    public final void y(CharSequence charSequence, String str, gh ghVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
