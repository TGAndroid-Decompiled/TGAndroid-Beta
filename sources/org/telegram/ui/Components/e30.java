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
import org.telegram.ui.pc1;
import org.telegram.ui.yh1;
public final class e30 implements Runnable {
    public final int f25945a;
    public final Object f25946b;
    public final Object f25947c;
    public final Object d;
    public final Object e;
    public final Object f25948f;

    public e30(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.f25945a = 0;
        this.f25946b = view;
        this.f25947c = view2;
        this.f25948f = windowManager;
        this.d = view3;
        this.e = view4;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i10;
        TLRPC.ThemeSettings themeSettings;
        org.telegram.ui.ho0 ho0Var;
        vc d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ju0 ju0Var;
        String str2;
        org.telegram.ui.ActionBar.g6 g6Var;
        String p5;
        int i18 = this.f25945a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i19 = 0;
        Object obj = this.f25948f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f25947c;
        Object obj5 = this.f25946b;
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
                sy0.w((sy0) obj5, (String) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TextView) obj);
                return;
            case 2:
                dz0 dz0Var = (dz0) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        oc M = vc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.f29203j = 5000;
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
                        MessagesStorage.getInstance(dz0Var.f25864a).updateUserInfo(userFull, false);
                    }
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dz0Var.f25865b.getContext());
                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                    org.telegram.messenger.v0.p(R.string.UnknownError, vc.a0(U), R.raw.error, 36);
                    return;
                }
                return;
            case 3:
                v31 v31Var = (v31) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                h80 h80Var = (h80) obj2;
                h80 h80Var2 = (h80) obj;
                org.telegram.ui.sn snVar = v31Var.h;
                if (((MessagesController) obj4).isDialogMuted(v31Var.f31300c, tL_forumTopic.f20396id)) {
                    h80Var.u();
                    NotificationsController.getInstance(v31Var.f31298b).muteDialog(v31Var.f31300c, tL_forumTopic.f20396id, false);
                    if (vc.a(snVar)) {
                        vc.z(snVar, 4, 0, v31Var.d).j();
                        return;
                    }
                    return;
                }
                h80Var.K(h80Var2);
                return;
            case 4:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj5;
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
                            tL_inputStickerSetID.f20364id = stickerSetCovered2.set.f20371id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(htVar.f38002r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i2.o1.i(1, tL_messages_myStickers.sets)).set.f20371id;
                        ConnectionsManager.getInstance(htVar.f38002r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.ca(htVar, arrayList, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ey.E0((org.telegram.ui.ey) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                org.telegram.ui.u50.B((org.telegram.ui.u50) obj5, (org.telegram.ui.ActionBar.c2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                org.telegram.ui.u50.y((org.telegram.ui.u50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                    if (tL_wallPaper3.pattern) {
                        String str3 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                        yh1 yh1Var = new yh1(str3, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        yh1Var.f43867g = tL_wallPaper3;
                        tL_wallPaper3 = yh1Var;
                    }
                    pc1 pc1Var = new pc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    pc1Var.G1 = z10;
                    pc1Var.F1 = z11;
                    pc1Var.f40484o1 = wallPaperSettings3.intensity;
                    launchActivity.u0(pc1Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error2.text);
                launchActivity.G0(d5.M(launchActivity, null, sb2.toString()));
                return;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList3 = launchActivity2.E0;
                if (eyVar != null) {
                    if (o2Var != null) {
                        o2Var.dismissCurrentDialog();
                    }
                    while (i19 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i19)).isShowing()) {
                            ((Dialog) arrayList3.get(i19)).dismiss();
                        }
                        i19++;
                    }
                    arrayList3.clear();
                    launchActivity2.u0(eyVar);
                    return;
                } else if (o2Var instanceof org.telegram.ui.sn) {
                    ((org.telegram.ui.sn) o2Var).ba(user.f20491id, str4, true);
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
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (tLObject4 != null) {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.wk0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                        return;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.wk0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                        return;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        d5.p0(U2, str5, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.ui.wk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        return;
                    } else {
                        org.telegram.ui.wk0.a().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.f80 f80Var2 = (org.telegram.ui.f80) obj2;
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
                        org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0(org.telegram.ui.ActionBar.k6.r0(themeSettings));
                        if (P0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.W0 = c2Var;
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
                                f80Var2.run();
                            } catch (Exception e7) {
                                FileLog.e(e7);
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
                            launchActivity4.W0 = c2Var;
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
                        f80Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (i10 == 1) {
                        launchActivity4.G0(d5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        return;
                    } else {
                        launchActivity4.G0(d5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str6 = (String) obj;
                int i20 = ob0Var.f40146b;
                LaunchActivity launchActivity5 = ob0Var.f40145a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        d = org.telegram.ui.ob0.d();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        d = org.telegram.ui.ob0.d();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.tl.q(i11, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        yh.n4 n4Var = launchActivity5.Z0;
                        launchActivity5.Z0 = null;
                        ai.ha.y(i20, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new org.telegram.ui.jb0(ob0Var, 1), new org.telegram.ui.h90(n4Var, 1));
                        return;
                    }
                    if (tLObject6 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                        MessagesController.getInstance(i20).putUsers(paymentForm.users, false);
                        ho0Var = new org.telegram.ui.ho0(paymentForm, null, str6, LaunchActivity.U());
                    } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                        ho0Var = new org.telegram.ui.ho0((TLRPC.PaymentReceipt) tLObject6);
                    } else {
                        ho0Var = null;
                    }
                    if (ho0Var != null) {
                        yh.n4 n4Var2 = launchActivity5.Z0;
                        if (n4Var2 != null) {
                            launchActivity5.Z0 = null;
                            ho0Var.Z0 = new org.telegram.ui.gf(10, n4Var2);
                        }
                        ob0Var.u(ho0Var, false);
                    }
                }
                ob0Var.c();
                return;
            case 13:
                org.telegram.ui.hg0.U((org.telegram.ui.hg0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 14:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.hg0 hg0Var = ((org.telegram.ui.qd0) obj5).W;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    hg0Var.k1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    return;
                } else if (tL_error6 != null && tL_error6.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
                    d5.e0(i12, tL_error6, hg0Var, tL_auth_resendCode, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.xe0 xe0Var = (org.telegram.ui.xe0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.hg0 hg0Var2 = xe0Var.E;
                hg0Var2.o1(false, true);
                xe0Var.f43539r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    hg0Var2.y1(13, true, bundle2, false);
                    return;
                }
                String str7 = tL_error7.text;
                if (str7 != null) {
                    if (str7.contains("EMAIL_INVALID")) {
                        xe0Var.n();
                        return;
                    } else if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                        hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                        hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        return;
                    } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                        hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        return;
                    } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            hg0Var2.y1(0, true, null, true);
                            hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            return;
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            return;
                        } else if (tL_error7.code != -1000) {
                            i13 = ((org.telegram.ui.ActionBar.o2) hg0Var2).currentAccount;
                            d5.e0(i13, tL_error7, hg0Var2, sendverifyemailcode, xe0Var.f43541w);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        return;
                    }
                }
                return;
            case 16:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.hg0 hg0Var3 = ((org.telegram.ui.xe0) obj5).E;
                if ((tLObject9 instanceof TL_account.TL_emailVerified) && hg0Var3.F == 3) {
                    hg0Var3.finishFragment();
                    hg0Var3.f37839d0.run();
                    return;
                } else if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    hg0Var3.k1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else if (tL_error8 != null) {
                    if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                        hg0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        return;
                    } else if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                        hg0Var3.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        return;
                    } else if (tL_error8.code != -1000) {
                        i14 = ((org.telegram.ui.ActionBar.o2) hg0Var3).currentAccount;
                        d5.e0(i14, tL_error8, hg0Var3, verifyemail, new Object[0]);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 17:
                final org.telegram.ui.qf0 qf0Var = (org.telegram.ui.qf0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.hg0 hg0Var4 = qf0Var.v;
                qf0Var.f40808b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    hg0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.ho0 ho0Var2 = new org.telegram.ui.ho0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, hg0Var4, true);
                    ho0Var2.V0 = true;
                    ho0Var2.f37922c1 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final qf0 qf0Var2 = qf0Var;
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
                                                    qf0 qf0Var3 = qf0Var2;
                                                    if (!qf0Var3.f40810f) {
                                                        qf0Var3.f40810f = true;
                                                        qf0Var3.h = str8;
                                                        qf0Var3.f40811n = str9;
                                                        qf0Var3.f40812r = j10;
                                                        qf0Var3.f40808b.setLoading(true);
                                                        qf0Var3.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    qf0 qf0Var4 = qf0Var2;
                                                    if (!qf0Var4.f40810f) {
                                                        qf0Var4.f40810f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.f40811n = str11;
                                                        qf0Var4.f40812r = j11;
                                                        qf0Var4.f40808b.setLoading(true);
                                                        qf0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final qf0 qf0Var3 = qf0Var;
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
                                                    qf0 qf0Var32 = qf0Var3;
                                                    if (!qf0Var32.f40810f) {
                                                        qf0Var32.f40810f = true;
                                                        qf0Var32.h = str8;
                                                        qf0Var32.f40811n = str9;
                                                        qf0Var32.f40812r = j10;
                                                        qf0Var32.f40808b.setLoading(true);
                                                        qf0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    qf0 qf0Var4 = qf0Var3;
                                                    if (!qf0Var4.f40810f) {
                                                        qf0Var4.f40810f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.f40811n = str11;
                                                        qf0Var4.f40812r = j11;
                                                        qf0Var4.f40808b.setLoading(true);
                                                        qf0Var4.o();
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
                    ho0Var2.f37924d1 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (r4) {
                                case 0:
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) obj6;
                                    final qf0 qf0Var2 = qf0Var;
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
                                                    qf0 qf0Var32 = qf0Var2;
                                                    if (!qf0Var32.f40810f) {
                                                        qf0Var32.f40810f = true;
                                                        qf0Var32.h = str8;
                                                        qf0Var32.f40811n = str9;
                                                        qf0Var32.f40812r = j10;
                                                        qf0Var32.f40808b.setLoading(true);
                                                        qf0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    qf0 qf0Var4 = qf0Var2;
                                                    if (!qf0Var4.f40810f) {
                                                        qf0Var4.f40810f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.f40811n = str11;
                                                        qf0Var4.f40812r = j11;
                                                        qf0Var4.f40808b.setLoading(true);
                                                        qf0Var4.o();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj6;
                                    final qf0 qf0Var3 = qf0Var;
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
                                                    qf0 qf0Var32 = qf0Var3;
                                                    if (!qf0Var32.f40810f) {
                                                        qf0Var32.f40810f = true;
                                                        qf0Var32.h = str8;
                                                        qf0Var32.f40811n = str9;
                                                        qf0Var32.f40812r = j10;
                                                        qf0Var32.f40808b.setLoading(true);
                                                        qf0Var32.o();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    qf0 qf0Var4 = qf0Var3;
                                                    if (!qf0Var4.f40810f) {
                                                        qf0Var4.f40810f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.f40811n = str11;
                                                        qf0Var4.f40812r = j11;
                                                        qf0Var4.f40808b.setLoading(true);
                                                        qf0Var4.o();
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
                    ho0Var2.f37926e1 = new org.telegram.ui.x10(qf0Var, 1);
                    hg0Var4.presentFragment(ho0Var2);
                    return;
                } else if (tL_error9 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.nf0(qf0Var, 0));
                        return;
                    }
                    String str8 = tL_error9.text;
                    qf0Var.e = str8;
                    new vc(hg0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str8));
                    return;
                } else {
                    new vc(hg0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    return;
                }
            case 18:
                org.telegram.ui.xi0 xi0Var = (org.telegram.ui.xi0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                kg.b bVar = (kg.b) obj3;
                String str9 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                xi0Var.f43628y = true;
                if (tL_error10 == null && bVar != null) {
                    xi0Var.v.put(str9, bVar);
                    org.telegram.ui.f91 f91Var = xi0Var.f43624r;
                    f91Var.e = bVar;
                    f91Var.f37245c = tL_loadAsyncGraph.f20572x;
                    xi0Var.h0();
                    return;
                }
                xi0Var.h0();
                return;
            case 19:
                org.telegram.ui.qj0.n((org.telegram.ui.qj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                return;
            case 20:
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) obj3;
                n2.e eVar = (n2.e) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.zm0 zm0Var = ((org.telegram.ui.hm0) obj5).f37903a;
                if (tL_error11 != null) {
                    i15 = ((org.telegram.ui.ActionBar.o2) zm0Var).currentAccount;
                    d5.e0(i15, tL_error11, zm0Var, verifyemail2, new Object[0]);
                    eVar.a(null, null);
                    return;
                }
                ((org.telegram.ui.cm0) zm0Var.B1).c(zm0Var.E, (String) zm0Var.f44166s1.get("email"), null, null, null, null, null, null, null, null, nj0Var, eVar);
                return;
            case 21:
                org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.zm0 zm0Var2 = vm0Var.Q;
                vm0Var.J = false;
                if (tL_error12 != null) {
                    i16 = ((org.telegram.ui.ActionBar.o2) zm0Var2).currentAccount;
                    org.telegram.ui.ActionBar.c2 e02 = d5.e0(i16, tL_error12, zm0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.f20772o0 = new org.telegram.ui.qm0(vm0Var, 0);
                    }
                } else {
                    zm0Var2.k1(bundle4, (TLRPC.TL_auth_sentCode) tLObject11, true);
                }
                zm0Var2.w1();
                return;
            case 22:
                org.telegram.ui.ho0.f0((org.telegram.ui.ho0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                return;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.ju0 ju0Var2 = (org.telegram.ui.ju0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.nt0) obj5).f39989r;
                photoViewer.f33682p4 = null;
                org.telegram.ui.du0 du0Var = photoViewer.f33582e0;
                if (du0Var != null && photoViewer.f33599g0 != null) {
                    du0Var.setLayerType(0, null);
                    photoViewer.f33664n4 = 0;
                    photoViewer.H1();
                    photoViewer.f33673o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.f16940a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.f16940a = false;
                    photoViewer.F2();
                    photoViewer.B2();
                    photoViewer.f33582e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.lu0 lu0Var = photoViewer.f33690q4;
                    if (lu0Var != null) {
                        lu0Var.f39381a.setVisible(true, true);
                    }
                    org.telegram.ui.lu0 lu0Var2 = photoViewer.f33699r4;
                    if (lu0Var2 != null && !lu0Var2.f39396s) {
                        lu0Var2.f39381a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.f33566c2) != 3 && i17 != 1 && ((ju0Var = photoViewer.d) == null || !ju0Var.P())) {
                        photoViewer.U1();
                    }
                    j81 j81Var = photoViewer.F2;
                    if (j81Var != null && j81Var.y() && photoViewer.f33696r1 && !photoViewer.f33606g7.isEmpty()) {
                        PhotoViewer.a0(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Z(photoViewer, true);
                    }
                    if (photoViewer.f33718t4) {
                        PhotoViewer.b0(photoViewer, num.intValue());
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
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.fx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    oc Q = vc.a0(privacyControlActivity2).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    Q.f29203j = 5000;
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
                        g6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, g6Var);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                        c2Var2.R = string;
                        c2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(c2Var2);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.v0.p(R.string.UnknownError, vc.a0(privacyControlActivity2), R.raw.error, 36);
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.ik ikVar = (org.telegram.messenger.ik) obj;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    ikVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20679a;
                c2Var3.R = string2;
                c2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.rp0(ikVar, 10));
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                profileActivity.showDialog(c2Var3);
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.ez0 ez0Var = (org.telegram.ui.ez0) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject12 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject12;
                    if (profileActivity2.f33923f1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f33923f1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f33930g1));
                    }
                    String str10 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    vc vcVar = new vc(ez0Var.f27150x, profileActivity2.A0);
                    int i22 = R.drawable.filled_username;
                    int i23 = R.string.FragmentChannelUsername;
                    if (TextUtils.isEmpty(formatCurrency2)) {
                        p5 = "";
                    } else {
                        p5 = a1.g.p("(", formatCurrency2, ")");
                    }
                    oc w9 = vcVar.w(i22, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i23, str10, format, formatCurrency, p5)), new org.telegram.ui.lv0(10, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.zd0 zd0Var = new org.telegram.ui.zd0(10, profileActivity2, tL_collectibleInfo);
                    sb sbVar = w9.e;
                    if (sbVar != null) {
                        sbVar.setOnClickListener(zd0Var);
                    }
                    w9.k(false);
                    return;
                }
                vc.d0(tL_error14);
                return;
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                String str11 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.t10.a(profileActivity3.getParentActivity(), 1, str11, user3, (TL_fragment.TL_collectibleInfo) tLObject13, profileActivity3.A0);
                    return;
                } else {
                    vc.d0(tL_error15);
                    return;
                }
            default:
                ProfileActivity.Y((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public e30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f25945a = i10;
        this.f25946b = obj;
        this.f25947c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f25948f = obj5;
    }
}
