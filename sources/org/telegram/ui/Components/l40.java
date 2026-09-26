package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class l40 {
    public static final l40 d;
    public static final l40 e;
    public static final l40 f25956f;
    public static final l40 h;
    public static final l40 f25957n;
    public static final l40 f25958r;
    public static final l40 f25959s;
    public static final l40 v;
    public static final l40[] f25960w;
    public final String f25961a;
    public final int f25962b;
    public final float f25963c;

    static {
        l40 l40Var = new l40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = l40Var;
        l40 l40Var2 = new l40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = l40Var2;
        l40 l40Var3 = new l40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25956f = l40Var3;
        l40 l40Var4 = new l40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = l40Var4;
        l40 l40Var5 = new l40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25957n = l40Var5;
        l40 l40Var6 = new l40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25958r = l40Var6;
        l40 l40Var7 = new l40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25959s = l40Var7;
        l40 l40Var8 = new l40();
        v = l40Var8;
        f25960w = new l40[]{l40Var, l40Var2, l40Var3, l40Var4, l40Var5, l40Var6, l40Var7, l40Var8};
    }

    public l40() {
        this.f25961a = "hints_controller_" + this;
        this.f25962b = 3;
        this.f25963c = 1.0f;
    }

    public static l40 valueOf(String str) {
        return (l40) Enum.valueOf(l40.class, str);
    }

    public static l40[] values() {
        return (l40[]) f25960w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25961a, this.f25962b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25961a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25961a, 0) < this.f25962b) {
            float f7 = this.f25963c;
            if (f7 < 1.0f) {
                if (f7 > 0.0f && Utilities.fastRandom.nextFloat() < f7) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public l40(String str, int i10, String str2, int i11, float f7) {
        this.f25961a = str2;
        this.f25962b = i11;
        this.f25963c = f7;
    }
}
