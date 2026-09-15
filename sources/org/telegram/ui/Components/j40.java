package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class j40 {
    public static final j40 d;
    public static final j40 e;
    public static final j40 f25220f;
    public static final j40 h;
    public static final j40 f25221n;
    public static final j40 f25222r;
    public static final j40 f25223s;
    public static final j40 v;
    public static final j40[] f25224w;
    public final String f25225a;
    public final int f25226b;
    public final float f25227c;

    static {
        j40 j40Var = new j40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = j40Var;
        j40 j40Var2 = new j40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = j40Var2;
        j40 j40Var3 = new j40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25220f = j40Var3;
        j40 j40Var4 = new j40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = j40Var4;
        j40 j40Var5 = new j40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25221n = j40Var5;
        j40 j40Var6 = new j40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25222r = j40Var6;
        j40 j40Var7 = new j40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25223s = j40Var7;
        j40 j40Var8 = new j40();
        v = j40Var8;
        f25224w = new j40[]{j40Var, j40Var2, j40Var3, j40Var4, j40Var5, j40Var6, j40Var7, j40Var8};
    }

    public j40() {
        this.f25225a = "hints_controller_" + this;
        this.f25226b = 3;
        this.f25227c = 1.0f;
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) f25224w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25225a, this.f25226b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25225a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25225a, 0) < this.f25226b) {
            float f7 = this.f25227c;
            if (f7 < 1.0f) {
                if (f7 > 0.0f && Utilities.fastRandom.nextFloat() < f7) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public j40(String str, int i10, String str2, int i11, float f7) {
        this.f25225a = str2;
        this.f25226b = i11;
        this.f25227c = f7;
    }
}
