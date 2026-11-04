package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cb implements org.telegram.ui.Cells.l1 {
    public final hb f44282a;

    public cb(hb hbVar) {
        this.f44282a = hbVar;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        kb kbVar = this.f44282a.f45891n;
        int i3 = kb.R0;
        kbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        kb kbVar = this.f44282a.f45891n;
        org.telegram.ui.Components.ut.K0(kbVar, ziVar, kbVar.C0, str2, str3, str4, str, i3, i10, -1, false);
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !ziVar.i4()) {
            if (!ziVar.J3()) {
                return false;
            }
            return MediaController.B().o0(this.f44282a.f45891n.f46876p0, ziVar, 0L, true, null, 0L);
        }
        boolean S = MediaController.B().S(ziVar);
        MediaController.B().r0(null, false);
        return S;
    }

    @Override
    public final boolean J0(long j10) {
        return false;
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        kb kbVar = this.f44282a.f45891n;
        if (characterStyle != null) {
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.u31) {
                org.telegram.ui.Components.u31 u31Var = (org.telegram.ui.Components.u31) characterStyle;
                org.telegram.messenger.g0.g(u31Var.f38635a.subSequence(u31Var.f38636b, u31Var.f38637c).toString());
                if (org.telegram.messenger.g0.I3()) {
                    Toast.makeText(kbVar.getParentActivity(), org.telegram.messenger.bd.M0(2131744204, null), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.y31) {
                Long A = Utilities.A(((org.telegram.ui.Components.y31) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(kb.v0(kbVar)).a2(A);
                    if (a22 != null) {
                        org.telegram.messenger.hp.s1(kb.w0(kbVar)).z3(a22, null, kbVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(kb.x0(kbVar)).M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    org.telegram.messenger.hp.s1(kb.y0(kbVar)).z3(null, M0, kbVar, 0);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.v31) {
                String url = ((org.telegram.ui.Components.v31) characterStyle).getURL();
                if (url.startsWith("@")) {
                    org.telegram.messenger.hp.s1(kb.z0(kbVar)).y3(url.substring(1), kbVar, 0, null);
                } else if (url.startsWith("#")) {
                    uw uwVar = new uw(null);
                    uwVar.f50273o2 = url;
                    kbVar.presentFragment(uwVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(kbVar.getParentActivity(), false, 1, null);
                    h.P = url2;
                    h.Q = false;
                    CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
                    u uVar = new u(1, this, url2);
                    h.M = charSequenceArr;
                    h.L = uVar;
                    kbVar.showDialog(h);
                } else if (characterStyle instanceof org.telegram.ui.Components.x31) {
                    String url3 = ((org.telegram.ui.Components.x31) characterStyle).getURL();
                    if (!sf.c.g(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
                        String M02 = org.telegram.messenger.bd.M0(2131747787, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M02;
                        s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131747790, url3);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new mi.d4(15, kbVar, url3));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        kbVar.showDialog(s1Var);
                        return;
                    }
                    sf.c.p(kbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.f26868k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.f26868k.media.webpage.url.toLowerCase();
                        if ((sf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.K1;
                            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.K1.O().l(messageObject) != null) {
                                return;
                            }
                            kbVar.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    sf.c.p(kbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean P0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean P1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final vq0 S1() {
        return null;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        kb kbVar = this.f44282a.f45891n;
        if (chat != null && chat != kbVar.f46865f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f27001id);
            if (i3 != 0) {
                bundle.putInt("message_id", i3);
            }
            if (org.telegram.messenger.hp.s1(kb.q0(kbVar)).E(bundle, kbVar, null, null)) {
                kbVar.presentFragment(new wm(bundle), true);
            }
        }
    }

    @Override
    public final boolean V1(long j10) {
        return false;
    }

    @Override
    public final void W1(org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11, boolean z10) {
        org.telegram.messenger.zi ziVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
        kb kbVar = this.f44282a.f45891n;
        if (B0 == (-kbVar.f46865f.f27001id)) {
            for (int i10 = 0; i10 < kbVar.f46876p0.size(); i10++) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) kbVar.f46876p0.get(i10);
                if (ziVar2 != null && ziVar2.U != 1 && ziVar2.M1() == ziVar.M1()) {
                    kbVar.d1(ziVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", kbVar.f46865f.f27001id);
        bundle.putInt("message_id", ziVar.M1());
        kbVar.presentFragment(new wm(bundle));
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final boolean X0(org.telegram.messenger.zi ziVar) {
        return org.telegram.ui.Cells.f1.a(ziVar);
    }

    @Override
    public final boolean Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final kh.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f27150id);
        hb hbVar = this.f44282a;
        kb.u0(hbVar.f45891n, bundle, user.f27150id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.g5(0);
        hbVar.f45891n.presentFragment(profileActivity);
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        y4 b10;
        kb kbVar = this.f44282a.f45891n;
        if (user != null && user.f27150id != org.telegram.messenger.h10.i(kb.s0(kbVar)).e()) {
            e5[] e5VarArr = {e5.d, e5.h};
            TLRPC.UserFull b22 = kbVar.getMessagesController().b2(user.f27150id);
            if (b22 != null) {
                b10 = y4.c(user, b22, e5VarArr);
            } else {
                b10 = y4.b(user, kb.t0(kbVar), e5VarArr);
            }
            if (b4.n.i(b10)) {
                b4.n.p().C((ViewGroup) kbVar.fragmentView, kbVar.getResourceProvider(), b10, new mi.d4(this, q1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        hb hbVar = this.f44282a;
        if (hbVar.f45891n.f46877q0.contains(Long.valueOf(messageObject.T))) {
            hbVar.f45891n.f46877q0.remove(Long.valueOf(messageObject.T));
        } else {
            hbVar.f45891n.f46877q0.add(Long.valueOf(messageObject.T));
        }
        hbVar.f45891n.b1(true);
        hbVar.f45891n.W0();
        hbVar.f45891n.F.f();
    }

    @Override
    public final boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        TLRPC.WebPage webPage;
        kb kbVar = this.f44282a.f45891n;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.J1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(messageObject.f26868k));
            bundle.putInt("message_id", messageObject.M1());
            wm wmVar = new wm(bundle);
            if (org.telegram.messenger.t3.c0(kbVar.f46865f)) {
                rg.c.a(wmVar, org.telegram.messenger.pr.a(org.telegram.messenger.zi.B0(messageObject.f26868k), org.telegram.messenger.zi.c2(kb.B0(kbVar), messageObject.f26868k, true, false)));
            }
            kbVar.presentFragment(wmVar);
        } else if (i3 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.f26868k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(messageObject) == null) {
                    kbVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i3 == 5) {
            TLRPC.User a22 = kbVar.getMessagesController().a2(Long.valueOf(messageObject.f26868k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.f26868k.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File g12 = org.telegram.messenger.g0.g1();
                g12.mkdirs();
                File file = new File(g12, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                kbVar.showDialog(new org.telegram.ui.Components.vc0(kbVar, null, a22, null, file, null, str2, str3, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.f26868k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                sf.c.t(kbVar.getParentActivity(), messageObject.f26868k.media.webpage.url);
            }
        }
    }

    @Override
    public final String g(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final void j() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.f25040a;
        org.telegram.messenger.t0.r();
        sf.c.t(this.f44282a.f45891n.getParentActivity(), org.telegram.messenger.r2.f25045g);
    }

    @Override
    public final int j0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final boolean m0() {
        return true;
    }

    @Override
    public final boolean m2(int i3) {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        kb kbVar = this.f44282a.f45891n;
        int i3 = kb.R0;
        kbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.i9 q2() {
        return null;
    }

    @Override
    public final void s(org.telegram.ui.Cells.q1 q1Var) {
        boolean z10;
        hb hbVar = this.f44282a;
        kb kbVar = hbVar.f45891n;
        if (kbVar.getParentActivity() == null) {
            return;
        }
        Context context = hbVar.f45888c;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.t3.T(kbVar.f46865f) && !kbVar.f46865f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        kbVar.showDialog(org.telegram.ui.Components.oo0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f27150id != org.telegram.messenger.h10.i(kb.r0(this.f44282a.f45891n)).e()) {
            a(user);
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.q1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cb.t0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean x0(org.telegram.messenger.zi ziVar) {
        return true;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final String z(long j10) {
        return null;
    }

    @Override
    public final void A1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C1(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.wi wiVar) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void e0(int i3) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void p(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void K1() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
    }

    @Override
    public final void U1(String str, String str2) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
