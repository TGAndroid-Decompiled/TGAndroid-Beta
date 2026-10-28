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
public final class f81 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50, qg0, oe.d {
    public x71 E;
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
    public final oe.b f39256a;
    public float f39257a0;
    public a9 f39258b;
    public final ArrayList f39259b0;
    public org.telegram.ui.Components.s71 f39260c;
    public int f39261c0;
    public org.telegram.ui.ActionBar.y5 d;
    public int f39262d0;
    public org.telegram.ui.ActionBar.y5 e;
    public int f39263e0;
    public w71 f39264f;
    public boolean f39265f0;
    public org.telegram.ui.Components.g50 h;
    public AnimatorSet f39266n;
    public org.telegram.ui.Cells.d4 f39267r;
    public TLRPC.FileLocation f39268s;
    public TLRPC.FileLocation v;
    public FrameLayout f39269w;
    public FrameLayout f39270x;
    public k0 f39271y;

    public f81() {
        this(null);
    }

    public static boolean V(f81 f81Var, org.telegram.ui.Components.u61 u61Var, View view) {
        String str;
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            hi.m3.j(f81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new r71(f81Var, 2));
            return true;
        }
        if (u61Var.H(org.telegram.ui.Cells.a7.class)) {
            Object obj2 = u61Var.G;
            if (obj2 instanceof v01) {
                str = ((v01) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(f81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new by0(22, f81Var, str), false);
                H.W(f81Var.f39260c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void W(f81 f81Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(f81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(f81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(f81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.g50 g50Var = f81Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        g50Var.n(z10, new r71(f81Var, 0), new fi.e1(7), 0);
    }

    public static void X(f81 f81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(LaunchActivity.I1, f81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(f81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void Y(f81 f81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(f81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(f81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new n71(2, f81Var, tL_attachMenuBot), 66);
    }

    public static void Z(org.telegram.ui.f81 r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f81.Z(org.telegram.ui.f81):void");
    }

    public static void a0(f81 f81Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        String str;
        int i11;
        String str2;
        int i12 = 0;
        if (f81Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.u61.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            w71 w71Var = f81Var.f39264f;
            ArrayList arrayList2 = w71Var.d;
            ArrayList arrayList3 = w71Var.v;
            if (w71Var.f44477w) {
                ArrayList arrayList4 = w71Var.f44475r;
                int size = arrayList4.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int i15 = org.telegram.ui.Cells.a7.f23861a;
                    org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.a7.class);
                    K.f33249l = (CharSequence) w71Var.f44474n.get(i13);
                    K.G = (v01) obj;
                    arrayList.add(K);
                    i13++;
                }
                if (!w71Var.f44476s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList5 = w71Var.f44476s;
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        int i16 = org.telegram.ui.Cells.a7.f23861a;
                        org.telegram.ui.Components.u61 K2 = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.a7.class);
                        K2.f33249l = (CharSequence) w71Var.f44474n.get(i13);
                        K2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(K2);
                        i13++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof v01) {
                        v01 v01Var = (v01) obj3;
                        String str3 = v01Var.f44152a;
                        int i18 = org.telegram.ui.Cells.a7.f23861a;
                        org.telegram.ui.Components.u61 K3 = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.a7.class);
                        K3.f33249l = str3;
                        K3.G = v01Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str4 = faqSearchResult.title;
                        int i19 = org.telegram.ui.Cells.a7.f23861a;
                        org.telegram.ui.Components.u61 K4 = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.a7.class);
                        K4.f33249l = str4;
                        K4.G = faqSearchResult;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.u61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList2.size();
                while (i12 < size4) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str5 = faqSearchResult2.title;
                    int i20 = org.telegram.ui.Cells.a7.f23861a;
                    org.telegram.ui.Components.u61 K5 = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.a7.class);
                    K5.f33249l = str5;
                    K5.G = faqSearchResult2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.u61.n(f81Var.f39269w, 188));
        f81Var.f39259b0.clear();
        for (int i21 = 0; i21 < 4; i21++) {
            if (UserConfig.getInstance(i21).isClientActivated() && f81Var.currentAccount != i21) {
                f81Var.f39259b0.add(Integer.valueOf(i21));
            }
        }
        Collections.sort(f81Var.f39259b0, new dv(10));
        Set<String> set = f81Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(d81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new s71(f81Var, 0)));
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && f81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(d81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.wh.g(new StringBuilder("+"), f81Var.getUserConfig().getCurrentUser().phone, kf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new r71(f81Var, 1)), LocaleController.getString(R.string.CheckPhoneNumberNo), new s71(f81Var, 1), bi.h7.H2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new s71(f81Var, 2)));
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(d81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new s71(f81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new s71(f81Var, 4)));
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        }
        if (f81Var.f39259b0.size() > 0) {
            ic.a.p(R.string.SettingsAccounts, arrayList);
            for (int i22 = 0; i22 < f81Var.f39259b0.size(); i22++) {
                int intValue = ((Integer) f81Var.f39259b0.get(i22)).intValue();
                int i23 = z71.f46189a;
                org.telegram.ui.Components.u61 K6 = org.telegram.ui.Components.u61.K(z71.class);
                K6.d = i22;
                K6.f33262z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        }
        if (f81Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && f81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(f81Var.currentAccount);
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
            if (x9.v() > 0) {
                str2 = org.telegram.ui.Wallet.l0.o(x9.v(), false);
            } else {
                str2 = null;
            }
            arrayList.add(b81.a(25, 0, 0, i24, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        }
        arrayList.add(b81.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(b81.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(b81.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(b81.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(b81.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(b81.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(b81.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(b81.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(b81.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.u61.C(null));
        if (!z10 && f81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(f81Var.currentAccount);
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
            if (x10.v() > 0) {
                str = org.telegram.ui.Wallet.l0.o(x10.v(), false);
            } else {
                str = null;
            }
            arrayList.add(b81.a(25, 0, 0, i26, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        }
        if (!f81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(b81.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (f81Var.getMessagesController().starsPurchaseAvailable()) {
            bi.ca y3 = bi.ca.y(f81Var.currentAccount, false);
            long j10 = y3.p().amount;
            int i28 = R.drawable.settings_stars;
            String string3 = LocaleController.getString(R.string.TelegramStars);
            if (!y3.e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = bi.dd.I0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(b81.a(12, -1071598, -1608430, i28, string3, null, spannableStringBuilder));
        }
        bi.ca.y(f81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (bi.ca.y(f81Var.currentAccount, true).e && (bi.ca.y(f81Var.currentAccount, true).O(0) || bi.ca.y(f81Var.currentAccount, true).p().positive()))) {
            bi.ca y10 = bi.ca.y(f81Var.currentAccount, true);
            long j11 = y10.p().amount;
            int i29 = R.drawable.filled_gram_earnings;
            String string4 = LocaleController.getString(R.string.GramEarnings);
            if (y10.e && j11 > 0) {
                charSequence3 = bi.dd.I0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(b81.a(13, -14965523, -15431455, i29, string4, null, charSequence3));
        }
        if (!f81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(b81.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!f81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(b81.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.u61) ic.a.g(1, arrayList)).f47075a != 7) {
            arrayList.add(org.telegram.ui.Components.u61.C(null));
        }
        ic.a.p(R.string.SettingsHelp, arrayList);
        arrayList.add(b81.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(b81.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(b81.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(b81.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        wi.a aVar = wi.e.f51334a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.u61.C(null));
            arrayList.add(org.telegram.ui.Components.u61.u("Experimental"));
            arrayList.add(b81.a(24, -765355, -2148011, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
            arrayList.add(b81.a(26, -11154873, -14175180, 0, LocaleController.getString(R.string.AudioRecorderSettings), null, null));
            arrayList.add(b81.a(27, -12743701, -13996071, 0, LocaleController.getString(R.string.HeaderSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.u61.C(null));
            ic.a.p(R.string.SettingsDebug, arrayList);
            arrayList.add(b81.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(b81.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(b81.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.u61.m(f81Var.M));
    }

    public static void c0(f81 f81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        f81Var.f39263e0 = -1;
        if (tL_error == null) {
            TLRPC.User user = f81Var.getMessagesController().getUser(Long.valueOf(f81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = f81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                f81Var.getMessagesController().putUser(user, false);
            } else {
                f81Var.getUserConfig().setCurrentUser(user);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22052id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && f81Var.f39268s != null) {
                FileLoader.getInstance(f81Var.currentAccount).getPathToAttach(f81Var.f39268s, true).renameTo(FileLoader.getInstance(f81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f81Var.f39268s.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(f81Var.f39268s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(f81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(f81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && f81Var.v != null) {
                FileLoader.getInstance(f81Var.currentAccount).getPathToAttach(f81Var.v, true).renameTo(FileLoader.getInstance(f81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            f81Var.getMessagesController().getDialogPhotos(user.f22177id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            f81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = f81Var.getMessagesController().getUserFull(f81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                f81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            f81Var.l0(user);
        }
        f81Var.f39268s = null;
        f81Var.v = null;
        f81Var.m0(false, true);
        f81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        f81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        f81Var.getUserConfig().saveConfig(true);
    }

    public static void d0(f81 f81Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l4;
        long j10;
        Long l10;
        int i12;
        int i13 = 0;
        if (i10 == 0) {
            f81Var.getUserConfig().syncContacts = true;
            f81Var.getUserConfig().saveConfig(false);
            f81Var.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i10 == 1) {
            f81Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            f81Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            f81Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            f81Var.f39260c.f32504g3.O(true);
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
            f81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
            org.telegram.ui.Components.kb1.T();
            SharedPrefsHelper.cleanupAccount(f81Var.currentAccount);
            MessagesController.getEmojiSettings(f81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(f81Var.currentAccount).clearCache();
            f81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            a31.X();
            rg.s0.e(f81Var.currentAccount).a();
            SharedPreferences mainSettings = f81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.t.e(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str7 : mainSettings.getAll().keySet()) {
                if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                    edit.remove(str7);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(f81Var.currentAccount).edit();
            for (String str8 : MessagesController.getNotificationsSettings(f81Var.currentAccount).getAll().keySet()) {
                if (str8.startsWith("dialog_bar_botver")) {
                    edit2.remove(str8);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(f81Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) f81Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            f81Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = f81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            f81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = f81Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = f81Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    a8.xe.a((LaunchActivity) f81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    f81Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    f81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new t71(f81Var, 0));
                } else if (i10 == 20) {
                    int i14 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    long j19 = 0;
                    while (i13 < i14) {
                        long j20 = j11;
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i13);
                        sb2.append(" ");
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            l10 = sysInfoLong2;
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j13++;
                            j10 = (sysInfoLong.longValue() / 1000) + j12;
                        } else {
                            j10 = j12;
                            l10 = sysInfoLong2;
                        }
                        if (l10 != null) {
                            sb2.append("cur=");
                            sb2.append(l10.longValue() / 1000);
                            sb2.append(" ");
                            j14 += l10.longValue() / 1000;
                            j15++;
                        }
                        if (sysInfoLong3 != null) {
                            sb2.append("max=");
                            sb2.append(sysInfoLong3.longValue() / 1000);
                            sb2.append(" ");
                            j16 = (sysInfoLong3.longValue() / 1000) + j16;
                            j17++;
                        }
                        if (sysInfoLong4 != null) {
                            sb2.append("cpc=");
                            sb2.append(sysInfoLong4);
                            sb2.append(" ");
                            j18 = sysInfoLong4.longValue() + j18;
                            j19++;
                        }
                        sb2.append("\n");
                        i13++;
                        j11 = j20;
                        j12 = j10;
                    }
                    long j21 = j11;
                    long j22 = j12;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Build.MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.MODEL);
                    sb3.append(" (");
                    sb3.append(Build.PRODUCT);
                    sb3.append(", ");
                    sb3.append(Build.DEVICE);
                    sb3.append(")  (android ");
                    int i15 = Build.VERSION.SDK_INT;
                    sb3.append(i15);
                    sb3.append(")\n");
                    if (i15 >= 31) {
                        sb3.append("SoC: ");
                        sb3.append(Build.SOC_MANUFACTURER);
                        sb3.append(", ");
                        sb3.append(Build.SOC_MODEL);
                        sb3.append("\n");
                    }
                    String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
                    if (sysInfoString != null) {
                        sb3.append("GPU: ");
                        sb3.append(sysInfoString);
                        Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                        Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                        if (sysInfoLong5 != null) {
                            sb3.append(", min=");
                            l4 = sysInfoLong6;
                            sb3.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            l4 = sysInfoLong6;
                        }
                        if (l4 != null) {
                            sb3.append(", mmin=");
                            sb3.append(l4.longValue() / 1000);
                        }
                        if (sysInfoLong7 != null) {
                            sb3.append(", max=");
                            sb3.append(sysInfoLong7.longValue() / 1000);
                        }
                        sb3.append("\n");
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb3.append("GLES Version: ");
                    sb3.append(deviceConfigurationInfo.getGlEsVersion());
                    sb3.append("\nMemory: class=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb3.append(", total=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
                    sb3.append(", avail=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
                    sb3.append(", low?=");
                    sb3.append(memoryInfo.lowMemory);
                    sb3.append(" (threshold=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
                    sb3.append(")\nCurrent class: ");
                    sb3.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
                    sb3.append(", measured: ");
                    sb3.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
                    if (i15 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i14);
                    sb3.append(" CPUs");
                    if (j13 > j21) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j22 / j13);
                    }
                    if (j15 > j21) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j14 / j15);
                    }
                    if (j17 > j21) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j16 / j17);
                    }
                    if (j19 > j21) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j18 / j19);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    i0("video/avc", sb3);
                    i0("video/hevc", sb3);
                    i0("video/x-vnd.on2.vp8", sb3);
                    i0("video/x-vnd.on2.vp9", sb3);
                    f81Var.showDialog(new y71(f81Var, f81Var.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f81Var.getParentActivity(), 0, f81Var.resourceProvider);
                    alertDialog$Builder.f22369a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    if (devicePerformanceClass == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
                    if (measureDevicePerformanceClass == 2) {
                        str2 = " (measured)";
                    } else {
                        str2 = "";
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(str.concat(str2));
                    if (devicePerformanceClass == 1) {
                        str3 = "**AVERAGE**";
                    } else {
                        str3 = "AVERAGE";
                    }
                    if (measureDevicePerformanceClass == 1) {
                        str4 = " (measured)";
                    } else {
                        str4 = "";
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str3.concat(str4));
                    if (devicePerformanceClass == 0) {
                        str5 = "**LOW**";
                    } else {
                        str5 = "LOW";
                    }
                    if (measureDevicePerformanceClass == 0) {
                        str6 = " (measured)";
                    } else {
                        str6 = "";
                    }
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str6))}, new vy0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.p();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q5 = fi.c1.q(f81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q5).apply();
                    Activity parentActivity3 = f81Var.getParentActivity();
                    if (!q5) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i13 < f81Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.r2) f81Var.getParentLayout().getFragmentStack().get(i13)).clearSheets();
                        i13++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    f81Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(f81Var.currentAccount);
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
                    MessagesController.getInstance(f81Var.currentAccount).loadAppConfig(true);
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
                    wi.a aVar = wi.e.f51334a;
                    synchronized (aVar) {
                        if (!aVar.f51326b) {
                            SharedPreferences sharedPreferences = wi.d.f51333a;
                            aVar.f51327c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.f51326b = true;
                        }
                        boolean z11 = !aVar.d;
                        aVar.d = z11;
                        aVar.f51327c = true;
                        aVar.f51326b = true;
                        wi.d.f51333a.edit().putBoolean("experimental_settings_allowed", z11).apply();
                    }
                    f81Var.f39260c.f32504g3.O(true);
                } else if (i10 == 43) {
                    while (i13 < 4) {
                        if (UserConfig.getInstance(i13).isClientActivated()) {
                            MessagesStorage.getInstance(i13).clearWidgetHeights();
                        }
                        i13++;
                    }
                    org.telegram.ui.Components.wc.b0(f81Var).R(R.raw.done, 36, "Widget heights cleared").j();
                } else if (i10 == 44) {
                    SharedConfig.toggleWidgetStaticLayers();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e0(f81 f81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            f81Var.f39268s = fileLocation;
            f81Var.v = photoSize2.location;
            f81Var.G.h(ImageLocation.getForLocal(fileLocation), "90_90", f81Var.F, null);
            f81Var.m0(true, false);
        } else if (f81Var.f39268s == null) {
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
            f81Var.f39263e0 = f81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new n71(1, f81Var, str));
        }
        f81Var.simpleActionBar.j().requestLayout();
    }

    public static void f0(f81 f81Var, org.telegram.ui.Components.u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.H0(LaunchActivity.I1, f81Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                mi1.a(f81Var.getParentActivity(), new org.telegram.ui.Components.oy(25, f81Var, tL_attachMenuBot), null);
            }
        } else if (u61Var.H(z71.class)) {
            int i10 = u61Var.f33262z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i10);
            }
        } else if (u61Var.H(org.telegram.ui.Cells.a7.class)) {
            Object obj2 = u61Var.G;
            if (obj2 instanceof v01) {
                v01 v01Var = (v01) obj2;
                org.telegram.ui.ActionBar.j5 parentLayout = f81Var.getParentLayout();
                v01Var.f44153b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, v01Var.f44154c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(f81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, f81Var.f39264f.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = u61Var.G;
            if (obj3 != null) {
                f81Var.f39264f.E(obj3);
            }
        } else {
            switch (u61Var.d) {
                case 1:
                    f81Var.j0(new UserInfoActivity());
                    return;
                case 2:
                    f81Var.j0(new ThemeActivity(0));
                    return;
                case 3:
                    f81Var.j0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    f81Var.j0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    f81Var.j0(new DataSettingsActivity());
                    return;
                case 7:
                    f81Var.j0(new FiltersSetupActivity());
                    return;
                case 8:
                    f81Var.j0(new SessionsActivity(0));
                    return;
                case 9:
                    f81Var.j0(new wb0());
                    return;
                case 10:
                    f81Var.j0(new LanguageSelectActivity());
                    return;
                case 11:
                    f81Var.j0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    f81Var.j0(new bi.dd());
                    return;
                case 13:
                    f81Var.j0(new gi.h());
                    return;
                case 15:
                    f81Var.j0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    vg.n1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    f81Var.showDialog(org.telegram.ui.Components.g5.T(f81Var, f81Var.resourceProvider));
                    return;
                case 18:
                    qf.d.r(f81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    qf.d.r(f81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.P4(f81Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.P4(f81Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(f81Var.currentAccount).isFrozen()) {
                        b.b(f81Var.currentAccount);
                        return;
                    } else {
                        qf.d.r(f81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
                case 24:
                    f81Var.presentFragment(new org.telegram.ui.ActionBar.r2(null));
                    return;
                case 25:
                    f81Var.j0(new org.telegram.ui.Wallet.m5());
                    return;
                case 26:
                    f81Var.presentFragment(new org.telegram.ui.ActionBar.r2(null));
                    return;
                case 27:
                    ?? n71Var = new org.telegram.ui.Components.n71();
                    n71Var.e = true;
                    f81Var.presentFragment((org.telegram.ui.ActionBar.r2) n71Var);
                    return;
            }
        }
    }

    public static oi.q g0(f81 f81Var) {
        return f81Var.glassEngine;
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
        org.telegram.ui.Cells.d4 d4Var = this.f39267r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.f39267r;
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
        this.f39258b = new a9(this, context, 7);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.f39265f0 = true;
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 7));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.f23292z0 = new jg.e2(this, 19);
        this.d = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.y5 a10 = j10.a(1, R.drawable.ic_ab_other);
        this.e = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.e.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        w71 w71Var = new w71(this, this, context);
        this.f39264f = w71Var;
        w71Var.G();
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(this, new e5(this, 26), new u71(this), new u71(this));
        this.f39260c = s71Var;
        s71Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.s71 s71Var2 = this.f39260c;
        s71Var2.f32504g3.f29878r = false;
        s71Var2.u1();
        this.f39260c.setSectionsDrawBackground(true);
        oi.a.d(this.f39260c, 0, 0, AndroidUtilities.dp(12.0f), this.f39262d0);
        this.f39260c.setClipToPadding(false);
        this.f39260c.j(new i3(this, 29));
        this.f39258b.addView(this.f39260c, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.f39258b.addView(this.P, org.telegram.ui.Components.kb1.i(-1, 0, 48));
        this.f39258b.addView(this.simpleActionBar, org.telegram.ui.Components.kb1.i(-1, -2, 55));
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
        this.h = g50Var;
        g50Var.H = true;
        g50Var.f28388a = this;
        g50Var.f28389b = this;
        this.f39269w = new FrameLayout(context);
        k0 k0Var = new k0(this, context, 25);
        this.f39271y = k0Var;
        this.f39269w.addView(k0Var, org.telegram.ui.Components.kb1.h(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f39271y.setOnClickListener(new s71(this, 5));
        org.telegram.ui.Components.kb1.b(this.f39271y);
        this.f39269w.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                f81.this.o0();
            }
        });
        this.E = new org.telegram.ui.Components.si0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39270x = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f39270x.setPivotY(0.0f);
        this.E.addView(this.f39270x, org.telegram.ui.Components.kb1.i(90, 90, 51));
        a9 a9Var = this.f39258b;
        a9Var.addView(this.E, a9Var.indexOfChild(this.f39260c) + 1, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.F = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.G = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f39270x.addView(this.G, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.f39267r = d4Var;
        d4Var.setSize(AndroidUtilities.dp(26.0f));
        this.f39267r.setProgressColor(-1);
        this.f39267r.setNoProgress(false);
        this.f39270x.addView(this.f39267r, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int dp = AndroidUtilities.dp(32.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23300a7;
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
        this.I.addView(this.J, org.telegram.ui.Components.kb1.i(22, 22, 17));
        this.H.addView(this.I, org.telegram.ui.Components.kb1.g(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        a9 a9Var2 = this.f39258b;
        a9Var2.addView(this.H, a9Var2.indexOfChild(this.E) + 1, org.telegram.ui.Components.kb1.i(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(AndroidUtilities.bold());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView k10 = d3.k(this.f39269w, this.K, org.telegram.ui.Components.kb1.h(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = k10;
        k10.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView k11 = d3.k(this.f39269w, this.L, org.telegram.ui.Components.kb1.h(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = k11;
        k11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(this.M, org.telegram.ui.ActionBar.y6.B6, getResourceProvider());
        this.M.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12), 2, -1), null, org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
        this.M.setOnClickListener(new s71(this, 6));
        this.O = new View(context);
        n0(true, false);
        this.f39260c.f32504g3.O(false);
        l0(getUserConfig().getCurrentUser());
        p0();
        h0();
        this.simpleActionBar.setBackground(null);
        int i13 = this.mSystemInsets.f13450b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        n0(true, false);
        a9 a9Var3 = this.f39258b;
        u71 u71Var = new u71(this);
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.a0.i(a9Var3, u71Var);
        a9 a9Var4 = this.f39258b;
        this.fragmentView = a9Var4;
        return a9Var4;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.s71 s71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            l0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.s71 s71Var2 = this.f39260c;
            if (s71Var2 != null) {
                s71Var2.f32504g3.O(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            l0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (s71Var = this.f39260c) != null) {
            s71Var.f32504g3.O(true);
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
    public final su0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f39260c;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.r5 r5Var;
        boolean z10;
        int i10;
        int i11;
        if (this.N && (z10 = (r5Var = this.simpleActionBar).F) != this.f39265f0) {
            this.f39265f0 = z10;
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
        return !this.f39256a.f19326f;
    }

    public final void j0(org.telegram.ui.ActionBar.r2 r2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.I1) != null && (actionBarLayout = launchActivity.f35581s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.c0((org.telegram.ui.ActionBar.r2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(r2Var);
            g5Var.f22665c = true;
            g5Var.f22667g = true;
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
        if (this.G == null || this.f39263e0 != -1) {
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
        if (this.f39267r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39266n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39266n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39266n = animatorSet2;
            if (z10) {
                this.f39267r.setVisibility(0);
                this.f39266n.playTogether(ObjectAnimator.ofFloat(this.f39267r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39267r, View.ALPHA, 0.0f));
            }
            this.f39266n.setDuration(180L);
            this.f39266n.addListener(new s40(10, this, z10));
            this.f39266n.start();
        } else if (z10) {
            this.f39267r.setAlpha(1.0f);
            this.f39267r.setVisibility(0);
        } else {
            this.f39267r.setAlpha(0.0f);
            this.f39267r.setVisibility(4);
        }
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f81.n0(boolean, boolean):void");
    }

    public final void o0() {
        if (this.E != null && this.f39270x != null) {
            float height = this.f39271y.getHeight() / 2.0f;
            View view = this.f39271y;
            float f7 = 1.0f;
            while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
                height += view.getY();
                f7 *= view.getAlpha();
                view = (View) view.getParent();
            }
            if (view == this.fragmentView && this.f39271y.isAttachedToWindow() && this.f39271y.getHeight() != 0) {
                float f10 = 0.0f;
                for (View view2 = this.f39269w; view2 != null && view2 != this.f39260c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f10 += view2.getY();
                }
                float paddingTop = (height - f10) + this.f39260c.getPaddingTop();
                x71 x71Var = this.E;
                float f11 = -AndroidUtilities.dp(16.0f);
                NotchInfoUtils.NotchInfo notchInfo = x71Var.f32604n;
                if (notchInfo != null && notchInfo.isLikelyCircle) {
                    f11 = notchInfo.bounds.centerY();
                }
                float a2 = a8.ee.a((height - f11) / Math.max(1.0f, paddingTop - f11), 0.0f, 1.0f);
                float max = Math.max(height, f11);
                this.Y = height;
                this.Z = paddingTop;
                this.f39257a0 = f11;
                float dp = AndroidUtilities.dp(90.0f);
                float scaleX = this.f39271y.getScaleX() * (AndroidUtilities.lerp(AndroidUtilities.dp(this.E.getHiddenAvatarSizeDp()), dp, a2) / dp);
                float f12 = (dp * scaleX) / 2.0f;
                float width = (this.E.getWidth() / 2.0f) - f12;
                if (max != this.V || scaleX != this.W || a2 != this.X || f7 != this.E.getAlpha() || width != this.f39270x.getTranslationX()) {
                    this.V = max;
                    this.W = scaleX;
                    this.X = a2;
                    this.E.setAlpha(f7);
                    this.f39270x.setScaleX(scaleX);
                    this.f39270x.setScaleY(scaleX);
                    this.f39270x.setTranslationX(width);
                    float f13 = max - f12;
                    this.f39270x.setTranslationY(f13);
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
        this.f39262d0 = i10;
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
        org.telegram.ui.Components.k71 k71Var = this.f39260c.f32504g3;
        if (k71Var != null) {
            k71Var.l();
        }
    }

    public final void p0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23749y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor}));
        }
        this.f39260c.invalidate();
    }

    @Override
    public final void s() {
        this.f39260c.y0(0);
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

    public f81(Bundle bundle) {
        super(bundle);
        this.f39256a = new oe.b(0, this, org.telegram.ui.Components.ds.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.f39259b0 = new ArrayList();
        this.f39263e0 = -1;
        this.f39265f0 = true;
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
