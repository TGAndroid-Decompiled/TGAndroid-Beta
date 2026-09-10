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
public final class k91 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50, eh0, le.d {
    public org.telegram.ui.Components.g9 E;
    public org.telegram.ui.Components.w9 F;
    public FrameLayout G;
    public FrameLayout H;
    public ImageView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public boolean M;
    public View N;
    public int O;
    public boolean P;
    public ValueAnimator Q;
    public final ArrayList R;
    public int S;
    public int T;
    public int U;
    public final zg.e V;
    public final eh.d W;
    public final eh.d X;
    public zg.k Y;
    public final ArrayList Z;
    public final le.b f34294a;
    public final RectF f34295a0;
    public w8 f34296b;
    public final RectF f34297b0;
    public org.telegram.ui.Components.r61 f34298c;
    public bi.s7 d;
    public org.telegram.ui.ActionBar.w0 e;
    public org.telegram.ui.ActionBar.w0 f34299f;
    public c91 h;
    public org.telegram.ui.Components.e50 f34300n;
    public AnimatorSet f34301r;
    public org.telegram.ui.Cells.y3 f34302s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation f34303w;
    public FrameLayout f34304x;
    public FrameLayout f34305y;

    public k91() {
        this(null);
    }

    public static boolean U(k91 k91Var, org.telegram.ui.Components.v51 v51Var, View view) {
        String str;
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            di.n3.j(k91Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new x81(k91Var, 0));
            return true;
        }
        if (v51Var.G(org.telegram.ui.Cells.x6.class)) {
            Object obj2 = v51Var.G;
            if (obj2 instanceof o11) {
                str = ((o11) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(k91Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new ey0(27, k91Var, str), false);
                H.W(k91Var.f34298c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void V(k91 k91Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(k91Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(k91Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new rg0(18, k91Var, tL_attachMenuBot), 66);
    }

    public static void W(k91 k91Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(k91Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(k91Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(k91Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.e50 e50Var = k91Var.f34300n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e50Var.o(z10, new x81(k91Var, 4), new bi.k1(6), 0);
    }

    public static void X(k91 k91Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.G1, k91Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(k91Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void Z(org.telegram.ui.k91 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.Z(org.telegram.ui.k91):void");
    }

    public static void a0(k91 k91Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k91Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        k91Var.d.setAlpha(floatValue);
    }

    public static void b0(k91 k91Var, ArrayList arrayList) {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        SpannableStringBuilder spannableStringBuilder;
        ArrayList arrayList3 = k91Var.R;
        org.telegram.ui.ActionBar.r0 r0Var = k91Var.e.F;
        int i10 = 0;
        if (r0Var != null && r0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.v51.C(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
            c91 c91Var = k91Var.h;
            ArrayList arrayList4 = c91Var.d;
            ArrayList arrayList5 = c91Var.v;
            if (c91Var.f35667w) {
                ArrayList arrayList6 = c91Var.f35665r;
                int size = arrayList6.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList6.get(i12);
                    i12++;
                    int i13 = org.telegram.ui.Cells.x6.f20711a;
                    org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(org.telegram.ui.Cells.x6.class);
                    J.f27829l = (CharSequence) c91Var.f35664n.get(i11);
                    J.G = (o11) obj;
                    arrayList.add(J);
                    i11++;
                }
                if (!c91Var.f35666s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.v51.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList7 = c91Var.f35666s;
                    int size2 = arrayList7.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList7.get(i10);
                        i10++;
                        int i14 = org.telegram.ui.Cells.x6.f20711a;
                        org.telegram.ui.Components.v51 J2 = org.telegram.ui.Components.v51.J(org.telegram.ui.Cells.x6.class);
                        J2.f27829l = (CharSequence) c91Var.f35664n.get(i11);
                        J2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(J2);
                        i11++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.v51.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList5.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList5.get(i15);
                    i15++;
                    if (obj3 instanceof o11) {
                        o11 o11Var = (o11) obj3;
                        String str = o11Var.f35381a;
                        int i16 = org.telegram.ui.Cells.x6.f20711a;
                        org.telegram.ui.Components.v51 J3 = org.telegram.ui.Components.v51.J(org.telegram.ui.Cells.x6.class);
                        J3.f27829l = str;
                        J3.G = o11Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i17 = org.telegram.ui.Cells.x6.f20711a;
                        org.telegram.ui.Components.v51 J4 = org.telegram.ui.Components.v51.J(org.telegram.ui.Cells.x6.class);
                        J4.f27829l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.v51.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList4.size();
                while (i10 < size4) {
                    Object obj4 = arrayList4.get(i10);
                    i10++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str3 = faqSearchResult2.title;
                    int i18 = org.telegram.ui.Cells.x6.f20711a;
                    org.telegram.ui.Components.v51 J5 = org.telegram.ui.Components.v51.J(org.telegram.ui.Cells.x6.class);
                    J5.f27829l = str3;
                    J5.G = faqSearchResult2;
                    arrayList.add(J5);
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout = k91Var.f34304x;
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(-4);
        v51Var.f27823c = frameLayout;
        v51Var.f27842z = 188;
        arrayList.add(v51Var);
        arrayList3.clear();
        for (int i19 = 0; i19 < 4; i19++) {
            if (UserConfig.getInstance(i19).isClientActivated() && k91Var.currentAccount != i19) {
                arrayList3.add(Integer.valueOf(i19));
            }
        }
        Collections.sort(arrayList3, new org.telegram.ui.Components.m9(22));
        Set<String> set = k91Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(i91.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new y81(k91Var, 0)));
            arrayList.add(org.telegram.ui.Components.v51.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && k91Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(i91.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.a2.j(new StringBuilder("+"), k91Var.getUserConfig().getCurrentUser().phone, gf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new x81(k91Var, 1)), LocaleController.getString(R.string.CheckPhoneNumberNo), new y81(k91Var, 1), xh.x3.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new y81(k91Var, 2)));
            arrayList.add(org.telegram.ui.Components.v51.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(i91.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new y81(k91Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new y81(k91Var, 4)));
            arrayList.add(org.telegram.ui.Components.v51.B(null));
        }
        if (arrayList3.size() > 0) {
            com.google.android.gms.internal.vision.e2.m(R.string.SettingsAccounts, arrayList);
            for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                int intValue = ((Integer) arrayList3.get(i20)).intValue();
                int i21 = e91.f32129a;
                org.telegram.ui.Components.v51 J6 = org.telegram.ui.Components.v51.J(e91.class);
                J6.d = i20;
                J6.f27842z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.v51.B(null));
        }
        arrayList.add(g91.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(g91.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(g91.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(g91.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(g91.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(g91.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(g91.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(g91.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(g91.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.v51.B(null));
        if (!k91Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(g91.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence = "";
        if (k91Var.getMessagesController().starsPurchaseAvailable()) {
            xh.v5 y3 = xh.v5.y(k91Var.currentAccount, false);
            long j3 = y3.p().amount;
            int i22 = R.drawable.settings_stars;
            String string = LocaleController.getString(R.string.TelegramStars);
            if (!y3.e || j3 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = xh.z7.J0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(g91.a(12, -1071598, -1608430, i22, string, null, spannableStringBuilder));
        }
        xh.v5.y(k91Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (xh.v5.y(k91Var.currentAccount, true).e && (xh.v5.y(k91Var.currentAccount, true).O(0) || xh.v5.y(k91Var.currentAccount, true).p().positive()))) {
            xh.v5 y10 = xh.v5.y(k91Var.currentAccount, true);
            long j10 = y10.p().amount;
            int i23 = R.drawable.settings_gram_24;
            String string2 = LocaleController.getString(R.string.MyTON);
            if (y10.e && j10 > 0) {
                charSequence = xh.z7.J0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(g91.a(13, -14965523, -15431455, i23, string2, null, charSequence));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            while (i10 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i24 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.v51 J7 = org.telegram.ui.Components.v51.J(g91.class);
                    long j11 = tL_attachMenuBot2.bot_id;
                    J7.d = (int) (j11 ^ (j11 >>> 32));
                    J7.f27828k = i24;
                    J7.f27829l = tL_attachMenuBot2.short_name;
                    J7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    J7.G = tL_attachMenuBot2;
                    arrayList.add(J7);
                }
            }
        }
        if (!k91Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(g91.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!k91Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(g91.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.v51) hc.b.i(1, arrayList)).f14046a != 7) {
            arrayList.add(org.telegram.ui.Components.v51.B(null));
        }
        com.google.android.gms.internal.vision.e2.m(R.string.SettingsHelp, arrayList);
        arrayList.add(g91.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(g91.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(g91.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(g91.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.v51.B(null));
            com.google.android.gms.internal.vision.e2.m(R.string.SettingsDebug, arrayList);
            arrayList.add(g91.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(g91.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(g91.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.v51.l(k91Var.L));
    }

    public static void c0(k91 k91Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        k91Var.U = -1;
        if (tL_error == null) {
            TLRPC.User user = k91Var.getMessagesController().getUser(Long.valueOf(k91Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = k91Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                k91Var.getMessagesController().putUser(user, false);
            } else {
                k91Var.getUserConfig().setCurrentUser(user);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f17219id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && k91Var.v != null) {
                FileLoader.getInstance(k91Var.currentAccount).getPathToAttach(k91Var.v, true).renameTo(FileLoader.getInstance(k91Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k91Var.v.volume_id);
                sb2.append("_");
                String n10 = a4.a.n(k91Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(k91Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(k91Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && k91Var.f34303w != null) {
                FileLoader.getInstance(k91Var.currentAccount).getPathToAttach(k91Var.f34303w, true).renameTo(FileLoader.getInstance(k91Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            k91Var.getMessagesController().getDialogPhotos(user.f17342id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            k91Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = k91Var.getMessagesController().getUserFull(k91Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                k91Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            k91Var.m0(user);
        }
        k91Var.v = null;
        k91Var.f34303w = null;
        k91Var.n0(false, true);
        k91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        k91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        k91Var.getUserConfig().saveConfig(true);
    }

    public static void d0(k91 k91Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j3;
        Long l4;
        int i12;
        int i13 = 0;
        if (i10 == 0) {
            k91Var.getUserConfig().syncContacts = true;
            k91Var.getUserConfig().saveConfig(false);
            k91Var.getContactsController().forceImportContacts();
            return;
        }
        long j10 = 0;
        if (i10 == 1) {
            k91Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            k91Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            k91Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            k91Var.f34298c.Y2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                hc.b.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            k91Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(org.telegram.messenger.a2.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            w7.z5.a();
            SharedPrefsHelper.cleanupAccount(k91Var.currentAccount);
            MessagesController.getEmojiSettings(k91Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(k91Var.currentAccount).clearCache();
            k91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            k41.W();
            og.x0.e(k91Var.currentAccount).a();
            SharedPreferences mainSettings = k91Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.a2.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : mainSettings.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit.remove(str6);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(k91Var.currentAccount).edit();
            for (String str7 : MessagesController.getNotificationsSettings(k91Var.currentAccount).getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit2.remove(str7);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.e2.i(k91Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) k91Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            k91Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = k91Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            k91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = k91Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = k91Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    w7.n.a((LaunchActivity) k91Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    k91Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    k91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new z81(k91Var, 0));
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
                        long j19 = j10;
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i13);
                        sb2.append(" ");
                        int i15 = i13;
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            l4 = sysInfoLong3;
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j11 += sysInfoLong.longValue() / 1000;
                            j12++;
                        } else {
                            l4 = sysInfoLong3;
                        }
                        if (sysInfoLong2 != null) {
                            sb2.append("cur=");
                            sb2.append(sysInfoLong2.longValue() / 1000);
                            sb2.append(" ");
                            j13 += sysInfoLong2.longValue() / 1000;
                            j14++;
                        }
                        if (l4 != null) {
                            sb2.append("max=");
                            sb2.append(l4.longValue() / 1000);
                            sb2.append(" ");
                            j15 = (l4.longValue() / 1000) + j15;
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
                        i13 = i15 + 1;
                        j10 = j19;
                    }
                    long j20 = j10;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Build.MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.MODEL);
                    sb3.append(" (");
                    sb3.append(Build.PRODUCT);
                    sb3.append(", ");
                    sb3.append(Build.DEVICE);
                    sb3.append(")  (android ");
                    int i16 = Build.VERSION.SDK_INT;
                    sb3.append(i16);
                    sb3.append(")\n");
                    if (i16 >= 31) {
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
                            j3 = j11;
                            sb3.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            j3 = j11;
                        }
                        if (sysInfoLong6 != null) {
                            sb3.append(", mmin=");
                            sb3.append(sysInfoLong6.longValue() / 1000);
                        }
                        if (sysInfoLong7 != null) {
                            sb3.append(", max=");
                            sb3.append(sysInfoLong7.longValue() / 1000);
                        }
                        sb3.append("\n");
                    } else {
                        j3 = j11;
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
                    if (i16 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i14);
                    sb3.append(" CPUs");
                    if (j12 > j20) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j3 / j12);
                    }
                    if (j14 > j20) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j13 / j14);
                    }
                    if (j16 > j20) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j15 / j16);
                    }
                    if (j18 > j20) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j17 / j18);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    k0("video/avc", sb3);
                    k0("video/hevc", sb3);
                    k0("video/x-vnd.on2.vp8", sb3);
                    k0("video/x-vnd.on2.vp9", sb3);
                    k91Var.showDialog(new d91(k91Var, k91Var.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k91Var.getParentActivity(), 0, k91Var.resourceProvider);
                    alertDialog$Builder.f17528a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    if (devicePerformanceClass == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
                    String str8 = "";
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
                        str8 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str8))}, new nz0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q6 = bi.i1.q(k91Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Activity parentActivity3 = k91Var.getParentActivity();
                    if (!q6) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i13 < k91Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.p2) k91Var.getParentLayout().getFragmentStack().get(i13)).clearSheets();
                        i13++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    k91Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(k91Var.currentAccount);
                } else if (i10 == 29) {
                    di.u.b();
                    di.z0.c();
                    di.o0.a();
                    di.h5.c();
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
                    MessagesController.getInstance(k91Var.currentAccount).loadAppConfig(true);
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                } else if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.C();
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
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e0(k91 k91Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            k91Var.v = fileLocation;
            k91Var.f34303w = photoSize2.location;
            k91Var.F.h(ImageLocation.getForLocal(fileLocation), "90_90", k91Var.E, null);
            k91Var.n0(true, false);
        } else if (k91Var.v == null) {
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
            k91Var.U = k91Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new rg0(17, k91Var, str));
        }
        k91Var.actionBar.n().requestLayout();
    }

    public static void f0(k91 k91Var, org.telegram.ui.Components.v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.C0(LaunchActivity.G1, k91Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                qj1.a(k91Var.getParentActivity(), new m4.q0(9, k91Var, tL_attachMenuBot), null);
            }
        } else if (v51Var.G(e91.class)) {
            int i10 = v51Var.f27842z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        } else if (v51Var.G(org.telegram.ui.Cells.x6.class)) {
            Object obj2 = v51Var.G;
            if (obj2 instanceof o11) {
                o11 o11Var = (o11) obj2;
                org.telegram.ui.ActionBar.f5 parentLayout = k91Var.getParentLayout();
                o11Var.f35382b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, o11Var.f35383c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(k91Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, k91Var.h.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = v51Var.G;
            if (obj3 != null) {
                k91Var.h.E(obj3);
            }
        } else {
            switch (v51Var.d) {
                case 1:
                    k91Var.l0(new UserInfoActivity());
                    return;
                case 2:
                    k91Var.l0(new ThemeActivity(0));
                    return;
                case 3:
                    k91Var.l0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    k91Var.l0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    k91Var.l0(new DataSettingsActivity());
                    return;
                case 7:
                    k91Var.l0(new FiltersSetupActivity());
                    return;
                case 8:
                    k91Var.l0(new SessionsActivity(0));
                    return;
                case 9:
                    k91Var.l0(new nc0());
                    return;
                case 10:
                    k91Var.l0(new LanguageSelectActivity());
                    return;
                case 11:
                    k91Var.l0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    k91Var.l0(new xh.z7());
                    return;
                case 13:
                    k91Var.l0(new ci.j());
                    return;
                case 15:
                    k91Var.l0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    sg.p1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    k91Var.showDialog(org.telegram.ui.Components.d5.U(k91Var, k91Var.resourceProvider));
                    return;
                case 18:
                    nf.f.s(k91Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    nf.f.s(k91Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.H4(k91Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.H4(k91Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(k91Var.currentAccount).isFrozen()) {
                        b.b(k91Var.currentAccount);
                        return;
                    } else {
                        nf.f.s(k91Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
            }
        }
    }

    public static void k0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        if (Build.VERSION.SDK_INT >= 23) {
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
    }

    @Override
    public final void C(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.f34302s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            j0();
        }
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.f34302s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ei.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        this.f34296b = new w8(this, context, 7);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.L();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 0));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.H = new gg.m2(this, 17);
        this.e = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f34299f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f34299f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        c91 c91Var = new c91(this, this, context);
        this.h = c91Var;
        c91Var.G();
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(this, new b5(this, 26), new a91(this), new a91(this));
        this.f34298c = r61Var;
        r61Var.Y2.f24250r = false;
        r61Var.o1();
        this.f34298c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.T);
        this.f34298c.setClipToPadding(false);
        this.f34298c.j(new j3(this, 28));
        org.telegram.ui.Components.r61 r61Var2 = this.f34298c;
        w8 w8Var = this.f34296b;
        Objects.requireNonNull(r61Var2);
        this.Y = new zg.k(r61Var2, w8Var, new v8(r61Var2, 0));
        this.f34298c.C0(new x81(this, 2));
        this.f34296b.addView(this.f34298c, w7.a6.e(-1, -1, 119));
        bi.s7 s7Var = new bi.s7(this, context);
        this.d = s7Var;
        this.f34296b.addView(s7Var, w7.a6.e(-1, 200, 48));
        this.f34296b.addView(this.actionBar, w7.a6.e(-1, -2, 55));
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        this.f34300n = e50Var;
        e50Var.H = true;
        e50Var.f22552a = this;
        e50Var.f22553b = this;
        this.f34304x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34305y = frameLayout;
        this.f34304x.addView(frameLayout, w7.a6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f34305y.setOnClickListener(new y81(this, 5));
        w7.c6.a(this.f34305y);
        this.E = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.F = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f34305y.addView(this.F, w7.a6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.f34302s = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f34302s.setProgressColor(-1);
        this.f34302s.setNoProgress(false);
        this.f34305y.addView(this.f34302s, w7.a6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7)));
        this.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.H = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.I.setImageResource(R.drawable.filled_premium_camera);
        this.H.addView(this.I, w7.a6.e(22, 22, 17));
        this.G.addView(this.H, w7.a6.c(30.0f, 30));
        this.f34305y.addView(this.G, w7.a6.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        w7.c6.a(this.G);
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setTextSize(1, 22.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setGravity(17);
        this.J.setSingleLine();
        TextView textView2 = this.J;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView f7 = org.telegram.ui.Cells.r6.f(this.f34304x, this.J, w7.a6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.K = f7;
        f7.setTextSize(1, 13.0f);
        this.K.setGravity(17);
        this.K.setSingleLine();
        this.K.setEllipsize(truncateAt);
        TextView f10 = org.telegram.ui.Cells.r6.f(this.f34304x, this.K, w7.a6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.L = f10;
        f10.setTextSize(1, 14.0f);
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.B6));
        this.L.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.L.setGravity(17);
        this.L.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), 2, -1));
        this.L.setOnClickListener(new y81(this, 6));
        this.N = new View(context);
        o0(true, false);
        this.f34298c.Y2.N(false);
        m0(getUserConfig().getCurrentUser());
        p0();
        j0();
        w8 w8Var2 = this.f34296b;
        a91 a91Var = new a91(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(w8Var2, a91Var);
        w8 w8Var3 = this.f34296b;
        this.fragmentView = w8Var3;
        return w8Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.r61 r61Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            m0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.r61 r61Var2 = this.f34298c;
            if (r61Var2 != null) {
                r61Var2.Y2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            m0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (r61Var = this.f34298c) != null) {
            r61Var.Y2.N(true);
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
    public final ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    public final void i0() {
        zg.e eVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.V) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.S) - AndroidUtilities.dp(8.0f);
            this.f34295a0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f34297b0;
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
            eVar.g(i10, this.Z);
            eVar.e(this.Y, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f34294a.f12870f;
    }

    public final void j0() {
        float f7;
        org.telegram.ui.ActionBar.w0 w0Var = this.f34299f;
        le.b bVar = this.f34294a;
        org.telegram.ui.Components.h20.d(w0Var, 1.0f - bVar.e);
        ImageView backButton = this.actionBar.getBackButton();
        if (this.M) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.h20.d(backButton, AndroidUtilities.lerp(f7, 1.0f, bVar.e));
    }

    public final void l0(org.telegram.ui.ActionBar.p2 p2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.G1) != null && (actionBarLayout = launchActivity.f29961s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.a0((org.telegram.ui.ActionBar.p2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(p2Var);
            d5Var.f17653c = true;
            d5Var.f17655g = true;
            actionBarLayout.R(d5Var);
            return;
        }
        presentFragment(p2Var);
    }

    public final void m0(TLRPC.User user) {
        String str;
        String str2;
        if (this.F == null || this.U != -1) {
            return;
        }
        this.E.r(user);
        this.F.e(user, this.E);
        this.J.setText(UserObject.getUserName(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(gf.b.c().b("+" + user.phone));
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

    public final void n0(boolean z10, boolean z11) {
        if (this.f34302s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f34301r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34301r = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34301r = animatorSet2;
            if (z10) {
                this.f34302s.setVisibility(0);
                this.f34301r.playTogether(ObjectAnimator.ofFloat(this.f34302s, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f34302s, View.ALPHA, 0.0f));
            }
            this.f34301r.setDuration(180L);
            this.f34301r.addListener(new iw0(5, this, z10));
            this.f34301r.start();
        } else if (z10) {
            this.f34302s.setAlpha(1.0f);
            this.f34302s.setVisibility(0);
        } else {
            this.f34302s.setAlpha(0.0f);
            this.f34302s.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar.f18389n0) {
            if (z10) {
                lVar.h(true);
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
        this.T = i10;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    public final void p0() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.setTitleColor(getThemedColor(i10));
        this.actionBar.C(getThemedColor(i10), false);
        this.f34296b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        this.J.setTextColor(getThemedColor(i10));
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18306y6));
        this.e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6);
        this.N.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.f34298c.invalidate();
    }

    @Override
    public final void r() {
        this.f34298c.x0(0);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final eh.d x() {
        return this.X;
    }

    public k91(Bundle bundle) {
        super(bundle);
        this.f34294a = new le.b(0, this, org.telegram.ui.Components.wr.h, 350L, false);
        this.O = 0;
        this.R = new ArrayList();
        this.U = -1;
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        RectF rectF = new RectF();
        this.f34295a0 = rectF;
        RectF rectF2 = new RectF();
        this.f34297b0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.V = new zg.e(false);
            this.W = new eh.d(null);
            this.X = new eh.d(null);
            return;
        }
        this.V = null;
        this.W = null;
        this.X = null;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
