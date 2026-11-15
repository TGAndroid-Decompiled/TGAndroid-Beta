package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nw0 implements org.telegram.ui.ls {
    public final rw0 f37733a;

    public nw0(rw0 rw0Var) {
        this.f37733a = rw0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        rw0 rw0Var = this.f37733a;
        pw0 pw0Var = rw0Var.f39073c;
        if (pw0Var != null) {
            org.telegram.ui.ActionBar.e2 parentFragment = pw0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.an) {
                ((org.telegram.ui.an) parentFragment).Gb(document);
                rw0Var.f39073c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f37733a.E) {
            return false;
        }
        return org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q();
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
        pw0 pw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf) && (pw0Var = this.f37733a.f39073c) != null) {
            org.telegram.messenger.i20.s(null, 2131751184, cc.a0(pw0Var.getParentFragment()));
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
        if (this.f37733a.F || !org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() || (f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f()) == null) {
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
        pw0 pw0Var = this.f37733a.f39073c;
        if (pw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e2 parentFragment = pw0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.an)) {
            return false;
        }
        return ((org.telegram.ui.an) parentFragment).c();
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
        pw0 pw0Var = this.f37733a.f39073c;
        if (pw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e2 parentFragment = pw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.an) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) parentFragment;
            if (anVar.T6()) {
                if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q()) {
                    if (anVar.j() != null && org.telegram.messenger.q10.B(anVar.j())) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
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
        org.telegram.ui.ActionBar.e2 parentFragment;
        rw0 rw0Var = this.f37733a;
        org.telegram.ui.ActionBar.e6 e6Var = rw0Var.f39071b;
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
        org.telegram.messenger.np.s1(rw0Var.f39069a).i5(emojiStatus, null);
        hh0 hh0Var = new hh0(14, this, obj);
        pw0 pw0Var = rw0Var.f39073c;
        if (pw0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = pw0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                pb pbVar = new pb(rw0Var.getContext(), e6Var);
                pbVar.f38262b.setText(org.telegram.messenger.hd.M0(2131746287, null));
                pbVar.f38261a.setImageResource(2131232363);
                vb vbVar = new vb(rw0Var.getContext(), e6Var, true);
                vbVar.f40372b = hh0Var;
                pbVar.setButton(vbVar);
                xb.g(parentFragment, pbVar, 1500).j();
                return;
            }
            cc.a0(parentFragment).r(document, org.telegram.messenger.hd.M0(2131745545, null), org.telegram.messenger.hd.M0(2131743885, null), hh0Var).j();
        }
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
