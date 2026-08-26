package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import androidx.core.util.Consumer;

public final class Bulletin$Layout$DefaultTransition$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Consumer f$0;
    public final Bulletin.Layout f$1;

    public Bulletin$Layout$DefaultTransition$$ExternalSyntheticLambda0(Consumer consumer, Bulletin.Layout layout, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
        this.f$1 = layout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                Bulletin.Layout.DefaultTransition.lambda$animateExit$1(this.f$0, this.f$1, valueAnimator);
                break;
            default:
                Bulletin.Layout.DefaultTransition.lambda$animateEnter$0(this.f$0, this.f$1, valueAnimator);
                break;
        }
    }
}
