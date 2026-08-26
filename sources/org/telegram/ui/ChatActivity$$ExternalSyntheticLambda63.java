package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;

public final class ChatActivity$$ExternalSyntheticLambda63 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda63(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showSuggestionOfferForEditMessage$357((MessageSuggestionParams) obj);
                break;
            case 1:
                ChatActivity.access$12100(this.f$0, ((Integer) obj).intValue());
                break;
            case 2:
                ChatActivity.access$12100(this.f$0, ((Integer) obj).intValue());
                break;
            case 3:
                this.f$0.lambda$createView$72((Boolean) obj);
                break;
            case 4:
                this.f$0.lambda$openHashtagSearch$368((String) obj);
                break;
            case 5:
                this.f$0.lambda$createView$31((Long) obj);
                break;
            case 6:
                this.f$0.lambda$createView$29((ActionBarMenuItem) obj);
                break;
            default:
                this.f$0.showFieldPanelForSuggestionParams((MessageSuggestionParams) obj);
                break;
        }
    }
}
