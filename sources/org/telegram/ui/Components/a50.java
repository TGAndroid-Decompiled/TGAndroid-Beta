package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class a50 {
    public static final a50 d;
    public static final a50 f24600e;
    public static final a50 f24601f;
    public static final a50 h;
    public static final a50 f24602n;
    public static final a50 f24603r;
    public static final a50 f24604s;
    public static final a50 v;
    public static final a50 f24605w;
    public static final a50[] f24606x;
    public final String f24607a;
    public final int f24608b;
    public final float f24609c;

    static {
        a50 a50Var = new a50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = a50Var;
        a50 a50Var2 = new a50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f24600e = a50Var2;
        a50 a50Var3 = new a50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f24601f = a50Var3;
        a50 a50Var4 = new a50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = a50Var4;
        a50 a50Var5 = new a50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f24602n = a50Var5;
        a50 a50Var6 = new a50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f24603r = a50Var6;
        a50 a50Var7 = new a50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f24604s = a50Var7;
        a50 a50Var8 = new a50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = a50Var8;
        a50 a50Var9 = new a50();
        f24605w = a50Var9;
        f24606x = new a50[]{a50Var, a50Var2, a50Var3, a50Var4, a50Var5, a50Var6, a50Var7, a50Var8, a50Var9};
    }

    public a50() {
        this.f24607a = "hints_controller_" + this;
        this.f24608b = 3;
        this.f24609c = 1.0f;
    }

    public static a50 valueOf(String str) {
        return (a50) Enum.valueOf(a50.class, str);
    }

    public static a50[] values() {
        return (a50[]) f24606x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f24607a, this.f24608b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f24607a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f24607a, 0) < this.f24608b) {
            float f7 = this.f24609c;
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

    public a50(String str, int i10, String str2, int i11, float f7) {
        this.f24607a = str2;
        this.f24608b = i11;
        this.f24609c = f7;
    }
}
