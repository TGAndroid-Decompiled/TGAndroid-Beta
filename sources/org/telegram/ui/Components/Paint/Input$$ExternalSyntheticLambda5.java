package org.telegram.ui.Components.Paint;

import org.telegram.messenger.AndroidUtilities;

public final class Input$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Input f$0;
    public final Path f$1;

    public Input$$ExternalSyntheticLambda5(Input input, Path path, int i) {
        this.$r8$classId = i;
        this.f$0 = input;
        this.f$1 = path;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Input input = this.f$0;
                input.getClass();
                AndroidUtilities.runOnUIThread(new Input$$ExternalSyntheticLambda5(input, this.f$1, 1));
                break;
            default:
                Input input2 = this.f$0;
                input2.getClass();
                input2.lastRemainder = this.f$1.remainder;
                break;
        }
    }
}
