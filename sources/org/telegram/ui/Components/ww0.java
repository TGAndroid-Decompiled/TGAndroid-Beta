package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ww0 implements org.telegram.ui.ls {
    public final ax0 f41912a;

    public ww0(ax0 ax0Var) {
        this.f41912a = ax0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        ax0 ax0Var = this.f41912a;
        yw0 yw0Var = ax0Var.f33643c;
        if (yw0Var != null) {
            org.telegram.ui.ActionBar.g2 parentFragment = yw0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.bn) {
                ((org.telegram.ui.bn) parentFragment).Gb(document);
                ax0Var.f33643c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f41912a.E) {
            return false;
        }
        return org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q();
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
        yw0 yw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf) && (yw0Var = this.f41912a.f33643c) != null) {
            org.telegram.messenger.n10.t(null, 2131751172, lc.b0(yw0Var.getParentFragment()));
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
        if (this.f41912a.F || !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q() || (f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.o10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28437id)) {
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
        yw0 yw0Var = this.f41912a.f33643c;
        if (yw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = yw0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.bn)) {
            return false;
        }
        return ((org.telegram.ui.bn) parentFragment).c();
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
        yw0 yw0Var = this.f41912a.f33643c;
        if (yw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 parentFragment = yw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) parentFragment;
            if (bnVar.T6()) {
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q()) {
                    if (bnVar.j() != null && org.telegram.messenger.o10.C(bnVar.j())) {
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
        org.telegram.ui.ActionBar.g2 parentFragment;
        ax0 ax0Var = this.f41912a;
        org.telegram.ui.ActionBar.h6 h6Var = ax0Var.f33641b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28437id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.mp.u1(ax0Var.f33639a).t5(emojiStatus, null);
        fm0 fm0Var = new fm0(12, this, obj);
        yw0 yw0Var = ax0Var.f33643c;
        if (yw0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = yw0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                yb ybVar = new yb(ax0Var.getContext(), h6Var);
                ybVar.f42382b.setText(org.telegram.messenger.gd.N0(2131746091, null));
                ybVar.f42381a.setImageResource(2131232364);
                ec ecVar = new ec(ax0Var.getContext(), h6Var, true);
                ecVar.f34727b = fm0Var;
                ybVar.setButton(ecVar);
                gc.g(parentFragment, ybVar, 1500).j();
                return;
            }
            lc.b0(parentFragment).r(document, org.telegram.messenger.gd.N0(2131745349, null), org.telegram.messenger.gd.N0(2131743642, null), fm0Var).j();
        }
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
    public final void y(CharSequence charSequence, String str, rh rhVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
