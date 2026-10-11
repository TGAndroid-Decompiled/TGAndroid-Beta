package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.pv0;
public interface l1 {
    void A(u1 u1Var);

    void A0(u1 u1Var, TLRPC.User user, float f7, float f10);

    void A1(u1 u1Var, float f7, float f10);

    boolean A2(int i10);

    void B(u1 u1Var);

    void C0(u1 u1Var, float f7, float f10, boolean z10);

    void C2();

    boolean D0(MessageObject messageObject);

    void D2(u1 u1Var, int i10, int i11);

    void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E0(u1 u1Var);

    p9 E2();

    void F0();

    void G(u1 u1Var);

    void G0(u1 u1Var, TLObject tLObject, boolean z10);

    void H0(u1 u1Var, float f7, float f10);

    boolean H1();

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    void J0(u1 u1Var);

    void J1(u1 u1Var);

    void K1(u1 u1Var, boolean z10);

    void L(u1 u1Var);

    void L0(u1 u1Var);

    void M(int i10, u1 u1Var);

    boolean M1(u1 u1Var, TLRPC.Chat chat);

    void N(MessageObject messageObject);

    void N0(u1 u1Var);

    void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10);

    boolean O1();

    boolean Q();

    void Q1(u1 u1Var);

    boolean R(u1 u1Var);

    boolean R0(long j3);

    boolean S();

    void S0(u1 u1Var);

    void S1(MessageObject messageObject);

    void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void U(u1 u1Var);

    CharacterStyle U1(u1 u1Var);

    void V0(int i10, u1 u1Var);

    void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    int W();

    boolean W1(u1 u1Var, MessageObject messageObject);

    void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void X1();

    hh.a Y();

    void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean b0(u1 u1Var);

    void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10);

    boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer);

    boolean c1(u1 u1Var, boolean z10);

    void d1(u1 u1Var);

    boolean e();

    boolean e0(u1 u1Var, TLRPC.User user);

    pv0 e2();

    boolean f();

    void f1(u1 u1Var);

    String g(u1 u1Var);

    void g0(int i10);

    boolean g2(long j3);

    boolean h0();

    void h2(u1 u1Var, int i10, float f7, float f10, boolean z10);

    void i(u1 u1Var, bi.f fVar);

    boolean i1(int i10, u1 u1Var);

    boolean i2(u1 u1Var, TLRPC.TodoItem todoItem);

    void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12);

    void j0(u1 u1Var, float f7, float f10);

    void k();

    void k2(u1 u1Var);

    int l0(u1 u1Var);

    void m0(u1 u1Var);

    void m2(u1 u1Var, long j3);

    void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean n1(MessageObject messageObject);

    void o(u1 u1Var);

    void p();

    boolean p0();

    void q1();

    void r(u1 u1Var);

    void r0(String str);

    boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock);

    void s();

    void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void s2(u1 u1Var);

    void t(u1 u1Var);

    boolean t0(org.telegram.ui.Components.b6 b6Var);

    void u(u1 u1Var);

    void v0(u1 u1Var, float f7, float f10);

    void v1(u1 u1Var, TLRPC.Document document);

    String w(long j3);

    void w2();

    void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);
}
