package org.telegram.ui.Components.Reactions;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;

public final class CustomEmojiReactionsWindow$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final CustomEmojiReactionsWindow f$0;

    public CustomEmojiReactionsWindow$$ExternalSyntheticLambda2(CustomEmojiReactionsWindow customEmojiReactionsWindow, int i) {
        this.$r8$classId = i;
        this.f$0 = customEmojiReactionsWindow;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.containerView.invalidate();
                break;
            default:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = this.f$0;
                CustomEmojiReactionsWindow.AnonymousClass1 anonymousClass1 = customEmojiReactionsWindow.windowView;
                if (anonymousClass1.getParent() != null) {
                    if (customEmojiReactionsWindow.attachToParent) {
                        AndroidUtilities.removeFromParent(anonymousClass1);
                    } else {
                        try {
                            customEmojiReactionsWindow.windowManager.removeView(anonymousClass1);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = customEmojiReactionsWindow.onDismiss;
                    if (tooltip$$ExternalSyntheticLambda0 != null) {
                        tooltip$$ExternalSyntheticLambda0.run();
                    }
                    break;
                }
                break;
        }
    }
}
