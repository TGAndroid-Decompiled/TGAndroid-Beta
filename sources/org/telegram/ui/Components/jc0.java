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
public final class jc0 implements org.telegram.ui.Cells.k1 {
    public final kc0 f27670a;

    public jc0(kc0 kc0Var) {
        this.f27670a = kc0Var;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        lc0 lc0Var = this.f27670a.f28004c;
        if (lc0Var.f28335a == 2) {
            MessagePreviewParams messagePreviewParams = lc0Var.f28340c0.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean J0(long j10) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean P() {
        return true;
    }

    @Override
    public final org.telegram.ui.yu0 P1() {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        kc0 kc0Var = this.f27670a;
        lc0 lc0Var = kc0Var.f28004c;
        if (lc0Var.f28335a == 2 && lc0Var.f28340c0.d.currentLink != characterStyle && t1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            rc0 rc0Var = kc0Var.f28004c.f28340c0;
            MessagePreviewParams messagePreviewParams = rc0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.sn snVar = rc0Var.f30145c;
            if (snVar != null && url != null) {
                snVar.cb(url, true);
            }
            lc0.b(kc0Var.f28004c, t1Var);
        }
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
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
    public final boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        lc0 lc0Var = this.f27670a.f28004c;
        if (lc0Var.f28335a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = lc0Var.f28340c0.d;
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
    public final boolean b2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.b1.a(messageObject);
    }

    @Override
    public final boolean e() {
        lc0 lc0Var = this.f27670a.f28004c;
        if (lc0Var.f28335a == 2) {
            MessagePreviewParams messagePreviewParams = lc0Var.f28340c0.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
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
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean l0() {
        return e();
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
    public final org.telegram.ui.Cells.p9 p2() {
        return this.f27670a.f28004c.e;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var) {
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
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var) {
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
    public final void p(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var, ah.t tVar) {
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void h1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
