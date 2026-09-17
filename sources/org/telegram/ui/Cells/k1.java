package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ov0;
public interface k1 {
    void A(t1 t1Var);

    void A0(t1 t1Var);

    void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean B1();

    void C0(t1 t1Var);

    void D1(t1 t1Var);

    void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void F(t1 t1Var);

    void F0(t1 t1Var);

    void F1(MessageObject messageObject);

    void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10);

    CharacterStyle H1(t1 t1Var);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    boolean I0(long j3);

    void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void J0(t1 t1Var);

    boolean J1(t1 t1Var, MessageObject messageObject);

    void K1(t1 t1Var, ah.u uVar);

    void L(t1 t1Var);

    void L0(int i10, t1 t1Var);

    void L1();

    void M(int i10, t1 t1Var);

    void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void N(MessageObject messageObject);

    void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10);

    boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    boolean P();

    boolean Q(t1 t1Var);

    void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10);

    ov0 Q1();

    boolean R();

    boolean R0(t1 t1Var, boolean z10);

    void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void S0(t1 t1Var);

    boolean S1(long j3);

    void T(t1 t1Var);

    void T1(t1 t1Var, int i10, float f7, float f10, boolean z10);

    void U0(t1 t1Var);

    boolean U1(t1 t1Var, TLRPC.TodoItem todoItem);

    int V();

    void W1(t1 t1Var);

    boolean X0(int i10, t1 t1Var);

    ih.a Y();

    void Y1(t1 t1Var, long j3);

    boolean Z(t1 t1Var);

    boolean a0(t1 t1Var, TLRPC.User user);

    boolean c();

    void c0(int i10);

    boolean c1(MessageObject messageObject);

    boolean d0();

    boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock);

    void e0(t1 t1Var, float f7, float f10);

    void e1();

    void e2(t1 t1Var);

    boolean f();

    int f0(t1 t1Var);

    String g(t1 t1Var);

    void g0(t1 t1Var);

    void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i2();

    void j();

    boolean j0();

    void j1(t1 t1Var, TLRPC.Document document);

    void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void m0(String str);

    boolean m2(int i10);

    void n(t1 t1Var);

    boolean n0(org.telegram.ui.Components.z5 z5Var);

    void o();

    void o1(t1 t1Var, float f7, float f10);

    void o2();

    void p0(t1 t1Var, float f7, float f10);

    void p2(t1 t1Var, int i10, int i11);

    r9 q2();

    void r(t1 t1Var);

    void s();

    void s0(t1 t1Var, TLRPC.User user, float f7, float f10);

    void t(t1 t1Var);

    void t0(t1 t1Var, float f7, float f10, boolean z10);

    void u(t1 t1Var);

    boolean u0(MessageObject messageObject);

    boolean u1();

    void v0(t1 t1Var);

    void v1(t1 t1Var);

    String w(long j3);

    void w0();

    void w1(t1 t1Var, boolean z10);

    void x0(t1 t1Var, TLObject tLObject, boolean z10);

    void y(t1 t1Var);

    void y0(t1 t1Var, float f7, float f10);

    boolean z1(t1 t1Var, TLRPC.Chat chat);
}
