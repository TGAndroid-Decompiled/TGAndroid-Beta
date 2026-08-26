package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class TextMessageEnterTransition$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final View f$1;
    public final Object f$2;

    public TextMessageEnterTransition$$ExternalSyntheticLambda1(int i, View view, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = view;
        this.f$2 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((TextMessageEnterTransition) this.f$0).lambda$new$0((ChatActivityEnterView) this.f$1, (MessageEnterTransitionContainer) this.f$2, valueAnimator);
                break;
            default:
                ((PremiumPreviewFragment.BackgroundView) this.f$0).lambda$updateText$2(this.f$1, (ValueAnimator) this.f$2, valueAnimator);
                break;
        }
    }
}
