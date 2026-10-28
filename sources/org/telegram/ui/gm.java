package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class gm implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.s1 f39646a;
    public final hm f39647b;

    public gm(hm hmVar, org.telegram.ui.Cells.s1 s1Var) {
        this.f39647b = hmVar;
        this.f39646a = s1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float centerX;
        wn wnVar = this.f39647b.Q;
        org.telegram.ui.Cells.s1 s1Var = this.f39646a;
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = s1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        wnVar.D6.add(s1Var);
        ImageReceiver photoImage = s1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f7 = 1.0f;
        } else {
            f7 = sendAnimationData.width / imageWidth;
        }
        s1Var.getTransitionParams().f24947x0 = true;
        s1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - s1Var.getTranslationY())};
        if (wnVar.Y.w0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6("p1", 0);
        dm dmVar = new dm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, u6Var, f7, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new em(this), 0.0f, 1.0f));
        float f10 = sendAnimationData.f19546x;
        float f11 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, dmVar, f10, f11 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.ds.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new kg.e(this, 29));
        animatorSet.start();
        fm fmVar = new fm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, fmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
