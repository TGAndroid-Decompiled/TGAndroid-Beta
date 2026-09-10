package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.rv0;
public interface k1 {
    void A(t1 t1Var);

    void A0();

    void B0(t1 t1Var, TLObject tLObject, boolean z10);

    void B1(t1 t1Var);

    void C0(t1 t1Var, float f7, float f10);

    void C1(t1 t1Var, boolean z10);

    void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E(t1 t1Var);

    void E0(t1 t1Var);

    boolean E1(t1 t1Var, TLRPC.Chat chat);

    void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void G0(t1 t1Var);

    boolean G1();

    void H(MessageObject.TextLayoutBlock textLayoutBlock);

    void I0(t1 t1Var);

    void I1(t1 t1Var);

    void K(t1 t1Var);

    void K1(MessageObject messageObject);

    void L(int i10, t1 t1Var);

    void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void M(MessageObject messageObject);

    boolean M0(long j3);

    CharacterStyle M1(t1 t1Var);

    boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10);

    void N0(t1 t1Var);

    void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean O();

    boolean O1(t1 t1Var, MessageObject messageObject);

    boolean P(t1 t1Var);

    void P0(int i10, t1 t1Var);

    boolean Q();

    void Q1();

    void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void S(t1 t1Var);

    void S1(t1 t1Var, ai.j jVar);

    void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    int U();

    void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10);

    boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    boolean W0(t1 t1Var, boolean z10);

    gh.a X();

    void X0(t1 t1Var);

    rv0 X1();

    boolean Y(t1 t1Var);

    boolean Y1(long j3);

    void Z0(t1 t1Var);

    void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10);

    boolean a2(t1 t1Var, TLRPC.TodoItem todoItem);

    boolean b0(t1 t1Var, TLRPC.User user);

    void c0(int i10);

    boolean c1(int i10, t1 t1Var);

    void c2(t1 t1Var);

    boolean d0();

    boolean e();

    void e2(t1 t1Var, long j3);

    boolean f();

    void f0(t1 t1Var, float f7, float f10);

    String g(t1 t1Var);

    boolean g1(MessageObject messageObject);

    int h0(t1 t1Var);

    void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(t1 t1Var);

    void j();

    void j1();

    boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock);

    void k2(t1 t1Var);

    boolean l0();

    void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void n(t1 t1Var);

    void n0(String str);

    void o();

    boolean o0(org.telegram.ui.Components.y5 y5Var);

    void o1(t1 t1Var, TLRPC.Document document);

    void o2();

    void q(t1 t1Var);

    void q0(t1 t1Var, float f7, float f10);

    void r();

    void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void s(t1 t1Var);

    void t(t1 t1Var);

    void t1(t1 t1Var, float f7, float f10);

    boolean t2(int i10);

    void u0(t1 t1Var, TLRPC.User user, float f7, float f10);

    String v(long j3);

    void v2();

    void w0(t1 t1Var, float f7, float f10, boolean z10);

    void w2(t1 t1Var, int i10, int i11);

    boolean x0(MessageObject messageObject);

    t9 x2();

    void z(t1 t1Var);

    void z0(t1 t1Var);

    boolean z1();
}
