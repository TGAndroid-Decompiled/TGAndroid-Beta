package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f20722a;
    public final int f20723b;
    public final Dialog f20724c;

    public y2(Dialog dialog, int i10, int i11) {
        this.f20722a = i11;
        this.f20724c = dialog;
        this.f20723b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f20722a) {
            case 0:
                g3 g3Var = (g3) this.f20724c;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((d2) this.f20724c).C;
                int i10 = this.f20723b;
                AnimatorSet animatorSet2 = animatorSetArr[i10];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i10] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        int i10 = this.f20722a;
        int i11 = this.f20723b;
        Dialog dialog = this.f20724c;
        switch (i10) {
            case 0:
                g3 g3Var = (g3) dialog;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    onClickListener = g3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = g3Var.onClickListener;
                        onClickListener2.onClick(g3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet[] animatorSetArr = ((d2) dialog).C;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
