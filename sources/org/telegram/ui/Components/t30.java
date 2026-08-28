package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class t30 {
    public static final t30 d;
    public static final t30 f32608e;
    public static final t30 f32609f;
    public static final t30 h;
    public static final t30 f32610n;
    public static final t30 f32611r;
    public static final t30 f32612s;
    public static final t30 v;
    public static final t30[] f32613w;
    public final String f32614a;
    public final int f32615b;
    public final float f32616c;

    static {
        t30 t30Var = new t30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = t30Var;
        t30 t30Var2 = new t30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f32608e = t30Var2;
        t30 t30Var3 = new t30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f32609f = t30Var3;
        t30 t30Var4 = new t30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = t30Var4;
        t30 t30Var5 = new t30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f32610n = t30Var5;
        t30 t30Var6 = new t30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f32611r = t30Var6;
        t30 t30Var7 = new t30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f32612s = t30Var7;
        t30 t30Var8 = new t30();
        v = t30Var8;
        f32613w = new t30[]{t30Var, t30Var2, t30Var3, t30Var4, t30Var5, t30Var6, t30Var7, t30Var8};
    }

    public t30() {
        this.f32614a = "hints_controller_" + this;
        this.f32615b = 3;
        this.f32616c = 1.0f;
    }

    public static t30 valueOf(String str) {
        return (t30) Enum.valueOf(t30.class, str);
    }

    public static t30[] values() {
        return (t30[]) f32613w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f32614a, this.f32615b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f32614a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f32614a, 0) < this.f32615b) {
            float f10 = this.f32616c;
            if (f10 < 1.0f) {
                if (f10 > 0.0f && Utilities.fastRandom.nextFloat() < f10) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public t30(String str, int i9, String str2, int i10, float f10) {
        this.f32614a = str2;
        this.f32615b = i10;
        this.f32616c = f10;
    }
}
