package org.telegram.ui.Cells;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.nu0;
public interface k1 {
    void A0(t1 t1Var);

    void A1(t1 t1Var);

    void B0();

    String C(long j10);

    void C1(MessageObject messageObject);

    void D0(t1 t1Var, TLObject tLObject, boolean z10);

    void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10);

    void E0(t1 t1Var, float f10, float f11);

    CharacterStyle E1(t1 t1Var);

    void F(t1 t1Var);

    void F0(t1 t1Var);

    void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10);

    void G0(t1 t1Var);

    boolean G1(t1 t1Var, MessageObject messageObject);

    void I0(t1 t1Var);

    void I1();

    void J(t1 t1Var);

    boolean K0(long j10);

    void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void M0(t1 t1Var);

    void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    void N(t1 t1Var);

    void O0(int i9, t1 t1Var);

    boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    void P(MessageObject.TextLayoutBlock textLayoutBlock);

    nu0 P1();

    void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void R(t1 t1Var);

    void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10);

    boolean R1(long j10);

    void S(int i9, t1 t1Var);

    boolean S0(t1 t1Var, boolean z10);

    void S1(t1 t1Var, int i9, float f10, float f11, boolean z10);

    void U(MessageObject messageObject);

    void U0(t1 t1Var);

    boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10);

    boolean W();

    void W0(t1 t1Var);

    boolean W1(t1 t1Var, TLRPC.TodoItem todoItem);

    boolean X(t1 t1Var);

    boolean Y();

    boolean Y0(int i9, t1 t1Var);

    void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10);

    boolean Z0(MessageObject messageObject);

    void a0(t1 t1Var);

    int b0();

    void b2(t1 t1Var);

    pg.a d0();

    void d1();

    boolean e0(t1 t1Var);

    void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void e2(t1 t1Var, long j10);

    boolean f();

    boolean f0(t1 t1Var, TLRPC.User user);

    boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock);

    void g1(t1 t1Var, TLRPC.Document document);

    void g2(t1 t1Var);

    boolean h();

    String i(t1 t1Var);

    void i0(int i9);

    boolean j0();

    void k0(t1 t1Var, float f10, float f11);

    void k2();

    void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11);

    int l0(t1 t1Var);

    void l1(t1 t1Var, float f10, float f11);

    void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void m();

    void m0(t1 t1Var);

    boolean n2(int i9);

    boolean o0();

    void o2();

    void p2(t1 t1Var, int i9, int i10);

    void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9);

    void q0(String str);

    o9 q2();

    void r(t1 t1Var);

    boolean r0(org.telegram.ui.Components.t5 t5Var);

    boolean r1();

    void s();

    void s0(t1 t1Var, float f10, float f11);

    void s1(t1 t1Var);

    void t1(t1 t1Var, boolean z10);

    void u0(t1 t1Var, TLRPC.User user, float f10, float f11);

    void v(t1 t1Var);

    void w();

    void w0(t1 t1Var, float f10, float f11, boolean z10);

    void w1(t1 t1Var, eh.f fVar);

    void x(t1 t1Var);

    boolean x1(t1 t1Var, TLRPC.Chat chat);

    void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void z(t1 t1Var);

    boolean z0(MessageObject messageObject);

    boolean z1();
}
