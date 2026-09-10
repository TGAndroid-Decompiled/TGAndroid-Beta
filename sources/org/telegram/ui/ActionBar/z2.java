package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f18798a;
    public final int f18799b;
    public final Dialog f18800c;

    public z2(Dialog dialog, int i10, int i11) {
        this.f18798a = i11;
        this.f18800c = dialog;
        this.f18799b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f18798a) {
            case 0:
                h3 h3Var = (h3) this.f18800c;
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((d2) this.f18800c).F;
                int i10 = this.f18799b;
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
        int i10 = this.f18798a;
        int i11 = this.f18799b;
        Dialog dialog = this.f18800c;
        switch (i10) {
            case 0:
                h3 h3Var = (h3) dialog;
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    onClickListener = h3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = h3Var.onClickListener;
                        onClickListener2.onClick(h3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new q(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet[] animatorSetArr = ((d2) dialog).F;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
