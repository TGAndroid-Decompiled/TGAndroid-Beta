package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class t40 {
    public static final t40 d;
    public static final t40 e;
    public static final t40 f27307f;
    public static final t40 h;
    public static final t40 f27308n;
    public static final t40 f27309r;
    public static final t40 f27310s;
    public static final t40 v;
    public static final t40[] f27311w;
    public final String f27312a;
    public final int f27313b;
    public final float f27314c;

    static {
        t40 t40Var = new t40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = t40Var;
        t40 t40Var2 = new t40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = t40Var2;
        t40 t40Var3 = new t40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f27307f = t40Var3;
        t40 t40Var4 = new t40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = t40Var4;
        t40 t40Var5 = new t40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f27308n = t40Var5;
        t40 t40Var6 = new t40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f27309r = t40Var6;
        t40 t40Var7 = new t40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f27310s = t40Var7;
        t40 t40Var8 = new t40();
        v = t40Var8;
        f27311w = new t40[]{t40Var, t40Var2, t40Var3, t40Var4, t40Var5, t40Var6, t40Var7, t40Var8};
    }

    public t40() {
        this.f27312a = "hints_controller_" + this;
        this.f27313b = 3;
        this.f27314c = 1.0f;
    }

    public static t40 valueOf(String str) {
        return (t40) Enum.valueOf(t40.class, str);
    }

    public static t40[] values() {
        return (t40[]) f27311w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f27312a, this.f27313b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f27312a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f27312a, 0) < this.f27313b) {
            float f7 = this.f27314c;
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

    public t40(String str, int i10, String str2, int i11, float f7) {
        this.f27312a = str2;
        this.f27313b = i11;
        this.f27314c = f7;
    }
}
