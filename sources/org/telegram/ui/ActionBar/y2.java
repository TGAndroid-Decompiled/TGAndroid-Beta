package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f21974a;
    public final int f21975b;
    public final Dialog f21976c;

    public y2(Dialog dialog, int i10, int i11) {
        this.f21974a = i11;
        this.f21976c = dialog;
        this.f21975b = i10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f21974a) {
            case 0:
                h3 h3Var = (h3) this.f21976c;
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                AnimatorSet[] animatorSetArr = ((c2) this.f21976c).F;
                int i10 = this.f21975b;
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
        int i10 = this.f21974a;
        int i11 = this.f21975b;
        Dialog dialog = this.f21976c;
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
                    AndroidUtilities.runOnUIThread(new p(this, 8));
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
