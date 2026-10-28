package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ev0;
public interface j1 {
    void A0(s1 s1Var);

    void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str);

    void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    boolean C0(long j10);

    boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer);

    void D(s1 s1Var);

    void D0(s1 s1Var);

    void E0(int i10, s1 s1Var);

    ev0 E1();

    void F(MessageObject.TextLayoutBlock textLayoutBlock);

    void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean G1(long j10);

    void H1(s1 s1Var, int i10, float f7, float f10, boolean z10);

    void I(s1 s1Var);

    void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10);

    boolean I1(s1 s1Var, TLRPC.TodoItem todoItem);

    void J(int i10, s1 s1Var);

    boolean J0(s1 s1Var, boolean z10);

    void K(MessageObject messageObject);

    void K0(s1 s1Var);

    void K1(s1 s1Var);

    boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10);

    void L0(s1 s1Var);

    boolean M();

    void M1(s1 s1Var, long j10);

    boolean N(s1 s1Var);

    boolean O();

    boolean O0(int i10, s1 s1Var);

    void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void Q(s1 s1Var);

    boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock);

    void R1(s1 s1Var);

    int S();

    boolean S0(MessageObject messageObject);

    void U0();

    jh.a V();

    void V1();

    boolean W(s1 s1Var);

    void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    boolean X(s1 s1Var, TLRPC.User user);

    boolean X1(int i10);

    void Z(int i10);

    void Z0(s1 s1Var, TLRPC.Document document);

    void Z1();

    boolean a0();

    void a2(s1 s1Var, int i10, int i11);

    void b0(s1 s1Var, float f7, float f10);

    t9 b2();

    boolean c();

    int c0(s1 s1Var);

    boolean d();

    void d0(s1 s1Var);

    boolean e0();

    void f1(s1 s1Var, float f7, float f10);

    void g0(String str);

    String h(s1 s1Var);

    boolean h0(org.telegram.ui.Components.c6 c6Var);

    void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12);

    void j();

    void j0(s1 s1Var, float f7, float f10);

    boolean k1();

    void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void l1(s1 s1Var, boolean z10, boolean z11);

    void m(s1 s1Var);

    void m0(s1 s1Var, TLRPC.User user, float f7, float f10);

    void m1(s1 s1Var);

    void n();

    void n0(s1 s1Var, bh.n nVar);

    void n1(s1 s1Var, boolean z10);

    void o0(s1 s1Var, float f7, float f10, boolean z10);

    void p(s1 s1Var);

    boolean p1(s1 s1Var, TLRPC.Chat chat);

    void q();

    boolean q0(MessageObject messageObject);

    void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void r(s1 s1Var);

    void r0(s1 s1Var);

    boolean r1();

    void s(s1 s1Var);

    void s0();

    void s1(s1 s1Var);

    void t0(s1 s1Var, TLObject tLObject, boolean z10);

    String u(long j10);

    void u0(s1 s1Var, float f7, float f10);

    void u1(MessageObject messageObject);

    void v(s1 s1Var);

    void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void w0(s1 s1Var);

    CharacterStyle w1(s1 s1Var);

    void x(s1 s1Var);

    void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void y0(s1 s1Var, boolean z10, boolean z11);

    boolean y1(s1 s1Var, MessageObject messageObject);

    void z1();
}
