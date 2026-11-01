package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.hj;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ps0;
public interface l1 {
    void A(q1 q1Var);

    void A0(q1 q1Var, float f7, float f10);

    boolean A1(q1 q1Var, kj kjVar);

    void B1();

    void C0(q1 q1Var);

    void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void D0(q1 q1Var, boolean z10, boolean z11);

    void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer);

    void F0(q1 q1Var);

    void F1(q1 q1Var, d20 d20Var);

    void G(q1 q1Var, org.telegram.messenger.s2 s2Var);

    void H(q1 q1Var);

    ps0 H1();

    boolean I0(long j10);

    void J(hj hjVar);

    void J0(q1 q1Var);

    void J1(String str, String str2);

    void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean K1(long j10);

    void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10);

    void L1(q1 q1Var, int i10, float f7, float f10, boolean z10);

    void M(q1 q1Var);

    boolean M0(q1 q1Var, boolean z10);

    void N0(q1 q1Var);

    boolean N1(q1 q1Var, TLRPC.TodoItem todoItem);

    void O(kj kjVar);

    void O0(q1 q1Var);

    boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10);

    void P1(q1 q1Var);

    boolean Q();

    boolean R(q1 q1Var);

    boolean S();

    boolean S0(kj kjVar);

    void S1(q1 q1Var, long j10);

    void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void U(q1 q1Var);

    void U0();

    int W();

    void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock);

    void X1(q1 q1Var);

    zg.a Y();

    boolean Z(q1 q1Var);

    void Z0(q1 q1Var, TLRPC.Document document);

    void Z1();

    boolean a0(q1 q1Var, TLRPC.User user);

    void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    boolean c();

    void c0(int i10);

    void c1(q1 q1Var, int i10);

    boolean c2(int i10);

    boolean d0();

    void e0(q1 q1Var, float f7, float f10);

    void e2();

    boolean f();

    int f0(q1 q1Var);

    void f1(q1 q1Var, float f7, float f10);

    void f2(q1 q1Var, int i10, int i11);

    void g0(q1 q1Var);

    l9 g2();

    String h(q1 q1Var);

    void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12);

    boolean i0();

    void j();

    boolean j1();

    boolean k1(q1 q1Var, int i10);

    void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void l0(String str);

    void l1(q1 q1Var, boolean z10, boolean z11);

    boolean m0(org.telegram.ui.Components.o5 o5Var);

    void m1(q1 q1Var);

    void n(q1 q1Var);

    void n1(q1 q1Var, boolean z10);

    void o();

    void o0(q1 q1Var, float f7, float f10);

    boolean p1(q1 q1Var, TLRPC.Chat chat);

    void q(q1 q1Var);

    void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void r0(q1 q1Var, TLRPC.User user, float f7, float f10);

    boolean r1();

    void s();

    void s0(q1 q1Var, float f7, float f10, boolean z10);

    void s1(q1 q1Var, int i10);

    void t(q1 q1Var);

    void u1(q1 q1Var);

    void v(q1 q1Var);

    void v1(kj kjVar);

    boolean w0(kj kjVar);

    void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10);

    String x(long j10);

    void x0(q1 q1Var);

    void y0();

    CharacterStyle y1(q1 q1Var);

    void z(q1 q1Var);

    void z0(q1 q1Var, TLObject tLObject, boolean z10);

    void z1(kj kjVar, String str, String str2, String str3, String str4, int i10, int i11);
}
