package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class q40 {
    public static final q40 d;
    public static final q40 e;
    public static final q40 f29793f;
    public static final q40 h;
    public static final q40 f29794n;
    public static final q40 f29795r;
    public static final q40 f29796s;
    public static final q40 v;
    public static final q40 f29797w;
    public static final q40[] f29798x;
    public final String f29799a;
    public final int f29800b;
    public final float f29801c;

    static {
        q40 q40Var = new q40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = q40Var;
        q40 q40Var2 = new q40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = q40Var2;
        q40 q40Var3 = new q40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f29793f = q40Var3;
        q40 q40Var4 = new q40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = q40Var4;
        q40 q40Var5 = new q40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f29794n = q40Var5;
        q40 q40Var6 = new q40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f29795r = q40Var6;
        q40 q40Var7 = new q40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f29796s = q40Var7;
        q40 q40Var8 = new q40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = q40Var8;
        q40 q40Var9 = new q40();
        f29797w = q40Var9;
        f29798x = new q40[]{q40Var, q40Var2, q40Var3, q40Var4, q40Var5, q40Var6, q40Var7, q40Var8, q40Var9};
    }

    public q40() {
        this.f29799a = "hints_controller_" + this;
        this.f29800b = 3;
        this.f29801c = 1.0f;
    }

    public static q40 valueOf(String str) {
        return (q40) Enum.valueOf(q40.class, str);
    }

    public static q40[] values() {
        return (q40[]) f29798x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f29799a, this.f29800b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f29799a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f29799a, 0) < this.f29800b) {
            float f7 = this.f29801c;
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

    public q40(String str, int i10, String str2, int i11, float f7) {
        this.f29799a = str2;
        this.f29800b = i11;
        this.f29801c = f7;
    }
}
