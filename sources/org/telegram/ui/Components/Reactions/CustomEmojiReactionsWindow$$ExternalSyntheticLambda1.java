package org.telegram.ui.Components.Reactions;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.SeekBarView$$ExternalSyntheticLambda1;
import org.telegram.ui.IntroActivity;

public final class CustomEmojiReactionsWindow$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final CustomEmojiReactionsWindow f$0;

    public CustomEmojiReactionsWindow$$ExternalSyntheticLambda1(CustomEmojiReactionsWindow customEmojiReactionsWindow, int i) {
        this.$r8$classId = i;
        this.f$0 = customEmojiReactionsWindow;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = this.f$0;
                IntroActivity.AnonymousClass1 anonymousClass1 = customEmojiReactionsWindow.windowView;
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
                    SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = customEmojiReactionsWindow.onDismiss;
                    if (seekBarView$$ExternalSyntheticLambda1 != null) {
                        seekBarView$$ExternalSyntheticLambda1.run();
                    }
                    break;
                }
                break;
            default:
                this.f$0.containerView.invalidate();
                break;
        }
    }
}
