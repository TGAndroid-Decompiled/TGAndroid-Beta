package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class u40 {
    public static final u40 d;
    public static final u40 e;
    public static final u40 f33240f;
    public static final u40 h;
    public static final u40 f33241n;
    public static final u40 f33242r;
    public static final u40 f33243s;
    public static final u40 v;
    public static final u40 f33244w;
    public static final u40[] f33245x;
    public final String f33246a;
    public final int f33247b;
    public final float f33248c;

    static {
        u40 u40Var = new u40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = u40Var;
        u40 u40Var2 = new u40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = u40Var2;
        u40 u40Var3 = new u40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f33240f = u40Var3;
        u40 u40Var4 = new u40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = u40Var4;
        u40 u40Var5 = new u40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f33241n = u40Var5;
        u40 u40Var6 = new u40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f33242r = u40Var6;
        u40 u40Var7 = new u40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f33243s = u40Var7;
        u40 u40Var8 = new u40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = u40Var8;
        u40 u40Var9 = new u40();
        f33244w = u40Var9;
        f33245x = new u40[]{u40Var, u40Var2, u40Var3, u40Var4, u40Var5, u40Var6, u40Var7, u40Var8, u40Var9};
    }

    public u40() {
        this.f33246a = "hints_controller_" + this;
        this.f33247b = 3;
        this.f33248c = 1.0f;
    }

    public static u40 valueOf(String str) {
        return (u40) Enum.valueOf(u40.class, str);
    }

    public static u40[] values() {
        return (u40[]) f33245x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f33246a, this.f33247b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f33246a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f33246a, 0) < this.f33247b) {
            float f7 = this.f33248c;
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

    public u40(String str, int i10, String str2, int i11, float f7) {
        this.f33246a = str2;
        this.f33247b = i11;
        this.f33248c = f7;
    }
}
