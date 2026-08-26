package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

public final class MessagePreviewView$Page$7$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final MessagePreviewView.Page.AnonymousClass7 f$0;

    public MessagePreviewView$Page$7$$ExternalSyntheticLambda0(MessagePreviewView.Page.AnonymousClass7 anonymousClass7, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass7;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagePreviewView.Page.AnonymousClass7 anonymousClass7 = this.f$0;
                if (anonymousClass7.scrollAnimationIndex != -1) {
                    NotificationCenter.getInstance(MessagePreviewView.Page.this.this$0.currentAccount).onAnimationFinish(anonymousClass7.scrollAnimationIndex);
                    anonymousClass7.scrollAnimationIndex = -1;
                }
                break;
            case 1:
                MessagePreviewView.Page.this.updateMessages();
                break;
            default:
                MessagePreviewView.Page.AnonymousClass7 anonymousClass8 = this.f$0;
                if (anonymousClass8.scrollAnimationIndex != -1) {
                    NotificationCenter.getInstance(MessagePreviewView.Page.this.this$0.currentAccount).onAnimationFinish(anonymousClass8.scrollAnimationIndex);
                    anonymousClass8.scrollAnimationIndex = -1;
                }
                break;
        }
    }
}
