package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.RendererCapabilities;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.theme.ITheme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda22;

public final class EmojiThemes {
    public static final int[] previewColorKeys = {Theme.key_chat_inBubble, Theme.key_chat_outBubble, Theme.key_featuredStickers_addButton, Theme.key_chat_wallpaper, Theme.key_chat_wallpaper_gradient_to1, Theme.key_chat_wallpaper_gradient_to2, Theme.key_chat_wallpaper_gradient_to3, Theme.key_chat_wallpaper_gradient_rotation};
    public TLRPC.ChatTheme chatTheme;
    public final int currentAccount;
    public String emoji;
    public final ArrayList items;
    public ThemeKey key;
    public boolean showAsDefaultStub;
    public boolean showAsRemovedStub;

    public final class ThemeItem implements ITheme {
        public int accentId = -1;
        public SparseIntArray currentPreviewColors;
        public int inBubbleColor;
        public int outBubbleColor;
        public int outLineColor;
        public int patternBgColor;
        public int patternBgGradientColor1;
        public int patternBgGradientColor2;
        public int patternBgGradientColor3;
        public int patternBgRotation;
        public int settingsIndex;
        public Theme.ThemeInfo themeInfo;
        public TLRPC.TL_chatThemeUniqueGift tlChatThemeGift;
        public TLRPC.TL_theme tlTheme;
        public String wallpaperLink;

        public final long getThemeId() {
            TLRPC.TL_theme tL_theme = this.tlTheme;
            if (tL_theme != null) {
                return tL_theme.id;
            }
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.tlChatThemeGift;
            if (tL_chatThemeUniqueGift != null) {
                return tL_chatThemeUniqueGift.gift.gift_id;
            }
            return 0L;
        }

        public final TLRPC.ThemeSettings getThemeSettings(int i) {
            ArrayList<TLRPC.ThemeSettings> arrayList;
            TLRPC.TL_theme tL_theme = this.tlTheme;
            if (tL_theme == null) {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.tlChatThemeGift;
                if (tL_chatThemeUniqueGift != null) {
                    arrayList = tL_chatThemeUniqueGift.theme_settings;
                }
                return null;
            }
            arrayList = tL_theme.settings;
            if (arrayList != null && i >= 0 && arrayList.size() > i) {
                return arrayList.get(i);
            }
            return null;
        }
    }

    public EmojiThemes(int i) {
        this.items = new ArrayList();
        this.currentAccount = i;
    }

    public static EmojiThemes createChatThemesRemoved(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "❌";
        emojiThemes.key = new ThemeKey("❌", null);
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
        emojiThemes.showAsRemovedStub = true;
        ThemeItem themeItem = new ThemeItem();
        themeItem.themeInfo = getDefaultThemeInfo(true);
        ArrayList arrayList = emojiThemes.items;
        arrayList.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = getDefaultThemeInfo(false);
        arrayList.add(themeItem2);
        return emojiThemes;
    }

    public static EmojiThemes createHomePreviewTheme(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "🏠";
        emojiThemes.key = new ThemeKey("🏠", null);
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("🏠");
        ThemeItem themeItem = new ThemeItem();
        HashMap map = Theme.themesDict;
        themeItem.themeInfo = (Theme.ThemeInfo) map.get("Blue");
        themeItem.accentId = 99;
        ArrayList arrayList = emojiThemes.items;
        arrayList.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = (Theme.ThemeInfo) map.get("Day");
        themeItem2.accentId = 9;
        arrayList.add(themeItem2);
        ThemeItem themeItem3 = new ThemeItem();
        themeItem3.themeInfo = (Theme.ThemeInfo) map.get("Night");
        themeItem3.accentId = 0;
        arrayList.add(themeItem3);
        ThemeItem themeItem4 = new ThemeItem();
        themeItem4.themeInfo = (Theme.ThemeInfo) map.get("Dark Blue");
        themeItem4.accentId = 0;
        arrayList.add(themeItem4);
        return emojiThemes;
    }

