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
public interface m1 {
    void A0();

    void B(r1 r1Var);

    void B0(r1 r1Var, TLObject tLObject, boolean z10);

    void B1(r1 r1Var, boolean z10, boolean z11);

    void C0(r1 r1Var, float f10, float f11);

    void C1(r1 r1Var);

    void E(r1 r1Var);

    void F0(r1 r1Var);

    void F1(r1 r1Var, boolean z10);

    void H0(r1 r1Var, boolean z10, boolean z11);

    boolean H1(r1 r1Var, TLRPC.Chat chat);

    void I(r1 r1Var, org.telegram.messenger.p2 p2Var);

    void I0(r1 r1Var);

    void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean J1();

    void K(r1 r1Var);

    void K1(r1 r1Var, int i7);

    void L(cj cjVar);

    boolean L0(long j3);

    void L1(r1 r1Var);

    void N(r1 r1Var, TLRPC.Document document, RectF rectF);

    void N0(r1 r1Var);

    void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void O1(fj fjVar);

    void P(r1 r1Var);

    void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void R(fj fjVar);

    CharacterStyle R1(r1 r1Var);

    boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10);

    void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10);

    boolean T();

    void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10);

    boolean T1(r1 r1Var, fj fjVar);

    boolean U(r1 r1Var);

    void U1();

    boolean V0(r1 r1Var, boolean z10);

    boolean W();

    void W0(r1 r1Var);

    void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10);

    void X0(r1 r1Var);

    void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void Y(r1 r1Var);

    void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str);

    int Z();

    boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer);

    void a2(r1 r1Var, i10 i10Var);

    boolean b();

    void c();

    jh.a c0();

    fr0 c2();

    boolean d0(r1 r1Var);

    boolean e0(r1 r1Var, TLRPC.User user);

    void e2(String str, String str2);

    boolean f1(fj fjVar);

    boolean f2(long j3);

    void g2(r1 r1Var, int i7, float f10, float f11, boolean z10);

    boolean h();

    void h0(int i7);

    boolean h2(r1 r1Var, TLRPC.TodoItem todoItem);

    String i(r1 r1Var);

    boolean i0();

    void i1();

    void j0(r1 r1Var, float f10, float f11);

    void j2(r1 r1Var);

    int k0(r1 r1Var);

    void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11);

    void l0(r1 r1Var);

    void l2(r1 r1Var, long j3);

    void m();

    boolean n0();

    void o0(String str);

    void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7);

    boolean p0(org.telegram.ui.Components.y5 y5Var);

    void p1(r1 r1Var, int i7);

    boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock);

    void q(r1 r1Var);

    void q0(r1 r1Var, float f10, float f11);

    void q2(r1 r1Var);

    void s(r1 r1Var);

    void s2();

    void t1(r1 r1Var, float f10, float f11);

    void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void u0(r1 r1Var, TLRPC.User user, float f10, float f11);

    void v();

    boolean v2(int i7);

    void w(r1 r1Var);

    void w0(r1 r1Var, float f10, float f11, boolean z10);

    boolean x1();

    void x2();

    void y(r1 r1Var);

    boolean y0(fj fjVar);

    void y2(r1 r1Var, int i7, int i10);

    String z(long j3);

    void z0(r1 r1Var);

    boolean z1(r1 r1Var, int i7);

    k9 z2();
}
