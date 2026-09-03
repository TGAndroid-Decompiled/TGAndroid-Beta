package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class im implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.t1 f37742a;
    public final jm f37743b;

    public im(jm jmVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f37743b = jmVar;
        this.f37742a = t1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float centerX;
        xn xnVar = this.f37743b.N;
        org.telegram.ui.Cells.t1 t1Var = this.f37742a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        xnVar.f43224k6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f10 = 1.0f;
        } else {
            f10 = sendAnimationData.width / imageWidth;
        }
        t1Var.getTransitionParams().f23712x0 = true;
        t1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - t1Var.getTranslationY())};
        if (xnVar.V.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6("p1", 0);
        fm fmVar = new fm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, m6Var, f10, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new gm(this), 0.0f, 1.0f));
        float f11 = sendAnimationData.f18055x;
        float f12 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, fmVar, f11, f12 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new s5(this, 21));
        animatorSet.start();
        hm hmVar = new hm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, hmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
