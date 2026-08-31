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
    boolean A0(MessageObject messageObject);

    void B1(t1 t1Var, float f10, float f11);

    void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11);

    void C0(t1 t1Var);

    void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom);

    void D0();

    void E(t1 t1Var);

    boolean E2(int i10);

    void F0(t1 t1Var, TLObject tLObject, boolean z4);

    void G0(t1 t1Var, float f10, float f11);

    void G2();

    void H(MessageObject.TextLayoutBlock textLayoutBlock);

    boolean H1();

    void H2(t1 t1Var, int i10, int i11);

    void I0(t1 t1Var);

    n9 I2();

    void J1(t1 t1Var);

    void K(t1 t1Var);

    void K0(t1 t1Var);

    void L(int i10, t1 t1Var);

    void L1(t1 t1Var, boolean z4);

    void M(MessageObject messageObject);

    boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4);

    void N0(t1 t1Var);

    boolean N1(t1 t1Var, TLRPC.Chat chat);

    boolean O();

    void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    boolean P(t1 t1Var);

    boolean P1();

    void Q(t1 t1Var, kh.f fVar);

    boolean R();

    boolean R0(long j10);

    void R1(t1 t1Var);

    void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4);

    void S0(t1 t1Var);

    void T(t1 t1Var);

    void T1(MessageObject messageObject);

    void U0(int i10, t1 t1Var);

    void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4);

    int V();

    void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    CharacterStyle W1(t1 t1Var);

    void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11);

    boolean Y1(t1 t1Var, MessageObject messageObject);

    vg.a Z();

    boolean a0(t1 t1Var);

    void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4);

    void a2();

    boolean b1(t1 t1Var, boolean z4);

    boolean c0(t1 t1Var, TLRPC.User user);

    void c1(t1 t1Var);

    void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    boolean d();

    void d1(t1 t1Var);

    void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean e();

    boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer);

    void f0(int i10);

    String g(t1 t1Var);

    boolean g0();

    boolean g1(int i10, t1 t1Var);

    xu0 g2();

    void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12);

    void i0(t1 t1Var, float f10, float f11);

    void j();

    boolean j2(long j10);

    int k0(t1 t1Var);

    void k2(t1 t1Var, int i10, float f10, float f11, boolean z4);

    void l0(t1 t1Var);

    boolean l2(t1 t1Var, TLRPC.TodoItem todoItem);

    void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10);

    boolean m1(MessageObject messageObject);

    void n(t1 t1Var);

    boolean n0();

    void o();

    void o2(t1 t1Var);

    void p0(String str);

    void p1();

    void q(t1 t1Var);

    boolean q0(org.telegram.ui.Components.u5 u5Var);

    void q2(t1 t1Var, long j10);

    void r();

    void s(t1 t1Var);

    void s0(t1 t1Var, float f10, float f11);

    void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void t(t1 t1Var);

    String v(long j10);

    void v1(t1 t1Var, TLRPC.Document document);

    boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock);

    void w2(t1 t1Var);

    void x0(t1 t1Var, TLRPC.User user, float f10, float f11);

    void y(t1 t1Var);

    void z(t1 t1Var);

    void z0(t1 t1Var, float f10, float f11, boolean z4);

    void z2();
}
