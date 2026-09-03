package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class n40 {
    public static final n40 d;
    public static final n40 f29375e;
    public static final n40 f29376f;
    public static final n40 h;
    public static final n40 f29377n;
    public static final n40 f29378r;
    public static final n40 f29379s;
    public static final n40 v;
    public static final n40[] f29380w;
    public final String f29381a;
    public final int f29382b;
    public final float f29383c;

    static {
        n40 n40Var = new n40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n40Var;
        n40 n40Var2 = new n40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f29375e = n40Var2;
        n40 n40Var3 = new n40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f29376f = n40Var3;
        n40 n40Var4 = new n40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n40Var4;
        n40 n40Var5 = new n40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f29377n = n40Var5;
        n40 n40Var6 = new n40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f29378r = n40Var6;
        n40 n40Var7 = new n40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f29379s = n40Var7;
        n40 n40Var8 = new n40();
        v = n40Var8;
        f29380w = new n40[]{n40Var, n40Var2, n40Var3, n40Var4, n40Var5, n40Var6, n40Var7, n40Var8};
    }

    public n40() {
        this.f29381a = "hints_controller_" + this;
        this.f29382b = 3;
        this.f29383c = 1.0f;
    }

    public static n40 valueOf(String str) {
        return (n40) Enum.valueOf(n40.class, str);
    }

    public static n40[] values() {
        return (n40[]) f29380w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f29381a, this.f29382b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f29381a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f29381a, 0) < this.f29382b) {
            float f10 = this.f29383c;
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

    public n40(String str, int i10, String str2, int i11, float f10) {
        this.f29381a = str2;
        this.f29382b = i11;
        this.f29383c = f10;
    }
}
