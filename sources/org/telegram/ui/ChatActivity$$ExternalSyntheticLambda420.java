package org.telegram.ui;

import org.telegram.ui.Components.Bulletin;

public final class ChatActivity$$ExternalSyntheticLambda420 implements Runnable {
    public final int $r8$classId;
    public final Bulletin.Layout f$0;

    public ChatActivity$$ExternalSyntheticLambda420(Bulletin.Layout layout, int i) {
        this.$r8$classId = i;
        this.f$0 = layout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                try {
                    this.f$0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                this.f$0.onExitTransitionStart();
                break;
            default:
                this.f$0.onEnterTransitionStart();
                break;
        }
    }
}
