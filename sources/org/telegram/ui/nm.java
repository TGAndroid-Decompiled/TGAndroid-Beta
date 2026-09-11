package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class nm implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.t1 f38983a;
    public final om f38984b;

    public nm(om omVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f38984b = omVar;
        this.f38983a = t1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float centerX;
        co coVar = this.f38984b.Q;
        org.telegram.ui.Cells.t1 t1Var = this.f38983a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        coVar.f35353n6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f7 = 1.0f;
        } else {
            f7 = sendAnimationData.width / imageWidth;
        }
        t1Var.getTransitionParams().f22806x0 = true;
        t1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - t1Var.getTranslationY())};
        if (coVar.Y.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6("p1", 0);
        km kmVar = new km(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, s6Var, f7, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new lm(this), 0.0f, 1.0f));
        float f10 = sendAnimationData.f17078x;
        float f11 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, kmVar, f10, f11 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new s0(this, 25));
        animatorSet.start();
        mm mmVar = new mm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, mmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
