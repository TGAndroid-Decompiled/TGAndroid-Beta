package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class l40 {
    public static final l40 d;
    public static final l40 e;
    public static final l40 f26545f;
    public static final l40 h;
    public static final l40 f26546n;
    public static final l40 f26547r;
    public static final l40 f26548s;
    public static final l40 v;
    public static final l40[] f26549w;
    public final String f26550a;
    public final int f26551b;
    public final float f26552c;

    static {
        l40 l40Var = new l40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = l40Var;
        l40 l40Var2 = new l40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = l40Var2;
        l40 l40Var3 = new l40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f26545f = l40Var3;
        l40 l40Var4 = new l40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = l40Var4;
        l40 l40Var5 = new l40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f26546n = l40Var5;
        l40 l40Var6 = new l40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f26547r = l40Var6;
        l40 l40Var7 = new l40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f26548s = l40Var7;
        l40 l40Var8 = new l40();
        v = l40Var8;
        f26549w = new l40[]{l40Var, l40Var2, l40Var3, l40Var4, l40Var5, l40Var6, l40Var7, l40Var8};
    }

    public l40() {
        this.f26550a = "hints_controller_" + this;
        this.f26551b = 3;
        this.f26552c = 1.0f;
    }

    public static l40 valueOf(String str) {
        return (l40) Enum.valueOf(l40.class, str);
    }

    public static l40[] values() {
        return (l40[]) f26549w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f26550a, this.f26551b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f26550a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f26550a, 0) < this.f26551b) {
            float f10 = this.f26552c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.fastRandom.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public l40(String str, int i10, String str2, int i11, float f10) {
        this.f26550a = str2;
        this.f26551b = i11;
        this.f26552c = f10;
    }
}
