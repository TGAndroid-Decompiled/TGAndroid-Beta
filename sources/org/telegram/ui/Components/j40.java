package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class j40 {
    public static final j40 d;
    public static final j40 f27334e;
    public static final j40 f27335f;
    public static final j40 h;
    public static final j40 f27336n;
    public static final j40 f27337r;
    public static final j40 f27338s;
    public static final j40 v;
    public static final j40[] f27339w;
    public final String f27340a;
    public final int f27341b;
    public final float f27342c;

    static {
        j40 j40Var = new j40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = j40Var;
        j40 j40Var2 = new j40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f27334e = j40Var2;
        j40 j40Var3 = new j40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f27335f = j40Var3;
        j40 j40Var4 = new j40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = j40Var4;
        j40 j40Var5 = new j40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f27336n = j40Var5;
        j40 j40Var6 = new j40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f27337r = j40Var6;
        j40 j40Var7 = new j40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f27338s = j40Var7;
        j40 j40Var8 = new j40();
        v = j40Var8;
        f27339w = new j40[]{j40Var, j40Var2, j40Var3, j40Var4, j40Var5, j40Var6, j40Var7, j40Var8};
    }

    public j40() {
        this.f27340a = "hints_controller_" + this;
        this.f27341b = 3;
        this.f27342c = 1.0f;
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) f27339w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f27340a, this.f27341b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f27340a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f27340a, 0) < this.f27341b) {
            float f7 = this.f27342c;
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
        this.f27340a = str2;
        this.f27341b = i11;
        this.f27342c = f7;
    }
}
