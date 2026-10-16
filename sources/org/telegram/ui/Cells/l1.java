package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.vv0;
public interface l1 {
    void A0(u1 u1Var, TLObject tLObject, boolean z10);

    boolean A1(u1 u1Var, TLRPC.Chat chat);

    void B(u1 u1Var);

    void B0(u1 u1Var, float f7, float f10);

    void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void C(u1 u1Var);

    boolean C1();

    void D0(u1 u1Var);

    void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E1(u1 u1Var);

    void F0(u1 u1Var);

    void G(u1 u1Var);

    void H0(u1 u1Var);

    void H1(MessageObject messageObject);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10);

    boolean K0(long j10);

    CharacterStyle K1(u1 u1Var);

    void L(u1 u1Var);

    void L0(u1 u1Var);

    void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void M(int i10, u1 u1Var);

    boolean M1(u1 u1Var, MessageObject messageObject);

    void N(MessageObject messageObject);

    void N0(int i10, u1 u1Var);

    void N1(u1 u1Var, ah.t tVar);

    boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10);

    void O1();

    boolean P();

    void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean Q(u1 u1Var);

    void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean R();

    boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer);

    void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10);

    vv0 S1();

    void T(u1 u1Var);

    boolean T0(u1 u1Var, boolean z10);

    boolean T1(long j10);

    void U0(u1 u1Var);

    void U1(u1 u1Var, int i10, float f7, float f10, boolean z10);

    int V();

    boolean V1(u1 u1Var, TLRPC.TodoItem todoItem);

    void W0(u1 u1Var);

    void X1(u1 u1Var);

    ih.a Y();

    boolean Z(u1 u1Var);

    void Z1(u1 u1Var, long j10);

    boolean a1(int i10, u1 u1Var);

    boolean c();

    boolean c0(u1 u1Var, TLRPC.User user);

    void d0(int i10);

    boolean e();

    boolean e0();

    boolean e1(MessageObject messageObject);

    boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock);

    void f0(u1 u1Var, float f7, float f10);

    void f2(u1 u1Var);

    String g(u1 u1Var);

    void g1();

    int h0(u1 u1Var);

    void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(u1 u1Var);

    void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void j();

    void j2();

    boolean l0();

    void l1(u1 u1Var, TLRPC.Document document);

    void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void n(u1 u1Var);

    void n0(String str);

    void o();

    boolean o0(org.telegram.ui.Components.b6 b6Var);

    boolean p2(int i10);

    void q0(u1 u1Var, float f7, float f10);

    void q1(u1 u1Var, float f7, float f10);

    void r(u1 u1Var);

    void r2();

    void s();

    void s2(u1 u1Var, int i10, int i11);

    void t(u1 u1Var);

    p9 t2();

    void u(u1 u1Var);

    void u0(u1 u1Var, TLRPC.User user, float f7, float f10);

    void v0(u1 u1Var, float f7, float f10, boolean z10);

    boolean w1();

    String x(long j10);

    boolean x0(MessageObject messageObject);

    void x1(u1 u1Var);

    void y0(u1 u1Var);

    void y1(u1 u1Var, boolean z10);

    void z0();
}
