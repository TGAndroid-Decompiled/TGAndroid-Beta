package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class d50 {
    public static final d50 d;
    public static final d50 f25233e;
    public static final d50 f25234f;
    public static final d50 h;
    public static final d50 f25235n;
    public static final d50 f25236r;
    public static final d50 f25237s;
    public static final d50 v;
    public static final d50 f25238w;
    public static final d50[] f25239x;
    public final String f25240a;
    public final int f25241b;
    public final float f25242c;

    static {
        d50 d50Var = new d50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = d50Var;
        d50 d50Var2 = new d50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f25233e = d50Var2;
        d50 d50Var3 = new d50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25234f = d50Var3;
        d50 d50Var4 = new d50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = d50Var4;
        d50 d50Var5 = new d50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25235n = d50Var5;
        d50 d50Var6 = new d50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25236r = d50Var6;
        d50 d50Var7 = new d50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25237s = d50Var7;
        d50 d50Var8 = new d50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = d50Var8;
        d50 d50Var9 = new d50();
        f25238w = d50Var9;
        f25239x = new d50[]{d50Var, d50Var2, d50Var3, d50Var4, d50Var5, d50Var6, d50Var7, d50Var8, d50Var9};
    }

    public d50() {
        this.f25240a = "hints_controller_" + this;
        this.f25241b = 3;
        this.f25242c = 1.0f;
    }

    public static d50 valueOf(String str) {
        return (d50) Enum.valueOf(d50.class, str);
    }

    public static d50[] values() {
        return (d50[]) f25239x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25240a, this.f25241b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25240a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25240a, 0) < this.f25241b) {
            float f7 = this.f25242c;
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

    public d50(String str, int i10, String str2, int i11, float f7) {
        this.f25240a = str2;
        this.f25241b = i11;
        this.f25242c = f7;
    }
}
