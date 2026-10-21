package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u01 implements org.telegram.ui.Cells.l1 {
    public final boolean f30808a;
    public final boolean f30809b;

    public u01(boolean z10, boolean z11) {
        this.f30808a = z10;
        this.f30809b = z11;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final boolean J0(long j10) {
        if (this.f30808a && this.f30809b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final org.telegram.ui.vu0 P1() {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        return this.f30808a;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final ih.a W() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final boolean l2(int i10) {
        return false;
    }

    @Override
    public final boolean o0(a6 a6Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.o9 p2() {
        return null;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final String w(long j10) {
        int i10;
        if (this.f30808a) {
            if (this.f30809b) {
                i10 = R.string.TagInfoOwnerTitle;
            } else {
                i10 = R.string.TagInfoAdminTitle;
            }
        } else {
            i10 = R.string.TagInfoMemberTitle;
        }
        return LocaleController.getString(i10);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void d0(int i10) {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void p(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
