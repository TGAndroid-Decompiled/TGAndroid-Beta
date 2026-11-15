package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class c30 {
    public static final c30 d;
    public static final c30 f33483e;
    public static final c30 f33484f;
    public static final c30 h;
    public static final c30 f33485n;
    public static final c30 f33486r;
    public static final c30 f33487s;
    public static final c30 f33488w;
    public static final c30 f33489x;
    public static final c30[] f33490y;
    public final String f33491a;
    public final int f33492b;
    public final float f33493c;

    static {
        c30 c30Var = new c30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = c30Var;
        c30 c30Var2 = new c30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f33483e = c30Var2;
        c30 c30Var3 = new c30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f33484f = c30Var3;
        c30 c30Var4 = new c30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = c30Var4;
        c30 c30Var5 = new c30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f33485n = c30Var5;
        c30 c30Var6 = new c30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f33486r = c30Var6;
        c30 c30Var7 = new c30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f33487s = c30Var7;
        c30 c30Var8 = new c30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f33488w = c30Var8;
        c30 c30Var9 = new c30();
        f33489x = c30Var9;
        f33490y = new c30[]{c30Var, c30Var2, c30Var3, c30Var4, c30Var5, c30Var6, c30Var7, c30Var8, c30Var9};
    }

    public c30() {
        this.f33491a = "hints_controller_" + this;
        this.f33492b = 3;
        this.f33493c = 1.0f;
    }

    public static c30 valueOf(String str) {
        return (c30) Enum.valueOf(c30.class, str);
    }

    public static c30[] values() {
        return (c30[]) f33490y.clone();
    }

    public final void a() {
        org.telegram.messenger.np.e1().edit().putInt(this.f33491a, this.f33492b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        String str = this.f33491a;
        org.telegram.messenger.np.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.np.e1().getInt(this.f33491a, 0) < this.f33492b) {
            float f10 = this.f33493c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f22415c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public c30(String str, int i7, String str2, int i10, float f10) {
        this.f33491a = str2;
        this.f33492b = i10;
        this.f33493c = f10;
    }
}
