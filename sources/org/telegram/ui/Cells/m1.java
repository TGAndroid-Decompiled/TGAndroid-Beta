package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.fr0;
public interface m1 {
    void A(r1 r1Var);

    void A0(r1 r1Var, TLRPC.User user, float f10, float f11);

    void A2(r1 r1Var, int i7, int i10);

    void B1(r1 r1Var, boolean z10, boolean z11);

    j9 B2();

    void C(r1 r1Var);

    void C0(r1 r1Var, float f10, float f11, boolean z10);

    void C1(r1 r1Var);

    String D(long j3);

    void F(r1 r1Var);

    boolean F0(fj fjVar);

    void F1(r1 r1Var, boolean z10);

    void G0(r1 r1Var);

    void H0();

    boolean H1(r1 r1Var, TLRPC.Chat chat);

    void I0(r1 r1Var, TLObject tLObject, boolean z10);

    void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void J(r1 r1Var);

    void J0(r1 r1Var, float f10, float f11);

    boolean J1();

    void K1(r1 r1Var, int i7);

    void L(r1 r1Var, org.telegram.messenger.p2 p2Var);

    void L0(r1 r1Var);

    void L1(r1 r1Var);

    void M(r1 r1Var);

    void M0(r1 r1Var, boolean z10, boolean z11);

    void N0(r1 r1Var);

    void O(cj cjVar);

    void O1(fj fjVar);

    void P(r1 r1Var, TLRPC.Document document, RectF rectF);

    void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void R(r1 r1Var);

    boolean R0(long j3);

    CharacterStyle R1(r1 r1Var);

    void S0(r1 r1Var);

    void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10);

    boolean T1(r1 r1Var, fj fjVar);

    void U1();

    void W(fj fjVar);

    void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10);

    boolean Y();

    void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean Z(r1 r1Var);

    void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str);

    void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10);

    boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer);

    boolean b0();

    void b2(r1 r1Var, h10 h10Var);

    void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10);

    boolean c1(r1 r1Var, boolean z10);

    fr0 c2();

    boolean d();

    void d0(r1 r1Var);

    void e();

    int e0();

    void e1(r1 r1Var);

    void e2(String str, String str2);

    void f1(r1 r1Var);

    boolean f2(long j3);

    boolean g1(fj fjVar);

    void g2(r1 r1Var, int i7, float f10, float f11, boolean z10);

    jh.a h0();

    boolean i();

    boolean j0(r1 r1Var);

    boolean j2(r1 r1Var, TLRPC.TodoItem todoItem);

    String k(r1 r1Var);

    boolean k0(r1 r1Var, TLRPC.User user);

    void k1();

    void k2(r1 r1Var);

    void l2(r1 r1Var, long j3);

    void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11);

    void m0(int i7);

    void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean n0();

    void o0(r1 r1Var, float f10, float f11);

    void p();

    int p0(r1 r1Var);

    void p1(r1 r1Var, int i7);

    boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock);

    void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7);

    void q0(r1 r1Var);

    void q2(r1 r1Var);

    boolean r0();

    void s(r1 r1Var);

    void t(r1 r1Var);

    void t0(String str);

    void t1(r1 r1Var, float f10, float f11);

    void u2();

    boolean v0(org.telegram.ui.Components.x5 x5Var);

    void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void x();

    void x0(r1 r1Var, float f10, float f11);

    boolean x1();

    boolean y2(int i7);

    boolean z1(r1 r1Var, int i7);

    void z2();
}
