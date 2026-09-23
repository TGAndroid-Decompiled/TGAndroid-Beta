package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class k40 {
    public static final k40 d;
    public static final k40 e;
    public static final k40 f25502f;
    public static final k40 h;
    public static final k40 f25503n;
    public static final k40 f25504r;
    public static final k40 f25505s;
    public static final k40 v;
    public static final k40[] f25506w;
    public final String f25507a;
    public final int f25508b;
    public final float f25509c;

    static {
        k40 k40Var = new k40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = k40Var;
        k40 k40Var2 = new k40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = k40Var2;
        k40 k40Var3 = new k40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25502f = k40Var3;
        k40 k40Var4 = new k40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = k40Var4;
        k40 k40Var5 = new k40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25503n = k40Var5;
        k40 k40Var6 = new k40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25504r = k40Var6;
        k40 k40Var7 = new k40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25505s = k40Var7;
        k40 k40Var8 = new k40();
        v = k40Var8;
        f25506w = new k40[]{k40Var, k40Var2, k40Var3, k40Var4, k40Var5, k40Var6, k40Var7, k40Var8};
    }

    public k40() {
        this.f25507a = "hints_controller_" + this;
        this.f25508b = 3;
        this.f25509c = 1.0f;
    }

    public static k40 valueOf(String str) {
        return (k40) Enum.valueOf(k40.class, str);
    }

    public static k40[] values() {
        return (k40[]) f25506w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25507a, this.f25508b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25507a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25507a, 0) < this.f25508b) {
            float f7 = this.f25509c;
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

    public k40(String str, int i10, String str2, int i11, float f7) {
        this.f25507a = str2;
        this.f25508b = i11;
        this.f25509c = f7;
    }
}
