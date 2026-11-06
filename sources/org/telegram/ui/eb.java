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
public final class eb implements org.telegram.ui.Cells.l1 {
    public final jb f45224a;

    public eb(jb jbVar) {
        this.f45224a = jbVar;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        mb mbVar = this.f45224a.f46896n;
        int i7 = mb.Q0;
        mbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        mb mbVar = this.f45224a.f46896n;
        org.telegram.ui.Components.vt.N0(mbVar, ijVar, mbVar.B0, str2, str3, str4, str, i7, i10, -1, false);
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        if (!org.telegram.messenger.ij.S4(ijVar.f23237k) && !ijVar.i4()) {
            if (!ijVar.J3()) {
                return false;
            }
            return MediaController.B().o0(this.f45224a.f46896n.f47736o0, ijVar, 0L, true, null, 0L);
        }
        boolean S = MediaController.B().S(ijVar);
        MediaController.B().r0(null, false);
        return S;
    }

    @Override
    public final boolean J0(long j3) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        TLRPC.WebPage webPage;
        mb mbVar = this.f45224a.f46896n;
        if (characterStyle != null) {
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.u31) {
                org.telegram.ui.Components.u31 u31Var = (org.telegram.ui.Components.u31) characterStyle;
                org.telegram.messenger.g0.g(u31Var.f38515a.subSequence(u31Var.f38516b, u31Var.f38517c).toString());
                if (org.telegram.messenger.g0.I3()) {
                    Toast.makeText(mbVar.getParentActivity(), org.telegram.messenger.hd.M0(2131744195, null), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.y31) {
                Long A = Utilities.A(((org.telegram.ui.Components.y31) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(mb.v0(mbVar)).a2(A);
                    if (a22 != null) {
                        org.telegram.messenger.qp.s1(mb.w0(mbVar)).z3(a22, null, mbVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(mb.x0(mbVar)).M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    org.telegram.messenger.qp.s1(mb.y0(mbVar)).z3(null, M0, mbVar, 0);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.v31) {
                String url = ((org.telegram.ui.Components.v31) characterStyle).getURL();
                if (url.startsWith("@")) {
                    org.telegram.messenger.qp.s1(mb.z0(mbVar)).y3(url.substring(1), mbVar, 0, null);
                } else if (url.startsWith("#")) {
                    ww wwVar = new ww(null);
                    wwVar.f51579n2 = url;
                    mbVar.presentFragment(wwVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z9) {
                    org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(mbVar.getParentActivity(), false, 1, null);
                    h.O = url2;
                    h.P = false;
                    CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747816, null), org.telegram.messenger.hd.M0(2131751767, null)};
                    og.j jVar = new og.j(2, this, url2);
                    h.L = charSequenceArr;
                    h.K = jVar;
                    mbVar.showDialog(h);
                } else if (characterStyle instanceof org.telegram.ui.Components.x31) {
                    String url3 = ((org.telegram.ui.Components.x31) characterStyle).getURL();
                    if (!vf.c.g(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
                        String M02 = org.telegram.messenger.hd.M0(2131747778, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = M02;
                        u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131747781, url3);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747816, null), new ni.c(5, mbVar, url3));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        mbVar.showDialog(u1Var);
                        return;
                    }
                    vf.c.p(mbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.f23237k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.f23237k.media.webpage.url.toLowerCase();
                        if ((vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().l(messageObject) != null) {
                                return;
                            }
                            mbVar.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    vf.c.p(mbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final er0 N1() {
        return null;
    }

    @Override
    public final boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public final boolean Q1(long j3) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
        org.telegram.messenger.ij ijVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
        mb mbVar = this.f45224a.f46896n;
        if (B0 == (-mbVar.f47726f.f26952id)) {
            for (int i10 = 0; i10 < mbVar.f47736o0.size(); i10++) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) mbVar.f47736o0.get(i10);
                if (ijVar2 != null && ijVar2.U != 1 && ijVar2.M1() == ijVar.M1()) {
                    mbVar.d1(ijVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", mbVar.f47726f.f26952id);
        bundle.putInt("message_id", ijVar.M1());
        mbVar.presentFragment(new an(bundle));
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        mb mbVar = this.f45224a.f46896n;
        if (chat != null && chat != mbVar.f47726f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f26952id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            if (org.telegram.messenger.qp.s1(mb.q0(mbVar)).E(bundle, mbVar, null, null)) {
                mbVar.presentFragment(new an(bundle), true);
            }
        }
    }

    @Override
    public final boolean W0(org.telegram.messenger.ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final jh.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f27101id);
        jb jbVar = this.f45224a;
        mb.u0(jbVar.f46896n, bundle, user.f27101id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.g5(0);
        jbVar.f46896n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        w4 b10;
        mb mbVar = this.f45224a.f46896n;
        if (user != null && user.f27101id != org.telegram.messenger.p10.i(mb.s0(mbVar)).e()) {
            c5[] c5VarArr = {c5.d, c5.h};
            TLRPC.UserFull b22 = mbVar.getMessagesController().b2(user.f27101id);
            if (b22 != null) {
                b10 = w4.c(user, b22, c5VarArr);
            } else {
                b10 = w4.b(user, mb.t0(mbVar), c5VarArr);
            }
            if (ab.q.i(b10)) {
                ab.q.o().C((ViewGroup) mbVar.fragmentView, mbVar.getResourceProvider(), b10, new ni.c(this, q1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        jb jbVar = this.f45224a;
        if (jbVar.f46896n.f47737p0.contains(Long.valueOf(messageObject.T))) {
            jbVar.f46896n.f47737p0.remove(Long.valueOf(messageObject.T));
        } else {
            jbVar.f46896n.f47737p0.add(Long.valueOf(messageObject.T));
        }
        jbVar.f46896n.b1(true);
        jbVar.f46896n.W0();
        jbVar.f46896n.E.f();
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        TLRPC.WebPage webPage;
        mb mbVar = this.f45224a.f46896n;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.J1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(messageObject.f23237k));
            bundle.putInt("message_id", messageObject.M1());
            an anVar = new an(bundle);
            if (org.telegram.messenger.t3.c0(mbVar.f47726f)) {
                qg.d.a(anVar, org.telegram.messenger.xr.a(org.telegram.messenger.ij.B0(messageObject.f23237k), org.telegram.messenger.ij.c2(mb.B0(mbVar), messageObject.f23237k, true, false)));
            }
            mbVar.presentFragment(anVar);
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.f23237k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(messageObject) == null) {
                    mbVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            TLRPC.User a22 = mbVar.getMessagesController().a2(Long.valueOf(messageObject.f23237k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.f23237k.media;
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
                mbVar.showDialog(new org.telegram.ui.Components.ad0(mbVar, null, a22, null, file, null, str2, str3, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.f23237k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                vf.c.t(mbVar.getParentActivity(), messageObject.f23237k.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean g2(int i7) {
        return false;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.f25191a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f45224a.f46896n.getParentActivity(), org.telegram.messenger.r2.f25196g);
    }

    @Override
    public final boolean k0() {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.j9 k2() {
        return null;
    }

    @Override
    public final boolean n0(org.telegram.ui.Components.r5 r5Var) {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        mb mbVar = this.f45224a.f46896n;
        int i7 = mb.Q0;
        mbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
        boolean z9;
        jb jbVar = this.f45224a;
        mb mbVar = jbVar.f46896n;
        if (mbVar.getParentActivity() == null) {
            return;
        }
        Context context = jbVar.f46893c;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.t3.T(mbVar.f47726f) && !mbVar.f47726f.megagroup) {
            z9 = true;
        } else {
            z9 = false;
        }
        mbVar.showDialog(org.telegram.ui.Components.mo0.N0(context, messageObject, null, z9, null));
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f27101id != org.telegram.messenger.p10.i(mb.r0(this.f45224a.f46896n)).e()) {
            a(user);
        }
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eb.u0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final boolean x0(org.telegram.messenger.ij ijVar) {
        return true;
    }

    @Override
    public final String y(long j3) {
        return null;
    }

    @Override
    public final void A1(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void d0(int i7) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F1() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void P1(String str, String str2) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }
}
