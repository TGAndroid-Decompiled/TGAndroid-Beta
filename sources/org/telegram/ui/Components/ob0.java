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
    public final pb0 f29028a;

    public ob0(pb0 pb0Var) {
        this.f29028a = pb0Var;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        qb0 qb0Var = this.f29028a.f29346c;
        if (qb0Var.f29657a == 2) {
            MessagePreviewParams messagePreviewParams = qb0Var.f29662c0.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean I0(long j3) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
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
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        pb0 pb0Var = this.f29028a;
        qb0 qb0Var = pb0Var.f29346c;
        if (qb0Var.f29657a == 2 && qb0Var.f29662c0.d.currentLink != characterStyle && t1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            wb0 wb0Var = pb0Var.f29346c.f29662c0;
            MessagePreviewParams messagePreviewParams = wb0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.co coVar = wb0Var.f32226c;
            if (coVar != null && url != null) {
                coVar.Ya(url, true);
            }
            qb0.b(pb0Var.f29346c, t1Var);
        }
    }

    @Override
    public final org.telegram.ui.ov0 Q1() {
        return null;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean S1(long j3) {
        return false;
    }

    @Override
    public final boolean U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        qb0 qb0Var = this.f29028a.f29346c;
        if (qb0Var.f29657a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = qb0Var.f29662c0.d;
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
    public final ih.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean c() {
        qb0 qb0Var = this.f29028a.f29346c;
        if (qb0Var.f29657a == 2) {
            MessagePreviewParams messagePreviewParams = qb0Var.f29662c0.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c1(MessageObject messageObject) {
        return org.telegram.messenger.vl.a(messageObject);
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean j0() {
        return c();
    }

    @Override
    public final boolean m2(int i10) {
        return false;
    }

    @Override
    public final boolean n0(z5 z5Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.r9 q2() {
        return this.f29028a.f29346c.f29663e;
    }

    @Override
    public final boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final String w(long j3) {
        return null;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
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
    public final void L1() {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o2() {
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
    public final void v0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
    }

    @Override
    public final void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
