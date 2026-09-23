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
public final class xz0 implements org.telegram.ui.Cells.k1 {
    public final boolean f30100a;
    public final boolean f30101b;

    public xz0(boolean z10, boolean z11) {
        this.f30100a = z10;
        this.f30101b = z11;
    }

    @Override
    public final boolean A1() {
        return false;
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean I1() {
        return false;
    }

    @Override
    public final boolean M0(long j3) {
        if (this.f30100a && this.f30101b) {
            return true;
        }
        return false;
    }

    @Override
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final CharacterStyle O1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Q1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final int V() {
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
    public final hh.a Y() {
        return null;
    }

    @Override
    public final org.telegram.ui.iv0 Y1() {
        return null;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean a2(long j3) {
        return this.f30100a;
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
    public final boolean c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final String h(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        return org.telegram.messenger.ul.a(messageObject);
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final boolean l2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean o0(z5 z5Var) {
        return false;
    }

    @Override
    public final boolean v2(int i10) {
        return false;
    }

    @Override
    public final String w(long j3) {
        int i10;
        if (this.f30100a) {
            if (this.f30101b) {
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
    public final org.telegram.ui.Cells.s9 z2() {
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(MessageObject messageObject) {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void d0(int i10) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void m2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, bi.f fVar) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
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
    public final void u1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
