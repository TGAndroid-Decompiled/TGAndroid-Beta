package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
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
public final class hy0 implements org.telegram.ui.Components.bl0 {
    public int f39070a = 0;
    public final Context f39071b;
    public final ProfileActivity f39072c;

    public hy0(ProfileActivity profileActivity, Context context) {
        this.f39072c = profileActivity;
        this.f39071b = context;
    }

    public static void a(hy0 hy0Var, Context context, int i10) {
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        Long l10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        if (i10 == 0) {
            hy0Var.f39072c.getUserConfig().syncContacts = true;
            hy0Var.f39072c.getUserConfig().saveConfig(false);
            hy0Var.f39072c.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i10 == 1) {
            hy0Var.f39072c.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            hy0Var.f39072c.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            hy0Var.f39072c.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            hy0Var.f39072c.j5();
            hy0Var.f39072c.d.l();
            if (BuildVars.LOGS_ENABLED) {
                j7.l1.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            hy0Var.f39072c.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(org.telegram.messenger.x3.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint").remove("taptostoryhighlighthint").apply();
            i7.e6.a();
            i15 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
            MessagesController.getEmojiSettings(i15).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            i16 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
            ChatThemeController.getInstance(i16).clearCache();
            hy0Var.f39072c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            b31.W();
            i17 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
            ag.h1.e(i17).a();
            SharedPreferences mainSettings = hy0Var.f39072c.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.x3.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : mainSettings.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit.remove(str6);
                }
            }
            edit.apply();
            i18 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(i18).edit();
            i19 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
            for (String str7 : MessagesController.getNotificationsSettings(i19).getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit2.remove(str7);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.h2.j(hy0Var.f39072c.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) hy0Var.f39072c.getParentActivity()).z(true);
        } else if (i10 == 10) {
            hy0Var.f39072c.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = hy0Var.f39072c.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            hy0Var.f39072c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = hy0Var.f39072c.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i14 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i14 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i14), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    Intent launchIntentForPackage = findActivity.getPackageManager().getLaunchIntentForPackage(findActivity.getPackageName());
                    findActivity.finishAffinity();
                    findActivity.startActivity(launchIntentForPackage);
                    System.exit(0);
                } else if (i10 == 18) {
                    i7.o8.a((LaunchActivity) hy0Var.f39072c.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    hy0Var.f39072c.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    hy0Var.f39072c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ey0(hy0Var, 0));
                } else if (i10 == 20) {
                    int i21 = ConnectionsManager.CPU_COUNT;
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
                    while (i20 < i21) {
                        long j20 = j11;
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i20);
                        sb2.append(" ");
                        int i22 = i20;
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            l10 = sysInfoLong3;
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j12 += sysInfoLong.longValue() / 1000;
                            j13++;
                        } else {
                            l10 = sysInfoLong3;
                        }
                        if (sysInfoLong2 != null) {
                            sb2.append("cur=");
                            sb2.append(sysInfoLong2.longValue() / 1000);
                            sb2.append(" ");
                            j14 += sysInfoLong2.longValue() / 1000;
                            j15++;
                        }
                        if (l10 != null) {
                            sb2.append("max=");
                            sb2.append(l10.longValue() / 1000);
                            sb2.append(" ");
                            j16 = (l10.longValue() / 1000) + j16;
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
                        i20 = i22 + 1;
                        j11 = j20;
                    }
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
                    int i23 = Build.VERSION.SDK_INT;
                    sb3.append(i23);
                    sb3.append(")\n");
                    if (i23 >= 31) {
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
                            j10 = j12;
                            sb3.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            j10 = j12;
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
                        j10 = j12;
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
                    if (i23 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i21);
                    sb3.append(" CPUs");
                    if (j13 > j21) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j10 / j13);
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
                    ProfileActivity.S0(hy0Var.f39072c, "video/avc", sb3);
                    ProfileActivity.S0(hy0Var.f39072c, "video/hevc", sb3);
                    ProfileActivity.S0(hy0Var.f39072c, "video/x-vnd.on2.vp8", sb3);
                    ProfileActivity.S0(hy0Var.f39072c, "video/x-vnd.on2.vp9", sb3);
                    hy0Var.f39072c.showDialog(new gy0(hy0Var, hy0Var.f39072c.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hy0Var.f39072c.getParentActivity(), 0, hy0Var.f39072c.f36129v0);
                    alertDialog$Builder.f22714a.N = "Force performance class";
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
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str8))}, new fy0(measureDevicePerformanceClass, 0));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q6 = nh.c1.q(hy0Var.f39072c.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Activity parentActivity2 = hy0Var.f39072c.getParentActivity();
                    if (!q6) {
                        i13 = R.string.DebugMenuDualOnToast;
                    } else {
                        i13 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity2, LocaleController.getString(i13), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i20 < hy0Var.f39072c.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c.getParentLayout().getFragmentStack().get(i20)).clearSheets();
                        i20++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    hy0Var.f39072c.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    i12 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
                    SharedConfig.toggleUseCamera2(i12);
                } else if (i10 == 29) {
                    ph.p.b();
                    ph.q0.c();
                    ph.h0.a();
                    ph.w3.c();
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
                    i11 = ((org.telegram.ui.ActionBar.o2) hy0Var.f39072c).currentAccount;
                    MessagesController.getInstance(i11).loadAppConfig(true);
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean c(int r46, android.view.View r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hy0.c(int, android.view.View):boolean");
    }
}
