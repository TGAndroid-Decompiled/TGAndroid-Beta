package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class j40 {
    public static final j40 d;
    public static final j40 e;
    public static final j40 f25162f;
    public static final j40 h;
    public static final j40 f25163n;
    public static final j40 f25164r;
    public static final j40 f25165s;
    public static final j40 v;
    public static final j40[] f25166w;
    public final String f25167a;
    public final int f25168b;
    public final float f25169c;

    static {
        j40 j40Var = new j40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = j40Var;
        j40 j40Var2 = new j40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = j40Var2;
        j40 j40Var3 = new j40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25162f = j40Var3;
        j40 j40Var4 = new j40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = j40Var4;
        j40 j40Var5 = new j40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25163n = j40Var5;
        j40 j40Var6 = new j40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25164r = j40Var6;
        j40 j40Var7 = new j40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25165s = j40Var7;
        j40 j40Var8 = new j40();
        v = j40Var8;
        f25166w = new j40[]{j40Var, j40Var2, j40Var3, j40Var4, j40Var5, j40Var6, j40Var7, j40Var8};
    }

    public j40() {
        this.f25167a = "hints_controller_" + this;
        this.f25168b = 3;
        this.f25169c = 1.0f;
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) f25166w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25167a, this.f25168b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25167a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25167a, 0) < this.f25168b) {
            float f7 = this.f25169c;
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
        this.f25167a = str2;
        this.f25168b = i11;
        this.f25169c = f7;
    }
}
