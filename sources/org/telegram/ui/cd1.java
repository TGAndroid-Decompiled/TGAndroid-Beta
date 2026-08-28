package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class cd1 implements org.telegram.ui.Cells.k1 {
    public final dd1 f37172a;

    public cd1(dd1 dd1Var) {
        this.f37172a = dd1Var;
    }

    @Override
    public final String C(long j10) {
        return null;
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean K0(long j10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final nu0 P1() {
        return null;
    }

    @Override
    public final boolean R1(long j10) {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        dd1 dd1Var = this.f37172a;
        if (dd1Var.G.getDelegate() != null) {
            return dd1Var.G.getDelegate().V(dd1Var.G, todoItem, z10);
        }
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final pg.a d0() {
        return null;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean n2(int i9) {
        return false;
    }

    @Override
    public final boolean o0() {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override
    public final boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C1(MessageObject messageObject) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I1() {
    }

    @Override
    public final void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U(MessageObject messageObject) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i0(int i9) {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q0(String str) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public final void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
