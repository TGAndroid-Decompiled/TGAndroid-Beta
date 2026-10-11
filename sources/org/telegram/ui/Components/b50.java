package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class b50 {
    public static final b50 d;
    public static final b50 f24851e;
    public static final b50 f24852f;
    public static final b50 h;
    public static final b50 f24853n;
    public static final b50 f24854r;
    public static final b50 f24855s;
    public static final b50 v;
    public static final b50 f24856w;
    public static final b50[] f24857x;
    public final String f24858a;
    public final int f24859b;
    public final float f24860c;

    static {
        b50 b50Var = new b50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = b50Var;
        b50 b50Var2 = new b50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f24851e = b50Var2;
        b50 b50Var3 = new b50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f24852f = b50Var3;
        b50 b50Var4 = new b50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = b50Var4;
        b50 b50Var5 = new b50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f24853n = b50Var5;
        b50 b50Var6 = new b50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f24854r = b50Var6;
        b50 b50Var7 = new b50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f24855s = b50Var7;
        b50 b50Var8 = new b50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = b50Var8;
        b50 b50Var9 = new b50();
        f24856w = b50Var9;
        f24857x = new b50[]{b50Var, b50Var2, b50Var3, b50Var4, b50Var5, b50Var6, b50Var7, b50Var8, b50Var9};
    }

    public b50() {
        this.f24858a = "hints_controller_" + this;
        this.f24859b = 3;
        this.f24860c = 1.0f;
    }

    public static b50 valueOf(String str) {
        return (b50) Enum.valueOf(b50.class, str);
    }

    public static b50[] values() {
        return (b50[]) f24857x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f24858a, this.f24859b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f24858a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f24858a, 0) < this.f24859b) {
            float f7 = this.f24860c;
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
        this.f24858a = str2;
        this.f24859b = i11;
        this.f24860c = f7;
    }
}
