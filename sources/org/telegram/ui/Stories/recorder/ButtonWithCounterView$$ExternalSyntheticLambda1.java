package org.telegram.ui.Stories.recorder;

public final class ButtonWithCounterView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ButtonWithCounterView f$0;
    public final Runnable f$1;

    public ButtonWithCounterView$$ExternalSyntheticLambda1(ButtonWithCounterView buttonWithCounterView, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonWithCounterView;
        this.f$1 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setTimer$0(this.f$1);
                break;
            default:
                ButtonWithCounterView buttonWithCounterView = this.f$0;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setLoading(false);
                }
                Runnable runnable = this.f$1;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
