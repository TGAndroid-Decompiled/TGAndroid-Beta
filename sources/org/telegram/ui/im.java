package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class im implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.u1 f34542a;
    public final jm f34543b;

    public im(jm jmVar, org.telegram.ui.Cells.u1 u1Var) {
        this.f34543b = jmVar;
        this.f34542a = u1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float centerX;
        wn wnVar = this.f34543b.Q;
        org.telegram.ui.Cells.u1 u1Var = this.f34542a;
        u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = u1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        wnVar.f39575n6.add(u1Var);
        ImageReceiver photoImage = u1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f7 = 1.0f;
        } else {
            f7 = sendAnimationData.width / imageWidth;
        }
        u1Var.getTransitionParams().f21174x0 = true;
        u1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - u1Var.getTranslationY())};
        if (wnVar.Y.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6("p1", 0);
        fm fmVar = new fm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, r6Var, f7, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new gm(this), 0.0f, 1.0f));
        float f10 = sendAnimationData.f15830x;
        float f11 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, fmVar, f10, f11 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.rr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new t4(this, 22));
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
