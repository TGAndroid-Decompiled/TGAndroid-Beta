package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ob0 implements org.telegram.ui.Cells.k1 {
    public final pb0 f27531a;

    public ob0(pb0 pb0Var) {
        this.f27531a = pb0Var;
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.n9 C2() {
        return this.f27531a.f27810c.e;
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean K1() {
        return false;
    }

    @Override
    public final boolean O0(long j10) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final void P1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.t1 t1Var) {
        qb0 qb0Var = this.f27531a.f27810c;
        if (qb0Var.f28102a == 2) {
            MessagePreviewParams messagePreviewParams = qb0Var.W.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        pb0 pb0Var = this.f27531a;
        qb0 qb0Var = pb0Var.f27810c;
        if (qb0Var.f28102a == 2 && qb0Var.W.d.currentLink != characterStyle && t1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            wb0 wb0Var = pb0Var.f27810c.W;
            MessagePreviewParams messagePreviewParams = wb0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.xn xnVar = wb0Var.f30287c;
            if (xnVar != null && url != null) {
                xnVar.Ya(url, true);
            }
            qb0.b(pb0Var.f27810c, t1Var);
        }
    }

    @Override
    public final boolean Y0(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public final ug.a Z() {
        return null;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.vu0 a2() {
        return null;
    }

    @Override
    public final boolean d() {
        qb0 qb0Var = this.f27531a.f27810c;
        if (qb0Var.f28102a == 2) {
            MessagePreviewParams messagePreviewParams = qb0Var.W.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean d1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        qb0 qb0Var = this.f27531a.f27810c;
        if (qb0Var.f28102a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = qb0Var.W.d;
            if (!messagePreviewParams.singleLink) {
                TLRPC.WebPage webPage = messagePreviewParams.webpage;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d2(long j10) {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean n0() {
        return d();
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean y2(int i10) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void E1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void O(MessageObject messageObject) {
    }

    @Override
    public final void O1(MessageObject messageObject) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void a1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void g0(int i10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void p0(String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, jh.f fVar) {
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void v2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
