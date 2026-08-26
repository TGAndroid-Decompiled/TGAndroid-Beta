package org.telegram.ui.Components.Premium.GLIcon;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.SelfStoriesPreviewView;

public final class GLIconTextureView$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;

    public GLIconTextureView$1$$ExternalSyntheticLambda0(Object obj, float f, float f2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
    }

    @Override
    public final void run() {
        View view;
        float f = this.f$2;
        float f2 = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                SelfStoriesPreviewView.AnonymousClass1 anonymousClass1 = (SelfStoriesPreviewView.AnonymousClass1) obj;
                GLIconTextureView gLIconTextureView = (GLIconTextureView) anonymousClass1.this$0;
                ValueAnimator valueAnimator = gLIconTextureView.backAnimation;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    gLIconTextureView.backAnimation.cancel();
                    gLIconTextureView.backAnimation = null;
                }
                AnimatorSet animatorSet = gLIconTextureView.animatorSet;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    gLIconTextureView.animatorSet.cancel();
                    gLIconTextureView.animatorSet = null;
                }
                if (Math.abs(gLIconTextureView.mRenderer.angleX) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(gLIconTextureView.idleAnimation);
                    gLIconTextureView.animatorSet = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(gLIconTextureView.mRenderer.angleX, f2);
                    GLIconTextureView$$ExternalSyntheticLambda0 gLIconTextureView$$ExternalSyntheticLambda0 = gLIconTextureView.xUpdater;
                    valueAnimatorOfFloat.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda0);
                    long j = 220;
                    valueAnimatorOfFloat.setDuration(j);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda0);
                    valueAnimatorOfFloat2.setStartDelay(j);
                    valueAnimatorOfFloat2.setDuration(600L);
                    valueAnimatorOfFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(gLIconTextureView.mRenderer.angleY, f);
                    GLIconTextureView$$ExternalSyntheticLambda0 gLIconTextureView$$ExternalSyntheticLambda1 = gLIconTextureView.yUpdater;
                    valueAnimatorOfFloat3.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                    valueAnimatorOfFloat3.setDuration(j);
                    valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f, 0.0f);
                    valueAnimatorOfFloat4.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                    valueAnimatorOfFloat4.setStartDelay(j);
                    valueAnimatorOfFloat4.setDuration(600L);
                    valueAnimatorOfFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    gLIconTextureView.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                    gLIconTextureView.animatorSet.addListener(new ItemOptions.AnonymousClass3(anonymousClass1, 17));
                    gLIconTextureView.animatorSet.start();
                } else {
                    gLIconTextureView.startBackAnimation();
                }
                break;
            default:
                RecyclerListView recyclerListView = (RecyclerListView) ((ItemTouchHelper.AnonymousClass2) obj).this$0;
                if (recyclerListView.selectChildRunnable != null && (view = recyclerListView.currentChildView) != null) {
                    recyclerListView.onChildPressed(view, f2, f, true);
                    recyclerListView.selectChildRunnable = null;
                    break;
                }
                break;
        }
    }
}
