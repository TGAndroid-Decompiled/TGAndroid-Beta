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
public final class a91 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40, bh0, le.d {
    public org.telegram.ui.Components.w9 E;
    public FrameLayout F;
    public FrameLayout G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public boolean L;
    public View M;
    public int N;
    public boolean O;
    public ValueAnimator P;
    public final ArrayList Q;
    public int R;
    public int S;
    public int T;
    public final ah.i U;
    public final fh.d V;
    public final fh.d W;
    public xa X;
    public final ArrayList Y;
    public final RectF Z;
    public final le.b f34736a;
    public final RectF f34737a0;
    public y8 f34738b;
    public org.telegram.ui.Components.c71 f34739c;
    public org.telegram.ui.ActionBar.v0 d;
    public org.telegram.ui.ActionBar.v0 f34740e;
    public s81 f34741f;
    public org.telegram.ui.Components.y40 h;
    public AnimatorSet f34742n;
    public org.telegram.ui.Cells.z3 f34743r;
    public TLRPC.FileLocation f34744s;
    public TLRPC.FileLocation v;
    public FrameLayout f34745w;
    public FrameLayout f34746x;
    public org.telegram.ui.Components.h9 f34747y;

    public a91() {
        this(null);
    }

    public static boolean S(a91 a91Var, org.telegram.ui.Components.g61 g61Var, View view) {
        String str;
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ei.l3.j(a91Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new o81(a91Var, 1));
            return true;
        }
        if (g61Var.G(org.telegram.ui.Cells.w6.class)) {
            Object obj2 = g61Var.G;
            if (obj2 instanceof b11) {
                str = ((b11) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(a91Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new wx0(27, a91Var, str), false);
                H.W(a91Var.f34739c.W0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void U(a91 a91Var, int i10) {
        float f7;
        int i11;
        RectF rectF = a91Var.f34737a0;
        ah.i iVar = a91Var.U;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                int dp = AndroidUtilities.dp(48.0f);
                int measuredHeight = (a91Var.fragmentView.getMeasuredHeight() - a91Var.R) - AndroidUtilities.dp(8.0f);
                a91Var.Z.set(0.0f, -dp, a91Var.fragmentView.getMeasuredWidth(), a91Var.actionBar.getMeasuredHeight() + dp);
                rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), a91Var.fragmentView.getMeasuredWidth(), measuredHeight);
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.0f;
                } else {
                    f7 = -AndroidUtilities.dp(48.0f);
                }
                rectF.inset(0.0f, f7);
                ArrayList arrayList = a91Var.Y;
                if (a91Var.L) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                iVar.g(i11, arrayList);
            }
            iVar.e(a91Var.X, a91Var.fragmentView.getMeasuredWidth(), a91Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void W(a91 a91Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(a91Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(a91Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new zb0(23, a91Var, tL_attachMenuBot), 66);
    }

    public static void X(a91 a91Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            a91Var.f34744s = fileLocation;
            a91Var.v = photoSize2.location;
            a91Var.E.h(ImageLocation.getForLocal(fileLocation), "90_90", a91Var.f34747y, null);
            a91Var.m0(true, false);
        } else if (a91Var.f34744s == null) {
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
            a91Var.T = a91Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new zb0(22, a91Var, str));
        }
        a91Var.actionBar.n().requestLayout();
    }

    public static void Y(a91 a91Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(a91Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(a91Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(a91Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.y40 y40Var = a91Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        y40Var.o(z10, new o81(a91Var, 0), new ci.f1(6), 0);
    }

    public static void Z(a91 a91Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.G1, a91Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(a91Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void b0(org.telegram.ui.a91 r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a91.b0(org.telegram.ui.a91):void");
    }

    public static void c0(a91 a91Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j3;
        Long l4;
        int i12;
        int i13 = 0;
        if (i10 == 0) {
            a91Var.getUserConfig().syncContacts = true;
            a91Var.getUserConfig().saveConfig(false);
            a91Var.getContactsController().forceImportContacts();
            return;
        }
        long j10 = 0;
        if (i10 == 1) {
            a91Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            a91Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            a91Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            a91Var.f34739c.f25245f3.N(true);
            if (BuildVars.LOGS_ENABLED) {
                hg.k0.t(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            a91Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(org.telegram.messenger.f0.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            w7.y5.a();
            SharedPrefsHelper.cleanupAccount(a91Var.currentAccount);
            MessagesController.getEmojiSettings(a91Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(a91Var.currentAccount).clearCache();
            a91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            y31.U();
            pg.u0.e(a91Var.currentAccount).a();
            SharedPreferences mainSettings = a91Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.f0.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str7 : mainSettings.getAll().keySet()) {
                if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                    edit.remove(str7);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(a91Var.currentAccount).edit();
            for (String str8 : MessagesController.getNotificationsSettings(a91Var.currentAccount).getAll().keySet()) {
                if (str8.startsWith("dialog_bar_botver")) {
                    edit2.remove(str8);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(a91Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) a91Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            a91Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = a91Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            a91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = a91Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = a91Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    w7.y.a((LaunchActivity) a91Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    a91Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    a91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new q81(a91Var, 0));
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
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            l4 = sysInfoLong2;
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j12++;
                            j3 = (sysInfoLong.longValue() / 1000) + j11;
                        } else {
                            j3 = j11;
                            l4 = sysInfoLong2;
                        }
                        if (l4 != null) {
                            sb2.append("cur=");
                            sb2.append(l4.longValue() / 1000);
                            sb2.append(" ");
                            j13 += l4.longValue() / 1000;
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
                        i13++;
                        j10 = j19;
                        j11 = j3;
                    }
                    long j20 = j10;
                    long j21 = j11;
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
                            sb3.append(sysInfoLong5.longValue() / 1000);
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
                    if (j12 > j20) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j21 / j12);
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
                    j0("video/avc", sb3);
                    j0("video/hevc", sb3);
                    j0("video/x-vnd.on2.vp8", sb3);
                    j0("video/x-vnd.on2.vp9", sb3);
                    a91Var.showDialog(new t81(a91Var, a91Var.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a91Var.getParentActivity(), 0, a91Var.resourceProvider);
                    alertDialog$Builder.f20368a.R = "Force performance class";
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
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str6))}, new cz0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q6 = ci.d1.q(a91Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Activity parentActivity3 = a91Var.getParentActivity();
                    if (!q6) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i13 < a91Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) a91Var.getParentLayout().getFragmentStack().get(i13)).clearSheets();
                        i13++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    a91Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(a91Var.currentAccount);
                } else if (i10 == 29) {
                    ei.s.b();
                    ei.x0.c();
                    ei.m0.a();
                    ei.d5.c();
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
                    MessagesController.getInstance(a91Var.currentAccount).loadAppConfig(true);
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
                } else if (i10 == 41) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z10;
                    edit3.putBoolean("debugViewMetrics", z10).apply();
                } else if (i10 == 42) {
                    ri.a aVar = ri.e.f46443a;
                    synchronized (aVar) {
                        if (!aVar.f46435b) {
                            SharedPreferences sharedPreferences = ri.d.f46442a;
                            aVar.f46436c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.f46435b = true;
                        }
                        boolean z11 = !aVar.d;
                        aVar.d = z11;
                        aVar.f46436c = true;
                        aVar.f46435b = true;
                        ri.d.f46442a.edit().putBoolean("experimental_settings_allowed", z11).apply();
                    }
                    a91Var.f34739c.f25245f3.N(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e0(a91 a91Var, ArrayList arrayList) {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.q0 q0Var = a91Var.d.F;
        int i10 = 0;
        if (q0Var != null && q0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.g61.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            s81 s81Var = a91Var.f34741f;
            ArrayList arrayList3 = s81Var.d;
            ArrayList arrayList4 = s81Var.v;
            if (s81Var.f35252w) {
                ArrayList arrayList5 = s81Var.f35250r;
                int size = arrayList5.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    int i13 = org.telegram.ui.Cells.w6.f23677a;
                    org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.w6.class);
                    J.f26669l = (CharSequence) s81Var.f35249n.get(i11);
                    J.G = (b11) obj;
                    arrayList.add(J);
                    i11++;
                }
                if (!s81Var.f35251s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList6 = s81Var.f35251s;
                    int size2 = arrayList6.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList6.get(i10);
                        i10++;
                        int i14 = org.telegram.ui.Cells.w6.f23677a;
                        org.telegram.ui.Components.g61 J2 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.w6.class);
                        J2.f26669l = (CharSequence) s81Var.f35249n.get(i11);
                        J2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(J2);
                        i11++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList4.get(i15);
                    i15++;
                    if (obj3 instanceof b11) {
                        b11 b11Var = (b11) obj3;
                        String str = b11Var.f34952a;
                        int i16 = org.telegram.ui.Cells.w6.f23677a;
                        org.telegram.ui.Components.g61 J3 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.w6.class);
                        J3.f26669l = str;
                        J3.G = b11Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i17 = org.telegram.ui.Cells.w6.f23677a;
                        org.telegram.ui.Components.g61 J4 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.w6.class);
                        J4.f26669l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList3.size();
                while (i10 < size4) {
                    Object obj4 = arrayList3.get(i10);
                    i10++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str3 = faqSearchResult2.title;
                    int i18 = org.telegram.ui.Cells.w6.f23677a;
                    org.telegram.ui.Components.g61 J5 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.w6.class);
                    J5.f26669l = str3;
                    J5.G = faqSearchResult2;
                    arrayList.add(J5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.g61.l(188, a91Var.f34745w));
        a91Var.Q.clear();
        for (int i19 = 0; i19 < 4; i19++) {
            if (UserConfig.getInstance(i19).isClientActivated() && a91Var.currentAccount != i19) {
                a91Var.Q.add(Integer.valueOf(i19));
            }
        }
        Collections.sort(a91Var.Q, new ff(29));
        Set<String> set = a91Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(y81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new p81(a91Var, 0)));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && a91Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(y81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.ok.h(new StringBuilder("+"), a91Var.getUserConfig().getCurrentUser().phone, gf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new o81(a91Var, 2)), LocaleController.getString(R.string.CheckPhoneNumberNo), new p81(a91Var, 1), yh.x3.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new p81(a91Var, 2)));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(y81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new p81(a91Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new p81(a91Var, 4)));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        if (a91Var.Q.size() > 0) {
            com.google.android.gms.internal.vision.e2.n(R.string.SettingsAccounts, arrayList);
            for (int i20 = 0; i20 < a91Var.Q.size(); i20++) {
                int intValue = ((Integer) a91Var.Q.get(i20)).intValue();
                int i21 = u81.f41113a;
                org.telegram.ui.Components.g61 J6 = org.telegram.ui.Components.g61.J(u81.class);
                J6.d = i20;
                J6.f26682z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        arrayList.add(w81.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(w81.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(w81.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(w81.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(w81.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(w81.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(w81.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(w81.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(w81.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.g61.B(null));
        if (!a91Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(w81.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence = "";
        if (a91Var.getMessagesController().starsPurchaseAvailable()) {
            yh.t5 y3 = yh.t5.y(a91Var.currentAccount, false);
            long j3 = y3.p().amount;
            int i22 = R.drawable.settings_stars;
            String string = LocaleController.getString(R.string.TelegramStars);
            if (!y3.f52014e || j3 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = yh.x7.P0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(w81.a(12, -1071598, -1608430, i22, string, null, spannableStringBuilder));
        }
        yh.t5.y(a91Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (yh.t5.y(a91Var.currentAccount, true).f52014e && (yh.t5.y(a91Var.currentAccount, true).O(0) || yh.t5.y(a91Var.currentAccount, true).p().positive()))) {
            yh.t5 y10 = yh.t5.y(a91Var.currentAccount, true);
            long j10 = y10.p().amount;
            int i23 = R.drawable.settings_gram_24;
            String string2 = LocaleController.getString(R.string.MyTON);
            if (y10.f52014e && j10 > 0) {
                charSequence = yh.x7.P0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(w81.a(13, -14965523, -15431455, i23, string2, null, charSequence));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList7 = attachMenuBots.bots;
            int size5 = arrayList7.size();
            while (i10 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList7.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i24 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.g61 J7 = org.telegram.ui.Components.g61.J(w81.class);
                    long j11 = tL_attachMenuBot2.bot_id;
                    J7.d = (int) (j11 ^ (j11 >>> 32));
                    J7.f26668k = i24;
                    J7.f26669l = tL_attachMenuBot2.short_name;
                    J7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    J7.G = tL_attachMenuBot2;
                    arrayList.add(J7);
                }
            }
        }
        if (!a91Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(w81.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!a91Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(w81.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.g61) hg.k0.g(1, arrayList)).f17183a != 7) {
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        com.google.android.gms.internal.vision.e2.n(R.string.SettingsHelp, arrayList);
        arrayList.add(w81.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(w81.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(w81.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(w81.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        ri.a aVar = ri.e.f46443a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.g61.B(null));
            arrayList.add(org.telegram.ui.Components.g61.t("Experimental"));
            arrayList.add(w81.a(24, 0, 0, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.g61.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.SettingsDebug, arrayList);
            arrayList.add(w81.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(w81.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(w81.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.g61.m(a91Var.K));
    }

    public static void f0(a91 a91Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        a91Var.T = -1;
        if (tL_error == null) {
            TLRPC.User user = a91Var.getMessagesController().getUser(Long.valueOf(a91Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = a91Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                a91Var.getMessagesController().putUser(user, false);
            } else {
                a91Var.getUserConfig().setCurrentUser(user);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20062id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && a91Var.f34744s != null) {
                FileLoader.getInstance(a91Var.currentAccount).getPathToAttach(a91Var.f34744s, true).renameTo(FileLoader.getInstance(a91Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a91Var.f34744s.volume_id);
                sb2.append("_");
                String n10 = a4.a.n(a91Var.f34744s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(a91Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(a91Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && a91Var.v != null) {
                FileLoader.getInstance(a91Var.currentAccount).getPathToAttach(a91Var.v, true).renameTo(FileLoader.getInstance(a91Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            a91Var.getMessagesController().getDialogPhotos(user.f20185id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            a91Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = a91Var.getMessagesController().getUserFull(a91Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                a91Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            a91Var.l0(user);
        }
        a91Var.f34744s = null;
        a91Var.v = null;
        a91Var.m0(false, true);
        a91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        a91Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        a91Var.getUserConfig().saveConfig(true);
    }

    public static void g0(a91 a91Var, org.telegram.ui.Components.g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.C0(LaunchActivity.G1, a91Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                ej1.a(a91Var.getParentActivity(), new ft(17, a91Var, tL_attachMenuBot), null);
            }
        } else if (g61Var.G(u81.class)) {
            int i10 = g61Var.f26682z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        } else if (g61Var.G(org.telegram.ui.Cells.w6.class)) {
            Object obj2 = g61Var.G;
            if (obj2 instanceof b11) {
                b11 b11Var = (b11) obj2;
                org.telegram.ui.ActionBar.c5 parentLayout = a91Var.getParentLayout();
                b11Var.f34953b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, b11Var.f34954c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(a91Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, a91Var.f34741f.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = g61Var.G;
            if (obj3 != null) {
                a91Var.f34741f.E(obj3);
            }
        } else {
            switch (g61Var.d) {
                case 1:
                    a91Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    a91Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    a91Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    a91Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    a91Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    a91Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    a91Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    a91Var.k0(new lc0());
                    return;
                case 10:
                    a91Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    a91Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    a91Var.k0(new yh.x7());
                    return;
                case 13:
                    a91Var.k0(new di.k());
                    return;
                case 15:
                    a91Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    tg.m1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    a91Var.showDialog(org.telegram.ui.Components.e5.U(a91Var, a91Var.resourceProvider));
                    return;
                case 18:
                    nf.f.s(a91Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    nf.f.s(a91Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.H4(a91Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.H4(a91Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(a91Var.currentAccount).isFrozen()) {
                        b.b(a91Var.currentAccount);
                        return;
                    } else {
                        nf.f.s(a91Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
                case 24:
                    a91Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                    return;
            }
        }
    }

    public static void j0(String str, StringBuilder sb2) {
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
    public final void B(float f7) {
        org.telegram.ui.Cells.z3 z3Var = this.f34743r;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f7);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.f34743r;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    @Override
    public final void O(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            i0();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f34738b = new y8(this, context, 7);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.J();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new h81(this, 1));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.v0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.H = new hg.d2(this, 18);
        this.d = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.v0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f34740e = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f34740e.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        s81 s81Var = new s81(this, this, context);
        this.f34741f = s81Var;
        s81Var.G();
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(this, new c5(this, 26), new r81(this), new r81(this));
        this.f34739c = c71Var;
        c71Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.c71 c71Var2 = this.f34739c;
        c71Var2.f25245f3.f31307r = false;
        c71Var2.s1();
        this.f34739c.setSectionsDrawBackground(true);
        li.a.c(this.f34739c, 0, 0, AndroidUtilities.dp(12.0f), this.S);
        this.f34739c.setClipToPadding(false);
        this.f34739c.j(new i3(this, 29));
        this.X = new xa(this, 2);
        this.f34738b.addView(this.f34739c, w7.z5.e(-1, -1, 119));
        this.f34738b.addView(this.actionBar, w7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
        this.h = y40Var;
        y40Var.H = true;
        y40Var.f33042a = this;
        y40Var.f33043b = this;
        this.f34745w = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34746x = frameLayout;
        this.f34745w.addView(frameLayout, w7.z5.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f34746x.setOnClickListener(new p81(this, 5));
        w7.b6.a(this.f34746x);
        this.f34747y = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.E = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f34746x.addView(this.E, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(this, context);
        this.f34743r = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f34743r.setProgressColor(-1);
        this.f34743r.setNoProgress(false);
        this.f34746x.addView(this.f34743r, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.i6.f20762a7)));
        this.F.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.G = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.i6.Oh)));
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.H.setImageResource(R.drawable.filled_premium_camera);
        this.G.addView(this.H, w7.z5.e(22, 22, 17));
        this.F.addView(this.G, w7.z5.c(30.0f, 30));
        this.f34746x.addView(this.F, w7.z5.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        w7.b6.a(this.F);
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setTextSize(1, 22.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setGravity(17);
        this.I.setSingleLine();
        TextView textView2 = this.I;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView i10 = org.telegram.ui.Cells.c1.i(this.f34745w, this.I, w7.z5.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.J = i10;
        i10.setTextSize(1, 13.0f);
        this.J.setGravity(17);
        this.J.setSingleLine();
        this.J.setEllipsize(truncateAt);
        TextView i11 = org.telegram.ui.Cells.c1.i(this.f34745w, this.J, w7.z5.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.K = i11;
        i11.setTextSize(1, 14.0f);
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.B6));
        this.K.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.K.setGravity(17);
        this.K.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f20909i6), 2, -1));
        this.K.setOnClickListener(new p81(this, 6));
        this.M = new View(context);
        n0(true, false);
        this.f34739c.f25245f3.N(false);
        l0(getUserConfig().getCurrentUser());
        o0();
        i0();
        li.m mVar = this.glassEngine;
        mVar.f15662a = new r81(this);
        mVar.d = new ni.b(AndroidUtilities.dp(48.0f));
        y8 y8Var = this.f34738b;
        r81 r81Var = new r81(this);
        WeakHashMap weakHashMap = r0.i0.f45596a;
        r0.a0.j(y8Var, r81Var);
        y8 y8Var2 = this.f34738b;
        this.fragmentView = y8Var2;
        return y8Var2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.c71 c71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            l0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.c71 c71Var2 = this.f34739c;
            if (c71Var2 != null) {
                c71Var2.f25245f3.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            l0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (c71Var = this.f34739c) != null) {
            c71Var.f25245f3.N(true);
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
    public final yu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f34739c;
    }

    public final void i0() {
        float f7;
        org.telegram.ui.ActionBar.v0 v0Var = this.f34740e;
        le.b bVar = this.f34736a;
        org.telegram.ui.Components.c20.d(v0Var, 1.0f - bVar.f15435e);
        ImageView backButton = this.actionBar.getBackButton();
        if (this.L) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.c20.d(backButton, AndroidUtilities.lerp(f7, 1.0f, bVar.f15435e));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f34736a.f15436f;
    }

    public final void k0(org.telegram.ui.ActionBar.n2 n2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.G1) != null && (actionBarLayout = launchActivity.f33802s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(n2Var);
            a5Var.f20381c = true;
            a5Var.f20384g = true;
            actionBarLayout.R(a5Var);
            return;
        }
        presentFragment(n2Var);
    }

    public final void l0(TLRPC.User user) {
        String str;
        String str2;
        if (this.E == null || this.T != -1) {
            return;
        }
        this.f34747y.r(user);
        this.E.e(user, this.f34747y);
        this.I.setText(UserObject.getUserName(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(gf.b.c().b("+" + user.phone));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null) {
            sb2.append(" • @");
            sb2.append(publicUsername);
        }
        this.J.setText(sb2);
        TextView textView = this.K;
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
        } catch (Exception e7) {
            FileLog.e(e7);
            str = null;
        }
        textView.setText(str);
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.f34743r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f34742n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34742n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34742n = animatorSet2;
            if (z10) {
                this.f34743r.setVisibility(0);
                this.f34742n.playTogether(ObjectAnimator.ofFloat(this.f34743r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f34743r, View.ALPHA, 0.0f));
            }
            this.f34742n.setDuration(180L);
            this.f34742n.addListener(new g70(9, this, z10));
            this.f34742n.start();
        } else if (z10) {
            this.f34743r.setAlpha(1.0f);
            this.f34743r.setVisibility(0);
        } else {
            this.f34743r.setAlpha(0.0f);
            this.f34743r.setVisibility(4);
        }
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a91.n0(boolean, boolean):void");
    }

    public final void o0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.B(getThemedColor(i10), false);
        this.I.setTextColor(getThemedColor(i10));
        this.J.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21205y6));
        this.d.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6);
        this.M.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, themedColor), themedColor}));
        this.f34739c.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.f21277n0) {
            if (z10) {
                kVar.h(true);
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
            this.L = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.L) {
            i10 = AndroidUtilities.dp(72.0f);
        }
        this.S = i10;
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
    public final void r() {
        this.f34739c.y0(0);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final fh.d x() {
        return this.W;
    }

    public a91(Bundle bundle) {
        super(bundle);
        this.f34736a = new le.b(0, this, org.telegram.ui.Components.tr.h, 350L, false);
        this.N = 0;
        this.Q = new ArrayList();
        this.T = -1;
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        RectF rectF = new RectF();
        this.Z = rectF;
        RectF rectF2 = new RectF();
        this.f34737a0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c d = this.glassEngine.d(new r81(this));
        if (Build.VERSION.SDK_INT >= 31) {
            ah.i iVar = new ah.i();
            this.U = iVar;
            fh.d dVar = new fh.d(d);
            this.W = dVar;
            dVar.f9862f = d;
            dVar.d = iVar;
            dVar.f9861e = -2;
            fh.d dVar2 = new fh.d(null);
            this.V = dVar2;
            dVar2.f9862f = d;
            dVar2.d = iVar;
            dVar2.f9861e = -3;
            return;
        }
        this.U = null;
        this.V = null;
        this.W = null;
    }

    @Override
    public final void N() {
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
