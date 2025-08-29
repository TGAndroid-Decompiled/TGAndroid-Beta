package org.telegram.ui.ActionBar.theme;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

public class ThemeKey {
    public final String emoticon;
    public final String giftSlug;

    private ThemeKey(String str, String str2) {
        this.emoticon = str;
        this.giftSlug = str2;
    }

    public static ThemeKey ofEmoticon(String str) {
        return new ThemeKey(str, null);
    }

    public static ThemeKey ofGiftSlug(String str) {
        return new ThemeKey(null, str);
    }

    public static ThemeKey of(TLRPC.TL_theme tL_theme) {
        return new ThemeKey(tL_theme.emoticon, null);
    }

    public static TLRPC.InputChatTheme toInputTheme(ThemeKey themeKey) {
        if (themeKey != null && !TextUtils.isEmpty(themeKey.emoticon)) {
            TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
            tl_inputChatTheme.emoticon = themeKey.emoticon;
            return tl_inputChatTheme;
        }
        if (themeKey != null && !TextUtils.isEmpty(themeKey.giftSlug)) {
            TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift = new TLRPC.Tl_inputChatThemeUniqueGift();
            tl_inputChatThemeUniqueGift.slug = themeKey.giftSlug;
            return tl_inputChatThemeUniqueGift;
        }
        return new TLRPC.Tl_inputChatThemeEmpty();
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.emoticon) && TextUtils.isEmpty(this.giftSlug);
    }

    public String toSavedString() {
        if (this.giftSlug != null) {
            return "gift_" + this.giftSlug;
        }
        if (this.emoticon == null) {
            return null;
        }
        return "emoticon_" + this.emoticon;
    }

    public static ThemeKey fromSavedString(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("gift_")) {
            return new ThemeKey(null, str.substring(5));
        }
        if (str.startsWith("emoticon_")) {
            return new ThemeKey(str.substring(9), null);
        }
        return null;
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

    public int hashCode() {
        String str = this.emoticon;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.giftSlug;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ThemeKey)) {
            return false;
        }
        ThemeKey themeKey = (ThemeKey) obj;
        return TextUtils.equals(this.emoticon, themeKey.emoticon) && TextUtils.equals(this.giftSlug, themeKey.giftSlug);
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
