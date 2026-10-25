package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d81 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50, og0, oe.d {
    public v71 E;
    public org.telegram.ui.Components.j9 F;
    public org.telegram.ui.Components.y9 G;
    public FrameLayout H;
    public FrameLayout I;
    public ImageView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public boolean N;
    public View O;
    public View P;
    public int Q;
    public NotificationCenter.ObserversGroup R;
    public int S;
    public boolean T;
    public ValueAnimator U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final oe.b f38755a;
    public float f38756a0;
    public a9 f38757b;
    public final ArrayList f38758b0;
    public org.telegram.ui.Components.r71 f38759c;
    public int f38760c0;
    public org.telegram.ui.ActionBar.y5 d;
    public int f38761d0;
    public org.telegram.ui.ActionBar.y5 e;
    public int f38762e0;
    public u71 f38763f;
    public boolean f38764f0;
    public org.telegram.ui.Components.g50 h;
    public AnimatorSet f38765n;
    public org.telegram.ui.Cells.d4 f38766r;
    public TLRPC.FileLocation f38767s;
    public TLRPC.FileLocation v;
    public FrameLayout f38768w;
    public FrameLayout f38769x;
    public k0 f38770y;

    public d81() {
        this(null);
    }

    public static boolean V(d81 d81Var, org.telegram.ui.Components.t61 t61Var, View view) {
        String str;
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            hi.m3.j(d81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new p71(d81Var, 2));
            return true;
        }
        if (t61Var.H(org.telegram.ui.Cells.a7.class)) {
            Object obj2 = t61Var.G;
            if (obj2 instanceof t01) {
                str = ((t01) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(d81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new fy0(21, d81Var, str), false);
                H.W(d81Var.f38759c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void W(d81 d81Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(d81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(d81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(d81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.g50 g50Var = d81Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        g50Var.n(z10, new p71(d81Var, 0), new fi.e1(7), 0);
    }

    public static void X(d81 d81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(LaunchActivity.I1, d81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(d81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void Y(d81 d81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(d81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(d81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new l71(2, d81Var, tL_attachMenuBot), 66);
    }

    public static void Z(org.telegram.ui.d81 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d81.Z(org.telegram.ui.d81):void");
    }

    public static void a0(d81 d81Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        String str;
        int i11;
        String str2;
        int i12 = 0;
        if (d81Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.t61.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            u71 u71Var = d81Var.f38763f;
            ArrayList arrayList2 = u71Var.d;
            ArrayList arrayList3 = u71Var.v;
            if (u71Var.f43965w) {
                ArrayList arrayList4 = u71Var.f43963r;
                int size = arrayList4.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int i15 = org.telegram.ui.Cells.a7.f23858a;
                    org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                    K.f32872l = (CharSequence) u71Var.f43962n.get(i13);
                    K.G = (t01) obj;
                    arrayList.add(K);
                    i13++;
                }
                if (!u71Var.f43964s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList5 = u71Var.f43964s;
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        int i16 = org.telegram.ui.Cells.a7.f23858a;
                        org.telegram.ui.Components.t61 K2 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                        K2.f32872l = (CharSequence) u71Var.f43962n.get(i13);
                        K2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(K2);
                        i13++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof t01) {
                        t01 t01Var = (t01) obj3;
                        String str3 = t01Var.f43637a;
                        int i18 = org.telegram.ui.Cells.a7.f23858a;
                        org.telegram.ui.Components.t61 K3 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                        K3.f32872l = str3;
                        K3.G = t01Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str4 = faqSearchResult.title;
                        int i19 = org.telegram.ui.Cells.a7.f23858a;
                        org.telegram.ui.Components.t61 K4 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                        K4.f32872l = str4;
                        K4.G = faqSearchResult;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList2.size();
                while (i12 < size4) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str5 = faqSearchResult2.title;
                    int i20 = org.telegram.ui.Cells.a7.f23858a;
                    org.telegram.ui.Components.t61 K5 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                    K5.f32872l = str5;
                    K5.G = faqSearchResult2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.t61.n(d81Var.f38768w, 188));
        d81Var.f38758b0.clear();
        for (int i21 = 0; i21 < 4; i21++) {
            if (UserConfig.getInstance(i21).isClientActivated() && d81Var.currentAccount != i21) {
                d81Var.f38758b0.add(Integer.valueOf(i21));
            }
        }
        Collections.sort(d81Var.f38758b0, new bv(10));
        Set<String> set = d81Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(b81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new q71(d81Var, 0)));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && d81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(b81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.vh.g(new StringBuilder("+"), d81Var.getUserConfig().getCurrentUser().phone, kf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new p71(d81Var, 1)), LocaleController.getString(R.string.CheckPhoneNumberNo), new q71(d81Var, 1), bi.h7.H2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new q71(d81Var, 2)));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(b81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new q71(d81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new q71(d81Var, 4)));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        if (d81Var.f38758b0.size() > 0) {
            ic.a.p(R.string.SettingsAccounts, arrayList);
            for (int i22 = 0; i22 < d81Var.f38758b0.size(); i22++) {
                int intValue = ((Integer) d81Var.f38758b0.get(i22)).intValue();
                int i23 = x71.f45686a;
                org.telegram.ui.Components.t61 K6 = org.telegram.ui.Components.t61.K(x71.class);
                K6.d = i22;
                K6.f32885z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        if (d81Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && d81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(d81Var.currentAccount);
            if (org.telegram.ui.ActionBar.y6.I.q()) {
                i11 = R.drawable.settings_wallet_dark;
            } else {
                i11 = R.drawable.settings_wallet;
            }
            int i24 = i11;
            CharSequence string = LocaleController.getString(R.string.WalletAttachMoney);
            int i25 = org.telegram.ui.Cells.v8.V;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string = org.telegram.ui.Cells.v8.b(string);
            }
            CharSequence charSequence = string;
            if (w10.u() > 0) {
                str2 = org.telegram.ui.Wallet.l0.n(w10.u(), false);
            } else {
                str2 = null;
            }
            arrayList.add(z71.a(25, 0, 0, i24, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        arrayList.add(z71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(z71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(z71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(z71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(z71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(z71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(z71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(z71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(z71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.t61.C(null));
        if (!z10 && d81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w11 = org.telegram.ui.Wallet.l0.w(d81Var.currentAccount);
            if (org.telegram.ui.ActionBar.y6.I.q()) {
                i10 = R.drawable.settings_wallet_dark;
            } else {
                i10 = R.drawable.settings_wallet;
            }
            int i26 = i10;
            CharSequence string2 = LocaleController.getString(R.string.WalletAttachMoney);
            int i27 = org.telegram.ui.Cells.v8.V;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string2 = org.telegram.ui.Cells.v8.b(string2);
            }
            CharSequence charSequence2 = string2;
            if (w11.u() > 0) {
                str = org.telegram.ui.Wallet.l0.n(w11.u(), false);
            } else {
                str = null;
            }
            arrayList.add(z71.a(25, 0, 0, i26, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        if (!d81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(z71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (d81Var.getMessagesController().starsPurchaseAvailable()) {
            bi.ca y3 = bi.ca.y(d81Var.currentAccount, false);
            long j10 = y3.p().amount;
            int i28 = R.drawable.settings_stars;
            String string3 = LocaleController.getString(R.string.TelegramStars);
            if (!y3.e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = bi.dd.I0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(z71.a(12, -1071598, -1608430, i28, string3, null, spannableStringBuilder));
        }
        bi.ca.y(d81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (bi.ca.y(d81Var.currentAccount, true).e && (bi.ca.y(d81Var.currentAccount, true).O(0) || bi.ca.y(d81Var.currentAccount, true).p().positive()))) {
            bi.ca y10 = bi.ca.y(d81Var.currentAccount, true);
            long j11 = y10.p().amount;
            int i29 = R.drawable.filled_gram_earnings;
            String string4 = LocaleController.getString(R.string.GramEarnings);
            if (y10.e && j11 > 0) {
                charSequence3 = bi.dd.I0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(z71.a(13, -14965523, -15431455, i29, string4, null, charSequence3));
        }
        if (!d81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(z71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!d81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(z71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.t61) ic.a.g(1, arrayList)).f47037a != 7) {
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        ic.a.p(R.string.SettingsHelp, arrayList);
        arrayList.add(z71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(z71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(z71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(z71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        wi.a aVar = wi.e.f51273a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.t61.C(null));
            arrayList.add(org.telegram.ui.Components.t61.u("Experimental"));
            arrayList.add(z71.a(24, -765355, -2148011, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
            arrayList.add(z71.a(26, -11154873, -14175180, 0, LocaleController.getString(R.string.AudioRecorderSettings), null, null));
            arrayList.add(z71.a(27, -12743701, -13996071, 0, LocaleController.getString(R.string.HeaderSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.t61.C(null));
            ic.a.p(R.string.SettingsDebug, arrayList);
            arrayList.add(z71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(z71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(z71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.t61.m(d81Var.M));
    }

    public static void c0(d81 d81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        d81Var.f38762e0 = -1;
        if (tL_error == null) {
            TLRPC.User user = d81Var.getMessagesController().getUser(Long.valueOf(d81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = d81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                d81Var.getMessagesController().putUser(user, false);
            } else {
                d81Var.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                closestVideoSizeWithSize = null;
            } else {
                closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22051id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && d81Var.f38767s != null) {
                FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(d81Var.f38767s, true).renameTo(FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d81Var.f38767s.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(d81Var.f38767s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(d81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && d81Var.v != null) {
                FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(d81Var.v, true).renameTo(FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            d81Var.getMessagesController().getDialogPhotos(user.f22174id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            d81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = d81Var.getMessagesController().getUserFull(d81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                d81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            d81Var.l0(user);
        }
        d81Var.f38767s = null;
        d81Var.v = null;
        d81Var.m0(false, true);
        d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        d81Var.getUserConfig().saveConfig(true);
    }

    public static void d0(d81 d81Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l4;
        Long l10;
        long j10;
        int i12;
        String str6 = "";
        if (i10 == 0) {
            d81Var.getUserConfig().syncContacts = true;
            d81Var.getUserConfig().saveConfig(false);
            d81Var.getContactsController().forceImportContacts();
        } else if (i10 == 1) {
            d81Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            d81Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            d81Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            d81Var.f38759c.f32150g3.O(true);
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.t.s(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            d81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
            org.telegram.ui.Components.gb1.T();
            SharedPrefsHelper.cleanupAccount(d81Var.currentAccount);
            MessagesController.getEmojiSettings(d81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            MessagesController.getGlobalNotificationsSettings().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            ChatThemeController.getInstance(d81Var.currentAccount).clearCache();
            d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            y21.X();
            rg.s0.e(d81Var.currentAccount).a();
            SharedPreferences mainSettings = d81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.t.e(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str7 : mainSettings.getAll().keySet()) {
                if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                    edit.remove(str7);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(d81Var.currentAccount).edit();
            for (String str8 : MessagesController.getNotificationsSettings(d81Var.currentAccount).getAll().keySet()) {
                if (str8.startsWith("dialog_bar_botver")) {
                    edit2.remove(str8);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(d81Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) d81Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            d81Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = d81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        } else {
            try {
                if (i10 == 14) {
                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(ApplicationLoader.applicationContext);
                    webView.clearHistory();
                    webView.destroy();
                } else if (i10 == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                } else if (i10 == 16) {
                    SharedConfig.toggleDebugWebView();
                    Activity parentActivity = d81Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = d81Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    a8.xe.a((LaunchActivity) d81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    d81Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    d81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new r71(d81Var, 0));
                } else if (i10 == 20) {
                    int i13 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    int i14 = 0;
                    while (i14 < i13) {
                        StringBuilder sb3 = new StringBuilder("/sys/devices/system/cpu/cpu");
                        sb3.append(i14);
                        long j19 = j11;
                        sb3.append("/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong(sb3.toString());
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i14 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i14 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i14 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i14);
                        sb2.append(" ");
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            l10 = sysInfoLong2;
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j10 = (sysInfoLong.longValue() / 1000) + j19;
                            j12++;
                        } else {
                            l10 = sysInfoLong2;
                            j10 = j19;
                        }
                        long j20 = j10;
                        if (l10 != null) {
                            sb2.append("cur=");
                            sb2.append(l10.longValue() / 1000);
                            sb2.append(" ");
                            j13 += l10.longValue() / 1000;
                            j14++;
                        }
                        if (sysInfoLong3 != null) {
                            sb2.append("max=");
                            sb2.append(sysInfoLong3.longValue() / 1000);
                            sb2.append(" ");
                            j15 = (sysInfoLong3.longValue() / 1000) + j15;
                            j16++;
                        }
                        if (sysInfoLong4 != null) {
                            sb2.append("cpc=");
                            sb2.append(sysInfoLong4);
                            sb2.append(" ");
                            j17 = sysInfoLong4.longValue() + j17;
                            j18++;
                        }
                        sb2.append("\n");
                        i14++;
                        j11 = j20;
                    }
                    long j21 = j11;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(Build.MANUFACTURER);
                    sb4.append(", ");
                    sb4.append(Build.MODEL);
                    sb4.append(" (");
                    sb4.append(Build.PRODUCT);
                    sb4.append(", ");
                    sb4.append(Build.DEVICE);
                    sb4.append(")  (android ");
                    int i15 = Build.VERSION.SDK_INT;
                    sb4.append(i15);
                    sb4.append(")\n");
                    if (i15 >= 31) {
                        sb4.append("SoC: ");
                        sb4.append(Build.SOC_MANUFACTURER);
                        sb4.append(", ");
                        sb4.append(Build.SOC_MODEL);
                        sb4.append("\n");
                    }
                    String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
                    if (sysInfoString != null) {
                        sb4.append("GPU: ");
                        sb4.append(sysInfoString);
                        Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                        Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                        if (sysInfoLong5 != null) {
                            sb4.append(", min=");
                            l4 = sysInfoLong6;
                            sb4.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            l4 = sysInfoLong6;
                        }
                        if (l4 != null) {
                            sb4.append(", mmin=");
                            sb4.append(l4.longValue() / 1000);
                        }
                        if (sysInfoLong7 != null) {
                            sb4.append(", max=");
                            sb4.append(sysInfoLong7.longValue() / 1000);
                        }
                        sb4.append("\n");
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb4.append("GLES Version: ");
                    sb4.append(deviceConfigurationInfo.getGlEsVersion());
                    sb4.append("\nMemory: class=");
                    sb4.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb4.append(", total=");
                    sb4.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
                    sb4.append(", avail=");
                    sb4.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
                    sb4.append(", low?=");
                    sb4.append(memoryInfo.lowMemory);
                    sb4.append(" (threshold=");
                    sb4.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
                    sb4.append(")\nCurrent class: ");
                    sb4.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
                    sb4.append(", measured: ");
                    sb4.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
                    if (i15 >= 31) {
                        sb4.append(", suggest=");
                        sb4.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb4.append("\n");
                    sb4.append(i13);
                    sb4.append(" CPUs");
                    if (j12 > 0) {
                        sb4.append(", avgMinFreq=");
                        sb4.append(j21 / j12);
                    }
                    if (j14 > 0) {
                        sb4.append(", avgCurFreq=");
                        sb4.append(j13 / j14);
                    }
                    if (j16 > 0) {
                        sb4.append(", avgMaxFreq=");
                        sb4.append(j15 / j16);
                    }
                    if (j18 > 0) {
                        sb4.append(", avgCapacity=");
                        sb4.append(j17 / j18);
                    }
                    sb4.append("\n");
                    sb4.append((CharSequence) sb2);
                    i0("video/avc", sb4);
                    i0("video/hevc", sb4);
                    i0("video/x-vnd.on2.vp8", sb4);
                    i0("video/x-vnd.on2.vp9", sb4);
                    d81Var.showDialog(new w71(d81Var, d81Var.getParentActivity(), sb4.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d81Var.getParentActivity(), 0, d81Var.resourceProvider);
                    alertDialog$Builder.f22366a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    if (devicePerformanceClass == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
                    if (measureDevicePerformanceClass != 2) {
                        str2 = "";
                    } else {
                        str2 = " (measured)";
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(str.concat(str2));
                    if (devicePerformanceClass == 1) {
                        str3 = "**AVERAGE**";
                    } else {
                        str3 = "AVERAGE";
                    }
                    if (measureDevicePerformanceClass != 1) {
                        str4 = "";
                    } else {
                        str4 = " (measured)";
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str3.concat(str4));
                    if (devicePerformanceClass == 0) {
                        str5 = "**LOW**";
                    } else {
                        str5 = "LOW";
                    }
                    if (measureDevicePerformanceClass == 0) {
                        str6 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str6))}, new ty0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.p();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q5 = fi.c1.q(d81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q5).apply();
                    Activity parentActivity3 = d81Var.getParentActivity();
                    if (!q5) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    for (int i16 = 0; i16 < d81Var.getParentLayout().getFragmentStack().size(); i16++) {
                        ((org.telegram.ui.ActionBar.r2) d81Var.getParentLayout().getFragmentStack().get(i16)).clearSheets();
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    d81Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(d81Var.currentAccount);
                } else if (i10 == 29) {
                    hi.y.b();
                    hi.b1.c();
                    hi.q0.a();
                    hi.a5.c();
                } else if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                } else if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                } else if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                } else if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                } else if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                } else if (i10 == 35) {
                    MessagesController.getInstance(d81Var.currentAccount).loadAppConfig(true);
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                } else if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.B();
                    }
                } else if (i10 == 41) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z10;
                    edit3.putBoolean("debugViewMetrics", z10).apply();
                } else if (i10 == 42) {
                    wi.a aVar = wi.e.f51273a;
                    synchronized (aVar) {
                        if (!aVar.f51265b) {
                            SharedPreferences sharedPreferences = wi.d.f51272a;
                            aVar.f51266c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.f51265b = true;
                        }
                        boolean z11 = !aVar.d;
                        aVar.d = z11;
                        aVar.f51266c = true;
                        aVar.f51265b = true;
                        wi.d.f51272a.edit().putBoolean("experimental_settings_allowed", z11).apply();
                    }
                    d81Var.f38759c.f32150g3.O(true);
                } else if (i10 == 43) {
                    for (int i17 = 0; i17 < 4; i17++) {
                        if (UserConfig.getInstance(i17).isClientActivated()) {
                            MessagesStorage.getInstance(i17).clearWidgetHeights();
                        }
                    }
                    org.telegram.ui.Components.wc.b0(d81Var).R(R.raw.done, 36, "Widget heights cleared").j();
                } else if (i10 == 44) {
                    SharedConfig.toggleWidgetStaticLayers();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e0(d81 d81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            d81Var.f38767s = fileLocation;
            d81Var.v = photoSize2.location;
            d81Var.G.h(ImageLocation.getForLocal(fileLocation), "90_90", d81Var.F, null);
            d81Var.m0(true, false);
        } else if (d81Var.f38767s == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            d81Var.f38762e0 = d81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l71(1, d81Var, str));
        }
        d81Var.simpleActionBar.j().requestLayout();
    }

    public static void f0(d81 d81Var, org.telegram.ui.Components.t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.H0(LaunchActivity.I1, d81Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                ki1.a(d81Var.getParentActivity(), new org.telegram.ui.Components.oy(25, d81Var, tL_attachMenuBot), null);
            }
        } else if (t61Var.H(x71.class)) {
            int i10 = t61Var.f32885z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i10);
            }
        } else if (t61Var.H(org.telegram.ui.Cells.a7.class)) {
            Object obj2 = t61Var.G;
            if (obj2 instanceof t01) {
                t01 t01Var = (t01) obj2;
                org.telegram.ui.ActionBar.j5 parentLayout = d81Var.getParentLayout();
                t01Var.f43638b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, t01Var.f43639c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(d81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, d81Var.f38763f.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = t61Var.G;
            if (obj3 != null) {
                d81Var.f38763f.E(obj3);
            }
        } else {
            switch (t61Var.d) {
                case 1:
                    d81Var.j0(new UserInfoActivity());
                    return;
                case 2:
                    d81Var.j0(new ThemeActivity(0));
                    return;
                case 3:
                    d81Var.j0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    d81Var.j0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    d81Var.j0(new DataSettingsActivity());
                    return;
                case 7:
                    d81Var.j0(new FiltersSetupActivity());
                    return;
                case 8:
                    d81Var.j0(new SessionsActivity(0));
                    return;
                case 9:
                    d81Var.j0(new tb0());
                    return;
                case 10:
                    d81Var.j0(new LanguageSelectActivity());
                    return;
                case 11:
                    d81Var.j0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    d81Var.j0(new bi.dd());
                    return;
                case 13:
                    d81Var.j0(new gi.h());
                    return;
                case 15:
                    d81Var.j0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    vg.n1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    d81Var.showDialog(org.telegram.ui.Components.g5.T(d81Var, d81Var.resourceProvider));
                    return;
                case 18:
                    qf.d.r(d81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    qf.d.r(d81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.P4(d81Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.P4(d81Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(d81Var.currentAccount).isFrozen()) {
                        b.b(d81Var.currentAccount);
                        return;
                    } else {
                        qf.d.r(d81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
                case 24:
                    d81Var.presentFragment(new org.telegram.ui.ActionBar.r2(null));
                    return;
                case 25:
                    d81Var.j0(new org.telegram.ui.Wallet.m5());
                    return;
                case 26:
                    d81Var.presentFragment(new org.telegram.ui.ActionBar.r2(null));
                    return;
                case 27:
                    ?? m71Var = new org.telegram.ui.Components.m71();
                    m71Var.e = true;
                    d81Var.presentFragment((org.telegram.ui.ActionBar.r2) m71Var);
                    return;
            }
        }
    }

    public static oi.q g0(d81 d81Var) {
        return d81Var.glassEngine;
    }

    public static void i0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i11].equals(str)) {
                            if (codecInfoAt.isEncoder()) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList.add(Integer.valueOf(i10));
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                sb2.append("\n");
                sb2.append(arrayList2.size());
                sb2.append("+");
                sb2.append(arrayList3.size());
                sb2.append(" ");
                sb2.append(str.substring(6));
                sb2.append(" codecs:\n");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
                    sb2.append("{d} ");
                    sb2.append(codecInfoAt2.getName());
                    sb2.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt2.isHardwareAccelerated()) {
                            sb2.append("gpu");
                        }
                        if (codecInfoAt2.isSoftwareOnly()) {
                            sb2.append("cpu");
                        }
                        if (codecInfoAt2.isVendor()) {
                            sb2.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                    sb2.append("; mi=");
                    sb2.append(capabilitiesForType.getMaxSupportedInstances());
                    sb2.append(")");
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (i13 > 0 || !arrayList2.isEmpty()) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i13)).intValue());
                    sb2.append("{e} ");
                    sb2.append(codecInfoAt3.getName());
                    sb2.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt3.isHardwareAccelerated()) {
                            sb2.append("gpu");
                        }
                        if (codecInfoAt3.isSoftwareOnly()) {
                            sb2.append("cpu");
                        }
                        if (codecInfoAt3.isVendor()) {
                            sb2.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                    sb2.append("; mi=");
                    sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                    sb2.append(")");
                }
                sb2.append("\n");
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            h0();
        }
    }

    @Override
    public final void F(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.f38766r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.f38766r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f38757b = new a9(this, context, 7);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.f38764f0 = true;
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 7));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.f23289z0 = new jg.e2(this, 19);
        this.d = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.y5 a10 = j10.a(1, R.drawable.ic_ab_other);
        this.e = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.e.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        u71 u71Var = new u71(this, this, context);
        this.f38763f = u71Var;
        u71Var.G();
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(this, new e5(this, 26), new s71(this), new s71(this));
        this.f38759c = r71Var;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.r71 r71Var2 = this.f38759c;
        r71Var2.f32150g3.f29505r = false;
        r71Var2.u1();
        this.f38759c.setSectionsDrawBackground(true);
        oi.a.d(this.f38759c, 0, 0, AndroidUtilities.dp(12.0f), this.f38761d0);
        this.f38759c.setClipToPadding(false);
        this.f38759c.j(new i3(this, 29));
        this.f38757b.addView(this.f38759c, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.f38757b.addView(this.P, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.f38757b.addView(this.simpleActionBar, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
        this.h = g50Var;
        g50Var.H = true;
        g50Var.f28419a = this;
        g50Var.f28420b = this;
        this.f38768w = new FrameLayout(context);
        k0 k0Var = new k0(this, context, 25);
        this.f38770y = k0Var;
        this.f38768w.addView(k0Var, org.telegram.ui.Components.gb1.h(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f38770y.setOnClickListener(new q71(this, 5));
        org.telegram.ui.Components.gb1.b(this.f38770y);
        this.f38768w.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                d81.this.o0();
            }
        });
        this.E = new org.telegram.ui.Components.ri0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38769x = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f38769x.setPivotY(0.0f);
        this.E.addView(this.f38769x, org.telegram.ui.Components.gb1.i(90, 90, 51));
        a9 a9Var = this.f38757b;
        a9Var.addView(this.E, a9Var.indexOfChild(this.f38759c) + 1, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.F = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.G = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f38769x.addView(this.G, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.f38766r = d4Var;
        d4Var.setSize(AndroidUtilities.dp(26.0f));
        this.f38766r.setProgressColor(-1);
        this.f38766r.setNoProgress(false);
        this.f38769x.addView(this.f38766r, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int dp = AndroidUtilities.dp(32.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23297a7;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, getThemedColor(i10));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, resourceProvider);
        this.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        int dp2 = AndroidUtilities.dp(30.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K2 = org.telegram.ui.ActionBar.y6.K(dp2, getThemedColor(i11));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        org.telegram.ui.ActionBar.f7.k(frameLayout3, K2, N2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.J.setImageResource(R.drawable.filled_premium_camera);
        this.I.addView(this.J, org.telegram.ui.Components.gb1.i(22, 22, 17));
        this.H.addView(this.I, org.telegram.ui.Components.gb1.g(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        a9 a9Var2 = this.f38757b;
        a9Var2.addView(this.H, a9Var2.indexOfChild(this.E) + 1, org.telegram.ui.Components.gb1.i(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(AndroidUtilities.bold());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView k10 = d3.k(this.f38768w, this.K, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = k10;
        k10.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView k11 = d3.k(this.f38768w, this.L, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = k11;
        k11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(this.M, org.telegram.ui.ActionBar.y6.B6, getResourceProvider());
        this.M.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i12 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12), 2, -1), null, org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
        this.M.setOnClickListener(new q71(this, 6));
        this.O = new View(context);
        n0(true, false);
        this.f38759c.f32150g3.O(false);
        l0(getUserConfig().getCurrentUser());
        p0();
        h0();
        this.simpleActionBar.setBackground(null);
        int i13 = this.mSystemInsets.f13451b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        n0(true, false);
        a9 a9Var3 = this.f38757b;
        s71 s71Var = new s71(this);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(a9Var3, s71Var);
        a9 a9Var4 = this.f38757b;
        this.fragmentView = a9Var4;
        return a9Var4;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.r71 r71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            l0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.r71 r71Var2 = this.f38759c;
            if (r71Var2 != null) {
                r71Var2.f32150g3.O(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            l0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (r71Var = this.f38759c) != null) {
            r71Var.f32150g3.O(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f38759c;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.r5 r5Var;
        boolean z10;
        int i10;
        int i11;
        if (this.N && (z10 = (r5Var = this.simpleActionBar).F) != this.f38764f0) {
            this.f38764f0 = z10;
            if (z10) {
                i10 = R.drawable.ic_ab_back;
            } else {
                i10 = R.drawable.outline_header_qr_24;
            }
            r5Var.setBackButtonImageAnimated(i10);
            org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
            if (z10) {
                i11 = R.string.AccDescrGoBack;
            } else {
                i11 = R.string.QrCode;
            }
            r5Var2.setBackButtonContentDescription(LocaleController.getString(i11));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f38755a.f19327f;
    }

    public final void j0(org.telegram.ui.ActionBar.r2 r2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.I1) != null && (actionBarLayout = launchActivity.f35554s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.c0((org.telegram.ui.ActionBar.r2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(r2Var);
            g5Var.f22662c = true;
            g5Var.f22664g = true;
            actionBarLayout.T(g5Var);
            return;
        }
        presentFragment(r2Var);
    }

    public final void k0(float f7) {
        this.simpleActionBar.setTitlesAlpha(f7);
        View view = this.P;
        if (view != null) {
            view.setAlpha(f7);
        }
    }

    public final void l0(TLRPC.User user) {
        String str;
        String str2;
        if (this.G == null || this.f38762e0 != -1) {
            return;
        }
        this.F.r(user);
        this.G.f(user, this.F);
        this.K.setText(UserObject.getUserName(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(kf.b.c().b("+" + user.phone));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null) {
            sb2.append(" • @");
            sb2.append(publicUsername);
        }
        this.L.setText(sb2);
        TextView textView = this.M;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            int i10 = packageInfo.versionCode;
            int i11 = i10 / 10;
            int i12 = i10 % 10;
            if (i12 != 1 && i12 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str2 = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
            } else {
                str2 = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i13 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            str = LocaleController.formatString(i13, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str2);
        } catch (Exception e) {
            FileLog.e(e);
            str = null;
        }
        textView.setText(str);
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.f38766r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f38765n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f38765n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38765n = animatorSet2;
            if (z10) {
                this.f38766r.setVisibility(0);
                this.f38765n.playTogether(ObjectAnimator.ofFloat(this.f38766r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38766r, View.ALPHA, 0.0f));
            }
            this.f38765n.setDuration(180L);
            this.f38765n.addListener(new q40(10, this, z10));
            this.f38765n.start();
        } else if (z10) {
            this.f38766r.setAlpha(1.0f);
            this.f38766r.setVisibility(0);
        } else {
            this.f38766r.setAlpha(0.0f);
            this.f38766r.setVisibility(4);
        }
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d81.n0(boolean, boolean):void");
    }

    public final void o0() {
        if (this.E != null && this.f38769x != null) {
            float height = this.f38770y.getHeight() / 2.0f;
            View view = this.f38770y;
            float f7 = 1.0f;
            while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
                height += view.getY();
                f7 *= view.getAlpha();
                view = (View) view.getParent();
            }
            if (view == this.fragmentView && this.f38770y.isAttachedToWindow() && this.f38770y.getHeight() != 0) {
                float f10 = 0.0f;
                for (View view2 = this.f38768w; view2 != null && view2 != this.f38759c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f10 += view2.getY();
                }
                float paddingTop = (height - f10) + this.f38759c.getPaddingTop();
                v71 v71Var = this.E;
                float f11 = -AndroidUtilities.dp(16.0f);
                NotchInfoUtils.NotchInfo notchInfo = v71Var.f32254n;
                if (notchInfo != null && notchInfo.isLikelyCircle) {
                    f11 = notchInfo.bounds.centerY();
                }
                float a2 = a8.ee.a((height - f11) / Math.max(1.0f, paddingTop - f11), 0.0f, 1.0f);
                float max = Math.max(height, f11);
                this.Y = height;
                this.Z = paddingTop;
                this.f38756a0 = f11;
                float dp = AndroidUtilities.dp(90.0f);
                float scaleX = this.f38770y.getScaleX() * (AndroidUtilities.lerp(AndroidUtilities.dp(this.E.getHiddenAvatarSizeDp()), dp, a2) / dp);
                float f12 = (dp * scaleX) / 2.0f;
                float width = (this.E.getWidth() / 2.0f) - f12;
                if (max != this.V || scaleX != this.W || a2 != this.X || f7 != this.E.getAlpha() || width != this.f38769x.getTranslationX()) {
                    this.V = max;
                    this.W = scaleX;
                    this.X = a2;
                    this.E.setAlpha(f7);
                    this.f38769x.setScaleX(scaleX);
                    this.f38769x.setScaleY(scaleX);
                    this.f38769x.setTranslationX(width);
                    float f13 = max - f12;
                    this.f38769x.setTranslationY(f13);
                    this.H.setAlpha(a8.ee.a(AndroidUtilities.ilerp(a2, 0.75f, 1.0f), 0.0f, 1.0f) * f7);
                    this.H.setScaleX(scaleX);
                    this.H.setScaleY(scaleX);
                    this.H.setTranslationX((AndroidUtilities.dp(60.0f) * scaleX) + width);
                    this.H.setTranslationY((AndroidUtilities.dp(60.0f) * scaleX) + f13);
                    this.E.setHideProgress(1.0f - a2);
                }
            } else if (this.X != 0.0f) {
                this.X = 0.0f;
                this.E.setHideProgress(1.0f);
                this.H.setAlpha(0.0f);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var.F) {
            if (z10) {
                r5Var.f(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
        this.R = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.updateInterfaces).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.N = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.N) {
            i10 = AndroidUtilities.dp(72.0f);
        }
        this.f38761d0 = i10;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.j71 j71Var = this.f38759c.f32150g3;
        if (j71Var != null) {
            j71Var.l();
        }
    }

    public final void p0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23746y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor}));
        }
        this.f38759c.invalidate();
    }

    @Override
    public final void s() {
        this.f38759c.y0(0);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final hh.d y() {
        return null;
    }

    public d81(Bundle bundle) {
        super(bundle);
        this.f38755a = new oe.b(0, this, org.telegram.ui.Components.ds.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.f38758b0 = new ArrayList();
        this.f38762e0 = -1;
        this.f38764f0 = true;
    }

    @Override
    public final void D() {
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
