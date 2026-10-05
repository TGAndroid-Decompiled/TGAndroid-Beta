package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ClippingImageView;
public final class f90 implements Runnable {
    public final int f36230a;
    public final Object f36231b;
    public final Object f36232c;
    public final Object d;
    public final Object f36233e;
    public final Object f36234f;

    public f90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f36230a = i10;
        this.f36231b = callback;
        this.d = tLObject;
        this.f36232c = obj;
        this.f36234f = tL_error;
        this.f36233e = tLObject2;
    }

    @Override
    public final void run() {
        TLRPC.WallPaperSettings wallPaperSettings;
        int i10;
        TLRPC.ThemeSettings themeSettings;
        so0 so0Var;
        org.telegram.ui.Components.yc b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        wu0 wu0Var;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        String q6;
        int i18 = this.f36230a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i19 = 0;
        Object obj = this.f36233e;
        Object obj2 = this.f36234f;
        Object obj3 = this.f36232c;
        Object obj4 = this.d;
        Object obj5 = this.f36231b;
        switch (i18) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                h90 h90Var = (h90) obj3;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject;
                    if (tL_wallPaper3.pattern) {
                        String str2 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        wi1 wi1Var = new wi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        wi1Var.f42572g = tL_wallPaper3;
                        tL_wallPaper3 = wi1Var;
                    }
                    pd1 pd1Var = new pd1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    pd1Var.F1 = z10;
                    pd1Var.E1 = z11;
                    pd1Var.f39527n1 = wallPaperSettings3.intensity;
                    launchActivity.p0(pd1Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, null, sb2.toString()));
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                uy uyVar = (uy) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.User user = (TLRPC.User) obj;
                String str3 = (String) obj2;
                ArrayList arrayList = launchActivity2.E0;
                if (uyVar != null) {
                    if (n2Var != null) {
                        n2Var.dismissCurrentDialog();
                    }
                    while (i19 < arrayList.size()) {
                        if (((Dialog) arrayList.get(i19)).isShowing()) {
                            ((Dialog) arrayList.get(i19)).dismiss();
                        }
                        i19++;
                    }
                    arrayList.clear();
                    launchActivity2.p0(uyVar);
                    return;
                } else if (n2Var instanceof yn) {
                    ((yn) n2Var).V9(user.f20194id, str3, true);
                    return;
                } else {
                    return;
                }
            case 2:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str4 = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TLRPC.TL_urlAuthResultRequest) {
                        gl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject2, null, null, null, false, null);
                        return;
                    } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        gl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject2, null, null, null, false, null);
                        return;
                    } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.e5.q0(U, str4, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error2 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                        gl0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        return;
                    } else {
                        gl0.a().d0(tL_error2, false);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                h90 h90Var2 = (h90) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject3 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject3;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0(org.telegram.ui.ActionBar.i6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.V0 = b2Var;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = N0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper;
                                    launchActivity4.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    return;
                                }
                            }
                            try {
                                h90Var2.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                        } else {
                            i19 = 1;
                        }
                        i10 = i19;
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = FileLoader.getAttachFileName(document);
                            launchActivity4.V0 = b2Var;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.T0.document, tL_theme, 1, 1);
                            i10 = 0;
                        }
                        i10 = 1;
                    }
                } else {
                    if (tL_error3 == null || !"THEME_FORMAT_INVALID".equals(tL_error3.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        h90Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (i10 == 1) {
                        launchActivity4.B0(org.telegram.ui.Components.e5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.B0(org.telegram.ui.Components.e5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 4:
                dc0 dc0Var = (dc0) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                String str5 = (String) obj;
                int i20 = dc0Var.f35778b;
                LaunchActivity launchActivity5 = dc0Var.f35777a;
                if (tL_error4 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text)) {
                        b10 = dc0.b();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        b10 = dc0.b();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.bi.o(i11, b10, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStars) {
                        xh.p4 p4Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        yh.u5.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject4, new xb0(dc0Var, 1), new j90(p4Var, 1));
                        return;
                    }
                    if (tLObject4 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject4;
                        MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                        so0Var = new so0(paymentForm, null, str5, LaunchActivity.U());
                    } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                        so0Var = new so0((TLRPC.PaymentReceipt) tLObject4);
                    } else {
                        so0Var = null;
                    }
                    if (so0Var != null) {
                        xh.p4 p4Var2 = launchActivity5.Y0;
                        if (p4Var2 != null) {
                            launchActivity5.Y0 = null;
                            so0Var.Z0 = new nf(10, p4Var2);
                        }
                        dc0Var.n(so0Var, false);
                    }
                }
                dc0Var.a();
                return;
            case 5:
                ug0.S((ug0) obj5, (TLRPC.TL_error) obj2, (String) obj3, (String) obj4, (String) obj);
                return;
            case 6:
                TLObject tLObject5 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                ug0 ug0Var = ((ee0) obj5).W;
                if (tLObject5 instanceof TLRPC.TL_auth_sentCode) {
                    ug0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject5, true);
                    return;
                } else if (tL_error5 != null && tL_error5.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                    org.telegram.ui.Components.e5.f0(i12, tL_error5, ug0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 7:
                jf0 jf0Var = (jf0) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                ug0 ug0Var2 = jf0Var.E;
                ug0Var2.k1(false, true);
                jf0Var.f37691r = false;
                if (tLObject6 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject6;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ug0Var2.u1(13, true, bundle2, false);
                    return;
                }
                String str6 = tL_error6.text;
                if (str6 != null) {
                    if (str6.contains("EMAIL_INVALID")) {
                        jf0Var.o();
                        return;
                    } else if (tL_error6.text.contains("EMAIL_NOT_ALLOWED")) {
                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error6.text.contains("PHONE_PASSWORD_FLOOD")) {
                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    } else if (tL_error6.text.contains("PHONE_NUMBER_FLOOD")) {
                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        return;
                    } else if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            ug0Var2.u1(0, true, null, true);
                            ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            return;
                        } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                            ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            return;
                        } else if (tL_error6.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.n2) ug0Var2).currentAccount;
                            org.telegram.ui.Components.e5.f0(i13, tL_error6, ug0Var2, sendverifyemailcode, jf0Var.f37693w);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        return;
                    }
                }
                return;
            case 8:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                ug0 ug0Var3 = ((jf0) obj5).E;
                if ((tLObject7 instanceof TL_account.TL_emailVerified) && ug0Var3.F == 3) {
                    ug0Var3.finishFragment();
                    ug0Var3.f41242d0.run();
                    return;
                } else if (tLObject7 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject7;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    ug0Var3.g1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error7 != null) {
                    if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                        ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error7.text.contains("EMAIL_TOKEN_INVALID")) {
                        ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        return;
                    } else if (tL_error7.code != -1000) {
                        i14 = ((org.telegram.ui.ActionBar.n2) ug0Var3).currentAccount;
                        org.telegram.ui.Components.e5.f0(i14, tL_error7, ug0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 9:
                final dg0 dg0Var = (dg0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                ug0 ug0Var4 = dg0Var.v;
                dg0Var.f35805b.setLoading(false);
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject8;
                    ug0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    so0 so0Var2 = new so0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ug0Var4, true);
                    so0Var2.V0 = true;
                    so0Var2.f40566c1 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final dg0 dg0Var2 = dg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    dg0 dg0Var3 = dg0Var2;
                                                    if (!dg0Var3.f35808f) {
                                                        dg0Var3.f35808f = true;
                                                        dg0Var3.h = str7;
                                                        dg0Var3.f35809n = str8;
                                                        dg0Var3.f35810r = j3;
                                                        dg0Var3.f35805b.setLoading(true);
                                                        dg0Var3.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    dg0 dg0Var4 = dg0Var2;
                                                    if (!dg0Var4.f35808f) {
                                                        dg0Var4.f35808f = true;
                                                        dg0Var4.h = str9;
                                                        dg0Var4.f35809n = str10;
                                                        dg0Var4.f35810r = j10;
                                                        dg0Var4.f35805b.setLoading(true);
                                                        dg0Var4.p();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final dg0 dg0Var3 = dg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    dg0 dg0Var32 = dg0Var3;
                                                    if (!dg0Var32.f35808f) {
                                                        dg0Var32.f35808f = true;
                                                        dg0Var32.h = str7;
                                                        dg0Var32.f35809n = str8;
                                                        dg0Var32.f35810r = j3;
                                                        dg0Var32.f35805b.setLoading(true);
                                                        dg0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    dg0 dg0Var4 = dg0Var3;
                                                    if (!dg0Var4.f35808f) {
                                                        dg0Var4.f35808f = true;
                                                        dg0Var4.h = str9;
                                                        dg0Var4.f35809n = str10;
                                                        dg0Var4.f35810r = j10;
                                                        dg0Var4.f35805b.setLoading(true);
                                                        dg0Var4.p();
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
                    so0Var2.f40568d1 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final dg0 dg0Var2 = dg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    dg0 dg0Var32 = dg0Var2;
                                                    if (!dg0Var32.f35808f) {
                                                        dg0Var32.f35808f = true;
                                                        dg0Var32.h = str7;
                                                        dg0Var32.f35809n = str8;
                                                        dg0Var32.f35810r = j3;
                                                        dg0Var32.f35805b.setLoading(true);
                                                        dg0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    dg0 dg0Var4 = dg0Var2;
                                                    if (!dg0Var4.f35808f) {
                                                        dg0Var4.f35808f = true;
                                                        dg0Var4.h = str9;
                                                        dg0Var4.f35809n = str10;
                                                        dg0Var4.f35810r = j10;
                                                        dg0Var4.f35805b.setLoading(true);
                                                        dg0Var4.p();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final dg0 dg0Var3 = dg0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str7 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    dg0 dg0Var32 = dg0Var3;
                                                    if (!dg0Var32.f35808f) {
                                                        dg0Var32.f35808f = true;
                                                        dg0Var32.h = str7;
                                                        dg0Var32.f35809n = str8;
                                                        dg0Var32.f35810r = j3;
                                                        dg0Var32.f35805b.setLoading(true);
                                                        dg0Var32.p();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str9 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    dg0 dg0Var4 = dg0Var3;
                                                    if (!dg0Var4.f35808f) {
                                                        dg0Var4.f35808f = true;
                                                        dg0Var4.h = str9;
                                                        dg0Var4.f35809n = str10;
                                                        dg0Var4.f35810r = j10;
                                                        dg0Var4.f35805b.setLoading(true);
                                                        dg0Var4.p();
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
                    so0Var2.f40571e1 = new l20(dg0Var, 1);
                    ug0Var4.presentFragment(so0Var2);
                    return;
                } else if (tL_error8 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error8.text)) {
                        AndroidUtilities.runOnUIThread(new zf0(dg0Var, 0));
                        return;
                    }
                    String str7 = tL_error8.text;
                    dg0Var.f35807e = str7;
                    new org.telegram.ui.Components.yc(ug0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str7));
                    return;
                } else {
                    new org.telegram.ui.Components.yc(ug0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                }
            case 10:
                hj0 hj0Var = (hj0) obj5;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                jg.b bVar = (jg.b) obj3;
                String str8 = (String) obj4;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                hj0Var.f37116y = true;
                if (tL_error9 == null && bVar != null) {
                    hj0Var.v.put(str8, bVar);
                    fa1 fa1Var = hj0Var.f37112r;
                    fa1Var.f36247e = bVar;
                    fa1Var.f36246c = tL_loadAsyncGraph.f20278x;
                    hj0Var.g0();
                    return;
                }
                hj0Var.g0();
                return;
            case 11:
                ak0.n((ak0) obj5, (TLRPC.TL_contacts_importedContacts) obj3, (TLRPC.TL_inputPhoneContact) obj4, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                return;
            case 12:
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                nl0 nl0Var = (nl0) obj3;
                o0.a aVar = (o0.a) obj4;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                kn0 kn0Var = ((sm0) obj5).f40550a;
                if (tL_error10 != null) {
                    i15 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
                    org.telegram.ui.Components.e5.f0(i15, tL_error10, kn0Var, verifyemail2, new Object[0]);
                    aVar.c(null, null);
                    return;
                }
                ((nm0) kn0Var.B1).c(kn0Var.E, (String) kn0Var.f38120s1.get("email"), null, null, null, null, null, null, null, null, nl0Var, aVar);
                return;
            case 13:
                gn0 gn0Var = (gn0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj2;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject9 = (TLObject) obj4;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                kn0 kn0Var2 = gn0Var.Q;
                gn0Var.J = false;
                if (tL_error11 != null) {
                    i16 = ((org.telegram.ui.ActionBar.n2) kn0Var2).currentAccount;
                    org.telegram.ui.ActionBar.b2 f02 = org.telegram.ui.Components.e5.f0(i16, tL_error11, kn0Var2, tL_auth_resendCode2, new Object[0]);
                    if (f02 != null && tL_error11.text.contains("PHONE_CODE_EXPIRED")) {
                        f02.m0 = new bn0(gn0Var, 0);
                    }
                } else {
                    kn0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject9, true);
                }
                kn0Var2.x1();
                return;
            case 14:
                so0.f0((so0) obj5, (TLRPC.TL_error) obj2, (TLObject) obj4, (String) obj3, (TL_account.getPassword) obj);
                return;
            case 15:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                ArrayList arrayList2 = (ArrayList) obj4;
                Integer num = (Integer) obj;
                wu0 wu0Var2 = (wu0) obj2;
                PhotoViewer photoViewer = ((au0) obj5).f34975r;
                photoViewer.f34013p4 = null;
                qu0 qu0Var = photoViewer.f33914e0;
                if (qu0Var != null && photoViewer.f33931g0 != null) {
                    qu0Var.setLayerType(0, null);
                    photoViewer.f33995n4 = 0;
                    photoViewer.G1();
                    photoViewer.f34004o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.f15531a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.f15531a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.f33914e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    yu0 yu0Var = photoViewer.f34021q4;
                    if (yu0Var != null) {
                        yu0Var.f43620a.setVisible(true, true);
                    }
                    yu0 yu0Var2 = photoViewer.f34030r4;
                    if (yu0Var2 != null && !yu0Var2.f43636s) {
                        yu0Var2.f43620a.setVisible(false, true);
                    }
                    if (arrayList2 != null && (i17 = photoViewer.f33897c2) != 3 && i17 != 1 && ((wu0Var = photoViewer.d) == null || !wu0Var.O())) {
                        photoViewer.S1();
                    }
                    org.telegram.ui.Components.e81 e81Var = photoViewer.F2;
                    if (e81Var != null && e81Var.y() && photoViewer.f34027r1 && !photoViewer.f33938g7.isEmpty()) {
                        PhotoViewer.Y(photoViewer, photoViewer.F2.n());
                        PhotoViewer.X(photoViewer, true);
                    }
                    if (photoViewer.f34049t4) {
                        PhotoViewer.Z(photoViewer, num.intValue());
                    }
                    if (wu0Var2 != null) {
                        wu0Var2.d();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj3;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj4;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj2) != null) {
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
                    long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j3 > 0) {
                        globalPrivacySettings.flags = i21 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j3;
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
            case 17:
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj2;
                PrivacyControlActivity privacyControlActivity2 = ((sx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.rc Q = org.telegram.ui.Components.yc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.f30427j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    if (tL_birthday == null) {
                        userFull.flags2 &= -33;
                    } else {
                        userFull.flags2 |= 32;
                    }
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                if (tL_error12 != null && (str = tL_error12.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (privacyControlActivity2.getParentActivity() != null) {
                        Activity parentActivity = privacyControlActivity2.getParentActivity();
                        d6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, d6Var);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20377a;
                        b2Var2.R = string;
                        b2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(b2Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.q.p(R.string.UnknownError, org.telegram.ui.Components.yc.a0(privacyControlActivity2), R.raw.error, 36);
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj4;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.messenger.mk mkVar = (org.telegram.messenger.mk) obj2;
                if (!(((TLRPC.ChannelParticipant) obj3) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    mkVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34396z0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20377a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new jl0(mkVar, 12));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(b2Var3);
                return;
            case 19:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                sz0 sz0Var = (sz0) obj;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                if (tLObject10 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject10;
                    if (profileActivity2.f34253e1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f34253e1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f34261f1));
                    }
                    String str9 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(sz0Var.f25079w, profileActivity2.f34396z0);
                    int i22 = R.drawable.filled_username;
                    int i23 = R.string.FragmentChannelUsername;
                    if (TextUtils.isEmpty(formatCurrency2)) {
                        q6 = "";
                    } else {
                        q6 = a4.a.q("(", formatCurrency2, ")");
                    }
                    org.telegram.ui.Components.rc w10 = ycVar.w(i22, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i23, str9, format, formatCurrency, q6)), new wx0(5, profileActivity2, tL_collectibleInfo)));
                    tv tvVar = new tv(29, profileActivity2, tL_collectibleInfo);
                    org.telegram.ui.Components.vb vbVar = w10.f30423e;
                    if (vbVar != null) {
                        vbVar.setOnClickListener(tvVar);
                    }
                    w10.k(false);
                    return;
                }
                org.telegram.ui.Components.yc.b0(tL_error13);
                return;
            case 20:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                String str10 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj2;
                if (tLObject11 instanceof TL_fragment.TL_collectibleInfo) {
                    h20.a(profileActivity3.getParentActivity(), 1, str10, user3, (TL_fragment.TL_collectibleInfo) tLObject11, profileActivity3.f34396z0);
                    return;
                } else {
                    org.telegram.ui.Components.yc.b0(tL_error14);
                    return;
                }
            case 21:
                ProfileActivity.W((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj2);
                return;
            case 22:
                c11 c11Var = (c11) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = c11Var.f35276e;
                if (((String) obj3).equals(c11Var.f35283y)) {
                    if (!c11Var.f35281w && (n2Var2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) n2Var2).P.f31549b.getImageReceiver().startAnimation();
                            ((ProfileActivity) n2Var2).P.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    c11Var.f35281w = true;
                    c11Var.f35279r = arrayList3;
                    c11Var.f35280s = arrayList4;
                    c11Var.f35278n = arrayList5;
                    c11Var.l();
                    if (n2Var2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) n2Var2).P.f31549b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 23:
                a71 a71Var = (a71) obj5;
                a71Var.getClass();
                a71Var.p((View) obj3, Long.valueOf(((org.telegram.ui.Components.z5) obj4).documentId), (TLRPC.Document) obj, ((j61) obj2).v, null);
                return;
            case 24:
                k71 k71Var = (k71) obj5;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj2;
                TLObject tLObject12 = (TLObject) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user4 = (TLRPC.User) obj;
                k71Var.getClass();
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject12;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    k71Var.R(user4, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 25:
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error16 != null) {
                    callback.run(tL_error16);
                    return;
                } else if (tLObject13 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject13;
                    messagesController.putUsers(tL_premium_myBoosts.users, false);
                    messagesController.putChats(tL_premium_myBoosts.chats, false);
                    callback2.run(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 26:
                TLRPC.TL_error tL_error17 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.w wVar = (org.telegram.messenger.w) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                MessagesController messagesController2 = (MessagesController) obj3;
                org.telegram.messenger.g2 g2Var = (org.telegram.messenger.g2) obj;
                if (tL_error17 != null) {
                    wVar.run(tL_error17);
                    return;
                } else if (tLObject14 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject14;
                    messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                    messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                    g2Var.run(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 27:
                TLObject tLObject15 = (TLObject) obj4;
                MessagesController messagesController3 = (MessagesController) obj5;
                ai.e4 e4Var = (ai.e4) obj3;
                tg.f fVar = (tg.f) obj;
                TLRPC.TL_error tL_error18 = (TLRPC.TL_error) obj2;
                if (tLObject15 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject15;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    e4Var.run(tL_payments_checkedGiftCode);
                }
                fVar.run(tL_error18);
                return;
            case 28:
                tg.m1.P((tg.m1) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                xh.z4 z4Var = (xh.z4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj3;
                TLRPC.TL_error tL_error19 = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                int i24 = z4Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var3 = z4Var.f25357n;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity2 = n2Var3.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i24);
                    of.b bVar2 = new of.b(7, false);
                    bVar2.O(z4Var.f50347e0.h);
                    billingController.launchBillingFlow(parentActivity2, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar2.i()));
                    return;
                } else if (tL_error19 != null) {
                    org.telegram.ui.Components.e5.f0(i24, tL_error19, n2Var3, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                } else {
                    return;
                }
        }
    }

    public f90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36230a = i10;
        this.f36231b = obj;
        this.f36232c = obj2;
        this.d = obj3;
        this.f36233e = obj4;
        this.f36234f = obj5;
    }

    public f90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f36230a = i10;
        this.f36231b = obj;
        this.d = tLObject;
        this.f36232c = obj2;
        this.f36233e = obj3;
        this.f36234f = tL_error;
    }

    public f90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36230a = i10;
        this.f36231b = obj;
        this.f36234f = tL_error;
        this.f36232c = obj2;
        this.d = obj3;
        this.f36233e = obj4;
    }

    public f90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f36230a = i10;
        this.f36231b = obj;
        this.f36234f = tL_error;
        this.d = tLObject;
        this.f36232c = obj2;
        this.f36233e = obj3;
    }

    public f90(TLObject tLObject, MessagesController messagesController, ai.e4 e4Var, tg.f fVar, TLRPC.TL_error tL_error) {
        this.f36230a = 27;
        this.d = tLObject;
        this.f36231b = messagesController;
        this.f36232c = e4Var;
        this.f36233e = fVar;
        this.f36234f = tL_error;
    }

    public f90(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f36230a = i10;
        this.f36234f = tL_error;
        this.f36231b = callback;
        this.d = tLObject;
        this.f36232c = messagesController;
        this.f36233e = callback2;
    }

    public f90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, h90 h90Var, TLRPC.TL_error tL_error) {
        this.f36230a = 3;
        this.f36231b = launchActivity;
        this.d = tLObject;
        this.f36233e = b2Var;
        this.f36232c = h90Var;
        this.f36234f = tL_error;
    }

    public f90(ak0 ak0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f36230a = 11;
        this.f36231b = ak0Var;
        this.f36232c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f36234f = tL_error;
        this.f36233e = tL_contacts_importContacts;
    }
}
