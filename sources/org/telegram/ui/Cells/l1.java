package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.fr0;
public interface l1 {
    void A0();

    void B(q1 q1Var);

    void B0(q1 q1Var, TLObject tLObject, boolean z10);

    void B1(q1 q1Var, boolean z10, boolean z11);

    void C0(q1 q1Var, float f10, float f11);

    void C1(q1 q1Var);

    void E(q1 q1Var);

    void F0(q1 q1Var);

    void F1(q1 q1Var, boolean z10);

    void H0(q1 q1Var, boolean z10, boolean z11);

    boolean H1(q1 q1Var, TLRPC.Chat chat);

    void I(q1 q1Var, org.telegram.messenger.p2 p2Var);

    void I0(q1 q1Var);

    void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean J1();

    void K(q1 q1Var);

    void K1(q1 q1Var, int i7);

    void L(cj cjVar);

    boolean L0(long j3);

    void L1(q1 q1Var);

    void N(q1 q1Var, TLRPC.Document document, RectF rectF);

    void N0(q1 q1Var);

    void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void O1(fj fjVar);

    void P(q1 q1Var);

    void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void R(fj fjVar);

    CharacterStyle R1(q1 q1Var);

    boolean S(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10);

    void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10);

    boolean T();

    void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10);

    boolean T1(q1 q1Var, fj fjVar);

    boolean U(q1 q1Var);

    void U1();

    boolean V0(q1 q1Var, boolean z10);

    boolean W();

    void W0(q1 q1Var);

    void X(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10);

    void X0(q1 q1Var);

    void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void Y(q1 q1Var);

    void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str);

    int Z();

    boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer);

    void a2(q1 q1Var, i10 i10Var);

    boolean b();

    void c();

    jh.a c0();

    fr0 c2();

    boolean d0(q1 q1Var);

    boolean e0(q1 q1Var, TLRPC.User user);

    void e2(String str, String str2);

    boolean f1(fj fjVar);

    boolean f2(long j3);

    void g2(q1 q1Var, int i7, float f10, float f11, boolean z10);

    boolean h();

    void h0(int i7);

    boolean h2(q1 q1Var, TLRPC.TodoItem todoItem);

    String i(q1 q1Var);

    boolean i0();

    void i1();

    void j0(q1 q1Var, float f10, float f11);

    void j2(q1 q1Var);

    int k0(q1 q1Var);

    void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void l(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11);

    void l0(q1 q1Var);

    void l2(q1 q1Var, long j3);

    void m();

    boolean n0();

    void o0(String str);

    void p(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7);

    boolean p0(org.telegram.ui.Components.x5 x5Var);

    void p1(q1 q1Var, int i7);

    boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock);

    void q(q1 q1Var);

    void q0(q1 q1Var, float f10, float f11);

    void q2(q1 q1Var);

    void s(q1 q1Var);

    void s2();

    void t1(q1 q1Var, float f10, float f11);

    void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void u0(q1 q1Var, TLRPC.User user, float f10, float f11);

    void v();

    boolean v2(int i7);

    void w(q1 q1Var);

    void w0(q1 q1Var, float f10, float f11, boolean z10);

    boolean x1();

    void x2();

    void y(q1 q1Var);

    boolean y0(fj fjVar);

    void y2(q1 q1Var, int i7, int i10);

    String z(long j3);

    void z0(q1 q1Var);

    boolean z1(q1 q1Var, int i7);

    j9 z2();
}
