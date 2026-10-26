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
public final class fc0 implements org.telegram.ui.Cells.j1 {
    public final gc0 f28155a;

    public fc0(gc0 gc0Var) {
        this.f28155a = gc0Var;
    }

    @Override
    public final boolean C0(long j10) {
        return false;
    }

    @Override
    public final boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final org.telegram.ui.cv0 E1() {
        return null;
    }

    @Override
    public final boolean G1(long j10) {
        return false;
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        gc0 gc0Var = this.f28155a;
        hc0 hc0Var = gc0Var.f28535c;
        if (hc0Var.f28914a == 2 && hc0Var.f28919c0.d.currentLink != characterStyle && s1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            nc0 nc0Var = gc0Var.f28535c.f28919c0;
            MessagePreviewParams messagePreviewParams = nc0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.un unVar = nc0Var.f30958c;
            if (unVar != null && url != null) {
                unVar.hb(url, true);
            }
            hc0.b(gc0Var.f28535c, s1Var);
        }
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        hc0 hc0Var = this.f28155a.f28535c;
        if (hc0Var.f28914a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = hc0Var.f28919c0.d;
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
    public final boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final boolean S0(MessageObject messageObject) {
        return org.telegram.ui.d3.a(messageObject);
    }

    @Override
    public final jh.a V() {
        return null;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean X1(int i10) {
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.t9 b2() {
        return this.f28155a.f28535c.e;
    }

    @Override
    public final boolean c() {
        hc0 hc0Var = this.f28155a.f28535c;
        if (hc0Var.f28914a == 2) {
            MessagePreviewParams messagePreviewParams = hc0Var.f28919c0.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e0() {
        return c();
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean h0(c6 c6Var) {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final String u(long j10) {
        return null;
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        hc0 hc0Var = this.f28155a.f28535c;
        if (hc0Var.f28914a == 2) {
            MessagePreviewParams messagePreviewParams = hc0Var.f28919c0.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void Z1() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K(MessageObject messageObject) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z(int i10) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u1(MessageObject messageObject) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override
    public final void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
