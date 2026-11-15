package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class da0 implements org.telegram.ui.Cells.l1 {
    public final org.telegram.ui.y7 f33895a;

    public da0(org.telegram.ui.y7 y7Var) {
        this.f33895a = y7Var;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final boolean L0(long j3) {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        ea0 ea0Var = (ea0) this.f33895a.d;
        if (ea0Var.f34254a == 2) {
            org.telegram.messenger.kj kjVar = ea0Var.f34260d0.d;
            if (!kjVar.f24717n) {
                return kjVar.f24725w;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        ea0 ea0Var = (ea0) this.f33895a.d;
        if (ea0Var.f34254a == 2 && ea0Var.f34260d0.d.f24725w != characterStyle && q1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            URLSpan uRLSpan = (URLSpan) characterStyle;
            String url = uRLSpan.getURL();
            ka0 ka0Var = ea0Var.f34260d0;
            org.telegram.messenger.kj kjVar = ka0Var.d;
            kjVar.f24725w = uRLSpan;
            kjVar.v = null;
            org.telegram.ui.an anVar = ka0Var.f36337c;
            if (anVar != null && url != null) {
                anVar.Cb(url, true);
            }
            ea0.b(ea0Var, q1Var);
        }
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final jh.a Z() {
        return null;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean c() {
        ea0 ea0Var = (ea0) this.f33895a.d;
        if (ea0Var.f34254a == 2) {
            org.telegram.messenger.kj kjVar = ea0Var.f34260d0.d;
            if (!kjVar.f24717n && !kjVar.f24712i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final org.telegram.ui.dr0 c2() {
        return null;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override
    public final boolean f2(long j3) {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final boolean l0() {
        return c();
    }

    @Override
    public final boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean v2(int i7) {
        return false;
    }

    @Override
    public final String x(long j3) {
        return null;
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        ea0 ea0Var = (ea0) this.f33895a.d;
        if (ea0Var.f34254a == 2 && i7 == 1) {
            org.telegram.messenger.kj kjVar = ea0Var.f34260d0.d;
            if (!kjVar.f24717n) {
                TLRPC.WebPage webPage = kjVar.v;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.i9 z2() {
        return ((ea0) this.f33895a.d).f34261e;
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.dj djVar) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void P(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void e0(int i7) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
    }

    @Override
    public final void e2(String str, String str2) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
