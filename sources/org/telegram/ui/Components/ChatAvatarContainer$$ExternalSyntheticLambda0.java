package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.SimpleTextView;

public final class ChatAvatarContainer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatAvatarContainer f$0;

    public ChatAvatarContainer$$ExternalSyntheticLambda0(ChatAvatarContainer chatAvatarContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAvatarContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAvatarContainer chatAvatarContainer = this.f$0;
                AtomicReference atomicReference = chatAvatarContainer.titleTextLargerCopyView;
                SimpleTextView simpleTextView = (SimpleTextView) atomicReference.get();
                if (simpleTextView != null) {
                    chatAvatarContainer.removeView(simpleTextView);
                    atomicReference.set(null);
                }
                break;
            case 1:
                ChatAvatarContainer chatAvatarContainer2 = this.f$0;
                AtomicReference atomicReference2 = chatAvatarContainer2.subtitleTextLargerCopyView;
                SimpleTextView simpleTextView2 = (SimpleTextView) atomicReference2.get();
                if (simpleTextView2 != null) {
                    chatAvatarContainer2.removeView(simpleTextView2);
                    atomicReference2.set(null);
                    if (!chatAvatarContainer2.allowDrawStories) {
                        chatAvatarContainer2.setClipChildren(true);
                    }
                }
                break;
            default:
                ChatAvatarContainer chatAvatarContainer3 = this.f$0;
                chatAvatarContainer3.pressed = false;
                chatAvatarContainer3.bounce.setPressed(false);
                if (chatAvatarContainer3.canSearch()) {
                    chatAvatarContainer3.openSearch();
                }
                break;
        }
    }
}
