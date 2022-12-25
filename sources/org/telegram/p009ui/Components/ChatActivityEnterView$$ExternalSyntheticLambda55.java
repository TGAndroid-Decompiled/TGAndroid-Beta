package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.AlertsCreator;

public final class ChatActivityEnterView$$ExternalSyntheticLambda55 implements AlertsCreator.ScheduleDatePickerDelegate {
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda55(ChatActivityEnterView chatActivityEnterView) {
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void didSelectDate(boolean z, int i) {
        this.f$0.sendMessageInternal(z, i);
    }
}
