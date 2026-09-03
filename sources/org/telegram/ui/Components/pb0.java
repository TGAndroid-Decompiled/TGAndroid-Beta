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
public final class pb0 implements org.telegram.ui.Cells.j1 {
    public final qb0 f27817a;

    public pb0(qb0 qb0Var) {
        this.f27817a = qb0Var;
    }

    @Override
    public final boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.m9 D2() {
        return this.f27817a.f28139c.e;
    }

    @Override
    public final boolean F1() {
        return false;
    }

    @Override
    public final boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean M1() {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        rb0 rb0Var = this.f27817a.f28139c;
        if (rb0Var.f28440a == 2) {
            MessagePreviewParams messagePreviewParams = rb0Var.W.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final ug.a Z() {
        return null;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        qb0 qb0Var = this.f27817a;
        rb0 rb0Var = qb0Var.f28139c;
        if (rb0Var.f28440a == 2 && rb0Var.W.d.currentLink != characterStyle && s1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            xb0 xb0Var = qb0Var.f28139c.W;
            MessagePreviewParams messagePreviewParams = xb0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.zn znVar = xb0Var.f30575c;
            if (znVar != null && url != null) {
                znVar.Ya(url, true);
            }
            rb0.b(qb0Var.f28139c, s1Var);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public final org.telegram.ui.cv0 c2() {
        return null;
    }

    @Override
    public final boolean e() {
        rb0 rb0Var = this.f27817a.f28139c;
        if (rb0Var.f28440a == 2) {
            MessagePreviewParams messagePreviewParams = rb0Var.W.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean e2(long j10) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        rb0 rb0Var = this.f27817a.f28139c;
        if (rb0Var.f28440a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = rb0Var.W.d;
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
    public final int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public final boolean p0() {
        return e();
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean t0(u5 u5Var) {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean z2(int i10) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void E0() {
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void O(MessageObject messageObject) {
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Q1(MessageObject messageObject) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void f0(int i10) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void s0(String str) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
