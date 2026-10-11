package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class b50 {
    public static final b50 d;
    public static final b50 f24909e;
    public static final b50 f24910f;
    public static final b50 h;
    public static final b50 f24911n;
    public static final b50 f24912r;
    public static final b50 f24913s;
    public static final b50 v;
    public static final b50 f24914w;
    public static final b50[] f24915x;
    public final String f24916a;
    public final int f24917b;
    public final float f24918c;

    static {
        b50 b50Var = new b50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = b50Var;
        b50 b50Var2 = new b50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f24909e = b50Var2;
        b50 b50Var3 = new b50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f24910f = b50Var3;
        b50 b50Var4 = new b50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = b50Var4;
        b50 b50Var5 = new b50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f24911n = b50Var5;
        b50 b50Var6 = new b50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f24912r = b50Var6;
        b50 b50Var7 = new b50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f24913s = b50Var7;
        b50 b50Var8 = new b50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = b50Var8;
        b50 b50Var9 = new b50();
        f24914w = b50Var9;
        f24915x = new b50[]{b50Var, b50Var2, b50Var3, b50Var4, b50Var5, b50Var6, b50Var7, b50Var8, b50Var9};
    }

    public b50() {
        this.f24916a = "hints_controller_" + this;
        this.f24917b = 3;
        this.f24918c = 1.0f;
    }

    public static b50 valueOf(String str) {
        return (b50) Enum.valueOf(b50.class, str);
    }

    public static b50[] values() {
        return (b50[]) f24915x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f24916a, this.f24917b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f24916a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f24916a, 0) < this.f24917b) {
            float f7 = this.f24918c;
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
        this.f24916a = str2;
        this.f24917b = i11;
        this.f24918c = f7;
    }
}
