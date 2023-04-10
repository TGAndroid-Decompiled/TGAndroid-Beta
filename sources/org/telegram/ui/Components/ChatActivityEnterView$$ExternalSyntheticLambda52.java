package org.telegram.ui.Components;

import org.telegram.ui.Components.AlertsCreator;
public final class ChatActivityEnterView$$ExternalSyntheticLambda52 implements AlertsCreator.ScheduleDatePickerDelegate {
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda52(ChatActivityEnterView chatActivityEnterView) {
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void didSelectDate(boolean z, int i) {
        this.f$0.sendMessageInternal(z, i);
    }
}
