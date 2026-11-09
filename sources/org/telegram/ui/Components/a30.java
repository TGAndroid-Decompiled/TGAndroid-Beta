package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class a30 {
    public static final a30 d;
    public static final a30 f31690e;
    public static final a30 f31691f;
    public static final a30 h;
    public static final a30 f31692n;
    public static final a30 f31693r;
    public static final a30 f31694s;
    public static final a30 f31695w;
    public static final a30 f31696x;
    public static final a30[] f31697y;
    public final String f31698a;
    public final int f31699b;
    public final float f31700c;

    static {
        a30 a30Var = new a30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = a30Var;
        a30 a30Var2 = new a30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f31690e = a30Var2;
        a30 a30Var3 = new a30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f31691f = a30Var3;
        a30 a30Var4 = new a30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = a30Var4;
        a30 a30Var5 = new a30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f31692n = a30Var5;
        a30 a30Var6 = new a30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f31693r = a30Var6;
        a30 a30Var7 = new a30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f31694s = a30Var7;
        a30 a30Var8 = new a30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f31695w = a30Var8;
        a30 a30Var9 = new a30();
        f31696x = a30Var9;
        f31697y = new a30[]{a30Var, a30Var2, a30Var3, a30Var4, a30Var5, a30Var6, a30Var7, a30Var8, a30Var9};
    }

    public a30() {
        this.f31698a = "hints_controller_" + this;
        this.f31699b = 3;
        this.f31700c = 1.0f;
    }

    public static a30 valueOf(String str) {
        return (a30) Enum.valueOf(a30.class, str);
    }

    public static a30[] values() {
        return (a30[]) f31697y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.f31698a, this.f31699b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.f31698a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.f31698a, 0) < this.f31699b) {
            float f10 = this.f31700c;
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

    public a30(String str, int i7, String str2, int i10, float f10) {
        this.f31698a = str2;
        this.f31699b = i10;
        this.f31700c = f10;
    }
}
