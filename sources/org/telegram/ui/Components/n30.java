package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class n30 {
    public static final n30 d;
    public static final n30 f37756e;
    public static final n30 f37757f;
    public static final n30 h;
    public static final n30 f37758n;
    public static final n30 f37759r;
    public static final n30 f37760s;
    public static final n30 f37761w;
    public static final n30 f37762x;
    public static final n30[] f37763y;
    public final String f37764a;
    public final int f37765b;
    public final float f37766c;

    static {
        n30 n30Var = new n30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n30Var;
        n30 n30Var2 = new n30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f37756e = n30Var2;
        n30 n30Var3 = new n30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f37757f = n30Var3;
        n30 n30Var4 = new n30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n30Var4;
        n30 n30Var5 = new n30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f37758n = n30Var5;
        n30 n30Var6 = new n30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f37759r = n30Var6;
        n30 n30Var7 = new n30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f37760s = n30Var7;
        n30 n30Var8 = new n30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f37761w = n30Var8;
        n30 n30Var9 = new n30();
        f37762x = n30Var9;
        f37763y = new n30[]{n30Var, n30Var2, n30Var3, n30Var4, n30Var5, n30Var6, n30Var7, n30Var8, n30Var9};
    }

    public n30() {
        this.f37764a = "hints_controller_" + this;
        this.f37765b = 3;
        this.f37766c = 1.0f;
    }

    public static n30 valueOf(String str) {
        return (n30) Enum.valueOf(n30.class, str);
    }

    public static n30[] values() {
        return (n30[]) f37763y.clone();
    }

    public final void a() {
        org.telegram.messenger.np.g1().edit().putInt(this.f37764a, this.f37765b).apply();
    }

    public final void b() {
        SharedPreferences g12 = org.telegram.messenger.np.g1();
        String str = this.f37764a;
        org.telegram.messenger.np.g1().edit().putInt(str, g12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.np.g1().getInt(this.f37764a, 0) < this.f37765b) {
            float f10 = this.f37766c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f22809c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public n30(String str, int i7, String str2, int i10, float f10) {
        this.f37764a = str2;
        this.f37765b = i10;
        this.f37766c = f10;
    }
}
