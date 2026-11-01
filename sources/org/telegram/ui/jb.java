package org.telegram.ui;

import android.content.Context;
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
public final class jb implements org.telegram.ui.Cells.l1 {
    public final pb f38332a;

    public jb(pb pbVar) {
        this.f38332a = pbVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        sb sbVar = this.f38332a.f40443n;
        int i10 = sb.Q0;
        sbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.kj kjVar) {
        if (!org.telegram.messenger.kj.R4(kjVar.f16690k) && !kjVar.h4()) {
            if (!kjVar.I3()) {
                return false;
            }
            return MediaController.B().o0(this.f38332a.f40443n.f41319o0, kjVar, 0L, true, null);
        }
        boolean S = MediaController.B().S(kjVar);
        MediaController.B().r0(null, false);
        return S;
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final ps0 H1() {
        return null;
    }

    @Override
    public final boolean I0(long j10) {
        return false;
    }

    @Override
    public final boolean K1(long j10) {
        return false;
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        sb sbVar = this.f38332a.f40443n;
        if (characterStyle != null) {
            org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.e51) {
                org.telegram.ui.Components.e51 e51Var = (org.telegram.ui.Components.e51) characterStyle;
                org.telegram.messenger.i0.g(e51Var.f25738a.subSequence(e51Var.f25739b, e51Var.f25740c).toString());
                if (org.telegram.messenger.i0.H3()) {
                    Toast.makeText(sbVar.getParentActivity(), org.telegram.messenger.dd.L0(2131744219, null), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.i51) {
                Long A = Utilities.A(((org.telegram.ui.Components.i51) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(sb.v0(sbVar)).Z1(A);
                    if (Z1 != null) {
                        org.telegram.messenger.wp.r1(sb.w0(sbVar)).w3(Z1, null, sbVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(sb.x0(sbVar)).L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    org.telegram.messenger.wp.r1(sb.y0(sbVar)).w3(null, L0, sbVar, 0);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.f51) {
                String url = ((org.telegram.ui.Components.f51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    org.telegram.messenger.wp.r1(sb.z0(sbVar)).v3(url.substring(1), sbVar, 0, null);
                } else if (url.startsWith("#")) {
                    zx zxVar = new zx(null);
                    zxVar.f44183n2 = url;
                    sbVar.presentFragment(zxVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(sbVar.getParentActivity(), false, 1, null);
                    h.O = url2;
                    h.P = false;
                    CharSequence[] charSequenceArr = {org.telegram.messenger.dd.L0(2131747833, null), org.telegram.messenger.dd.L0(2131751767, null)};
                    eg.j jVar = new eg.j(3, this, url2);
                    h.L = charSequenceArr;
                    h.K = jVar;
                    sbVar.showDialog(h);
                } else if (characterStyle instanceof org.telegram.ui.Components.h51) {
                    String url3 = ((org.telegram.ui.Components.h51) characterStyle).getURL();
                    if (!gf.f.e(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        String L02 = org.telegram.messenger.dd.L0(2131747795, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L02;
                        x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131747798, url3);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747833, null), new ng.d(5, sbVar, url3));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        sbVar.showDialog(x1Var);
                        return;
                    }
                    gf.f.n(sbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.f16690k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.f16690k.media.webpage.url.toLowerCase();
                        if ((gf.f.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity != null && launchActivity.N() != null && LaunchActivity.I1.N().k(messageObject) != null) {
                                return;
                            }
                            sbVar.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    gf.f.n(sbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
        org.telegram.messenger.kj kjVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
        sb sbVar = this.f38332a.f40443n;
        if (B0 == (-sbVar.f41309f.f19794id)) {
            for (int i11 = 0; i11 < sbVar.f41319o0.size(); i11++) {
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) sbVar.f41319o0.get(i11);
                if (kjVar2 != null && kjVar2.U != 1 && kjVar2.M1() == kjVar.M1()) {
                    sbVar.d1(kjVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", sbVar.f41309f.f19794id);
        bundle.putInt("message_id", kjVar.M1());
        sbVar.presentFragment(new un(bundle));
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.messenger.kj kjVar) {
        return org.telegram.ui.Cells.f1.a(kjVar);
    }

    @Override
    public final void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        sb sbVar = this.f38332a.f40443n;
        if (chat != null && chat != sbVar.f41309f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19794id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (org.telegram.messenger.wp.r1(sb.q0(sbVar)).E(bundle, sbVar, null, null)) {
                sbVar.presentFragment(new un(bundle), true);
            }
        }
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
        pb pbVar = this.f38332a;
        if (pbVar.f40443n.f41320p0.contains(Long.valueOf(messageObject.T))) {
            pbVar.f40443n.f41320p0.remove(Long.valueOf(messageObject.T));
        } else {
            pbVar.f40443n.f41320p0.add(Long.valueOf(messageObject.T));
        }
        pbVar.f40443n.b1(true);
        pbVar.f40443n.W0();
        pbVar.f40443n.E.f();
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final zg.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f19943id);
        pb pbVar = this.f38332a;
        sb.u0(pbVar.f40443n, bundle, user.f19943id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.g5(0);
        pbVar.f40443n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        v4 b10;
        sb sbVar = this.f38332a.f40443n;
        if (user != null && user.f19943id != org.telegram.messenger.e20.i(sb.s0(sbVar)).e()) {
            b5[] b5VarArr = {b5.d, b5.h};
            TLRPC.UserFull a2 = sbVar.getMessagesController().a2(user.f19943id);
            if (a2 != null) {
                b10 = v4.c(user, a2, b5VarArr);
            } else {
                b10 = v4.b(user, sb.t0(sbVar), b5VarArr);
            }
            if (ac.a.h(b10)) {
                ac.a.n().A((ViewGroup) sbVar.fragmentView, sbVar.getResourceProvider(), b10, new ng.d(this, q1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        TLRPC.WebPage webPage;
        sb sbVar = this.f38332a.f40443n;
        org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.J1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.kj.B0(messageObject.f16690k));
            bundle.putInt("message_id", messageObject.M1());
            un unVar = new un(bundle);
            if (org.telegram.messenger.w3.c0(sbVar.f41309f)) {
                gg.e.a(unVar, org.telegram.messenger.hs.a(org.telegram.messenger.kj.B0(messageObject.f16690k), org.telegram.messenger.kj.c2(sb.B0(sbVar), messageObject.f16690k, true, false)));
            }
            sbVar.presentFragment(unVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.f16690k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.I1.N().k(messageObject) == null) {
                    sbVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User Z1 = sbVar.getMessagesController().Z1(Long.valueOf(messageObject.f16690k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.f16690k.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File g12 = org.telegram.messenger.i0.g1();
                g12.mkdirs();
                File file = new File(g12, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                sbVar.showDialog(new org.telegram.ui.Components.vd0(sbVar, null, Z1, null, file, null, str2, str3, null));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.f16690k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                gf.f.r(sbVar.getParentActivity(), messageObject.f16690k.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean c2(int i10) {
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
    public final int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final boolean i0() {
        return true;
    }

    @Override
    public final void j() {
        org.telegram.messenger.w0.u();
        boolean z10 = org.telegram.messenger.v2.f18578a;
        org.telegram.messenger.w0.r();
        gf.f.r(this.f38332a.f40443n.getParentActivity(), org.telegram.messenger.v2.f18582g);
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override
    public final boolean m0(org.telegram.ui.Components.o5 o5Var) {
        return false;
    }

    @Override
    public final void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        sb sbVar = this.f38332a.f40443n;
        int i10 = sb.Q0;
        sbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.q1 q1Var) {
        boolean z10;
        pb pbVar = this.f38332a;
        sb sbVar = pbVar.f40443n;
        if (sbVar.getParentActivity() == null) {
            return;
        }
        Context context = pbVar.f40441c;
        org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.w3.T(sbVar.f41309f) && !sbVar.f41309f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        sbVar.showDialog(org.telegram.ui.Components.pp0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f19943id != org.telegram.messenger.e20.i(sb.r0(this.f38332a.f40443n)).e()) {
            a(user);
        }
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.s0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final boolean w0(org.telegram.messenger.kj kjVar) {
        return true;
    }

    @Override
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public final String x(long j10) {
        return null;
    }

    @Override
    public final CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final void z1(org.telegram.messenger.kj kjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        sb sbVar = this.f38332a.f40443n;
        org.telegram.ui.Components.hu.K0(sbVar, kjVar, sbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.hj hjVar) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void O(org.telegram.messenger.kj kjVar) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v1(org.telegram.messenger.kj kjVar) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void Z1() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.d20 d20Var) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override
    public final void J1(String str, String str2) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public final void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
