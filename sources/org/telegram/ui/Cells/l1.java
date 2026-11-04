package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.g10;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.vq0;
public interface l1 {
    void A0(q1 q1Var, TLObject tLObject, boolean z10);

    void A1(q1 q1Var);

    void B(q1 q1Var);

    void B0(q1 q1Var, float f10, float f11);

    void C(q1 q1Var);

    void C1(zi ziVar);

    void D0(q1 q1Var);

    void E0(q1 q1Var, boolean z10, boolean z11);

    void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void G0(q1 q1Var);

    CharacterStyle G1(q1 q1Var);

    void H(q1 q1Var, org.telegram.messenger.o2 o2Var);

    void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10);

    void I(q1 q1Var);

    boolean I1(q1 q1Var, zi ziVar);

    void J(wi wiVar);

    boolean J0(long j10);

    void K(q1 q1Var, TLRPC.Document document, RectF rectF);

    void K0(q1 q1Var);

    void K1();

    void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void N(q1 q1Var);

    void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10);

    void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str);

    void P(zi ziVar);

    boolean P0(q1 q1Var, boolean z10);

    boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer);

    boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10);

    void Q0(q1 q1Var);

    void Q1(q1 q1Var, g10 g10Var);

    boolean R();

    boolean S(q1 q1Var);

    void S0(q1 q1Var);

    vq0 S1();

    boolean T();

    void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10);

    void U1(String str, String str2);

    void V(q1 q1Var);

    boolean V1(long j10);

    void W1(q1 q1Var, int i3, float f10, float f11, boolean z10);

    int X();

    boolean X0(zi ziVar);

    boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem);

    kh.a Z();

    void Z1(q1 q1Var);

    void a2(q1 q1Var, long j10);

    boolean b0(q1 q1Var);

    boolean c();

    void c1();

    boolean d();

    boolean d0(q1 q1Var, TLRPC.User user);

    void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void e0(int i3);

    boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock);

    boolean f0();

    void f1(q1 q1Var, int i3);

    void f2(q1 q1Var);

    String g(q1 q1Var);

    void h0(q1 q1Var, float f10, float f11);

    void h2();

    void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11);

    void i1(q1 q1Var, float f10, float f11);

    void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void j();

    int j0(q1 q1Var);

    void k0(q1 q1Var);

    boolean m0();

    boolean m2(int i3);

    void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3);

    void n0(String str);

    boolean n1();

    boolean o0(org.telegram.ui.Components.p5 p5Var);

    void o2();

    void p(q1 q1Var);

    void p0(q1 q1Var, float f10, float f11);

    boolean p1(q1 q1Var, int i3);

    void p2(q1 q1Var, int i3, int i10);

    void q();

    i9 q2();

    void r1(q1 q1Var, boolean z10, boolean z11);

    void s(q1 q1Var);

    void s0(q1 q1Var, TLRPC.User user, float f10, float f11);

    void t0(q1 q1Var, float f10, float f11, boolean z10);

    void t1(q1 q1Var);

    void u1(q1 q1Var, boolean z10);

    void v();

    void w(q1 q1Var);

    boolean w1(q1 q1Var, TLRPC.Chat chat);

    boolean x0(zi ziVar);

    void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void y(q1 q1Var);

    void y0(q1 q1Var);

    boolean y1();

    String z(long j10);

    void z0();

    void z1(q1 q1Var, int i3);
}
