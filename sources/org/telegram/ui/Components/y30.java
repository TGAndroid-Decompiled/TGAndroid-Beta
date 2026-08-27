package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

public enum y30 {
    RoundHint2("needShowRoundHint2", 3, 0.2f),
    RoundHintChannel2("needShowRoundHintChannel2", 3, 0.2f),
    ChannelSuggestHint("channelsuggesthint", 3, 0.2f),
    ChannelGiftHint("channelgifthint", 3, 0.2f),
    GroupEmojiPackHintShown("groupEmojiPackShownHint", 1, 1.0f),
    AccountSwitchHint("accountswitchhint", 3, 1.0f),
    GiftMessageHint("giftMessaheHint", 3, 1.0f),
    GuestBotPrivacy;


    public final String f34799a;

    public final int f34800b;

    public final float f34801c;

    y30() {
        this.f34799a = "hints_controller_" + this;
        this.f34800b = 3;
        this.f34801c = 1.0f;
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.f34799a, this.f34800b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.f34799a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.f34799a, 0) < this.f34800b) {
            float f10 = this.f34801c;
            if (f10 >= 1.0f) {
                return true;
            }
            if (f10 > 0.0f && Utilities.fastRandom.nextFloat() < f10) {
                return true;
            }
        }
        return false;
    }

    y30(String str, int i10, float f10) {
        this.f34799a = str;
        this.f34800b = i10;
        this.f34801c = f10;
    }
}
