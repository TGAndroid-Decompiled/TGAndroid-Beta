package org.telegram.ui;

import org.telegram.ui.Components.ChatActivityEnterView;

public final class ChatActivity$64$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.AnonymousClass64 f$0;

    public ChatActivity$64$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass64 anonymousClass64, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass64;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.AnonymousClass39 anonymousClass39 = ChatActivity.this.chatActivityEnterView;
                if (anonymousClass39 != null) {
                    anonymousClass39.emojiViewFrozen = false;
                    ChatActivityEnterView.AnonymousClass78 anonymousClass78 = anonymousClass39.emojiView;
                    if (anonymousClass78 != null) {
                        anonymousClass78.freeze(false);
                    }
                }
                break;
            default:
                ChatActivity.AnonymousClass39 anonymousClass310 = ChatActivity.this.chatActivityEnterView;
                if (anonymousClass310 != null) {
                    anonymousClass310.openKeyboard();
                }
                break;
        }
    }
}
