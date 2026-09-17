package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class j40 {
    public static final j40 d;
    public static final j40 f27362e;
    public static final j40 f27363f;
    public static final j40 h;
    public static final j40 f27364n;
    public static final j40 f27365r;
    public static final j40 f27366s;
    public static final j40 v;
    public static final j40[] f27367w;
    public final String f27368a;
    public final int f27369b;
    public final float f27370c;

    static {
        j40 j40Var = new j40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = j40Var;
        j40 j40Var2 = new j40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f27362e = j40Var2;
        j40 j40Var3 = new j40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f27363f = j40Var3;
        j40 j40Var4 = new j40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = j40Var4;
        j40 j40Var5 = new j40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f27364n = j40Var5;
        j40 j40Var6 = new j40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f27365r = j40Var6;
        j40 j40Var7 = new j40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f27366s = j40Var7;
        j40 j40Var8 = new j40();
        v = j40Var8;
        f27367w = new j40[]{j40Var, j40Var2, j40Var3, j40Var4, j40Var5, j40Var6, j40Var7, j40Var8};
    }

    public j40() {
        this.f27368a = "hints_controller_" + this;
        this.f27369b = 3;
        this.f27370c = 1.0f;
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) f27367w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f27368a, this.f27369b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f27368a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f27368a, 0) < this.f27369b) {
            float f7 = this.f27370c;
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
        this.f27368a = str2;
        this.f27369b = i11;
        this.f27370c = f7;
    }
}
