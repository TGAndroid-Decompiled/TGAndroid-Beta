package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class om implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.t1 f35512a;
    public final pm f35513b;

    public om(pm pmVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f35513b = pmVar;
        this.f35512a = t1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float centerX;
        eo eoVar = this.f35513b.Q;
        org.telegram.ui.Cells.t1 t1Var = this.f35512a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        eoVar.f32422n6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f7 = 1.0f;
        } else {
            f7 = sendAnimationData.width / imageWidth;
        }
        t1Var.getTransitionParams().f20016x0 = true;
        t1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - t1Var.getTranslationY())};
        if (eoVar.Y.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6("p1", 0);
        lm lmVar = new lm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, q6Var, f7, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new mm(this), 0.0f, 1.0f));
        float f10 = sendAnimationData.f14643x;
        float f11 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, lmVar, f10, f11 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new org.telegram.ui.Cells.v5(this, 12));
        animatorSet.start();
        nm nmVar = new nm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, nmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
