package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

public final class cm implements ViewTreeObserver.OnPreDrawListener {

    public final org.telegram.ui.Cells.s1 f37114a;

    public final dm f37115b;

    public cm(dm dmVar, org.telegram.ui.Cells.s1 s1Var) {
        this.f37115b = dmVar;
        this.f37114a = s1Var;
    }

    @Override
    public final boolean onPreDraw() {
        rn rnVar = this.f37115b.M;
        org.telegram.ui.Cells.s1 s1Var = this.f37114a;
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = s1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        rnVar.f42096j6.add(s1Var);
        ImageReceiver photoImage = s1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        s1Var.getTransitionParams().f25190x0 = true;
        s1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - s1Var.getTranslationY());
        if (rnVar.U.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int i10 = 0;
        xl xlVar = new xl("p1", 0);
        yl ylVar = new yl(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, xlVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new zl(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, ylVar, sendAnimationData.f19620x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.er.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new am(this, i10));
        animatorSet.start();
        bm bmVar = new bm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, bmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
