package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.EmojiPacksAlert;

public final class ChatActivity$$ExternalSyntheticLambda240 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final ArrayList f$1;

    public ChatActivity$$ExternalSyntheticLambda240(ChatActivity chatActivity, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                final ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(chatActivity, chatActivity.getParentActivity(), chatActivity.themeDelegate, this.f$1) {
                    @Override
                    public final void lambda$showGiftOfferSheet$15() {
                        super.lambda$showGiftOfferSheet$15();
                        ChatActivity chatActivity2 = ChatActivity.this;
                        chatActivity2.getClass();
                        chatActivity2.dimBehindView(false, true, 0.0f);
                    }
                };
                emojiPacksAlert.setCalcMandatoryInsets(chatActivity.isKeyboardVisible());
                emojiPacksAlert.setDimBehind(false);
                chatActivity.closeMenu(false);
                chatActivity.showDialog(emojiPacksAlert);
                break;
            default:
                ChatActivity chatActivity2 = this.f$0;
                if (chatActivity2.getParentActivity() != null && chatActivity2.getParentActivity() != null) {
                    new EmojiPacksAlert(chatActivity2, chatActivity2.getParentActivity(), chatActivity2.themeDelegate, this.f$1).show();
                    chatActivity2.closeMenu(true);
                    break;
                }
                break;
        }
    }
}
