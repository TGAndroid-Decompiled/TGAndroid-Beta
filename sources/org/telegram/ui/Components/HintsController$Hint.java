package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

public enum HintsController$Hint {
    RoundHint2("needShowRoundHint2", 3, 0.2f),
    RoundHintChannel2("needShowRoundHintChannel2", 3, 0.2f),
    ChannelSuggestHint("channelsuggesthint", 3, 0.2f),
    ChannelGiftHint("channelgifthint", 3, 0.2f),
    GroupEmojiPackHintShown("groupEmojiPackShownHint", 1, 1.0f),
    AccountSwitchHint("accountswitchhint", 3, 1.0f),
    GiftMessageHint("giftMessaheHint", 3, 1.0f),
    GuestBotPrivacy;

    public final String name;
    public final float probability;
    public final int showsLimit;

    HintsController$Hint() {
        this.name = "hints_controller_" + this;
        this.showsLimit = 3;
        this.probability = 1.0f;
    }

    public final void doNotShowAgain() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.name, this.showsLimit).apply();
    }

    public final void increment() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.name;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean show() {
        if (MessagesController.getGlobalMainSettings().getInt(this.name, 0) < this.showsLimit) {
            float f = this.probability;
            if (f >= 1.0f) {
                return true;
            }
            if (f > 0.0f && Utilities.fastRandom.nextFloat() < f) {
                return true;
            }
        }
        return false;
    }

    HintsController$Hint(String str, int i, float f) {
        this.name = str;
        this.showsLimit = i;
        this.probability = f;
    }
}