    public static Theme.ThemeInfo getDefaultThemeInfo(boolean z) {
        Theme.ThemeInfo themeInfo;
        if (z) {
            themeInfo = Theme.currentNightTheme;
        } else {
            themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
        }
        if (z != themeInfo.isDark()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String string = z ? sharedPreferences.getString("lastDarkTheme", "Dark Blue") : sharedPreferences.getString("lastDayTheme", "Blue");
            HashMap map = Theme.themesDict;
            themeInfo = (Theme.ThemeInfo) map.get(string);
            if (themeInfo == null) {
                themeInfo = (Theme.ThemeInfo) map.get(z ? "Dark Blue" : "Blue");
            }
        }
        return new Theme.ThemeInfo(themeInfo);
    }

    public static int getOrDefault(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null) {
            return Theme.getDefaultColor(i);
        }
        try {
            int iIndexOfKey = sparseIntArray.indexOfKey(i);
            if (iIndexOfKey >= 0) {
                return sparseIntArray.valueAt(iIndexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return Theme.getDefaultColor(i);
    }

    public static void saveCustomTheme(Theme.ThemeInfo themeInfo, int i) {
        SparseArray sparseArray;
        Theme.ThemeAccent themeAccent;
        if (themeInfo == null) {
            return;
        }
        if (i < 0 || (sparseArray = themeInfo.themeAccentsMap) == null || !((themeAccent = (Theme.ThemeAccent) sparseArray.get(i)) == null || themeAccent.isDefault)) {
            if (themeInfo.getKey().equals("Blue") && i == 99) {
                return;
            }
            if (themeInfo.getKey().equals("Day") && i == 9) {
                return;
            }
            if (themeInfo.getKey().equals("Night") && i == 0) {
                return;
            }
            if (themeInfo.getKey().equals("Dark Blue") && i == 0) {
                return;
            }
            boolean zIsDark = themeInfo.isDark();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(zIsDark ? "lastDarkCustomTheme" : "lastDayCustomTheme", themeInfo.getKey()).putInt(zIsDark ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i).apply();
        }
    }

    public final SparseIntArray createColors(int i, int i2) {
        Theme.ThemeAccent themeAccentCreateNewAccent;
        SparseIntArray themeFileValues;
        int iIndexOfKey;
        Theme.ThemeInfo themeInfo;
        ArrayList arrayList = this.items;
        Theme.ThemeInfo themeInfo2 = ((ThemeItem) arrayList.get(i2)).themeInfo;
        if (themeInfo2 == null) {
            int i3 = ((ThemeItem) arrayList.get(i2)).settingsIndex;
            ThemeItem themeItem = (ThemeItem) ((ITheme) arrayList.get(i2));
            TLRPC.ThemeSettings themeSettings = themeItem.getThemeSettings(i3);
            TLRPC.TL_theme tL_theme = ((ThemeItem) arrayList.get(i2)).tlTheme;
            Theme.ThemeInfo themeInfo3 = new Theme.ThemeInfo((Theme.ThemeInfo) Theme.themesDict.get(Theme.getBaseThemeKey(themeSettings)));
            themeAccentCreateNewAccent = themeInfo3.createNewAccent(themeItem.getThemeId(), themeSettings, tL_theme, i, true);
            themeInfo3.setCurrentAccentId(themeAccentCreateNewAccent.id);
            themeInfo2 = themeInfo3;
        } else {
            SparseArray sparseArray = themeInfo2.themeAccentsMap;
            themeAccentCreateNewAccent = sparseArray != null ? (Theme.ThemeAccent) sparseArray.get(((ThemeItem) arrayList.get(i2)).accentId) : null;
        }
        String[] strArr = new String[1];
        if (themeInfo2.pathToFile != null) {
            themeFileValues = Theme.getThemeFileValues(new File(themeInfo2.pathToFile), null, strArr);
        } else {
            String str = themeInfo2.assetName;
            themeFileValues = str != null ? Theme.getThemeFileValues(null, str, strArr) : new SparseIntArray();
        }
        ThemeItem themeItem2 = (ThemeItem) arrayList.get(i2);
        themeItem2.wallpaperLink = strArr[0];
        if (themeAccentCreateNewAccent != null) {
            SparseIntArray sparseIntArrayClone = themeFileValues.clone();
            themeAccentCreateNewAccent.fillAccentColors(themeFileValues, sparseIntArrayClone);
            ThemeKey themeKey = this.key;
            if (themeKey != null && !TextUtils.isEmpty(themeKey.giftSlug) && (themeInfo = themeAccentCreateNewAccent.parentTheme) != null && themeInfo.pathToFile == null && !themeInfo.isDark()) {
                Theme.ThemeAccent.resetAccentColorsForMyMessagesGiftThemeLight(sparseIntArrayClone);
            }
            themeFileValues = sparseIntArrayClone;
        }
        SparseIntArray sparseIntArray = Theme.fallbackKeys;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            if (themeFileValues.indexOfKey(iKeyAt) < 0 && (iIndexOfKey = themeFileValues.indexOfKey(iValueAt)) >= 0) {
                themeFileValues.put(iKeyAt, themeFileValues.valueAt(iIndexOfKey));
            }
        }
        int[] iArr = Theme.defaultColors;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (themeFileValues.indexOfKey(i5) < 0) {
                themeFileValues.put(i5, iArr[i5]);
            }
        }
        return themeFileValues;
    }

