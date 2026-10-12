package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.sv0;
public interface l1 {
    void A(u1 u1Var);

    void B(u1 u1Var);

    void B0(u1 u1Var, float f7, float f10, boolean z10);

    void B1(u1 u1Var, float f7, float f10);

    boolean C0(MessageObject messageObject);

    boolean C2(int i10);

    void D0(u1 u1Var);

    void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E0();

    void E2();

    void F(u1 u1Var);

    void F0(u1 u1Var, TLObject tLObject, boolean z10);

    void F2(u1 u1Var, int i10, int i11);

    void G0(u1 u1Var, float f7, float f10);

    p9 G2();

    boolean H1();

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    void I0(u1 u1Var);

    void J1(u1 u1Var);

    void K0(u1 u1Var);

    void K1(u1 u1Var, boolean z10);

    void L(u1 u1Var);

    void M(int i10, u1 u1Var);

    boolean M1(u1 u1Var, TLRPC.Chat chat);

    void N(MessageObject messageObject);

    void N0(u1 u1Var);

    void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10);

    boolean O1();

    boolean P();

    boolean Q(u1 u1Var);

    void Q1(u1 u1Var);

    boolean R();

    boolean R0(long j3);

    void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void S0(u1 u1Var);

    void S1(MessageObject messageObject);

    void T(u1 u1Var);

    void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void U0(int i10, u1 u1Var);

    CharacterStyle U1(u1 u1Var);

    int V();

    void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean W1(u1 u1Var, MessageObject messageObject);

    void X1();

    hh.a Y();

    void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean a0(u1 u1Var);

    void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10);

    void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean b1(u1 u1Var, boolean z10);

    boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer);

    boolean c0(u1 u1Var, TLRPC.User user);

    void c1(u1 u1Var);

    boolean e();

    void e0(int i10);

    void e1(u1 u1Var);

    sv0 e2();

    boolean f();

    boolean f0();

    String g(u1 u1Var);

    boolean g2(long j3);

    void h0(u1 u1Var, float f7, float f10);

    void h2(u1 u1Var, int i10, float f7, float f10, boolean z10);

    void i(u1 u1Var, bi.f fVar);

    boolean i1(int i10, u1 u1Var);

    boolean i2(u1 u1Var, TLRPC.TodoItem todoItem);

    void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12);

    int j0(u1 u1Var);

    void k();

    void k0(u1 u1Var);

    void k2(u1 u1Var);

    void m2(u1 u1Var, long j3);

    void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean n1(MessageObject messageObject);

    void o(u1 u1Var);

    boolean o0();

    void p();

    void q1();

    void r(u1 u1Var);

    void r0(String str);

    boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock);

    void s();

    boolean s0(org.telegram.ui.Components.b6 b6Var);

    void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void s2(u1 u1Var);

    void t(u1 u1Var);

    void u(u1 u1Var);

    void u0(u1 u1Var, float f7, float f10);

    void v1(u1 u1Var, TLRPC.Document document);

    String w(long j3);

    void x2();

    void z0(u1 u1Var, TLRPC.User user, float f7, float f10);

    void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);
}
