package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class km implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.s1 f35556a;
    public final lm f35557b;

    public km(lm lmVar, org.telegram.ui.Cells.s1 s1Var) {
        this.f35557b = lmVar;
        this.f35556a = s1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float centerX;
        zn znVar = this.f35557b.N;
        org.telegram.ui.Cells.s1 s1Var = this.f35556a;
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = s1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        znVar.f40643k6.add(s1Var);
        ImageReceiver photoImage = s1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f10 = 1.0f;
        } else {
            f10 = sendAnimationData.width / imageWidth;
        }
        s1Var.getTransitionParams().f21845x0 = true;
        s1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - s1Var.getTranslationY())};
        if (znVar.V.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6("p1", 0);
        hm hmVar = new hm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, m6Var, f10, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new im(this), 0.0f, 1.0f));
        float f11 = sendAnimationData.f16647x;
        float f12 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, hmVar, f11, f12 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new u5(this, 21));
        animatorSet.start();
        jm jmVar = new jm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, jmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
