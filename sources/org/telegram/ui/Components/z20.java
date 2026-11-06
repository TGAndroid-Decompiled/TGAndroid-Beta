package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class z20 {
    public static final z20 d;
    public static final z20 f40813e;
    public static final z20 f40814f;
    public static final z20 h;
    public static final z20 f40815n;
    public static final z20 f40816r;
    public static final z20 f40817s;
    public static final z20 f40818w;
    public static final z20 f40819x;
    public static final z20[] f40820y;
    public final String f40821a;
    public final int f40822b;
    public final float f40823c;

    static {
        z20 z20Var = new z20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = z20Var;
        z20 z20Var2 = new z20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f40813e = z20Var2;
        z20 z20Var3 = new z20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f40814f = z20Var3;
        z20 z20Var4 = new z20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = z20Var4;
        z20 z20Var5 = new z20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f40815n = z20Var5;
        z20 z20Var6 = new z20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f40816r = z20Var6;
        z20 z20Var7 = new z20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f40817s = z20Var7;
        z20 z20Var8 = new z20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f40818w = z20Var8;
        z20 z20Var9 = new z20();
        f40819x = z20Var9;
        f40820y = new z20[]{z20Var, z20Var2, z20Var3, z20Var4, z20Var5, z20Var6, z20Var7, z20Var8, z20Var9};
    }

    public z20() {
        this.f40821a = "hints_controller_" + this;
        this.f40822b = 3;
        this.f40823c = 1.0f;
    }

    public static z20 valueOf(String str) {
        return (z20) Enum.valueOf(z20.class, str);
    }

    public static z20[] values() {
        return (z20[]) f40820y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.f40821a, this.f40822b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.f40821a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.f40821a, 0) < this.f40822b) {
            float f10 = this.f40823c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f21332c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public z20(String str, int i7, String str2, int i10, float f10) {
        this.f40821a = str2;
        this.f40822b = i10;
        this.f40823c = f10;
    }
}
