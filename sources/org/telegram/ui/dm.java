package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class dm implements ViewTreeObserver.OnPreDrawListener {
    public final org.telegram.ui.Cells.s1 f37559a;
    public final em f37560b;

    public dm(em emVar, org.telegram.ui.Cells.s1 s1Var) {
        this.f37560b = emVar;
        this.f37559a = s1Var;
    }

    @Override
    public final boolean onPreDraw() {
        float f9;
        float centerX;
        tn tnVar = this.f37560b.M;
        org.telegram.ui.Cells.s1 s1Var = this.f37559a;
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = s1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        tnVar.f42857j6.add(s1Var);
        ImageReceiver photoImage = s1Var.getPhotoImage();
        float imageWidth = photoImage.getImageWidth();
        if (sendAnimationData.fromPreview) {
            f9 = 1.0f;
        } else {
            f9 = sendAnimationData.width / imageWidth;
        }
        s1Var.getTransitionParams().f25195x0 = true;
        s1Var.getLocationInWindow(r8);
        int[] iArr = {0, (int) (iArr[1] - s1Var.getTranslationY())};
        if (tnVar.U.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6("p1", 0);
        zl zlVar = new zl(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, q6Var, f9, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new am(this), 0.0f, 1.0f));
        float f10 = sendAnimationData.f19618x;
        float f11 = iArr[0];
        if (sendAnimationData.fromPreview) {
            centerX = 0.0f;
        } else {
            centerX = photoImage.getCenterX();
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, zlVar, f10, f11 + centerX), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new bm(this, 0));
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
