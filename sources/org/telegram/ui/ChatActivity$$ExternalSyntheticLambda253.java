package org.telegram.ui;

import android.content.res.Resources;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

public final class ChatActivity$$ExternalSyntheticLambda253 implements Utilities.Callback {
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda253(ChatActivity chatActivity) {
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(Object obj) throws Resources.NotFoundException {
        this.f$0.showFieldPanelForSuggestionParams((MessageSuggestionParams) obj);
    }
}
