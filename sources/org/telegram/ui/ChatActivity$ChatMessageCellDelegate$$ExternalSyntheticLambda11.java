package org.telegram.ui;

import org.telegram.messenger.browser.Browser;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda11 implements Runnable {
    public final Browser.Progress f$0;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda11(Browser.Progress progress) {
        this.f$0 = progress;
    }

    @Override
    public final void run() {
        this.f$0.end();
    }
}
