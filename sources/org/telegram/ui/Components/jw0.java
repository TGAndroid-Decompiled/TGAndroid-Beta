package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jw0 implements org.telegram.ui.gs {
    public final ow0 f35205a;

    public jw0(ow0 ow0Var) {
        this.f35205a = ow0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        ow0 ow0Var = this.f35205a;
        mw0 mw0Var = ow0Var.f36962c;
        if (mw0Var != null) {
            org.telegram.ui.ActionBar.d2 parentFragment = mw0Var.getParentFragment();
            if (parentFragment instanceof org.telegram.ui.wm) {
                ((org.telegram.ui.wm) parentFragment).Cb(document);
                ow0Var.f36962c.setFieldText("");
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        if (this.f35205a.E) {
            return false;
        }
        return org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q();
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        mw0 mw0Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.zi.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf) && (mw0Var = this.f35205a.f36962c) != null) {
            org.telegram.messenger.camera.q.r(null, 2131751185, fc.a0(mw0Var.getParentFragment()));
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
        if (this.f35205a.F || !org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() || (f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f()) == null) {
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
        mw0 mw0Var = this.f35205a.f36962c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 parentFragment = mw0Var.getParentFragment();
        if (!(parentFragment instanceof org.telegram.ui.wm)) {
            return false;
        }
        return ((org.telegram.ui.wm) parentFragment).c();
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
        mw0 mw0Var = this.f35205a.f36962c;
        if (mw0Var == null) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 parentFragment = mw0Var.getParentFragment();
        if (parentFragment instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) parentFragment;
            if (wmVar.S6()) {
                if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()) {
                    if (wmVar.j() != null && org.telegram.messenger.l10.B(wmVar.j())) {
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
        org.telegram.ui.ActionBar.d2 parentFragment;
        ow0 ow0Var = this.f35205a;
        org.telegram.ui.ActionBar.e6 e6Var = ow0Var.f36960b;
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
        org.telegram.messenger.hp.s1(ow0Var.f36958a).h5(emojiStatus, null);
        j50 j50Var = new j50(25, this, obj);
        mw0 mw0Var = ow0Var.f36962c;
        if (mw0Var == null) {
            parentFragment = null;
        } else {
            parentFragment = mw0Var.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                sb sbVar = new sb(ow0Var.getContext(), e6Var);
                sbVar.f37963b.setText(org.telegram.messenger.bd.M0(2131746295, null));
                sbVar.f37962a.setImageResource(2131232362);
                yb ybVar = new yb(ow0Var.getContext(), e6Var, true);
                ybVar.f40672b = j50Var;
                sbVar.setButton(ybVar);
                ac.g(parentFragment, sbVar, 1500).j();
                return;
            }
            fc.a0(parentFragment).r(document, org.telegram.messenger.bd.M0(2131745555, null), org.telegram.messenger.bd.M0(2131743895, null), j50Var).j();
        }
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
