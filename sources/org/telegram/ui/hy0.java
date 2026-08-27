package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class hy0 implements org.telegram.ui.Components.rk0 {

    public int f38909a = 0;

    public final Context f38910b;

    public final ProfileActivity f38911c;

    public hy0(ProfileActivity profileActivity, Context context) {
        this.f38911c = profileActivity;
        this.f38910b = context;
    }

    public static void b(hy0 hy0Var, Context context, int i10) {
        int i11 = 0;
        if (i10 == 0) {
            hy0Var.f38911c.getUserConfig().syncContacts = true;
            hy0Var.f38911c.getUserConfig().saveConfig(false);
            hy0Var.f38911c.getContactsController().forceImportContacts();
            return;
        }
        long j10 = 0;
        if (i10 == 1) {
            hy0Var.f38911c.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            hy0Var.f38911c.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            hy0Var.f38911c.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            hy0Var.f38911c.j5();
            hy0Var.f38911c.d.l();
            if (BuildVars.LOGS_ENABLED) {
                i0.a.y(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i10 == 6) {
            hy0Var.f38911c.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint").remove("taptostoryhighlighthint").apply();
            h7.y5.a();
            MessagesController.getEmojiSettings(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount).clearCache();
            hy0Var.f38911c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            a31.W();
            yf.r0.e(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount).a();
            SharedPreferences mainSettings = hy0Var.f38911c.getMessagesController().getMainSettings();
            SharedPreferences.Editor editorEdit = mainSettings.edit();
            org.telegram.messenger.y1.d(editorEdit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
            SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    editorEdit2.remove(str2);
                }
            }
            editorEdit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.e2.j(hy0Var.f38911c.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) hy0Var.f38911c.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            hy0Var.f38911c.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i10 == 13) {
            Set<String> set = hy0Var.f38911c.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            hy0Var.f38911c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i10 == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i10 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i10 == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(hy0Var.f38911c.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity activityFindActivity = AndroidUtilities.findActivity(context);
                Intent launchIntentForPackage = activityFindActivity.getPackageManager().getLaunchIntentForPackage(activityFindActivity.getPackageName());
                activityFindActivity.finishAffinity();
                activityFindActivity.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                h7.y7.a((LaunchActivity) hy0Var.f38911c.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                hy0Var.f38911c.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                hy0Var.f38911c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ey0(hy0Var, i11));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hy0Var.f38911c.getParentActivity(), 0, hy0Var.f38911c.f36067v0);
                    alertDialog$Builder.f22702a.N = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMeasureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(iMeasureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(iMeasureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(iMeasureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new fy0(iMeasureDevicePerformanceClass, 0));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean zQ = lh.c1.q(hy0Var.f38911c.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !zQ).apply();
                    Toast.makeText(hy0Var.f38911c.getParentActivity(), LocaleController.getString(!zQ ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i11 < hy0Var.f38911c.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) hy0Var.f38911c.getParentLayout().getFragmentStack().get(i11)).clearSheets();
                        i11++;
                    }
                    return;
                }
                if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i10 == 27) {
                    hy0Var.f38911c.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount);
                    return;
                }
                if (i10 == 29) {
                    nh.q.b();
                    nh.t0.c();
                    nh.j0.a();
                    nh.o4.c();
                    return;
                }
                if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i10 == 35) {
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) hy0Var.f38911c).currentAccount).loadAppConfig(true);
                    return;
                }
                if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                } else {
                    if (i10 == 38) {
                        SharedConfig.toggleFastWallpaperDisabled();
                        return;
                    }
                    return;
                }
            }
            int i12 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            long jLongValue = 0;
            long j11 = 0;
            long jLongValue2 = 0;
            long j12 = 0;
            long jLongValue3 = 0;
            long j13 = 0;
            long jLongValue4 = 0;
            long j14 = 0;
            while (i11 < i12) {
                long j15 = j10;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i11);
                sb2.append(" ");
                int i13 = i11;
                if (sysInfoLong != null) {
                    sb2.append("min=");
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    jLongValue += sysInfoLong.longValue() / 1000;
                    j11++;
                }
                if (sysInfoLong2 != null) {
                    sb2.append("cur=");
                    sb2.append(sysInfoLong2.longValue() / 1000);
                    sb2.append(" ");
                    jLongValue2 += sysInfoLong2.longValue() / 1000;
                    j12++;
                }
                if (sysInfoLong3 != 0) {
                    sb2.append("max=");
                    sb2.append(sysInfoLong3.longValue() / 1000);
                    sb2.append(" ");
                    jLongValue3 = (sysInfoLong3.longValue() / 1000) + jLongValue3;
                    j13++;
                }
                if (sysInfoLong4 != null) {
                    sb2.append("cpc=");
                    sb2.append(sysInfoLong4);
                    sb2.append(" ");
                    jLongValue4 = sysInfoLong4.longValue() + jLongValue4;
                    j14++;
                }
                sb2.append("\n");
                i11 = i13 + 1;
                j10 = j15;
            }
            long j16 = j10;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Build.MANUFACTURER);
            sb3.append(", ");
            sb3.append(Build.MODEL);
            sb3.append(" (");
            sb3.append(Build.PRODUCT);
            sb3.append(", ");
            sb3.append(Build.DEVICE);
            sb3.append(")  (android ");
            int i14 = Build.VERSION.SDK_INT;
            sb3.append(i14);
            sb3.append(")\n");
            if (i14 >= 31) {
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
            } else {
                jLongValue = jLongValue;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(AndroidUtilities.formatFileSize(((long) memoryClass) * 1048576));
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
            if (i14 >= 31) {
                sb3.append(", suggest=");
                sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb3.append("\n");
            sb3.append(i12);
            sb3.append(" CPUs");
            if (j11 > j16) {
                sb3.append(", avgMinFreq=");
                sb3.append(jLongValue / j11);
            }
            if (j12 > j16) {
                sb3.append(", avgCurFreq=");
                sb3.append(jLongValue2 / j12);
            }
            if (j13 > j16) {
                sb3.append(", avgMaxFreq=");
                sb3.append(jLongValue3 / j13);
            }
            if (j14 > j16) {
                sb3.append(", avgCapacity=");
                sb3.append(jLongValue4 / j14);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            ProfileActivity.S0(hy0Var.f38911c, "video/avc", sb3);
            ProfileActivity.S0(hy0Var.f38911c, "video/hevc", sb3);
            ProfileActivity.S0(hy0Var.f38911c, "video/x-vnd.on2.vp8", sb3);
            ProfileActivity.S0(hy0Var.f38911c, "video/x-vnd.on2.vp9", sb3);
            hy0Var.f38911c.showDialog(new gy0(hy0Var, hy0Var.f38911c.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean a(int i10, View view) {
        String str;
        int i11;
        String string;
        String str2;
        int i12;
        char c10;
        char c11;
        String string2;
        String str3;
        String str4;
        String string3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String string4;
        String str12;
        String str13;
        int i13;
        ProfileActivity profileActivity = this.f38911c;
        ArrayList arrayList = profileActivity.M4;
        if (i10 != profileActivity.f36070v3) {
            if (i10 >= profileActivity.f36038q4 && i10 < profileActivity.f36045r4) {
                return profileActivity.h(!profileActivity.f36089y2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.f36089y2.get(i10 - profileActivity.f36038q4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.f36038q4), true, false, view);
            }
            if (i10 != profileActivity.Q2) {
                if (i10 == profileActivity.D3) {
                    profileActivity.I3(i10, view);
                    return true;
                }
                if (profileActivity.J3(i10, view)) {
                    return true;
                }
                return profileActivity.C4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i10, view);
            }
            if (profileActivity.J3(i10, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.f36043r2;
            if (userFull == null) {
                return false;
            }
            try {
                AndroidUtilities.addToClipboard(UserInfoActivity.Z(userFull.birthday));
                org.telegram.ui.Components.mc.a0(profileActivity).i(LocaleController.getString(R.string.BirthdayCopied)).j();
                return true;
            } catch (Exception e9) {
                FileLog.e(e9);
                return true;
            }
        }
        int i14 = this.f38909a + 1;
        this.f38909a = i14;
        if (i14 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(profileActivity.getParentActivity(), LocaleController.getString("DebugMenuLongPress", R.string.DebugMenuLongPress), 0).show();
                return true;
            } catch (Exception e10) {
                FileLog.e(e10);
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36067v0);
        String string5 = LocaleController.getString(R.string.DebugMenu);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string5;
        String string6 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string7 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string8 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string9 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                str = "DebugMenuDisableLogs";
                i11 = R.string.DebugMenuDisableLogs;
            } else {
                str = "DebugMenuEnableLogs";
                i11 = R.string.DebugMenuEnableLogs;
            }
            string = LocaleController.getString(str, i11);
        }
        if (SharedConfig.inappCamera) {
            str2 = "DebugMenuDisableCamera";
            i12 = R.string.DebugMenuDisableCamera;
        } else {
            str2 = "DebugMenuEnableCamera";
            i12 = R.string.DebugMenuEnableCamera;
        }
        String string10 = LocaleController.getString(str2, i12);
        String string11 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string12 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c10 = 2;
            c11 = 0;
            string2 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            c10 = 2;
            string2 = null;
            c11 = 0;
        }
        String string13 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects";
        } else {
            str3 = null;
        }
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str14 = z10 ? "Clean app update" : null;
        String str15 = z10 ? "Reset suggestions" : null;
        String string14 = z10 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string15 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string16 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        if (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) {
            str4 = SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode";
        } else {
            str4 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            string3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            string3 = null;
        }
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str16 = z11 ? "Force remove premium suggestions" : null;
        String str17 = z11 ? "Share device info" : null;
        String str18 = z11 ? "Force performance class" : null;
        if (!z11 || org.telegram.ui.Components.k50.c()) {
            str5 = null;
        } else {
            str5 = !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        }
        String string17 = LocaleController.getString(lh.c1.q(profileActivity.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        if (BuildVars.DEBUG_VERSION) {
            str6 = SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories";
        } else {
            str6 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str7 = SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer";
        } else {
            str7 = null;
        }
        String str19 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str20 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str21 = !SharedConfig.isUsingCamera2(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str22 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str23 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            str8 = string2;
            if (Build.VERSION.SDK_INT >= 31) {
                str9 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
            }
            if (SharedConfig.adaptableColorInBrowser) {
                str10 = "Disabled adaptive browser colors";
            } else {
                str10 = "Enable adaptive browser colors";
            }
            if (SharedConfig.debugVideoQualities) {
                str11 = "Disable video qualities debug";
            } else {
                str11 = "Enable video qualities debug";
            }
            String str24 = str9;
            if (Build.VERSION.SDK_INT >= 28) {
                if (SharedConfig.useSystemBoldFont) {
                    i13 = R.string.DebugMenuDontUseSystemBoldFont;
                } else {
                    i13 = R.string.DebugMenuUseSystemBoldFont;
                }
                string4 = LocaleController.getString(i13);
            } else {
                string4 = null;
            }
            if (SharedConfig.forceForumTabs) {
                str12 = "Do Not Force Forum Tabs";
            } else {
                str12 = "Force Forum Tabs";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str13 = null;
            } else if (SharedConfig.fastWallpaperDisabled) {
                str13 = "enable wallpaper shader";
            } else {
                str13 = "disable wallpaper shader";
            }
            CharSequence[] charSequenceArr = new CharSequence[39];
            charSequenceArr[c11] = string6;
            charSequenceArr[1] = string7;
            charSequenceArr[c10] = string8;
            charSequenceArr[3] = string9;
            charSequenceArr[4] = string;
            charSequenceArr[5] = string10;
            charSequenceArr[6] = string11;
            charSequenceArr[7] = string12;
            charSequenceArr[8] = null;
            charSequenceArr[9] = str8;
            charSequenceArr[10] = string13;
            charSequenceArr[11] = str3;
            charSequenceArr[12] = str14;
            charSequenceArr[13] = str15;
            charSequenceArr[14] = string14;
            charSequenceArr[15] = string15;
            charSequenceArr[16] = string16;
            charSequenceArr[17] = str4;
            charSequenceArr[18] = string3;
            charSequenceArr[19] = str16;
            charSequenceArr[20] = str17;
            charSequenceArr[21] = str18;
            charSequenceArr[22] = str5;
            charSequenceArr[23] = string17;
            charSequenceArr[24] = str6;
            charSequenceArr[25] = str7;
            charSequenceArr[26] = str19;
            charSequenceArr[27] = str20;
            charSequenceArr[28] = str21;
            charSequenceArr[29] = str22;
            charSequenceArr[30] = str23;
            charSequenceArr[31] = str24;
            charSequenceArr[32] = str10;
            charSequenceArr[33] = str11;
            charSequenceArr[34] = string4;
            charSequenceArr[35] = "Reload app config";
            charSequenceArr[36] = str12;
            charSequenceArr[37] = "Make Memory Dump";
            charSequenceArr[38] = str13;
            alertDialog$Builder.f(charSequenceArr, new w(9, this, this.f38910b));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            profileActivity.showDialog(b2Var);
            return true;
        }
        str8 = string2;
        str9 = null;
        if (SharedConfig.adaptableColorInBrowser) {
            str10 = "Disabled adaptive browser colors";
        } else {
            str10 = "Enable adaptive browser colors";
        }
        if (SharedConfig.debugVideoQualities) {
            str11 = "Disable video qualities debug";
        } else {
            str11 = "Enable video qualities debug";
        }
        String str25 = str9;
        if (Build.VERSION.SDK_INT >= 28) {
            if (SharedConfig.useSystemBoldFont) {
                i13 = R.string.DebugMenuDontUseSystemBoldFont;
            } else {
                i13 = R.string.DebugMenuUseSystemBoldFont;
            }
            string4 = LocaleController.getString(i13);
        } else {
            string4 = null;
        }
        if (SharedConfig.forceForumTabs) {
            str12 = "Force Forum Tabs";
        } else {
            str12 = "Do Not Force Forum Tabs";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str13 = null;
        } else if (SharedConfig.fastWallpaperDisabled) {
            str13 = "enable wallpaper shader";
        } else {
            str13 = "disable wallpaper shader";
        }
        CharSequence[] charSequenceArr2 = new CharSequence[39];
        charSequenceArr2[c11] = string6;
        charSequenceArr2[1] = string7;
        charSequenceArr2[c10] = string8;
        charSequenceArr2[3] = string9;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string10;
        charSequenceArr2[6] = string11;
        charSequenceArr2[7] = string12;
        charSequenceArr2[8] = null;
        charSequenceArr2[9] = str8;
        charSequenceArr2[10] = string13;
        charSequenceArr2[11] = str3;
        charSequenceArr2[12] = str14;
        charSequenceArr2[13] = str15;
        charSequenceArr2[14] = string14;
        charSequenceArr2[15] = string15;
        charSequenceArr2[16] = string16;
        charSequenceArr2[17] = str4;
        charSequenceArr2[18] = string3;
        charSequenceArr2[19] = str16;
        charSequenceArr2[20] = str17;
        charSequenceArr2[21] = str18;
        charSequenceArr2[22] = str5;
        charSequenceArr2[23] = string17;
        charSequenceArr2[24] = str6;
        charSequenceArr2[25] = str7;
        charSequenceArr2[26] = str19;
        charSequenceArr2[27] = str20;
        charSequenceArr2[28] = str21;
        charSequenceArr2[29] = str22;
        charSequenceArr2[30] = str23;
        charSequenceArr2[31] = str25;
        charSequenceArr2[32] = str10;
        charSequenceArr2[33] = str11;
        charSequenceArr2[34] = string4;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str12;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str13;
        alertDialog$Builder.f(charSequenceArr2, new w(9, this, this.f38910b));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        profileActivity.showDialog(b2Var);
        return true;
    }
}
