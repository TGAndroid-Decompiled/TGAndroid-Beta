package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class am implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.t1 f36518a;
    public final bm f36519b;

    public am(bm bmVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f36519b = bmVar;
        this.f36518a = t1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float centerX;
        qn qnVar = this.f36519b.M;
        org.telegram.ui.Cells.t1 t1Var = this.f36518a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        qnVar.f41960j6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f10 = 1.0f;
        } else {
            f10 = sendAnimationData.width / imageWidth;
        }
        t1Var.getTransitionParams().f25239x0 = true;
        t1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - t1Var.getTranslationY())};
        if (qnVar.U.y0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6("p1", 0);
        xl xlVar = new xl(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, l6Var, f10, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new yl(this), 0.0f, 1.0f));
        float f11 = sendAnimationData.f19647x;
        float f12 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, xlVar, f11, f12 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new mh.x(this, 28));
        animatorSet.start();
        zl zlVar = new zl(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, zlVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
