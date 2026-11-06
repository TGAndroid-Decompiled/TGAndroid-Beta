package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.fr0;
public interface l1 {
    void A0(q1 q1Var, TLObject tLObject, boolean z9);

    void A1(ij ijVar);

    void B0(q1 q1Var, float f10, float f11);

    void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9);

    void C(q1 q1Var);

    CharacterStyle C1(q1 q1Var);

    void D0(q1 q1Var);

    void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10);

    void E0(q1 q1Var, boolean z9, boolean z10);

    boolean E1(q1 q1Var, ij ijVar);

    void F1();

    void G(q1 q1Var, org.telegram.messenger.o2 o2Var);

    void G0(q1 q1Var);

    void H(q1 q1Var);

    void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str);

    void J(fj fjVar);

    boolean J0(long j3);

    boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer);

    void K(q1 q1Var, TLRPC.Document document, RectF rectF);

    void K0(q1 q1Var);

    void K1(q1 q1Var, o10 o10Var);

    void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void N(q1 q1Var);

    void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9);

    fr0 N1();

    boolean O0(q1 q1Var, boolean z9);

    void P(ij ijVar);

    void P0(q1 q1Var);

    void P1(String str, String str2);

    boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9);

    void Q0(q1 q1Var);

    boolean Q1(long j3);

    boolean R();

    void R1(q1 q1Var, int i7, float f10, float f11, boolean z9);

    boolean S(q1 q1Var);

    boolean S1(q1 q1Var, TLRPC.TodoItem todoItem);

    boolean T();

    void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9);

    void U1(q1 q1Var);

    void V(q1 q1Var);

    boolean W0(ij ijVar);

    void W1(q1 q1Var, long j3);

    int X();

    jh.a Z();

    void Z0();

    boolean a0(q1 q1Var);

    boolean b0(q1 q1Var, TLRPC.User user);

    void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock);

    void c2(q1 q1Var);

    boolean d();

    void d0(int i7);

    boolean e0();

    void e2();

    void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11);

    boolean g();

    void g0(q1 q1Var, float f10, float f11);

    void g1(q1 q1Var, int i7);

    boolean g2(int i7);

    String h(q1 q1Var);

    int h0(q1 q1Var);

    void i0(q1 q1Var);

    void i2();

    void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11);

    void j1(q1 q1Var, float f10, float f11);

    void j2(q1 q1Var, int i7, int i10);

    void k();

    boolean k0();

    j9 k2();

    void m0(String str);

    void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7);

    boolean n0(org.telegram.ui.Components.r5 r5Var);

    boolean n1();

    void o(q1 q1Var);

    void p();

    void p0(q1 q1Var, float f10, float f11);

    boolean p1(q1 q1Var, int i7);

    void q1(q1 q1Var, boolean z9, boolean z10);

    void r(q1 q1Var);

    void r1(q1 q1Var);

    void s0(q1 q1Var, TLRPC.User user, float f10, float f11);

    void s1(q1 q1Var, boolean z9);

    void u();

    void u0(q1 q1Var, float f10, float f11, boolean z9);

    boolean u1(q1 q1Var, TLRPC.Chat chat);

    void v(q1 q1Var);

    void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean w1();

    void x(q1 q1Var);

    boolean x0(ij ijVar);

    void x1(q1 q1Var, int i7);

    String y(long j3);

    void y0(q1 q1Var);

    void y1(q1 q1Var);

    void z(q1 q1Var);

    void z0();
}
