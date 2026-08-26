package org.telegram.ui.Components.Paint.Views;

public final class LPhotoPaintView$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;
    public final EntityView f$1;

    public LPhotoPaintView$$ExternalSyntheticLambda17(LPhotoPaintView lPhotoPaintView, EntityView entityView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
        this.f$1 = entityView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showMenuForEntity$41(this.f$1);
                break;
            default:
                this.f$0.lambda$registerRemovalUndo$45(this.f$1);
                break;
        }
    }
}
