package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.dr0;
public interface l1 {
    void A0();

    void B(q1 q1Var);

    void B0(q1 q1Var, TLObject tLObject, boolean z10);

    void B1(q1 q1Var, boolean z10, boolean z11);

    void C0(q1 q1Var, float f10, float f11);

    void C1(q1 q1Var);

    void F0(q1 q1Var);

    void F1(q1 q1Var, boolean z10);

    void G(q1 q1Var, org.telegram.messenger.o2 o2Var);

    void H(q1 q1Var);

    void H0(q1 q1Var, boolean z10, boolean z11);

    boolean H1(q1 q1Var, TLRPC.Chat chat);

    void I0(q1 q1Var);

    void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void J(dj djVar);

    boolean J1();

    void K(q1 q1Var, TLRPC.Document document, RectF rectF);

    void K1(q1 q1Var, int i7);

    boolean L0(long j3);

    void L1(q1 q1Var);

    void N(q1 q1Var);

    void N0(q1 q1Var);

    void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void O1(gj gjVar);

    void P(gj gjVar);

    boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10);

    void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10);

    boolean R();

    CharacterStyle R1(q1 q1Var);

    boolean S(q1 q1Var);

    void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10);

    boolean T();

    void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10);

    boolean T1(q1 q1Var, gj gjVar);

    void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10);

    void U1();

    void V(q1 q1Var);

    boolean V0(q1 q1Var, boolean z10);

    void W0(q1 q1Var);

    int X();

    void X0(q1 q1Var);

    void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str);

    jh.a Z();

    boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer);

    boolean a0(q1 q1Var);

    void a2(q1 q1Var, l10 l10Var);

    boolean c();

    boolean c0(q1 q1Var, TLRPC.User user);

    dr0 c2();

    void e0(int i7);

    void e2(String str, String str2);

    boolean f0();

    boolean f1(gj gjVar);

    boolean f2(long j3);

    boolean g();

    void g2(q1 q1Var, int i7, float f10, float f11, boolean z10);

    String h(q1 q1Var);

    void h0(q1 q1Var, float f10, float f11);

    boolean h2(q1 q1Var, TLRPC.TodoItem todoItem);

    int i0(q1 q1Var);

    void i1();

    void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11);

    void j0(q1 q1Var);

    void j2(q1 q1Var);

    void k();

    void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean l0();

    void l2(q1 q1Var, long j3);

    void m(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7);

    void n0(String str);

    void o(q1 q1Var);

    boolean o0(org.telegram.ui.Components.p5 p5Var);

    void p();

    void p1(q1 q1Var, int i7);

    boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock);

    void q0(q1 q1Var, float f10, float f11);

    void q2(q1 q1Var);

    void r(q1 q1Var);

    void s2();

    void t();

    void t1(q1 q1Var, float f10, float f11);

    void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void u(q1 q1Var);

    void u0(q1 q1Var, TLRPC.User user, float f10, float f11);

    boolean v2(int i7);

    void w(q1 q1Var);

    void w0(q1 q1Var, float f10, float f11, boolean z10);

    String x(long j3);

    boolean x1();

    void x2();

    boolean y0(gj gjVar);

    void y2(q1 q1Var, int i7, int i10);

    void z(q1 q1Var);

    void z0(q1 q1Var);

    boolean z1(q1 q1Var, int i7);

    i9 z2();
}
