package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;
public final class hr implements Runnable {
    public final int f38899a;
    public final Object f38900b;
    public final Object f38901c;
    public final Object d;
    public final Object f38902e;
    public final Object f38903f;

    public hr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f38899a = i9;
        this.f38900b = obj;
        this.f38901c = obj2;
        this.d = obj3;
        this.f38902e = obj4;
        this.f38903f = obj5;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i9;
        TLRPC.ThemeSettings themeSettings;
        co0 co0Var;
        org.telegram.ui.Components.oc b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zt0 zt0Var;
        String str2;
        org.telegram.ui.ActionBar.b6 b6Var;
        String o6;
        int i17 = this.f38899a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i18 = 0;
        Object obj = this.f38903f;
        Object obj2 = this.f38902e;
        Object obj3 = this.d;
        Object obj4 = this.f38901c;
        Object obj5 = this.f38900b;
        switch (i17) {
            case 0:
                ir irVar = (ir) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                of.v1 v1Var = irVar.h;
                jr jrVar = irVar.f39264y;
                if (jrVar.f39583k1) {
                    irVar.f39261s = false;
                    irVar.d = arrayList;
                    irVar.f39257e = hVar;
                    irVar.f39258f = arrayList2;
                    v1Var.f(arrayList, null);
                    if (!ChatObject.isChannel(jrVar.f39595r)) {
                        ArrayList arrayList4 = v1Var.f19529g;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                    }
                    int i19 = irVar.f39260r;
                    irVar.l();
                    if (irVar.f39260r > i19) {
                        jrVar.x0(i19);
                    }
                    if (!v1Var.e() && irVar.f39260r == 0) {
                        jrVar.f39560b.e(false, true);
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
                org.telegram.ui.Components.cx0 cx0Var = (org.telegram.ui.Components.cx0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                cx0Var.f27585l0 = 0;
                String str4 = cx0Var.f27584k0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23334w6));
                        cx0Var.m0 = true;
                        return;
                    }
                    textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                    textView.setTextColor(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                    cx0Var.m0 = false;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ox0 ox0Var = (org.telegram.ui.Components.ox0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.f28737j = 5000;
                        M.j();
                        return;
                    }
                    if (userFull != null) {
                        if (tL_birthday == null) {
                            userFull.flags2 &= -33;
                        } else {
                            userFull.flags2 |= 32;
                        }
                        userFull.birthday = tL_birthday;
                        MessagesStorage.getInstance(ox0Var.f31461a).updateUserInfo(userFull, false);
                    }
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ox0Var.f31462b.getContext());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.l0.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(U), R.raw.error, 36);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.b21 b21Var = (org.telegram.ui.Components.b21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) obj2;
                org.telegram.ui.Components.x60 x60Var2 = (org.telegram.ui.Components.x60) obj;
                qn qnVar = b21Var.h;
                if (((MessagesController) obj4).isDialogMuted(b21Var.f27002c, tL_forumTopic.f22432id)) {
                    x60Var.u();
                    NotificationsController.getInstance(b21Var.f27001b).muteDialog(b21Var.f27002c, tL_forumTopic.f22432id, false);
                    if (org.telegram.ui.Components.oc.a(qnVar)) {
                        org.telegram.ui.Components.oc.z(qnVar, 4, 0, b21Var.d).j();
                        return;
                    }
                    return;
                }
                x60Var.K(x60Var2);
                return;
            case 5:
                ht htVar = (ht) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList5 = (ArrayList) obj4;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = tL_messages_myStickers.sets;
                    int size = arrayList6.size();
                    while (i18 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i18);
                        i18++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f22400id = stickerSetCovered2.set.f22407id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(htVar.f38929r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList5.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) j3.r0.j(1, tL_messages_myStickers.sets)).set.f22407id;
                        ConnectionsManager.getInstance(htVar.f38929r).sendRequest(tL_messages_getMyStickers, new y9(htVar, arrayList5, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                dy.H0((dy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                o50.A((o50) obj5, (org.telegram.ui.ActionBar.c2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                return;
            case 8:
                o50.x((o50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                x20 x20Var = (x20) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject4;
                    if (tL_wallPaper3.pattern) {
                        String str5 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        xh1 xh1Var = new xh1(str5, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        xh1Var.f44525g = tL_wallPaper3;
                        tL_wallPaper3 = xh1Var;
                    }
                    oc1 oc1Var = new oc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    oc1Var.B1 = z10;
                    oc1Var.A1 = z11;
                    oc1Var.f41085j1 = wallPaperSettings3.intensity;
                    launchActivity.p0(oc1Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error3.text);
                launchActivity.B0(org.telegram.ui.Components.y4.N(launchActivity, null, sb2.toString()));
                return;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                dy dyVar = (dy) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList7 = launchActivity2.A0;
                if (dyVar != null) {
                    if (o2Var != null) {
                        o2Var.dismissCurrentDialog();
                    }
                    while (i18 < arrayList7.size()) {
                        if (((Dialog) arrayList7.get(i18)).isShowing()) {
                            ((Dialog) arrayList7.get(i18)).dismiss();
                        }
                        i18++;
                    }
                    arrayList7.clear();
                    launchActivity2.p0(dyVar);
                    return;
                } else if (o2Var instanceof qn) {
                    ((qn) o2Var).W9(user.f22527id, str6, true);
                    return;
                } else {
                    return;
                }
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (tLObject5 != null) {
                    if (tLObject5 instanceof TLRPC.TL_urlAuthResultRequest) {
                        tk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject5, null, null, null, false, null);
                        return;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        tk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject5, null, null, null, false, null);
                        return;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.y4.q0(U2, str7, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        tk0.a().M(launchActivity3.getString(R.string.BotAuthLoggedInFailTitle), launchActivity3.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        return;
                    } else {
                        tk0.a().d0(tL_error4, false);
                        return;
                    }
                } else {
                    return;
                }
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                x20 x20Var2 = (x20) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.f35493x1;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject6;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.e6 N0 = org.telegram.ui.ActionBar.f6.N0(org.telegram.ui.ActionBar.f6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.K).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.R0 = c2Var;
                                    launchActivity4.Q0 = true;
                                    launchActivity4.O0 = N0;
                                    launchActivity4.P0 = tL_theme;
                                    launchActivity4.N0 = tL_wallPaper;
                                    launchActivity4.M0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.K).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    return;
                                }
                            }
                            try {
                                x20Var2.run();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                        } else {
                            i18 = 1;
                        }
                        i9 = i18;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.Q0 = false;
                            launchActivity4.P0 = tL_theme;
                            launchActivity4.L0 = FileLoader.getAttachFileName(document);
                            launchActivity4.R0 = c2Var;
                            FileLoader.getInstance(launchActivity4.K).loadFile(launchActivity4.P0.document, tL_theme, 1, 1);
                            i9 = 0;
                        }
                        i9 = 1;
                    }
                } else {
                    if (tL_error5 == null || !"THEME_FORMAT_INVALID".equals(tL_error5.text)) {
                        i9 = 2;
                    }
                    i9 = 1;
                }
                if (i9 != 0) {
                    try {
                        x20Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (i9 == 1) {
                        launchActivity4.B0(org.telegram.ui.Components.y4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.B0(org.telegram.ui.Components.y4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 13:
                kb0 kb0Var = (kb0) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str8 = (String) obj;
                int i20 = kb0Var.f39791b;
                LaunchActivity launchActivity5 = kb0Var.f39790a;
                if (tL_error6 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error6.text)) {
                        b10 = kb0.b();
                        i10 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = kb0.b();
                        i10 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.ll.p(i10, b10, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        fh.j6 j6Var = launchActivity5.U0;
                        launchActivity5.U0 = null;
                        gh.v7.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new db0(kb0Var, 1), new o80(j6Var, 1));
                        return;
                    }
                    if (tLObject7 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                        MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                        co0Var = new co0(paymentForm, null, str8, LaunchActivity.U());
                    } else if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                        co0Var = new co0((TLRPC.PaymentReceipt) tLObject7);
                    } else {
                        co0Var = null;
                    }
                    if (co0Var != null) {
                        fh.j6 j6Var2 = launchActivity5.U0;
                        if (j6Var2 != null) {
                            launchActivity5.U0 = null;
                            co0Var.V0 = new bf(10, j6Var2);
                        }
                        kb0Var.n(co0Var, false);
                    }
                }
                kb0Var.a();
                return;
            case 14:
                fg0.T((fg0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                fg0 fg0Var = ((pd0) obj5).S;
                if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                    fg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject8, true);
                    return;
                } else if (tL_error7 != null && tL_error7.text != null) {
                    i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    org.telegram.ui.Components.y4.f0(i11, tL_error7, fg0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 16:
                ue0 ue0Var = (ue0) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                fg0 fg0Var2 = ue0Var.A;
                fg0Var2.k1(false, true);
                ue0Var.f43234r = false;
                if (tLObject9 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    fg0Var2.u1(13, true, bundle2, false);
                    return;
                }
                String str9 = tL_error8.text;
                if (str9 != null) {
                    if (str9.contains("EMAIL_INVALID")) {
                        ue0Var.o();
                        return;
                    } else if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                        fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                        fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                        fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        return;
                    } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            fg0Var2.u1(0, true, null, true);
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            return;
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            return;
                        } else if (tL_error8.code != -1000) {
                            i12 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                            org.telegram.ui.Components.y4.f0(i12, tL_error8, fg0Var2, sendverifyemailcode, ue0Var.f43236w);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        return;
                    }
                }
                return;
            case 17:
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                fg0 fg0Var3 = ((ue0) obj5).A;
                if ((tLObject10 instanceof TL_account.TL_emailVerified) && fg0Var3.B == 3) {
                    fg0Var3.finishFragment();
                    fg0Var3.Z.run();
                    return;
                } else if (tLObject10 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject10;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    fg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error9 != null) {
                    if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                        fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error9.text.contains("EMAIL_TOKEN_INVALID")) {
                        fg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        return;
                    } else if (tL_error9.code != -1000) {
                        i13 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                        org.telegram.ui.Components.y4.f0(i13, tL_error9, fg0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 18:
                final of0 of0Var = (of0) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                fg0 fg0Var4 = of0Var.v;
                of0Var.f41140b.setLoading(false);
                if (tLObject11 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject11;
                    fg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    co0 co0Var2 = new co0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, fg0Var4, true);
                    co0Var2.R0 = true;
                    co0Var2.Y0 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final of0 of0Var2 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    of0 of0Var3 = of0Var2;
                                                    if (!of0Var3.f41143f) {
                                                        of0Var3.f41143f = true;
                                                        of0Var3.h = str10;
                                                        of0Var3.f41144n = str11;
                                                        of0Var3.f41145r = j10;
                                                        of0Var3.f41140b.setLoading(true);
                                                        of0Var3.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    of0 of0Var4 = of0Var2;
                                                    if (!of0Var4.f41143f) {
                                                        of0Var4.f41143f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f41144n = str13;
                                                        of0Var4.f41145r = j11;
                                                        of0Var4.f41140b.setLoading(true);
                                                        of0Var4.p();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final of0 of0Var3 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    of0 of0Var32 = of0Var3;
                                                    if (!of0Var32.f41143f) {
                                                        of0Var32.f41143f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.f41144n = str11;
                                                        of0Var32.f41145r = j10;
                                                        of0Var32.f41140b.setLoading(true);
                                                        of0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    of0 of0Var4 = of0Var3;
                                                    if (!of0Var4.f41143f) {
                                                        of0Var4.f41143f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f41144n = str13;
                                                        of0Var4.f41145r = j11;
                                                        of0Var4.f41140b.setLoading(true);
                                                        of0Var4.p();
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
                    co0Var2.Z0 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final of0 of0Var2 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    of0 of0Var32 = of0Var2;
                                                    if (!of0Var32.f41143f) {
                                                        of0Var32.f41143f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.f41144n = str11;
                                                        of0Var32.f41145r = j10;
                                                        of0Var32.f41140b.setLoading(true);
                                                        of0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    of0 of0Var4 = of0Var2;
                                                    if (!of0Var4.f41143f) {
                                                        of0Var4.f41143f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f41144n = str13;
                                                        of0Var4.f41145r = j11;
                                                        of0Var4.f41140b.setLoading(true);
                                                        of0Var4.p();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final of0 of0Var3 = of0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    of0 of0Var32 = of0Var3;
                                                    if (!of0Var32.f41143f) {
                                                        of0Var32.f41143f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.f41144n = str11;
                                                        of0Var32.f41145r = j10;
                                                        of0Var32.f41140b.setLoading(true);
                                                        of0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    of0 of0Var4 = of0Var3;
                                                    if (!of0Var4.f41143f) {
                                                        of0Var4.f41143f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f41144n = str13;
                                                        of0Var4.f41145r = j11;
                                                        of0Var4.f41140b.setLoading(true);
                                                        of0Var4.p();
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
                    co0Var2.f37247a1 = new t10(of0Var, 1);
                    fg0Var4.presentFragment(co0Var2);
                    return;
                } else if (tL_error10 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                        AndroidUtilities.runOnUIThread(new lf0(of0Var, 0));
                        return;
                    }
                    String str10 = tL_error10.text;
                    of0Var.f41142e = str10;
                    new org.telegram.ui.Components.oc(fg0Var4.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str10));
                    return;
                } else {
                    new org.telegram.ui.Components.oc(fg0Var4.V, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                }
            case 19:
                ti0 ti0Var = (ti0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                rf.b bVar = (rf.b) obj3;
                String str11 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                ti0Var.f43021y = true;
                if (tL_error11 == null && bVar != null) {
                    ti0Var.v.put(str11, bVar);
                    e91 e91Var = ti0Var.f43017r;
                    e91Var.f37872e = bVar;
                    e91Var.f37871c = tL_loadAsyncGraph.f22611x;
                    ti0Var.f0();
                    return;
                }
                ti0Var.f0();
                return;
            case 20:
                nj0.n((nj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                return;
            case 21:
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                zk0 zk0Var = (zk0) obj3;
                org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                wm0 wm0Var = ((fm0) obj5).f38315a;
                if (tL_error12 != null) {
                    i14 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                    org.telegram.ui.Components.y4.f0(i14, tL_error12, wm0Var, verifyemail2, new Object[0]);
                    e3Var.T(null, null);
                    return;
                }
                ((am0) wm0Var.f44203x1).c(wm0Var.A, (String) wm0Var.f44181o1.get("email"), null, null, null, null, null, null, null, null, zk0Var, e3Var);
                return;
            case 22:
                sm0 sm0Var = (sm0) obj5;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject12 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                wm0 wm0Var2 = sm0Var.M;
                sm0Var.F = false;
                if (tL_error13 != null) {
                    i15 = ((org.telegram.ui.ActionBar.o2) wm0Var2).currentAccount;
                    org.telegram.ui.ActionBar.c2 f02 = org.telegram.ui.Components.y4.f0(i15, tL_error13, wm0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error13.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.f22774i0 = new om0(sm0Var, 0);
                    }
                } else {
                    wm0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject12, true);
                }
                wm0Var2.x1();
                return;
            case 23:
                co0.e0((co0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 24:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj4;
                Integer num = (Integer) obj2;
                zt0 zt0Var2 = (zt0) obj;
                PhotoViewer photoViewer = ((dt0) obj5).f37600r;
                photoViewer.f35684l4 = null;
                tt0 tt0Var = photoViewer.f35580a0;
                if (tt0Var != null && photoViewer.f35598c0 != null) {
                    tt0Var.setLayerType(0, null);
                    photoViewer.f35667j4 = 0;
                    photoViewer.F1();
                    photoViewer.f35676k4 = 0L;
                    photoViewer.C1 = null;
                    photoViewer.A1.f47862a = false;
                    photoViewer.D1 = null;
                    photoViewer.B1.f47862a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.f35580a0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    bu0 bu0Var = photoViewer.f35692m4;
                    if (bu0Var != null) {
                        bu0Var.f36978a.setVisible(true, true);
                    }
                    bu0 bu0Var2 = photoViewer.f35702n4;
                    if (bu0Var2 != null && !bu0Var2.f36994s) {
                        bu0Var2.f36978a.setVisible(false, true);
                    }
                    if (arrayList8 != null && (i16 = photoViewer.Y1) != 3 && i16 != 1 && ((zt0Var = photoViewer.d) == null || !zt0Var.O())) {
                        photoViewer.R1();
                    }
                    org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
                    if (k61Var != null && k61Var.z() && photoViewer.f35699n1 && !photoViewer.f35605c7.isEmpty()) {
                        PhotoViewer.Y(photoViewer, photoViewer.B2.o());
                        PhotoViewer.X(photoViewer, true);
                    }
                    if (photoViewer.f35719p4) {
                        PhotoViewer.Z(photoViewer, num.intValue());
                    }
                    if (zt0Var2 != null) {
                        zt0Var2.d();
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
                    privacyControlActivity.A0();
                    return;
                }
                privacyControlActivity.getClass();
                zArr[1] = true;
                if (globalPrivacySettings != null) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                    globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                    int i21 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i21;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j10 > 0) {
                        globalPrivacySettings.flags = i21 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j10;
                    } else {
                        globalPrivacySettings.flags = i21 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.w0();
                }
                privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            case 26:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((uw0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.oc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.f28737j = 5000;
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
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull2, false);
                }
                if (tL_error14 != null && (str2 = tL_error14.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                    if (privacyControlActivity2.getParentActivity() != null) {
                        Activity parentActivity = privacyControlActivity2.getParentActivity();
                        b6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, b6Var);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                        c2Var2.N = string;
                        c2Var2.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(c2Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.l0.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(privacyControlActivity2), R.raw.error, 36);
                return;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.dk dkVar = (org.telegram.messenger.dk) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    dkVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36064v0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                c2Var3.N = string2;
                c2Var3.P = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new dl0(dkVar, 11));
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(c2Var3);
                return;
            case 28:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                vy0 vy0Var = (vy0) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject13;
                    if (profileActivity2.f35920a1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f35920a1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f35926b1));
                    }
                    String str12 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(vy0Var.f32269w, profileActivity2.f36064v0);
                    int i22 = R.drawable.filled_username;
                    int i23 = R.string.FragmentChannelUsername;
                    if (TextUtils.isEmpty(formatCurrency2)) {
                        o6 = "";
                    } else {
                        o6 = aa.d.o("(", formatCurrency2, ")");
                    }
                    org.telegram.ui.Components.gc w8 = ocVar.w(i22, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i23, str12, format, formatCurrency, o6)), new ys0(14, profileActivity2, tL_collectibleInfo)));
                    v80 v80Var = new v80(16, profileActivity2, tL_collectibleInfo);
                    org.telegram.ui.Components.lb lbVar = w8.f28733e;
                    if (lbVar != null) {
                        lbVar.setOnClickListener(v80Var);
                    }
                    w8.k(false);
                    return;
                }
                org.telegram.ui.Components.oc.b0(tL_error15);
                return;
            default:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                String str13 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    p10.a(profileActivity3.getParentActivity(), 1, str13, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity3.f36064v0);
                    return;
                } else {
                    org.telegram.ui.Components.oc.b0(tL_error16);
                    return;
                }
        }
    }

    public hr(ir irVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3) {
        this.f38899a = 0;
        this.f38900b = irVar;
        this.f38901c = arrayList;
        this.f38903f = hVar;
        this.d = arrayList2;
        this.f38902e = arrayList3;
    }

    public hr(ht htVar, TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        this.f38899a = 5;
        this.f38900b = htVar;
        this.d = tL_error;
        this.f38902e = tLObject;
        this.f38901c = arrayList;
        this.f38903f = tL_messages_getMyStickers;
    }

    public hr(dt0 dt0Var, ClippingImageView[] clippingImageViewArr, ArrayList arrayList, Integer num, zt0 zt0Var) {
        this.f38899a = 24;
        this.f38900b = dt0Var;
        this.d = clippingImageViewArr;
        this.f38901c = arrayList;
        this.f38902e = num;
        this.f38903f = zt0Var;
    }
}
