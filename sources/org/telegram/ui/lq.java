package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;
public final class lq implements Runnable {
    public final int f47408a;
    public final Object f47409b;
    public final Object f47410c;
    public final Object d;
    public final Object f47411e;
    public final Object f47412f;

    public lq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f47408a = i3;
        this.f47409b = obj;
        this.f47410c = obj2;
        this.d = obj3;
        this.f47411e = obj4;
        this.f47412f = obj5;
    }

    private final void a() {
        String q10;
        ProfileActivity profileActivity = (ProfileActivity) this.f47409b;
        TLObject tLObject = (TLObject) this.f47410c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        bv0 bv0Var = (bv0) this.f47411e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47412f;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
            if (profileActivity.f41751e1 != 0) {
                profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1));
            } else {
                profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f41759f1));
            }
            String str = "@" + tL_username.username;
            String format = org.telegram.messenger.bd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
            String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
            String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
            org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(bv0Var.f36903u1, profileActivity.A0);
            if (TextUtils.isEmpty(f11)) {
                q10 = "";
            } else {
                q10 = a1.g.q("(", f11, ")");
            }
            org.telegram.ui.Components.ac w10 = fcVar.w(2131231182, org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750527, str, format, f10, q10)), new hk0(23, profileActivity, tL_collectibleInfo)));
            hb0 hb0Var = new hb0(11, profileActivity, tL_collectibleInfo);
            org.telegram.ui.Components.fb fbVar = w10.f31788e;
            if (fbVar != null) {
                fbVar.setOnClickListener(hb0Var);
            }
            w10.k(false);
            return;
        }
        RectF rectF = ProfileActivity.T6;
        org.telegram.ui.Components.fc.d0(tL_error);
    }

    @Override
    public final void run() {
        String str;
        boolean z10;
        TLRPC.GroupCall groupCall;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.ThemeSettings themeSettings;
        TLRPC.TL_wallPaper tL_wallPaper;
        dl0 dl0Var;
        org.telegram.ui.Components.fc d;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        kq0 kq0Var;
        String str2;
        int i14 = this.f47408a;
        int i15 = 0;
        Object obj = this.f47412f;
        Object obj2 = this.f47411e;
        Object obj3 = this.d;
        Object obj4 = this.f47410c;
        Object obj5 = this.f47409b;
        switch (i14) {
            case 0:
                mq mqVar = (mq) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                kg.v1 v1Var = mqVar.h;
                nq nqVar = mqVar.E;
                if (nqVar.f48078o1) {
                    mqVar.f47747s = false;
                    mqVar.d = arrayList;
                    mqVar.f47743e = hVar;
                    mqVar.f47744f = arrayList2;
                    v1Var.f(arrayList, null);
                    if (!org.telegram.messenger.t3.T(nqVar.f48074n)) {
                        ArrayList arrayList4 = v1Var.f17211g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i16 = mqVar.f47746r;
                    mqVar.f();
                    if (mqVar.f47746r > i16) {
                        nqVar.D0(i16);
                    }
                    if (!v1Var.e() && mqVar.f47746r == 0) {
                        nqVar.f48049b.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view = (View) obj5;
                View view2 = (View) obj4;
                WindowManager windowManager = (WindowManager) obj3;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj2);
                windowManager.removeView((View) obj);
                return;
            case 2:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                xv0Var.f40512h2 = 0;
                String str4 = xv0Var.f40511g2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.bd.M0(2131749243, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28234w6, xv0Var.J0);
                        xv0Var.f40513i2 = true;
                        return;
                    }
                    textView.setText(org.telegram.messenger.bd.M0(2131749238, null));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28102p7, xv0Var.J0);
                    xv0Var.f40513i2 = false;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.iw0 iw0Var = (org.telegram.ui.Components.iw0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T).I(2131624033, org.telegram.messenger.bd.M0(2131746864, null), org.telegram.messenger.bd.M0(2131746863, null));
                        I.f31792j = 5000;
                        I.j();
                        return;
                    }
                    if (userFull != null) {
                        if (tL_birthday == null) {
                            userFull.flags2 &= -33;
                        } else {
                            userFull.flags2 |= 32;
                        }
                        userFull.birthday = tL_birthday;
                        org.telegram.messenger.qr.a0(iw0Var.f34837a).j2(userFull, false);
                    }
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iw0Var.f34838b.getContext());
                        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131746860, null);
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131746861, null);
                        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(T), 2131624011, 36);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.g11 g11Var = (org.telegram.ui.Components.g11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) obj2;
                org.telegram.ui.Components.f60 f60Var2 = (org.telegram.ui.Components.f60) obj;
                wm wmVar = g11Var.f33937s;
                if (((org.telegram.messenger.hp) obj4).r2(g11Var.f33927f, tL_forumTopic.f27053id, null)) {
                    f60Var.u();
                    org.telegram.messenger.us.t(g11Var.f33925e).G(g11Var.f33927f, tL_forumTopic.f27053id, false);
                    if (org.telegram.ui.Components.fc.a(wmVar)) {
                        org.telegram.ui.Components.fc.z(wmVar, 4, 0, g11Var.h).j();
                        return;
                    }
                    return;
                }
                f60Var.K(f60Var2);
                return;
            case 5:
                is isVar = (is) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList5 = (ArrayList) obj4;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = tL_messages_myStickers.sets;
                    int size = arrayList6.size();
                    while (i15 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i15);
                        i15++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f27021id = stickerSetCovered2.set.f27028id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(isVar.f46402r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList5.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) k2.p1.h(1, tL_messages_myStickers.sets)).set.f27028id;
                        ConnectionsManager.getInstance(isVar.f46402r).sendRequest(tL_messages_getMyStickers, new y9(isVar, arrayList5, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                uw.J0((uw) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                x30 x30Var = (x30) obj5;
                TLObject tLObject4 = (TLObject) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                x30Var.getClass();
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = x30Var.getContext();
                    int i17 = x30Var.f28583a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.e6 e6Var = x30Var.J0;
                    org.telegram.messenger.r3 r3Var = x30Var.S2;
                    if (r3Var != null && (groupCall = r3Var.f25049b) != null && groupCall.creator) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h9.n0(context, i17, inputGroupCall, str5, e6Var, false, z10);
                    return;
                } else if (tL_error3 != null) {
                    new org.telegram.ui.Components.fc(x30Var.F, new ei.k0()).f0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 8:
                x30 x30Var2 = (x30) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str6 = (String) obj;
                x30Var2.getClass();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    vg.i0 i0Var = new vg.i0(34, x30Var2.f28583a, T2.getContext(), T2, new ei.k0());
                    i0Var.C1(null, arrayList7, arrayList8, arrayList9, str6);
                    i0Var.show();
                    return;
                }
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                ly lyVar = (ly) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                String str7 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        kc1 kc1Var = new kc1(str8, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        kc1Var.f46902g = tL_wallPaper3;
                        tL_wallPaper3 = kc1Var;
                    }
                    l71 l71Var = new l71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z11 = wallPaperSettings3.blur;
                    boolean z12 = wallPaperSettings3.motion;
                    l71Var.H1 = z11;
                    l71Var.G1 = z12;
                    l71Var.f47186p1 = wallPaperSettings3.intensity;
                    launchActivity.t0(l71Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error4.text);
                launchActivity.F0(org.telegram.ui.Components.t4.M(launchActivity, null, sb2.toString()));
                return;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                uw uwVar = (uw) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList10 = launchActivity2.F0;
                if (uwVar != null) {
                    if (d2Var != null) {
                        d2Var.dismissCurrentDialog();
                    }
                    while (i15 < arrayList10.size()) {
                        if (((Dialog) arrayList10.get(i15)).isShowing()) {
                            ((Dialog) arrayList10.get(i15)).dismiss();
                        }
                        i15++;
                    }
                    arrayList10.clear();
                    launchActivity2.t0(uwVar);
                    return;
                } else if (d2Var instanceof wm) {
                    ((wm) d2Var).wa(user.f27150id, str9, true);
                    return;
                } else {
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str10 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        yh0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        yh0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.t4.p0(T3, str10, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        yh0.a().I(2131624011, org.telegram.messenger.bd.M0(2131753128, null), org.telegram.messenger.bd.M0(2131753129, null)).j();
                        return;
                    } else {
                        yh0.a().f0(tL_error5, false);
                        return;
                    }
                } else {
                    return;
                }
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                ly lyVar2 = (ly) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                String str11 = LaunchActivity.E1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(themeSettings));
                        if (Q0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                org.telegram.messenger.w7.G(launchActivity4.P);
                                if (!org.telegram.messenger.w7.K(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.X0 = s1Var;
                                    launchActivity4.W0 = true;
                                    launchActivity4.U0 = Q0;
                                    launchActivity4.V0 = tL_theme;
                                    launchActivity4.T0 = tL_wallPaper4;
                                    launchActivity4.S0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.P).X(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                lyVar2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        }
                        i15 = 1;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.W0 = false;
                            launchActivity4.V0 = tL_theme;
                            launchActivity4.R0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.X0 = s1Var;
                            org.telegram.messenger.w7.G(launchActivity4.P).X(launchActivity4.V0.document, tL_theme, 1, 1);
                        }
                        i15 = 1;
                    }
                } else {
                    if (tL_error6 == null || !"THEME_FORMAT_INVALID".equals(tL_error6.text)) {
                        i15 = 2;
                    }
                    i15 = 1;
                }
                if (i15 != 0) {
                    try {
                        lyVar2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i15 == 1) {
                        launchActivity4.F0(org.telegram.ui.Components.t4.M(launchActivity4, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131744183, null)));
                        return;
                    } else {
                        launchActivity4.F0(org.telegram.ui.Components.t4.M(launchActivity4, org.telegram.messenger.bd.M0(2131744200, null), org.telegram.messenger.bd.M0(2131744184, null)));
                        return;
                    }
                }
                return;
            case 13:
                m90 m90Var = (m90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i18 = m90Var.f47567b;
                LaunchActivity launchActivity5 = m90Var.f47566a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = m90.d();
                        i3 = 2131747403;
                    } else {
                        d = m90.d();
                        i3 = 2131747404;
                    }
                    org.telegram.messenger.k5.p(null, i3, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        ai.p6 p6Var = launchActivity5.f41284a1;
                        launchActivity5.f41284a1 = null;
                        ci.e9.y(i18, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new h90(m90Var, 1), new f70(p6Var, 1));
                        return;
                    }
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        org.telegram.messenger.hp.s1(i18).Y3(paymentForm.users, false);
                        dl0Var = new dl0(paymentForm, null, str12, LaunchActivity.T());
                    } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                        dl0Var = new dl0((TLRPC.PaymentReceipt) tLObject8);
                    } else {
                        dl0Var = null;
                    }
                    if (dl0Var != null) {
                        ai.p6 p6Var2 = launchActivity5.f41284a1;
                        if (p6Var2 != null) {
                            launchActivity5.f41284a1 = null;
                            dl0Var.f44738a1 = new se(10, p6Var2);
                        }
                        m90Var.u(dl0Var, false);
                    }
                }
                m90Var.c();
                return;
            case 14:
                xd0.b0((xd0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                xd0 xd0Var = ((lb0) obj5).f47284a0;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    xd0Var.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    return;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    org.telegram.ui.Components.t4.e0(i10, tL_error8, xd0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 16:
                qc0 qc0Var = (qc0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                xd0 xd0Var2 = qc0Var.F;
                xd0Var2.t1(false, true);
                qc0Var.f48855r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    xd0Var2.D1(13, true, bundle2, false);
                    return;
                }
                String str13 = tL_error9.text;
                if (str13 != null) {
                    if (str13.contains("EMAIL_INVALID")) {
                        qc0Var.n();
                        return;
                    } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751201, null));
                        return;
                    } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                        return;
                    } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131747294, "PhoneNumberFlood"));
                        return;
                    } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                            xd0Var2.D1(0, true, null, true);
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                            return;
                        } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                            return;
                        } else if (tL_error9.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                            org.telegram.ui.Components.t4.e0(i11, tL_error9, xd0Var2, sendverifyemailcode, qc0Var.f48858x);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, "InvalidCode"));
                        return;
                    }
                }
                return;
            case 17:
                TLObject tLObject11 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                xd0 xd0Var3 = ((qc0) obj5).F;
                if ((tLObject11 instanceof TL_account.TL_emailVerified) && xd0Var3.G == 3) {
                    xd0Var3.finishFragment();
                    xd0Var3.f51954e0.run();
                    return;
                } else if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    xd0Var3.p1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error10 != null) {
                    if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                        xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751201, null));
                        return;
                    } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                        xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751198, null));
                        return;
                    } else if (tL_error10.code != -1000) {
                        i12 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                        org.telegram.ui.Components.t4.e0(i12, tL_error10, xd0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 18:
                final id0 id0Var = (id0) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                xd0 xd0Var4 = id0Var.f46252w;
                id0Var.f46245b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    xd0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    dl0 dl0Var2 = new dl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, xd0Var4, true);
                    dl0Var2.W0 = true;
                    dl0Var2.f44746d1 = new org.telegram.messenger.u10() {
                        @Override
                        public final void a(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final id0 id0Var2 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    id0 id0Var3 = id0Var2;
                                                    if (!id0Var3.f46248f) {
                                                        id0Var3.f46248f = true;
                                                        id0Var3.h = str14;
                                                        id0Var3.f46249n = str15;
                                                        id0Var3.f46250r = j10;
                                                        id0Var3.f46245b.setLoading(true);
                                                        id0Var3.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    id0 id0Var4 = id0Var2;
                                                    if (!id0Var4.f46248f) {
                                                        id0Var4.f46248f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.f46249n = str17;
                                                        id0Var4.f46250r = j11;
                                                        id0Var4.f46245b.setLoading(true);
                                                        id0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final id0 id0Var3 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    id0 id0Var32 = id0Var3;
                                                    if (!id0Var32.f46248f) {
                                                        id0Var32.f46248f = true;
                                                        id0Var32.h = str14;
                                                        id0Var32.f46249n = str15;
                                                        id0Var32.f46250r = j10;
                                                        id0Var32.f46245b.setLoading(true);
                                                        id0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    id0 id0Var4 = id0Var3;
                                                    if (!id0Var4.f46248f) {
                                                        id0Var4.f46248f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.f46249n = str17;
                                                        id0Var4.f46250r = j11;
                                                        id0Var4.f46245b.setLoading(true);
                                                        id0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    };
                    dl0Var2.f44749e1 = new org.telegram.messenger.u10() {
                        @Override
                        public final void a(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final id0 id0Var2 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    id0 id0Var32 = id0Var2;
                                                    if (!id0Var32.f46248f) {
                                                        id0Var32.f46248f = true;
                                                        id0Var32.h = str14;
                                                        id0Var32.f46249n = str15;
                                                        id0Var32.f46250r = j10;
                                                        id0Var32.f46245b.setLoading(true);
                                                        id0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    id0 id0Var4 = id0Var2;
                                                    if (!id0Var4.f46248f) {
                                                        id0Var4.f46248f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.f46249n = str17;
                                                        id0Var4.f46250r = j11;
                                                        id0Var4.f46245b.setLoading(true);
                                                        id0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final id0 id0Var3 = id0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    id0 id0Var32 = id0Var3;
                                                    if (!id0Var32.f46248f) {
                                                        id0Var32.f46248f = true;
                                                        id0Var32.h = str14;
                                                        id0Var32.f46249n = str15;
                                                        id0Var32.f46250r = j10;
                                                        id0Var32.f46245b.setLoading(true);
                                                        id0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    id0 id0Var4 = id0Var3;
                                                    if (!id0Var4.f46248f) {
                                                        id0Var4.f46248f = true;
                                                        id0Var4.h = str16;
                                                        id0Var4.f46249n = str17;
                                                        id0Var4.f46250r = j11;
                                                        id0Var4.f46245b.setLoading(true);
                                                        id0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    };
                    dl0Var2.f44752f1 = new h00(id0Var, 1);
                    xd0Var4.presentFragment(dl0Var2);
                    return;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new ed0(id0Var, 2));
                        return;
                    }
                    String str14 = tL_error11.text;
                    id0Var.f46247e = str14;
                    new org.telegram.ui.Components.fc(xd0Var4.f51947a0, null).H(2131624011, org.telegram.messenger.bd.a0(null, null, 2131743888, str14));
                    return;
                } else {
                    new org.telegram.ui.Components.fc(xd0Var4.f51947a0, null).H(2131624011, org.telegram.messenger.bd.M0(2131743889, null));
                    return;
                }
            case 19:
                dg0 dg0Var = (dg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                ng.b bVar = (ng.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                dg0Var.E = true;
                if (tL_error12 == null && bVar != null) {
                    dg0Var.f44705w.l(str15, bVar);
                    d41 d41Var = dg0Var.f44703r;
                    d41Var.f44541e = bVar;
                    d41Var.f44540c = tL_loadAsyncGraph.f27234x;
                    dg0Var.m0();
                    return;
                }
                dg0Var.m0();
                return;
            case 20:
                vg0 vg0Var = (vg0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj3;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.d2 d2Var2 = vg0Var.D1;
                vg0Var.f50525y1 = false;
                if (tL_contacts_importedContacts != null) {
                    if (!tL_contacts_importedContacts.users.isEmpty()) {
                        org.telegram.messenger.hp.s1(vg0Var.f28583a).Y3(tL_contacts_importedContacts.users, false);
                        org.telegram.messenger.hp.s1(vg0Var.f28583a).z3(tL_contacts_importedContacts.users.get(0), null, d2Var2, 1);
                        vg0Var.dismiss();
                        return;
                    } else if (d2Var2.getParentActivity() != null) {
                        org.telegram.messenger.g0.Z3(vg0Var.O1, true, 0.5f, true, true);
                        org.telegram.messenger.g0.Z3(vg0Var.P1, false, 0.5f, true, true);
                        org.telegram.ui.Components.t4.u(d2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.messenger.g0.Z3(vg0Var.O1, true, 0.5f, true, true);
                org.telegram.messenger.g0.Z3(vg0Var.P1, false, 0.5f, true, true);
                org.telegram.ui.Components.t4.e0(vg0Var.f28583a, tL_error13, d2Var2, tL_contacts_importContacts, new Object[0]);
                return;
            case 21:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                sg0 sg0Var = (sg0) obj3;
                m2.t tVar = (m2.t) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                yj0 yj0Var = ((hj0) obj5).f45928a;
                if (tL_error14 == null) {
                    ((dj0) yj0Var.C1).c(yj0Var.F, (String) yj0Var.f52328t1.get("email"), null, null, null, null, null, null, null, null, sg0Var, tVar);
                    return;
                }
                org.telegram.ui.Components.t4.e0(yj0.M0(yj0Var), tL_error14, yj0Var, verifyemail2, new Object[0]);
                tVar.f(null, null);
                return;
            case 22:
                uj0 uj0Var = (uj0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                yj0 yj0Var2 = uj0Var.R;
                uj0Var.K = false;
                if (tL_error15 == null) {
                    yj0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    org.telegram.ui.ActionBar.s1 e02 = org.telegram.ui.Components.t4.e0(yj0.n0(yj0Var2), tL_error15, yj0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.f28554p0 = new qj0(uj0Var, 0);
                    }
                }
                yj0Var2.B1();
                return;
            case 23:
                dl0.k0((dl0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 24:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                ArrayList arrayList11 = (ArrayList) obj4;
                Integer num = (Integer) obj2;
                kq0 kq0Var2 = (kq0) obj;
                PhotoViewer photoViewer = ((qp0) obj5).f48942r;
                photoViewer.f41517q4 = null;
                gq0 gq0Var = photoViewer.f41420f0;
                if (gq0Var != null && photoViewer.f41437h0 != null) {
                    gq0Var.setLayerType(0, null);
                    photoViewer.f41499o4 = 0;
                    photoViewer.I1();
                    photoViewer.f41508p4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.f53471a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.f53471a = false;
                    photoViewer.G2();
                    photoViewer.C2();
                    photoViewer.f41420f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    mq0 mq0Var = photoViewer.f41527r4;
                    if (mq0Var != null) {
                        mq0Var.f47751a.O0(true, true);
                    }
                    mq0 mq0Var2 = photoViewer.f41536s4;
                    if (mq0Var2 != null && !mq0Var2.f47767s) {
                        mq0Var2.f47751a.O0(false, true);
                    }
                    if (arrayList11 != null && (i13 = photoViewer.f41402d2) != 3 && i13 != 1 && ((kq0Var = photoViewer.d) == null || !kq0Var.P())) {
                        photoViewer.V1();
                    }
                    org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
                    if (m51Var != null && m51Var.d0() && photoViewer.f41533s1 && !photoViewer.h7.isEmpty()) {
                        PhotoViewer.a0(photoViewer, photoViewer.G2.S());
                        PhotoViewer.Z(photoViewer, true);
                    }
                    if (photoViewer.f41553u4) {
                        PhotoViewer.b0(photoViewer, num.intValue());
                    }
                    if (kq0Var2 != null) {
                        kq0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj3;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj2;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj4) != null) {
                    privacyControlActivity.M0();
                    return;
                }
                zArr[1] = true;
                if (globalPrivacySettings != null) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                    globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                    int i19 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i19;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j10 > 0) {
                        globalPrivacySettings.flags = i19 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j10;
                    } else {
                        globalPrivacySettings.flags = i19 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.I0();
                }
                privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                return;
            case 26:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((at0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(privacyControlActivity2).Q(2131623989, 36, org.telegram.messenger.bd.M0(2131746864, null));
                    Q.f31792j = 5000;
                    Q.j();
                    return;
                }
                if (userFull2 != null) {
                    if (tL_birthday2 == null) {
                        userFull2.flags2 &= -33;
                    } else {
                        userFull2.flags2 |= 32;
                    }
                    userFull2.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().j2(userFull2, false);
                }
                if (tL_error16 != null && (str2 = tL_error16.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                    if (privacyControlActivity2.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, privacyControlActivity2.getParentActivity(), PrivacyControlActivity.D0(privacyControlActivity2));
                        String M0 = org.telegram.messenger.bd.M0(2131746860, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                        s1Var2.S = M0;
                        s1Var2.U = org.telegram.messenger.bd.M0(2131746861, null);
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        privacyControlActivity2.showDialog(s1Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(privacyControlActivity2), 2131624011, 36);
                return;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                kt0 kt0Var = (kt0) obj;
                RectF rectF = ProfileActivity.T6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    kt0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String M02 = org.telegram.messenger.bd.M0(2131689472, null);
                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                s1Var3.S = M02;
                s1Var3.U = org.telegram.messenger.bd.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131747839, null), new ci0(kt0Var, 11));
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                profileActivity.showDialog(s1Var3);
                return;
            case 28:
                a();
                return;
            default:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                String str16 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj;
                RectF rectF2 = ProfileActivity.T6;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    f00.a(profileActivity2.getParentActivity(), 1, str16, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity2.A0);
                    return;
                } else {
                    org.telegram.ui.Components.fc.d0(tL_error17);
                    return;
                }
        }
    }

    public lq(mq mqVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3) {
        this.f47408a = 0;
        this.f47409b = mqVar;
        this.f47410c = arrayList;
        this.f47412f = hVar;
        this.d = arrayList2;
        this.f47411e = arrayList3;
    }

    public lq(is isVar, TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        this.f47408a = 5;
        this.f47409b = isVar;
        this.d = tL_error;
        this.f47411e = tLObject;
        this.f47410c = arrayList;
        this.f47412f = tL_messages_getMyStickers;
    }

    public lq(qp0 qp0Var, ClippingImageView[] clippingImageViewArr, ArrayList arrayList, Integer num, kq0 kq0Var) {
        this.f47408a = 24;
        this.f47409b = qp0Var;
        this.d = clippingImageViewArr;
        this.f47410c = arrayList;
        this.f47411e = num;
        this.f47412f = kq0Var;
    }
}
