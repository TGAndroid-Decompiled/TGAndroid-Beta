package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.xu0;
public interface k1 {
    void A(t1 t1Var);

    void A0(t1 t1Var, float f7, float f10);

    void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void B(t1 t1Var);

    boolean B1();

    void C0(t1 t1Var);

    void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void D1(t1 t1Var);

    void E0(t1 t1Var);

    void F(t1 t1Var);

    void F1(MessageObject messageObject);

    void G(MessageObject.TextLayoutBlock textLayoutBlock);

    void G0(t1 t1Var);

    void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10);

    CharacterStyle H1(t1 t1Var);

    void I(t1 t1Var);

    void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean J0(long j10);

    boolean J1(t1 t1Var, MessageObject messageObject);

    void K(int i10, t1 t1Var);

    void K0(t1 t1Var);

    void K1(t1 t1Var, ah.t tVar);

    void L1();

    void M(MessageObject messageObject);

    void M0(int i10, t1 t1Var);

    void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10);

    void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    boolean P();

    xu0 P1();

    boolean Q(t1 t1Var);

    boolean Q1(long j10);

    boolean R();

    void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10);

    void R1(t1 t1Var, int i10, float f7, float f10, boolean z10);

    void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    boolean S0(t1 t1Var, boolean z10);

    boolean S1(t1 t1Var, TLRPC.TodoItem todoItem);

    void T(t1 t1Var);

    void T0(t1 t1Var);

    void U1(t1 t1Var);

    int V();

    void V0(t1 t1Var);

    ih.a W();

    void W1(t1 t1Var, long j10);

    boolean Z(t1 t1Var);

    boolean Z0(int i10, t1 t1Var);

    boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock);

    boolean c0(t1 t1Var, TLRPC.User user);

    void c2(t1 t1Var);

    void d0(int i10);

    boolean d1(MessageObject messageObject);

    boolean e();

    boolean e0();

    boolean f();

    void f0(t1 t1Var, float f7, float f10);

    void f1();

    String g(t1 t1Var);

    void g2();

    int h0(t1 t1Var);

    void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(t1 t1Var);

    void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void j();

    void k1(t1 t1Var, TLRPC.Document document);

    void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean l0();

    boolean l2(int i10);

    void m(t1 t1Var);

    void n();

    void n0(String str);

    void n2();

    boolean o0(org.telegram.ui.Components.y5 y5Var);

    void o2(t1 t1Var, int i10, int i11);

    void p(t1 t1Var);

    void p1(t1 t1Var, float f7, float f10);

    p9 p2();

    void q();

    void q0(t1 t1Var, float f7, float f10);

    void s(t1 t1Var);

    void t(t1 t1Var);

    void u0(t1 t1Var, TLRPC.User user, float f7, float f10);

    void v0(t1 t1Var, float f7, float f10, boolean z10);

    boolean v1();

    String w(long j10);

    boolean w0(MessageObject messageObject);

    void w1(t1 t1Var);

    void x0(t1 t1Var);

    void x1(t1 t1Var, boolean z10);

    void y0();

    void z0(t1 t1Var, TLObject tLObject, boolean z10);

    boolean z1(t1 t1Var, TLRPC.Chat chat);
}
