package org.telegram.ui.Components;

import android.app.Activity;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.x71;
public final class n10 implements Runnable {
    public final int f36190a;
    public final Object f36191b;
    public final Object f36192c;
    public final Object d;
    public final Object f36193e;
    public final Object f36194f;

    public n10(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.f36190a = 0;
        this.f36191b = view;
        this.f36192c = view2;
        this.f36194f = windowManager;
        this.d = view3;
        this.f36193e = view4;
    }

    @Override
    public final void run() {
        String str;
        boolean z9;
        TLRPC.GroupCall groupCall;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7;
        TLRPC.ThemeSettings themeSettings;
        TLRPC.TL_wallPaper tL_wallPaper;
        org.telegram.ui.kl0 kl0Var;
        gc d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.xq0 xq0Var;
        String str2;
        org.telegram.ui.ActionBar.h6 h6Var;
        String p10;
        int i15 = this.f36190a;
        int i16 = 0;
        Object obj = this.f36194f;
        Object obj2 = this.f36193e;
        Object obj3 = this.d;
        Object obj4 = this.f36192c;
        Object obj5 = this.f36191b;
        switch (i15) {
            case 0:
                View view = (View) obj5;
                View view2 = (View) obj4;
                WindowManager windowManager = (WindowManager) obj;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj3);
                windowManager.removeView((View) obj2);
                return;
            case 1:
                yv0 yv0Var = (yv0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                yv0Var.f40744j2 = 0;
                String str4 = yv0Var.f40743i2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.id.M0(2131749235, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28244w6, yv0Var.I0);
                        yv0Var.f40745k2 = true;
                        return;
                    }
                    textView.setText(org.telegram.messenger.id.M0(2131749230, null));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28111p7, yv0Var.I0);
                    yv0Var.f40745k2 = false;
                    return;
                }
                return;
            case 2:
                jw0 jw0Var = (jw0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        bc I = gc.a0(T).I(2131624033, org.telegram.messenger.id.M0(2131746856, null), org.telegram.messenger.id.M0(2131746855, null));
                        I.f32203j = 5000;
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
                        alertDialog$Builder.f27300a.R = org.telegram.messenger.id.M0(2131746852, null);
                        alertDialog$Builder.f27300a.T = org.telegram.messenger.id.M0(2131746853, null);
                        jg.g.C(null, 2131747831, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.k5.o(null, 2131743879, gc.a0(T), 2131624011, 36);
                    return;
                }
                return;
            case 3:
                m11 m11Var = (m11) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                k60 k60Var = (k60) obj2;
                k60 k60Var2 = (k60) obj;
                org.telegram.ui.cn cnVar = m11Var.f35812s;
                if (((org.telegram.messenger.qp) obj4).r2(m11Var.f35803f, tL_forumTopic.f27012id, null)) {
                    k60Var.u();
                    org.telegram.messenger.dt.t(m11Var.f35801e).G(m11Var.f35803f, tL_forumTopic.f27012id, false);
                    if (gc.a(cnVar)) {
                        gc.z(cnVar, 4, 0, m11Var.h).j();
                        return;
                    }
                    return;
                }
                k60Var.K(k60Var2);
                return;
            case 4:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i16 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i16);
                        i16++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f26980id = stickerSetCovered2.set.f26987id;
                            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(nsVar.f48273r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) jg.g.i(1, tL_messages_myStickers.sets)).set.f26987id;
                        ConnectionsManager.getInstance(nsVar.f48273r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.z9(nsVar, arrayList, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.zw.J0((org.telegram.ui.zw) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) obj5;
                TLObject tLObject4 = (TLObject) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                f40Var.getClass();
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = f40Var.getContext();
                    int i17 = f40Var.f28669a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.h6 h6Var2 = f40Var.I0;
                    org.telegram.messenger.r3 r3Var = f40Var.U2;
                    if (r3Var != null && (groupCall = r3Var.f25226b) != null && groupCall.creator) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.ui.i9.n0(context, i17, inputGroupCall, str5, h6Var2, false, z9);
                    return;
                } else if (tL_error3 != null) {
                    new gc(f40Var.E, new di.i0()).f0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.ui.f40 f40Var2 = (org.telegram.ui.f40) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                String str6 = (String) obj;
                f40Var2.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.i0 i0Var = new ug.i0(34, f40Var2.f28669a, T2.getContext(), T2, new di.i0());
                    i0Var.C1(null, arrayList3, arrayList4, arrayList5, str6);
                    i0Var.show();
                    return;
                }
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.f10 f10Var = (org.telegram.ui.f10) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                String str7 = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        tc1 tc1Var = new tc1(str8, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        tc1Var.f50239g = tL_wallPaper3;
                        tL_wallPaper3 = tc1Var;
                    }
                    x71 x71Var = new x71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    x71Var.G1 = z10;
                    x71Var.F1 = z11;
                    x71Var.f51603o1 = wallPaperSettings3.intensity;
                    launchActivity.t0(x71Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                sb2.append(tL_error4.text);
                launchActivity.F0(u4.K(launchActivity, null, sb2.toString()));
                return;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList6 = launchActivity2.C0;
                if (zwVar != null) {
                    if (f2Var != null) {
                        f2Var.dismissCurrentDialog();
                    }
                    while (i16 < arrayList6.size()) {
                        if (((Dialog) arrayList6.get(i16)).isShowing()) {
                            ((Dialog) arrayList6.get(i16)).dismiss();
                        }
                        i16++;
                    }
                    arrayList6.clear();
                    launchActivity2.t0(zwVar);
                    return;
                } else if (f2Var instanceof org.telegram.ui.cn) {
                    ((org.telegram.ui.cn) f2Var).ya(user.f27109id, str9, true);
                    return;
                } else {
                    return;
                }
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str10 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.ei0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.ei0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        u4.n0(T3, str10, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        org.telegram.ui.ei0.a().I(2131624011, org.telegram.messenger.id.M0(2131753128, null), org.telegram.messenger.id.M0(2131753129, null)).j();
                        return;
                    } else {
                        org.telegram.ui.ei0.a().f0(tL_error5, false);
                        return;
                    }
                } else {
                    return;
                }
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                org.telegram.ui.f10 f10Var2 = (org.telegram.ui.f10) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                String str11 = LaunchActivity.B1;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(themeSettings));
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
                                f10Var2.run();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, Q0);
                        } else {
                            i16 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.T0 = false;
                            launchActivity4.S0 = tL_theme;
                            launchActivity4.O0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.U0 = u1Var;
                            org.telegram.messenger.w7.G(launchActivity4.O).W(launchActivity4.S0.document, tL_theme, 1, 1);
                        }
                        i7 = 1;
                    }
                    i7 = i16;
                } else {
                    if (tL_error6 == null || !"THEME_FORMAT_INVALID".equals(tL_error6.text)) {
                        i7 = 2;
                    }
                    i7 = 1;
                }
                if (i7 != 0) {
                    try {
                        f10Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i7 == 1) {
                        launchActivity4.F0(u4.K(launchActivity4, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131744173, null)));
                        return;
                    } else {
                        launchActivity4.F0(u4.K(launchActivity4, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131744174, null)));
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i18 = s90Var.f49757b;
                LaunchActivity launchActivity5 = s90Var.f49756a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = org.telegram.ui.s90.d();
                        i10 = 2131747395;
                    } else {
                        d = org.telegram.ui.s90.d();
                        i10 = 2131747396;
                    }
                    org.telegram.messenger.k5.p(null, i10, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        zh.r3 r3Var2 = launchActivity5.X0;
                        launchActivity5.X0 = null;
                        bi.ea.y(i18, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new org.telegram.ui.n90(s90Var, 1), new org.telegram.ui.o70(r3Var2, 1));
                        return;
                    }
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        org.telegram.messenger.qp.s1(i18).Y3(paymentForm.users, false);
                        kl0Var = new org.telegram.ui.kl0(paymentForm, null, str12, LaunchActivity.T());
                    } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                        kl0Var = new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject8);
                    } else {
                        kl0Var = null;
                    }
                    if (kl0Var != null) {
                        zh.r3 r3Var3 = launchActivity5.X0;
                        if (r3Var3 != null) {
                            launchActivity5.X0 = null;
                            kl0Var.Z0 = new org.telegram.ui.we(10, r3Var3);
                        }
                        s90Var.u(kl0Var, false);
                    }
                }
                s90Var.c();
                return;
            case 13:
                org.telegram.ui.fe0.b0((org.telegram.ui.fe0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.fe0 fe0Var = ((org.telegram.ui.rb0) obj5).W;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    fe0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    return;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                    u4.c0(i11, tL_error8, fe0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.wc0 wc0Var = (org.telegram.ui.wc0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.fe0 fe0Var2 = wc0Var.E;
                fe0Var2.C1(false, true);
                wc0Var.f50986r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    fe0Var2.M1(13, true, bundle2, false);
                    return;
                }
                String str13 = tL_error9.text;
                if (str13 != null) {
                    if (str13.contains("EMAIL_INVALID")) {
                        wc0Var.n();
                        return;
                    } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                        fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751200, null));
                        return;
                    } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                        fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                        return;
                    } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                        fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131747286, "PhoneNumberFlood"));
                        return;
                    } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                            fe0Var2.M1(0, true, null, true);
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                            return;
                        } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                            return;
                        } else if (tL_error9.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                            u4.c0(i12, tL_error9, fe0Var2, sendverifyemailcode, wc0Var.f50989x);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, "InvalidCode"));
                        return;
                    }
                }
                return;
            case 16:
                TLObject tLObject11 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.fe0 fe0Var3 = ((org.telegram.ui.wc0) obj5).E;
                if ((tLObject11 instanceof TL_account.TL_emailVerified) && fe0Var3.F == 3) {
                    fe0Var3.finishFragment();
                    fe0Var3.f45698d0.run();
                    return;
                } else if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    fe0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error10 != null) {
                    if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                        fe0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751200, null));
                        return;
                    } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                        fe0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751197, null));
                        return;
                    } else if (tL_error10.code != -1000) {
                        i13 = ((org.telegram.ui.ActionBar.f2) fe0Var3).currentAccount;
                        u4.c0(i13, tL_error10, fe0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 17:
                final org.telegram.ui.od0 od0Var = (org.telegram.ui.od0) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                org.telegram.ui.fe0 fe0Var4 = od0Var.f48509w;
                od0Var.f48502b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    fe0Var4.getMessagesController().Y3(paymentForm2.users, false);
                    org.telegram.ui.kl0 kl0Var2 = new org.telegram.ui.kl0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, fe0Var4, true);
                    kl0Var2.V0 = true;
                    kl0Var2.f47333c1 = new org.telegram.messenger.c20() {
                        @Override
                        public final void a(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final od0 od0Var2 = od0Var;
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
                                                    od0 od0Var3 = od0Var2;
                                                    if (!od0Var3.f48505f) {
                                                        od0Var3.f48505f = true;
                                                        od0Var3.h = str14;
                                                        od0Var3.f48506n = str15;
                                                        od0Var3.f48507r = j3;
                                                        od0Var3.f48502b.setLoading(true);
                                                        od0Var3.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    od0 od0Var4 = od0Var2;
                                                    if (!od0Var4.f48505f) {
                                                        od0Var4.f48505f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.f48506n = str17;
                                                        od0Var4.f48507r = j10;
                                                        od0Var4.f48502b.setLoading(true);
                                                        od0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final od0 od0Var3 = od0Var;
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
                                                    od0 od0Var32 = od0Var3;
                                                    if (!od0Var32.f48505f) {
                                                        od0Var32.f48505f = true;
                                                        od0Var32.h = str14;
                                                        od0Var32.f48506n = str15;
                                                        od0Var32.f48507r = j3;
                                                        od0Var32.f48502b.setLoading(true);
                                                        od0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    od0 od0Var4 = od0Var3;
                                                    if (!od0Var4.f48505f) {
                                                        od0Var4.f48505f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.f48506n = str17;
                                                        od0Var4.f48507r = j10;
                                                        od0Var4.f48502b.setLoading(true);
                                                        od0Var4.o();
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
                    kl0Var2.f47335d1 = new org.telegram.messenger.c20() {
                        @Override
                        public final void a(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final od0 od0Var2 = od0Var;
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
                                                    od0 od0Var32 = od0Var2;
                                                    if (!od0Var32.f48505f) {
                                                        od0Var32.f48505f = true;
                                                        od0Var32.h = str14;
                                                        od0Var32.f48506n = str15;
                                                        od0Var32.f48507r = j3;
                                                        od0Var32.f48502b.setLoading(true);
                                                        od0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    od0 od0Var4 = od0Var2;
                                                    if (!od0Var4.f48505f) {
                                                        od0Var4.f48505f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.f48506n = str17;
                                                        od0Var4.f48507r = j10;
                                                        od0Var4.f48502b.setLoading(true);
                                                        od0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final od0 od0Var3 = od0Var;
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
                                                    od0 od0Var32 = od0Var3;
                                                    if (!od0Var32.f48505f) {
                                                        od0Var32.f48505f = true;
                                                        od0Var32.h = str14;
                                                        od0Var32.f48506n = str15;
                                                        od0Var32.f48507r = j3;
                                                        od0Var32.f48502b.setLoading(true);
                                                        od0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str16 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str17 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    od0 od0Var4 = od0Var3;
                                                    if (!od0Var4.f48505f) {
                                                        od0Var4.f48505f = true;
                                                        od0Var4.h = str16;
                                                        od0Var4.f48506n = str17;
                                                        od0Var4.f48507r = j10;
                                                        od0Var4.f48502b.setLoading(true);
                                                        od0Var4.o();
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
                    kl0Var2.f47338e1 = new org.telegram.ui.m00(od0Var, 1);
                    fe0Var4.presentFragment(kl0Var2);
                    return;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.kd0(od0Var, 2));
                        return;
                    }
                    String str14 = tL_error11.text;
                    od0Var.f48504e = str14;
                    new gc(fe0Var4.Z, null).H(2131624011, org.telegram.messenger.id.a0(null, null, 2131743878, str14));
                    return;
                } else {
                    new gc(fe0Var4.Z, null).H(2131624011, org.telegram.messenger.id.M0(2131743879, null));
                    return;
                }
            case 18:
                org.telegram.ui.mg0 mg0Var = (org.telegram.ui.mg0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                mg.b bVar = (mg.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                mg0Var.D = true;
                if (tL_error12 == null && bVar != null) {
                    mg0Var.f47966w.l(str15, bVar);
                    org.telegram.ui.q41 q41Var = mg0Var.f47964r;
                    q41Var.f48951e = bVar;
                    q41Var.f48950c = tL_loadAsyncGraph.f27193x;
                    mg0Var.m0();
                    return;
                }
                mg0Var.m0();
                return;
            case 19:
                org.telegram.ui.dh0 dh0Var = (org.telegram.ui.dh0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj4;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj3;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = dh0Var.F1;
                dh0Var.A1 = false;
                if (tL_contacts_importedContacts != null) {
                    if (!tL_contacts_importedContacts.users.isEmpty()) {
                        org.telegram.messenger.qp.s1(dh0Var.f28669a).Y3(tL_contacts_importedContacts.users, false);
                        org.telegram.messenger.qp.s1(dh0Var.f28669a).z3(tL_contacts_importedContacts.users.get(0), null, f2Var2, 1);
                        dh0Var.dismiss();
                        return;
                    } else if (f2Var2.getParentActivity() != null) {
                        org.telegram.messenger.g0.Z3(dh0Var.Q1, true, 0.5f, true, true);
                        org.telegram.messenger.g0.Z3(dh0Var.R1, false, 0.5f, true, true);
                        u4.u(f2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.messenger.g0.Z3(dh0Var.Q1, true, 0.5f, true, true);
                org.telegram.messenger.g0.Z3(dh0Var.R1, false, 0.5f, true, true);
                u4.c0(dh0Var.f28669a, tL_error13, f2Var2, tL_contacts_importContacts, new Object[0]);
                return;
            case 20:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) obj3;
                m4.d0 d0Var = (m4.d0) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.ek0 ek0Var = ((org.telegram.ui.nj0) obj5).f48219a;
                if (tL_error14 == null) {
                    ((org.telegram.ui.jj0) ek0Var.B1).c(ek0Var.E, (String) ek0Var.f45357s1.get("email"), null, null, null, null, null, null, null, null, hf0Var, d0Var);
                    return;
                }
                u4.c0(org.telegram.ui.ek0.M0(ek0Var), tL_error14, ek0Var, verifyemail2, new Object[0]);
                d0Var.a(null, null);
                return;
            case 21:
                org.telegram.ui.ak0 ak0Var = (org.telegram.ui.ak0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ek0 ek0Var2 = ak0Var.Q;
                ak0Var.J = false;
                if (tL_error15 == null) {
                    ek0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    org.telegram.ui.ActionBar.u1 c02 = u4.c0(org.telegram.ui.ek0.n0(ek0Var2), tL_error15, ek0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.m0 = new org.telegram.ui.wj0(ak0Var, 0);
                    }
                }
                ek0Var2.B1();
                return;
            case 22:
                org.telegram.ui.kl0.k0((org.telegram.ui.kl0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.xq0 xq0Var2 = (org.telegram.ui.xq0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.cq0) obj5).f44778r;
                photoViewer.o4 = null;
                org.telegram.ui.sq0 sq0Var = photoViewer.f41382e0;
                if (sq0Var != null && photoViewer.f41401g0 != null) {
                    sq0Var.setLayerType(0, null);
                    photoViewer.f41454m4 = 0;
                    photoViewer.D1();
                    photoViewer.f41463n4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.f20969a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.f20969a = false;
                    photoViewer.A2();
                    photoViewer.w2();
                    photoViewer.f41382e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.zq0 zq0Var = photoViewer.f41480p4;
                    if (zq0Var != null) {
                        zq0Var.f52503a.O0(true, true);
                    }
                    org.telegram.ui.zq0 zq0Var2 = photoViewer.f41489q4;
                    if (zq0Var2 != null && !zq0Var2.f52519s) {
                        zq0Var2.f52503a.O0(false, true);
                    }
                    if (arrayList7 != null && (i14 = photoViewer.f41366c2) != 3 && i14 != 1 && ((xq0Var = photoViewer.d) == null || !xq0Var.P())) {
                        photoViewer.Q1();
                    }
                    t51 t51Var = photoViewer.F2;
                    if (t51Var != null && t51Var.d0() && photoViewer.f41496r1 && !photoViewer.f41399f7.isEmpty()) {
                        PhotoViewer.R(photoViewer, photoViewer.F2.S());
                        PhotoViewer.Q(photoViewer, true);
                    }
                    if (photoViewer.f41509s4) {
                        PhotoViewer.S(photoViewer, num.intValue());
                    }
                    if (xq0Var2 != null) {
                        xq0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 24:
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
                    long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j3 > 0) {
                        globalPrivacySettings.flags = i19 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j3;
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
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.mt0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    bc Q = gc.a0(privacyControlActivity2).Q(2131623989, 36, org.telegram.messenger.id.M0(2131746856, null));
                    Q.f32203j = 5000;
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
                        h6Var = ((org.telegram.ui.ActionBar.f2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, h6Var);
                        String M0 = org.telegram.messenger.id.M0(2131746852, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                        u1Var2.R = M0;
                        u1Var2.T = org.telegram.messenger.id.M0(2131746853, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                        privacyControlActivity2.showDialog(u1Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743879, gc.a0(privacyControlActivity2), 2131624011, 36);
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) obj;
                RectF rectF = ProfileActivity.V6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    xt0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41867z0);
                String M02 = org.telegram.messenger.id.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                u1Var3.R = M02;
                u1Var3.T = org.telegram.messenger.id.a0(null, null, 2131754350, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131747831, null), new org.telegram.ui.oi0(xt0Var, 10));
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                profileActivity.showDialog(u1Var3);
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.nv0 nv0Var = (org.telegram.ui.nv0) obj2;
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject14;
                    if (profileActivity2.f41714d1 != 0) {
                        profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.f41714d1));
                    } else {
                        profileActivity2.getMessagesController().M0(Long.valueOf(profileActivity2.f41721e1));
                    }
                    String str16 = "@" + tL_username.username;
                    String format = org.telegram.messenger.id.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    gc gcVar = new gc(nv0Var.f36057w1, profileActivity2.f41867z0);
                    if (TextUtils.isEmpty(f11)) {
                        p10 = "";
                    } else {
                        p10 = a8.p0.p("(", f11, ")");
                    }
                    bc w10 = gcVar.w(2131231182, org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750519, str16, format, f10, p10)), new org.telegram.ui.tn0(19, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.ik0 ik0Var = new org.telegram.ui.ik0(5, profileActivity2, tL_collectibleInfo);
                    fb fbVar = w10.f32199e;
                    if (fbVar != null) {
                        fbVar.setOnClickListener(ik0Var);
                    }
                    w10.k(false);
                    return;
                }
                RectF rectF2 = ProfileActivity.V6;
                gc.d0(tL_error17);
                return;
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject15 = (TLObject) obj4;
                String str17 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error18 = (TLRPC.TL_error) obj;
                RectF rectF3 = ProfileActivity.V6;
                if (tLObject15 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.k00.a(profileActivity3.getParentActivity(), 1, str17, user3, (TL_fragment.TL_collectibleInfo) tLObject15, profileActivity3.f41867z0);
                    return;
                } else {
                    gc.d0(tL_error18);
                    return;
                }
            default:
                ProfileActivity.o0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public n10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f36190a = i7;
        this.f36191b = obj;
        this.f36192c = obj2;
        this.d = obj3;
        this.f36193e = obj4;
        this.f36194f = obj5;
    }
}
