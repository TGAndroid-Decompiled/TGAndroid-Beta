package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class n30 {
    public static final n30 d;
    public static final n30 f37751e;
    public static final n30 f37752f;
    public static final n30 h;
    public static final n30 f37753n;
    public static final n30 f37754r;
    public static final n30 f37755s;
    public static final n30 f37756w;
    public static final n30 f37757x;
    public static final n30[] f37758y;
    public final String f37759a;
    public final int f37760b;
    public final float f37761c;

    static {
        n30 n30Var = new n30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n30Var;
        n30 n30Var2 = new n30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f37751e = n30Var2;
        n30 n30Var3 = new n30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f37752f = n30Var3;
        n30 n30Var4 = new n30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n30Var4;
        n30 n30Var5 = new n30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f37753n = n30Var5;
        n30 n30Var6 = new n30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f37754r = n30Var6;
        n30 n30Var7 = new n30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f37755s = n30Var7;
        n30 n30Var8 = new n30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f37756w = n30Var8;
        n30 n30Var9 = new n30();
        f37757x = n30Var9;
        f37758y = new n30[]{n30Var, n30Var2, n30Var3, n30Var4, n30Var5, n30Var6, n30Var7, n30Var8, n30Var9};
    }

    public n30() {
        this.f37759a = "hints_controller_" + this;
        this.f37760b = 3;
        this.f37761c = 1.0f;
    }

    public static n30 valueOf(String str) {
        return (n30) Enum.valueOf(n30.class, str);
    }

    public static n30[] values() {
        return (n30[]) f37758y.clone();
    }

    public final void a() {
        org.telegram.messenger.mp.g1().edit().putInt(this.f37759a, this.f37760b).apply();
    }

    public final void b() {
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        String str = this.f37759a;
        org.telegram.messenger.mp.g1().edit().putInt(str, g12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.mp.g1().getInt(this.f37759a, 0) < this.f37760b) {
            float f10 = this.f37761c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f22806c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public n30(String str, int i7, String str2, int i10, float f10) {
        this.f37759a = str2;
        this.f37760b = i10;
        this.f37761c = f10;
    }
}
