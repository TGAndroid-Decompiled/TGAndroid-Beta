package org.telegram.ui;

import org.telegram.ui.Components.ItemOptions;

public final class ChatActivity$$ExternalSyntheticLambda268 implements Runnable {
    public final ItemOptions f$0;

    public ChatActivity$$ExternalSyntheticLambda268(ItemOptions itemOptions) {
        this.f$0 = itemOptions;
    }

    @Override
    public final void run() {
        this.f$0.closeSwipeback();
    }
}
