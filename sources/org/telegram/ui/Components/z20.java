package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class z20 {
    public static final z20 d;
    public static final z20 f40863e;
    public static final z20 f40864f;
    public static final z20 h;
    public static final z20 f40865n;
    public static final z20 f40866r;
    public static final z20 f40867s;
    public static final z20 f40868w;
    public static final z20 f40869x;
    public static final z20[] f40870y;
    public final String f40871a;
    public final int f40872b;
    public final float f40873c;

    static {
        z20 z20Var = new z20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = z20Var;
        z20 z20Var2 = new z20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f40863e = z20Var2;
        z20 z20Var3 = new z20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f40864f = z20Var3;
        z20 z20Var4 = new z20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = z20Var4;
        z20 z20Var5 = new z20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f40865n = z20Var5;
        z20 z20Var6 = new z20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f40866r = z20Var6;
        z20 z20Var7 = new z20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f40867s = z20Var7;
        z20 z20Var8 = new z20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f40868w = z20Var8;
        z20 z20Var9 = new z20();
        f40869x = z20Var9;
        f40870y = new z20[]{z20Var, z20Var2, z20Var3, z20Var4, z20Var5, z20Var6, z20Var7, z20Var8, z20Var9};
    }

    public z20() {
        this.f40871a = "hints_controller_" + this;
        this.f40872b = 3;
        this.f40873c = 1.0f;
    }

    public static z20 valueOf(String str) {
        return (z20) Enum.valueOf(z20.class, str);
    }

    public static z20[] values() {
        return (z20[]) f40870y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.f40871a, this.f40872b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.f40871a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.f40871a, 0) < this.f40872b) {
            float f10 = this.f40873c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f21335c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public z20(String str, int i7, String str2, int i10, float f10) {
        this.f40871a = str2;
        this.f40872b = i10;
        this.f40873c = f10;
    }
}
