package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class d50 {
    public static final d50 d;
    public static final d50 f25241e;
    public static final d50 f25242f;
    public static final d50 h;
    public static final d50 f25243n;
    public static final d50 f25244r;
    public static final d50 f25245s;
    public static final d50 v;
    public static final d50 f25246w;
    public static final d50[] f25247x;
    public final String f25248a;
    public final int f25249b;
    public final float f25250c;

    static {
        d50 d50Var = new d50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = d50Var;
        d50 d50Var2 = new d50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f25241e = d50Var2;
        d50 d50Var3 = new d50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f25242f = d50Var3;
        d50 d50Var4 = new d50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = d50Var4;
        d50 d50Var5 = new d50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f25243n = d50Var5;
        d50 d50Var6 = new d50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f25244r = d50Var6;
        d50 d50Var7 = new d50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f25245s = d50Var7;
        d50 d50Var8 = new d50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = d50Var8;
        d50 d50Var9 = new d50();
        f25246w = d50Var9;
        f25247x = new d50[]{d50Var, d50Var2, d50Var3, d50Var4, d50Var5, d50Var6, d50Var7, d50Var8, d50Var9};
    }

    public d50() {
        this.f25248a = "hints_controller_" + this;
        this.f25249b = 3;
        this.f25250c = 1.0f;
    }

    public static d50 valueOf(String str) {
        return (d50) Enum.valueOf(d50.class, str);
    }

    public static d50[] values() {
        return (d50[]) f25247x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f25248a, this.f25249b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f25248a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f25248a, 0) < this.f25249b) {
            float f7 = this.f25250c;
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
        this.f25248a = str2;
        this.f25249b = i11;
        this.f25250c = f7;
    }
}
