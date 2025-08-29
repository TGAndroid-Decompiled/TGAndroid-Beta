package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ITheme;
import org.telegram.ui.ActionBar.theme.ThemeKey;

public class EmojiThemes {
    private static final int[] previewColorKeys = {Theme.key_chat_inBubble, Theme.key_chat_outBubble, Theme.key_featuredStickers_addButton, Theme.key_chat_wallpaper, Theme.key_chat_wallpaper_gradient_to1, Theme.key_chat_wallpaper_gradient_to2, Theme.key_chat_wallpaper_gradient_to3, Theme.key_chat_wallpaper_gradient_rotation};
    public TLRPC.ChatTheme chatTheme;
    private final int currentAccount;
    int currentIndex;
    public String emoji;
    public ArrayList items;
    public ThemeKey key;
    public boolean showAsDefaultStub;
    public boolean showAsRemovedStub;
    public TLRPC.WallPaper wallpaper;

    public EmojiThemes(int i) {
        this.currentIndex = 0;
        this.items = new ArrayList();
        this.currentAccount = i;
    }

    public EmojiThemes(int i, TLRPC.TL_theme tL_theme, boolean z) {
        this.currentIndex = 0;
        this.items = new ArrayList();
        this.currentAccount = i;
        this.showAsDefaultStub = z;
        this.emoji = tL_theme.emoticon;
        this.key = ThemeKey.of(tL_theme);
        this.chatTheme = TLRPC.ChatTheme.ofEmoticon(tL_theme.emoticon);
        if (z) {
            return;
        }
        ThemeItem themeItem = new ThemeItem();
        themeItem.tlTheme = tL_theme;
        themeItem.settingsIndex = 0;
        this.items.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.tlTheme = tL_theme;
        themeItem2.settingsIndex = 1;
        this.items.add(themeItem2);
    }

    public EmojiThemes(int i, TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift) {
        this.currentIndex = 0;
        this.items = new ArrayList();
        this.currentAccount = i;
        this.showAsDefaultStub = false;
        this.emoji = tL_chatThemeUniqueGift.gift.slug;
        this.key = ThemeKey.of(tL_chatThemeUniqueGift);
        this.chatTheme = tL_chatThemeUniqueGift;
        ThemeItem themeItem = new ThemeItem();
        themeItem.tlChatThemeGift = tL_chatThemeUniqueGift;
        themeItem.settingsIndex = 0;
        this.items.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.tlChatThemeGift = tL_chatThemeUniqueGift;
        themeItem2.settingsIndex = 1;
        this.items.add(themeItem2);
    }

    public boolean isAnyStub() {
        return this.showAsDefaultStub || this.showAsRemovedStub;
    }

    public boolean isGiftTheme() {
        ThemeKey themeKey = this.key;
        return (themeKey == null || TextUtils.isEmpty(themeKey.giftSlug)) ? false : true;
    }

