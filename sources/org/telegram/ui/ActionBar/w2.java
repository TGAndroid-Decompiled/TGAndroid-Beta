package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f21650a;
    public final int f21651b;
    public final Dialog f21652c;

    public w2(Dialog dialog, int i10, int i11) {
        this.f21650a = i11;
        this.f21652c = dialog;
        this.f21651b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f21650a) {
            case 0:
                e3 e3Var = (e3) this.f21652c;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((a2) this.f21652c).F;
                int i10 = this.f21651b;
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
        int i10 = this.f21650a;
        int i11 = this.f21651b;
        Dialog dialog = this.f21652c;
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
