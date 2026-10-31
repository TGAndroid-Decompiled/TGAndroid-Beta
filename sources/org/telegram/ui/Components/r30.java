package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class r30 {
    public static final r30 d;
    public static final r30 e;
    public static final r30 f29810f;
    public static final r30 h;
    public static final r30 f29811n;
    public static final r30 f29812r;
    public static final r30 f29813s;
    public static final r30 f29814w;
    public static final r30 f29815x;
    public static final r30[] f29816y;
    public final String f29817a;
    public final int f29818b;
    public final float f29819c;

    static {
        r30 r30Var = new r30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = r30Var;
        r30 r30Var2 = new r30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = r30Var2;
        r30 r30Var3 = new r30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f29810f = r30Var3;
        r30 r30Var4 = new r30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = r30Var4;
        r30 r30Var5 = new r30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f29811n = r30Var5;
        r30 r30Var6 = new r30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f29812r = r30Var6;
        r30 r30Var7 = new r30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f29813s = r30Var7;
        r30 r30Var8 = new r30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f29814w = r30Var8;
        r30 r30Var9 = new r30();
        f29815x = r30Var9;
        f29816y = new r30[]{r30Var, r30Var2, r30Var3, r30Var4, r30Var5, r30Var6, r30Var7, r30Var8, r30Var9};
    }

    public r30() {
        this.f29817a = "hints_controller_" + this;
        this.f29818b = 3;
        this.f29819c = 1.0f;
    }

    public static r30 valueOf(String str) {
        return (r30) Enum.valueOf(r30.class, str);
    }

    public static r30[] values() {
        return (r30[]) f29816y.clone();
    }

    public final void a() {
        org.telegram.messenger.vp.d1().edit().putInt(this.f29817a, this.f29818b).apply();
    }

    public final void b() {
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        String str = this.f29817a;
        org.telegram.messenger.vp.d1().edit().putInt(str, d12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.vp.d1().getInt(this.f29817a, 0) < this.f29818b) {
            float f7 = this.f29819c;
            if (f7 < 1.0f) {
                if (f7 > 0.0f && Utilities.f14520c.nextFloat() < f7) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public r30(String str, int i10, String str2, int i11, float f7) {
        this.f29817a = str2;
        this.f29818b = i11;
        this.f29819c = f7;
    }
}
