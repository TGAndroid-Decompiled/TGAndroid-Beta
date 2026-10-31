package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nu implements org.telegram.ui.jt {
    public final cv f28891a;

    public nu(cv cvVar) {
        this.f28891a = cvVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        cv cvVar = this.f28891a;
        org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25162j1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).sb(document);
        }
        cvVar.L0();
        cvVar.dismiss();
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q() && org.telegram.messenger.jj.H2(document)) {
            return true;
        }
        return false;
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
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.jj.U(document));
        valueOf.setSpan(new o5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.i0.g(valueOf)) {
            cv cvVar = this.f28891a;
            org.telegram.messenger.z20.r(null, 2131751185, new cc((FrameLayout) cvVar.f21586b, cvVar.I0));
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
        if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q() || !org.telegram.messenger.jj.H2(document) || (f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.h20.h(f7);
        if (document != null && (h == null || h.longValue() != document.f19799id)) {
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
        org.telegram.ui.ActionBar.k2 k2Var = this.f28891a.f25162j1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).c();
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
    public final boolean k(int i10) {
        cv cvVar = this.f28891a;
        org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25162j1;
        if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).M6()) {
            if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q()) {
                if (((org.telegram.ui.un) cvVar.f25162j1).j() != null && org.telegram.messenger.h20.B(((org.telegram.ui.un) cvVar.f25162j1).j())) {
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
            tL_emojiStatus.document_id = document.f19799id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f();
        if (f7 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f7.emoji_status;
        }
        cv cvVar = this.f28891a;
        org.telegram.messenger.vp.r1(cvVar.f21583a).e5(emojiStatus, null);
        at atVar = new at(2, this, obj);
        if (document == null) {
            ob obVar = new ob(cvVar.getContext(), cvVar.I0);
            obVar.f29023b.setText(org.telegram.messenger.cd.L0(2131746302, null));
            obVar.f29022a.setImageResource(2131232361);
            ub ubVar = new ub(cvVar.getContext(), cvVar.I0, true);
            ubVar.f30890b = atVar;
            obVar.setButton(ubVar);
            wb.f((FrameLayout) cvVar.f21586b, obVar, 1500).j();
            return;
        }
        new cc((FrameLayout) cvVar.f21586b, cvVar.I0).r(document, org.telegram.messenger.cd.L0(2131745562, null), org.telegram.messenger.cd.L0(2131743910, null), atVar).j();
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.jj y() {
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
    public final void i(org.telegram.messenger.jz jzVar) {
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
