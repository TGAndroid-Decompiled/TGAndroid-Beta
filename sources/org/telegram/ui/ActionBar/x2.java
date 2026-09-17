package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f21508a;
    public final int f21509b;
    public final Dialog f21510c;

    public x2(Dialog dialog, int i10, int i11) {
        this.f21508a = i11;
        this.f21510c = dialog;
        this.f21509b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f21508a) {
            case 0:
                f3 f3Var = (f3) this.f21510c;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((b2) this.f21510c).F;
                int i10 = this.f21509b;
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
        int i10 = this.f21508a;
        int i11 = this.f21509b;
        Dialog dialog = this.f21510c;
        switch (i10) {
            case 0:
                f3 f3Var = (f3) dialog;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    onClickListener = f3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = f3Var.onClickListener;
                        onClickListener2.onClick(f3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new q(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet[] animatorSetArr = ((b2) dialog).F;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
