package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.vu0;
public interface l1 {
    void A(u1 u1Var);

    void A0(u1 u1Var, float f7, float f10);

    void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void B(u1 u1Var);

    boolean B1();

    void C0(u1 u1Var);

    void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void D1(u1 u1Var);

    void E0(u1 u1Var);

    void F(u1 u1Var);

    void F1(MessageObject messageObject);

    void G(MessageObject.TextLayoutBlock textLayoutBlock);

    void G0(u1 u1Var);

    void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10);

    CharacterStyle H1(u1 u1Var);

    void I(u1 u1Var);

    void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean J0(long j10);

    boolean J1(u1 u1Var, MessageObject messageObject);

    void K(int i10, u1 u1Var);

    void K0(u1 u1Var);

    void K1(u1 u1Var, ah.t tVar);

    void L1();

    void M(MessageObject messageObject);

    void M0(int i10, u1 u1Var);

    void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10);

    void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str);

    void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer);

    boolean P();

    vu0 P1();

    boolean Q(u1 u1Var);

    boolean Q1(long j10);

    boolean R();

    void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10);

    void R1(u1 u1Var, int i10, float f7, float f10, boolean z10);

    void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    boolean S0(u1 u1Var, boolean z10);

    boolean S1(u1 u1Var, TLRPC.TodoItem todoItem);

    void T(u1 u1Var);

    void T0(u1 u1Var);

    void U1(u1 u1Var);

    int V();

    void V0(u1 u1Var);

    ih.a W();

    void W1(u1 u1Var, long j10);

    boolean Z(u1 u1Var);

    boolean Z0(int i10, u1 u1Var);

    boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock);

    boolean c();

    boolean c0(u1 u1Var, TLRPC.User user);

    void c2(u1 u1Var);

    void d0(int i10);

    boolean d1(MessageObject messageObject);

    boolean e();

    boolean e0();

    void f0(u1 u1Var, float f7, float f10);

    void f1();

    String g(u1 u1Var);

    void g2();

    int h0(u1 u1Var);

    void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(u1 u1Var);

    void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void j();

    void k1(u1 u1Var, TLRPC.Document document);

    void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean l0();

    boolean l2(int i10);

    void m(u1 u1Var);

    void n();

    void n0(String str);

    void n2();

    boolean o0(org.telegram.ui.Components.a6 a6Var);

    void o2(u1 u1Var, int i10, int i11);

    void p(u1 u1Var);

    void p1(u1 u1Var, float f7, float f10);

    o9 p2();

    void q();

    void q0(u1 u1Var, float f7, float f10);

    void s(u1 u1Var);

    void t(u1 u1Var);

    void u0(u1 u1Var, TLRPC.User user, float f7, float f10);

    void v0(u1 u1Var, float f7, float f10, boolean z10);

    boolean v1();

    String w(long j10);

    boolean w0(MessageObject messageObject);

    void w1(u1 u1Var);

    void x0(u1 u1Var);

    void x1(u1 u1Var, boolean z10);

    void y0();

    void z0(u1 u1Var, TLObject tLObject, boolean z10);

    boolean z1(u1 u1Var, TLRPC.Chat chat);
}
