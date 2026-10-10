package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class b50 {
    public static final b50 d;
    public static final b50 f24867e;
    public static final b50 f24868f;
    public static final b50 h;
    public static final b50 f24869n;
    public static final b50 f24870r;
    public static final b50 f24871s;
    public static final b50 v;
    public static final b50 f24872w;
    public static final b50[] f24873x;
    public final String f24874a;
    public final int f24875b;
    public final float f24876c;

    static {
        b50 b50Var = new b50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = b50Var;
        b50 b50Var2 = new b50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f24867e = b50Var2;
        b50 b50Var3 = new b50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f24868f = b50Var3;
        b50 b50Var4 = new b50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = b50Var4;
        b50 b50Var5 = new b50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f24869n = b50Var5;
        b50 b50Var6 = new b50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f24870r = b50Var6;
        b50 b50Var7 = new b50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f24871s = b50Var7;
        b50 b50Var8 = new b50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = b50Var8;
        b50 b50Var9 = new b50();
        f24872w = b50Var9;
        f24873x = new b50[]{b50Var, b50Var2, b50Var3, b50Var4, b50Var5, b50Var6, b50Var7, b50Var8, b50Var9};
    }

    public b50() {
        this.f24874a = "hints_controller_" + this;
        this.f24875b = 3;
        this.f24876c = 1.0f;
    }

    public static b50 valueOf(String str) {
        return (b50) Enum.valueOf(b50.class, str);
    }

    public static b50[] values() {
        return (b50[]) f24873x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f24874a, this.f24875b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f24874a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f24874a, 0) < this.f24875b) {
            float f7 = this.f24876c;
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

    public b50(String str, int i10, String str2, int i11, float f7) {
        this.f24874a = str2;
        this.f24875b = i11;
        this.f24876c = f7;
    }
}
