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
public final class d01 implements org.telegram.ui.Cells.k1 {
    public final boolean f26130a;
    public final boolean f26131b;

    public d01(boolean z4, boolean z10) {
        this.f26130a = z4;
        this.f26131b = z10;
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean E2(int i10) {
        return false;
    }

    @Override
    public final boolean H1() {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.n9 I2() {
        return null;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final boolean N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean P1() {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R0(long j10) {
        if (this.f26130a && this.f26131b) {
            return true;
        }
        return false;
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final CharacterStyle W1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean Y1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final vg.a Z() {
        return null;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean b1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e2(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final boolean g1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.xu0 g2() {
        return null;
    }

    @Override
    public final boolean j2(long j10) {
        return this.f26130a;
    }

    @Override
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public final boolean n0() {
        return false;
    }

    @Override
    public final boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public final String v(long j10) {
        int i10;
        if (this.f26130a) {
            if (this.f26131b) {
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
    public final boolean v2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void D0() {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G2() {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T1(MessageObject messageObject) {
    }

    @Override
    public final void a2() {
    }

    @Override
    public final void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void f0(int i10) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void p0(String str) {
    }

    @Override
    public final void p1() {
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
    public final void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public final void O1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.t1 t1Var, kh.f fVar) {
    }

    @Override
    public final void U0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void H2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void a1(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void d2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public final void B2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
