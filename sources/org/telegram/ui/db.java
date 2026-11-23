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
public final class db implements org.telegram.ui.Cells.m1 {
    public final ib f47023a;

    public db(ib ibVar) {
        this.f47023a = ibVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f28641id != org.telegram.messenger.i10.i(lb.r0(this.f47023a.f48771n)).e()) {
            a(user);
        }
    }

    @Override
    public final org.telegram.ui.Cells.j9 B2() {
        return null;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.r1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.db.C0(org.telegram.ui.Cells.r1, float, float, boolean):void");
    }

    @Override
    public final String D(long j3) {
        return null;
    }

    @Override
    public final boolean F0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        lb lbVar = this.f47023a.f48771n;
        int i7 = lb.R0;
        lbVar.U0(r1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public final boolean R0(long j3) {
        return false;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        lb lbVar = this.f47023a.f48771n;
        org.telegram.ui.Components.gu.O0(lbVar, fjVar, lbVar.C0, str2, str3, str4, str, i7, i10, -1, false);
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !fjVar.h4()) {
            if (!fjVar.I3()) {
                return false;
            }
            return MediaController.B().o0(this.f47023a.f48771n.f49698p0, fjVar, 0L, true, null, 0L);
        }
        boolean S = MediaController.B().S(fjVar);
        MediaController.B().r0(null, false);
        return S;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f28641id);
        ib ibVar = this.f47023a;
        lb.u0(ibVar.f48771n, bundle, user.f28641id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.j5(0);
        ibVar.f48771n.presentFragment(profileActivity);
    }

    @Override
    public final void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        lb lbVar = this.f47023a.f48771n;
        if (characterStyle != null) {
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.q41) {
                org.telegram.ui.Components.q41 q41Var = (org.telegram.ui.Components.q41) characterStyle;
                org.telegram.messenger.g0.g(q41Var.f38687a.subSequence(q41Var.f38688b, q41Var.f38689c).toString());
                if (org.telegram.messenger.g0.G3()) {
                    Toast.makeText(lbVar.getParentActivity(), org.telegram.messenger.gd.N0(2131743949, null), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.u41) {
                Long A = Utilities.A(((org.telegram.ui.Components.u41) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(lb.v0(lbVar)).c2(A);
                    if (c22 != null) {
                        org.telegram.messenger.mp.u1(lb.w0(lbVar)).G3(c22, null, lbVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(lb.x0(lbVar)).O0(Long.valueOf(-longValue));
                if (O0 != null) {
                    org.telegram.messenger.mp.u1(lb.y0(lbVar)).G3(null, O0, lbVar, 0);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.r41) {
                String url = ((org.telegram.ui.Components.r41) characterStyle).getURL();
                if (url.startsWith("@")) {
                    org.telegram.messenger.mp.u1(lb.z0(lbVar)).F3(url.substring(1), lbVar, 0, null);
                } else if (url.startsWith("#")) {
                    bx bxVar = new bx(null);
                    bxVar.f46597p2 = url;
                    lbVar.presentFragment(bxVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(lbVar.getParentActivity(), false, 1, null);
                    j3.P = url2;
                    j3.Q = false;
                    CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131747623, null), org.telegram.messenger.gd.N0(2131751755, null)};
                    og.j jVar = new og.j(2, this, url2);
                    j3.M = charSequenceArr;
                    j3.L = jVar;
                    lbVar.showDialog(j3);
                } else if (characterStyle instanceof org.telegram.ui.Components.t41) {
                    String url3 = ((org.telegram.ui.Components.t41) characterStyle).getURL();
                    if (!vf.c.g(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(2131747585, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131747588, url3);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747623, null), new oi.f0(7, lbVar, url3));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        lbVar.showDialog(t1Var);
                        return;
                    }
                    vf.c.p(lbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.f24073k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.f24073k.media.webpage.url.toLowerCase();
                        if ((vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().l(messageObject) != null) {
                                return;
                            }
                            lbVar.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    vf.c.p(lbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean b0() {
        return false;
    }

    @Override
    public final void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        lb lbVar = this.f47023a.f48771n;
        if (chat != null && chat != lbVar.f49687f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28492id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            if (org.telegram.messenger.mp.u1(lb.q0(lbVar)).E(bundle, lbVar, null, null)) {
                lbVar.presentFragment(new bn(bundle), true);
            }
        }
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public final fr0 c2() {
        return null;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e0() {
        return 0;
    }

    @Override
    public final boolean f2(long j3) {
        return false;
    }

    @Override
    public final boolean g1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public final void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.messenger.fj fjVar = r1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
        lb lbVar = this.f47023a.f48771n;
        if (B0 == (-lbVar.f49687f.f28492id)) {
            for (int i10 = 0; i10 < lbVar.f49698p0.size(); i10++) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) lbVar.f49698p0.get(i10);
                if (fjVar2 != null && fjVar2.U != 1 && fjVar2.L1() == fjVar.L1()) {
                    lbVar.d1(fjVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", lbVar.f49687f.f28492id);
        bundle.putInt("message_id", fjVar.L1());
        lbVar.presentFragment(new bn(bundle));
    }

    @Override
    public final jh.a h0() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean j2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String k(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final boolean k0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        w4 b10;
        lb lbVar = this.f47023a.f48771n;
        if (user != null && user.f28641id != org.telegram.messenger.i10.i(lb.s0(lbVar)).e()) {
            c5[] c5VarArr = {c5.d, c5.h};
            TLRPC.UserFull d2 = lbVar.getMessagesController().d2(user.f28641id);
            if (d2 != null) {
                b10 = w4.c(user, d2, c5VarArr);
            } else {
                b10 = w4.b(user, lb.t0(lbVar), c5VarArr);
            }
            if (ab.q.i(b10)) {
                ab.q.p().D((ViewGroup) lbVar.fragmentView, lbVar.getResourceProvider(), b10, new oi.f0(this, r1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        ib ibVar = this.f47023a;
        if (ibVar.f48771n.f49699q0.contains(Long.valueOf(messageObject.T))) {
            ibVar.f48771n.f49699q0.remove(Long.valueOf(messageObject.T));
        } else {
            ibVar.f48771n.f49699q0.add(Long.valueOf(messageObject.T));
        }
        ibVar.f48771n.b1(true);
        ibVar.f48771n.W0();
        ibVar.f48771n.F.f();
    }

    @Override
    public final boolean n0() {
        return false;
    }

    @Override
    public final void p() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.f26829a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f47023a.f48771n.getParentActivity(), org.telegram.messenger.s2.f26834g);
    }

    @Override
    public final int p0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        TLRPC.WebPage webPage;
        lb lbVar = this.f47023a.f48771n;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(messageObject.f24073k));
            bundle.putInt("message_id", messageObject.L1());
            bn bnVar = new bn(bundle);
            if (org.telegram.messenger.v3.c0(lbVar.f49687f)) {
                qg.c.a(bnVar, org.telegram.messenger.sr.a(org.telegram.messenger.fj.B0(messageObject.f24073k), org.telegram.messenger.fj.b2(lb.B0(lbVar), messageObject.f24073k, true, false)));
            }
            lbVar.presentFragment(bnVar);
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.f24073k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    lbVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            TLRPC.User c22 = lbVar.getMessagesController().c2(Long.valueOf(messageObject.f24073k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.f24073k.media;
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
                lbVar.showDialog(new org.telegram.ui.Components.kd0(lbVar, null, c22, null, file, null, str2, str3, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.f24073k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                vf.c.t(lbVar.getParentActivity(), messageObject.f24073k.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean r0() {
        return true;
    }

    @Override
    public final void t(org.telegram.ui.Cells.r1 r1Var) {
        boolean z10;
        ib ibVar = this.f47023a;
        lb lbVar = ibVar.f48771n;
        if (lbVar.getParentActivity() == null) {
            return;
        }
        Context context = ibVar.f48768c;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (org.telegram.messenger.v3.T(lbVar.f49687f) && !lbVar.f49687f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        lbVar.showDialog(org.telegram.ui.Components.zo0.O0(context, messageObject, null, z10, null));
    }

    @Override
    public final boolean v0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override
    public final void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        lb lbVar = this.f47023a.f48771n;
        int i7 = lb.R0;
        lbVar.U0(r1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final boolean y2(int i7) {
        return false;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void J(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void O(org.telegram.messenger.cj cjVar) {
    }

    @Override
    public final void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public final void R(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void W(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void m0(int i7) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void t0(String str) {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
    }

    @Override
    public final void e2(String str, String str2) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public final void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public final void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
