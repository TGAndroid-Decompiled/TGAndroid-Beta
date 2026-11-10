package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class z20 {
    public static final z20 d;
    public static final z20 f40832e;
    public static final z20 f40833f;
    public static final z20 h;
    public static final z20 f40834n;
    public static final z20 f40835r;
    public static final z20 f40836s;
    public static final z20 f40837w;
    public static final z20 f40838x;
    public static final z20[] f40839y;
    public final String f40840a;
    public final int f40841b;
    public final float f40842c;

    static {
        z20 z20Var = new z20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = z20Var;
        z20 z20Var2 = new z20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f40832e = z20Var2;
        z20 z20Var3 = new z20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f40833f = z20Var3;
        z20 z20Var4 = new z20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = z20Var4;
        z20 z20Var5 = new z20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f40834n = z20Var5;
        z20 z20Var6 = new z20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f40835r = z20Var6;
        z20 z20Var7 = new z20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f40836s = z20Var7;
        z20 z20Var8 = new z20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f40837w = z20Var8;
        z20 z20Var9 = new z20();
        f40838x = z20Var9;
        f40839y = new z20[]{z20Var, z20Var2, z20Var3, z20Var4, z20Var5, z20Var6, z20Var7, z20Var8, z20Var9};
    }

    public z20() {
        this.f40840a = "hints_controller_" + this;
        this.f40841b = 3;
        this.f40842c = 1.0f;
    }

    public static z20 valueOf(String str) {
        return (z20) Enum.valueOf(z20.class, str);
    }

    public static z20[] values() {
        return (z20[]) f40839y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.f40840a, this.f40841b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.f40840a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.f40840a, 0) < this.f40841b) {
            float f10 = this.f40842c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f21340c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public z20(String str, int i7, String str2, int i10, float f10) {
        this.f40840a = str2;
        this.f40841b = i10;
        this.f40842c = f10;
    }
}
