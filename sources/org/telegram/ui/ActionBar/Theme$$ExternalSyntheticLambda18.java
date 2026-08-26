package org.telegram.ui.ActionBar;

import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

public final class Theme$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final TLObject f$1;

    public Theme$$ExternalSyntheticLambda18(int i, TLObject tLObject) {
        this.$r8$classId = 0;
        this.f$0 = i;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        int i;
        boolean z;
        Theme.ThemeInfo themeInfo;
        int i2;
        int i3;
        String baseThemeKey;
        Theme.ThemeInfo themeInfo2;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj = null;
        int i4 = this.f$0;
        TLObject tLObject = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                Theme.loadingRemoteThemes[i4] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject;
                    Theme.remoteThemesHash[i4] = tL_themes.hash;
                    Theme.lastLoadingThemesTime[i4] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = Theme.themes;
                    int size = arrayList3.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) arrayList3.get(i5);
                        if (themeInfo3.info == null || themeInfo3.account != i4) {
                            if (themeInfo3.themeAccents != null) {
                                for (int i6 = 0; i6 < themeInfo3.themeAccents.size(); i6++) {
                                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) themeInfo3.themeAccents.get(i6);
                                    if (themeAccent.info != null && themeAccent.account == i4) {
                                        arrayList2.add(themeAccent);
                                    }
                                }
                            }
                        } else {
                            arrayList2.add(themeInfo3);
                        }
                    }
                    int size2 = tL_themes.themes.size();
                    int i7 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (true) {
                        ArrayList arrayList4 = Theme.otherThemes;
                        HashMap map = Theme.themesDict;
                        if (i7 >= size2) {
                            Object obj2 = obj;
                            int i8 = 0;
                            for (int size3 = arrayList2.size(); i8 < size3; size3 = size3) {
                                Object obj3 = arrayList2.get(i8);
                                if (obj3 instanceof Theme.ThemeInfo) {
                                    Theme.ThemeInfo themeInfo4 = (Theme.ThemeInfo) obj3;
                                    NotificationCenter.getInstance(themeInfo4.account).removeObserver(themeInfo4, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(themeInfo4.account).removeObserver(themeInfo4, NotificationCenter.fileLoadFailed);
                                    arrayList4.remove(themeInfo4);
                                    map.remove(themeInfo4.name);
                                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = themeInfo4.overrideWallpaper;
                                    if (overrideWallpaperInfo != null) {
                                        Theme.OverrideWallpaperInfo.access$1300(overrideWallpaperInfo);
                                    }
                                    arrayList3.remove(themeInfo4);
                                    new File(themeInfo4.pathToFile).delete();
                                    if (Theme.currentDayTheme == themeInfo4) {
                                        Theme.currentDayTheme = Theme.defaultTheme;
                                    } else {
                                        if (Theme.currentNightTheme == themeInfo4) {
                                            Theme.currentNightTheme = (Theme.ThemeInfo) map.get("Dark Blue");
                                            z = true;
                                        }
                                        if (Theme.currentTheme == themeInfo4) {
                                            if (z) {
                                                themeInfo = Theme.currentNightTheme;
                                            } else {
                                                themeInfo = Theme.currentDayTheme;
                                            }
                                            Theme.applyTheme(themeInfo, true, z);
                                        }
                                    }
                                    z = false;
                                    if (Theme.currentTheme == themeInfo4) {
                                        if (z) {
                                            themeInfo = Theme.currentNightTheme;
                                        } else {
                                            themeInfo = Theme.currentDayTheme;
                                        }
                                        Theme.applyTheme(themeInfo, true, z);
                                    }
                                } else {
                                    if (obj3 instanceof Theme.ThemeAccent) {
                                        Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) obj3;
                                        if (Theme.deleteThemeAccent(themeAccent2.parentTheme, themeAccent2, false) && Theme.currentTheme == themeAccent2.parentTheme) {
                                            Theme.refreshThemeColors(false, false);
                                            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                            int i9 = NotificationCenter.needSetDayNightTheme;
                                            Theme.ThemeInfo themeInfo5 = Theme.currentTheme;
                                            boolean z4 = Theme.currentNightTheme == themeInfo5;
                                            i = 1;
                                            globalInstance.lambda$postNotificationNameOnUIThread$1(i9, themeInfo5, Boolean.valueOf(z4), obj2, -1);
                                        }
                                    }
                                    i8 += i;
                                }
                                i = 1;
                                i8 += i;
                            }
                            Theme.saveOtherThemes(true, false);
                            Collections.sort(Theme.themes, new Theme$$ExternalSyntheticLambda5(0));
                            if (z3) {
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                            }
                            if (z2) {
                                Theme.PatternsLoader.createLoader(true);
                            }
                            MediaDataController.getInstance(i4).generateEmojiPreviewThemes(arrayList, i4);
                        } else {
                            Object obj4 = obj;
                            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i7);
                            if (tL_theme != null) {
                                if (tL_theme.isDefault) {
                                    arrayList.add(tL_theme);
                                }
                                ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                                if (arrayList5 == null || arrayList5.size() <= 0) {
                                    i2 = size2;
                                    i3 = i7;
                                    String str = "remote" + tL_theme.id;
                                    Theme.ThemeInfo themeInfo6 = (Theme.ThemeInfo) map.get(str);
                                    if (themeInfo6 == null) {
                                        themeInfo6 = new Theme.ThemeInfo();
                                        themeInfo6.account = i4;
                                        themeInfo6.pathToFile = new File(ApplicationLoader.getFilesDirFixed(), zzhr.m(str, ".attheme")).getAbsolutePath();
                                        arrayList3.add(themeInfo6);
                                        arrayList4.add(themeInfo6);
                                        z3 = true;
                                    } else {
                                        arrayList2.remove(themeInfo6);
                                    }
                                    themeInfo6.name = tL_theme.title;
                                    themeInfo6.info = tL_theme;
                                    map.put(themeInfo6.getKey(), themeInfo6);
                                } else {
                                    int i10 = 0;
                                    while (i10 < tL_theme.settings.size()) {
                                        TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i10);
                                        if (themeSettings == null || (baseThemeKey = Theme.getBaseThemeKey(themeSettings)) == null || (themeInfo2 = (Theme.ThemeInfo) map.get(baseThemeKey)) == null || themeInfo2.themeAccents == null) {
                                            i7 = i7;
                                        } else {
                                            Theme.ThemeAccent themeAccentCreateNewAccent = (Theme.ThemeAccent) themeInfo2.accentsByThemeId.get(tL_theme.id);
                                            if (themeAccentCreateNewAccent != null) {
                                                if (Theme.ThemeInfo.accentEquals(themeAccentCreateNewAccent, themeSettings)) {
                                                    i7 = i7;
                                                } else {
                                                    File pathToWallpaper = themeAccentCreateNewAccent.getPathToWallpaper();
                                                    if (pathToWallpaper != null) {
                                                        pathToWallpaper.delete();
                                                    }
                                                    Theme.ThemeInfo.fillAccentValues(themeAccentCreateNewAccent, themeSettings);
                                                    Theme.ThemeInfo themeInfo7 = Theme.currentTheme;
                                                    if (themeInfo7 == themeInfo2 && themeInfo7.currentAccentId == themeAccentCreateNewAccent.id) {
                                                        Theme.refreshThemeColors(false, false);
                                                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                                        int i11 = NotificationCenter.needSetDayNightTheme;
                                                        Theme.ThemeInfo themeInfo8 = Theme.currentTheme;
                                                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i11, themeInfo8, Boolean.valueOf(Theme.currentNightTheme == themeInfo8), obj4, -1);
                                                    }
                                                    z2 = true;
                                                    z3 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                themeAccentCreateNewAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList2.remove(themeAccentCreateNewAccent);
                                            } else {
                                                i7 = i7;
                                                themeAccentCreateNewAccent = themeInfo2.createNewAccent(tL_theme, i4, i10);
                                                if (!TextUtils.isEmpty(themeAccentCreateNewAccent.patternSlug)) {
                                                    z2 = true;
                                                }
                                            }
                                            themeAccentCreateNewAccent.isDefault = tL_theme.isDefault;
                                        }
                                        i10++;
                                        size2 = size2;
                                        i7 = i7;
                                    }
                                    i2 = size2;
                                    i3 = i7;
                                }
                            } else {
                                i2 = size2;
                                i3 = i7;
                            }
                            i7 = i3 + 1;
                            obj = obj4;
                            size2 = i2;
                        }
                    }
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i4).loadAttachMenuBots(false, true, null);
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i4).loadAttachMenuBots(false, true, null);
                }
                break;
        }
    }

    public Theme$$ExternalSyntheticLambda18(int i, TLObject tLObject, int i2) {
        this.$r8$classId = i2;
        this.f$1 = tLObject;
        this.f$0 = i;
    }
}