    public final TLRPC.Document getEmojiAnimatedSticker() {
        TLRPC.ChatTheme chatTheme = this.chatTheme;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return TlUtils.getGiftDocument(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.chatTheme).emoticon);
        }
        return null;
    }

    public final SparseIntArray getPreviewColors(int i, int i2) {
        Theme.ThemeAccent themeAccent;
        SparseIntArray themeFileValues;
        int iIndexOfKey;
        Theme.ThemeInfo themeInfo;
        Theme.ThemeAccent themeAccentCreateNewAccent;
        ArrayList arrayList = this.items;
        SparseIntArray sparseIntArray = ((ThemeItem) arrayList.get(i2)).currentPreviewColors;
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        Theme.ThemeInfo themeInfo2 = ((ThemeItem) arrayList.get(i2)).themeInfo;
        if (themeInfo2 == null) {
            int i3 = ((ThemeItem) arrayList.get(i2)).settingsIndex;
            ITheme iTheme = (ITheme) arrayList.get(i2);
            TLRPC.TL_theme tL_theme = ((ThemeItem) arrayList.get(i2)).tlTheme;
            Theme.ThemeInfo themeInfo3 = iTheme != null ? (Theme.ThemeInfo) Theme.themesDict.get(Theme.getBaseThemeKey(((ThemeItem) iTheme).getThemeSettings(i3))) : (Theme.ThemeInfo) Theme.themesDict.get("Blue");
            if (themeInfo3 != null) {
                Theme.ThemeInfo themeInfo4 = new Theme.ThemeInfo(themeInfo3);
                if (iTheme != null) {
                    ThemeItem themeItem = (ThemeItem) iTheme;
                    themeAccentCreateNewAccent = themeInfo4.createNewAccent(themeItem.getThemeId(), themeItem.getThemeSettings(i3), tL_theme, i, true);
                } else {
                    themeAccentCreateNewAccent = null;
                }
                if (themeAccentCreateNewAccent != null) {
                    themeInfo4.setCurrentAccentId(themeAccentCreateNewAccent.id);
                }
                themeAccent = themeAccentCreateNewAccent;
                themeInfo2 = themeInfo4;
            } else {
                themeAccent = null;
            }
        } else {
            SparseArray sparseArray = themeInfo2.themeAccentsMap;
            if (sparseArray != null) {
                themeAccent = (Theme.ThemeAccent) sparseArray.get(((ThemeItem) arrayList.get(i2)).accentId);
            } else {
                themeAccent = null;
            }
        }
        if (themeInfo2 == null) {
            return sparseIntArray;
        }
        String[] strArr = new String[1];
        if (themeInfo2.pathToFile != null) {
            themeFileValues = Theme.getThemeFileValues(new File(themeInfo2.pathToFile), null, strArr);
        } else {
            String str = themeInfo2.assetName;
            themeFileValues = str != null ? Theme.getThemeFileValues(null, str, strArr) : new SparseIntArray();
        }
        int i4 = 0;
        ((ThemeItem) arrayList.get(i2)).wallpaperLink = strArr[0];
        if (themeAccent != null) {
            SparseIntArray sparseIntArrayClone = themeFileValues.clone();
            themeAccent.fillAccentColors(themeFileValues, sparseIntArrayClone);
            ThemeKey themeKey = this.key;
            if (themeKey != null && !TextUtils.isEmpty(themeKey.giftSlug) && (themeInfo = themeAccent.parentTheme) != null && themeInfo.pathToFile == null && !themeInfo.isDark()) {
                Theme.ThemeAccent.resetAccentColorsForMyMessagesGiftThemeLight(sparseIntArrayClone);
            }
            themeFileValues = sparseIntArrayClone;
        }
        SparseIntArray sparseIntArray2 = Theme.fallbackKeys;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((ThemeItem) arrayList.get(i2)).currentPreviewColors = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = previewColorKeys;
                if (i4 >= iArr.length) {
                    break;
                }
                int i5 = iArr[i4];
                int iIndexOfKey2 = themeFileValues.indexOfKey(i5);
                if (iIndexOfKey2 >= 0) {
                    sparseIntArray3.put(i5, themeFileValues.valueAt(iIndexOfKey2));
                } else {
                    int i6 = sparseIntArray2.get(i5, -1);
                    if (i6 >= 0 && (iIndexOfKey = themeFileValues.indexOfKey(i6)) >= 0) {
                        sparseIntArray3.put(i5, themeFileValues.valueAt(iIndexOfKey));
                    }
                }
                i4++;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return sparseIntArray3;
    }

    public final TLRPC.WallPaper getWallpaper(int i) {
        ThemeItem themeItem = (ThemeItem) this.items.get(i);
        TLRPC.ThemeSettings themeSettings = themeItem.getThemeSettings(themeItem.settingsIndex);
        if (themeSettings != null) {
            return themeSettings.wallpaper;
        }
        return null;
    }

    public final void initColors() {
        getPreviewColors(0, 0);
        getPreviewColors(0, 1);
    }

    public final boolean isAnyStub() {
        return this.showAsDefaultStub || this.showAsRemovedStub;
    }

    public final void loadPreviewColors(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.items;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i2) != null) {
                SparseIntArray previewColors = getPreviewColors(i, i2);
                ((ThemeItem) arrayList.get(i2)).inBubbleColor = getOrDefault(previewColors, Theme.key_chat_inBubble);
                ((ThemeItem) arrayList.get(i2)).outBubbleColor = getOrDefault(previewColors, Theme.key_chat_outBubble);
                ((ThemeItem) arrayList.get(i2)).outLineColor = getOrDefault(previewColors, Theme.key_featuredStickers_addButton);
                ((ThemeItem) arrayList.get(i2)).patternBgColor = previewColors.get(Theme.key_chat_wallpaper, 0);
                ((ThemeItem) arrayList.get(i2)).patternBgGradientColor1 = previewColors.get(Theme.key_chat_wallpaper_gradient_to1, 0);
                ((ThemeItem) arrayList.get(i2)).patternBgGradientColor2 = previewColors.get(Theme.key_chat_wallpaper_gradient_to2, 0);
                ((ThemeItem) arrayList.get(i2)).patternBgGradientColor3 = previewColors.get(Theme.key_chat_wallpaper_gradient_to3, 0);
                ((ThemeItem) arrayList.get(i2)).patternBgRotation = previewColors.get(Theme.key_chat_wallpaper_gradient_rotation, 0);
                if (((ThemeItem) arrayList.get(i2)).themeInfo != null && ((ThemeItem) arrayList.get(i2)).themeInfo.getKey().equals("Blue")) {
                    if ((((ThemeItem) arrayList.get(i2)).accentId >= 0 ? ((ThemeItem) arrayList.get(i2)).accentId : ((ThemeItem) arrayList.get(i2)).themeInfo.currentAccentId) == 99) {
                        ((ThemeItem) arrayList.get(i2)).patternBgColor = -2368069;
                        ((ThemeItem) arrayList.get(i2)).patternBgGradientColor1 = -9722489;
                        ((ThemeItem) arrayList.get(i2)).patternBgGradientColor2 = -2762611;
                        ((ThemeItem) arrayList.get(i2)).patternBgGradientColor3 = -7817084;
                    }
                }
            }
            i2++;
        }
    }

    public final void loadWallpaper(int i, ResultCallback resultCallback) {
        TLRPC.WallPaper wallpaper = getWallpaper(i);
        if (wallpaper == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long themeId = ((ThemeItem) this.items.get(i)).getThemeId();
        long j = wallpaper.id;
        EmojiThemes$$ExternalSyntheticLambda0 emojiThemes$$ExternalSyntheticLambda0 = new EmojiThemes$$ExternalSyntheticLambda0(resultCallback, themeId, 0);
        boolean z = wallpaper.pattern;
        int i2 = this.currentAccount;
        ChatThemeController.getInstance(i2).loadWallpaperBitmap(j, z ? 1 : 0, new EmojiThemes$$ExternalSyntheticLambda1(emojiThemes$$ExternalSyntheticLambda0, wallpaper, z ? 1 : 0, i2, j));
    }

    public final void loadWallpaperThumb(int i, ResultCallback resultCallback) {
        TLRPC.WallPaper wallpaper = getWallpaper(i);
        if (wallpaper == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        long themeId = ((ThemeItem) this.items.get(i)).getThemeId();
        if (themeId == 0) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.currentAccount).getWallpaperThumbBitmap(themeId);
        File file = new File(ApplicationLoader.getFilesDirFixed(), RendererCapabilities.CC.m(themeId, "wallpaper_thumb_", ".png"));
        if (wallpaperThumbBitmap == null && file.exists() && file.length() > 0) {
            try {
                wallpaperThumbBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (wallpaperThumbBitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(themeId), wallpaperThumbBitmap));
                return;
            }
            return;
        }
        TLRPC.Document document = wallpaper.document;
        if (document == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(themeId), null));
            }
        } else {
            ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 140), wallpaper.document);
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
            imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
            imageReceiver.setDelegate(new ProfileActivity$$ExternalSyntheticLambda22(resultCallback, themeId, file, 5));
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
        }
    }

    public EmojiThemes(int i, TLRPC.TL_theme tL_theme) {
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.currentAccount = i;
        this.showAsDefaultStub = false;
        String str = tL_theme.emoticon;
        this.emoji = str;
        this.key = new ThemeKey(str, null);
        this.chatTheme = TLRPC.ChatTheme.ofEmoticon(str);
        ThemeItem themeItem = new ThemeItem();
        themeItem.tlTheme = tL_theme;
        themeItem.settingsIndex = 0;
        arrayList.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.tlTheme = tL_theme;
        themeItem2.settingsIndex = 1;
        arrayList.add(themeItem2);
    }

    public EmojiThemes(int i, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.currentAccount = i;
        this.showAsDefaultStub = false;
        this.emoji = tL_chatThemeUniqueGift.gift.slug;
        this.key = ThemeKey.of(tL_chatThemeUniqueGift);
        this.chatTheme = tL_chatThemeUniqueGift;
        ThemeItem themeItem = new ThemeItem();
        themeItem.tlChatThemeGift = tL_chatThemeUniqueGift;
        themeItem.settingsIndex = 0;
        arrayList.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.tlChatThemeGift = tL_chatThemeUniqueGift;
        themeItem2.settingsIndex = 1;
        arrayList.add(themeItem2);
    }
}
