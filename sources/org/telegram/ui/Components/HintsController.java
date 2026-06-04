package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

public abstract class HintsController {

    public enum Hint {
        RoundHint2("needShowRoundHint2", 3, 0.2f),
        RoundHintChannel2("needShowRoundHintChannel2", 3, 0.2f),
        ChannelSuggestHint("channelsuggesthint", 3, 0.2f),
        ChannelGiftHint("channelgifthint", 3, 0.2f),
        GroupEmojiPackHintShown("groupEmojiPackShownHint", 1, 1.0f),
        AccountSwitchHint("accountswitchhint", 3, 1.0f),
        GuestBotPrivacy(3, 1.0f);

        private final String name;
        private final float probability;
        private final int showsLimit;

        Hint(int i, float f) {
            this.name = "hints_controller_" + this;
            this.showsLimit = i;
            this.probability = f;
        }

        Hint(String str, int i, float f) {
            this.name = str;
            this.showsLimit = i;
            this.probability = f;
        }

        public boolean show() {
            if (MessagesController.getGlobalMainSettings().getInt(this.name, 0) >= this.showsLimit) {
                return false;
            }
            float f = this.probability;
            if (f >= 1.0f) {
                return true;
            }
            return f > 0.0f && Utilities.fastRandom.nextFloat() < this.probability;
        }

        public void increment() {
            MessagesController.getGlobalMainSettings().edit().putInt(this.name, MessagesController.getGlobalMainSettings().getInt(this.name, 0) + 1).apply();
        }

        public void doNotShowAgain() {
            MessagesController.getGlobalMainSettings().edit().putInt(this.name, this.showsLimit).apply();
        }
    }

    public static void resetAll() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        for (Hint hint : Hint.values()) {
            editorEdit.remove(hint.name);
        }
        editorEdit.apply();
    }
}
