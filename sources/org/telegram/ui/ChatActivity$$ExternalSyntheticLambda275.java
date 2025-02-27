package org.telegram.ui;

import org.telegram.ui.Components.ItemOptions;

public final class ChatActivity$$ExternalSyntheticLambda275 implements Runnable {
    public final ItemOptions f$0;

    public ChatActivity$$ExternalSyntheticLambda275(ItemOptions itemOptions) {
        this.f$0 = itemOptions;
    }

    @Override
    public final void run() {
        this.f$0.closeSwipeback();
    }
}
