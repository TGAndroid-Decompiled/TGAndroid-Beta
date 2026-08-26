package org.telegram.ui.Components;

import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class MessagePreviewView$Page$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final MessagePreviewView.Page f$0;

    public MessagePreviewView$Page$$ExternalSyntheticLambda10(MessagePreviewView.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.switchToQuote(true, false);
                break;
            default:
                MessagePreviewView.Page page = this.f$0;
                boolean z = page.this$0.messagePreviewParams.webpageTop;
                MessagePreviewView.Page.AnonymousClass6 anonymousClass6 = page.chatListView;
                if (!z) {
                    anonymousClass6.smoothScrollBy$1(anonymousClass6.computeVerticalScrollRange() - (anonymousClass6.computeVerticalScrollExtent() + anonymousClass6.computeVerticalScrollOffset()), 250, ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                } else {
                    anonymousClass6.smoothScrollBy$1(-anonymousClass6.computeVerticalScrollOffset(), 250, ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                }
                break;
        }
    }
}
