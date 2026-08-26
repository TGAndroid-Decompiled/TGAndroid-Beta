package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;

public final class GalleryListView$12$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final GalleryListView.AnonymousClass12 f$0;

    public GalleryListView$12$$ExternalSyntheticLambda0(GalleryListView.AnonymousClass12 anonymousClass12, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.this$0.invalidate();
                break;
            default:
                this.f$0.this$0.invalidate();
                break;
        }
    }
}
