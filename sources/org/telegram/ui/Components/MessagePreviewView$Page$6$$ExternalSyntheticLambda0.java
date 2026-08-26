package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;

public final class MessagePreviewView$Page$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;

    public MessagePreviewView$Page$6$$ExternalSyntheticLambda0(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagePreviewView.Page.AnonymousClass6) this.f$0).lambda$onLayout$0(this.f$1, this.f$2);
                break;
            case 1:
                Bulletin.LottieLayoutWithReactions.AnonymousClass2.lambda$showTaggedReactionToast$0(this.f$1, this.f$2, (BaseFragment) this.f$0);
                break;
            case 2:
                ChatNotificationsPopupWrapper.lambda$addAsItemOptions$14(this.f$1, this.f$2, (Utilities.Callback) this.f$0);
                break;
            default:
                ChatNotificationsPopupWrapper.lambda$new$4(this.f$1, this.f$2, (ChatNotificationsPopupWrapper.Callback) this.f$0);
                break;
        }
    }

    public MessagePreviewView$Page$6$$ExternalSyntheticLambda0(MessagePreviewView.Page.AnonymousClass6 anonymousClass6, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass6;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
