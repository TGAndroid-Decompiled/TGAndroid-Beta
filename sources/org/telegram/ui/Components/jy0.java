package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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
import org.telegram.ui.aa1;
import org.telegram.ui.jd1;
import org.telegram.ui.ui1;
public final class jy0 implements Runnable {
    public final int f26077a;
    public final Object f26078b;
    public final Object f26079c;
    public final Object d;
    public final Object e;
    public final Object f26080f;

    public jy0(int i10, Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error) {
        this.f26077a = i10;
        this.f26078b = obj;
        this.f26080f = tL_error;
        this.f26079c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i10;
        TLRPC.ThemeSettings themeSettings;
        org.telegram.ui.lo0 lo0Var;
        qc b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ou0 ou0Var;
        String str2;
        org.telegram.ui.ActionBar.f6 f6Var;
        String o10;
        int i18 = this.f26077a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i19 = 0;
        Object obj = this.f26080f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f26079c;
        Object obj5 = this.f26078b;
        switch (i18) {
            case 0:
                ky0 ky0Var = (ky0) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        ic M = qc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.f25671j = 5000;
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
                        MessagesStorage.getInstance(ky0Var.f26411a).updateUserInfo(userFull, false);
                    }
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.f26412b.getContext());
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        kf.k0.C(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                    kf.k0.v(R.string.UnknownError, qc.a0(U), R.raw.error, 36);
                    return;
                }
                return;
            case 1:
                w21 w21Var = (w21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                p70 p70Var = (p70) obj2;
                p70 p70Var2 = (p70) obj;
                org.telegram.ui.zn znVar = w21Var.h;
                if (((MessagesController) obj4).isDialogMuted(w21Var.f30126c, tL_forumTopic.f19211id)) {
                    p70Var.u();
                    NotificationsController.getInstance(w21Var.f30124b).muteDialog(w21Var.f30126c, tL_forumTopic.f19211id, false);
                    if (qc.a(znVar)) {
                        qc.z(znVar, 4, 0, w21Var.d).j();
                        return;
                    }
                    return;
                }
                p70Var.K(p70Var2);
                return;
            case 2:
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                if (((TLRPC.TL_error) obj) == null && (tLObject2 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject2;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i19 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i19);
                        i19++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f19179id = stickerSetCovered2.set.f19186id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(rtVar.f38046r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) kf.k0.i(1, tL_messages_myStickers.sets)).set.f19186id;
                        ConnectionsManager.getInstance(rtVar.f38046r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.da(rtVar, arrayList, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.qy.I0((org.telegram.ui.qy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 4:
                org.telegram.ui.e60.B((org.telegram.ui.e60) obj5, (org.telegram.ui.ActionBar.d2) obj3, (TLObject) obj4, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                return;
            case 5:
                org.telegram.ui.e60.x((org.telegram.ui.e60) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.w10 w10Var = (org.telegram.ui.w10) obj3;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                try {
                    w10Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                    if (tL_wallPaper3.pattern) {
                        String str3 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        ui1 ui1Var = new ui1(str3, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        ui1Var.f38861g = tL_wallPaper3;
                        tL_wallPaper3 = ui1Var;
                    }
                    jd1 jd1Var = new jd1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z4 = wallPaperSettings3.blur;
                    boolean z10 = wallPaperSettings3.motion;
                    jd1Var.C1 = z4;
                    jd1Var.B1 = z10;
                    jd1Var.f35210k1 = wallPaperSettings3.intensity;
                    launchActivity.p0(jd1Var);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error2.text);
                launchActivity.B0(z4.N(launchActivity, null, sb.toString()));
                return;
            case 7:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList3 = launchActivity2.B0;
                if (qyVar != null) {
                    if (p2Var != null) {
                        p2Var.dismissCurrentDialog();
                    }
                    while (i19 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i19)).isShowing()) {
                            ((Dialog) arrayList3.get(i19)).dismiss();
                        }
                        i19++;
                    }
                    arrayList3.clear();
                    launchActivity2.p0(qyVar);
                    return;
                } else if (p2Var instanceof org.telegram.ui.zn) {
                    ((org.telegram.ui.zn) p2Var).W9(user.f19306id, str4, true);
                    return;
                } else {
                    return;
                }
            case 8:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (tLObject4 != null) {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.zk0.b(false, launchActivity3.L, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                        return;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.zk0.b(false, launchActivity3.L, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                        return;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        z4.q0(U2, str5, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.ui.zk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        return;
                    } else {
                        org.telegram.ui.zk0.a().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 9:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.w10 w10Var2 = (org.telegram.ui.w10) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.f31586y1;
                if (tLObject5 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject5;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.L).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.S0 = d2Var;
                                    launchActivity4.R0 = true;
                                    launchActivity4.P0 = N0;
                                    launchActivity4.Q0 = tL_theme;
                                    launchActivity4.O0 = tL_wallPaper;
                                    launchActivity4.N0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.L).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    return;
                                }
                            }
                            try {
                                w10Var2.run();
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                        } else {
                            i19 = 1;
                        }
                        i10 = i19;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.R0 = false;
                            launchActivity4.Q0 = tL_theme;
                            launchActivity4.M0 = FileLoader.getAttachFileName(document);
                            launchActivity4.S0 = d2Var;
                            FileLoader.getInstance(launchActivity4.L).loadFile(launchActivity4.Q0.document, tL_theme, 1, 1);
                            i10 = 0;
                        }
                        i10 = 1;
                    }
                } else {
                    if (tL_error4 == null || !"THEME_FORMAT_INVALID".equals(tL_error4.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        w10Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (i10 == 1) {
                        launchActivity4.B0(z4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.B0(z4.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 10:
                org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str6 = (String) obj2;
                int i20 = yb0Var.f40222b;
                LaunchActivity launchActivity5 = yb0Var.f40221a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        b10 = org.telegram.ui.yb0.b();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = org.telegram.ui.yb0.b();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.y3.s(i11, b10, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        kh.t5 t5Var = launchActivity5.V0;
                        launchActivity5.V0 = null;
                        lh.t7.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new org.telegram.ui.rb0(yb0Var, 1), new org.telegram.ui.c90(t5Var, 1));
                        return;
                    }
                    if (tLObject6 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                        MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                        lo0Var = new org.telegram.ui.lo0(paymentForm, null, str6, LaunchActivity.U());
                    } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                        lo0Var = new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject6);
                    } else {
                        lo0Var = null;
                    }
                    if (lo0Var != null) {
                        kh.t5 t5Var2 = launchActivity5.V0;
                        if (t5Var2 != null) {
                            launchActivity5.V0 = null;
                            lo0Var.W0 = new org.telegram.ui.jf(10, t5Var2);
                        }
                        yb0Var.n(lo0Var, false);
                    }
                }
                yb0Var.a();
                return;
            case 11:
                org.telegram.ui.pg0.U((org.telegram.ui.pg0) obj5, (TLRPC.TL_error) obj, (String) obj4, (String) obj3, (String) obj2);
                return;
            case 12:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj2;
                org.telegram.ui.pg0 pg0Var = ((org.telegram.ui.ae0) obj5).T;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    pg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    return;
                } else if (tL_error6 != null && tL_error6.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                    z4.f0(i12, tL_error6, pg0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj2;
                org.telegram.ui.pg0 pg0Var2 = ff0Var.B;
                pg0Var2.k1(false, true);
                ff0Var.f34069r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    pg0Var2.u1(13, true, bundle2, false);
                    return;
                }
                String str7 = tL_error7.text;
                if (str7 != null) {
                    if (str7.contains("EMAIL_INVALID")) {
                        ff0Var.o();
                        return;
                    } else if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                        pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                        pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                        pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        return;
                    } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            pg0Var2.u1(0, true, null, true);
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            return;
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            return;
                        } else if (tL_error7.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.p2) pg0Var2).currentAccount;
                            z4.f0(i13, tL_error7, pg0Var2, sendverifyemailcode, ff0Var.f34071w);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        return;
                    }
                }
                return;
            case 14:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj2;
                org.telegram.ui.pg0 pg0Var3 = ((org.telegram.ui.ff0) obj5).B;
                if ((tLObject9 instanceof TL_account.TL_emailVerified) && pg0Var3.C == 3) {
                    pg0Var3.finishFragment();
                    pg0Var3.f37127a0.run();
                    return;
                } else if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    pg0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error8 != null) {
                    if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                        pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                        pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        return;
                    } else if (tL_error8.code != -1000) {
                        i14 = ((org.telegram.ui.ActionBar.p2) pg0Var3).currentAccount;
                        z4.f0(i14, tL_error8, pg0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                final org.telegram.ui.yf0 yf0Var = (org.telegram.ui.yf0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.pg0 pg0Var4 = yf0Var.v;
                yf0Var.f40260b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    pg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.lo0 lo0Var2 = new org.telegram.ui.lo0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, pg0Var4, true);
                    lo0Var2.S0 = true;
                    lo0Var2.Z0 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final yf0 yf0Var2 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    yf0 yf0Var3 = yf0Var2;
                                                    if (!yf0Var3.f40262f) {
                                                        yf0Var3.f40262f = true;
                                                        yf0Var3.h = str8;
                                                        yf0Var3.f40263n = str9;
                                                        yf0Var3.f40264r = j10;
                                                        yf0Var3.f40260b.setLoading(true);
                                                        yf0Var3.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    yf0 yf0Var4 = yf0Var2;
                                                    if (!yf0Var4.f40262f) {
                                                        yf0Var4.f40262f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.f40263n = str11;
                                                        yf0Var4.f40264r = j11;
                                                        yf0Var4.f40260b.setLoading(true);
                                                        yf0Var4.p();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final yf0 yf0Var3 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    yf0 yf0Var32 = yf0Var3;
                                                    if (!yf0Var32.f40262f) {
                                                        yf0Var32.f40262f = true;
                                                        yf0Var32.h = str8;
                                                        yf0Var32.f40263n = str9;
                                                        yf0Var32.f40264r = j10;
                                                        yf0Var32.f40260b.setLoading(true);
                                                        yf0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    yf0 yf0Var4 = yf0Var3;
                                                    if (!yf0Var4.f40262f) {
                                                        yf0Var4.f40262f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.f40263n = str11;
                                                        yf0Var4.f40264r = j11;
                                                        yf0Var4.f40260b.setLoading(true);
                                                        yf0Var4.p();
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
                    lo0Var2.f35817a1 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final yf0 yf0Var2 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    yf0 yf0Var32 = yf0Var2;
                                                    if (!yf0Var32.f40262f) {
                                                        yf0Var32.f40262f = true;
                                                        yf0Var32.h = str8;
                                                        yf0Var32.f40263n = str9;
                                                        yf0Var32.f40264r = j10;
                                                        yf0Var32.f40260b.setLoading(true);
                                                        yf0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    yf0 yf0Var4 = yf0Var2;
                                                    if (!yf0Var4.f40262f) {
                                                        yf0Var4.f40262f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.f40263n = str11;
                                                        yf0Var4.f40264r = j11;
                                                        yf0Var4.f40260b.setLoading(true);
                                                        yf0Var4.p();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final yf0 yf0Var3 = yf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    yf0 yf0Var32 = yf0Var3;
                                                    if (!yf0Var32.f40262f) {
                                                        yf0Var32.f40262f = true;
                                                        yf0Var32.h = str8;
                                                        yf0Var32.f40263n = str9;
                                                        yf0Var32.f40264r = j10;
                                                        yf0Var32.f40260b.setLoading(true);
                                                        yf0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    yf0 yf0Var4 = yf0Var3;
                                                    if (!yf0Var4.f40262f) {
                                                        yf0Var4.f40262f = true;
                                                        yf0Var4.h = str10;
                                                        yf0Var4.f40263n = str11;
                                                        yf0Var4.f40264r = j11;
                                                        yf0Var4.f40260b.setLoading(true);
                                                        yf0Var4.p();
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
                    lo0Var2.f35820b1 = new org.telegram.ui.j20(yf0Var, 1);
                    pg0Var4.presentFragment(lo0Var2);
                    return;
                } else if (tL_error9 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.vf0(yf0Var, 0));
                        return;
                    }
                    String str8 = tL_error9.text;
                    yf0Var.e = str8;
                    new qc(pg0Var4.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str8));
                    return;
                } else {
                    new qc(pg0Var4.W, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                }
            case 16:
                org.telegram.ui.cj0 cj0Var = (org.telegram.ui.cj0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                wf.b bVar = (wf.b) obj4;
                String str9 = (String) obj3;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj2;
                cj0Var.f33178y = true;
                if (tL_error10 == null && bVar != null) {
                    cj0Var.v.put(str9, bVar);
                    aa1 aa1Var = cj0Var.f33174r;
                    aa1Var.e = bVar;
                    aa1Var.f32528c = tL_loadAsyncGraph.f19388x;
                    cj0Var.g0();
                    return;
                }
                cj0Var.g0();
                return;
            case 17:
                org.telegram.ui.uj0.n((org.telegram.ui.uj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj, (TLRPC.TL_contacts_importContacts) obj2);
                return;
            case 18:
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                org.telegram.ui.gl0 gl0Var = (org.telegram.ui.gl0) obj4;
                n7.qa qaVar = (n7.qa) obj3;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj2;
                org.telegram.ui.fn0 fn0Var = ((org.telegram.ui.nm0) obj5).f36539a;
                if (tL_error11 != null) {
                    i15 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                    z4.f0(i15, tL_error11, fn0Var, verifyemail2, new Object[0]);
                    qaVar.D(null, null);
                    return;
                }
                ((org.telegram.ui.im0) fn0Var.f34167y1).c(fn0Var.B, (String) fn0Var.f34144p1.get("email"), null, null, null, null, null, null, null, null, gl0Var, qaVar);
                return;
            case 19:
                org.telegram.ui.bn0 bn0Var = (org.telegram.ui.bn0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj2;
                org.telegram.ui.fn0 fn0Var2 = bn0Var.N;
                bn0Var.G = false;
                if (tL_error12 != null) {
                    i16 = ((org.telegram.ui.ActionBar.p2) fn0Var2).currentAccount;
                    org.telegram.ui.ActionBar.d2 f02 = z4.f0(i16, tL_error12, fn0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.f19572j0 = new org.telegram.ui.wm0(bn0Var, 0);
                    }
                } else {
                    fn0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject11, true);
                }
                fn0Var2.x1();
                return;
            case 20:
                org.telegram.ui.lo0.f0((org.telegram.ui.lo0) obj5, (TLRPC.TL_error) obj, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj2);
                return;
            case 21:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.ou0 ou0Var2 = (org.telegram.ui.ou0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.rt0) obj5).f38059r;
                photoViewer.f31780m4 = null;
                org.telegram.ui.iu0 iu0Var = photoViewer.f31679b0;
                if (iu0Var != null && photoViewer.f31697d0 != null) {
                    iu0Var.setLayerType(0, null);
                    photoViewer.f31764k4 = 0;
                    photoViewer.F1();
                    photoViewer.f31772l4 = 0L;
                    photoViewer.D1 = null;
                    photoViewer.B1.f47273a = false;
                    photoViewer.E1 = null;
                    photoViewer.C1.f47273a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.f31679b0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.qu0 qu0Var = photoViewer.f31790n4;
                    if (qu0Var != null) {
                        qu0Var.f37487a.setVisible(true, true);
                    }
                    org.telegram.ui.qu0 qu0Var2 = photoViewer.f31799o4;
                    if (qu0Var2 != null && !qu0Var2.f37502s) {
                        qu0Var2.f37487a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.Z1) != 3 && i17 != 1 && ((ou0Var = photoViewer.d) == null || !ou0Var.O())) {
                        photoViewer.R1();
                    }
                    i71 i71Var = photoViewer.C2;
                    if (i71Var != null && i71Var.y() && photoViewer.f31796o1 && !photoViewer.f31704d7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.C2.n());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.f31817q4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (ou0Var2 != null) {
                        ou0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj3;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj2;
                if (((TLRPC.TL_error) obj) != null) {
                    privacyControlActivity.B0();
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
                    privacyControlActivity.x0();
                }
                privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            case 23:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.lx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    ic Q = qc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.f25671j = 5000;
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
                if (tL_error13 != null && (str2 = tL_error13.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                    if (privacyControlActivity2.getParentActivity() != null) {
                        Activity parentActivity = privacyControlActivity2.getParentActivity();
                        f6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, f6Var);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                        d2Var2.O = string;
                        d2Var2.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(d2Var2);
                        return;
                    }
                    return;
                }
                kf.k0.v(R.string.UnknownError, qc.a0(privacyControlActivity2), R.raw.error, 36);
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.ok okVar = (org.telegram.messenger.ok) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    okVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32155w0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19478a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.kl0(okVar, 11));
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(d2Var3);
                return;
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.mz0 mz0Var = (org.telegram.ui.mz0) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject12 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject12;
                    if (profileActivity2.f32011b1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f32011b1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f32019c1));
                    }
                    String str10 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    qc qcVar = new qc(mz0Var.f26859w, profileActivity2.f32155w0);
                    int i22 = R.drawable.filled_username;
                    int i23 = R.string.FragmentChannelUsername;
                    if (TextUtils.isEmpty(formatCurrency2)) {
                        o10 = "";
                    } else {
                        o10 = android.support.v4.media.a.o("(", formatCurrency2, ")");
                    }
                    ic w10 = qcVar.w(i22, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i23, str10, format, formatCurrency, o10)), new org.telegram.ui.gr0(19, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.ib0 ib0Var = new org.telegram.ui.ib0(14, profileActivity2, tL_collectibleInfo);
                    nb nbVar = w10.e;
                    if (nbVar != null) {
                        nbVar.setOnClickListener(ib0Var);
                    }
                    w10.k(false);
                    return;
                }
                qc.b0(tL_error14);
                return;
            case 26:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                String str11 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.f20.a(profileActivity3.getParentActivity(), 1, str11, user3, (TL_fragment.TL_collectibleInfo) tLObject13, profileActivity3.f32155w0);
                    return;
                } else {
                    qc.b0(tL_error15);
                    return;
                }
            case 27:
                ProfileActivity.X((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 28:
                org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) obj5;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = x01Var.e;
                if (((String) obj4).equals(x01Var.f39806y)) {
                    if (!x01Var.f39804w && (p2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) p2Var2).M.f31483b.getImageReceiver().startAnimation();
                            ((ProfileActivity) p2Var2).M.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    x01Var.f39804w = true;
                    x01Var.f39802r = arrayList5;
                    x01Var.f39803s = arrayList6;
                    x01Var.f39801n = arrayList7;
                    x01Var.l();
                    if (p2Var2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) p2Var2).M.f31483b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) obj5;
                x61Var.getClass();
                x61Var.p((View) obj4, Long.valueOf(((u5) obj3).documentId), (TLRPC.Document) obj2, ((org.telegram.ui.f61) obj).v, null);
                return;
        }
    }

    public jy0(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f26077a = i10;
        this.f26078b = callback;
        this.f26079c = tLObject;
        this.d = obj;
        this.f26080f = tL_error;
        this.e = tLObject2;
    }

    public jy0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26077a = i10;
        this.f26078b = obj;
        this.f26079c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f26080f = obj5;
    }

    public jy0(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, int i10) {
        this.f26077a = i10;
        this.f26078b = obj;
        this.d = obj2;
        this.f26079c = tLObject;
        this.e = tLObject2;
        this.f26080f = tL_error;
    }

    public jy0(org.telegram.ui.bn0 bn0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
        this.f26077a = 19;
        this.f26078b = bn0Var;
        this.f26080f = tL_error;
        this.d = bundle;
        this.f26079c = tLObject;
        this.e = tL_auth_resendCode;
    }
}
