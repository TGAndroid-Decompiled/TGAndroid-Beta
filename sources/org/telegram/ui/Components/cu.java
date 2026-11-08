package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cu implements org.telegram.ui.is {
    public final ru f32680a;

    public cu(ru ruVar) {
        this.f32680a = ruVar;
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
        ru ruVar = this.f32680a;
        org.telegram.ui.ActionBar.f2 f2Var = ruVar.f37776j1;
        if (f2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) f2Var).Cb(document);
        }
        ruVar.L0();
        ruVar.dismiss();
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q() && org.telegram.messenger.ij.I2(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final String G(boolean z9) {
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ru ruVar = this.f32680a;
            org.telegram.messenger.camera.q.r(null, 2131751185, new hc((FrameLayout) ruVar.f28619b, ruVar.I0));
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
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q() || !org.telegram.messenger.ij.I2(document) || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f()) == null) {
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
        org.telegram.ui.ActionBar.f2 f2Var = this.f32680a.f37776j1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).c();
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
        ru ruVar = this.f32680a;
        org.telegram.ui.ActionBar.f2 f2Var = ruVar.f37776j1;
        if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).S6()) {
            if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q()) {
                if (((org.telegram.ui.an) ruVar.f37776j1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.an) ruVar.f37776j1).j())) {
                    return true;
                }
                return false;
            }
            return true;
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
        ru ruVar = this.f32680a;
        org.telegram.messenger.qp.s1(ruVar.f28616a).h5(emojiStatus, null);
        fq fqVar = new fq(8, this, obj);
        if (document == null) {
            ub ubVar = new ub(ruVar.getContext(), ruVar.I0);
            ubVar.f38592b.setText(org.telegram.messenger.id.M0(2131746288, null));
            ubVar.f38591a.setImageResource(2131232362);
            ac acVar = new ac(ruVar.getContext(), ruVar.I0, true);
            acVar.f31765b = fqVar;
            ubVar.setButton(acVar);
            cc.f((FrameLayout) ruVar.f28619b, ubVar, 1500).j();
            return;
        }
        new hc((FrameLayout) ruVar.f28619b, ruVar.I0).r(document, org.telegram.messenger.id.M0(2131745548, null), org.telegram.messenger.id.M0(2131743888, null), fqVar).j();
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
