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
public final class db implements org.telegram.ui.Cells.l1 {
    public final ib f46320a;

    public db(ib ibVar) {
        this.f46320a = ibVar;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        lb lbVar = this.f46320a.f48003n;
        int i7 = lb.R0;
        lbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final boolean L0(long j3) {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        lb lbVar = this.f46320a.f48003n;
        org.telegram.ui.Components.bu.N0(lbVar, gjVar, lbVar.C0, str2, str3, str4, str, i7, i10, -1, false);
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        lb lbVar = this.f46320a.f48003n;
        if (characterStyle != null) {
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.e41) {
                org.telegram.ui.Components.e41 e41Var = (org.telegram.ui.Components.e41) characterStyle;
                org.telegram.messenger.g0.g(e41Var.f34173a.subSequence(e41Var.f34174b, e41Var.f34175c).toString());
                if (org.telegram.messenger.g0.H3()) {
                    Toast.makeText(lbVar.getParentActivity(), org.telegram.messenger.hd.M0(2131744194, null), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.i41) {
                Long A = Utilities.A(((org.telegram.ui.Components.i41) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(lb.v0(lbVar)).a2(A);
                    if (a22 != null) {
                        org.telegram.messenger.np.s1(lb.w0(lbVar)).z3(a22, null, lbVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(lb.x0(lbVar)).M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    org.telegram.messenger.np.s1(lb.y0(lbVar)).z3(null, M0, lbVar, 0);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.f41) {
                String url = ((org.telegram.ui.Components.f41) characterStyle).getURL();
                if (url.startsWith("@")) {
                    org.telegram.messenger.np.s1(lb.z0(lbVar)).y3(url.substring(1), lbVar, 0, null);
                } else if (url.startsWith("#")) {
                    yw ywVar = new yw(null);
                    ywVar.f53686p2 = url;
                    lbVar.presentFragment(ywVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(lbVar.getParentActivity(), false, 1, null);
                    i7.P = url2;
                    i7.Q = false;
                    CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747817, null), org.telegram.messenger.hd.M0(2131751767, null)};
                    og.j jVar = new og.j(2, this, url2);
                    i7.M = charSequenceArr;
                    i7.L = jVar;
                    lbVar.showDialog(i7);
                } else if (characterStyle instanceof org.telegram.ui.Components.h41) {
                    String url3 = ((org.telegram.ui.Components.h41) characterStyle).getURL();
                    if (!vf.c.g(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
                        String M02 = org.telegram.messenger.hd.M0(2131747779, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M02;
                        t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131747782, url3);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747817, null), new m2.d(9, lbVar, url3));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        lbVar.showDialog(t1Var);
                        return;
                    }
                    vf.c.p(lbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.f23819k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.f23819k.media.webpage.url.toLowerCase();
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
    public final boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        if (!org.telegram.messenger.gj.R4(gjVar.f23819k) && !gjVar.h4()) {
            if (!gjVar.I3()) {
                return false;
            }
            return MediaController.B().o0(this.f46320a.f48003n.f48945p0, gjVar, 0L, true, null, 0L);
        }
        boolean S = MediaController.B().S(gjVar);
        MediaController.B().r0(null, false);
        return S;
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        lb lbVar = this.f46320a.f48003n;
        if (chat != null && chat != lbVar.f48934f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28051id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            if (org.telegram.messenger.np.s1(lb.q0(lbVar)).E(bundle, lbVar, null, null)) {
                lbVar.presentFragment(new an(bundle), true);
            }
        }
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final jh.a Z() {
        return null;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f28200id);
        ib ibVar = this.f46320a;
        lb.u0(ibVar.f48003n, bundle, user.f28200id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.i5(0);
        ibVar.f48003n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        w4 b10;
        lb lbVar = this.f46320a.f48003n;
        if (user != null && user.f28200id != org.telegram.messenger.m10.i(lb.s0(lbVar)).e()) {
            c5[] c5VarArr = {c5.d, c5.h};
            TLRPC.UserFull b22 = lbVar.getMessagesController().b2(user.f28200id);
            if (b22 != null) {
                b10 = w4.c(user, b22, c5VarArr);
            } else {
                b10 = w4.b(user, lb.t0(lbVar), c5VarArr);
            }
            if (ab.q.i(b10)) {
                ab.q.o().D((ViewGroup) lbVar.fragmentView, lbVar.getResourceProvider(), b10, new m2.d(this, q1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final dr0 c2() {
        return null;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override
    public final boolean f2(long j3) {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.messenger.gj gjVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
        lb lbVar = this.f46320a.f48003n;
        if (B0 == (-lbVar.f48934f.f28051id)) {
            for (int i10 = 0; i10 < lbVar.f48945p0.size(); i10++) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) lbVar.f48945p0.get(i10);
                if (gjVar2 != null && gjVar2.U != 1 && gjVar2.L1() == gjVar.L1()) {
                    lbVar.d1(gjVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", lbVar.f48934f.f28051id);
        bundle.putInt("message_id", gjVar.L1());
        lbVar.presentFragment(new an(bundle));
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.f26206a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f46320a.f48003n.getParentActivity(), org.telegram.messenger.r2.f26211g);
    }

    @Override
    public final void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        ib ibVar = this.f46320a;
        if (ibVar.f48003n.f48946q0.contains(Long.valueOf(messageObject.T))) {
            ibVar.f48003n.f48946q0.remove(Long.valueOf(messageObject.T));
        } else {
            ibVar.f48003n.f48946q0.add(Long.valueOf(messageObject.T));
        }
        ibVar.f48003n.b1(true);
        ibVar.f48003n.W0();
        ibVar.f48003n.F.f();
    }

    @Override
    public final boolean l0() {
        return true;
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override
    public final void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        TLRPC.WebPage webPage;
        lb lbVar = this.f46320a.f48003n;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(messageObject.f23819k));
            bundle.putInt("message_id", messageObject.L1());
            an anVar = new an(bundle);
            if (org.telegram.messenger.t3.c0(lbVar.f48934f)) {
                qg.c.a(anVar, org.telegram.messenger.ur.a(org.telegram.messenger.gj.B0(messageObject.f23819k), org.telegram.messenger.gj.b2(lb.B0(lbVar), messageObject.f23819k, true, false)));
            }
            lbVar.presentFragment(anVar);
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.f23819k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    lbVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            TLRPC.User a22 = lbVar.getMessagesController().a2(Long.valueOf(messageObject.f23819k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.f23819k.media;
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
                lbVar.showDialog(new org.telegram.ui.Components.bd0(lbVar, null, a22, null, file, null, str2, str3, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.f23819k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                vf.c.t(lbVar.getParentActivity(), messageObject.f23819k.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        lb lbVar = this.f46320a.f48003n;
        int i7 = lb.R0;
        lbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
        boolean z10;
        ib ibVar = this.f46320a;
        lb lbVar = ibVar.f48003n;
        if (lbVar.getParentActivity() == null) {
            return;
        }
        Context context = ibVar.f48000c;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.t3.T(lbVar.f48934f) && !lbVar.f48934f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        lbVar.showDialog(org.telegram.ui.Components.po0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f28200id != org.telegram.messenger.m10.i(lb.r0(this.f46320a.f48003n)).e()) {
            a(user);
        }
    }

    @Override
    public final boolean v2(int i7) {
        return false;
    }

    @Override
    public final void w0(org.telegram.ui.Cells.q1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.db.w0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final String x(long j3) {
        return null;
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.dj djVar) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void P(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void e0(int i7) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
    }

    @Override
    public final void e2(String str, String str2) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
