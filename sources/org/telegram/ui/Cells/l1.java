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

    void A0();

    void B0(u1 u1Var, TLObject tLObject, boolean z10);

    boolean B1();

    void C0(u1 u1Var, float f7, float f10);

    void D1(u1 u1Var);

    void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E0(u1 u1Var);

    void E1(u1 u1Var, boolean z10);

    void F(u1 u1Var);

    void G0(u1 u1Var);

    boolean G1(u1 u1Var, TLRPC.Chat chat);

    void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    boolean I1();

    void J0(u1 u1Var);

    void K1(u1 u1Var);

    void L(u1 u1Var);

    void M(int i10, u1 u1Var);

    void M1(MessageObject messageObject);

    void N(MessageObject messageObject);

    boolean N0(long j3);

    void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10);

    boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10);

    void O0(u1 u1Var);

    CharacterStyle O1(u1 u1Var);

    boolean P();

    void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean Q(u1 u1Var);

    void Q0(int i10, u1 u1Var);

    boolean Q1(u1 u1Var, MessageObject messageObject);

    boolean R();

    void R1();

    void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10);

    void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void T(u1 u1Var);

    void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str);

    int V();

    boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer);

    void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10);

    boolean X0(u1 u1Var, boolean z10);

    hh.a Y();

    void Y0(u1 u1Var);

    pv0 Y1();

    boolean a0(u1 u1Var);

    void a1(u1 u1Var);

    boolean a2(long j3);

    boolean b0(u1 u1Var, TLRPC.User user);

    void b2(u1 u1Var, int i10, float f7, float f10, boolean z10);

    boolean c2(u1 u1Var, TLRPC.TodoItem todoItem);

    void d0(int i10);

    boolean d1(int i10, u1 u1Var);

    boolean e();

    boolean e0();

    void e2(u1 u1Var);

    boolean f();

    void g0(u1 u1Var, float f7, float f10);

    void g2(u1 u1Var, long j3);

    String h(u1 u1Var);

    void i(u1 u1Var, bi.f fVar);

    int i0(u1 u1Var);

    boolean i1(MessageObject messageObject);

    void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12);

    void j0(u1 u1Var);

    void k();

    void l1();

    boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock);

    boolean m0();

    void m2(u1 u1Var);

    void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void o(u1 u1Var);

    void o0(String str);

    void p();

    boolean p0(org.telegram.ui.Components.y5 y5Var);

    void q1(u1 u1Var, TLRPC.Document document);

    void q2();

    void r(u1 u1Var);

    void r0(u1 u1Var, float f7, float f10);

    void s();

    void t(u1 u1Var);

    void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    void u(u1 u1Var);

    void u0(u1 u1Var, TLRPC.User user, float f7, float f10);

    void v1(u1 u1Var, float f7, float f10);

    boolean v2(int i10);

    String w(long j3);

    void w0(u1 u1Var, float f7, float f10, boolean z10);

    boolean x0(MessageObject messageObject);

    void x2();

    void y2(u1 u1Var, int i10, int i11);

    void z(u1 u1Var);

    void z0(u1 u1Var);

    s9 z2();
}
