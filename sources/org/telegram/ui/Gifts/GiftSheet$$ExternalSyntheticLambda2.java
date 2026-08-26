package org.telegram.ui.Gifts;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.common.base.Splitter;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.ImmutableByteArrayOutputStream;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public final class GiftSheet$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;

    public GiftSheet$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    private final void run$org$telegram$ui$Stories$StoriesController$StoriesList$$ExternalSyntheticLambda4() {
    }

    @Override
    public final void run() throws Throwable {
        Theme.ThemeInfo themeInfo;
        ArrayList arrayList;
        PaintTypeface.FontData fontData;
        PaintTypeface.FontData fontData2;
        ?? randomAccessFile;
        ?? r3;
        PaintTypeface.FontData fontData3;
        PaintTypeface.FontData fontData4;
        PaintTypeface.FontData fontData5;
        PaintTypeface.Family family;
        int i = 4;
        PaintTypeface.FontData fontData6 = null;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                lastFragment.showAsSheet(new PremiumPreviewFragment("gifts"), bottomSheetParams);
                return;
            case 1:
                int i4 = AlarmManagerSchedulerBroadcastReceiver.$r8$clinit;
                return;
            case 2:
                Splitter splitter = BitmapsCache.sharedTools;
                if (splitter != null) {
                    final ArrayList arrayList2 = null;
                    while (i2 < BitmapsCache.N) {
                        if (((Bitmap[]) splitter.strategy)[i2] != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(((Bitmap[]) splitter.strategy)[i2]);
                        }
                        ((Bitmap[]) splitter.strategy)[i2] = null;
                        ((ImmutableByteArrayOutputStream[]) splitter.trimmer)[i2] = null;
                        i2++;
                    }
                    if (!arrayList2.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        PaintTypeface.typefaces = arrayList2;
                                        PaintTypeface.loadingTypefaces = false;
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                                        break;
                                    default:
                                        ArrayList arrayList3 = arrayList2;
                                        int size = arrayList3.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj = arrayList3.get(i5);
                                            i5++;
                                            ((Bitmap) obj).recycle();
                                        }
                                        break;
                                }
                            }
                        });
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
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.instance.drawerLayoutContainer.getRootView(), new HistoryFragment$1$$ExternalSyntheticLambda0(i));
                return;
            case 6:
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
                    AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0(themeInfo, 15), 200L);
                    return;
                }
                str2 = string2;
                str = string;
                if (Theme.currentTheme.isDark()) {
                    themeInfo = (Theme.ThemeInfo) map.get(str2);
                } else {
                    themeInfo = (Theme.ThemeInfo) map.get(str);
                }
                AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0(themeInfo, 15), 200L);
                return;
            case 7:
                final ArrayList arrayList3 = new ArrayList(PaintTypeface.BUILT_IN_FONTS);
                if (Build.VERSION.SDK_INT >= 29) {
                    Iterator it = SystemFonts.getAvailableFonts().iterator();
                    HashMap map2 = new HashMap();
                    while (it.hasNext()) {
                        Font fontM = BaseChartView$$ExternalSyntheticApiModelOutline0.m(it.next());
                        if (!fontM.getFile().getName().contains("Noto")) {
                            File file = fontM.getFile();
                            if (file == null) {
                                fontData3 = fontData6;
                            } else {
                                try {
                                    randomAccessFile = new RandomAccessFile(file, "r");
                                    try {
                                        try {
                                            int i5 = randomAccessFile.readInt();
                                            if (i5 == 65536 || i5 == 1330926671) {
                                                int unsignedShort = randomAccessFile.readUnsignedShort();
                                                randomAccessFile.skipBytes(6);
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 < unsignedShort) {
                                                        int i7 = randomAccessFile.readInt();
                                                        randomAccessFile.skipBytes(4);
                                                        int i8 = randomAccessFile.readInt();
                                                        randomAccessFile.readInt();
                                                        if (i7 == 1851878757) {
                                                            randomAccessFile.seek(i8 + 2);
                                                            int unsignedShort2 = randomAccessFile.readUnsignedShort();
                                                            int unsignedShort3 = randomAccessFile.readUnsignedShort();
                                                            HashMap map3 = new HashMap();
                                                            int i9 = 0;
                                                            while (i9 < unsignedShort2) {
                                                                try {
                                                                    PaintTypeface.NameRecord nameRecord = new PaintTypeface.NameRecord(randomAccessFile);
                                                                    fontData2 = fontData6;
                                                                    try {
                                                                        map3.put(Integer.valueOf(nameRecord.nameID), nameRecord);
                                                                        i9++;
                                                                        fontData6 = fontData2;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    fontData2 = fontData6;
                                                                }
                                                            }
                                                            PaintTypeface.FontData fontData7 = fontData6;
                                                            PaintTypeface.FontData fontData8 = new PaintTypeface.FontData();
                                                            fontData8.font = fontM;
                                                            int i10 = i8 + unsignedShort3;
                                                            ?? r0 = (PaintTypeface.NameRecord) map3.get(1);
                                                            fontData8.family = r0 == 0 ? fontData7 : r0.read(randomAccessFile, i10);
                                                            ?? r1 = (PaintTypeface.NameRecord) map3.get(2);
                                                            fontData8.subfamily = r1 == 0 ? fontData7 : r1.read(randomAccessFile, i10);
                                                            try {
                                                                randomAccessFile.close();
                                                                fontData5 = fontData8;
                                                                fontData4 = fontData7;
                                                            } catch (Exception unused) {
                                                                fontData5 = fontData8;
                                                                fontData4 = fontData7;
                                                            }
                                                        } else {
                                                            i6++;
                                                        }
                                                        try {
                                                            FileLog.e(e);
                                                            fontData3 = fontData2;
                                                            if (randomAccessFile != 0) {
                                                                try {
                                                                    randomAccessFile.close();
                                                                    fontData3 = fontData2;
                                                                } catch (Exception unused2) {
                                                                    fontData3 = fontData2;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            r3 = randomAccessFile;
                                                            randomAccessFile = r3;
                                                            if (randomAccessFile != 0) {
                                                                try {
                                                                    randomAccessFile.close();
                                                                    break;
                                                                } catch (Exception unused3) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        fontData3 = fontData6;
                                                        randomAccessFile.close();
                                                    }
                                                }
                                            } else {
                                                try {
                                                    randomAccessFile.close();
                                                    break;
                                                } catch (Exception unused4) {
                                                }
                                                PaintTypeface.FontData fontData9 = fontData6;
                                                fontData4 = fontData9;
                                                fontData5 = fontData9;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (randomAccessFile != 0) {
                                                randomAccessFile.close();
                                                break;
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        fontData2 = fontData6;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    fontData2 = fontData6;
                                    randomAccessFile = fontData2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r3 = fontData6;
                                    randomAccessFile = r3;
                                    if (randomAccessFile != 0) {
                                        randomAccessFile.close();
                                        break;
                                    }
                                    throw th;
                                }
                                if (fontData5 != null) {
                                    family = (PaintTypeface.Family) map2.get(fontData5.family);
                                    if (family == null) {
                                        family = new PaintTypeface.Family();
                                        map2.put(fontData5.family, family);
                                    }
                                    family.fonts.add(fontData5);
                                }
                                fontData6 = fontData4;
                            }
                            fontData5 = fontData3;
                            fontData4 = fontData3;
                            if (fontData5 != null) {
                                family = (PaintTypeface.Family) map2.get(fontData5.family);
                                if (family == null) {
                                    family = new PaintTypeface.Family();
                                    map2.put(fontData5.family, family);
                                }
                                family.fonts.add(fontData5);
                            }
                            fontData6 = fontData4;
                            break;
                        }
                    }
                    PaintTypeface.FontData fontData10 = fontData6;
                    Iterator it2 = PaintTypeface.preferable.iterator();
                    while (it2.hasNext()) {
                        PaintTypeface.Family family2 = (PaintTypeface.Family) map2.get((String) it2.next());
                        if (family2 != null) {
                            int i11 = 0;
                            while (true) {
                                arrayList = family2.fonts;
                                if (i11 >= arrayList.size()) {
                                    fontData = fontData10;
                                } else if ("Bold".equalsIgnoreCase(((PaintTypeface.FontData) arrayList.get(i11)).subfamily)) {
                                    fontData = (PaintTypeface.FontData) arrayList.get(i11);
                                } else {
                                    i11++;
                                }
                            }
                            if (fontData == null) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= arrayList.size()) {
                                        fontData = fontData10;
                                    } else if ("Regular".equalsIgnoreCase(((PaintTypeface.FontData) arrayList.get(i12)).subfamily)) {
                                        fontData = (PaintTypeface.FontData) arrayList.get(i12);
                                    } else {
                                        i12++;
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                PaintTypeface.typefaces = arrayList3;
                                PaintTypeface.loadingTypefaces = false;
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                                break;
                            default:
                                ArrayList arrayList4 = arrayList3;
                                int size = arrayList4.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList4.get(i13);
                                    i13++;
                                    ((Bitmap) obj).recycle();
                                }
                                break;
                        }
                    }
                });
                return;
            case 8:
                LPhotoPaintView.lambda$onSwitchSegmentedAnimation$50();
                return;
            case 9:
                LPhotoPaintView.lambda$shutdown$25();
                return;
            case 10:
                MaskPaintView.lambda$shutdown$0();
                return;
            case 11:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                return;
            case 12:
                float[] fArr = VideoScreenPreview.speedScaleVideoTimestamps;
                return;
            case 13:
                UserSelectorBottomSheet.open(0, null);
                return;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 15:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 16:
                VoIPPiPView.finish();
                return;
            case 17:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            case 18:
                StarsController[][] starsControllerArr = StarsController.Instance;
                return;
            case 19:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                safeLastFragment.presentFragment(new StarsIntroActivity());
                return;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 21:
                LiveStoryPipOverlay.instance.dismissInternal(true);
                return;
            case 22:
                int i13 = StealthModeAlert.$r8$clinit;
                return;
            case 23:
                Comparator comparator = StoriesController.storiesComparator;
                return;
            case 24:
                return;
            case 25:
                int i14 = CollageLayoutView2.$r8$clinit;
                return;
            case 26:
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                    return;
                }
                return;
            case 27:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                return;
            case 28:
                HashSet hashSet = BotWebViewSheet.activeSheets;
                return;
            default:
                int i15 = CommunityPendingRequestCell.$r8$clinit;
                return;
        }
    }
}
