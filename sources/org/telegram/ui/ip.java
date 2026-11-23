package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ClippingImageView;
public final class ip implements Runnable {
    public final int f48809a;
    public final Object f48810b;
    public final Object f48811c;
    public final Object d;
    public final Object f48812e;
    public final Object f48813f;

    public ip(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i7) {
        this.f48809a = i7;
        this.f48810b = callback;
        this.d = tLObject;
        this.f48812e = obj;
        this.f48811c = tL_error;
        this.f48813f = tLObject2;
    }

    @Override
    public final void run() {
        String str;
        boolean z10;
        TLRPC.GroupCall groupCall;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7;
        TLRPC.ThemeSettings themeSettings;
        TLRPC.TL_wallPaper tL_wallPaper;
        ml0 ml0Var;
        org.telegram.ui.Components.lc d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        vq0 vq0Var;
        String str2;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i15 = this.f48809a;
        int i16 = 0;
        Object obj = this.f48813f;
        Object obj2 = this.f48812e;
        Object obj3 = this.d;
        Object obj4 = this.f48811c;
        Object obj5 = this.f48810b;
        switch (i15) {
            case 0:
                np.d0((np) obj5, (TLRPC.TL_error) obj4, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj);
                return;
            case 1:
                qq qqVar = (qq) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                jg.z1 z1Var = qqVar.h;
                rq rqVar = qqVar.E;
                if (rqVar.f51757o1) {
                    qqVar.f51259s = false;
                    qqVar.d = arrayList;
                    qqVar.f51255e = hVar;
                    qqVar.f51256f = arrayList2;
                    z1Var.f(arrayList, null);
                    if (!org.telegram.messenger.v3.T(rqVar.f51754n)) {
                        ArrayList arrayList4 = z1Var.f17726g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i17 = qqVar.f51258r;
                    qqVar.f();
                    if (qqVar.f51258r > i17) {
                        rqVar.D0(i17);
                    }
                    if (!z1Var.e() && qqVar.f51258r == 0) {
                        rqVar.f51728b.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.qf qfVar = (org.telegram.ui.Components.qf) obj5;
                ji.o oVar = (ji.o) obj4;
                ji.g gVar = (ji.g) obj2;
                ji.q qVar = (ji.q) obj;
                ChatActivityEnterView chatActivityEnterView = qfVar.f38848a;
                org.telegram.ui.Components.pe0 a82 = chatActivityEnterView.F3.a8(oVar, (org.telegram.ui.Components.pf) obj3);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(oVar);
                    return;
                }
                int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.E8);
                ArrayList J = chatActivityEnterView.A0().J();
                int size = J.size();
                while (i16 < size) {
                    Object obj6 = J.get(i16);
                    i16++;
                    ai.c cVar = (ai.c) obj6;
                    a82.c(new ai.j0(chatActivityEnterView.getContext(), cVar, G0, chatActivityEnterView.R, false), 48, new ci(27, gVar, cVar));
                }
                a82.J = new ci(28, qfVar, oVar);
                chatActivityEnterView.f32687t1 = true;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                }
                Objects.requireNonNull(qVar);
                a82.K = new org.telegram.ui.Components.z2(qVar, 2);
                int[] iArr = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr);
                a82.F = iArr[1];
                a82.H = org.telegram.messenger.g0.L(316);
                a82.i();
                return;
            case 3:
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
            case 4:
                org.telegram.ui.Components.kw0 kw0Var = (org.telegram.ui.Components.kw0) obj5;
                String str3 = (String) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                kw0Var.f36970k2 = 0;
                String str4 = kw0Var.f36969j2;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(org.telegram.messenger.hd.N0(2131749042, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29701w6, kw0Var.J0);
                        kw0Var.f36971l2 = true;
                        return;
                    }
                    textView.setText(org.telegram.messenger.hd.N0(2131749037, null));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29568p7, kw0Var.J0);
                    kw0Var.f36971l2 = false;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.vw0 vw0Var = (org.telegram.ui.Components.vw0) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(T).I(2131624034, org.telegram.messenger.hd.N0(2131746662, null), org.telegram.messenger.hd.N0(2131746661, null));
                        I.f35489j = 5000;
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
                        org.telegram.messenger.ur.a0(vw0Var.f41540a).j2(userFull, false);
                    }
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vw0Var.f41541b.getContext());
                        alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131746658, null);
                        alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131746659, null);
                        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.f3.n(null, 2131743636, org.telegram.ui.Components.lc.b0(T), 2131624012, 36);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.a21 a21Var = (org.telegram.ui.Components.a21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                org.telegram.ui.Components.a70 a70Var = (org.telegram.ui.Components.a70) obj2;
                org.telegram.ui.Components.a70 a70Var2 = (org.telegram.ui.Components.a70) obj;
                bn bnVar = a21Var.f33265s;
                if (((org.telegram.messenger.np) obj4).u2(a21Var.f33255f, tL_forumTopic.f28450id, null)) {
                    a70Var.v();
                    org.telegram.messenger.ys.t(a21Var.f33253e).G(a21Var.f33255f, tL_forumTopic.f28450id, false);
                    if (org.telegram.ui.Components.lc.a(bnVar)) {
                        org.telegram.ui.Components.lc.z(bnVar, 4, 0, a21Var.h).j();
                        return;
                    }
                    return;
                }
                a70Var.L(a70Var2);
                return;
            case 7:
                ns nsVar = (ns) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = tL_messages_myStickers.sets;
                    int size2 = arrayList6.size();
                    while (i16 < size2) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i16);
                        i16++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f28418id = stickerSetCovered2.set.f28425id;
                            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(nsVar.f50308r).o0(tL_inputStickerSetID, true);
                            if (o02 == null || o02.documents.size() < 120) {
                                arrayList5.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i5.c.h(1, tL_messages_myStickers.sets)).set.f28425id;
                        ConnectionsManager.getInstance(nsVar.f50308r).sendRequest(tL_messages_getMyStickers, new z9(nsVar, arrayList5, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                cx.l0((cx) obj5, (TLObject) obj3, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj4);
                return;
            case 9:
                f40 f40Var = (f40) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                f40Var.getClass();
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = f40Var.getContext();
                    int i18 = f40Var.f30139a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str5 = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    org.telegram.ui.ActionBar.h6 h6Var2 = f40Var.J0;
                    org.telegram.messenger.t3 t3Var = f40Var.V2;
                    if (t3Var != null && (groupCall = t3Var.f26914b) != null && groupCall.creator) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i9.n0(context, i18, inputGroupCall, str5, h6Var2, false, z10);
                    return;
                } else if (tL_error3 != null) {
                    new org.telegram.ui.Components.lc(f40Var.F, new fi.h0()).g0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 10:
                f40 f40Var2 = (f40) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str6 = (String) obj;
                f40Var2.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    ug.k0 k0Var = new ug.k0(34, f40Var2.f30139a, T2.getContext(), T2, new fi.h0());
                    k0Var.D1(null, arrayList7, arrayList8, arrayList9, str6);
                    k0Var.show();
                    return;
                }
                return;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                o60 o60Var = (o60) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                String str7 = LaunchActivity.C1;
                try {
                    o60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject5 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject5;
                    if (tL_wallPaper3.pattern) {
                        String str8 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        rc1 rc1Var = new rc1(str8, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        rc1Var.f51582g = tL_wallPaper3;
                        tL_wallPaper3 = rc1Var;
                    }
                    x71 x71Var = new x71(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z11 = wallPaperSettings3.blur;
                    boolean z12 = wallPaperSettings3.motion;
                    x71Var.H1 = z11;
                    x71Var.G1 = z12;
                    x71Var.f53682p1 = wallPaperSettings3.intensity;
                    launchActivity.t0(x71Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(tL_error4.text);
                launchActivity.F0(org.telegram.ui.Components.c5.K(launchActivity, null, sb2.toString()));
                return;
            case 12:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                cx cxVar = (cx) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str9 = (String) obj;
                ArrayList arrayList10 = launchActivity2.D0;
                if (cxVar != null) {
                    if (g2Var != null) {
                        g2Var.dismissCurrentDialog();
                    }
                    while (i16 < arrayList10.size()) {
                        if (((Dialog) arrayList10.get(i16)).isShowing()) {
                            ((Dialog) arrayList10.get(i16)).dismiss();
                        }
                        i16++;
                    }
                    arrayList10.clear();
                    launchActivity2.t0(cxVar);
                    return;
                } else if (g2Var instanceof bn) {
                    ((bn) g2Var).za(user.f28547id, str9, true);
                    return;
                } else {
                    return;
                }
            case 13:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj2;
                String str10 = (String) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.TL_urlAuthResultRequest) {
                        gi0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        gi0.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject6, null, null, null, false, null);
                        return;
                    } else if (tLObject6 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.c5.n0(T3, str10, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error5 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error5.text)) {
                        gi0.a().I(2131624012, org.telegram.messenger.hd.N0(2131753125, null), org.telegram.messenger.hd.N0(2131753126, null)).j();
                        return;
                    } else {
                        gi0.a().g0(tL_error5, false);
                        return;
                    }
                } else {
                    return;
                }
            case 14:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject7 = (TLObject) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                o60 o60Var2 = (o60) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                String str11 = LaunchActivity.C1;
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
                                org.telegram.messenger.w7.G(launchActivity4.P);
                                if (!org.telegram.messenger.w7.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.V0 = t1Var;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = Q0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper4;
                                    launchActivity4.Q0 = org.telegram.messenger.w7.r(null, tL_wallPaper4.document);
                                    org.telegram.messenger.w7.G(launchActivity4.P).W(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                o60Var2.run();
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
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = org.telegram.messenger.w7.r(null, document);
                            launchActivity4.V0 = t1Var;
                            org.telegram.messenger.w7.G(launchActivity4.P).W(launchActivity4.T0.document, tL_theme, 1, 1);
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
                        o60Var2.run();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    if (i7 == 1) {
                        launchActivity4.F0(org.telegram.ui.Components.c5.K(launchActivity4, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131743932, null)));
                        return;
                    } else {
                        launchActivity4.F0(org.telegram.ui.Components.c5.K(launchActivity4, org.telegram.messenger.hd.N0(2131743949, null), org.telegram.messenger.hd.N0(2131743933, null)));
                        return;
                    }
                }
                return;
            case 15:
                s90 s90Var = (s90) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str12 = (String) obj;
                int i19 = s90Var.f51948b;
                LaunchActivity launchActivity5 = s90Var.f51947a;
                if (tL_error7 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error7.text)) {
                        d = s90.d();
                        i10 = 2131747201;
                    } else {
                        d = s90.d();
                        i10 = 2131747202;
                    }
                    org.telegram.messenger.f3.o(null, i10, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject8 instanceof TLRPC.TL_payments_paymentFormStars) {
                        bi.t8 t8Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        di.y8.y(i19, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject8, new o90(s90Var, 1), new m70(t8Var, 1));
                        return;
                    }
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        org.telegram.messenger.np.u1(i19).f4(paymentForm.users, false);
                        ml0Var = new ml0(paymentForm, null, str12, LaunchActivity.T());
                    } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                        ml0Var = new ml0((TLRPC.PaymentReceipt) tLObject8);
                    } else {
                        ml0Var = null;
                    }
                    if (ml0Var != null) {
                        bi.t8 t8Var2 = launchActivity5.Y0;
                        if (t8Var2 != null) {
                            launchActivity5.Y0 = null;
                            ml0Var.f49869a1 = new ve(10, t8Var2);
                        }
                        s90Var.u(ml0Var, false);
                    }
                }
                s90Var.c();
                return;
            case 16:
                de0.b0((de0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 17:
                TLObject tLObject9 = (TLObject) obj3;
                Bundle bundle = (Bundle) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                de0 de0Var = ((pb0) obj5).f50807a0;
                if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                    de0Var.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject9, true);
                    return;
                } else if (tL_error8 != null && tL_error8.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    org.telegram.ui.Components.c5.c0(i11, tL_error8, de0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 18:
                sc0 sc0Var = (sc0) obj5;
                TLObject tLObject10 = (TLObject) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj4;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                de0 de0Var2 = sc0Var.F;
                de0Var2.C1(false, true);
                sc0Var.f51984r = false;
                if (tLObject10 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    de0Var2.M1(13, true, bundle2, false);
                    return;
                }
                String str13 = tL_error9.text;
                if (str13 != null) {
                    if (str13.contains("EMAIL_INVALID")) {
                        sc0Var.n();
                        return;
                    } else if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751188, null));
                        return;
                    } else if (tL_error9.text.contains("PHONE_PASSWORD_FLOOD")) {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                        return;
                    } else if (tL_error9.text.contains("PHONE_NUMBER_FLOOD")) {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131747092, "PhoneNumberFlood"));
                        return;
                    } else if (!tL_error9.text.contains("PHONE_CODE_EMPTY") && !tL_error9.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error9.text.contains("PHONE_CODE_EXPIRED")) {
                            de0Var2.M1(0, true, null, true);
                            de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                            return;
                        } else if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                            de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                            return;
                        } else if (tL_error9.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                            org.telegram.ui.Components.c5.c0(i12, tL_error9, de0Var2, sendverifyemailcode, sc0Var.f51987x);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, "InvalidCode"));
                        return;
                    }
                }
                return;
            case 19:
                TLObject tLObject11 = (TLObject) obj3;
                Bundle bundle3 = (Bundle) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                de0 de0Var3 = ((sc0) obj5).F;
                if ((tLObject11 instanceof TL_account.TL_emailVerified) && de0Var3.G == 3) {
                    de0Var3.finishFragment();
                    de0Var3.f46894e0.run();
                    return;
                } else if (tLObject11 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject11;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    de0Var3.y1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error10 != null) {
                    if (tL_error10.text.contains("EMAIL_NOT_ALLOWED")) {
                        de0Var3.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751188, null));
                        return;
                    } else if (tL_error10.text.contains("EMAIL_TOKEN_INVALID")) {
                        de0Var3.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751185, null));
                        return;
                    } else if (tL_error10.code != -1000) {
                        i13 = ((org.telegram.ui.ActionBar.g2) de0Var3).currentAccount;
                        org.telegram.ui.Components.c5.c0(i13, tL_error10, de0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 20:
                final ld0 ld0Var = (ld0) obj5;
                TLObject tLObject12 = (TLObject) obj3;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj2;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                de0 de0Var4 = ld0Var.f49577w;
                ld0Var.f49570b.setLoading(false);
                if (tLObject12 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject12;
                    de0Var4.getMessagesController().f4(paymentForm2.users, false);
                    ml0 ml0Var2 = new ml0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, de0Var4, true);
                    ml0Var2.W0 = true;
                    ml0Var2.f49877d1 = new org.telegram.messenger.y10() {
                        @Override
                        public final void a(Object obj7) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj7;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var3 = ld0Var2;
                                                    if (!ld0Var3.f49573f) {
                                                        ld0Var3.f49573f = true;
                                                        ld0Var3.h = str14;
                                                        ld0Var3.f49574n = str15;
                                                        ld0Var3.f49575r = j3;
                                                        ld0Var3.f49570b.setLoading(true);
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
                                                    if (!ld0Var4.f49573f) {
                                                        ld0Var4.f49573f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f49574n = str17;
                                                        ld0Var4.f49575r = j10;
                                                        ld0Var4.f49570b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj7;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f49573f) {
                                                        ld0Var32.f49573f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.f49574n = str15;
                                                        ld0Var32.f49575r = j3;
                                                        ld0Var32.f49570b.setLoading(true);
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
                                                    if (!ld0Var4.f49573f) {
                                                        ld0Var4.f49573f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f49574n = str17;
                                                        ld0Var4.f49575r = j10;
                                                        ld0Var4.f49570b.setLoading(true);
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
                    ml0Var2.f49880e1 = new org.telegram.messenger.y10() {
                        @Override
                        public final void a(Object obj7) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj7;
                                    final ld0 ld0Var2 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    ld0 ld0Var32 = ld0Var2;
                                                    if (!ld0Var32.f49573f) {
                                                        ld0Var32.f49573f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.f49574n = str15;
                                                        ld0Var32.f49575r = j3;
                                                        ld0Var32.f49570b.setLoading(true);
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
                                                    if (!ld0Var4.f49573f) {
                                                        ld0Var4.f49573f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f49574n = str17;
                                                        ld0Var4.f49575r = j10;
                                                        ld0Var4.f49570b.setLoading(true);
                                                        ld0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj7;
                                    final ld0 ld0Var3 = ld0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str14 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str15 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    ld0 ld0Var32 = ld0Var3;
                                                    if (!ld0Var32.f49573f) {
                                                        ld0Var32.f49573f = true;
                                                        ld0Var32.h = str14;
                                                        ld0Var32.f49574n = str15;
                                                        ld0Var32.f49575r = j3;
                                                        ld0Var32.f49570b.setLoading(true);
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
                                                    if (!ld0Var4.f49573f) {
                                                        ld0Var4.f49573f = true;
                                                        ld0Var4.h = str16;
                                                        ld0Var4.f49574n = str17;
                                                        ld0Var4.f49575r = j10;
                                                        ld0Var4.f49570b.setLoading(true);
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
                    ml0Var2.f49883f1 = new o00(ld0Var, 1);
                    de0Var4.presentFragment(ml0Var2);
                    return;
                } else if (tL_error11 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error11.text)) {
                        org.telegram.messenger.g0.g3(new hd0(ld0Var, 2));
                        return;
                    }
                    String str14 = tL_error11.text;
                    ld0Var.f49572e = str14;
                    new org.telegram.ui.Components.lc(de0Var4.f46887a0, null).H(2131624012, org.telegram.messenger.hd.a0(null, null, 2131743635, str14));
                    return;
                } else {
                    new org.telegram.ui.Components.lc(de0Var4.f46887a0, null).H(2131624012, org.telegram.messenger.hd.N0(2131743636, null));
                    return;
                }
            case 21:
                og0 og0Var = (og0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                mg.b bVar = (mg.b) obj3;
                String str15 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                og0Var.E = true;
                if (tL_error12 == null && bVar != null) {
                    og0Var.f50579w.l(str15, bVar);
                    o41 o41Var = og0Var.f50577r;
                    o41Var.f50464e = bVar;
                    o41Var.f50463c = tL_loadAsyncGraph.f28631x;
                    og0Var.m0();
                    return;
                }
                og0Var.m0();
                return;
            case 22:
                fh0 fh0Var = (fh0) obj5;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) obj3;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) obj;
                org.telegram.ui.ActionBar.g2 g2Var2 = fh0Var.G1;
                fh0Var.B1 = false;
                if (tL_contacts_importedContacts != null) {
                    if (!tL_contacts_importedContacts.users.isEmpty()) {
                        org.telegram.messenger.np.u1(fh0Var.f30139a).f4(tL_contacts_importedContacts.users, false);
                        org.telegram.messenger.np.u1(fh0Var.f30139a).G3(tL_contacts_importedContacts.users.get(0), null, g2Var2, 1);
                        fh0Var.dismiss();
                        return;
                    } else if (g2Var2.getParentActivity() != null) {
                        org.telegram.messenger.g0.X3(fh0Var.R1, true, 0.5f, true, true);
                        org.telegram.messenger.g0.X3(fh0Var.S1, false, 0.5f, true, true);
                        org.telegram.ui.Components.c5.u(g2Var2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.messenger.g0.X3(fh0Var.R1, true, 0.5f, true, true);
                org.telegram.messenger.g0.X3(fh0Var.S1, false, 0.5f, true, true);
                org.telegram.ui.Components.c5.c0(fh0Var.f30139a, tL_error13, g2Var2, tL_contacts_importContacts, new Object[0]);
                return;
            case 23:
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj4;
                hf0 hf0Var = (hf0) obj3;
                k8.a aVar = (k8.a) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                hk0 hk0Var = ((qj0) obj5).f51228a;
                if (tL_error14 == null) {
                    ((mj0) hk0Var.C1).c(hk0Var.F, (String) hk0Var.f48424t1.get("email"), null, null, null, null, null, null, null, null, hf0Var, aVar);
                    return;
                }
                org.telegram.ui.Components.c5.c0(hk0.M0(hk0Var), tL_error14, hk0Var, verifyemail2, new Object[0]);
                aVar.d(null, null);
                return;
            case 24:
                dk0 dk0Var = (dk0) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject13 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                hk0 hk0Var2 = dk0Var.R;
                dk0Var.K = false;
                if (tL_error15 == null) {
                    hk0Var2.p1(bundle4, (TLRPC.TL_auth_sentCode) tLObject13, true);
                } else {
                    org.telegram.ui.ActionBar.t1 c02 = org.telegram.ui.Components.c5.c0(hk0.n0(hk0Var2), tL_error15, hk0Var2, tL_auth_resendCode2, new Object[0]);
                    if (c02 != null && tL_error15.text.contains("PHONE_CODE_EXPIRED")) {
                        c02.f30004n0 = new zj0(dk0Var, 0);
                    }
                }
                hk0Var2.B1();
                return;
            case 25:
                ml0.k0((ml0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 26:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList11 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                vq0 vq0Var2 = (vq0) obj;
                PhotoViewer photoViewer = ((bq0) obj5).f46270r;
                photoViewer.f43306p4 = null;
                rq0 rq0Var = photoViewer.f43218f0;
                if (rq0Var != null && photoViewer.f43236h0 != null) {
                    rq0Var.setLayerType(0, null);
                    photoViewer.f43289n4 = 0;
                    photoViewer.D1();
                    photoViewer.o4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.f21844a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.f21844a = false;
                    photoViewer.B2();
                    photoViewer.x2();
                    photoViewer.f43218f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    xq0 xq0Var = photoViewer.f43315q4;
                    if (xq0Var != null) {
                        xq0Var.f53898a.O0(true, true);
                    }
                    xq0 xq0Var2 = photoViewer.f43325r4;
                    if (xq0Var2 != null && !xq0Var2.f53914s) {
                        xq0Var2.f53898a.O0(false, true);
                    }
                    if (arrayList11 != null && (i14 = photoViewer.d2) != 3 && i14 != 1 && ((vq0Var = photoViewer.d) == null || !vq0Var.P())) {
                        photoViewer.Q1();
                    }
                    org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
                    if (i61Var != null && i61Var.d0() && photoViewer.f43332s1 && !photoViewer.f43234g7.isEmpty()) {
                        PhotoViewer.S(photoViewer, photoViewer.G2.S());
                        PhotoViewer.R(photoViewer, true);
                    }
                    if (photoViewer.f43343t4) {
                        PhotoViewer.T(photoViewer, num.intValue());
                    }
                    if (vq0Var2 != null) {
                        vq0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 27:
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
                    int i20 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i20;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j3 > 0) {
                        globalPrivacySettings.flags = i20 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j3;
                    } else {
                        globalPrivacySettings.flags = i20 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.I0();
                }
                privacyControlActivity.getNotificationCenter().k(47, new Object[0]);
                return;
            case 28:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj4;
                PrivacyControlActivity privacyControlActivity2 = ((lt0) obj5).d;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(privacyControlActivity2).Q(2131623990, 36, org.telegram.messenger.hd.N0(2131746662, null));
                    Q.f35489j = 5000;
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
                        h6Var = ((org.telegram.ui.ActionBar.g2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, h6Var);
                        String N0 = org.telegram.messenger.hd.N0(2131746658, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                        t1Var2.S = N0;
                        t1Var2.U = org.telegram.messenger.hd.N0(2131746659, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                        privacyControlActivity2.showDialog(t1Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.f3.n(null, 2131743636, org.telegram.ui.Components.lc.b0(privacyControlActivity2), 2131624012, 36);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                vt0 vt0Var = (vt0) obj;
                RectF rectF = ProfileActivity.Z6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vt0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String N02 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28743a;
                t1Var3.S = N02;
                t1Var3.U = org.telegram.messenger.hd.a0(null, null, 2131754347, org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name));
                alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131747637, null), new qi0(vt0Var, 10));
                alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                profileActivity.showDialog(t1Var3);
                return;
        }
    }

    public ip(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f48809a = i7;
        this.f48810b = obj;
        this.f48811c = obj2;
        this.d = obj3;
        this.f48812e = obj4;
        this.f48813f = obj5;
    }

    public ip(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i7) {
        this.f48809a = i7;
        this.f48810b = obj;
        this.d = obj2;
        this.f48812e = obj3;
        this.f48813f = obj4;
        this.f48811c = tL_error;
    }

    public ip(org.telegram.ui.Components.kw0 kw0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        this.f48809a = 4;
        this.f48810b = kw0Var;
        this.d = str;
        this.f48811c = tL_error;
        this.f48812e = tLObject;
        this.f48813f = textView;
    }
}
