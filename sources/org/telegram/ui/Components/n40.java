package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class n40 {
    public static final n40 d;
    public static final n40 f29387e;
    public static final n40 f29388f;
    public static final n40 h;
    public static final n40 f29389n;
    public static final n40 f29390r;
    public static final n40 f29391s;
    public static final n40 v;
    public static final n40[] f29392w;
    public final String f29393a;
    public final int f29394b;
    public final float f29395c;

    static {
        n40 n40Var = new n40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n40Var;
        n40 n40Var2 = new n40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f29387e = n40Var2;
        n40 n40Var3 = new n40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f29388f = n40Var3;
        n40 n40Var4 = new n40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n40Var4;
        n40 n40Var5 = new n40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f29389n = n40Var5;
        n40 n40Var6 = new n40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f29390r = n40Var6;
        n40 n40Var7 = new n40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f29391s = n40Var7;
        n40 n40Var8 = new n40();
        v = n40Var8;
        f29392w = new n40[]{n40Var, n40Var2, n40Var3, n40Var4, n40Var5, n40Var6, n40Var7, n40Var8};
    }

    public n40() {
        this.f29393a = "hints_controller_" + this;
        this.f29394b = 3;
        this.f29395c = 1.0f;
    }

    public static n40 valueOf(String str) {
        return (n40) Enum.valueOf(n40.class, str);
    }

    public static n40[] values() {
        return (n40[]) f29392w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f29393a, this.f29394b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f29393a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f29393a, 0) < this.f29394b) {
            float f10 = this.f29395c;
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
        this.f29393a = str2;
        this.f29394b = i11;
        this.f29395c = f10;
    }
}
