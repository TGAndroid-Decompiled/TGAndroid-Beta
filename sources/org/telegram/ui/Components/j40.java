package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class j40 {
    public static final j40 d;
    public static final j40 f27335e;
    public static final j40 f27336f;
    public static final j40 h;
    public static final j40 f27337n;
    public static final j40 f27338r;
    public static final j40 f27339s;
    public static final j40 v;
    public static final j40[] f27340w;
    public final String f27341a;
    public final int f27342b;
    public final float f27343c;

    static {
        j40 j40Var = new j40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = j40Var;
        j40 j40Var2 = new j40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        f27335e = j40Var2;
        j40 j40Var3 = new j40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f27336f = j40Var3;
        j40 j40Var4 = new j40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = j40Var4;
        j40 j40Var5 = new j40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f27337n = j40Var5;
        j40 j40Var6 = new j40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f27338r = j40Var6;
        j40 j40Var7 = new j40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f27339s = j40Var7;
        j40 j40Var8 = new j40();
        v = j40Var8;
        f27340w = new j40[]{j40Var, j40Var2, j40Var3, j40Var4, j40Var5, j40Var6, j40Var7, j40Var8};
    }

    public j40() {
        this.f27341a = "hints_controller_" + this;
        this.f27342b = 3;
        this.f27343c = 1.0f;
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) f27340w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f27341a, this.f27342b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f27341a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f27341a, 0) < this.f27342b) {
            float f7 = this.f27343c;
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

    public j40(String str, int i10, String str2, int i11, float f7) {
        this.f27341a = str2;
        this.f27342b = i11;
        this.f27343c = f7;
    }
}
