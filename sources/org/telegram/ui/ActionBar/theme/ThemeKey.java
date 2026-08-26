package org.telegram.ui.ActionBar.theme;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

public final class ThemeKey {
    public final String emoticon;
    public final String giftSlug;

    public ThemeKey(String str, String str2) {
        this.emoticon = str;
        this.giftSlug = str2;
    }

    public static ThemeKey of(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new ThemeKey(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return new ThemeKey(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ThemeKey) {
            ThemeKey themeKey = (ThemeKey) obj;
            if (TextUtils.equals(this.emoticon, themeKey.emoticon) && TextUtils.equals(this.giftSlug, themeKey.giftSlug)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.emoticon;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.giftSlug;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode;
    }

    public static boolean equals(ThemeKey themeKey, ThemeKey themeKey2) {
        if (themeKey == themeKey2) {
            return true;
        }
        if (themeKey == null || themeKey2 == null) {
            return false;
        }
        return themeKey.equals(themeKey2);
    }
}
