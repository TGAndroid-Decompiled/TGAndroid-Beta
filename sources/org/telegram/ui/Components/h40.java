package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class h40 {
    public static final h40 d;
    public static final h40 f29053e;
    public static final h40 f29054f;
    public static final h40 h;
    public static final h40 f29055n;
    public static final h40 f29056r;
    public static final h40 f29057s;
    public static final h40 v;
    public static final h40[] f29058w;
    public final String f29059a;
    public final int f29060b;
    public final float f29061c;

    static {
        h40 h40Var = new h40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = h40Var;
        h40 h40Var2 = new h40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f29053e = h40Var2;
        h40 h40Var3 = new h40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f29054f = h40Var3;
        h40 h40Var4 = new h40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = h40Var4;
        h40 h40Var5 = new h40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f29055n = h40Var5;
        h40 h40Var6 = new h40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f29056r = h40Var6;
        h40 h40Var7 = new h40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f29057s = h40Var7;
        h40 h40Var8 = new h40();
        v = h40Var8;
        f29058w = new h40[]{h40Var, h40Var2, h40Var3, h40Var4, h40Var5, h40Var6, h40Var7, h40Var8};
    }

    public h40() {
        this.f29059a = "hints_controller_" + this;
        this.f29060b = 3;
        this.f29061c = 1.0f;
    }

    public static h40 valueOf(String str) {
        return (h40) Enum.valueOf(h40.class, str);
    }

    public static h40[] values() {
        return (h40[]) f29058w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f29059a, this.f29060b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f29059a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f29059a, 0) < this.f29060b) {
            float f9 = this.f29061c;
            if (f9 < 1.0f) {
                if (f9 > 0.0f && Utilities.fastRandom.nextFloat() < f9) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public h40(String str, int i10, String str2, int i11, float f9) {
        this.f29059a = str2;
        this.f29060b = i11;
        this.f29061c = f9;
    }
}
