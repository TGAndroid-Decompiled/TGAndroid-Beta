package org.telegram.p009ui;

import org.telegram.p009ui.Components.Reactions.ReactionsEffectOverlay;

public final class ChatActivity$16$$ExternalSyntheticLambda1 implements Runnable {
    public static final ChatActivity$16$$ExternalSyntheticLambda1 INSTANCE = new ChatActivity$16$$ExternalSyntheticLambda1();

    private ChatActivity$16$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run() {
        ReactionsEffectOverlay.removeCurrent(true);
    }
}
