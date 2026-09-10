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
public final class k01 implements org.telegram.ui.Cells.k1 {
    public final boolean f24531a;
    public final boolean f24532b;

    public k01(boolean z10, boolean z11) {
        this.f24531a = z10;
        this.f24532b = z11;
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public final boolean M0(long j3) {
        if (this.f24531a && this.f24532b) {
            return true;
        }
        return false;
    }

    @Override
    public final CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int U() {
        return 0;
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final gh.a X() {
        return null;
    }

    @Override
    public final org.telegram.ui.rv0 X1() {
        return null;
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Y1(long j3) {
        return this.f24531a;
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean g1(MessageObject messageObject) {
        return org.telegram.messenger.em.a(messageObject);
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final boolean o0(y5 y5Var) {
        return false;
    }

    @Override
    public final boolean t2(int i10) {
        return false;
    }

    @Override
    public final String v(long j3) {
        int i10;
        if (this.f24531a) {
            if (this.f24532b) {
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
    public final boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.t9 x2() {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K1(MessageObject messageObject) {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void Q1() {
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
