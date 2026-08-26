package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.common.base.Splitter;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.ImmutableByteArrayOutputStream;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda142;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.HintView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;

public final class ChatActivity$$ExternalSyntheticLambda470 implements Runnable {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda470(int i) {
        this.$r8$classId = i;
    }

    private final void run$org$telegram$ui$ChatActivity$ChatActivityAdapter$$ExternalSyntheticLambda0() {
    }

    private final void run$org$telegram$ui$Components$ChatAttachAlert$1$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run() throws Throwable {
        Theme.ThemeInfo themeInfo;
        ArrayList arrayList;
        PaintTypeface.FontData fontData;
        RandomAccessFile randomAccessFile;
        PaintTypeface.FontData fontData2;
        RandomAccessFile randomAccessFile2;
        PaintTypeface.FontData fontData3;
        PaintTypeface.Family family;
        int i = 6;
        int i2 = 2;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                int i4 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                return;
            case 1:
                int i5 = AlarmManagerSchedulerBroadcastReceiver.$r8$clinit;
                return;
            case 2:
                Splitter splitter = BitmapsCache.sharedTools;
                if (splitter != null) {
                    ArrayList arrayList2 = null;
                    for (int i6 = 0; i6 < BitmapsCache.N; i6++) {
                        if (((Bitmap[]) splitter.strategy)[i6] != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(((Bitmap[]) splitter.strategy)[i6]);
                        }
                        ((Bitmap[]) splitter.strategy)[i6] = null;
                        ((ImmutableByteArrayOutputStream[]) splitter.trimmer)[i6] = null;
                    }
                    if (!arrayList2.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new AlertsCreator$$ExternalSyntheticLambda142(arrayList2, i3));
                    }
                    BitmapsCache.sharedTools = null;
                    return;
                }
                return;
            case 3:
                Theme.checkAutoNightThemeConditions(false);
                return;
            case 4:
                QuickRepliesController[] quickRepliesControllerArr = QuickRepliesController.Instance;
                return;
            case 5:
                return;
            case 6:
                ReactionsEffectOverlay.removeCurrent(true);
                return;
            case 7:
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i7 = NotificationCenter.didSetNewTheme;
                Boolean bool = Boolean.TRUE;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i7, Boolean.FALSE, bool, bool);
                return;
            case 8:
                Pattern pattern = AlertsCreator.URL_PATTERN;
                return;
            case 9:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                safeLastFragment.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), bottomSheetParams);
                return;
            case 10:
                AndroidUtilities.cancelRunOnUIThread(AnimatedEmojiDrawable.cleanup);
                try {
                    if (AnimatedEmojiDrawable.globalEmojiCache != null) {
                        for (int i8 = 0; i8 < AnimatedEmojiDrawable.globalEmojiCache.size(); i8++) {
                            LongSparseArray longSparseArray = (LongSparseArray) AnimatedEmojiDrawable.globalEmojiCache.valueAt(i8);
                            int i9 = 0;
                            while (i9 < longSparseArray.size()) {
                                if (!((AnimatedEmojiDrawable) longSparseArray.valueAt(i9)).attached) {
                                    longSparseArray.removeAt(i9);
                                    i9--;
                                }
                                i9++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.e(e);
                        return;
                    }
                    return;
                }
            case 11:
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.instance;
                return;
            case 12:
                SavedMessagesController.openSavedMessages();
                return;
            case 13:
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null || launchActivity.isFinishing()) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.setFlags(268468224);
                LaunchActivity.instance.startActivity(intent);
                return;
            case 14:
                SavedMessagesController.openSavedMessagesReminders();
                return;
            case 15:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 16:
                MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                return;
            case 17:
                return;
            case 18:
                int i10 = ChatAttachAlertPollLayout.$r8$clinit;
                return;
            case 19:
                PhotoViewer.getInstance().closePhoto(false, false);
                return;
            case 20:
                PhotoViewer.getInstance().closePhoto(false, false);
                return;
            case 21:
                EditTextCaption.lambda$makeSelectedDate$1();
                return;
            case 22:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.instance.drawerLayoutContainer.getRootView(), new ChatActivity$$ExternalSyntheticLambda151(6));
                return;
            case 23:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                HashMap map = Theme.themesDict;
                if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
                    string2 = "Dark Blue";
                }
                Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
                if (string.equals(string2)) {
                    if (themeInfo2.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                    }
                    if (Theme.currentTheme.isDark()) {
                        themeInfo = (Theme.ThemeInfo) map.get(str);
                    } else {
                        themeInfo = (Theme.ThemeInfo) map.get(str2);
                    }
                    AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(themeInfo, 11), 200L);
                    return;
                }
                str2 = string2;
                str = string;
                if (Theme.currentTheme.isDark()) {
                    themeInfo = (Theme.ThemeInfo) map.get(str2);
                } else {
                    themeInfo = (Theme.ThemeInfo) map.get(str);
                }
                AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(themeInfo, 11), 200L);
                return;
            case 24:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 25:
                if (VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute()) {
                    return;
                }
                VoIPService.getSharedInstance().setMicMute(false, true, false);
                return;
            case 26:
                ArrayList arrayList3 = new ArrayList(PaintTypeface.BUILT_IN_FONTS);
                if (Build.VERSION.SDK_INT >= 29) {
                    Iterator it = SystemFonts.getAvailableFonts().iterator();
                    HashMap map2 = new HashMap();
                    while (it.hasNext()) {
                        Font fontM = EmojiView$$ExternalSyntheticApiModelOutline0.m(it.next());
                        if (!fontM.getFile().getName().contains("Noto")) {
                            File file = fontM.getFile();
                            if (file == null) {
                                fontData2 = null;
                            } else {
                                try {
                                    randomAccessFile2 = new RandomAccessFile(file, "r");
                                    try {
                                        try {
                                            int i11 = randomAccessFile2.readInt();
                                            if (i11 == 65536 || i11 == 1330926671) {
                                                int unsignedShort = randomAccessFile2.readUnsignedShort();
                                                randomAccessFile2.skipBytes(i);
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 < unsignedShort) {
                                                        int i13 = randomAccessFile2.readInt();
                                                        randomAccessFile2.skipBytes(4);
                                                        int i14 = randomAccessFile2.readInt();
                                                        randomAccessFile2.readInt();
                                                        if (i13 == 1851878757) {
                                                            randomAccessFile2.seek(i14 + 2);
                                                            int unsignedShort2 = randomAccessFile2.readUnsignedShort();
                                                            int unsignedShort3 = randomAccessFile2.readUnsignedShort();
                                                            HashMap map3 = new HashMap();
                                                            for (int i15 = 0; i15 < unsignedShort2; i15++) {
                                                                fontData2 = null;
                                                                try {
                                                                    PaintTypeface.NameRecord nameRecord = new PaintTypeface.NameRecord(randomAccessFile2);
                                                                    map3.put(Integer.valueOf(nameRecord.nameID), nameRecord);
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                }
                                                            }
                                                            fontData3 = new PaintTypeface.FontData();
                                                            fontData3.font = fontM;
                                                            int i16 = i14 + unsignedShort3;
                                                            PaintTypeface.NameRecord nameRecord2 = (PaintTypeface.NameRecord) map3.get(1);
                                                            fontData3.family = nameRecord2 == null ? null : nameRecord2.read(randomAccessFile2, i16);
                                                            PaintTypeface.NameRecord nameRecord3 = (PaintTypeface.NameRecord) map3.get(2);
                                                            fontData3.subfamily = nameRecord3 == null ? null : nameRecord3.read(randomAccessFile2, i16);
                                                            try {
                                                                randomAccessFile2.close();
                                                                break;
                                                            } catch (Exception unused) {
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                        try {
                                                            FileLog.e(e);
                                                            if (randomAccessFile2 != null) {
                                                                try {
                                                                    randomAccessFile2.close();
                                                                    break;
                                                                } catch (Exception unused2) {
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            randomAccessFile = randomAccessFile2;
                                                            randomAccessFile2 = randomAccessFile;
                                                            if (randomAccessFile2 != null) {
                                                                try {
                                                                    randomAccessFile2.close();
                                                                    break;
                                                                } catch (Exception unused3) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        fontData2 = null;
                                                        randomAccessFile2.close();
                                                    }
                                                }
                                            } else {
                                                try {
                                                    randomAccessFile2.close();
                                                    break;
                                                } catch (Exception unused4) {
                                                }
                                                fontData3 = null;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            fontData2 = null;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (randomAccessFile2 != null) {
                                            randomAccessFile2.close();
                                            break;
                                        }
                                        throw th;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    fontData2 = null;
                                    randomAccessFile2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    randomAccessFile = null;
                                    randomAccessFile2 = randomAccessFile;
                                    if (randomAccessFile2 != null) {
                                        randomAccessFile2.close();
                                        break;
                                    }
                                    throw th;
                                }
                                if (fontData3 != null) {
                                    family = (PaintTypeface.Family) map2.get(fontData3.family);
                                    if (family == null) {
                                        family = new PaintTypeface.Family();
                                        map2.put(fontData3.family, family);
                                    }
                                    family.fonts.add(fontData3);
                                }
                                i = 6;
                            }
                            fontData3 = fontData2;
                            if (fontData3 != null) {
                                family = (PaintTypeface.Family) map2.get(fontData3.family);
                                if (family == null) {
                                    family = new PaintTypeface.Family();
                                    map2.put(fontData3.family, family);
                                }
                                family.fonts.add(fontData3);
                            }
                            i = 6;
                        }
                    }
                    Iterator it2 = PaintTypeface.preferable.iterator();
                    while (it2.hasNext()) {
                        PaintTypeface.Family family2 = (PaintTypeface.Family) map2.get((String) it2.next());
                        if (family2 != null) {
                            int i17 = 0;
                            while (true) {
                                arrayList = family2.fonts;
                                if (i17 >= arrayList.size()) {
                                    fontData = null;
                                } else if ("Bold".equalsIgnoreCase(((PaintTypeface.FontData) arrayList.get(i17)).subfamily)) {
                                    fontData = (PaintTypeface.FontData) arrayList.get(i17);
                                } else {
                                    i17++;
                                }
                            }
                            if (fontData == null) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList.size()) {
                                        fontData = null;
                                    } else if ("Regular".equalsIgnoreCase(((PaintTypeface.FontData) arrayList.get(i18)).subfamily)) {
                                        fontData = (PaintTypeface.FontData) arrayList.get(i18);
                                    } else {
                                        i18++;
                                    }
                                }
                                if (fontData == null && !arrayList.isEmpty()) {
                                    fontData = (PaintTypeface.FontData) arrayList.get(0);
                                }
                            }
                            if (fontData != null) {
                                arrayList3.add(new PaintTypeface(fontData.font, ("Regular".equals(fontData.subfamily) || TextUtils.isEmpty(fontData.subfamily)) ? fontData.family : fontData.family + " " + fontData.subfamily));
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda142(arrayList3, i2));
                return;
            case 27:
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                    return;
                }
                return;
            case 28:
                Looper looperMyLooper2 = Looper.myLooper();
                if (looperMyLooper2 != null) {
                    looperMyLooper2.quit();
                    return;
                }
                return;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                return;
        }
    }
}
