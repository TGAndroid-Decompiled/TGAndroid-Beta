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

    void A0(t1 t1Var, TLObject tLObject, boolean z10);

    boolean A1();

    void B0(t1 t1Var, float f7, float f10);

    void C1(t1 t1Var);

    void D0(t1 t1Var);

    void D1(t1 t1Var, boolean z10);

    void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void F(t1 t1Var);

    void F0(t1 t1Var);

    boolean G1(t1 t1Var, TLRPC.Chat chat);

    void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    void I0(t1 t1Var);

    boolean I1();

    void K1(t1 t1Var);

    void L(t1 t1Var);

    void M(int i10, t1 t1Var);

    boolean M0(long j3);

    void M1(MessageObject messageObject);

    void N(MessageObject messageObject);

    void N0(t1 t1Var);

    void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10);

    boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10);

    CharacterStyle O1(t1 t1Var);

    boolean P();

    void P0(int i10, t1 t1Var);

    void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean Q(t1 t1Var);

    boolean Q1(t1 t1Var, MessageObject messageObject);

    boolean R();

    void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void R1();

    void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void T(t1 t1Var);

    void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    int V();

    void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10);

    boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    boolean W0(t1 t1Var, boolean z10);

    void X0(t1 t1Var);

    hh.a Y();

    rv0 Y1();

    void Z0(t1 t1Var);

    boolean a0(t1 t1Var);

    boolean a2(long j3);

    boolean b0(t1 t1Var, TLRPC.User user);

    void b2(t1 t1Var, int i10, float f7, float f10, boolean z10);

    boolean c1(int i10, t1 t1Var);

    boolean c2(t1 t1Var, TLRPC.TodoItem todoItem);

    void d0(int i10);

    boolean e();

    boolean e0();

    void e2(t1 t1Var);

    boolean f();

    void f0(t1 t1Var, float f7, float f10);

    void g2(t1 t1Var, long j3);

    String h(t1 t1Var);

    int h0(t1 t1Var);

    boolean h1(MessageObject messageObject);

    void i(t1 t1Var, bi.f fVar);

    void i0(t1 t1Var);

    void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12);

    void k();

    void k1();

    boolean l0();

    boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock);

    void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void m2(t1 t1Var);

    void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void n0(String str);

    void o(t1 t1Var);

    boolean o0(org.telegram.ui.Components.x5 x5Var);

    void p();

    void p1(t1 t1Var, TLRPC.Document document);

    void q0(t1 t1Var, float f7, float f10);

    void q2();

    void r(t1 t1Var);

    void s();

    void t(t1 t1Var);

    void t0(t1 t1Var, TLRPC.User user, float f7, float f10);

    void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void u(t1 t1Var);

    void u1(t1 t1Var, float f7, float f10);

    void v0(t1 t1Var, float f7, float f10, boolean z10);

    boolean v2(int i10);

    String w(long j3);

    boolean w0(MessageObject messageObject);

    void x2();

    void y0(t1 t1Var);

    void y2(t1 t1Var, int i10, int i11);

    void z(t1 t1Var);

    void z0();

    r9 z2();
}
