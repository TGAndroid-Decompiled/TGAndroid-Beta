package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w90 implements org.telegram.ui.Cells.l1 {
    public final org.telegram.ui.y7 f39975a;

    public w90(org.telegram.ui.y7 y7Var) {
        this.f39975a = y7Var;
    }

    @Override
    public final void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        x90 x90Var = (x90) this.f39975a.d;
        if (x90Var.f40285a == 2) {
            org.telegram.messenger.dj djVar = x90Var.f40291d0.d;
            if (!djVar.f22208n) {
                return djVar.f22216w;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        return false;
    }

    @Override
    public final boolean J0(long j10) {
        return false;
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        x90 x90Var = (x90) this.f39975a.d;
        if (x90Var.f40285a == 2 && x90Var.f40291d0.d.f22216w != characterStyle && q1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            URLSpan uRLSpan = (URLSpan) characterStyle;
            String url = uRLSpan.getURL();
            da0 da0Var = x90Var.f40291d0;
            org.telegram.messenger.dj djVar = da0Var.d;
            djVar.f22216w = uRLSpan;
            djVar.v = null;
            org.telegram.ui.wm wmVar = da0Var.f33035c;
            if (wmVar != null && url != null) {
                wmVar.yb(url, true);
            }
            x90.b(x90Var, q1Var);
        }
    }

    @Override
    public final boolean P0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean P1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.vq0 S1() {
        return null;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean V1(long j10) {
        return false;
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final boolean X0(org.telegram.messenger.zi ziVar) {
        return org.telegram.ui.Cells.f1.a(ziVar);
    }

    @Override
    public final boolean Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final kh.a Z() {
        return null;
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean c() {
        x90 x90Var = (x90) this.f39975a.d;
        if (x90Var.f40285a == 2) {
            org.telegram.messenger.dj djVar = x90Var.f40291d0.d;
            if (!djVar.f22208n && !djVar.f22203i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final int j0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final boolean m0() {
        return c();
    }

    @Override
    public final boolean m2(int i3) {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        x90 x90Var = (x90) this.f39975a.d;
        if (x90Var.f40285a == 2 && i3 == 1) {
            org.telegram.messenger.dj djVar = x90Var.f40291d0.d;
            if (!djVar.f22208n) {
                TLRPC.WebPage webPage = djVar.v;
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
    public final org.telegram.ui.Cells.i9 q2() {
        return ((x90) this.f39975a.d).f40292e;
    }

    @Override
    public final boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean x0(org.telegram.messenger.zi ziVar) {
        return true;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final String z(long j10) {
        return null;
    }

    @Override
    public final void A1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C1(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.wi wiVar) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void e0(int i3) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void p(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void K1() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
    }

    @Override
    public final void U1(String str, String str2) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public final void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
