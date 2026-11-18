package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uw0 implements org.telegram.ui.ls {
    public final yw0 f40428a;

    public uw0(yw0 yw0Var) {
        this.f40428a = yw0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        yw0 yw0Var = this.f40428a;
        ww0 ww0Var = yw0Var.f42647c;
        if (ww0Var != null) {
            org.telegram.ui.ActionBar.h2 parentFragment = ww0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.bn) {
                ((org.telegram.ui.bn) parentFragment).Gb(document);
                yw0Var.f42647c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f40428a.E) {
            return false;
        }
        return org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q();
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
        ww0 ww0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf) && (ww0Var = this.f40428a.f42647c) != null) {
            org.telegram.messenger.n10.t(null, 2131751173, lc.b0(ww0Var.getParentFragment()));
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
        if (this.f40428a.F || !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q() || (f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.o10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28411id)) {
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
        ww0 ww0Var = this.f40428a.f42647c;
        if (ww0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 parentFragment = ww0Var.getParentFragment();
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
        ww0 ww0Var = this.f40428a.f42647c;
        if (ww0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 parentFragment = ww0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) parentFragment;
            if (bnVar.T6()) {
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q()) {
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
        org.telegram.ui.ActionBar.h2 parentFragment;
        yw0 yw0Var = this.f40428a;
        org.telegram.ui.ActionBar.i6 i6Var = yw0Var.f42645b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28411id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.mp.u1(yw0Var.f42643a).t5(emojiStatus, null);
        hn0 hn0Var = new hn0(10, this, obj);
        ww0 ww0Var = yw0Var.f42647c;
        if (ww0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = ww0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                yb ybVar = new yb(yw0Var.getContext(), i6Var);
                ybVar.f42447b.setText(org.telegram.messenger.gd.M0(2131746092, null));
                ybVar.f42446a.setImageResource(2131232364);
                ec ecVar = new ec(yw0Var.getContext(), i6Var, true);
                ecVar.f34666b = hn0Var;
                ybVar.setButton(ecVar);
                gc.g(parentFragment, ybVar, 1500).j();
                return;
            }
            lc.b0(parentFragment).r(document, org.telegram.messenger.gd.M0(2131745350, null), org.telegram.messenger.gd.M0(2131743648, null), hn0Var).j();
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
    public final void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
