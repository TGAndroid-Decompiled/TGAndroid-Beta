package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ta0 implements org.telegram.ui.Cells.l1 {
    public final org.telegram.ui.x7 f30535a;

    public ta0(org.telegram.ui.x7 x7Var) {
        this.f30535a = x7Var;
    }

    @Override
    public final boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        return false;
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final org.telegram.ui.qs0 H1() {
        return null;
    }

    @Override
    public final boolean I0(long j10) {
        return false;
    }

    @Override
    public final boolean K1(long j10) {
        return false;
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        ua0 ua0Var = (ua0) this.f30535a.d;
        if (ua0Var.f30876a == 2 && ua0Var.f30881c0.d.f17132w != characterStyle && q1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            URLSpan uRLSpan = (URLSpan) characterStyle;
            String url = uRLSpan.getURL();
            ab0 ab0Var = ua0Var.f30881c0;
            org.telegram.messenger.nj njVar = ab0Var.d;
            njVar.f17132w = uRLSpan;
            njVar.v = null;
            org.telegram.ui.un unVar = ab0Var.f24354c;
            if (unVar != null && url != null) {
                unVar.ob(url, true);
            }
            ua0.b(ua0Var, q1Var);
        }
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final zg.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean c() {
        ua0 ua0Var = (ua0) this.f30535a.d;
        if (ua0Var.f30876a == 2) {
            org.telegram.messenger.nj njVar = ua0Var.f30881c0.d;
            if (!njVar.f17124n && !njVar.f17119i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c2(int i10) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final org.telegram.ui.Cells.l9 g2() {
        return ((ua0) this.f30535a.d).e;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final boolean i0() {
        return c();
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        ua0 ua0Var = (ua0) this.f30535a.d;
        if (ua0Var.f30876a == 2 && i10 == 1) {
            org.telegram.messenger.nj njVar = ua0Var.f30881c0.d;
            if (!njVar.f17124n) {
                TLRPC.WebPage webPage = njVar.v;
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
    public final boolean m0(o5 o5Var) {
        return false;
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final boolean w0(org.telegram.messenger.jj jjVar) {
        return true;
    }

    @Override
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public final String x(long j10) {
        return null;
    }

    @Override
    public final CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        ua0 ua0Var = (ua0) this.f30535a.d;
        if (ua0Var.f30876a == 2) {
            org.telegram.messenger.nj njVar = ua0Var.f30881c0.d;
            if (!njVar.f17124n) {
                return njVar.f17132w;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void O(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void Z1() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override
    public final void J1(String str, String str2) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public final void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
