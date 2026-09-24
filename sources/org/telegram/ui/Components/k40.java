package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class k40 {
    public static final k40 d;
    public static final k40 e;
    public static final k40 f25629f;
    public static final k40 h;
    public static final k40 f25630n;
    public static final k40 f25631r;
    public static final k40 f25632s;
    public static final k40 v;
    public static final k40[] f25633w;
    public final String f25634a;
    public final int f25635b;
    public final float f25636c;

    static {
        k40 k40Var = new k40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = k40Var;
        k40 k40Var2 = new k40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = k40Var2;
        k40 k40Var3 = new k40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25629f = k40Var3;
        k40 k40Var4 = new k40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = k40Var4;
        k40 k40Var5 = new k40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25630n = k40Var5;
        k40 k40Var6 = new k40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25631r = k40Var6;
        k40 k40Var7 = new k40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25632s = k40Var7;
        k40 k40Var8 = new k40();
        v = k40Var8;
        f25633w = new k40[]{k40Var, k40Var2, k40Var3, k40Var4, k40Var5, k40Var6, k40Var7, k40Var8};
    }

    public k40() {
        this.f25634a = "hints_controller_" + this;
        this.f25635b = 3;
        this.f25636c = 1.0f;
    }

    public static k40 valueOf(String str) {
        return (k40) Enum.valueOf(k40.class, str);
    }

    public static k40[] values() {
        return (k40[]) f25633w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25634a, this.f25635b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25634a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25634a, 0) < this.f25635b) {
            float f7 = this.f25636c;
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
        this.f25634a = str2;
        this.f25635b = i11;
        this.f25636c = f7;
    }
}
