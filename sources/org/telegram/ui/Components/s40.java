package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class s40 {
    public static final s40 d;
    public static final s40 e;
    public static final s40 f30372f;
    public static final s40 h;
    public static final s40 f30373n;
    public static final s40 f30374r;
    public static final s40 f30375s;
    public static final s40 v;
    public static final s40 f30376w;
    public static final s40[] f30377x;
    public final String f30378a;
    public final int f30379b;
    public final float f30380c;

    static {
        s40 s40Var = new s40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = s40Var;
        s40 s40Var2 = new s40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = s40Var2;
        s40 s40Var3 = new s40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f30372f = s40Var3;
        s40 s40Var4 = new s40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = s40Var4;
        s40 s40Var5 = new s40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f30373n = s40Var5;
        s40 s40Var6 = new s40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f30374r = s40Var6;
        s40 s40Var7 = new s40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f30375s = s40Var7;
        s40 s40Var8 = new s40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = s40Var8;
        s40 s40Var9 = new s40();
        f30376w = s40Var9;
        f30377x = new s40[]{s40Var, s40Var2, s40Var3, s40Var4, s40Var5, s40Var6, s40Var7, s40Var8, s40Var9};
    }

    public s40() {
        this.f30378a = "hints_controller_" + this;
        this.f30379b = 3;
        this.f30380c = 1.0f;
    }

    public static s40 valueOf(String str) {
        return (s40) Enum.valueOf(s40.class, str);
    }

    public static s40[] values() {
        return (s40[]) f30377x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f30378a, this.f30379b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f30378a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f30378a, 0) < this.f30379b) {
            float f7 = this.f30380c;
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

    public s40(String str, int i10, String str2, int i11, float f7) {
        this.f30378a = str2;
        this.f30379b = i11;
        this.f30380c = f7;
    }
}