    public static EmojiThemes createPreviewFullTheme(int i, TLRPC.TL_theme tL_theme) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = tL_theme.emoticon;
        emojiThemes.key = ThemeKey.of(tL_theme);
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon(tL_theme.emoticon);
        for (int i2 = 0; i2 < tL_theme.settings.size(); i2++) {
            ThemeItem themeItem = new ThemeItem();
            themeItem.tlTheme = tL_theme;
            themeItem.settingsIndex = i2;
            emojiThemes.items.add(themeItem);
        }
        return emojiThemes;
    }

    public static EmojiThemes createChatThemesDefault(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "❌";
        emojiThemes.key = ThemeKey.ofEmoticon("❌");
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
        emojiThemes.showAsDefaultStub = true;
        ThemeItem themeItem = new ThemeItem();
        themeItem.themeInfo = getDefaultThemeInfo(true);
        emojiThemes.items.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = getDefaultThemeInfo(false);
        emojiThemes.items.add(themeItem2);
        return emojiThemes;
    }

    public static EmojiThemes createChatThemesRemoved(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "❌";
        emojiThemes.key = ThemeKey.ofEmoticon("❌");
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
        emojiThemes.showAsRemovedStub = true;
        ThemeItem themeItem = new ThemeItem();
        themeItem.themeInfo = getDefaultThemeInfo(true);
        emojiThemes.items.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = getDefaultThemeInfo(false);
        emojiThemes.items.add(themeItem2);
        return emojiThemes;
    }

    public static EmojiThemes createPreviewCustom(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "🎨";
        emojiThemes.key = ThemeKey.ofEmoticon("🎨");
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
        int i2 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String string = sharedPreferences.getString("lastDayCustomTheme", null);
        int i3 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
        int i4 = 99;
        String str = "Blue";
        if (string == null || Theme.getTheme(string) == null) {
            string = sharedPreferences.getString("lastDayTheme", "Blue");
            Theme.ThemeInfo theme = Theme.getTheme(string);
            if (theme == null) {
                string = "Blue";
                i3 = 99;
            } else {
                i3 = theme.currentAccentId;
            }
            sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
        } else if (i3 == -1) {
            i3 = Theme.getTheme(string).lastAccentId;
        }
        if (i3 != -1) {
            str = string;
            i4 = i3;
        }
        String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
        int i5 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
        String str2 = "Dark Blue";
        if (string2 == null || Theme.getTheme(string2) == null) {
            string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            Theme.ThemeInfo theme2 = Theme.getTheme(string2);
            if (theme2 == null) {
                string2 = "Dark Blue";
                i5 = 0;
            } else {
                i5 = theme2.currentAccentId;
            }
            sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
        } else if (i5 == -1) {
            i5 = Theme.getTheme(str).lastAccentId;
        }
        if (i5 != -1) {
            str2 = string2;
            i2 = i5;
        }
        ThemeItem themeItem = new ThemeItem();
        themeItem.themeInfo = Theme.getTheme(str);
        themeItem.accentId = i4;
        emojiThemes.items.add(themeItem);
        emojiThemes.items.add(null);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = Theme.getTheme(str2);
        themeItem2.accentId = i2;
        emojiThemes.items.add(themeItem2);
        emojiThemes.items.add(null);
        return emojiThemes;
    }

    public static EmojiThemes createHomePreviewTheme(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "🏠";
        emojiThemes.key = ThemeKey.ofEmoticon("🏠");
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
        ThemeItem themeItem = new ThemeItem();
        themeItem.themeInfo = Theme.getTheme("Blue");
        themeItem.accentId = 99;
        emojiThemes.items.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = Theme.getTheme("Day");
        themeItem2.accentId = 9;
        emojiThemes.items.add(themeItem2);
        ThemeItem themeItem3 = new ThemeItem();
        themeItem3.themeInfo = Theme.getTheme("Night");
        themeItem3.accentId = 0;
        emojiThemes.items.add(themeItem3);
        ThemeItem themeItem4 = new ThemeItem();
        themeItem4.themeInfo = Theme.getTheme("Dark Blue");
        themeItem4.accentId = 0;
        emojiThemes.items.add(themeItem4);
        return emojiThemes;
    }

    public static EmojiThemes createHomeQrTheme(int i) {
        EmojiThemes emojiThemes = new EmojiThemes(i);
        emojiThemes.emoji = "🏠";
        emojiThemes.key = ThemeKey.ofEmoticon("🏠");
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
        ThemeItem themeItem = new ThemeItem();
        themeItem.themeInfo = Theme.getTheme("Blue");
        themeItem.accentId = 99;
        emojiThemes.items.add(themeItem);
        ThemeItem themeItem2 = new ThemeItem();
        themeItem2.themeInfo = Theme.getTheme("Dark Blue");
        themeItem2.accentId = 0;
        emojiThemes.items.add(themeItem2);
        return emojiThemes;
    }

    public void initColors() {
        getPreviewColors(0, 0);
        getPreviewColors(0, 1);
    }

    public String getEmoticon() {
        return this.emoji;
    }

    public String getEmoticonOrSlug() {
        ThemeKey themeKey = this.key;
        if (themeKey == null) {
            return null;
        }
        String str = themeKey.giftSlug;
        return str != null ? str : themeKey.emoticon;
    }

    public TLRPC.TL_theme getTlTheme(int i) {
        return ((ThemeItem) this.items.get(i)).tlTheme;
    }

    public ThemeKey getThemeKey() {
        return this.key;
    }

    public TLRPC.ChatTheme getChatTheme() {
        return this.chatTheme;
    }

    public ITheme getITheme(int i) {
        return (ITheme) this.items.get(i);
    }

    public long getThemeId(int i) {
        return ((ThemeItem) this.items.get(i)).getThemeId();
    }

    public TLRPC.WallPaper getWallpaper(int i) {
        ThemeItem themeItem = (ThemeItem) this.items.get(i);
        return themeItem.getThemeWallPaper(themeItem.settingsIndex);
    }

    public String getWallpaperLink(int i) {
        return ((ThemeItem) this.items.get(i)).wallpaperLink;
    }

    public int getSettingsIndex(int i) {
        return ((ThemeItem) this.items.get(i)).settingsIndex;
    }

    public SparseIntArray getPreviewColors(int i, int i2) {
        Theme.ThemeAccent themeAccent;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        Theme.ThemeInfo themeInfo;
        Theme.ThemeInfo theme;
        SparseIntArray sparseIntArray2 = ((ThemeItem) this.items.get(i2)).currentPreviewColors;
        if (sparseIntArray2 != null) {
            return sparseIntArray2;
        }
        Theme.ThemeInfo themeInfo2 = getThemeInfo(i2);
        if (themeInfo2 == null) {
            int settingsIndex = getSettingsIndex(i2);
            ITheme iTheme = getITheme(i2);
            TLRPC.TL_theme tlTheme = getTlTheme(i2);
            if (iTheme != null) {
                theme = Theme.getTheme(Theme.getBaseThemeKey(iTheme.getThemeSettings(settingsIndex)));
            } else {
                theme = Theme.getTheme("Blue");
            }
            if (theme != null) {
                themeInfo2 = new Theme.ThemeInfo(theme);
                themeAccent = iTheme != null ? themeInfo2.createNewAccent(iTheme.getThemeId(), iTheme.getThemeSettings(settingsIndex), tlTheme, i, true) : null;
                if (themeAccent != null) {
                    themeInfo2.setCurrentAccentId(themeAccent.id);
                }
            }
            themeAccent = null;
        } else {
            SparseArray sparseArray = themeInfo2.themeAccentsMap;
            if (sparseArray != null) {
                themeAccent = (Theme.ThemeAccent) sparseArray.get(((ThemeItem) this.items.get(i2)).accentId);
            }
            themeAccent = null;
        }
        if (themeInfo2 == null) {
            return sparseIntArray2;
        }
        String[] strArr = new String[1];
        if (themeInfo2.pathToFile != null) {
            sparseIntArray = Theme.getThemeFileValues(new File(themeInfo2.pathToFile), null, strArr);
        } else {
            String str = themeInfo2.assetName;
            if (str != null) {
                sparseIntArray = Theme.getThemeFileValues(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        int i3 = 0;
        ((ThemeItem) this.items.get(i2)).wallpaperLink = strArr[0];
        if (themeAccent != null) {
            SparseIntArray clone = sparseIntArray.clone();
            themeAccent.fillAccentColors(sparseIntArray, clone);
            if (isGiftTheme() && (themeInfo = themeAccent.parentTheme) != null && themeInfo.isLight()) {
                themeAccent.resetAccentColorsForMyMessagesGiftThemeLight(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray fallbackKeys = Theme.getFallbackKeys();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        ((ThemeItem) this.items.get(i2)).currentPreviewColors = sparseIntArray3;
        while (true) {
            try {
                int[] iArr = previewColorKeys;
                if (i3 >= iArr.length) {
                    break;
                }
                int i4 = iArr[i3];
                int indexOfKey2 = sparseIntArray.indexOfKey(i4);
                if (indexOfKey2 >= 0) {
                    sparseIntArray3.put(i4, sparseIntArray.valueAt(indexOfKey2));
                } else {
                    int i5 = fallbackKeys.get(i4, -1);
                    if (i5 >= 0 && (indexOfKey = sparseIntArray.indexOfKey(i5)) >= 0) {
                        sparseIntArray3.put(i4, sparseIntArray.valueAt(indexOfKey));
                    }
                }
                i3++;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return sparseIntArray3;
    }

    public SparseIntArray createColors(int i, int i2) {
        Theme.ThemeAccent themeAccent;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        Theme.ThemeInfo themeInfo;
        Theme.ThemeInfo themeInfo2 = getThemeInfo(i2);
        if (themeInfo2 == null) {
            int settingsIndex = getSettingsIndex(i2);
            ITheme iTheme = getITheme(i2);
            TLRPC.ThemeSettings themeSettings = iTheme.getThemeSettings(settingsIndex);
            TLRPC.TL_theme tlTheme = getTlTheme(i2);
            Theme.ThemeInfo themeInfo3 = new Theme.ThemeInfo(Theme.getTheme(Theme.getBaseThemeKey(themeSettings)));
            themeAccent = themeInfo3.createNewAccent(iTheme.getThemeId(), themeSettings, tlTheme, i, true);
            themeInfo3.setCurrentAccentId(themeAccent.id);
            themeInfo2 = themeInfo3;
        } else {
            SparseArray sparseArray = themeInfo2.themeAccentsMap;
            themeAccent = sparseArray != null ? (Theme.ThemeAccent) sparseArray.get(((ThemeItem) this.items.get(i2)).accentId) : null;
        }
        String[] strArr = new String[1];
        if (themeInfo2.pathToFile != null) {
            sparseIntArray = Theme.getThemeFileValues(new File(themeInfo2.pathToFile), null, strArr);
        } else {
            String str = themeInfo2.assetName;
            if (str != null) {
                sparseIntArray = Theme.getThemeFileValues(null, str, strArr);
            } else {
                sparseIntArray = new SparseIntArray();
            }
        }
        ((ThemeItem) this.items.get(i2)).wallpaperLink = strArr[0];
        if (themeAccent != null) {
            SparseIntArray clone = sparseIntArray.clone();
            themeAccent.fillAccentColors(sparseIntArray, clone);
            if (isGiftTheme() && (themeInfo = themeAccent.parentTheme) != null && themeInfo.isLight()) {
                themeAccent.resetAccentColorsForMyMessagesGiftThemeLight(clone);
            }
            sparseIntArray = clone;
        }
        SparseIntArray fallbackKeys = Theme.getFallbackKeys();
        for (int i3 = 0; i3 < fallbackKeys.size(); i3++) {
            int keyAt = fallbackKeys.keyAt(i3);
            int valueAt = fallbackKeys.valueAt(i3);
            if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
            }
        }
        int[] defaultColors = Theme.getDefaultColors();
        for (int i4 = 0; i4 < defaultColors.length; i4++) {
            if (sparseIntArray.indexOfKey(i4) < 0) {
                sparseIntArray.put(i4, defaultColors[i4]);
            }
        }
        return sparseIntArray;
    }

    public Theme.ThemeInfo getThemeInfo(int i) {
        return ((ThemeItem) this.items.get(i)).themeInfo;
    }

    public void loadWallpaper(int i, final ResultCallback resultCallback) {
        TLRPC.WallPaper wallpaper = getWallpaper(i);
        if (wallpaper != null) {
            final long themeId = getThemeId(i);
            loadWallpaperImage(this.currentAccount, wallpaper.id, wallpaper, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    EmojiThemes.lambda$loadWallpaper$0(ResultCallback.this, themeId, (WallpaperBitmapHolder) obj);
                }
            });
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public static void lambda$loadWallpaper$0(ResultCallback resultCallback, long j, WallpaperBitmapHolder wallpaperBitmapHolder) {
        if (resultCallback != null) {
            resultCallback.onComplete(new Pair(Long.valueOf(j), wallpaperBitmapHolder));
        }
    }

    public static void loadWallpaperImage(final int i, final long j, final TLRPC.WallPaper wallPaper, final Utilities.Callback callback) {
        boolean z = wallPaper.pattern;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i);
        final int i2 = z ? 1 : 0;
        chatThemeController.loadWallpaperBitmap(j, z ? 1 : 0, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                EmojiThemes.lambda$loadWallpaperImage$2(Utilities.Callback.this, wallPaper, i2, i, j, (WallpaperBitmapHolder) obj);
            }
        });
    }

    public static void lambda$loadWallpaperImage$2(final Utilities.Callback callback, TLRPC.WallPaper wallPaper, final int i, final int i2, final long j, WallpaperBitmapHolder wallpaperBitmapHolder) {
        if (wallpaperBitmapHolder != null && callback != null) {
            callback.run(wallpaperBitmapHolder);
            return;
        }
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (Math.max(point2.x, point2.y) / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                EmojiThemes.lambda$loadWallpaperImage$1(i, callback, i2, j, imageReceiver2, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i3, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i3, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }

    public static void lambda$loadWallpaperImage$1(int r0, org.telegram.messenger.Utilities.Callback r1, int r2, long r3, org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.EmojiThemes.lambda$loadWallpaperImage$1(int, org.telegram.messenger.Utilities$Callback, int, long, org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public void loadWallpaperThumb(int i, final ResultCallback resultCallback) {
        TLRPC.WallPaper wallpaper = getWallpaper(i);
        if (wallpaper == null) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        final long themeId = getThemeId(i);
        if (themeId == 0) {
            if (resultCallback != null) {
                resultCallback.onComplete(null);
                return;
            }
            return;
        }
        Bitmap wallpaperThumbBitmap = ChatThemeController.getInstance(this.currentAccount).getWallpaperThumbBitmap(themeId);
        final File wallpaperThumbFile = getWallpaperThumbFile(themeId);
        if (wallpaperThumbBitmap == null && wallpaperThumbFile.exists() && wallpaperThumbFile.length() > 0) {
            try {
                wallpaperThumbBitmap = BitmapFactory.decodeFile(wallpaperThumbFile.getAbsolutePath());
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
            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                    EmojiThemes.lambda$loadWallpaperThumb$4(ResultCallback.this, themeId, wallpaperThumbFile, imageReceiver2, z, z2, z3);
                }

                @Override
                public void didSetImageBitmap(int i2, String str, Drawable drawable) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i2, str, drawable);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver2) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
                }
            });
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
        }
    }

    public static void lambda$loadWallpaperThumb$4(ResultCallback resultCallback, long j, final File file, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z || bitmapSafe == null || bitmapSafe.bitmap.isRecycled()) {
            return;
        }
        final Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(j), bitmap));
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    EmojiThemes.lambda$loadWallpaperThumb$3(file, bitmap);
                }
            });
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    public static void lambda$loadWallpaperThumb$3(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void preloadWallpaper() {
        loadWallpaperThumb(0, null);
        loadWallpaperThumb(1, null);
        loadWallpaper(0, null);
        loadWallpaper(1, null);
    }

    private File getWallpaperThumbFile(long j) {
        return new File(ApplicationLoader.getFilesDirFixed(), "wallpaper_thumb_" + j + ".png");
    }

    public static Theme.ThemeInfo getDefaultThemeInfo(boolean z) {
        String string;
        Theme.ThemeInfo currentNightTheme = z ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme();
        if (z != currentNightTheme.isDark()) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            if (z) {
                string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            } else {
                string = sharedPreferences.getString("lastDayTheme", "Blue");
            }
            currentNightTheme = Theme.getTheme(string);
            if (currentNightTheme == null) {
                currentNightTheme = Theme.getTheme(z ? "Dark Blue" : "Blue");
            }
        }
        return new Theme.ThemeInfo(currentNightTheme);
    }

    public int getAccentId(int i) {
        return ((ThemeItem) this.items.get(i)).accentId;
    }

    public void loadPreviewColors(int i) {
        for (int i2 = 0; i2 < this.items.size(); i2++) {
            if (this.items.get(i2) != null) {
                SparseIntArray previewColors = getPreviewColors(i, i2);
                ((ThemeItem) this.items.get(i2)).inBubbleColor = getOrDefault(previewColors, Theme.key_chat_inBubble);
                ((ThemeItem) this.items.get(i2)).outBubbleColor = getOrDefault(previewColors, Theme.key_chat_outBubble);
                ((ThemeItem) this.items.get(i2)).outLineColor = getOrDefault(previewColors, Theme.key_featuredStickers_addButton);
                ((ThemeItem) this.items.get(i2)).patternBgColor = previewColors.get(Theme.key_chat_wallpaper, 0);
                ((ThemeItem) this.items.get(i2)).patternBgGradientColor1 = previewColors.get(Theme.key_chat_wallpaper_gradient_to1, 0);
                ((ThemeItem) this.items.get(i2)).patternBgGradientColor2 = previewColors.get(Theme.key_chat_wallpaper_gradient_to2, 0);
                ((ThemeItem) this.items.get(i2)).patternBgGradientColor3 = previewColors.get(Theme.key_chat_wallpaper_gradient_to3, 0);
                ((ThemeItem) this.items.get(i2)).patternBgRotation = previewColors.get(Theme.key_chat_wallpaper_gradient_rotation, 0);
                if (((ThemeItem) this.items.get(i2)).themeInfo != null && ((ThemeItem) this.items.get(i2)).themeInfo.getKey().equals("Blue")) {
                    if ((((ThemeItem) this.items.get(i2)).accentId >= 0 ? ((ThemeItem) this.items.get(i2)).accentId : ((ThemeItem) this.items.get(i2)).themeInfo.currentAccentId) == 99) {
                        ((ThemeItem) this.items.get(i2)).patternBgColor = -2368069;
                        ((ThemeItem) this.items.get(i2)).patternBgGradientColor1 = -9722489;
                        ((ThemeItem) this.items.get(i2)).patternBgGradientColor2 = -2762611;
                        ((ThemeItem) this.items.get(i2)).patternBgGradientColor3 = -7817084;
                    }
                }
            }
        }
    }

    private int getOrDefault(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null) {
            return Theme.getDefaultColor(i);
        }
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return sparseIntArray.valueAt(indexOfKey);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return Theme.getDefaultColor(i);
    }

    public ThemeItem getThemeItem(int i) {
        return (ThemeItem) this.items.get(i);
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
            boolean isDark = themeInfo.isDark();
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().putString(isDark ? "lastDarkCustomTheme" : "lastDayCustomTheme", themeInfo.getKey()).putInt(isDark ? "lastDarkCustomThemeAccentId" : "lastDayCustomThemeAccentId", i).apply();
        }
    }

    public static class ThemeItem implements ITheme {
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
        int settingsIndex;
        public Theme.ThemeInfo themeInfo;
        TLRPC.TL_chatThemeUniqueGift tlChatThemeGift;
        TLRPC.TL_theme tlTheme;
        private String wallpaperLink;

        @Override
        public long getThemeId() {
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

        @Override
        public TLRPC.ThemeSettings getThemeSettings(int i) {
            ArrayList<TLRPC.ThemeSettings> arrayList;
            TLRPC.TL_theme tL_theme = this.tlTheme;
            if (tL_theme != null) {
                arrayList = tL_theme.settings;
            } else {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.tlChatThemeGift;
                if (tL_chatThemeUniqueGift != null) {
                    arrayList = tL_chatThemeUniqueGift.theme_settings;
                }
                return null;
            }
            if (arrayList != null && i >= 0 && arrayList.size() > i) {
                return arrayList.get(i);
            }
            return null;
        }

        public TLRPC.WallPaper getThemeWallPaper(int i) {
            TLRPC.ThemeSettings themeSettings = getThemeSettings(i);
            if (themeSettings != null) {
                return themeSettings.wallpaper;
            }
            return null;
        }
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        TLRPC.ChatTheme chatTheme = this.chatTheme;
        if (!(chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
            return null;
        }
        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    public long getBusyByUserId() {
        if (this.chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return ChatThemeController.getInstance(this.currentAccount).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) this.chatTheme).gift.slug);
        }
        return 0L;
    }

    public TLRPC.Document getEmojiAnimatedSticker() {
        TLRPC.ChatTheme chatTheme = this.chatTheme;
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return TlUtils.getGiftDocument(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
        }
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(((TLRPC.TL_chatTheme) this.chatTheme).emoticon);
        }
        return null;
    }

    public void loadWallpaperGiftPattern(int i, ResultCallback resultCallback) {
        ThemeItem themeItem = getThemeItem(i);
        if (themeItem == null || themeItem.tlChatThemeGift == null) {
            return;
        }
        loadWallpaperGiftPattern(this.currentAccount, getThemeId(i), themeItem.tlChatThemeGift.gift, resultCallback);
    }

    public static void loadWallpaperGiftPattern(int i, final long j, TL_stars.StarGift starGift, final ResultCallback resultCallback) {
        TLRPC.Document giftDocumentPattern = TlUtils.getGiftDocumentPattern(starGift);
        ImageLocation forDocument = ImageLocation.getForDocument(giftDocumentPattern);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        imageReceiver.setImage(forDocument, "40_40_firstframe", null, ".jpg", giftDocumentPattern, 1);
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                EmojiThemes.lambda$loadWallpaperGiftPattern$5(ResultCallback.this, j, imageReceiver2, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i2, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i2, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }

    public static void lambda$loadWallpaperGiftPattern$5(ResultCallback resultCallback, long j, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z || bitmapSafe == null) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (resultCallback != null) {
            resultCallback.onComplete(new Pair(Long.valueOf(j), bitmap));
        }
    }
}
