package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;

public final class ButtonWithCounterView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ButtonWithCounterView f$0;
    public final Runnable f$1;

    public ButtonWithCounterView$$ExternalSyntheticLambda3(ButtonWithCounterView buttonWithCounterView, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonWithCounterView;
        this.f$1 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ButtonWithCounterView buttonWithCounterView = this.f$0;
                int i = buttonWithCounterView.timerSeconds - 1;
                buttonWithCounterView.timerSeconds = i;
                buttonWithCounterView.setCount(i, true);
                if (buttonWithCounterView.timerSeconds <= 0) {
                    buttonWithCounterView.setClickable(true);
                    Runnable runnable = this.f$1;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    AndroidUtilities.runOnUIThread(buttonWithCounterView.tick, 1000L);
                }
                break;
            default:
                ButtonWithCounterView buttonWithCounterView2 = this.f$0;
                if (buttonWithCounterView2 != null) {
                    buttonWithCounterView2.setLoading(false);
                }
                Runnable runnable2 = this.f$1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}
