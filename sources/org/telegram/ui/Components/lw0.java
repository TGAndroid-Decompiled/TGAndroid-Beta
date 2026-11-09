package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lw0 implements org.telegram.ui.ks {
    public final pw0 f35862a;

    public lw0(pw0 pw0Var) {
        this.f35862a = pw0Var;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void C(TLRPC.Document document) {
        pw0 pw0Var = this.f35862a;
        nw0 nw0Var = pw0Var.f37106c;
        if (nw0Var != null) {
            org.telegram.ui.ActionBar.f2 parentFragment = nw0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.cn) {
                ((org.telegram.ui.cn) parentFragment).Fb(document);
                pw0Var.f37106c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f35862a.D) {
            return false;
        }
        return org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q();
    }

    @Override
    public final String G(boolean z9) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        nw0 nw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf) && (nw0Var = this.f35862a.f37106c) != null) {
            org.telegram.messenger.camera.q.r(null, 2131751184, hc.a0(nw0Var.getParentFragment()));
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
        boolean z9;
        if (this.f35862a.E || !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f26962id)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
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
        nw0 nw0Var = this.f35862a.f37106c;
        if (nw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = nw0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.cn)) {
            return false;
        }
        return ((org.telegram.ui.cn) parentFragment).c();
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
        nw0 nw0Var = this.f35862a.f37106c;
        if (nw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = nw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) parentFragment;
            if (cnVar.T6()) {
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q()) {
                    if (cnVar.j() != null && org.telegram.messenger.t10.B(cnVar.j())) {
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
    public final l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        org.telegram.ui.ActionBar.f2 parentFragment;
        pw0 pw0Var = this.f35862a;
        org.telegram.ui.ActionBar.g6 g6Var = pw0Var.f37104b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f26962id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.qp.s1(pw0Var.f37102a).h5(emojiStatus, null);
        w80 w80Var = new w80(20, this, obj);
        nw0 nw0Var = pw0Var.f37106c;
        if (nw0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = nw0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ub ubVar = new ub(pw0Var.getContext(), g6Var);
                ubVar.f38681b.setText(org.telegram.messenger.id.M0(2131746287, null));
                ubVar.f38680a.setImageResource(2131232362);
                ac acVar = new ac(pw0Var.getContext(), g6Var, true);
                acVar.f31766b = w80Var;
                ubVar.setButton(acVar);
                cc.g(parentFragment, ubVar, 1500).j();
                return;
            }
            hc.a0(parentFragment).r(document, org.telegram.messenger.id.M0(2131745545, null), org.telegram.messenger.id.M0(2131743885, null), w80Var).j();
        }
    }

    @Override
    public final boolean y() {
        return true;
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.zy zyVar) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void K() {
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void u(CharSequence charSequence, String str, fx fxVar) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
