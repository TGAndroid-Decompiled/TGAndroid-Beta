package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class k30 {
    public static final k30 d;
    public static final k30 f36654e;
    public static final k30 f36655f;
    public static final k30 h;
    public static final k30 f36656n;
    public static final k30 f36657r;
    public static final k30 f36658s;
    public static final k30 f36659w;
    public static final k30 f36660x;
    public static final k30[] f36661y;
    public final String f36662a;
    public final int f36663b;
    public final float f36664c;

    static {
        k30 k30Var = new k30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = k30Var;
        k30 k30Var2 = new k30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f36654e = k30Var2;
        k30 k30Var3 = new k30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f36655f = k30Var3;
        k30 k30Var4 = new k30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = k30Var4;
        k30 k30Var5 = new k30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f36656n = k30Var5;
        k30 k30Var6 = new k30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f36657r = k30Var6;
        k30 k30Var7 = new k30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f36658s = k30Var7;
        k30 k30Var8 = new k30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f36659w = k30Var8;
        k30 k30Var9 = new k30();
        f36660x = k30Var9;
        f36661y = new k30[]{k30Var, k30Var2, k30Var3, k30Var4, k30Var5, k30Var6, k30Var7, k30Var8, k30Var9};
    }

    public k30() {
        this.f36662a = "hints_controller_" + this;
        this.f36663b = 3;
        this.f36664c = 1.0f;
    }

    public static k30 valueOf(String str) {
        return (k30) Enum.valueOf(k30.class, str);
    }

    public static k30[] values() {
        return (k30[]) f36661y.clone();
    }

    public final void a() {
        org.telegram.messenger.mp.g1().edit().putInt(this.f36662a, this.f36663b).apply();
    }

    public final void b() {
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        String str = this.f36662a;
        org.telegram.messenger.mp.g1().edit().putInt(str, g12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.mp.g1().getInt(this.f36662a, 0) < this.f36663b) {
            float f10 = this.f36664c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f22778c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public k30(String str, int i7, String str2, int i10, float f10) {
        this.f36662a = str2;
        this.f36663b = i10;
        this.f36664c = f10;
    }
}
