package org.telegram.ui.Components.Paint;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import com.stripe.android.Stripe;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class Painting$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Painting f$0;
    public final Shape f$1;

    public Painting$$ExternalSyntheticLambda0(Painting painting, Shape shape, int i) {
        this.$r8$classId = i;
        this.f$0 = painting;
        this.f$1 = shape;
    }

    @Override
    public final void run() {
        Shape shape = this.f$1;
        Painting painting = this.f$0;
        int i = 1;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                painting.activeShape = shape;
                if (painting.activeStrokeBounds == null) {
                    painting.activeStrokeBounds = new RectF();
                }
                painting.activeShape.getBounds(painting.activeStrokeBounds);
                Stripe.AnonymousClass1 anonymousClass1 = painting.delegate;
                if (anonymousClass1 != null) {
                    anonymousClass1.contentChanged();
                }
                break;
            default:
                if (shape != null && painting.helperTexture == 0) {
                    painting.helperTexture = Texture.generateTexture(painting.size);
                }
                if (painting.helperShown != (shape != null)) {
                    painting.helperShown = shape != null;
                    ValueAnimator valueAnimator = painting.helperAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        painting.helperAnimator = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(painting.helperAlpha, painting.helperShown ? 1.0f : 0.0f);
                    painting.helperAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new Painting$$ExternalSyntheticLambda5(painting, i));
                    painting.helperAnimator.addListener(new Painting.AnonymousClass1(painting, i2));
                    painting.helperAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    painting.helperAnimator.start();
                    painting.helperShape = shape;
                    Stripe.AnonymousClass1 anonymousClass2 = painting.delegate;
                    if (anonymousClass2 != null) {
                        anonymousClass2.contentChanged();
                    }
                    if (painting.helperShown) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                    }
                } else if (shape != painting.helperShape) {
                    painting.helperShape = shape;
                    Stripe.AnonymousClass1 anonymousClass3 = painting.delegate;
                    if (anonymousClass3 != null) {
                        anonymousClass3.contentChanged();
                    }
                }
                break;
        }
    }
}
