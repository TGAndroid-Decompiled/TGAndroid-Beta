package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class r30 {
    public static final r30 d;
    public static final r30 e;
    public static final r30 f29868f;
    public static final r30 h;
    public static final r30 f29869n;
    public static final r30 f29870r;
    public static final r30 f29871s;
    public static final r30 f29872w;
    public static final r30 f29873x;
    public static final r30[] f29874y;
    public final String f29875a;
    public final int f29876b;
    public final float f29877c;

    static {
        r30 r30Var = new r30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = r30Var;
        r30 r30Var2 = new r30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = r30Var2;
        r30 r30Var3 = new r30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f29868f = r30Var3;
        r30 r30Var4 = new r30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = r30Var4;
        r30 r30Var5 = new r30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f29869n = r30Var5;
        r30 r30Var6 = new r30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f29870r = r30Var6;
        r30 r30Var7 = new r30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f29871s = r30Var7;
        r30 r30Var8 = new r30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f29872w = r30Var8;
        r30 r30Var9 = new r30();
        f29873x = r30Var9;
        f29874y = new r30[]{r30Var, r30Var2, r30Var3, r30Var4, r30Var5, r30Var6, r30Var7, r30Var8, r30Var9};
    }

    public r30() {
        this.f29875a = "hints_controller_" + this;
        this.f29876b = 3;
        this.f29877c = 1.0f;
    }

    public static r30 valueOf(String str) {
        return (r30) Enum.valueOf(r30.class, str);
    }

    public static r30[] values() {
        return (r30[]) f29874y.clone();
    }

    public final void a() {
        org.telegram.messenger.wp.d1().edit().putInt(this.f29875a, this.f29876b).apply();
    }

    public final void b() {
        SharedPreferences d12 = org.telegram.messenger.wp.d1();
        String str = this.f29875a;
        org.telegram.messenger.wp.d1().edit().putInt(str, d12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.wp.d1().getInt(this.f29875a, 0) < this.f29876b) {
            float f7 = this.f29877c;
            if (f7 < 1.0f) {
                if (f7 > 0.0f && Utilities.f14521c.nextFloat() < f7) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public r30(String str, int i10, String str2, int i11, float f7) {
        this.f29875a = str2;
        this.f29876b = i11;
        this.f29877c = f7;
    }
}
