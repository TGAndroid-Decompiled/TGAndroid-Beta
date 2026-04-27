package org.telegram.ui;

import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda281 implements Runnable {
    public final ScrimOptions f$0;

    public ChatActivity$$ExternalSyntheticLambda281(ScrimOptions scrimOptions) {
        this.f$0 = scrimOptions;
    }

    @Override
    public final void run() {
        this.f$0.dismiss();
    }
}
