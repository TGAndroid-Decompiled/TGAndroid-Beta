package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class dm implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.t1 f36646a;
    public final em f36647b;

    public dm(em emVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f36647b = emVar;
        this.f36646a = t1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float centerX;
        sn snVar = this.f36647b.Q;
        org.telegram.ui.Cells.t1 t1Var = this.f36646a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        snVar.f41765z6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f7 = 1.0f;
        } else {
            f7 = sendAnimationData.width / imageWidth;
        }
        t1Var.getTransitionParams().f23228x0 = true;
        t1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - t1Var.getTranslationY())};
        if (snVar.Y.x0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6("p1", 0);
        am amVar = new am(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, q6Var, f7, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new bm(this), 0.0f, 1.0f));
        float f10 = sendAnimationData.f17860x;
        float f11 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, amVar, f10, f11 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.zr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new m.a(this, 27));
        animatorSet.start();
        cm cmVar = new cm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, cmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
