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
public final class nc0 implements org.telegram.ui.Cells.l1 {
    public final oc0 f27341a;

    public nc0(oc0 oc0Var) {
        this.f27341a = oc0Var;
    }

    @Override
    public final boolean A1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean C1() {
        return false;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public final boolean K0(long j10) {
        return false;
    }

    @Override
    public final CharacterStyle K1(org.telegram.ui.Cells.u1 u1Var) {
        pc0 pc0Var = this.f27341a.f27637c;
        if (pc0Var.f27962a == 2) {
            MessagePreviewParams messagePreviewParams = pc0Var.f27967c0.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean M1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean P() {
        return true;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void S0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        oc0 oc0Var = this.f27341a;
        pc0 pc0Var = oc0Var.f27637c;
        if (pc0Var.f27962a == 2 && pc0Var.f27967c0.d.currentLink != characterStyle && u1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            vc0 vc0Var = oc0Var.f27637c.f27967c0;
            MessagePreviewParams messagePreviewParams = vc0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.fo foVar = vc0Var.f29620c;
            if (foVar != null && url != null) {
                foVar.cb(url, true);
            }
            pc0.b(oc0Var.f27637c, u1Var);
        }
    }

    @Override
    public final org.telegram.ui.vv0 S1() {
        return null;
    }

    @Override
    public final boolean T0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean T1(long j10) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final ih.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean a1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        pc0 pc0Var = this.f27341a.f27637c;
        if (pc0Var.f27962a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = pc0Var.f27967c0.d;
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
    public final boolean c() {
        pc0 pc0Var = this.f27341a.f27637c;
        if (pc0Var.f27962a == 2) {
            MessagePreviewParams messagePreviewParams = pc0Var.f27967c0.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
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
    public final boolean e1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public final boolean e2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
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
        return c();
    }

    @Override
    public final boolean o0(b6 b6Var) {
        return false;
    }

    @Override
    public final boolean p2(int i10) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.p9 t2() {
        return this.f27341a.f27637c.e;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final String x(long j10) {
        return null;
    }

    @Override
    public final boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void E1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void H1(MessageObject messageObject) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void d0(int i10) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void j2() {
    }

    @Override
    public final void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void N0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void P1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public final void i1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
