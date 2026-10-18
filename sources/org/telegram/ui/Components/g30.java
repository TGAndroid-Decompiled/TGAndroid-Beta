package org.telegram.ui.Components;

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
import org.telegram.ui.mc1;
import org.telegram.ui.uh1;
public final class g30 implements Runnable {
    public final int f26471a;
    public final Object f26472b;
    public final Object f26473c;
    public final Object d;
    public final Object e;
    public final Object f26474f;

    public g30(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.f26471a = 0;
        this.f26472b = view;
        this.f26473c = view2;
        this.f26474f = windowManager;
        this.d = view3;
        this.e = view4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i10;
        TLRPC.ThemeSettings themeSettings;
        org.telegram.ui.go0 go0Var;
        xc d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ju0 ju0Var;
        String str2;
        org.telegram.ui.ActionBar.d6 d6Var;
        String p5;
        int i18 = this.f26471a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i19 = 0;
        Object obj = this.f26474f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f26473c;
        Object obj5 = this.f26472b;
        switch (i18) {
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
                oy0 oy0Var = (oy0) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TextView textView = (TextView) obj;
                oy0Var.f29105p0 = 0;
                String str4 = oy0Var.f29104o0;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(oy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21345w6));
                        oy0Var.f29106q0 = true;
                        return;
                    }
                    textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                    textView.setTextColor(oy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21214p7));
                    oy0Var.f29106q0 = false;
                    return;
                }
                return;
            case 2:
                zy0 zy0Var = (zy0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        qc M = xc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.f29645j = 5000;
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
                        MessagesStorage.getInstance(zy0Var.f33052a).updateUserInfo(userFull, false);
                    }
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zy0Var.f33053b.getContext());
                        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.g0.q(R.string.UnknownError, xc.a0(U), R.raw.error, 36);
                    return;
                }
                return;
            case 3:
                q31 q31Var = (q31) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                i80 i80Var = (i80) obj2;
                i80 i80Var2 = (i80) obj;
                org.telegram.ui.sn snVar = q31Var.h;
                if (((MessagesController) obj4).isDialogMuted(q31Var.f29567c, tL_forumTopic.f20331id)) {
                    i80Var.u();
                    NotificationsController.getInstance(q31Var.f29565b).muteDialog(q31Var.f29567c, tL_forumTopic.f20331id, false);
                    if (xc.a(snVar)) {
                        xc.z(snVar, 4, 0, q31Var.d).j();
                        return;
                    }
                    return;
                }
                i80Var.K(i80Var2);
                return;
            case 4:
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject3 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject3;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i19 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i19);
                        i19++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f20299id = stickerSetCovered2.set.f20306id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(gtVar.f37347r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i2.d.h(1, tL_messages_myStickers.sets)).set.f20306id;
                        ConnectionsManager.getInstance(gtVar.f37347r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.ea(gtVar, arrayList, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ey.E0((org.telegram.ui.ey) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                org.telegram.ui.s50.C((org.telegram.ui.s50) obj5, (org.telegram.ui.ActionBar.b2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                org.telegram.ui.s50.z((org.telegram.ui.s50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.b80 b80Var = (org.telegram.ui.b80) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.C1;
                try {
                    b80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject4 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject4;
                    if (tL_wallPaper3.pattern) {
                        String str5 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        uh1 uh1Var = new uh1(str5, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        uh1Var.f42011g = tL_wallPaper3;
                        tL_wallPaper3 = uh1Var;
                    }
                    mc1 mc1Var = new mc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    mc1Var.F1 = z10;
                    mc1Var.E1 = z11;
                    mc1Var.f39161n1 = wallPaperSettings3.intensity;
                    launchActivity.t0(mc1Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error3.text);
                launchActivity.F0(f5.M(launchActivity, null, sb2.toString()));
                return;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList3 = launchActivity2.E0;
                if (eyVar != null) {
                    if (n2Var != null) {
                        n2Var.dismissCurrentDialog();
                    }
                    while (i19 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i19)).isShowing()) {
                            ((Dialog) arrayList3.get(i19)).dismiss();
                        }
                        i19++;
                    }
                    arrayList3.clear();
                    launchActivity2.t0(eyVar);
                    return;
                } else if (n2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) n2Var).ba(user.f20426id, str6, true);
                    return;
                } else {
                    return;
                }
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (tLObject5 != null) {
                    if (tLObject5 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.wk0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject5, null, null, null, false, null);
                        return;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.wk0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject5, null, null, null, false, null);
                        return;
                    } else if (tLObject5 instanceof TLRPC.TL_urlAuthResultDefault) {
                        f5.p0(U2, str7, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        org.telegram.ui.wk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        return;
                    } else {
                        org.telegram.ui.wk0.a().f0(tL_error4, false);
                        return;
                    }
                } else {
                    return;
                }
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.b80 b80Var2 = (org.telegram.ui.b80) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.C1;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject6;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0(org.telegram.ui.ActionBar.h6.r0(themeSettings));
                        if (O0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.V0 = b2Var;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = O0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper;
                                    launchActivity4.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    return;
                                }
                            }
                            try {
                                b80Var2.run();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, O0);
                        } else {
                            i19 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = FileLoader.getAttachFileName(document);
                            launchActivity4.V0 = b2Var;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        i10 = 1;
                    }
                    i10 = i19;
                } else {
                    if (tL_error5 == null || !"THEME_FORMAT_INVALID".equals(tL_error5.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        b80Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (i10 == 1) {
                        launchActivity4.F0(f5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.F0(f5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.kb0 kb0Var = (org.telegram.ui.kb0) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str8 = (String) obj;
                int i20 = kb0Var.f38469b;
                LaunchActivity launchActivity5 = kb0Var.f38468a;
                if (tL_error6 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error6.text)) {
                        d = org.telegram.ui.kb0.d();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        d = org.telegram.ui.kb0.d();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.kk.q(i11, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        yh.o4 o4Var = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        ai.ga.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new org.telegram.ui.fb0(kb0Var, 1), new org.telegram.ui.d90(o4Var, 1));
                        return;
                    }
                    if (tLObject7 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                        MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                        go0Var = new org.telegram.ui.go0(paymentForm, null, str8, LaunchActivity.U());
                    } else if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                        go0Var = new org.telegram.ui.go0((TLRPC.PaymentReceipt) tLObject7);
                    } else {
                        go0Var = null;
                    }
                    if (go0Var != null) {
                        yh.o4 o4Var2 = launchActivity5.Y0;
                        if (o4Var2 != null) {
                            launchActivity5.Y0 = null;
                            go0Var.Z0 = new org.telegram.ui.jf(10, o4Var2);
                        }
                        kb0Var.u(go0Var, false);
                    }
                }
                kb0Var.c();
                return;
            case 13:
                org.telegram.ui.fg0.U((org.telegram.ui.fg0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.fg0 fg0Var = ((org.telegram.ui.od0) obj5).W;
                if (tLObject8 instanceof TLRPC.TL_auth_sentCode) {
                    fg0Var.g1(bundle, (TLRPC.TL_auth_sentCode) tLObject8, true);
                    return;
                } else if (tL_error7 != null && tL_error7.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
                    f5.e0(i12, tL_error7, fg0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.te0 te0Var = (org.telegram.ui.te0) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.fg0 fg0Var2 = te0Var.E;
                fg0Var2.k1(false, true);
                te0Var.f41699r = false;
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
                        te0Var.o();
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
                            i13 = ((org.telegram.ui.ActionBar.n2) fg0Var2).currentAccount;
                            f5.e0(i13, tL_error8, fg0Var2, sendverifyemailcode, te0Var.f41701w);
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
            case 16:
                TLObject tLObject10 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.fg0 fg0Var3 = ((org.telegram.ui.te0) obj5).E;
                if ((tLObject10 instanceof TL_account.TL_emailVerified) && fg0Var3.F == 3) {
                    fg0Var3.finishFragment();
                    fg0Var3.f36932d0.run();
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
                        i14 = ((org.telegram.ui.ActionBar.n2) fg0Var3).currentAccount;
                        f5.e0(i14, tL_error9, fg0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 17:
                final org.telegram.ui.of0 of0Var = (org.telegram.ui.of0) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                org.telegram.ui.fg0 fg0Var4 = of0Var.v;
                of0Var.f39785b.setLoading(false);
                if (tLObject11 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject11;
                    fg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.go0 go0Var2 = new org.telegram.ui.go0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, fg0Var4, true);
                    go0Var2.V0 = true;
                    go0Var2.f37261c1 = new Utilities.Callback() {
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
                                                    if (!of0Var3.f39787f) {
                                                        of0Var3.f39787f = true;
                                                        of0Var3.h = str10;
                                                        of0Var3.f39788n = str11;
                                                        of0Var3.f39789r = j10;
                                                        of0Var3.f39785b.setLoading(true);
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
                                                    if (!of0Var4.f39787f) {
                                                        of0Var4.f39787f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f39788n = str13;
                                                        of0Var4.f39789r = j11;
                                                        of0Var4.f39785b.setLoading(true);
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
                                                    if (!of0Var32.f39787f) {
                                                        of0Var32.f39787f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.f39788n = str11;
                                                        of0Var32.f39789r = j10;
                                                        of0Var32.f39785b.setLoading(true);
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
                                                    if (!of0Var4.f39787f) {
                                                        of0Var4.f39787f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f39788n = str13;
                                                        of0Var4.f39789r = j11;
                                                        of0Var4.f39785b.setLoading(true);
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
                    go0Var2.f37263d1 = new Utilities.Callback() {
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
                                                    if (!of0Var32.f39787f) {
                                                        of0Var32.f39787f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.f39788n = str11;
                                                        of0Var32.f39789r = j10;
                                                        of0Var32.f39785b.setLoading(true);
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
                                                    if (!of0Var4.f39787f) {
                                                        of0Var4.f39787f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f39788n = str13;
                                                        of0Var4.f39789r = j11;
                                                        of0Var4.f39785b.setLoading(true);
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
                                                    if (!of0Var32.f39787f) {
                                                        of0Var32.f39787f = true;
                                                        of0Var32.h = str10;
                                                        of0Var32.f39788n = str11;
                                                        of0Var32.f39789r = j10;
                                                        of0Var32.f39785b.setLoading(true);
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
                                                    if (!of0Var4.f39787f) {
                                                        of0Var4.f39787f = true;
                                                        of0Var4.h = str12;
                                                        of0Var4.f39788n = str13;
                                                        of0Var4.f39789r = j11;
                                                        of0Var4.f39785b.setLoading(true);
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
                    go0Var2.f37265e1 = new org.telegram.ui.v10(of0Var, 1);
                    fg0Var4.presentFragment(go0Var2);
                    return;
                } else if (tL_error10 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.lf0(of0Var, 0));
                        return;
                    }
                    String str10 = tL_error10.text;
                    of0Var.e = str10;
                    new xc(fg0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str10));
                    return;
                } else {
                    new xc(fg0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                }
            case 18:
                org.telegram.ui.wi0 wi0Var = (org.telegram.ui.wi0) obj5;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                kg.b bVar = (kg.b) obj3;
                String str11 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                wi0Var.f42901y = true;
                if (tL_error11 == null && bVar != null) {
                    wi0Var.v.put(str11, bVar);
                    org.telegram.ui.d91 d91Var = wi0Var.f42897r;
                    d91Var.e = bVar;
                    d91Var.f36128c = tL_loadAsyncGraph.f20507x;
                    wi0Var.g0();
                    return;
                }
                wi0Var.g0();
                return;
            case 19:
                org.telegram.ui.oj0.o((org.telegram.ui.oj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                return;
            case 20:
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) obj3;
                mi.q qVar = (mi.q) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.xm0 xm0Var = ((org.telegram.ui.gm0) obj5).f37241a;
                if (tL_error12 != null) {
                    i15 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                    f5.e0(i15, tL_error12, xm0Var, verifyemail2, new Object[0]);
                    qVar.p(null, null);
                    return;
                }
                ((org.telegram.ui.bm0) xm0Var.B1).c(xm0Var.E, (String) xm0Var.f43225s1.get("email"), null, null, null, null, null, null, null, null, ek0Var, qVar);
                return;
            case 21:
                org.telegram.ui.tm0 tm0Var = (org.telegram.ui.tm0) obj5;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject12 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.xm0 xm0Var2 = tm0Var.Q;
                tm0Var.J = false;
                if (tL_error13 != null) {
                    i16 = ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount;
                    org.telegram.ui.ActionBar.b2 e02 = f5.e0(i16, tL_error13, xm0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error13.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.m0 = new org.telegram.ui.pm0(tm0Var, 0);
                    }
                } else {
                    xm0Var2.k1(bundle4, (TLRPC.TL_auth_sentCode) tLObject12, true);
                }
                xm0Var2.w1();
                return;
            case 22:
                org.telegram.ui.go0.f0((org.telegram.ui.go0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.ju0 ju0Var2 = (org.telegram.ui.ju0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.nt0) obj5).f39573r;
                photoViewer.f33373p4 = null;
                org.telegram.ui.du0 du0Var = photoViewer.f33273e0;
                if (du0Var != null && photoViewer.f33290g0 != null) {
                    du0Var.setLayerType(0, null);
                    photoViewer.f33355n4 = 0;
                    photoViewer.G1();
                    photoViewer.f33364o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.f16878a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.f16878a = false;
                    photoViewer.D2();
                    photoViewer.z2();
                    photoViewer.f33273e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.lu0 lu0Var = photoViewer.f33381q4;
                    if (lu0Var != null) {
                        lu0Var.f38961a.setVisible(true, true);
                    }
                    org.telegram.ui.lu0 lu0Var2 = photoViewer.f33390r4;
                    if (lu0Var2 != null && !lu0Var2.f38976s) {
                        lu0Var2.f38961a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.f33257c2) != 3 && i17 != 1 && ((ju0Var = photoViewer.d) == null || !ju0Var.P())) {
                        photoViewer.S1();
                    }
                    a81 a81Var = photoViewer.F2;
                    if (a81Var != null && a81Var.y() && photoViewer.f33387r1 && !photoViewer.f33297g7.isEmpty()) {
                        PhotoViewer.Z(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Y(photoViewer, true);
                    }
                    if (photoViewer.f33409t4) {
                        PhotoViewer.a0(photoViewer, num.intValue());
                    }
                    if (ju0Var2 != null) {
                        ju0Var2.d();
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
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.ex0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    qc Q = xc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.f29645j = 5000;
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
                        d6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, d6Var);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20608a;
                        b2Var2.R = string;
                        b2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(b2Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.q(R.string.UnknownError, xc.a0(privacyControlActivity2), R.raw.error, 36);
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.ek ekVar = (org.telegram.messenger.ek) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    ekVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20608a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.rp0(ekVar, 10));
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(b2Var3);
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.dz0 dz0Var = (org.telegram.ui.dz0) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject13;
                    if (profileActivity2.f33614f1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f33614f1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f33621g1));
                    }
                    String str12 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    xc xcVar = new xc(dz0Var.f25686w, profileActivity2.A0);
                    int i22 = R.drawable.filled_username;
                    int i23 = R.string.FragmentChannelUsername;
                    if (TextUtils.isEmpty(formatCurrency2)) {
                        p5 = "";
                    } else {
                        p5 = a1.g.p("(", formatCurrency2, ")");
                    }
                    qc w9 = xcVar.w(i22, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i23, str12, format, formatCurrency, p5)), new org.telegram.ui.lv0(10, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.ef0 ef0Var = new org.telegram.ui.ef0(9, profileActivity2, tL_collectibleInfo);
                    ub ubVar = w9.e;
                    if (ubVar != null) {
                        ubVar.setOnClickListener(ef0Var);
                    }
                    w9.k(false);
                    return;
                }
                xc.d0(tL_error15);
                return;
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject14 = (TLObject) obj4;
                String str13 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error16 = (TLRPC.TL_error) obj;
                if (tLObject14 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.r10.a(profileActivity3.getParentActivity(), 1, str13, user3, (TL_fragment.TL_collectibleInfo) tLObject14, profileActivity3.A0);
                    return;
                } else {
                    xc.d0(tL_error16);
                    return;
                }
            default:
                ProfileActivity.Y((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public g30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26471a = i10;
        this.f26472b = obj;
        this.f26473c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f26474f = obj5;
    }
}
