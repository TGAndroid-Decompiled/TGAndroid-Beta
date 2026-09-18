package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f19702a;
    public final int f19703b;
    public final Dialog f19704c;

    public y2(Dialog dialog, int i10, int i11) {
        this.f19702a = i11;
        this.f19704c = dialog;
        this.f19703b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f19702a) {
            case 0:
                g3 g3Var = (g3) this.f19704c;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((c2) this.f19704c).F;
                int i10 = this.f19703b;
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
        int i10 = this.f19702a;
        int i11 = this.f19703b;
        Dialog dialog = this.f19704c;
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
                    AndroidUtilities.runOnUIThread(new r(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet[] animatorSetArr = ((c2) dialog).F;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
