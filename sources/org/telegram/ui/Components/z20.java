package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class z20 {
    public static final z20 d;
    public static final z20 f40833e;
    public static final z20 f40834f;
    public static final z20 h;
    public static final z20 f40835n;
    public static final z20 f40836r;
    public static final z20 f40837s;
    public static final z20 f40838w;
    public static final z20 f40839x;
    public static final z20[] f40840y;
    public final String f40841a;
    public final int f40842b;
    public final float f40843c;

    static {
        z20 z20Var = new z20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = z20Var;
        z20 z20Var2 = new z20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f40833e = z20Var2;
        z20 z20Var3 = new z20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f40834f = z20Var3;
        z20 z20Var4 = new z20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = z20Var4;
        z20 z20Var5 = new z20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f40835n = z20Var5;
        z20 z20Var6 = new z20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f40836r = z20Var6;
        z20 z20Var7 = new z20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f40837s = z20Var7;
        z20 z20Var8 = new z20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f40838w = z20Var8;
        z20 z20Var9 = new z20();
        f40839x = z20Var9;
        f40840y = new z20[]{z20Var, z20Var2, z20Var3, z20Var4, z20Var5, z20Var6, z20Var7, z20Var8, z20Var9};
    }

    public z20() {
        this.f40841a = "hints_controller_" + this;
        this.f40842b = 3;
        this.f40843c = 1.0f;
    }

    public static z20 valueOf(String str) {
        return (z20) Enum.valueOf(z20.class, str);
    }

    public static z20[] values() {
        return (z20[]) f40840y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.f40841a, this.f40842b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.f40841a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.f40841a, 0) < this.f40842b) {
            float f10 = this.f40843c;
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
        this.f40841a = str2;
        this.f40842b = i10;
        this.f40843c = f10;
    }
}
