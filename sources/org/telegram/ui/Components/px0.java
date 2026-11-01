package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px0 implements org.telegram.ui.ht {
    public final tx0 f29562a;

    public px0(tx0 tx0Var) {
        this.f29562a = tx0Var;
    }

    @Override
    public final void A(TLRPC.Document document) {
        tx0 tx0Var = this.f29562a;
        rx0 rx0Var = tx0Var.f30732c;
        if (rx0Var != null) {
            org.telegram.ui.ActionBar.k2 parentFragment = rx0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.un) {
                ((org.telegram.ui.un) parentFragment).xb(document);
                tx0Var.f30732c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (this.f29562a.D) {
            return false;
        }
        return org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q();
    }

    @Override
    public final z60 D(fg.i iVar) {
        return null;
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        rx0 rx0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.kj.U(document));
        valueOf.setSpan(new o5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.i0.g(valueOf) && (rx0Var = this.f29562a.f30732c) != null) {
            org.telegram.messenger.a30.r(null, 2131751185, cc.a0(rx0Var.getParentFragment()));
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
    public final boolean M(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f7;
        boolean z10;
        if (this.f29562a.E || !org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q() || (f7 = org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.i20.h(f7);
        if (document != null && (h == null || h.longValue() != document.f19800id)) {
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
        rx0 rx0Var = this.f29562a.f30732c;
        if (rx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 parentFragment = rx0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.un)) {
            return false;
        }
        return ((org.telegram.ui.un) parentFragment).c();
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
    public final boolean k(int i10) {
        rx0 rx0Var = this.f29562a.f30732c;
        if (rx0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 parentFragment = rx0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) parentFragment;
            if (unVar.Q6()) {
                if (!org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q()) {
                    if (unVar.j() != null && org.telegram.messenger.i20.B(unVar.j())) {
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
        org.telegram.ui.ActionBar.k2 parentFragment;
        tx0 tx0Var = this.f29562a;
        org.telegram.ui.ActionBar.p6 p6Var = tx0Var.f30730b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19800id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f7 = org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f();
        if (f7 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f7.emoji_status;
        }
        org.telegram.messenger.wp.r1(tx0Var.f30728a).e5(emojiStatus, null);
        hi0 hi0Var = new hi0(14, this, obj);
        rx0 rx0Var = tx0Var.f30732c;
        if (rx0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = rx0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                ob obVar = new ob(tx0Var.getContext(), p6Var);
                obVar.f29084b.setText(org.telegram.messenger.dd.L0(2131746302, null));
                obVar.f29083a.setImageResource(2131232361);
                ub ubVar = new ub(tx0Var.getContext(), p6Var, true);
                ubVar.f30924b = hi0Var;
                obVar.setButton(ubVar);
                wb.g(parentFragment, obVar, 1500).j();
                return;
            }
            cc.a0(parentFragment).r(document, org.telegram.messenger.dd.L0(2131745562, null), org.telegram.messenger.dd.L0(2131743910, null), hi0Var).j();
        }
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.kj y() {
        return null;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.kz kzVar) {
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
    public final void J() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
