package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kw0 implements org.telegram.ui.ls {
    public final ow0 f35454a;

    public kw0(ow0 ow0Var) {
        this.f35454a = ow0Var;
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
        ow0 ow0Var = this.f35454a;
        mw0 mw0Var = ow0Var.f36705c;
        if (mw0Var != null) {
            org.telegram.ui.ActionBar.f2 parentFragment = mw0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.cn) {
                ((org.telegram.ui.cn) parentFragment).Fb(document);
                ow0Var.f36705c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (this.f35454a.D) {
            return false;
        }
        return org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q();
    }

    @Override
    public final String G(boolean z9) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        mw0 mw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new q5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf) && (mw0Var = this.f35454a.f36705c) != null) {
            org.telegram.messenger.camera.q.r(null, 2131751184, gc.a0(mw0Var.getParentFragment()));
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
        if (this.f35454a.E || !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f26966id)) {
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
        mw0 mw0Var = this.f35454a.f36705c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = mw0Var.getParentFragment();
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
        mw0 mw0Var = this.f35454a.f36705c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn cnVar = (org.telegram.ui.cn) parentFragment;
            if (cnVar.T6()) {
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q()) {
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
    public final k60 m(bi.x5 x5Var) {
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
        ow0 ow0Var = this.f35454a;
        org.telegram.ui.ActionBar.h6 h6Var = ow0Var.f36703b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f26966id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.qp.s1(ow0Var.f36701a).h5(emojiStatus, null);
        r80 r80Var = new r80(21, this, obj);
        mw0 mw0Var = ow0Var.f36705c;
        if (mw0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = mw0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                tb tbVar = new tb(ow0Var.getContext(), h6Var);
                tbVar.f38269b.setText(org.telegram.messenger.id.M0(2131746287, null));
                tbVar.f38268a.setImageResource(2131232362);
                zb zbVar = new zb(ow0Var.getContext(), h6Var, true);
                zbVar.f40908b = r80Var;
                tbVar.setButton(zbVar);
                bc.g(parentFragment, tbVar, 1500).j();
                return;
            }
            gc.a0(parentFragment).r(document, org.telegram.messenger.id.M0(2131745545, null), org.telegram.messenger.id.M0(2131743885, null), r80Var).j();
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
    public final void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
