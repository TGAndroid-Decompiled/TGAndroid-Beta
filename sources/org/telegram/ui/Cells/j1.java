package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.cv0;
public interface j1 {
    void A(s1 s1Var);

    void A0(s1 s1Var, float f10, float f11, boolean z4);

    boolean B0(MessageObject messageObject);

    void B2();

    void C2(s1 s1Var, int i10, int i11);

    void D0(s1 s1Var);

    m9 D2();

    void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E0();

    void F(s1 s1Var);

    void F0(s1 s1Var, TLObject tLObject, boolean z4);

    boolean F1();

    void G0(s1 s1Var, float f10, float f11);

    void H1(s1 s1Var);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    void I0(s1 s1Var);

    void I1(s1 s1Var, boolean z4);

    void K0(s1 s1Var);

    boolean K1(s1 s1Var, TLRPC.Chat chat);

    void L(s1 s1Var);

    void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void M(s1 s1Var, jh.f fVar);

    boolean M1();

    void N(int i10, s1 s1Var);

    void N0(s1 s1Var);

    void O(MessageObject messageObject);

    void O1(s1 s1Var);

    boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4);

    boolean Q();

    void Q1(MessageObject messageObject);

    boolean R(s1 s1Var);

    boolean R0(long j10);

    void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4);

    boolean S();

    void S0(s1 s1Var);

    CharacterStyle S1(s1 s1Var);

    void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4);

    void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void U(s1 s1Var);

    void U0(int i10, s1 s1Var);

    boolean U1(s1 s1Var, MessageObject messageObject);

    void V1();

    int W();

    void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    ug.a Z();

    void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean a0(s1 s1Var);

    boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer);

    void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4);

    boolean c0(s1 s1Var, TLRPC.User user);

    boolean c1(s1 s1Var, boolean z4);

    cv0 c2();

    void d1(s1 s1Var);

    boolean e();

    void e1(s1 s1Var);

    boolean e2(long j10);

    boolean f();

    void f0(int i10);

    void f2(s1 s1Var, int i10, float f10, float f11, boolean z4);

    String g(s1 s1Var);

    boolean g0();

    boolean g2(s1 s1Var, TLRPC.TodoItem todoItem);

    boolean h1(int i10, s1 s1Var);

    void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(s1 s1Var, float f10, float f11);

    void j();

    void j2(s1 s1Var);

    int k0(s1 s1Var);

    void l0(s1 s1Var);

    void l2(s1 s1Var, long j10);

    void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean m1(MessageObject messageObject);

    void n(s1 s1Var);

    void o();

    boolean p0();

    void p1();

    void q(s1 s1Var);

    void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock);

    void s();

    void s0(String str);

    void s2(s1 s1Var);

    void t(s1 s1Var);

    boolean t0(org.telegram.ui.Components.u5 u5Var);

    void u(s1 s1Var);

    void u1(s1 s1Var, TLRPC.Document document);

    void v0(s1 s1Var, float f10, float f11);

    void v2();

    String w(long j10);

    void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11);

    void y(s1 s1Var);

    void y0(s1 s1Var, TLRPC.User user, float f10, float f11);

    void z1(s1 s1Var, float f10, float f11);

    boolean z2(int i10);
}
