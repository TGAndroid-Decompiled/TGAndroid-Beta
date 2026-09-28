package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m40 {
    public static final m40 d;
    public static final m40 e;
    public static final m40 f26285f;
    public static final m40 h;
    public static final m40 f26286n;
    public static final m40 f26287r;
    public static final m40 f26288s;
    public static final m40 v;
    public static final m40 f26289w;
    public static final m40[] f26290x;
    public final String f26291a;
    public final int f26292b;
    public final float f26293c;

    static {
        m40 m40Var = new m40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = m40Var;
        m40 m40Var2 = new m40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = m40Var2;
        m40 m40Var3 = new m40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f26285f = m40Var3;
        m40 m40Var4 = new m40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = m40Var4;
        m40 m40Var5 = new m40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        f26286n = m40Var5;
        m40 m40Var6 = new m40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        f26287r = m40Var6;
        m40 m40Var7 = new m40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        f26288s = m40Var7;
        m40 m40Var8 = new m40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = m40Var8;
        m40 m40Var9 = new m40();
        f26289w = m40Var9;
        f26290x = new m40[]{m40Var, m40Var2, m40Var3, m40Var4, m40Var5, m40Var6, m40Var7, m40Var8, m40Var9};
    }

    public m40() {
        this.f26291a = "hints_controller_" + this;
        this.f26292b = 3;
        this.f26293c = 1.0f;
    }

    public static m40 valueOf(String str) {
        return (m40) Enum.valueOf(m40.class, str);
    }

    public static m40[] values() {
        return (m40[]) f26290x.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f26291a, this.f26292b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f26291a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f26291a, 0) < this.f26292b) {
            float f7 = this.f26293c;
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

    public m40(String str, int i10, String str2, int i11, float f7) {
        this.f26291a = str2;
        this.f26292b = i11;
        this.f26293c = f7;
    }
}
