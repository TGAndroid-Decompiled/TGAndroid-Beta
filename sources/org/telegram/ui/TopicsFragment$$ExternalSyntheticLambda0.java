package org.telegram.ui;

public final class TopicsFragment$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final TopicsFragment f$0;

    public TopicsFragment$$ExternalSyntheticLambda0(TopicsFragment topicsFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteTopics$12();
                break;
            case 1:
                this.f$0.lambda$createView$2();
                break;
            case 2:
                this.f$0.lambda$createView$7();
                break;
            case 3:
                this.f$0.lambda$joinToGroup$21();
                break;
            case 4:
                this.f$0.blur3_InvalidateBlur();
                break;
            default:
                this.f$0.finishPreviewFragment();
                break;
        }
    }
}
