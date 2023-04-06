package org.telegram.ui;

import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
public final class ChatActivity$ChatActivityFragmentView$$ExternalSyntheticLambda1 implements Runnable {
    public static final ChatActivity$ChatActivityFragmentView$$ExternalSyntheticLambda1 INSTANCE = new ChatActivity$ChatActivityFragmentView$$ExternalSyntheticLambda1();

    private ChatActivity$ChatActivityFragmentView$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run() {
        ReactionsEffectOverlay.removeCurrent(true);
    }
}
