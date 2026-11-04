package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class v20 {
    public static final v20 d;
    public static final v20 f38961e;
    public static final v20 f38962f;
    public static final v20 h;
    public static final v20 f38963n;
    public static final v20 f38964r;
    public static final v20 f38965s;
    public static final v20 f38966w;
    public static final v20 f38967x;
    public static final v20[] f38968y;
    public final String f38969a;
    public final int f38970b;
    public final float f38971c;

    static {
        v20 v20Var = new v20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = v20Var;
        v20 v20Var2 = new v20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f38961e = v20Var2;
        v20 v20Var3 = new v20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f38962f = v20Var3;
        v20 v20Var4 = new v20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = v20Var4;
        v20 v20Var5 = new v20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f38963n = v20Var5;
        v20 v20Var6 = new v20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f38964r = v20Var6;
        v20 v20Var7 = new v20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f38965s = v20Var7;
        v20 v20Var8 = new v20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        f38966w = v20Var8;
        v20 v20Var9 = new v20();
        f38967x = v20Var9;
        f38968y = new v20[]{v20Var, v20Var2, v20Var3, v20Var4, v20Var5, v20Var6, v20Var7, v20Var8, v20Var9};
    }

    public v20() {
        this.f38969a = "hints_controller_" + this;
        this.f38970b = 3;
        this.f38971c = 1.0f;
    }

    public static v20 valueOf(String str) {
        return (v20) Enum.valueOf(v20.class, str);
    }

    public static v20[] values() {
        return (v20[]) f38968y.clone();
    }

    public final void a() {
        org.telegram.messenger.hp.e1().edit().putInt(this.f38969a, this.f38970b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        String str = this.f38969a;
        org.telegram.messenger.hp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.hp.e1().getInt(this.f38969a, 0) < this.f38970b) {
            float f10 = this.f38971c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.f21386c.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public v20(String str, int i3, String str2, int i10, float f10) {
        this.f38969a = str2;
        this.f38970b = i10;
        this.f38971c = f10;
    }
}
