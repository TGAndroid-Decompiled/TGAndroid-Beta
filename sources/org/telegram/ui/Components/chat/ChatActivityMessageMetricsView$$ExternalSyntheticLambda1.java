package org.telegram.ui.Components.chat;

import org.telegram.messenger.AndroidUtilities;

public final class ChatActivityMessageMetricsView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityMessageMetricsView f$0;

    public ChatActivityMessageMetricsView$$ExternalSyntheticLambda1(ChatActivityMessageMetricsView chatActivityMessageMetricsView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityMessageMetricsView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.flushImpl();
                break;
            default:
                ChatActivityMessageMetricsView chatActivityMessageMetricsView = this.f$0;
                AndroidUtilities.runOnUIThread(chatActivityMessageMetricsView.scheduledCheckRunnable, 400L);
                chatActivityMessageMetricsView.processCurrentFrame();
                break;
        }
    }
}
