package org.telegram.ui.Components.Paint;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class Painting$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Painting f$0;
    public final Shape f$1;

    public Painting$$ExternalSyntheticLambda1(Painting painting, Shape shape, int i) {
        this.$r8$classId = i;
        this.f$0 = painting;
        this.f$1 = shape;
    }

    @Override
    public final void run() {
        Shape shape = this.f$1;
        Painting painting = this.f$0;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                painting.activeShape = shape;
                if (painting.activeStrokeBounds == null) {
                    painting.activeStrokeBounds = new RectF();
                }
                painting.activeShape.getBounds(painting.activeStrokeBounds);
                RenderView.AnonymousClass2 anonymousClass2 = painting.delegate;
                if (anonymousClass2 != null) {
                    anonymousClass2.contentChanged();
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
                    valueAnimatorOfFloat.addUpdateListener(new Painting$$ExternalSyntheticLambda5(painting, 1));
                    painting.helperAnimator.addListener(new Painting.AnonymousClass1(painting, i));
                    painting.helperAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    painting.helperAnimator.start();
                    painting.helperShape = shape;
                    RenderView.AnonymousClass2 anonymousClass3 = painting.delegate;
                    if (anonymousClass3 != null) {
                        anonymousClass3.contentChanged();
                    }
                    if (painting.helperShown) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                    }
                } else if (shape != painting.helperShape) {
                    painting.helperShape = shape;
                    RenderView.AnonymousClass2 anonymousClass4 = painting.delegate;
                    if (anonymousClass4 != null) {
                        anonymousClass4.contentChanged();
                    }
                }
                break;
        }
    }
}
