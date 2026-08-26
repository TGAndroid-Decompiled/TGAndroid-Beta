package org.telegram.ui.Components.Paint;

public final class Painting$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Painting f$0;

    public Painting$$ExternalSyntheticLambda0(Painting painting, int i) {
        this.$r8$classId = i;
        this.f$0 = painting;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Painting painting = this.f$0;
                painting.activeShape = null;
                RenderView.AnonymousClass2 anonymousClass2 = painting.delegate;
                if (anonymousClass2 != null) {
                    anonymousClass2.contentChanged();
                }
                break;
            default:
                this.f$0.clearStrokeInternal();
                break;
        }
    }
}
