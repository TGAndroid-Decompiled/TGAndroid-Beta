package org.telegram.ui.Components;

public final class StarRatingView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StarRatingView f$0;

    public StarRatingView$$ExternalSyntheticLambda0(StarRatingView starRatingView, int i) {
        this.$r8$classId = i;
        this.f$0 = starRatingView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onUpdateVisibilityFactor();
                break;
            default:
                this.f$0.lambda$onUpdateVisibilityFactor$0();
                break;
        }
    }
}
