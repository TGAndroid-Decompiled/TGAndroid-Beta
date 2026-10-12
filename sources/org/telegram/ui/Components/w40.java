package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class w40 {
    public static final w40 d;
    public static final w40 e;
    public static final w40 f30788f;
    public static final w40 h;
    public static final w40 f30789n;
    public static final w40 f30790r;
    public static final w40 f30791s;
    public static final w40 v;
    public static final w40 f30792w;
    public static final w40[] f30793x;
    public final String f30794a;
    public final int f30795b;
    public final float f30796c;

    static {
        w40 w40Var = new w40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = w40Var;
        w40 w40Var2 = new w40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = w40Var2;
        w40 w40Var3 = new w40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f30788f = w40Var3;
        w40 w40Var4 = new w40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = w40Var4;
        w40 w40Var5 = new w40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f30789n = w40Var5;
        w40 w40Var6 = new w40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f30790r = w40Var6;
        w40 w40Var7 = new w40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f30791s = w40Var7;
        w40 w40Var8 = new w40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = w40Var8;
        w40 w40Var9 = new w40();
        f30792w = w40Var9;
        f30793x = new w40[]{w40Var, w40Var2, w40Var3, w40Var4, w40Var5, w40Var6, w40Var7, w40Var8, w40Var9};
    }

    public w40() {
        this.f30794a = "hints_controller_" + this;
        this.f30795b = 3;
        this.f30796c = 1.0f;
    }

    public static w40 valueOf(String str) {
        return (w40) Enum.valueOf(w40.class, str);
    }

    public static w40[] values() {
        return (w40[]) f30793x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f30794a, this.f30795b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f30794a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f30794a, 0) < this.f30795b) {
            float f7 = this.f30796c;
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

    public w40(String str, int i10, String str2, int i11, float f7) {
        this.f30794a = str2;
        this.f30795b = i11;
        this.f30796c = f7;
    }
}
