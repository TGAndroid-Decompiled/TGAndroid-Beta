package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ou0;

public interface j1 {
    boolean A0(MessageObject messageObject);

    void B0(s1 s1Var);

    void B1(s1 s1Var);

    void C0();

    void D(s1 s1Var);

    void D1(MessageObject messageObject);

    void E0(s1 s1Var, TLObject tLObject, boolean z10);

    void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void F0(s1 s1Var, float f10, float f11);

    CharacterStyle F1(s1 s1Var);

    void G0(s1 s1Var);

    void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    void H(s1 s1Var);

    void H0(s1 s1Var);

    boolean H1(s1 s1Var, MessageObject messageObject);

    void I1();

    void J0(s1 s1Var);

    void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    boolean L0(long j10);

    void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str);

    void M(s1 s1Var);

    void M0(s1 s1Var);

    boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer);

    void O(MessageObject.TextLayoutBlock textLayoutBlock);

    void O0(int i10, s1 s1Var);

    ou0 O1();

    void Q(s1 s1Var);

    void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean Q1(long j10);

    void R(int i10, s1 s1Var);

    void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10);

    void R1(s1 s1Var, int i10, float f10, float f11, boolean z10);

    boolean S0(s1 s1Var, boolean z10);

    void T(MessageObject messageObject);

    boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10);

    void U0(s1 s1Var);

    boolean V();

    boolean V1(s1 s1Var, TLRPC.TodoItem todoItem);

    boolean W(s1 s1Var);

    void W0(s1 s1Var);

    boolean X();

    void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10);

    boolean Y0(int i10, s1 s1Var);

    void Z(s1 s1Var);

    void Z1(s1 s1Var);

    boolean a1(MessageObject messageObject);

    void a2(s1 s1Var, fh.f fVar);

    int b0();

    void b2(s1 s1Var, long j10);

    boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock);

    boolean d();

    qg.a d0();

    void d1();

    void d2(s1 s1Var);

    boolean e0(s1 s1Var);

    void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean f();

    boolean f0(s1 s1Var, TLRPC.User user);

    String h(s1 s1Var);

    void h1(s1 s1Var, TLRPC.Document document);

    void h2();

    void i0(int i10);

    void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12);

    boolean j0();

    void k();

    void k0(s1 s1Var, float f10, float f11);

    boolean k2(int i10);

    int l0(s1 s1Var);

    void m0(s1 s1Var);

    void m1(s1 s1Var, float f10, float f11);

    void m2();

    void n2(s1 s1Var, int i10, int i11);

    void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    k9 o2();

    void p(s1 s1Var);

    boolean p0();

    void q();

    void r0(String str);

    boolean s0(org.telegram.ui.Components.t5 t5Var);

    boolean s1();

    void t(s1 s1Var);

    void t0(s1 s1Var, float f10, float f11);

    void u();

    void u1(s1 s1Var);

    void v(s1 s1Var);

    void v0(s1 s1Var, TLRPC.User user, float f10, float f11);

    void v1(s1 s1Var, boolean z10);

    void x(s1 s1Var);

    void x0(s1 s1Var, float f10, float f11, boolean z10);

    boolean x1(s1 s1Var, TLRPC.Chat chat);

    void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    String z(long j10);

    boolean z1();
}
