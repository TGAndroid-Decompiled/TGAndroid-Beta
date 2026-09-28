package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f19897a;
    public final int f19898b;
    public final Dialog f19899c;

    public w2(Dialog dialog, int i10, int i11) {
        this.f19897a = i11;
        this.f19899c = dialog;
        this.f19898b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f19897a) {
            case 0:
                e3 e3Var = (e3) this.f19899c;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((a2) this.f19899c).F;
                int i10 = this.f19898b;
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
        int i10 = this.f19897a;
        int i11 = this.f19898b;
        Dialog dialog = this.f19899c;
        switch (i10) {
            case 0:
                e3 e3Var = (e3) dialog;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    onClickListener = e3Var.onClickListener;
                    if (onClickListener != null) {
                        onClickListener2 = e3Var.onClickListener;
                        onClickListener2.onClick(e3Var, i11);
                    }
                    AndroidUtilities.runOnUIThread(new p(this, 8));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet[] animatorSetArr = ((a2) dialog).F;
                AnimatorSet animatorSet2 = animatorSetArr[i11];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr[i11] = null;
                    return;
                }
                return;
        }
    }
}
