package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class n40 {
    public static final n40 d;
    public static final n40 f28961e;
    public static final n40 f28962f;
    public static final n40 h;
    public static final n40 f28963n;
    public static final n40 f28964r;
    public static final n40 f28965s;
    public static final n40 v;
    public static final n40 f28966w;
    public static final n40[] f28967x;
    public final String f28968a;
    public final int f28969b;
    public final float f28970c;

    static {
        n40 n40Var = new n40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n40Var;
        n40 n40Var2 = new n40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f28961e = n40Var2;
        n40 n40Var3 = new n40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f28962f = n40Var3;
        n40 n40Var4 = new n40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n40Var4;
        n40 n40Var5 = new n40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f28963n = n40Var5;
        n40 n40Var6 = new n40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f28964r = n40Var6;
        n40 n40Var7 = new n40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f28965s = n40Var7;
        n40 n40Var8 = new n40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = n40Var8;
        n40 n40Var9 = new n40();
        f28966w = n40Var9;
        f28967x = new n40[]{n40Var, n40Var2, n40Var3, n40Var4, n40Var5, n40Var6, n40Var7, n40Var8, n40Var9};
    }

    public n40() {
        this.f28968a = "hints_controller_" + this;
        this.f28969b = 3;
        this.f28970c = 1.0f;
    }

    public static n40 valueOf(String str) {
        return (n40) Enum.valueOf(n40.class, str);
    }

    public static n40[] values() {
        return (n40[]) f28967x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f28968a, this.f28969b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f28968a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f28968a, 0) < this.f28969b) {
            float f7 = this.f28970c;
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

    public n40(String str, int i10, String str2, int i11, float f7) {
        this.f28968a = str2;
        this.f28969b = i11;
        this.f28970c = f7;
    }
}
