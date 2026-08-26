package org.telegram.ui;

public final class NewContactBottomSheet$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final NewContactBottomSheet f$0;

    public NewContactBottomSheet$$ExternalSyntheticLambda9(NewContactBottomSheet newContactBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = newContactBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$25();
                break;
            default:
                this.f$0.lambda$show$24();
                break;
        }
    }
}
