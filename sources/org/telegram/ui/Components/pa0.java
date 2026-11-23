package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class pa0 implements org.telegram.ui.Cells.m1 {
    public final org.telegram.ui.y7 f38542a;

    public pa0(org.telegram.ui.y7 y7Var) {
        this.f38542a = y7Var;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
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
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        qa0 qa0Var = (qa0) this.f38542a.d;
        if (qa0Var.f38851a == 2) {
            org.telegram.messenger.kj kjVar = qa0Var.f38857d0.d;
            if (!kjVar.f25090n) {
                return kjVar.f25098w;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        qa0 qa0Var = (qa0) this.f38542a.d;
        if (qa0Var.f38851a == 2 && qa0Var.f38857d0.d.f25098w != characterStyle && r1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            URLSpan uRLSpan = (URLSpan) characterStyle;
            String url = uRLSpan.getURL();
            wa0 wa0Var = qa0Var.f38857d0;
            org.telegram.messenger.kj kjVar = wa0Var.d;
            kjVar.f25098w = uRLSpan;
            kjVar.v = null;
            org.telegram.ui.bn bnVar = wa0Var.f41738c;
            if (bnVar != null && url != null) {
                bnVar.Cb(url, true);
            }
            qa0.b(qa0Var, r1Var);
        }
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final int Z() {
        return 0;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean b() {
        qa0 qa0Var = (qa0) this.f38542a.d;
        if (qa0Var.f38851a == 2) {
            org.telegram.messenger.kj kjVar = qa0Var.f38857d0.d;
            if (!kjVar.f25090n && !kjVar.f25085i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final jh.a c0() {
        return null;
    }

    @Override
    public final org.telegram.ui.fr0 c2() {
        return null;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.c0.a(gjVar);
    }

    @Override
    public final boolean f2(long j3) {
        return false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String i(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final int k0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public final boolean n0() {
        return b();
    }

    @Override
    public final boolean p0(y5 y5Var) {
        return false;
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean v2(int i7) {
        return false;
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
    public final String z(long j3) {
        return null;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        qa0 qa0Var = (qa0) this.f38542a.d;
        if (qa0Var.f38851a == 2 && i7 == 1) {
            org.telegram.messenger.kj kjVar = qa0Var.f38857d0.d;
            if (!kjVar.f25090n) {
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
    public final org.telegram.ui.Cells.k9 z2() {
        return ((qa0) this.f38542a.d).f38858e;
    }

    @Override
    public final void B(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void L(org.telegram.messenger.dj djVar) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void P(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void R(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void Y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void h0(int i7) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void o0(String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.j10 j10Var) {
    }

    @Override
    public final void e2(String str, String str2) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
