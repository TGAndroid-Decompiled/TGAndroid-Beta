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
import org.telegram.ui.bi1;
import org.telegram.ui.tc1;
public final class i30 implements Runnable {
    public final int f29175a;
    public final Object f29176b;
    public final Object f29177c;
    public final Object d;
    public final Object e;
    public final Object f29178f;

    public i30(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.f29175a = 0;
        this.f29176b = view;
        this.f29177c = view2;
        this.f29178f = windowManager;
        this.d = view3;
        this.e = view4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i10;
        TLRPC.ThemeSettings themeSettings;
        org.telegram.ui.po0 po0Var;
        wc d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ou0 ou0Var;
        String str2;
        org.telegram.ui.ActionBar.u6 u6Var;
        String p10;
        int i18 = this.f29175a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i19 = 0;
        Object obj = this.f29178f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f29177c;
        Object obj5 = this.f29176b;
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
                cz0.v((cz0) obj5, (String) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TextView) obj);
                return;
            case 2:
                nz0 nz0Var = (nz0) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        qc M = wc.b0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.f31889j = 5000;
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
                        MessagesStorage.getInstance(nz0Var.f31102a).updateUserInfo(userFull, false);
                    }
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nz0Var.f31103b.getContext());
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.t.q(R.string.UnknownError, wc.b0(U), R.raw.error, 36);
                    return;
                }
                return;
            case 3:
                e41 e41Var = (e41) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                k80 k80Var = (k80) obj2;
                k80 k80Var2 = (k80) obj;
                org.telegram.ui.un unVar = e41Var.h;
                if (((MessagesController) obj4).isDialogMuted(e41Var.f27729c, tL_forumTopic.f22079id)) {
                    k80Var.u();
                    NotificationsController.getInstance(e41Var.f27727b).muteDialog(e41Var.f27729c, tL_forumTopic.f22079id, false);
                    if (wc.a(unVar)) {
                        wc.z(unVar, 4, 0, e41Var.d).j();
                        return;
                    }
                    return;
                }
                k80Var.K(k80Var2);
                return;
            case 4:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject2 instanceof TLRPC.TL_messages_myStickers)) {
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
                            tL_inputStickerSetID.f22047id = stickerSetCovered2.set.f22054id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(ftVar.f39465r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) ic.a.g(1, tL_messages_myStickers.sets)).set.f22054id;
                        ConnectionsManager.getInstance(ftVar.f39465r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.ea(ftVar, arrayList, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.cy.G0((org.telegram.ui.cy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                org.telegram.ui.v50.B((org.telegram.ui.v50) obj5, (org.telegram.ui.ActionBar.e2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                org.telegram.ui.v50.x((org.telegram.ui.v50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.sz szVar = (org.telegram.ui.sz) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                    if (tL_wallPaper3.pattern) {
                        String str3 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        bi1 bi1Var = new bi1(str3, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        bi1Var.f38107g = tL_wallPaper3;
                        tL_wallPaper3 = bi1Var;
                    }
                    tc1 tc1Var = new tc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    tc1Var.G1 = z10;
                    tc1Var.F1 = z11;
                    tc1Var.f43778o1 = wallPaperSettings3.intensity;
                    launchActivity.u0(tc1Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error2.text);
                launchActivity.G0(g5.M(launchActivity, null, sb2.toString()));
                return;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj4;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList3 = launchActivity2.E0;
                if (cyVar != null) {
                    if (r2Var != null) {
                        r2Var.dismissCurrentDialog();
                    }
                    while (i19 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i19)).isShowing()) {
                            ((Dialog) arrayList3.get(i19)).dismiss();
                        }
                        i19++;
                    }
                    arrayList3.clear();
                    launchActivity2.u0(cyVar);
                    return;
                } else if (r2Var instanceof org.telegram.ui.un) {
                    ((org.telegram.ui.un) r2Var).ga(user.f22176id, str4, true);
                    return;
                } else {
                    return;
                }
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (tLObject4 != null) {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.dl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                        return;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.dl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                        return;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        g5.p0(U2, str5, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.ui.dl0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        return;
                    } else {
                        org.telegram.ui.dl0.a().g0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                org.telegram.ui.sz szVar2 = (org.telegram.ui.sz) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.D1;
                if (tLObject5 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject5;
                    if (tL_theme.settings.size() > 0) {
                        themeSettings = tL_theme.settings.get(0);
                    } else {
                        themeSettings = null;
                    }
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(org.telegram.ui.ActionBar.y6.r0(themeSettings));
                        if (P0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.W0 = e2Var;
                                    launchActivity4.V0 = true;
                                    launchActivity4.T0 = P0;
                                    launchActivity4.U0 = tL_theme;
                                    launchActivity4.S0 = tL_wallPaper;
                                    launchActivity4.R0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    return;
                                }
                            }
                            try {
                                szVar2.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            launchActivity4.s0(tL_theme, tL_wallPaper, P0);
                        } else {
                            i19 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.V0 = false;
                            launchActivity4.U0 = tL_theme;
                            launchActivity4.Q0 = FileLoader.getAttachFileName(document);
                            launchActivity4.W0 = e2Var;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.U0.document, tL_theme, 1, 1);
                        }
                        i10 = 1;
                    }
                    i10 = i19;
                } else {
                    if (tL_error4 == null || !"THEME_FORMAT_INVALID".equals(tL_error4.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        szVar2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (i10 == 1) {
                        launchActivity4.G0(g5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.G0(g5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.lb0 lb0Var = (org.telegram.ui.lb0) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str6 = (String) obj;
                int i20 = lb0Var.f41239b;
                LaunchActivity launchActivity5 = lb0Var.f41238a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        d = org.telegram.ui.lb0.d();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        d = org.telegram.ui.lb0.d();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.vh.n(i11, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        zh.o4 o4Var = launchActivity5.Z0;
                        launchActivity5.Z0 = null;
                        bi.ca.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new org.telegram.ui.gb0(lb0Var, 1), new org.telegram.ui.g90(o4Var, 1));
                        return;
                    }
                    if (tLObject6 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                        MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                        po0Var = new org.telegram.ui.po0(paymentForm, null, str6, LaunchActivity.U());
                    } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                        po0Var = new org.telegram.ui.po0((TLRPC.PaymentReceipt) tLObject6);
                    } else {
                        po0Var = null;
                    }
                    if (po0Var != null) {
                        zh.o4 o4Var2 = launchActivity5.Z0;
                        if (o4Var2 != null) {
                            launchActivity5.Z0 = null;
                            po0Var.Z0 = new org.telegram.ui.ff(10, o4Var2);
                        }
                        lb0Var.u(po0Var, false);
                    }
                }
                lb0Var.c();
                return;
            case 13:
                org.telegram.ui.gg0.V((org.telegram.ui.gg0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.gg0 gg0Var = ((org.telegram.ui.od0) obj5).W;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    gg0Var.l1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    return;
                } else if (tL_error6 != null && tL_error6.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                    g5.e0(i12, tL_error6, gg0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.ve0 ve0Var = (org.telegram.ui.ve0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.gg0 gg0Var2 = ve0Var.E;
                gg0Var2.p1(false, true);
                ve0Var.f44786r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    gg0Var2.z1(13, true, bundle2, false);
                    return;
                }
                String str7 = tL_error7.text;
                if (str7 != null) {
                    if (str7.contains("EMAIL_INVALID")) {
                        ve0Var.n();
                        return;
                    } else if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                        gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                        gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                        gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        return;
                    } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            gg0Var2.z1(0, true, null, true);
                            gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            return;
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            return;
                        } else if (tL_error7.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                            g5.e0(i13, tL_error7, gg0Var2, sendverifyemailcode, ve0Var.f44788w);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        return;
                    }
                }
                return;
            case 16:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.gg0 gg0Var3 = ((org.telegram.ui.ve0) obj5).E;
                if ((tLObject9 instanceof TL_account.TL_emailVerified) && gg0Var3.F == 3) {
                    gg0Var3.finishFragment();
                    gg0Var3.f39657d0.run();
                    return;
                } else if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    gg0Var3.l1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error8 != null) {
                    if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                        gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                        gg0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        return;
                    } else if (tL_error8.code != -1000) {
                        i14 = ((org.telegram.ui.ActionBar.r2) gg0Var3).currentAccount;
                        g5.e0(i14, tL_error8, gg0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 17:
                final org.telegram.ui.of0 of0Var = (org.telegram.ui.of0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.gg0 gg0Var4 = of0Var.v;
                of0Var.f42177b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    gg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.po0 po0Var2 = new org.telegram.ui.po0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, gg0Var4, true);
                    po0Var2.V0 = true;
                    po0Var2.f42594c1 = new Utilities.Callback() {
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
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    of0 of0Var3 = of0Var2;
                                                    if (!of0Var3.f42179f) {
                                                        of0Var3.f42179f = true;
                                                        of0Var3.h = str8;
                                                        of0Var3.f42180n = str9;
                                                        of0Var3.f42181r = j10;
                                                        of0Var3.f42177b.setLoading(true);
                                                        of0Var3.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    of0 of0Var4 = of0Var2;
                                                    if (!of0Var4.f42179f) {
                                                        of0Var4.f42179f = true;
                                                        of0Var4.h = str10;
                                                        of0Var4.f42180n = str11;
                                                        of0Var4.f42181r = j11;
                                                        of0Var4.f42177b.setLoading(true);
                                                        of0Var4.o();
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
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    of0 of0Var32 = of0Var3;
                                                    if (!of0Var32.f42179f) {
                                                        of0Var32.f42179f = true;
                                                        of0Var32.h = str8;
                                                        of0Var32.f42180n = str9;
                                                        of0Var32.f42181r = j10;
                                                        of0Var32.f42177b.setLoading(true);
                                                        of0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    of0 of0Var4 = of0Var3;
                                                    if (!of0Var4.f42179f) {
                                                        of0Var4.f42179f = true;
                                                        of0Var4.h = str10;
                                                        of0Var4.f42180n = str11;
                                                        of0Var4.f42181r = j11;
                                                        of0Var4.f42177b.setLoading(true);
                                                        of0Var4.o();
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
                    po0Var2.f42596d1 = new Utilities.Callback() {
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
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    of0 of0Var32 = of0Var2;
                                                    if (!of0Var32.f42179f) {
                                                        of0Var32.f42179f = true;
                                                        of0Var32.h = str8;
                                                        of0Var32.f42180n = str9;
                                                        of0Var32.f42181r = j10;
                                                        of0Var32.f42177b.setLoading(true);
                                                        of0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    of0 of0Var4 = of0Var2;
                                                    if (!of0Var4.f42179f) {
                                                        of0Var4.f42179f = true;
                                                        of0Var4.h = str10;
                                                        of0Var4.f42180n = str11;
                                                        of0Var4.f42181r = j11;
                                                        of0Var4.f42177b.setLoading(true);
                                                        of0Var4.o();
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
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    of0 of0Var32 = of0Var3;
                                                    if (!of0Var32.f42179f) {
                                                        of0Var32.f42179f = true;
                                                        of0Var32.h = str8;
                                                        of0Var32.f42180n = str9;
                                                        of0Var32.f42181r = j10;
                                                        of0Var32.f42177b.setLoading(true);
                                                        of0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    of0 of0Var4 = of0Var3;
                                                    if (!of0Var4.f42179f) {
                                                        of0Var4.f42179f = true;
                                                        of0Var4.h = str10;
                                                        of0Var4.f42180n = str11;
                                                        of0Var4.f42181r = j11;
                                                        of0Var4.f42177b.setLoading(true);
                                                        of0Var4.o();
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
                    po0Var2.f42598e1 = new org.telegram.ui.x10(of0Var, 1);
                    gg0Var4.presentFragment(po0Var2);
                    return;
                } else if (tL_error9 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.lf0(of0Var, 0));
                        return;
                    }
                    String str8 = tL_error9.text;
                    of0Var.e = str8;
                    new wc(gg0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str8));
                    return;
                } else {
                    new wc(gg0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                }
            case 18:
                org.telegram.ui.vi0 vi0Var = (org.telegram.ui.vi0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                lg.b bVar = (lg.b) obj3;
                String str9 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                vi0Var.f44834y = true;
                if (tL_error10 == null && bVar != null) {
                    vi0Var.v.put(str9, bVar);
                    org.telegram.ui.i91 i91Var = vi0Var.f44830r;
                    i91Var.e = bVar;
                    i91Var.f40188c = tL_loadAsyncGraph.f22260x;
                    vi0Var.i0();
                    return;
                }
                vi0Var.i0();
                return;
            case 19:
                org.telegram.ui.oj0.n((org.telegram.ui.oj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                return;
            case 20:
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                org.telegram.ui.lj0 lj0Var = (org.telegram.ui.lj0) obj3;
                m4.w1 w1Var = (m4.w1) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.in0 in0Var = ((org.telegram.ui.qm0) obj5).f42875a;
                if (tL_error11 != null) {
                    i15 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
                    g5.e0(i15, tL_error11, in0Var, verifyemail2, new Object[0]);
                    w1Var.d(null, null);
                    return;
                }
                ((org.telegram.ui.lm0) in0Var.B1).c(in0Var.E, (String) in0Var.f40314s1.get("email"), null, null, null, null, null, null, null, null, lj0Var, w1Var);
                return;
            case 21:
                org.telegram.ui.en0 en0Var = (org.telegram.ui.en0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.in0 in0Var2 = en0Var.Q;
                en0Var.J = false;
                if (tL_error12 != null) {
                    i16 = ((org.telegram.ui.ActionBar.r2) in0Var2).currentAccount;
                    org.telegram.ui.ActionBar.e2 e02 = g5.e0(i16, tL_error12, in0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.f22584o0 = new org.telegram.ui.zm0(en0Var, 0);
                    }
                } else {
                    in0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject11, true);
                }
                in0Var2.x1();
                return;
            case 22:
                org.telegram.ui.po0.g0((org.telegram.ui.po0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.ou0 ou0Var2 = (org.telegram.ui.ou0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.st0) obj5).f43596r;
                photoViewer.f35746p4 = null;
                org.telegram.ui.iu0 iu0Var = photoViewer.f35646e0;
                if (iu0Var != null && photoViewer.f35664g0 != null) {
                    iu0Var.setLayerType(0, null);
                    photoViewer.f35728n4 = 0;
                    photoViewer.H1();
                    photoViewer.f35737o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.f18803a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.f18803a = false;
                    photoViewer.F2();
                    photoViewer.B2();
                    photoViewer.f35646e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.qu0 qu0Var = photoViewer.f35755q4;
                    if (qu0Var != null) {
                        qu0Var.f42919a.setVisible(true, true);
                    }
                    org.telegram.ui.qu0 qu0Var2 = photoViewer.f35764r4;
                    if (qu0Var2 != null && !qu0Var2.f42934s) {
                        qu0Var2.f42919a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.f35630c2) != 3 && i17 != 1 && ((ou0Var = photoViewer.d) == null || !ou0Var.P())) {
                        photoViewer.U1();
                    }
                    s81 s81Var = photoViewer.F2;
                    if (s81Var != null && s81Var.y() && photoViewer.f35761r1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.a0(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Z(photoViewer, true);
                    }
                    if (photoViewer.f35782t4) {
                        PhotoViewer.b0(photoViewer, num.intValue());
                    }
                    if (ou0Var2 != null) {
                        ou0Var2.d();
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
                    privacyControlActivity.C0();
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
                    privacyControlActivity.y0();
                }
                privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.kx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    qc R = wc.b0(privacyControlActivity2).R(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    R.f31889j = 5000;
                    R.j();
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
                        u6Var = ((org.telegram.ui.ActionBar.r2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, u6Var);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                        e2Var2.R = string;
                        e2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(e2Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.t.q(R.string.UnknownError, wc.b0(privacyControlActivity2), R.raw.error, 36);
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) obj;
                int i22 = ProfileActivity.R6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    kkVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36126z0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22368a;
                e2Var3.R = string2;
                e2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.hl0(kkVar, 12));
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(e2Var3);
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.iz0 iz0Var = (org.telegram.ui.iz0) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject12 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject12;
                    if (profileActivity2.f35979e1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f35979e1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f35987f1));
                    }
                    String str10 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    wc wcVar = new wc(iz0Var.f30728x, profileActivity2.f36126z0);
                    int i23 = R.drawable.filled_username;
                    int i24 = R.string.FragmentChannelUsername;
                    if (TextUtils.isEmpty(formatCurrency2)) {
                        p10 = "";
                    } else {
                        p10 = a1.g.p("(", formatCurrency2, ")");
                    }
                    qc w10 = wcVar.w(i23, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i24, str10, format, formatCurrency, p10)), new org.telegram.ui.fy0(0, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.xd0 xd0Var = new org.telegram.ui.xd0(10, profileActivity2, tL_collectibleInfo);
                    ub ubVar = w10.e;
                    if (ubVar != null) {
                        ubVar.setOnClickListener(xd0Var);
                    }
                    w10.k(false);
                    return;
                }
                int i25 = ProfileActivity.R6;
                wc.e0(tL_error14);
                return;
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                String str11 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                int i26 = ProfileActivity.R6;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.t10.a(profileActivity3.getParentActivity(), 1, str11, user3, (TL_fragment.TL_collectibleInfo) tLObject13, profileActivity3.f36126z0);
                    return;
                } else {
                    wc.e0(tL_error15);
                    return;
                }
            default:
                ProfileActivity.m0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public i30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f29175a = i10;
        this.f29176b = obj;
        this.f29177c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f29178f = obj5;
    }
}
