package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.internal.mlkit_vision_label.zzcy;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.HintsController$Hint;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.ProfileActivity.AnonymousClass15.AnonymousClass1;
import org.telegram.ui.Stories.recorder.DualCameraView;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotLocation;

public final class ArticleViewer$$ExternalSyntheticLambda24 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda24(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final void onClick$org$telegram$ui$ProfileActivity$15$$ExternalSyntheticLambda1(DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 0;
        ProfileActivity.AnonymousClass15 anonymousClass15 = (ProfileActivity.AnonymousClass15) this.f$0;
        Context context = (Context) this.f$1;
        anonymousClass15.getClass();
        if (i == 0) {
            ProfileActivity.this.getUserConfig().syncContacts = true;
            ProfileActivity.this.getUserConfig().saveConfig(false);
            ProfileActivity.this.getContactsController().forceImportContacts();
            return;
        }
        if (i == 1) {
            ProfileActivity.this.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i == 2) {
            ProfileActivity.this.getContactsController().resetImportedContacts();
            return;
        }
        if (i == 3) {
            ProfileActivity.this.getMessagesController().forceResetDialogs();
            return;
        }
        if (i == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            ProfileActivity.this.updateRowsIds();
            ProfileActivity.this.listAdapter.mObservable.notifyChanged();
            if (BuildVars.LOGS_ENABLED) {
                zzjj.m(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i == 6) {
            ProfileActivity.this.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint").remove("taptostoryhighlighthint").apply();
            SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
            for (HintsController$Hint hintsController$Hint : HintsController$Hint.values()) {
                editorEdit.remove(hintsController$Hint.name);
            }
            editorEdit.apply();
            MessagesController.getEmojiSettings(((BaseFragment) ProfileActivity.this).currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).clearCache();
            ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            RestrictedLanguagesSelectActivity.gotRestrictedLanguages = false;
            MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
            RestrictedLanguagesSelectActivity.checkRestrictedLanguages(false);
            PersistColorPalette.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).cleanup();
            SharedPreferences mainSettings = ProfileActivity.this.getMessagesController().getMainSettings();
            SharedPreferences.Editor editorEdit2 = mainSettings.edit();
            MessagesController$$ExternalSyntheticOutline0.m(editorEdit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    editorEdit2.remove(str);
                }
            }
            editorEdit2.apply();
            SharedPreferences.Editor editorEdit3 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    editorEdit3.remove(str2);
                }
            }
            editorEdit3.apply();
            return;
        }
        if (i == 7) {
            VoIPHelper.showCallDebugSettings(ProfileActivity.this.getParentActivity());
            return;
        }
        if (i == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i == 9) {
            ((LaunchActivity) ProfileActivity.this.getParentActivity()).checkAppUpdate(true);
            return;
        }
        if (i == 10) {
            ProfileActivity.this.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i == 13) {
            Set<String> set = ProfileActivity.this.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity activityFindActivity = AndroidUtilities.findActivity(context);
                Intent launchIntentForPackage = activityFindActivity.getPackageManager().getLaunchIntentForPackage(activityFindActivity.getPackageName());
                activityFindActivity.finishAffinity();
                activityFindActivity.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i == 18) {
                zzcy.setActive((LaunchActivity) ProfileActivity.this.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i == 19) {
                ProfileActivity.this.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ProfileActivity.this.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ProfileActivity$15$$ExternalSyntheticLambda2(anonymousClass15, i2));
                return;
            }
            if (i != 20) {
                if (i == 21) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), 0, ProfileActivity.this.resourcesProvider);
                    builder.alertDialog.title = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMeasureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    builder.setItems(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(iMeasureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(iMeasureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(iMeasureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new SettingsActivity$$ExternalSyntheticLambda27(iMeasureDevicePerformanceClass, 1));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    builder.show();
                    return;
                }
                if (i == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i == 23) {
                    boolean zDualAvailableStatic = DualCameraView.dualAvailableStatic(ProfileActivity.this.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !zDualAvailableStatic).apply();
                    Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString(!zDualAvailableStatic ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i2 < ((ActionBarLayout) ProfileActivity.this.getParentLayout()).getFragmentStack().size()) {
                        ((ActionBarLayout) ProfileActivity.this.getParentLayout()).getFragmentStack().get(i2).clearSheets();
                        i2++;
                    }
                    return;
                }
                if (i == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i == 27) {
                    ProfileActivity.this.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i == 28) {
                    SharedConfig.toggleUseCamera2(((BaseFragment) ProfileActivity.this).currentAccount);
                    return;
                }
                if (i != 29) {
                    if (i == 30) {
                        AuthTokensHelper.clearLogInTokens();
                        return;
                    }
                    if (i == 31) {
                        SharedConfig.toggleUseNewBlur();
                        return;
                    }
                    if (i == 32) {
                        SharedConfig.toggleBrowserAdaptableColors();
                        return;
                    }
                    if (i == 33) {
                        SharedConfig.toggleDebugVideoQualities();
                        return;
                    }
                    if (i == 34) {
                        SharedConfig.toggleUseSystemBoldFont();
                        return;
                    }
                    if (i == 35) {
                        MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).loadAppConfig(true);
                        return;
                    }
                    if (i == 36) {
                        SharedConfig.toggleForceForumTabs();
                        return;
                    } else if (i == 37) {
                        FileLog.getInstance().dumpMemory(true);
                        return;
                    } else {
                        if (i == 38) {
                            SharedConfig.toggleFastWallpaperDisabled();
                            return;
                        }
                        return;
                    }
                }
                WeakHashMap weakHashMap = BotBiometry.instances;
                Context context2 = ApplicationLoader.applicationContext;
                if (context2 != null) {
                    for (int i3 = 0; i3 < 4; i3++) {
                        context2.getSharedPreferences("2botbiometry_" + i3, 0).edit().clear().apply();
                    }
                    BotBiometry.instances.clear();
                }
                HashMap map = BotLocation.instances;
                Context context3 = ApplicationLoader.applicationContext;
                if (context3 != null) {
                    for (int i4 = 0; i4 < 4; i4++) {
                        context3.getSharedPreferences("botlocation_" + i4, 0).edit().clear().apply();
                    }
                    BotLocation.instances.clear();
                }
                HashMap map2 = BotDownloads.instances;
                Context context4 = ApplicationLoader.applicationContext;
                if (context4 != null) {
                    for (int i5 = 0; i5 < 4; i5++) {
                        context4.getSharedPreferences("botdownloads_" + i5, 0).edit().clear().apply();
                    }
                    BotDownloads.instances.clear();
                }
                Context context5 = ApplicationLoader.applicationContext;
                if (context5 == null) {
                    return;
                }
                for (int i6 = 0; i6 < 4; i6++) {
                    context5.getSharedPreferences("botemojistatus_" + i6, 0).edit().clear().apply();
                }
                return;
            }
            int i7 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb = new StringBuilder();
            long j = 0;
            long jLongValue = 0;
            long j2 = 0;
            long jLongValue2 = 0;
            long j3 = 0;
            long jLongValue3 = 0;
            long j4 = 0;
            long jLongValue4 = 0;
            while (i2 < i7) {
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i2 + "/cpu_capacity");
                sb.append("#");
                sb.append(i2);
                sb.append(" ");
                if (sysInfoLong != null) {
                    sb.append("min=");
                    sb.append(sysInfoLong.longValue() / 1000);
                    sb.append(" ");
                    jLongValue += sysInfoLong.longValue() / 1000;
                    j++;
                }
                if (sysInfoLong2 != null) {
                    sb.append("cur=");
                    sb.append(sysInfoLong2.longValue() / 1000);
                    sb.append(" ");
                    jLongValue2 = (sysInfoLong2.longValue() / 1000) + jLongValue2;
                    j2++;
                }
                if (sysInfoLong3 != null) {
                    sb.append("max=");
                    sb.append(sysInfoLong3.longValue() / 1000);
                    sb.append(" ");
                    jLongValue3 = (sysInfoLong3.longValue() / 1000) + jLongValue3;
                    j3++;
                }
                if (sysInfoLong4 != null) {
                    sb.append("cpc=");
                    sb.append(sysInfoLong4);
                    sb.append(" ");
                    jLongValue4 = sysInfoLong4.longValue() + jLongValue4;
                    j4++;
                }
                sb.append("\n");
                i2++;
                j = j;
            }
            long j5 = j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.MANUFACTURER);
            sb2.append(", ");
            sb2.append(Build.MODEL);
            sb2.append(" (");
            sb2.append(Build.PRODUCT);
            sb2.append(", ");
            sb2.append(Build.DEVICE);
            sb2.append(")  (android ");
            int i8 = Build.VERSION.SDK_INT;
            sb2.append(i8);
            sb2.append(")\n");
            if (i8 >= 31) {
                sb2.append("SoC: ");
                sb2.append(Build.SOC_MANUFACTURER);
                sb2.append(", ");
                sb2.append(Build.SOC_MODEL);
                sb2.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb2.append("GPU: ");
                sb2.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb2.append(", min=");
                    sb2.append(sysInfoLong5.longValue() / 1000);
                }
                if (sysInfoLong6 != null) {
                    sb2.append(", mmin=");
                    sb2.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb2.append(", max=");
                    sb2.append(sysInfoLong7.longValue() / 1000);
                }
                sb2.append("\n");
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb2.append("GLES Version: ");
            sb2.append(deviceConfigurationInfo.getGlEsVersion());
            sb2.append("\nMemory: class=");
            sb2.append(AndroidUtilities.formatFileSize(((long) memoryClass) * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb2.append(", total=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb2.append(", avail=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb2.append(", low?=");
            sb2.append(memoryInfo.lowMemory);
            sb2.append(" (threshold=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb2.append(")\nCurrent class: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb2.append(", measured: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i8 >= 31) {
                sb2.append(", suggest=");
                sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb2.append("\n");
            sb2.append(i7);
            sb2.append(" CPUs");
            if (j5 > 0) {
                sb2.append(", avgMinFreq=");
                sb2.append(jLongValue / j5);
            }
            if (j2 > 0) {
                sb2.append(", avgCurFreq=");
                sb2.append(jLongValue2 / j2);
            }
            if (j3 > 0) {
                sb2.append(", avgMaxFreq=");
                sb2.append(jLongValue3 / j3);
            }
            if (j4 > 0) {
                sb2.append(", avgCapacity=");
                sb2.append(jLongValue4 / j4);
            }
            sb2.append("\n");
            sb2.append((CharSequence) sb);
            ProfileActivity.access$19500("video/avc", sb2);
            ProfileActivity.access$19500("video/hevc", sb2);
            ProfileActivity.access$19500("video/x-vnd.on2.vp8", sb2);
            ProfileActivity.access$19500("video/x-vnd.on2.vp9", sb2);
            ProfileActivity.this.showDialog(anonymousClass15.new AnonymousClass1(ProfileActivity.this.getParentActivity(), sb2.toString()));
        } catch (Exception unused) {
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        int i2;
        String string;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        File assetFile;
        String strConcat;
        File file;
        Intent intent;
        FileOutputStream fileOutputStream;
        String strDecode = "";
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                if (articleViewer.parentActivity == null || articleViewer.pages[0].adapter.currentPage == null) {
                    return;
                }
                String strSubstring = (String) this.f$1;
                if (i != 0) {
                    if (i != 1 || strSubstring == null) {
                        return;
                    }
                    if (strSubstring.startsWith("mailto:")) {
                        strSubstring = strSubstring.substring(7);
                    } else if (strSubstring.startsWith("tel:")) {
                        strSubstring = strSubstring.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring);
                    return;
                }
                int iLastIndexOf = strSubstring.lastIndexOf(35);
                if (iLastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(articleViewer.pages[0].adapter.currentPage.cached_page.url) ? articleViewer.pages[0].adapter.currentPage.cached_page.url.toLowerCase() : articleViewer.pages[0].adapter.currentPage.url.toLowerCase();
                    try {
                        strDecode = URLDecoder.decode(strSubstring.substring(iLastIndexOf + 1), "UTF-8");
                        break;
                    } catch (Exception unused) {
                    }
                    if (strSubstring.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(strDecode)) {
                            articleViewer.scrollToAnchor(strDecode, true);
                            return;
                        }
                        LinearLayoutManager linearLayoutManager = articleViewer.pages[0].layoutManager;
                        ArticleViewer.Sheet sheet = articleViewer.sheet;
                        linearLayoutManager.scrollToPositionWithOffset(sheet == null ? 0 : 1, sheet != null ? AndroidUtilities.dp(32.0f) : 0, linearLayoutManager.mShouldReverseLayout);
                        articleViewer.checkScrollAnimated(null);
                        return;
                    }
                }
                Browser.openUrl(articleViewer.parentActivity, strSubstring);
                return;
            case 1:
                ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1 anonymousClass1 = (ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1) this.f$0;
                String strSubstring2 = (String) this.f$1;
                if (i == 0) {
                    Activity parentActivity = ChannelAdminLogActivity.this.getParentActivity();
                    if (parentActivity == null || strSubstring2 == null) {
                        return;
                    }
                    Browser.openUrl(parentActivity, Uri.parse(strSubstring2), true, true);
                    return;
                }
                anonymousClass1.getClass();
                if (i == 1) {
                    if (strSubstring2.startsWith("mailto:")) {
                        strSubstring2 = strSubstring2.substring(7);
                    } else if (strSubstring2.startsWith("tel:")) {
                        strSubstring2 = strSubstring2.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring2);
                    return;
                }
                return;
            case 2:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                String str = (String) this.f$1;
                AndroidUtilities.addToClipboard(str);
                BulletinFactory.of(chatActivity).createCopyBulletin(LocaleController.formatString(R.string.ExactTextCopied, str)).show();
                return;
            case 3:
                if (i == 0) {
                    i2 = 0;
                } else if (i == 1) {
                    i2 = 1;
                } else {
                    i2 = i == 2 ? 2 : 3;
                }
                ArrayList arrayList = (ArrayList) this.f$0;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i3)).longValue(), 0, i2);
                    }
                }
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$1;
                if (BulletinFactory.canShowBulletin(dialogsActivity)) {
                    BulletinFactory.createMuteBulletin(dialogsActivity, i2, 0, null).show();
                    return;
                }
                return;
            case 4:
                ((CropView) this.f$0).lambda$showAspectRatioDialog$3((Integer[][]) this.f$1, i);
                return;
            case 5:
                ShapeDetector shapeDetector = (ShapeDetector) this.f$0;
                ArrayList arrayList2 = shapeDetector.templates;
                if (i != 0) {
                    ShapeDetector.Template template = new ShapeDetector.Template();
                    template.shapeType = i - 1;
                    ArrayList arrayList3 = (ArrayList) this.f$1;
                    template.points = arrayList3;
                    arrayList2.add(template);
                    SharedPreferences sharedPreferences = shapeDetector.preferences;
                    String string2 = sharedPreferences.getString("moretemplates", null);
                    if (string2 == null) {
                        string = "" + template.shapeType;
                    } else {
                        StringBuilder sbM = Log.m(string2, "|");
                        sbM.append(template.shapeType);
                        string = sbM.toString();
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        StringBuilder sbM2 = Log.m(string, ",");
                        sbM2.append(Math.round(((ShapeDetector.Point) arrayList3.get(i4)).x));
                        sbM2.append(",");
                        sbM2.append(Math.round(((ShapeDetector.Point) arrayList3.get(i4)).y));
                        string = sbM2.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", string).apply();
                    return;
                }
                StringBuilder sb = new StringBuilder("[");
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    ShapeDetector.Template template2 = (ShapeDetector.Template) arrayList2.get(i5);
                    if (i5 > 0) {
                        sb.append(",\n");
                    }
                    sb.append("\t{\n\t\t\"shape\": ");
                    sb.append(template2.shapeType);
                    sb.append(",\n\t\t\"points\": [");
                    for (int i6 = 0; i6 < template2.points.size(); i6++) {
                        if (i6 > 0) {
                            sb.append(",");
                        }
                        ShapeDetector.Point point = (ShapeDetector.Point) template2.points.get(i6);
                        sb.append("[");
                        sb.append(Math.round(point.x));
                        sb.append(",");
                        sb.append(Math.round(point.y));
                        sb.append("]");
                    }
                    sb.append("],\n\t\t\"freq\": ");
                    sb.append(Math.round(((template2.score / shapeDetector.templatesUsageScore) * 100.0f) * 100.0f) / 100.0f);
                    sb.append("\n\t}");
                }
                sb.append("\n]");
                android.util.Log.i("shapedetector", sb.toString());
                return;
            case 6:
                PhonebookShareAlert phonebookShareAlert = (PhonebookShareAlert) this.f$0;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.f$1;
                phonebookShareAlert.getClass();
                if (i == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(phonebookShareAlert.parentFragment.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 7:
                SharedMediaLayout.AnonymousClass49 anonymousClass49 = (SharedMediaLayout.AnonymousClass49) this.f$0;
                String strSubstring3 = (String) this.f$1;
                if (i == 0) {
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    sharedMediaLayout.getClass();
                    boolean zShouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(strSubstring3);
                    BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                    if (zShouldShowUrlInAlert) {
                        AlertsCreator.showOpenUrlAlert(baseFragment, strSubstring3, true, true);
                        return;
                    } else {
                        Browser.openUrl(baseFragment.getParentActivity(), strSubstring3);
                        return;
                    }
                }
                anonymousClass49.getClass();
                if (i == 1) {
                    if (strSubstring3.startsWith("mailto:")) {
                        strSubstring3 = strSubstring3.substring(7);
                    } else if (strSubstring3.startsWith("tel:")) {
                        strSubstring3 = strSubstring3.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring3);
                    return;
                }
                return;
            case 8:
                FilteredSearchView.SharedLinksAdapter.AnonymousClass1 anonymousClass2 = (FilteredSearchView.SharedLinksAdapter.AnonymousClass1) this.f$0;
                String strSubstring4 = (String) this.f$1;
                if (i == 0) {
                    FilteredSearchView filteredSearchView = FilteredSearchView.this;
                    SpannableStringBuilder[] spannableStringBuilderArr = FilteredSearchView.arrowSpan;
                    filteredSearchView.getClass();
                    if (AndroidUtilities.shouldShowUrlInAlert(strSubstring4)) {
                        AlertsCreator.showOpenUrlAlert(filteredSearchView.parentFragment, strSubstring4, true, true);
                        return;
                    } else {
                        Browser.openUrl(filteredSearchView.parentActivity, strSubstring4);
                        return;
                    }
                }
                anonymousClass2.getClass();
                if (i == 1) {
                    if (strSubstring4.startsWith("mailto:")) {
                        strSubstring4 = strSubstring4.substring(7);
                    } else if (strSubstring4.startsWith("tel:")) {
                        strSubstring4 = strSubstring4.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring4);
                    return;
                }
                return;
            case 9:
                GroupCallActivity.AnonymousClass6 anonymousClass6 = (GroupCallActivity.AnonymousClass6) this.f$0;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) ((ArrayList) this.f$1).get(i);
                int iIntValue = num.intValue();
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.cacheAudioOutputValue = num;
                groupCallActivity.updateState(true, true);
                groupCallActivity.cacheAudioOutputValue = null;
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(anonymousClass6, iIntValue, 14));
                return;
            case 10:
                ArrayList arrayList4 = (ArrayList) this.f$1;
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                passportActivity.getClass();
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList4.get(i)).newInstance();
                        break;
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!PassportActivity.isPersonalDocument(tL_secureRequiredType.type)) {
                    if (PassportActivity.isAddressDocument(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    passportActivity.openTypeActivity(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                passportActivity.openTypeActivity(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 11:
                onClick$org$telegram$ui$ProfileActivity$15$$ExternalSyntheticLambda1(dialogInterface, i);
                return;
            case 12:
                SessionBottomSheet sessionBottomSheet = (SessionBottomSheet) this.f$0;
                String str2 = (String) this.f$1;
                sessionBottomSheet.getClass();
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str2));
                zzkn.m(R.string.TextCopied, new BulletinFactory(sessionBottomSheet.getContainer(), null));
                return;
            default:
                ThemeActivity.ListAdapter listAdapter = (ThemeActivity.ListAdapter) this.f$0;
                ThemeActivity themeActivity = ThemeActivity.this;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.f$1;
                if (i == 0) {
                    if (themeInfo.info == null) {
                        themeActivity.getMessagesController().saveThemeToServer(themeInfo, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, themeInfo, null);
                        return;
                    }
                    String str3 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + themeInfo.info.slug;
                    themeActivity.showDialog(new ShareAlert(themeActivity.getParentActivity(), str3, str3, null));
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        if (((BaseFragment) themeActivity).parentLayout != null) {
                            Theme.applyTheme(themeInfo, true, false);
                            ((ActionBarLayout) ((BaseFragment) themeActivity).parentLayout).rebuildAllFragmentViews(true, true);
                            new ThemeEditorView().show(themeActivity.getParentActivity(), themeInfo);
                            return;
                        }
                        return;
                    }
                    if (i == 3) {
                        themeActivity.presentFragment(new ThemeSetUrlActivity(themeInfo, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(themeActivity.getParentActivity(), 0, null);
                    String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string3;
                    alertDialog.message = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(29, listAdapter, themeInfo));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    themeActivity.showDialog(alertDialog);
                    TextView textView = (TextView) alertDialog.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        return;
                    }
                    return;
                }
                if (themeInfo.pathToFile == null && themeInfo.assetName == null) {
                    StringBuilder sb2 = new StringBuilder();
                    int[] iArr = Theme.defaultColors;
                    for (int i7 = 0; i7 < iArr.length; i7++) {
                        if (OKLCH.colorKeysMap == null) {
                            OKLCH.colorKeysMap = OKLCH.createColorKeysMap();
                        }
                        sb2.append((String) OKLCH.colorKeysMap.get(i7));
                        sb2.append("=");
                        sb2.append(iArr[i7]);
                        sb2.append("\n");
                    }
                    assetFile = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(assetFile);
                                try {
                                    fileOutputStream.write(AndroidUtilities.getStringBytes(sb2.toString()));
                                    fileOutputStream.close();
                                } catch (Exception e2) {
                                    e = e2;
                                    fileOutputStream2 = fileOutputStream;
                                    FileLog.e(e);
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    strConcat = themeInfo.name;
                                    if (!strConcat.endsWith(".attheme")) {
                                        strConcat = strConcat.concat(".attheme");
                                    }
                                    file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(strConcat));
                                    if (AndroidUtilities.copyFile(assetFile, file)) {
                                        intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/xml");
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            try {
                                                intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(themeActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                                                intent.setFlags(1);
                                            } catch (Exception unused4) {
                                                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                            }
                                            break;
                                        } else {
                                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                        }
                                        themeActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (fileOutputStream == null) {
                                        throw th2;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th2;
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                        throw th2;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                        }
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                } else {
                    String str4 = themeInfo.assetName;
                    assetFile = str4 != null ? Theme.getAssetFile(str4) : new File(themeInfo.pathToFile);
                }
                strConcat = themeInfo.name;
                if (!strConcat.endsWith(".attheme")) {
                    strConcat = strConcat.concat(".attheme");
                }
                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(strConcat));
                try {
                    if (AndroidUtilities.copyFile(assetFile, file)) {
                        return;
                    }
                    intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(themeActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                        intent.setFlags(1);
                        break;
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    themeActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
