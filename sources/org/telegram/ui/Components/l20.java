package org.telegram.ui.Components;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c91;
import org.telegram.ui.nc1;
import org.telegram.ui.wh1;

public final class l20 implements Runnable {

    public final int f30264a;

    public final Object f30265b;

    public final Object f30266c;
    public final Object d;

    public final Object f30267e;

    public final Object f30268f;

    public l20(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.f30264a = 0;
        this.f30265b = view;
        this.f30266c = view2;
        this.f30268f = windowManager;
        this.d = view3;
        this.f30267e = view4;
    }

    @Override
    public final void run() {
        String str;
        Object obj;
        int i10;
        org.telegram.ui.do0 do0Var;
        mc mcVarB;
        int i11;
        int i12;
        org.telegram.ui.au0 au0Var;
        String str2;
        int i13 = this.f30264a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        final int i14 = 1;
        final int i15 = 0;
        Object obj2 = this.f30268f;
        Object obj3 = this.f30267e;
        Object obj4 = this.d;
        Object obj5 = this.f30266c;
        Object obj6 = this.f30265b;
        switch (i13) {
            case 0:
                View view = (View) obj6;
                View view2 = (View) obj5;
                WindowManager windowManager = (WindowManager) obj2;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj4);
                windowManager.removeView((View) obj3);
                break;
            case 1:
                ex0 ex0Var = (ex0) obj6;
                String str3 = (String) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                TextView textView = (TextView) obj2;
                ex0Var.f28185l0 = 0;
                String str4 = ex0Var.f28184k0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23391w6));
                        ex0Var.m0 = true;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                        ex0Var.m0 = false;
                    }
                    break;
                }
                break;
            case 2:
                qx0 qx0Var = (qx0) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        ec ecVarM = mc.a0(n2VarU).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        ecVarM.f28020j = 5000;
                        ecVarM.j();
                    } else {
                        if (userFull != null) {
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            MessagesStorage.getInstance(qx0Var.f31991a).updateUserInfo(userFull, false);
                        }
                        if (tL_error2 == null || (str = tL_error2.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.y1.q(R.string.UnknownError, mc.a0(n2VarU), R.raw.error, 36);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qx0Var.f31992b.getContext());
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            i0.a.C(R.string.OK, alertDialog$Builder, null);
                        }
                    }
                    break;
                }
                break;
            case 3:
                d21 d21Var = (d21) obj6;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj4;
                b70 b70Var = (b70) obj3;
                b70 b70Var2 = (b70) obj2;
                org.telegram.ui.rn rnVar = d21Var.h;
                if (((MessagesController) obj5).isDialogMuted(d21Var.f27626c, tL_forumTopic.f22432id)) {
                    b70Var.u();
                    NotificationsController.getInstance(d21Var.f27625b).muteDialog(d21Var.f27626c, tL_forumTopic.f22432id, false);
                    if (mc.a(rnVar)) {
                        mc.z(rnVar, 4, 0, d21Var.d).j();
                    }
                } else {
                    b70Var.K(b70Var2);
                }
                break;
            case 4:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj6;
                TLObject tLObject3 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                if (((TLRPC.TL_error) obj5) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
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
                            tL_inputStickerSetID.f22400id = stickerSetCovered2.set.f22407id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(ktVar.f39874r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i0.a.i(1, tL_messages_myStickers.sets)).set.f22407id;
                        ConnectionsManager.getInstance(ktVar.f39874r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.z9(ktVar, arrayList, tL_messages_getMyStickers, 7));
                    }
                }
                break;
            case 5:
                org.telegram.ui.gy.I0((org.telegram.ui.gy) obj6, (TLObject) obj5, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj2);
                break;
            case 6:
                org.telegram.ui.s50.C((org.telegram.ui.s50) obj6, (org.telegram.ui.ActionBar.b2) obj5, (TLObject) obj4, (TL_phone.exportGroupCallInvite) obj3, (TLRPC.TL_error) obj2);
                break;
            case 7:
                org.telegram.ui.s50.y((org.telegram.ui.s50) obj6, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj3, (String) obj2);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                org.telegram.ui.a30 a30Var = (org.telegram.ui.a30) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject4;
                    if (tL_wallPaper3.pattern) {
                        obj = tL_wallPaper3;
                        String str5 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        int i16 = wallPaperSettings.background_color;
                        int i17 = wallPaperSettings.second_background_color;
                        int i18 = wallPaperSettings.third_background_color;
                        int i19 = wallPaperSettings.fourth_background_color;
                        int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        wh1 wh1Var = new wh1(str5, i16, i17, i18, i19, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                        wh1Var.f44125g = tL_wallPaper3;
                        obj = wh1Var;
                    }
                    obj = tL_wallPaper3;
                    nc1 nc1Var = new nc1(obj, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    float f10 = wallPaperSettings3.intensity;
                    nc1Var.B1 = z10;
                    nc1Var.A1 = z11;
                    nc1Var.f40764j1 = f10;
                    launchActivity.p0(nc1Var);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error3.text);
                    launchActivity.B0(y4.N(launchActivity, null, sb2.toString()));
                }
                break;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj5;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                String str6 = (String) obj2;
                ArrayList arrayList3 = launchActivity2.A0;
                if (gyVar != null) {
                    if (n2Var != null) {
                        n2Var.dismissCurrentDialog();
                    }
                    while (i15 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i15)).isShowing()) {
                            ((Dialog) arrayList3.get(i15)).dismiss();
                        }
                        i15++;
                    }
                    arrayList3.clear();
                    launchActivity2.p0(gyVar);
                } else if (n2Var instanceof org.telegram.ui.rn) {
                    ((org.telegram.ui.rn) n2Var).W9(user.f22527id, str6, true);
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                String str7 = (String) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (tLObject5 != null) {
                    if (tLObject5 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.tk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject5, null, null, null, false, null);
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.tk0.b(false, launchActivity3.K, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject5, null, null, null, false, null);
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultDefault) {
                        y4.q0(n2VarU2, str7, false, true);
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        org.telegram.ui.tk0.a().M(launchActivity3.getString(R.string.BotAuthLoggedInFailTitle), launchActivity3.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                    } else {
                        org.telegram.ui.tk0.a().d0(tL_error4, false);
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLObject tLObject6 = (TLObject) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                org.telegram.ui.a30 a30Var2 = (org.telegram.ui.a30) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                Pattern pattern2 = LaunchActivity.f35496x1;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.f6 f6VarN0 = org.telegram.ui.ActionBar.g6.N0(org.telegram.ui.ActionBar.g6.q0(themeSettings));
                        if (f6VarN0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.K).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.R0 = b2Var;
                                    launchActivity4.Q0 = true;
                                    launchActivity4.O0 = f6VarN0;
                                    launchActivity4.P0 = tL_theme;
                                    launchActivity4.N0 = tL_wallPaper;
                                    launchActivity4.M0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.K).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                }
                            }
                            try {
                                a30Var2.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, f6VarN0);
                        } else {
                            i15 = 1;
                        }
                        i10 = i15;
                        break;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.Q0 = false;
                            launchActivity4.P0 = tL_theme;
                            launchActivity4.L0 = FileLoader.getAttachFileName(document);
                            launchActivity4.R0 = b2Var;
                            FileLoader.getInstance(launchActivity4.K).loadFile(launchActivity4.P0.document, tL_theme, 1, 1);
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                    }
                } else if (tL_error5 == null || !"THEME_FORMAT_INVALID".equals(tL_error5.text)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        a30Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (i10 == 1) {
                        launchActivity4.B0(y4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                    } else {
                        launchActivity4.B0(y4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                    }
                }
                break;
            case 12:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj6;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj5;
                TLObject tLObject7 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str8 = (String) obj2;
                int i20 = ob0Var.f41051b;
                LaunchActivity launchActivity5 = ob0Var.f41050a;
                if (tL_error6 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error6.text)) {
                        mcVarB = org.telegram.ui.ob0.b();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        mcVarB = org.telegram.ui.ob0.b();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y1.r(i11, mcVarB, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        gh.b6 b6Var = launchActivity5.U0;
                        launchActivity5.U0 = null;
                        hh.u7.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new org.telegram.ui.hb0(ob0Var, 1), new org.telegram.ui.s80(b6Var, i14));
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                            do0Var = new org.telegram.ui.do0(paymentForm, null, str8, LaunchActivity.U());
                        } else {
                            do0Var = tLObject7 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.do0((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (do0Var != null) {
                            gh.b6 b6Var2 = launchActivity5.U0;
                            if (b6Var2 != null) {
                                launchActivity5.U0 = null;
                                do0Var.V0 = new org.telegram.ui.bf(10, b6Var2);
                            }
                            ob0Var.n(do0Var, false);
                        }
                    }
                }
                ob0Var.a();
                break;
            case 13:
                org.telegram.ui.ig0.U((org.telegram.ui.ig0) obj6, (TLRPC.TL_error) obj5, (String) obj4, (String) obj3, (String) obj2);
                break;
            case 14:
                TLObject tLObject8 = (TLObject) obj5;
                Bundle bundle = (Bundle) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                org.telegram.ui.ig0 ig0Var = ((org.telegram.ui.sd0) obj6).S;
                if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                    ig0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject8, true);
                    break;
                } else if (tL_error7 != null && tL_error7.text != null) {
                    y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount, tL_error7, ig0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.xe0 xe0Var = (org.telegram.ui.xe0) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                org.telegram.ui.ig0 ig0Var2 = xe0Var.A;
                ig0Var2.k1(false, true);
                xe0Var.f44431r = false;
                if (tLObject9 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ig0Var2.u1(13, true, bundle2, false);
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("EMAIL_INVALID")) {
                            xe0Var.o();
                        } else if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error8.code != -1000) {
                            y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount, tL_error8, ig0Var2, sendverifyemailcode, xe0Var.f44433w);
                        }
                    }
                }
                break;
            case 16:
                TLObject tLObject10 = (TLObject) obj5;
                Bundle bundle3 = (Bundle) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj2;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.xe0) obj6).A;
                if ((tLObject10 instanceof TL_account.TL_emailVerified) && ig0Var3.B == 3) {
                    ig0Var3.finishFragment();
                    ig0Var3.Z.run();
                } else if (tLObject10 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject10;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    ig0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                } else if (tL_error9 != null) {
                    if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                        ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                    } else if (tL_error9.text.contains("EMAIL_TOKEN_INVALID")) {
                        ig0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error9.code != -1000) {
                        y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var3).currentAccount, tL_error9, ig0Var3, verifyemail, new Object[0]);
                    }
                }
                break;
            case 17:
                final org.telegram.ui.rf0 rf0Var = (org.telegram.ui.rf0) obj6;
                TLObject tLObject11 = (TLObject) obj5;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj4;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ig0 ig0Var4 = rf0Var.v;
                rf0Var.f41919b.setLoading(false);
                if (tLObject11 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject11;
                    ig0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.do0 do0Var2 = new org.telegram.ui.do0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ig0Var4, true);
                    do0Var2.R0 = true;
                    do0Var2.Y0 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj7) {
                            switch (i15) {
                                case 0:
                                    final int i21 = 0;
                                    final rf0 rf0Var2 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    rf0 rf0Var3 = rf0Var2;
                                                    if (!rf0Var3.f41922f) {
                                                        rf0Var3.f41922f = true;
                                                        rf0Var3.h = str10;
                                                        rf0Var3.f41923n = str11;
                                                        rf0Var3.f41924r = j10;
                                                        rf0Var3.f41919b.setLoading(true);
                                                        rf0Var3.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    rf0 rf0Var4 = rf0Var2;
                                                    if (!rf0Var4.f41922f) {
                                                        rf0Var4.f41922f = true;
                                                        rf0Var4.h = str12;
                                                        rf0Var4.f41923n = str13;
                                                        rf0Var4.f41924r = j11;
                                                        rf0Var4.f41919b.setLoading(true);
                                                        rf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i22 = 1;
                                    final rf0 rf0Var3 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    rf0 rf0Var4 = rf0Var3;
                                                    if (!rf0Var4.f41922f) {
                                                        rf0Var4.f41922f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.f41923n = str11;
                                                        rf0Var4.f41924r = j10;
                                                        rf0Var4.f41919b.setLoading(true);
                                                        rf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode5 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode5.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode5.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    rf0 rf0Var5 = rf0Var3;
                                                    if (!rf0Var5.f41922f) {
                                                        rf0Var5.f41922f = true;
                                                        rf0Var5.h = str12;
                                                        rf0Var5.f41923n = str13;
                                                        rf0Var5.f41924r = j11;
                                                        rf0Var5.f41919b.setLoading(true);
                                                        rf0Var5.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    do0Var2.Z0 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj7) {
                            switch (i14) {
                                case 0:
                                    final int i21 = 0;
                                    final rf0 rf0Var2 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    rf0 rf0Var4 = rf0Var2;
                                                    if (!rf0Var4.f41922f) {
                                                        rf0Var4.f41922f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.f41923n = str11;
                                                        rf0Var4.f41924r = j10;
                                                        rf0Var4.f41919b.setLoading(true);
                                                        rf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode5 = tL_inputStorePaymentAuthCode2;
                                                    String str12 = tL_inputStorePaymentAuthCode5.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode5.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    rf0 rf0Var5 = rf0Var2;
                                                    if (!rf0Var5.f41922f) {
                                                        rf0Var5.f41922f = true;
                                                        rf0Var5.h = str12;
                                                        rf0Var5.f41923n = str13;
                                                        rf0Var5.f41924r = j11;
                                                        rf0Var5.f41919b.setLoading(true);
                                                        rf0Var5.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i22 = 1;
                                    final rf0 rf0Var3 = rf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    rf0 rf0Var4 = rf0Var3;
                                                    if (!rf0Var4.f41922f) {
                                                        rf0Var4.f41922f = true;
                                                        rf0Var4.h = str10;
                                                        rf0Var4.f41923n = str11;
                                                        rf0Var4.f41924r = j10;
                                                        rf0Var4.f41919b.setLoading(true);
                                                        rf0Var4.p();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode5 = tL_inputStorePaymentAuthCode3;
                                                    String str12 = tL_inputStorePaymentAuthCode5.phone_number;
                                                    String str13 = tL_inputStorePaymentAuthCode5.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    rf0 rf0Var5 = rf0Var3;
                                                    if (!rf0Var5.f41922f) {
                                                        rf0Var5.f41922f = true;
                                                        rf0Var5.h = str12;
                                                        rf0Var5.f41923n = str13;
                                                        rf0Var5.f41924r = j11;
                                                        rf0Var5.f41919b.setLoading(true);
                                                        rf0Var5.p();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    do0Var2.f37453a1 = new org.telegram.ui.w10(rf0Var, i14);
                    ig0Var4.presentFragment(do0Var2);
                } else if (tL_error10 == null) {
                    new mc(ig0Var4.V, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                } else if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.of0(rf0Var, i15));
                } else {
                    String str10 = tL_error10.text;
                    rf0Var.f41921e = str10;
                    new mc(ig0Var4.V, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str10));
                }
                break;
            case 18:
                org.telegram.ui.vi0 vi0Var = (org.telegram.ui.vi0) obj6;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj5;
                sf.b bVar = (sf.b) obj4;
                String str11 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                vi0Var.f43478y = true;
                if (tL_error11 != null || bVar == null) {
                    vi0Var.g0();
                } else {
                    vi0Var.v.put(str11, bVar);
                    c91 c91Var = vi0Var.f43474r;
                    c91Var.f37024e = bVar;
                    c91Var.f37023c = tL_loadAsyncGraph.f22611x;
                    vi0Var.g0();
                }
                break;
            case 19:
                org.telegram.ui.oj0.n((org.telegram.ui.oj0) obj6, (TLRPC.TL_contacts_importedContacts) obj5, (TLRPC.TL_inputPhoneContact) obj4, (TLRPC.TL_error) obj3, (TLRPC.TL_contacts_importContacts) obj2);
                break;
            case 20:
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj5;
                org.telegram.ui.zk0 zk0Var = (org.telegram.ui.zk0) obj4;
                org.telegram.ui.i6 i6Var = (org.telegram.ui.i6) obj3;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                org.telegram.ui.xm0 xm0Var = ((org.telegram.ui.gm0) obj6).f38446a;
                if (tL_error12 == null) {
                    ((org.telegram.ui.bm0) xm0Var.f44534x1).c(xm0Var.A, (String) xm0Var.f44512o1.get("email"), null, null, null, null, null, null, null, null, zk0Var, i6Var);
                } else {
                    y4.f0(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount, tL_error12, xm0Var, verifyemail2, new Object[0]);
                    i6Var.S(null, null);
                }
                break;
            case 21:
                org.telegram.ui.tm0 tm0Var = (org.telegram.ui.tm0) obj6;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj5;
                Bundle bundle4 = (Bundle) obj4;
                TLObject tLObject12 = (TLObject) obj3;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                org.telegram.ui.xm0 xm0Var2 = tm0Var.M;
                tm0Var.F = false;
                if (tL_error13 == null) {
                    xm0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject12, true);
                } else {
                    org.telegram.ui.ActionBar.b2 b2VarF0 = y4.f0(((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount, tL_error13, xm0Var2, tL_auth_resendCode2, new Object[0]);
                    if (b2VarF0 != null && tL_error13.text.contains("PHONE_CODE_EXPIRED")) {
                        b2VarF0.f22755i0 = new org.telegram.ui.pm0(tm0Var, 0);
                    }
                }
                xm0Var2.x1();
                break;
            case 22:
                org.telegram.ui.do0.f0((org.telegram.ui.do0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj2);
                break;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                Integer num = (Integer) obj3;
                org.telegram.ui.au0 au0Var2 = (org.telegram.ui.au0) obj2;
                PhotoViewer photoViewer = ((org.telegram.ui.et0) obj6).f37840r;
                photoViewer.f35687l4 = null;
                org.telegram.ui.ut0 ut0Var = photoViewer.f35583a0;
                if (ut0Var != null && photoViewer.f35601c0 != null) {
                    ut0Var.setLayerType(0, null);
                    photoViewer.f35670j4 = 0;
                    photoViewer.F1();
                    photoViewer.f35679k4 = 0L;
                    photoViewer.C1 = null;
                    photoViewer.A1.f48584a = false;
                    photoViewer.D1 = null;
                    photoViewer.B1.f48584a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.f35583a0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.cu0 cu0Var = photoViewer.f35695m4;
                    if (cu0Var != null) {
                        cu0Var.f37153a.setVisible(true, true);
                    }
                    org.telegram.ui.cu0 cu0Var2 = photoViewer.f35705n4;
                    if (cu0Var2 != null && !cu0Var2.f37169s) {
                        cu0Var2.f37153a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i12 = photoViewer.Y1) != 3 && i12 != 1 && ((au0Var = photoViewer.d) == null || !au0Var.O())) {
                        photoViewer.R1();
                    }
                    m61 m61Var = photoViewer.B2;
                    if (m61Var != null && m61Var.z() && photoViewer.f35702n1 && !photoViewer.f35608c7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.B2.o());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.f35723p4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (au0Var2 != null) {
                        au0Var2.d();
                    }
                    break;
                }
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj6;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj3;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj2;
                if (((TLRPC.TL_error) obj5) != null) {
                    privacyControlActivity.B0();
                } else {
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
                        privacyControlActivity.x0();
                    }
                    privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                }
                break;
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj3;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj2;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.uw0) obj6).d;
                if (((TLObject) obj5) instanceof TLRPC.TL_boolTrue) {
                    ec ecVarQ = mc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    ecVarQ.f28020j = 5000;
                    ecVarQ.j();
                } else {
                    if (userFull2 != null) {
                        if (tL_birthday2 == null) {
                            userFull2.flags2 &= -33;
                        } else {
                            userFull2.flags2 |= 32;
                        }
                        userFull2.birthday = tL_birthday2;
                        privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull2, false);
                    }
                    if (tL_error14 == null || (str2 = tL_error14.text) == null || !str2.startsWith("FLOOD_WAIT_")) {
                        org.telegram.messenger.y1.q(R.string.UnknownError, mc.a0(privacyControlActivity2), R.raw.error, 36);
                    } else if (privacyControlActivity2.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(privacyControlActivity2.getParentActivity(), 0, ((org.telegram.ui.ActionBar.n2) privacyControlActivity2).resourceProvider);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                        b2Var2.N = string;
                        b2Var2.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(b2Var2);
                    }
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj4;
                TLRPC.User user2 = (TLRPC.User) obj3;
                org.telegram.messenger.hk hkVar = (org.telegram.messenger.hk) obj2;
                if ((((TLRPC.ChannelParticipant) obj5) instanceof TLRPC.TL_channelParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36067v0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                    b2Var3.N = string2;
                    b2Var3.P = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.dl0(hkVar, 11));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(b2Var3);
                } else {
                    hkVar.run(1);
                }
                break;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj6;
                TLObject tLObject13 = (TLObject) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj4;
                org.telegram.ui.vy0 vy0Var = (org.telegram.ui.vy0) obj3;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj2;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject13;
                    if (profileActivity2.f35923a1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f35923a1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f35929b1));
                    }
                    String str12 = "@" + tL_username.username;
                    String str13 = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) tL_collectibleInfo.purchase_date) * 1000));
                    String currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    ec ecVarW = new mc(vy0Var.f32547w, profileActivity2.f36067v0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str12, str13, currency, TextUtils.isEmpty(currency2) ? "" : a9.p.m("(", currency2, ")"))), new org.telegram.ui.zs0(14, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.u70 u70Var = new org.telegram.ui.u70(17, profileActivity2, tL_collectibleInfo);
                    jb jbVar = ecVarW.f28016e;
                    if (jbVar != null) {
                        jbVar.setOnClickListener(u70Var);
                    }
                    ecVarW.k(false);
                } else {
                    mc.b0(tL_error15);
                }
                break;
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj6;
                TLObject tLObject14 = (TLObject) obj5;
                String str14 = (String) obj4;
                TLRPC.User user3 = (TLRPC.User) obj3;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj2;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.s10.a(profileActivity3.getParentActivity(), 1, str14, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity3.f36067v0);
                } else {
                    mc.b0(tL_error16);
                }
                break;
            default:
                ProfileActivity.X((ProfileActivity) obj6, (TLObject) obj5, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public l20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f30264a = i10;
        this.f30265b = obj;
        this.f30266c = obj2;
        this.d = obj3;
        this.f30267e = obj4;
        this.f30268f = obj5;
    }
}
