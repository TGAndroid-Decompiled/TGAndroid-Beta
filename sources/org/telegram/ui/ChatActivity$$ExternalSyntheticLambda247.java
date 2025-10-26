package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

public final class ChatActivity$$ExternalSyntheticLambda247 implements Utilities.Callback {
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda247(ChatActivity chatActivity) {
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.showFieldPanelForSuggestionParams((MessageSuggestionParams) obj);
    }
}
