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
import android.graphics.RectF;
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
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
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
public final class b81 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.b50, pg0, ne.d {
    public org.telegram.ui.Components.f9 E;
    public org.telegram.ui.Components.u9 F;
    public FrameLayout G;
    public FrameLayout H;
    public ImageView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public boolean M;
    public View N;
    public int O;
    public int P;
    public boolean Q;
    public ValueAnimator R;
    public final ArrayList S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public final bh.f X;
    public final gh.d Y;
    public final gh.d Z;
    public final ne.b f35952a;
    public bh.l f35953a0;
    public y8 f35954b;
    public final ArrayList f35955b0;
    public t71 f35956c;
    public final RectF f35957c0;
    public ei.g6 d;
    public final RectF f35958d0;
    public org.telegram.ui.ActionBar.u0 e;
    public org.telegram.ui.ActionBar.u0 f35959f;
    public s71 h;
    public org.telegram.ui.Components.c50 f35960n;
    public AnimatorSet f35961r;
    public org.telegram.ui.Cells.y3 f35962s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation f35963w;
    public FrameLayout f35964x;
    public FrameLayout f35965y;

    public b81() {
        this(null);
    }

    public static boolean U(b81 b81Var, org.telegram.ui.Components.l61 l61Var, View view) {
        String str;
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            gi.d3.j(b81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new m71(b81Var, 1));
            return true;
        }
        if (l61Var.G(org.telegram.ui.Cells.w6.class)) {
            Object obj2 = l61Var.G;
            if (obj2 instanceof o01) {
                str = ((o01) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(b81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new n71(0, b81Var, str), false);
                H.W(b81Var.f35956c.W0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void V(b81 b81Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(b81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(b81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(b81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.c50 c50Var = b81Var.f35960n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        c50Var.n(z10, new m71(b81Var, 0), new ei.e1(6), 0);
    }

    public static void W(b81 b81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(LaunchActivity.I1, b81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(b81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void X(b81 b81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(b81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(b81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new p71(0, b81Var, tL_attachMenuBot), 66);
    }

    public static void Z(org.telegram.ui.b81 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b81.Z(org.telegram.ui.b81):void");
    }

    public static void a0(b81 b81Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b81Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        b81Var.d.setAlpha(floatValue);
    }

    public static void b0(b81 b81Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        String str;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.p0 p0Var = b81Var.e.F;
        int i12 = 0;
        if (p0Var != null && p0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.l61.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            s71 s71Var = b81Var.h;
            ArrayList arrayList2 = s71Var.d;
            ArrayList arrayList3 = s71Var.v;
            if (s71Var.f40307w) {
                ArrayList arrayList4 = s71Var.f40305r;
                int size = arrayList4.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int i15 = org.telegram.ui.Cells.w6.f23913a;
                    org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(org.telegram.ui.Cells.w6.class);
                    J.f28227l = (CharSequence) s71Var.f40304n.get(i13);
                    J.G = (o01) obj;
                    arrayList.add(J);
                    i13++;
                }
                if (!s71Var.f40306s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList5 = s71Var.f40306s;
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        int i16 = org.telegram.ui.Cells.w6.f23913a;
                        org.telegram.ui.Components.l61 J2 = org.telegram.ui.Components.l61.J(org.telegram.ui.Cells.w6.class);
                        J2.f28227l = (CharSequence) s71Var.f40304n.get(i13);
                        J2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(J2);
                        i13++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof o01) {
                        o01 o01Var = (o01) obj3;
                        String str3 = o01Var.f40050a;
                        int i18 = org.telegram.ui.Cells.w6.f23913a;
                        org.telegram.ui.Components.l61 J3 = org.telegram.ui.Components.l61.J(org.telegram.ui.Cells.w6.class);
                        J3.f28227l = str3;
                        J3.G = o01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str4 = faqSearchResult.title;
                        int i19 = org.telegram.ui.Cells.w6.f23913a;
                        org.telegram.ui.Components.l61 J4 = org.telegram.ui.Components.l61.J(org.telegram.ui.Cells.w6.class);
                        J4.f28227l = str4;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList2.size();
                while (i12 < size4) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str5 = faqSearchResult2.title;
                    int i20 = org.telegram.ui.Cells.w6.f23913a;
                    org.telegram.ui.Components.l61 J5 = org.telegram.ui.Components.l61.J(org.telegram.ui.Cells.w6.class);
                    J5.f28227l = str5;
                    J5.G = faqSearchResult2;
                    arrayList.add(J5);
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout = b81Var.f35964x;
        org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(-4);
        l61Var.f28221c = frameLayout;
        l61Var.f28240z = 188;
        arrayList.add(l61Var);
        b81Var.S.clear();
        for (int i21 = 0; i21 < 4; i21++) {
            if (UserConfig.getInstance(i21).isClientActivated() && b81Var.currentAccount != i21) {
                b81Var.S.add(Integer.valueOf(i21));
            }
        }
        Collections.sort(b81Var.S, new o70(7));
        Set<String> set = b81Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(z71.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new o71(b81Var, 0)));
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && b81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(z71.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.tl.h(new StringBuilder("+"), b81Var.getUserConfig().getCurrentUser().phone, jf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new m71(b81Var, 2)), LocaleController.getString(R.string.CheckPhoneNumberNo), new o71(b81Var, 1), ai.l7.H2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new o71(b81Var, 2)));
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(z71.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new o71(b81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new o71(b81Var, 4)));
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        }
        if (b81Var.S.size() > 0) {
            i2.o1.q(R.string.SettingsAccounts, arrayList);
            for (int i22 = 0; i22 < b81Var.S.size(); i22++) {
                int intValue = ((Integer) b81Var.S.get(i22)).intValue();
                int i23 = v71.f42600a;
                org.telegram.ui.Components.l61 J6 = org.telegram.ui.Components.l61.J(v71.class);
                J6.d = i22;
                J6.f28240z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        }
        if (b81Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && b81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(b81Var.currentAccount);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                i11 = R.drawable.settings_wallet_dark;
            } else {
                i11 = R.drawable.settings_wallet;
            }
            int i24 = i11;
            CharSequence string = LocaleController.getString(R.string.WalletAttachMoney);
            int i25 = org.telegram.ui.Cells.r8.V;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string = org.telegram.ui.Cells.r8.b(string);
            }
            CharSequence charSequence = string;
            if (w9.u() > 0) {
                str2 = org.telegram.ui.Wallet.l0.n(w9.u(), false);
            } else {
                str2 = null;
            }
            arrayList.add(x71.a(25, 0, 0, i24, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        }
        arrayList.add(x71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(x71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(x71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(x71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(x71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(x71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(x71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(x71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(x71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.l61.B(null));
        if (!z10 && b81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(b81Var.currentAccount);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                i10 = R.drawable.settings_wallet_dark;
            } else {
                i10 = R.drawable.settings_wallet;
            }
            int i26 = i10;
            CharSequence string2 = LocaleController.getString(R.string.WalletAttachMoney);
            int i27 = org.telegram.ui.Cells.r8.V;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string2 = org.telegram.ui.Cells.r8.b(string2);
            }
            CharSequence charSequence2 = string2;
            if (w10.u() > 0) {
                str = org.telegram.ui.Wallet.l0.n(w10.u(), false);
            } else {
                str = null;
            }
            arrayList.add(x71.a(25, 0, 0, i26, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        }
        if (!b81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(x71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (b81Var.getMessagesController().starsPurchaseAvailable()) {
            ai.ha y3 = ai.ha.y(b81Var.currentAccount, false);
            long j10 = y3.p().amount;
            int i28 = R.drawable.settings_stars;
            String string3 = LocaleController.getString(R.string.TelegramStars);
            if (!y3.e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = ai.nd.K0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(x71.a(12, -1071598, -1608430, i28, string3, null, spannableStringBuilder));
        }
        ai.ha.y(b81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (ai.ha.y(b81Var.currentAccount, true).e && (ai.ha.y(b81Var.currentAccount, true).O(0) || ai.ha.y(b81Var.currentAccount, true).p().positive()))) {
            ai.ha y10 = ai.ha.y(b81Var.currentAccount, true);
            long j11 = y10.p().amount;
            int i29 = R.drawable.filled_gram_earnings;
            String string4 = LocaleController.getString(R.string.GramEarnings);
            if (y10.e && j11 > 0) {
                charSequence3 = ai.nd.K0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(x71.a(13, -14965523, -15431455, i29, string4, null, charSequence3));
        }
        if (!b81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(x71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!b81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(x71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.l61) i2.o1.i(1, arrayList)).f44712a != 7) {
            arrayList.add(org.telegram.ui.Components.l61.B(null));
        }
        i2.o1.q(R.string.SettingsHelp, arrayList);
        arrayList.add(x71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(x71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(x71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(x71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        ti.a aVar = ti.e.f47657a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.l61.B(null));
            arrayList.add(org.telegram.ui.Components.l61.t("Experimental"));
            arrayList.add(x71.a(24, -765355, -2148011, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
            arrayList.add(x71.a(26, -11154873, -14175180, 0, LocaleController.getString(R.string.AudioRecorderSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.l61.B(null));
            i2.o1.q(R.string.SettingsDebug, arrayList);
            arrayList.add(x71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(x71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(x71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l61.l(b81Var.L));
    }

    public static void c0(b81 b81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        b81Var.V = -1;
        if (tL_error == null) {
            TLRPC.User user = b81Var.getMessagesController().getUser(Long.valueOf(b81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = b81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                b81Var.getMessagesController().putUser(user, false);
            } else {
                b81Var.getUserConfig().setCurrentUser(user);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20368id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && b81Var.v != null) {
                FileLoader.getInstance(b81Var.currentAccount).getPathToAttach(b81Var.v, true).renameTo(FileLoader.getInstance(b81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b81Var.v.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(b81Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(b81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(b81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && b81Var.f35963w != null) {
                FileLoader.getInstance(b81Var.currentAccount).getPathToAttach(b81Var.f35963w, true).renameTo(FileLoader.getInstance(b81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            b81Var.getMessagesController().getDialogPhotos(user.f20491id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            b81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = b81Var.getMessagesController().getUserFull(b81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                b81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            b81Var.o0(user);
        }
        b81Var.v = null;
        b81Var.f35963w = null;
        b81Var.p0(false, true);
        b81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        b81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        b81Var.getUserConfig().saveConfig(true);
    }

    public static void d0(b81 b81Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l4;
        long j10;
        int i12;
        int i13 = 0;
        if (i10 == 0) {
            b81Var.getUserConfig().syncContacts = true;
            b81Var.getUserConfig().saveConfig(false);
            b81Var.getContactsController().forceImportContacts();
        } else if (i10 == 1) {
            b81Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            b81Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            b81Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            b81Var.f35956c.Z2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                i2.o1.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            b81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(org.telegram.messenger.v0.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
            w7.y5.a();
            SharedPrefsHelper.cleanupAccount(b81Var.currentAccount);
            MessagesController.getEmojiSettings(b81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(b81Var.currentAccount).clearCache();
            b81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            u21.W();
            qg.u0.e(b81Var.currentAccount).a();
            SharedPreferences mainSettings = b81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.v0.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str7 : mainSettings.getAll().keySet()) {
                if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                    edit.remove(str7);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(b81Var.currentAccount).edit();
            for (String str8 : MessagesController.getNotificationsSettings(b81Var.currentAccount).getAll().keySet()) {
                if (str8.startsWith("dialog_bar_botver")) {
                    edit2.remove(str8);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.d2.i(b81Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) b81Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            b81Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = b81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            b81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = b81Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = b81Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    w7.d0.a((LaunchActivity) b81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    b81Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    b81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new q71(b81Var, 0));
                } else if (i10 == 20) {
                    int i14 = ConnectionsManager.CPU_COUNT;
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
                    while (i13 < i14) {
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i13);
                        sb2.append(" ");
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j12++;
                            j11 = (sysInfoLong.longValue() / 1000) + j11;
                        }
                        if (sysInfoLong2 != null) {
                            sb2.append("cur=");
                            j10 = j11;
                            sb2.append(sysInfoLong2.longValue() / 1000);
                            sb2.append(" ");
                            j13 = (sysInfoLong2.longValue() / 1000) + j13;
                            j14++;
                        } else {
                            j10 = j11;
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
                        i13++;
                        j11 = j10;
                    }
                    long j19 = j11;
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
                    if (j12 > 0) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j19 / j12);
                    }
                    if (j14 > 0) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j13 / j14);
                    }
                    if (j16 > 0) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j15 / j16);
                    }
                    if (j18 > 0) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j17 / j18);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    m0("video/avc", sb3);
                    m0("video/hevc", sb3);
                    m0("video/x-vnd.on2.vp8", sb3);
                    m0("video/x-vnd.on2.vp9", sb3);
                    b81Var.showDialog(new u71(b81Var, b81Var.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b81Var.getParentActivity(), 0, b81Var.resourceProvider);
                    alertDialog$Builder.f20679a.R = "Force performance class";
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
                    if (measureDevicePerformanceClass != 0) {
                        str6 = "";
                    } else {
                        str6 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str6))}, new py0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.p();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q6 = ei.c1.q(b81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Activity parentActivity3 = b81Var.getParentActivity();
                    if (!q6) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i13 < b81Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.o2) b81Var.getParentLayout().getFragmentStack().get(i13)).clearSheets();
                        i13++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    b81Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(b81Var.currentAccount);
                } else if (i10 == 29) {
                    gi.r.b();
                    gi.u0.c();
                    gi.j0.a();
                    gi.r4.c();
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
                    MessagesController.getInstance(b81Var.currentAccount).loadAppConfig(true);
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
                } else if (i10 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z10;
                    edit3.putBoolean("shadowsInSections", z10).apply();
                } else if (i10 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z11 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z11;
                    edit4.putBoolean("debugViewMetrics", z11).apply();
                } else if (i10 == 42) {
                    ti.a aVar = ti.e.f47657a;
                    synchronized (aVar) {
                        if (!aVar.f47649b) {
                            SharedPreferences sharedPreferences = ti.d.f47656a;
                            aVar.f47650c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.f47649b = true;
                        }
                        boolean z12 = !aVar.d;
                        aVar.d = z12;
                        aVar.f47650c = true;
                        aVar.f47649b = true;
                        ti.d.f47656a.edit().putBoolean("experimental_settings_allowed", z12).apply();
                    }
                    b81Var.f35956c.Z2.N(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e0(b81 b81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            b81Var.v = fileLocation;
            b81Var.f35963w = photoSize2.location;
            b81Var.F.h(ImageLocation.getForLocal(fileLocation), "90_90", b81Var.E, null);
            b81Var.p0(true, false);
        } else if (b81Var.v == null) {
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
            b81Var.V = b81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new a50(29, b81Var, str));
        }
        b81Var.actionBar.m().requestLayout();
    }

    public static void f0(b81 b81Var, org.telegram.ui.Components.l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.H0(LaunchActivity.I1, b81Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                gi1.a(b81Var.getParentActivity(), new org.telegram.ui.Components.oy(23, b81Var, tL_attachMenuBot), null);
            }
        } else if (l61Var.G(v71.class)) {
            int i10 = l61Var.f28240z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i10);
            }
        } else if (l61Var.G(org.telegram.ui.Cells.w6.class)) {
            Object obj2 = l61Var.G;
            if (obj2 instanceof o01) {
                o01 o01Var = (o01) obj2;
                org.telegram.ui.ActionBar.h5 parentLayout = b81Var.getParentLayout();
                o01Var.f40051b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, o01Var.f40052c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(b81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, b81Var.h.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = l61Var.G;
            if (obj3 != null) {
                b81Var.h.E(obj3);
            }
        } else {
            switch (l61Var.d) {
                case 1:
                    b81Var.n0(new UserInfoActivity());
                    return;
                case 2:
                    b81Var.n0(new ThemeActivity(0));
                    return;
                case 3:
                    b81Var.n0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    b81Var.n0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    b81Var.n0(new DataSettingsActivity());
                    return;
                case 7:
                    b81Var.n0(new FiltersSetupActivity());
                    return;
                case 8:
                    b81Var.n0(new SessionsActivity(0));
                    return;
                case 9:
                    b81Var.n0(new wb0());
                    return;
                case 10:
                    b81Var.n0(new LanguageSelectActivity());
                    return;
                case 11:
                    b81Var.n0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    b81Var.n0(new ai.nd());
                    return;
                case 13:
                    b81Var.n0(new fi.g());
                    return;
                case 15:
                    b81Var.n0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    ug.l1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    b81Var.showDialog(org.telegram.ui.Components.d5.T(b81Var, b81Var.resourceProvider));
                    return;
                case 18:
                    pf.d.r(b81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    pf.d.r(b81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.J4(b81Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.J4(b81Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(b81Var.currentAccount).isFrozen()) {
                        b.b(b81Var.currentAccount);
                        return;
                    } else {
                        pf.d.r(b81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
                case 24:
                    b81Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    return;
                case 25:
                    b81Var.n0(new org.telegram.ui.Wallet.o5());
                    return;
                case 26:
                    b81Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    return;
            }
        }
    }

    public static void m0(String str, StringBuilder sb2) {
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
    public final void E(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.f35962s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.f35962s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        this.f35954b = new y8(this, context, 7);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.W = true;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.K();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setAdditionalTextLeft(-AndroidUtilities.dp(4.0f));
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 4));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        org.telegram.ui.ActionBar.u0 c10 = m10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.H = new ig.b2(this, 17);
        this.e = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.u0 a2 = m10.a(1, R.drawable.ic_ab_other);
        this.f35959f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f35959f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        s71 s71Var = new s71(this, this, context);
        this.h = s71Var;
        s71Var.G();
        t71 t71Var = new t71(this, this, new f5(this, 26), new r71(this), new r71(this));
        this.f35956c = t71Var;
        t71Var.Z2.f24646r = false;
        t71Var.t1();
        if (AndroidUtilities.isTablet()) {
            t71 t71Var2 = this.f35956c;
            if (!t71Var2.N2 || t71Var2.O2) {
                t71Var2.N2 = true;
                t71Var2.O2 = false;
                t71Var2.invalidate();
            }
        }
        this.f35956c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.U);
        this.f35956c.setClipToPadding(false);
        this.f35956c.j(new j3(this, 28));
        t71 t71Var3 = this.f35956c;
        y8 y8Var = this.f35954b;
        Objects.requireNonNull(t71Var3);
        this.f35953a0 = new bh.l(t71Var3, y8Var, new x8(t71Var3, 1));
        this.f35956c.C0(new m71(this, 3));
        this.f35954b.addView(this.f35956c, w7.z5.e(-1, -1, 119));
        ei.g6 g6Var = new ei.g6(this, context);
        this.d = g6Var;
        this.f35954b.addView(g6Var, w7.z5.e(-1, 200, 48));
        this.f35954b.addView(this.actionBar, w7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(0, true, true);
        this.f35960n = c50Var;
        c50Var.H = true;
        c50Var.f25185a = this;
        c50Var.f25186b = this;
        this.f35964x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35965y = frameLayout;
        this.f35964x.addView(frameLayout, w7.z5.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f35965y.setOnClickListener(new o71(this, 5));
        w7.b6.a(this.f35965y);
        this.E = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.F = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f35965y.addView(this.F, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.f35962s = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f35962s.setProgressColor(-1);
        this.f35962s.setNoProgress(false);
        this.f35965y.addView(this.f35962s, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        p0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        int dp = AndroidUtilities.dp(32.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, resourceProvider);
        this.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.H = frameLayout3;
        int dp2 = AndroidUtilities.dp(30.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K2 = org.telegram.ui.ActionBar.k6.K(dp2, getThemedColor(i11));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.g6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, K2, O2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.I.setImageResource(R.drawable.filled_premium_camera);
        this.H.addView(this.I, w7.z5.e(22, 22, 17));
        this.G.addView(this.H, w7.z5.c(30.0f, 30));
        this.f35965y.addView(this.G, w7.z5.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        w7.b6.a(this.G);
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setTextSize(1, 22.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setGravity(17);
        this.J.setSingleLine();
        TextView textView2 = this.J;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView j10 = org.telegram.ui.Cells.b1.j(this.f35964x, this.J, w7.z5.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.K = j10;
        j10.setTextSize(1, 13.0f);
        this.K.setGravity(17);
        this.K.setSingleLine();
        this.K.setEllipsize(truncateAt);
        TextView j11 = org.telegram.ui.Cells.b1.j(this.f35964x, this.K, w7.z5.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.L = j11;
        j11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(this.L, org.telegram.ui.ActionBar.k6.B6, getResourceProvider());
        this.L.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.L.setGravity(17);
        TextView textView3 = this.L;
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.r6.S(textView3, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i12), 2, -1), null, org.telegram.ui.ActionBar.r6.O(i12), getResourceProvider());
        this.L.setOnClickListener(new o71(this, 6));
        this.N = new View(context);
        q0(true, false);
        this.f35956c.Z2.N(false);
        o0(getUserConfig().getCurrentUser());
        r0();
        l0();
        y8 y8Var2 = this.f35954b;
        r71 r71Var = new r71(this);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(y8Var2, r71Var);
        y8 y8Var3 = this.f35954b;
        this.fragmentView = y8Var3;
        return y8Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t71 t71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            o0(getUserConfig().getCurrentUser());
            t71 t71Var2 = this.f35956c;
            if (t71Var2 != null) {
                t71Var2.Z2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            o0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (t71Var = this.f35956c) != null) {
            t71Var.Z2.N(true);
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
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f35952a.f17447f;
    }

    public final void k0() {
        bh.f fVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.X) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.T) - AndroidUtilities.dp(8.0f);
            this.f35957c0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f35958d0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.M) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f35955b0);
            fVar.e(this.f35953a0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void l0() {
        boolean z10;
        int i10;
        int i11;
        float f7 = this.f35952a.e;
        org.telegram.ui.Components.f20.d(this.f35959f, 1.0f - f7);
        if (!this.M) {
            org.telegram.ui.Components.f20.d(this.actionBar.getBackButton(), 1.0f);
            return;
        }
        ImageView backButton = this.actionBar.getBackButton();
        if (backButton == null) {
            return;
        }
        if (f7 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.W) {
            this.W = z10;
            if (z10) {
                i10 = R.drawable.ic_ab_back;
            } else {
                i10 = R.drawable.outline_header_qr_24;
            }
            backButton.setImageResource(i10);
            if (z10) {
                i11 = R.string.AccDescrGoBack;
            } else {
                i11 = R.string.QrCode;
            }
            backButton.setContentDescription(LocaleController.getString(i11));
        }
        float abs = Math.abs((f7 * 2.0f) - 1.0f);
        backButton.setVisibility(0);
        backButton.setAlpha(abs);
        backButton.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, abs));
        backButton.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, abs));
    }

    public final void n0(org.telegram.ui.ActionBar.o2 o2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.I1) != null && (actionBarLayout = launchActivity.f33493s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.b0((org.telegram.ui.ActionBar.o2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(o2Var);
            e5Var.f20872c = true;
            e5Var.f20874g = true;
            actionBarLayout.S(e5Var);
            return;
        }
        presentFragment(o2Var);
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            l0();
        }
    }

    public final void o0(TLRPC.User user) {
        String str;
        String str2;
        if (this.F == null || this.V != -1) {
            return;
        }
        this.E.r(user);
        this.F.e(user, this.E);
        this.J.setText(UserObject.getUserName(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(jf.b.c().b("+" + user.phone));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null) {
            sb2.append(" • @");
            sb2.append(publicUsername);
        }
        this.K.setText(sb2);
        TextView textView = this.L;
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.f21069n0) {
            if (z10) {
                kVar.g(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.M = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.M) {
            i10 = AndroidUtilities.dp(72.0f);
        }
        this.U = i10;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.a71 a71Var = this.f35956c.Z2;
        if (a71Var != null) {
            a71Var.l();
        }
    }

    public final void p0(boolean z10, boolean z11) {
        if (this.f35962s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f35961r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35961r = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35961r = animatorSet2;
            if (z10) {
                this.f35962s.setVisibility(0);
                this.f35961r.playTogether(ObjectAnimator.ofFloat(this.f35962s, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f35962s, View.ALPHA, 0.0f));
            }
            this.f35961r.setDuration(180L);
            this.f35961r.addListener(new o40(10, this, z10));
            this.f35961r.start();
        } else if (z10) {
            this.f35962s.setAlpha(1.0f);
            this.f35962s.setVisibility(0);
        } else {
            this.f35962s.setAlpha(0.0f);
            this.f35962s.setVisibility(4);
        }
    }

    public final void q0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b81.q0(boolean, boolean):void");
    }

    public final void r0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.B(getThemedColor(i10), false);
        this.f35954b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7));
        this.J.setTextColor(getThemedColor(i10));
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21572y6));
        this.e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6);
        if (this.N.getBackground() == null || themedColor != this.P) {
            this.P = themedColor;
            this.N.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor}));
        }
        this.d.invalidate();
        this.f35956c.invalidate();
    }

    @Override
    public final void t() {
        this.f35956c.x0(0);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final gh.d z() {
        return this.Z;
    }

    public b81(Bundle bundle) {
        super(bundle);
        this.f35952a = new ne.b(0, this, org.telegram.ui.Components.zr.h, 350L, false);
        this.O = 0;
        this.S = new ArrayList();
        this.V = -1;
        this.W = true;
        ArrayList arrayList = new ArrayList();
        this.f35955b0 = arrayList;
        RectF rectF = new RectF();
        this.f35957c0 = rectF;
        RectF rectF2 = new RectF();
        this.f35958d0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.X = new bh.f(false);
            this.Y = new gh.d(null);
            this.Z = new gh.d(null);
            return;
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
