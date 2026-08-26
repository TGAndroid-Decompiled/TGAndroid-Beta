package org.telegram.ui.Components.Paint;

import android.animation.ValueAnimator;

public final class Painting$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Painting f$0;

    public Painting$$ExternalSyntheticLambda5(Painting painting, int i) {
        this.$r8$classId = i;
        this.f$0 = painting;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                final Painting painting = this.f$0;
                final int i = 0;
                painting.renderView.performInContext(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                Painting painting2 = painting;
                                painting2.getClass();
                                painting2.helperApplyAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                RenderView.AnonymousClass2 anonymousClass2 = painting2.delegate;
                                if (anonymousClass2 != null) {
                                    anonymousClass2.contentChanged();
                                }
                                break;
                            default:
                                Painting painting3 = painting;
                                painting3.getClass();
                                painting3.helperAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                RenderView.AnonymousClass2 anonymousClass3 = painting3.delegate;
                                if (anonymousClass3 != null) {
                                    anonymousClass3.contentChanged();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final Painting painting2 = this.f$0;
                final int i2 = 1;
                painting2.renderView.performInContext(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                Painting painting3 = painting2;
                                painting3.getClass();
                                painting3.helperApplyAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                RenderView.AnonymousClass2 anonymousClass2 = painting3.delegate;
                                if (anonymousClass2 != null) {
                                    anonymousClass2.contentChanged();
                                }
                                break;
                            default:
                                Painting painting4 = painting2;
                                painting4.getClass();
                                painting4.helperAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                RenderView.AnonymousClass2 anonymousClass3 = painting4.delegate;
                                if (anonymousClass3 != null) {
                                    anonymousClass3.contentChanged();
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
