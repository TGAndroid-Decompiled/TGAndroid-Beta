package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class w2 extends AnimatorListenerAdapter {

    public final int f23932a;

    public final int f23933b;

    public final Dialog f23934c;

    public w2(Dialog dialog, int i10, int i11) {
        this.f23932a = i11;
        this.f23934c = dialog;
        this.f23933b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23932a) {
            case 0:
                e3 e3Var = (e3) this.f23934c;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                AnimatorSet[] animatorSetArr = ((b2) this.f23934c).B;
                int i10 = this.f23933b;
                AnimatorSet animatorSet2 = animatorSetArr[i10];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f23932a;
        int i11 = this.f23933b;
        Dialog dialog = this.f23934c;
        switch (i10) {
            case 0:
                e3 e3Var = (e3) dialog;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    if (e3Var.onClickListener != null) {
                        e3Var.onClickListener.onClick(e3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                AnimatorSet[] animatorSetArr = ((b2) dialog).B;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
