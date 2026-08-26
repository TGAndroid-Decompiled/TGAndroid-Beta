package org.telegram.ui.Components;

public final class LinkSpanDrawable$LinkCollector$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LinkSpanDrawable.LinkCollector f$0;
    public final LinkSpanDrawable f$1;

    public LinkSpanDrawable$LinkCollector$$ExternalSyntheticLambda1(LinkSpanDrawable.LinkCollector linkCollector, LinkSpanDrawable linkSpanDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = linkCollector;
        this.f$1 = linkSpanDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeLink$0(this.f$1);
                break;
            default:
                this.f$0.lambda$removeLink$1(this.f$1);
                break;
        }
    }
}
