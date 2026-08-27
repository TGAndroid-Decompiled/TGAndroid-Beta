package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class cd1 implements org.telegram.ui.Cells.j1 {

    public final dd1 f37053a;

    public cd1(dd1 dd1Var) {
        this.f37053a = dd1Var;
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean L0(long j10) {
        return false;
    }

    @Override
    public final boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final ou0 O1() {
        return null;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        dd1 dd1Var = this.f37053a;
        if (dd1Var.G.getDelegate() != null) {
            return dd1Var.G.getDelegate().U(dd1Var.G, todoItem, z10);
        }
        return false;
    }

    @Override
    public final boolean V() {
        return false;
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final qg.a d0() {
        return null;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final boolean k2(int i10) {
        return false;
    }

    @Override
    public final int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public final boolean s1() {
        return false;
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final String z(long j10) {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D1(MessageObject messageObject) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void I1() {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void T(MessageObject messageObject) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void i0(int i10) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r0(String str) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public final void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
