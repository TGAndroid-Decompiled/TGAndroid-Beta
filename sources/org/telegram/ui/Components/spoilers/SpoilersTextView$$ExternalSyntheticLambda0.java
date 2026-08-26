package org.telegram.ui.Components.spoilers;

public final class SpoilersTextView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SpoilersTextView f$0;

    public SpoilersTextView$$ExternalSyntheticLambda0(SpoilersTextView spoilersTextView, int i) {
        this.$r8$classId = i;
        this.f$0 = spoilersTextView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$1$10();
                break;
            default:
                this.f$0.lambda$new$0$18();
                break;
        }
    }
}
