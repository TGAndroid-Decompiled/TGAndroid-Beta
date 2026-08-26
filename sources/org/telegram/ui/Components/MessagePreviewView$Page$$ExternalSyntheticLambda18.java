package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class MessagePreviewView$Page$$ExternalSyntheticLambda18 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final int f$1;
    public final float f$2;

    public MessagePreviewView$Page$$ExternalSyntheticLambda18(FrameLayout frameLayout, int i, float f, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = i;
        this.f$2 = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((MessagePreviewView.Page) this.f$0).lambda$updatePositions$22(this.f$1, this.f$2, valueAnimator);
                break;
            default:
                ((ChatAttachAlertDocumentLayout) this.f$0).lambda$runAnimation$4(this.f$1, this.f$2, valueAnimator);
                break;
        }
    }
}
