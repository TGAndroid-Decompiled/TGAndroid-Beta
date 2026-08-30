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
public interface k1 {
    void A(t1 t1Var);

    boolean A0(MessageObject messageObject);

    void A2();

    void B0(t1 t1Var);

    void B2(t1 t1Var, int i10, int i11);

    void C0();

    n9 C2();

    boolean D1();

    void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void E0(t1 t1Var, TLObject tLObject, boolean z4);

    void E1(t1 t1Var);

    void F(t1 t1Var);

    void F0(t1 t1Var, float f10, float f11);

    void G1(t1 t1Var, boolean z4);

    void H0(t1 t1Var);

    void I(MessageObject.TextLayoutBlock textLayoutBlock);

    boolean I1(t1 t1Var, TLRPC.Chat chat);

    void J0(t1 t1Var);

    void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean K1();

    void L(t1 t1Var);

    void L0(t1 t1Var);

    void M(t1 t1Var, jh.f fVar);

    void M1(t1 t1Var);

    void N(int i10, t1 t1Var);

    void O(MessageObject messageObject);

    boolean O0(long j10);

    void O1(MessageObject messageObject);

    boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4);

    void P0(t1 t1Var);

    void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4);

    boolean Q();

    boolean R(t1 t1Var);

    void R0(int i10, t1 t1Var);

    CharacterStyle R1(t1 t1Var);

    boolean S();

    void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4);

    void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean T1(t1 t1Var, MessageObject messageObject);

    void U(t1 t1Var);

    void V1();

    int W();

    void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4);

    void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean Y0(t1 t1Var, boolean z4);

    void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    ug.a Z();

    void Z0(t1 t1Var);

    boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    boolean a0(t1 t1Var);

    void a1(t1 t1Var);

    vu0 a2();

    boolean d();

    boolean d0(t1 t1Var, TLRPC.User user);

    boolean d1(int i10, t1 t1Var);

    boolean d2(long j10);

    boolean e();

    void e2(t1 t1Var, int i10, float f10, float f11, boolean z4);

    boolean f2(t1 t1Var, TLRPC.TodoItem todoItem);

    String g(t1 t1Var);

    void g0(int i10);

    boolean h0();

    void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(t1 t1Var, float f10, float f11);

    void i2(t1 t1Var);

    void j();

    boolean j1(MessageObject messageObject);

    int k0(t1 t1Var);

    void k2(t1 t1Var, long j10);

    void l0(t1 t1Var);

    void l1();

    void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    void n(t1 t1Var);

    boolean n0();

    void o();

    void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void p0(String str);

    boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock);

    void q(t1 t1Var);

    boolean q0(org.telegram.ui.Components.u5 u5Var);

    void q2(t1 t1Var);

    void r1(t1 t1Var, TLRPC.Document document);

    void s();

    void s0(t1 t1Var, float f10, float f11);

    void t(t1 t1Var);

    void t2();

    void u(t1 t1Var);

    void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11);

    String w(long j10);

    void x1(t1 t1Var, float f10, float f11);

    void y(t1 t1Var);

    void y0(t1 t1Var, TLRPC.User user, float f10, float f11);

    boolean y2(int i10);

    void z0(t1 t1Var, float f10, float f11, boolean z4);
}
