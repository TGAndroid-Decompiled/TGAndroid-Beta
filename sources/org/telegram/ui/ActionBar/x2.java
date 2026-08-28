package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f23935a;
    public final int f23936b;
    public final Dialog f23937c;

    public x2(Dialog dialog, int i9, int i10) {
        this.f23935a = i10;
        this.f23937c = dialog;
        this.f23936b = i9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23935a) {
            case 0:
                f3 f3Var = (f3) this.f23937c;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((c2) this.f23937c).B;
                int i9 = this.f23936b;
                AnimatorSet animatorSet2 = animatorSetArr[i9];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i9] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        int i9 = this.f23935a;
        int i10 = this.f23936b;
        Dialog dialog = this.f23937c;
        switch (i9) {
            case 0:
                f3 f3Var = (f3) dialog;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    onClickListener = f3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = f3Var.onClickListener;
                        onClickListener2.onClick(f3Var, i10);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet[] animatorSetArr = ((c2) dialog).B;
                AnimatorSet animatorSet2 = animatorSetArr[i10];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i10] = null;
                    return;
                }
                return;
        }
    }
}
