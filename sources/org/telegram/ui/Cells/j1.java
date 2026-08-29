package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.lu0;
public interface j1 {
    void A(s1 s1Var);

    void A0(s1 s1Var, TLObject tLObject, boolean z10);

    boolean A1();

    void B0(s1 s1Var, float f9, float f10);

    void C(s1 s1Var);

    void C1(s1 s1Var);

    void D0(s1 s1Var);

    void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void F(s1 s1Var);

    void F0(s1 s1Var);

    void F1(s1 s1Var, boolean z10);

    void H(MessageObject.TextLayoutBlock textLayoutBlock);

    boolean H1(s1 s1Var, TLRPC.Chat chat);

    void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void J0(s1 s1Var);

    boolean J1();

    void K(s1 s1Var);

    void L(int i10, s1 s1Var);

    void L1(s1 s1Var);

    boolean M0(long j10);

    void N(MessageObject messageObject);

    void N0(s1 s1Var);

    void N1(MessageObject messageObject);

    boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10);

    void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10);

    boolean P();

    void P0(int i10, s1 s1Var);

    CharacterStyle P1(s1 s1Var);

    boolean Q(s1 s1Var);

    void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean R();

    void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean R1(s1 s1Var, MessageObject messageObject);

    void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10);

    void S1();

    void T(s1 s1Var);

    void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    int V();

    void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10);

    void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean W0(s1 s1Var, boolean z10);

    boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer);

    sg.a X();

    void X0(s1 s1Var);

    boolean Y(s1 s1Var);

    void Y0(s1 s1Var);

    lu0 Y1();

    boolean Z(s1 s1Var, TLRPC.User user);

    boolean a2(long j10);

    void b2(s1 s1Var, int i10, float f9, float f10, boolean z10);

    boolean c();

    void c0(int i10);

    boolean c1(int i10, s1 s1Var);

    boolean c2(s1 s1Var, TLRPC.TodoItem todoItem);

    boolean d0();

    void e0(s1 s1Var, float f9, float f10);

    void e2(s1 s1Var);

    boolean f();

    int f0(s1 s1Var);

    String g(s1 s1Var);

    void g0(s1 s1Var);

    void g2(s1 s1Var, long j10);

    boolean h1(MessageObject messageObject);

    void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12);

    boolean j0();

    void j2(s1 s1Var, hh.f fVar);

    void k();

    void k1();

    void m0(String str);

    void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock);

    void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean n0(org.telegram.ui.Components.y5 y5Var);

    void n2(s1 s1Var);

    void o(s1 s1Var);

    void p();

    void p0(s1 s1Var, float f9, float f10);

    void p1(s1 s1Var, TLRPC.Document document);

    void q2();

    void s(s1 s1Var);

    void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10);

    void t();

    void t0(s1 s1Var, TLRPC.User user, float f9, float f10);

    void u(s1 s1Var);

    void u1(s1 s1Var, float f9, float f10);

    boolean u2(int i10);

    void v0(s1 s1Var, float f9, float f10, boolean z10);

    void w(s1 s1Var);

    boolean w0(MessageObject messageObject);

    void w2();

    void x2(s1 s1Var, int i10, int i11);

    String y(long j10);

    void y0(s1 s1Var);

    l9 y2();

    void z0();
}
