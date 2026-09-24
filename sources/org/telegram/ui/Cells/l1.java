package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.hv0;
public interface l1 {
    void A(u1 u1Var);

    void A0(u1 u1Var, TLObject tLObject, boolean z10);

    boolean A1();

    void B0(u1 u1Var, float f7, float f10);

    void C1(u1 u1Var);

    void D0(u1 u1Var);

    void D1(u1 u1Var, boolean z10);

    void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void F(u1 u1Var);

    void F0(u1 u1Var);

    boolean G1(u1 u1Var, TLRPC.Chat chat);

    void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    void I0(u1 u1Var);

    boolean I1();

    void K1(u1 u1Var);

    void L(u1 u1Var);

    void M(int i10, u1 u1Var);

    boolean M0(long j3);

    void M1(MessageObject messageObject);

    void N(MessageObject messageObject);

    void N0(u1 u1Var);

    void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10);

    boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10);

    CharacterStyle O1(u1 u1Var);

    boolean P();

    void P0(int i10, u1 u1Var);

    void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean Q(u1 u1Var);

    boolean Q1(u1 u1Var, MessageObject messageObject);

    boolean R();

    void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void R1();

    void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void T(u1 u1Var);

    void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str);

    int V();

    void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10);

    boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer);

    boolean W0(u1 u1Var, boolean z10);

    void X0(u1 u1Var);

    hh.a Y();

    hv0 Y1();

    void Z0(u1 u1Var);

    boolean a0(u1 u1Var);

    boolean a2(long j3);

    boolean b0(u1 u1Var, TLRPC.User user);

    void b2(u1 u1Var, int i10, float f7, float f10, boolean z10);

    boolean c1(int i10, u1 u1Var);

    boolean c2(u1 u1Var, TLRPC.TodoItem todoItem);

    void d0(int i10);

    boolean e();

    boolean e0();

    void e2(u1 u1Var);

    boolean f();

    void f0(u1 u1Var, float f7, float f10);

    void g2(u1 u1Var, long j3);

    String h(u1 u1Var);

    int h0(u1 u1Var);

    boolean h1(MessageObject messageObject);

    void i(u1 u1Var, bi.f fVar);

    void i0(u1 u1Var);

    void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12);

    void k();

    void k1();

    boolean l0();

    boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock);

    void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void m2(u1 u1Var);

    void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void n0(String str);

    void o(u1 u1Var);

    boolean o0(org.telegram.ui.Components.z5 z5Var);

    void p();

    void p1(u1 u1Var, TLRPC.Document document);

    void q0(u1 u1Var, float f7, float f10);

    void q2();

    void r(u1 u1Var);

    void s();

    void t(u1 u1Var);

    void t0(u1 u1Var, TLRPC.User user, float f7, float f10);

    void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void u(u1 u1Var);

    void u1(u1 u1Var, float f7, float f10);

    void v0(u1 u1Var, float f7, float f10, boolean z10);

    boolean v2(int i10);

    String w(long j3);

    boolean w0(MessageObject messageObject);

    void x2();

    void y0(u1 u1Var);

    void y2(u1 u1Var, int i10, int i11);

    void z(u1 u1Var);

    void z0();

    r9 z2();
}
