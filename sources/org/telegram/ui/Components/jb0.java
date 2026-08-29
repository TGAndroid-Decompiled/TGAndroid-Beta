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
public final class jb0 implements org.telegram.ui.Cells.j1 {
    public final kb0 f29636a;

    public jb0(kb0 kb0Var) {
        this.f29636a = kb0Var;
    }

    @Override
    public final boolean A1() {
        return false;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final boolean M0(long j10) {
        return false;
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public final boolean P() {
        return true;
    }

    @Override
    public final CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        lb0 lb0Var = this.f29636a.f30006c;
        if (lb0Var.f30273a == 2) {
            MessagePreviewParams messagePreviewParams = lb0Var.V.d;
            if (!messagePreviewParams.singleLink) {
                return messagePreviewParams.currentLink;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        kb0 kb0Var = this.f29636a;
        lb0 lb0Var = kb0Var.f30006c;
        if (lb0Var.f30273a == 2 && lb0Var.V.d.currentLink != characterStyle && s1Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            rb0 rb0Var = kb0Var.f30006c.V;
            MessagePreviewParams messagePreviewParams = rb0Var.d;
            messagePreviewParams.currentLink = characterStyle;
            messagePreviewParams.webpage = null;
            org.telegram.ui.tn tnVar = rb0Var.f32251c;
            if (tnVar != null && url != null) {
                tnVar.Ya(url, true);
            }
            lb0.b(kb0Var.f30006c, s1Var);
        }
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final sg.a X() {
        return null;
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.lu0 Y1() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean a2(long j10) {
        return false;
    }

    @Override
    public final boolean c() {
        lb0 lb0Var = this.f29636a.f30006c;
        if (lb0Var.f30273a == 2) {
            MessagePreviewParams messagePreviewParams = lb0Var.V.d;
            if (!messagePreviewParams.singleLink && !messagePreviewParams.isSecret) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        lb0 lb0Var = this.f29636a.f30006c;
        if (lb0Var.f30273a == 2 && i10 == 1) {
            MessagePreviewParams messagePreviewParams = lb0Var.V.d;
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
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public final boolean j0() {
        return c();
    }

    @Override
    public final boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean n0(y5 y5Var) {
        return false;
    }

    @Override
    public final boolean u2(int i10) {
        return false;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final String y(long j10) {
        return null;
    }

    @Override
    public final org.telegram.ui.Cells.l9 y2() {
        return this.f29636a.f30006c.f30276e;
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N1(MessageObject messageObject) {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public final void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
