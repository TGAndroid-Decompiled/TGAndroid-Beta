package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.Serializable;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oc1;
import org.telegram.ui.u71;
public final class jv0 implements Runnable {
    public final int f35079a;
    public final Object f35080b;
    public final Object f35081c;
    public final Object d;
    public final Object f35082e;
    public final Object f35083f;

    public jv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f35079a = i7;
        this.d = obj;
        this.f35082e = obj2;
        this.f35081c = obj3;
        this.f35080b = obj4;
        this.f35083f = obj5;
    }

    private final void a() {
        String p10;
        ProfileActivity profileActivity = (ProfileActivity) this.d;
        TLObject tLObject = (TLObject) this.f35080b;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f35082e;
        org.telegram.ui.kv0 kv0Var = (org.telegram.ui.kv0) this.f35083f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f35081c;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
            if (profileActivity.f41712d1 != 0) {
                profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41712d1));
            } else {
                profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f41719e1));
            }
            String str = "@" + tL_username.username;
            String format = org.telegram.messenger.hd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
            String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
            String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
            hc hcVar = new hc(kv0Var.f36035t1, profileActivity.f41865z0);
            if (TextUtils.isEmpty(f11)) {
                p10 = "";
            } else {
                p10 = a8.p0.p("(", f11, ")");
            }
            cc w10 = hcVar.w(2131231182, org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750518, str, format, f10, p10)), new org.telegram.ui.qn0(18, profileActivity, tL_collectibleInfo)));
            org.telegram.ui.fk0 fk0Var = new org.telegram.ui.fk0(5, profileActivity, tL_collectibleInfo);
            gb gbVar = w10.f32510e;
            if (gbVar != null) {
                gbVar.setOnClickListener(fk0Var);
            }
            w10.k(false);
            return;
        }
        RectF rectF = ProfileActivity.S6;
        hc.d0(tL_error);
    }

    @Override
    public final void run() {
        String str;
        boolean z9;
        TLRPC.GroupCall groupCall;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.ThemeSettings themeSettings;
        TLRPC.TL_wallPaper tL_wallPaper;
        org.telegram.ui.hl0 hl0Var;
        hc d;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.uq0 uq0Var;
        String str2;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i14 = this.f35079a;
        int i15 = 0;
        Object obj = this.f35083f;
        Object obj2 = this.f35080b;
        Object obj3 = this.f35081c;
        Object obj4 = this.f35082e;
        Object obj5 = this.d;
        switch (i14) {
            case 0:
                yv0 yv0Var = (yv0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                yv0Var.f40757g2 = 0;
                String str4 = yv0Var.f40756f2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.hd.M0(2131749234, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28203w6, yv0Var.I0);
                        yv0Var.f40758h2 = true;
                        return;
                    }
                    textView.setText(org.telegram.messenger.hd.M0(2131749229, null));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28070p7, yv0Var.I0);
                    yv0Var.f40758h2 = false;
                    return;
                }
                return;
            case 1:
                jw0 jw0Var = (jw0) obj5;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        cc I = hc.a0(T).I(2131624033, org.telegram.messenger.hd.M0(2131746855, null), org.telegram.messenger.hd.M0(2131746854, null));
                        I.f32514j = 5000;
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
                        org.telegram.messenger.yr.a0(jw0Var.f35084a).j2(userFull, false);
                    }
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jw0Var.f35085b.getContext());
                        alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131746851, null);
                        alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131746852, null);
                        jg.g.C(null, 2131747830, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.k5.o(null, 2131743880, hc.a0(T), 2131624011, 36);
                    return;
                }
                return;
            case 2:
                m11 m11Var = (m11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                k60 k60Var = (k60) obj2;
                k60 k60Var2 = (k60) obj;
                org.telegram.ui.an anVar = m11Var.f35833s;
                if (((org.telegram.messenger.qp) obj4).r2(m11Var.f35824f, tL_forumTopic.f27005id, null)) {
                    k60Var.u();
                    org.telegram.messenger.dt.t(m11Var.f35822e).G(m11Var.f35824f, tL_forumTopic.f27005id, false);
                    if (hc.a(anVar)) {
                        hc.z(anVar, 4, 0, m11Var.h).j();
                        return;
                    }
                    return;
                }
                k60Var.K(k60Var2);
                return;
            case 3:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i15 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i15);
                        i15++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f26973id = stickerSetCovered2.set.f26980id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(ksVar.f47287r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) jg.g.i(1, tL_messages_myStickers.sets)).set.f26980id;
                        ConnectionsManager.getInstance(ksVar.f47287r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.z9(ksVar, arrayList, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ww.J0((org.telegram.ui.ww) obj5, (TLObject) obj2, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj3);
                return;
            case 5:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                c40Var.getClass();
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = c40Var.getContext();
                    int i16 = c40Var.f28613a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.f6 f6Var2 = c40Var.I0;
                    org.telegram.messenger.r3 r3Var = c40Var.R2;
                    if (r3Var != null && (groupCall = r3Var.f25209b) != null && groupCall.creator) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.ui.i9.n0(context, i16, inputGroupCall, str5, f6Var2, false, z9);
                    return;
                } else if (tL_error3 != null) {
                    new hc(c40Var.E, new di.i0()).f0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.c40 c40Var2 = (org.telegram.ui.c40) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                String str6 = (String) obj4;
                c40Var2.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.i0 i0Var = new ug.i0(34, c40Var2.f28613a, T2.getContext(), T2, new di.i0());
                    i0Var.C1(null, arrayList3, arrayList4, arrayList5, str6);
                    i0Var.show();
                    return;
                }
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.q10 q10Var = (org.telegram.ui.q10) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                String str7 = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        oc1 oc1Var = new oc1(str8, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        oc1Var.f48376g = tL_wallPaper3;
                        tL_wallPaper3 = oc1Var;
                    }
                    u71 u71Var = new u71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    u71Var.G1 = z10;
                    u71Var.F1 = z11;
                    u71Var.f50307o1 = wallPaperSettings3.intensity;
                    launchActivity.t0(u71Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error4.text);
                launchActivity.F0(v4.K(launchActivity, null, sb2.toString()));
                return;
            case 8:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                String str9 = (String) obj4;
                ArrayList arrayList6 = launchActivity2.C0;
                if (wwVar != null) {
                    if (f2Var != null) {
                        f2Var.dismissCurrentDialog();
                    }
                    while (i15 < arrayList6.size()) {
                        if (((Dialog) arrayList6.get(i15)).isShowing()) {
                            ((Dialog) arrayList6.get(i15)).dismiss();
                        }
                        i15++;
                    }
                    arrayList6.clear();
                    launchActivity2.t0(wwVar);
                    return;
                } else if (f2Var instanceof org.telegram.ui.an) {
                    ((org.telegram.ui.an) f2Var).wa(user.f27102id, str9, true);
                    return;
                } else {
                    return;
                }
            case 9:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj;
                String str10 = (String) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.bi0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.bi0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        v4.n0(T3, str10, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        org.telegram.ui.bi0.a().I(2131624011, org.telegram.messenger.hd.M0(2131753128, null), org.telegram.messenger.hd.M0(2131753129, null)).j();
                        return;
                    } else {
                        org.telegram.ui.bi0.a().f0(tL_error5, false);
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                org.telegram.ui.q10 q10Var2 = (org.telegram.ui.q10) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                String str11 = LaunchActivity.B1;
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
                                org.telegram.messenger.w7.G(launchActivity4.O);
                                if (!org.telegram.messenger.w7.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.U0 = u1Var;
                                    launchActivity4.T0 = true;
                                    launchActivity4.R0 = Q0;
                                    launchActivity4.S0 = tL_theme;
                                    launchActivity4.Q0 = tL_wallPaper4;
                                    launchActivity4.P0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.O).W(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                q10Var2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        }
                        i15 = 1;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.T0 = false;
                            launchActivity4.S0 = tL_theme;
                            launchActivity4.O0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.U0 = u1Var;
                            org.telegram.messenger.w7.G(launchActivity4.O).W(launchActivity4.S0.document, tL_theme, 1, 1);
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
                        q10Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i15 == 1) {
                        launchActivity4.F0(v4.K(launchActivity4, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131744174, null)));
                        return;
                    } else {
                        launchActivity4.F0(v4.K(launchActivity4, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131744175, null)));
                        return;
                    }
                }
                return;
            case 11:
                org.telegram.ui.p90 p90Var = (org.telegram.ui.p90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj;
                String str12 = (String) obj4;
                int i17 = p90Var.f48718b;
                LaunchActivity launchActivity5 = p90Var.f48717a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = org.telegram.ui.p90.d();
                        i7 = 2131747394;
                    } else {
                        d = org.telegram.ui.p90.d();
                        i7 = 2131747395;
                    }
                    org.telegram.messenger.k5.p(null, i7, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        zh.r3 r3Var2 = launchActivity5.X0;
                        launchActivity5.X0 = null;
                        bi.ea.y(i17, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new org.telegram.ui.k90(p90Var, 1), new org.telegram.ui.l70(r3Var2, 1));
                        return;
                    }
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        org.telegram.messenger.qp.s1(i17).Y3(paymentForm.users, false);
                        hl0Var = new org.telegram.ui.hl0(paymentForm, null, str12, LaunchActivity.T());
                    } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                        hl0Var = new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject8);
                    } else {
                        hl0Var = null;
                    }
                    if (hl0Var != null) {
                        zh.r3 r3Var3 = launchActivity5.X0;
                        if (r3Var3 != null) {
                            launchActivity5.X0 = null;
                            hl0Var.Z0 = new org.telegram.ui.ve(10, r3Var3);
                        }
                        p90Var.u(hl0Var, false);
                    }
                }
                p90Var.c();
                return;
            case 12:
                org.telegram.ui.ce0.b0((org.telegram.ui.ce0) obj5, (TLRPC.TL_error) obj3, (String) obj4, (String) obj2, (String) obj);
                return;
            case 13:
                TLObject tLObject9 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ce0 ce0Var = ((org.telegram.ui.ob0) obj5).W;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    ce0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    return;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    v4.c0(i10, tL_error8, ce0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.sc0 sc0Var = (org.telegram.ui.sc0) obj5;
                TLObject tLObject10 = (TLObject) obj2;
                Bundle bundle2 = (Bundle) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.ce0 ce0Var2 = sc0Var.E;
                ce0Var2.C1(false, true);
                sc0Var.f49742r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ce0Var2.M1(13, true, bundle2, false);
                    return;
                }
                String str13 = tL_error9.text;
                if (str13 != null) {
                    if (str13.contains("EMAIL_INVALID")) {
                        sc0Var.n();
                        return;
                    } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131751201, null));
                        return;
                    } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                        return;
                    } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131747285, "PhoneNumberFlood"));
                        return;
                    } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                            ce0Var2.M1(0, true, null, true);
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                            return;
                        } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                            return;
                        } else if (tL_error9.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                            v4.c0(i11, tL_error9, ce0Var2, sendverifyemailcode, sc0Var.f49745x);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749182, "InvalidCode"));
                        return;
                    }
                }
                return;
            case 15:
                TLObject tLObject11 = (TLObject) obj2;
                Bundle bundle3 = (Bundle) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.ce0 ce0Var3 = ((org.telegram.ui.sc0) obj5).E;
                if ((tLObject11 instanceof TL_account.TL_emailVerified) && ce0Var3.F == 3) {
                    ce0Var3.finishFragment();
                    ce0Var3.f44762d0.run();
                    return;
                } else if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    ce0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error10 != null) {
                    if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                        ce0Var3.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131751201, null));
                        return;
                    } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                        ce0Var3.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131751198, null));
                        return;
                    } else if (tL_error10.code != -1000) {
                        i12 = ((org.telegram.ui.ActionBar.f2) ce0Var3).currentAccount;
                        v4.c0(i12, tL_error10, ce0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 16:
                final org.telegram.ui.ld0 ld0Var = (org.telegram.ui.ld0) obj5;
                TLObject tLObject12 = (TLObject) obj2;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj4;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ce0 ce0Var4 = ld0Var.f47525w;
                ld0Var.f47518b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    ce0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    org.telegram.ui.hl0 hl0Var2 = new org.telegram.ui.hl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ce0Var4, true);
                    hl0Var2.V0 = true;
                    hl0Var2.f46414c1 = new org.telegram.messenger.c20() {
                        @Override
                        public final void a(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final ld0 ld0Var2 = ld0Var;
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
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var3 = ld0Var2;
                                                    if (!ld0Var3.f47521f) {
                                                        ld0Var3.f47521f = true;
                                                        ld0Var3.h = str14;
                                                        ld0Var3.f47522n = str15;
                                                        ld0Var3.f47523r = j3;
                                                        ld0Var3.f47518b.setLoading(true);
                                                        ld0Var3.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    ld0 ld0Var4 = ld0Var2;
                                                    if (!ld0Var4.f47521f) {
                                                        ld0Var4.f47521f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f47522n = str17;
                                                        ld0Var4.f47523r = j10;
                                                        ld0Var4.f47518b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final ld0 ld0Var3 = ld0Var;
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
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f47521f) {
                                                        ld0Var32.f47521f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.f47522n = str15;
                                                        ld0Var32.f47523r = j3;
                                                        ld0Var32.f47518b.setLoading(true);
                                                        ld0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    ld0 ld0Var4 = ld0Var3;
                                                    if (!ld0Var4.f47521f) {
                                                        ld0Var4.f47521f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f47522n = str17;
                                                        ld0Var4.f47523r = j10;
                                                        ld0Var4.f47518b.setLoading(true);
                                                        ld0Var4.o();
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
                    hl0Var2.f46416d1 = new org.telegram.messenger.c20() {
                        @Override
                        public final void a(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final ld0 ld0Var2 = ld0Var;
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
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var32 = ld0Var2;
                                                    if (!ld0Var32.f47521f) {
                                                        ld0Var32.f47521f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.f47522n = str15;
                                                        ld0Var32.f47523r = j3;
                                                        ld0Var32.f47518b.setLoading(true);
                                                        ld0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    ld0 ld0Var4 = ld0Var2;
                                                    if (!ld0Var4.f47521f) {
                                                        ld0Var4.f47521f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f47522n = str17;
                                                        ld0Var4.f47523r = j10;
                                                        ld0Var4.f47518b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final ld0 ld0Var3 = ld0Var;
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
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f47521f) {
                                                        ld0Var32.f47521f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.f47522n = str15;
                                                        ld0Var32.f47523r = j3;
                                                        ld0Var32.f47518b.setLoading(true);
                                                        ld0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    ld0 ld0Var4 = ld0Var3;
                                                    if (!ld0Var4.f47521f) {
                                                        ld0Var4.f47521f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f47522n = str17;
                                                        ld0Var4.f47523r = j10;
                                                        ld0Var4.f47518b.setLoading(true);
                                                        ld0Var4.o();
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
                    hl0Var2.f46419e1 = new org.telegram.ui.j00(ld0Var, 1);
                    ce0Var4.presentFragment(hl0Var2);
                    return;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.hd0(ld0Var, 2));
                        return;
                    }
                    String str14 = tL_error11.text;
                    ld0Var.f47520e = str14;
                    new hc(ce0Var4.Z, null).H(2131624011, org.telegram.messenger.hd.a0(null, null, 2131743879, str14));
                    return;
                } else {
                    new hc(ce0Var4.Z, null).H(2131624011, org.telegram.messenger.hd.M0(2131743880, null));
                    return;
                }
            case 17:
                org.telegram.ui.jg0 jg0Var = (org.telegram.ui.jg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj3;
                mg.b bVar = (mg.b) obj2;
                String str15 = (String) obj4;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                jg0Var.D = true;
                if (tL_error12 == null && bVar != null) {
                    jg0Var.f46973w.l(str15, bVar);
                    org.telegram.ui.o41 o41Var = jg0Var.f46971r;
                    o41Var.f48256e = bVar;
                    o41Var.f48255c = tL_loadAsyncGraph.f27186x;
                    jg0Var.m0();
                    return;
                }
                jg0Var.m0();
                return;
            case 18:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj3;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = ah0Var.C1;
                ah0Var.f43664x1 = false;
                if (tL_contacts_importedContacts != null) {
                    if (!tL_contacts_importedContacts.users.isEmpty()) {
                        org.telegram.messenger.qp.s1(ah0Var.f28613a).Y3(tL_contacts_importedContacts.users, false);
                        org.telegram.messenger.qp.s1(ah0Var.f28613a).z3(tL_contacts_importedContacts.users.get(0), null, f2Var2, 1);
                        ah0Var.dismiss();
                        return;
                    } else if (f2Var2.getParentActivity() != null) {
                        org.telegram.messenger.g0.Z3(ah0Var.N1, true, 0.5f, true, true);
                        org.telegram.messenger.g0.Z3(ah0Var.O1, false, 0.5f, true, true);
                        v4.u(f2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.messenger.g0.Z3(ah0Var.N1, true, 0.5f, true, true);
                org.telegram.messenger.g0.Z3(ah0Var.O1, false, 0.5f, true, true);
                v4.c0(ah0Var.f28613a, tL_error13, f2Var2, tL_contacts_importContacts, new Object[0]);
                return;
            case 19:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) obj4;
                m4.d0 d0Var = (m4.d0) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.bk0 bk0Var = ((org.telegram.ui.kj0) obj5).f47200a;
                if (tL_error14 == null) {
                    ((org.telegram.ui.gj0) bk0Var.B1).c(bk0Var.E, (String) bk0Var.f44401s1.get("email"), null, null, null, null, null, null, null, null, ef0Var, d0Var);
                    return;
                }
                v4.c0(org.telegram.ui.bk0.M0(bk0Var), tL_error14, bk0Var, verifyemail2, new Object[0]);
                d0Var.a(null, null);
                return;
            case 20:
                org.telegram.ui.xj0 xj0Var = (org.telegram.ui.xj0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj3;
                Bundle bundle4 = (Bundle) obj4;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.bk0 bk0Var2 = xj0Var.Q;
                xj0Var.J = false;
                if (tL_error15 == null) {
                    bk0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    org.telegram.ui.ActionBar.u1 c02 = v4.c0(org.telegram.ui.bk0.n0(bk0Var2), tL_error15, bk0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.m0 = new org.telegram.ui.tj0(xj0Var, 0);
                    }
                }
                bk0Var2.B1();
                return;
            case 21:
                org.telegram.ui.hl0.k0((org.telegram.ui.hl0) obj5, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj4, (TL_account.getPassword) obj);
                return;
            case 22:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.uq0 uq0Var2 = (org.telegram.ui.uq0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.zp0) obj5).f52643r;
                photoViewer.o4 = null;
                org.telegram.ui.pq0 pq0Var = photoViewer.f41380e0;
                if (pq0Var != null && photoViewer.f41399g0 != null) {
                    pq0Var.setLayerType(0, null);
                    photoViewer.f41452m4 = 0;
                    photoViewer.D1();
                    photoViewer.f41461n4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.f20961a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.f20961a = false;
                    photoViewer.A2();
                    photoViewer.w2();
                    photoViewer.f41380e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.wq0 wq0Var = photoViewer.f41478p4;
                    if (wq0Var != null) {
                        wq0Var.f51476a.O0(true, true);
                    }
                    org.telegram.ui.wq0 wq0Var2 = photoViewer.f41487q4;
                    if (wq0Var2 != null && !wq0Var2.f51492s) {
                        wq0Var2.f51476a.O0(false, true);
                    }
                    if (arrayList7 != null && (i13 = photoViewer.f41364c2) != 3 && i13 != 1 && ((uq0Var = photoViewer.d) == null || !uq0Var.P())) {
                        photoViewer.Q1();
                    }
                    t51 t51Var = photoViewer.F2;
                    if (t51Var != null && t51Var.d0() && photoViewer.f41494r1 && !photoViewer.f41397f7.isEmpty()) {
                        PhotoViewer.R(photoViewer, photoViewer.F2.S());
                        PhotoViewer.Q(photoViewer, true);
                    }
                    if (photoViewer.f41507s4) {
                        PhotoViewer.S(photoViewer, num.intValue());
                    }
                    if (uq0Var2 != null) {
                        uq0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj2;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj3) != null) {
                    privacyControlActivity.M0();
                    return;
                }
                zArr[1] = true;
                if (globalPrivacySettings != null) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                    globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                    int i18 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i18;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j3 > 0) {
                        globalPrivacySettings.flags = i18 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j3;
                    } else {
                        globalPrivacySettings.flags = i18 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.I0();
                }
                privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                return;
            case 24:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj3;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.jt0) obj5).d;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    cc Q = hc.a0(privacyControlActivity2).Q(2131623989, 36, org.telegram.messenger.hd.M0(2131746855, null));
                    Q.f32514j = 5000;
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
                        Activity parentActivity = privacyControlActivity2.getParentActivity();
                        f6Var = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, f6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131746851, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                        u1Var2.R = M0;
                        u1Var2.T = org.telegram.messenger.hd.M0(2131746852, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        privacyControlActivity2.showDialog(u1Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743880, hc.a0(privacyControlActivity2), 2131624011, 36);
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) obj;
                RectF rectF = ProfileActivity.S6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    ut0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41865z0);
                String M02 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27293a;
                u1Var3.R = M02;
                u1Var3.T = org.telegram.messenger.hd.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747830, null), new org.telegram.ui.li0(ut0Var, 10));
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                profileActivity.showDialog(u1Var3);
                return;
            case 26:
                a();
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj2;
                String str16 = (String) obj4;
                TLRPC.User user3 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj3;
                RectF rectF2 = ProfileActivity.S6;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.h00.a(profileActivity2.getParentActivity(), 1, str16, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity2.f41865z0);
                    return;
                } else {
                    hc.d0(tL_error17);
                    return;
                }
            case 28:
                ProfileActivity.h0((ProfileActivity) obj5, (TLObject) obj2, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj3);
                return;
            default:
                org.telegram.ui.tw0 tw0Var = (org.telegram.ui.tw0) obj5;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.ActionBar.f2 f2Var3 = tw0Var.f50167e;
                if (((String) obj4).equals(tw0Var.D)) {
                    if (!tw0Var.f50173x && (f2Var3 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) f2Var3).O.f31923b.getImageReceiver().P0(false);
                            ((ProfileActivity) f2Var3).O.d.setText(org.telegram.messenger.hd.M0(2131745477, null));
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                        }
                    }
                    tw0Var.f50173x = true;
                    tw0Var.f50170r = arrayList8;
                    tw0Var.f50171s = arrayList9;
                    tw0Var.f50169n = arrayList10;
                    tw0Var.f();
                    if (f2Var3 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) f2Var3).O.f31923b.getImageReceiver().P0(false);
                            return;
                        } catch (Exception e14) {
                            org.telegram.messenger.a8.g(e14, true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public jv0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i7) {
        this.f35079a = i7;
        this.d = obj;
        this.f35081c = obj2;
        this.f35080b = obj3;
        this.f35083f = obj4;
        this.f35082e = str;
    }

    public jv0(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, int i7) {
        this.f35079a = i7;
        this.d = obj;
        this.f35082e = obj2;
        this.f35080b = tLObject;
        this.f35083f = tLObject2;
        this.f35081c = tL_error;
    }

    public jv0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i7) {
        this.f35079a = i7;
        this.d = obj;
        this.f35080b = tLObject;
        this.f35082e = obj2;
        this.f35083f = obj3;
        this.f35081c = tL_error;
    }

    public jv0(Object obj, TLRPC.TL_error tL_error, Object obj2, Serializable serializable, TLObject tLObject, int i7) {
        this.f35079a = i7;
        this.d = obj;
        this.f35081c = tL_error;
        this.f35080b = obj2;
        this.f35082e = serializable;
        this.f35083f = tLObject;
    }

    public jv0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i7) {
        this.f35079a = i7;
        this.d = obj;
        this.f35081c = tL_error;
        this.f35082e = obj2;
        this.f35080b = obj3;
        this.f35083f = obj4;
    }

    public jv0(wt0 wt0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i7) {
        this.f35079a = i7;
        this.d = wt0Var;
        this.f35080b = tLObject;
        this.f35082e = bundle;
        this.f35081c = tL_error;
        this.f35083f = tLObject2;
    }

    public jv0(LaunchActivity launchActivity, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error) {
        this.f35079a = 9;
        this.d = launchActivity;
        this.f35080b = tLObject;
        this.f35083f = tL_messages_requestUrlAuth;
        this.f35082e = str;
        this.f35081c = tL_error;
    }

    public jv0(org.telegram.ui.ah0 ah0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f35079a = 18;
        this.d = ah0Var;
        this.f35082e = tL_contacts_importedContacts;
        this.f35080b = tL_inputPhoneContact;
        this.f35081c = tL_error;
        this.f35083f = tL_contacts_importContacts;
    }
}
