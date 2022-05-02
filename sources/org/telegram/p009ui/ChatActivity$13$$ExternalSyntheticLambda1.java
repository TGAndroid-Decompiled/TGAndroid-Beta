package org.telegram.p009ui;

import org.telegram.p009ui.Components.Reactions.ReactionsEffectOverlay;

public final class ChatActivity$13$$ExternalSyntheticLambda1 implements Runnable {
    public static final ChatActivity$13$$ExternalSyntheticLambda1 INSTANCE = new ChatActivity$13$$ExternalSyntheticLambda1();

    private ChatActivity$13$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run() {
        ReactionsEffectOverlay.removeCurrent(true);
    }
}
