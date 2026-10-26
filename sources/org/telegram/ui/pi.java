package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pi extends AnimatorListenerAdapter {
    public final int f42557a;
    public final un f42558b;

    public pi(un unVar, int i10) {
        this.f42557a = i10;
        this.f42558b = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oj ojVar;
        switch (this.f42557a) {
            case 0:
                un unVar = this.f42558b;
                org.telegram.ui.Components.t60 t60Var = unVar.f44346n3;
                if (t60Var != null) {
                    t60Var.setIsMessageTransition(false);
                    unVar.f44346n3.c(true);
                    unVar.f44346n3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f42558b;
                unVar2.M9 = AndroidUtilities.dp(30.0f);
                unVar2.x9();
                return;
            case 2:
                un unVar3 = this.f42558b;
                if (unVar3.fragmentView != null && (ojVar = unVar3.f44471x0) != null) {
                    ojVar.invalidate();
                    unVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f42558b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ui(this, 4), 2000L);
                return;
            case 5:
                un unVar4 = this.f42558b;
                if (animator.equals(unVar4.f44408s3)) {
                    unVar4.f44408s3 = null;
                    return;
                }
                return;
            case 6:
                un unVar5 = this.f42558b;
                if (animator.equals(unVar5.f44408s3)) {
                    unVar5.f44408s3 = null;
                    return;
                }
                return;
            case 7:
                un unVar6 = this.f42558b;
                if (animator.equals(unVar6.f44421t3)) {
                    unVar6.f44434u3 = 1.0f;
                    unVar6.yc();
                    unVar6.f44421t3 = null;
                    return;
                }
                return;
            case 8:
                un unVar7 = this.f42558b;
                if (animator.equals(unVar7.f44421t3)) {
                    unVar7.f44434u3 = 0.0f;
                    unVar7.yc();
                    unVar7.f44421t3 = null;
                    return;
                }
                return;
            case 9:
                this.f42558b.f44251f5 = null;
                return;
            case 10:
                un unVar8 = this.f42558b;
                unVar8.Qa = 1.0f;
                unVar8.Y.setVisibility(4);
                unVar8.f44181a1.setVisibility(4);
                unVar8.x9();
                return;
            default:
                un unVar9 = this.f42558b;
                unVar9.Qa = 0.0f;
                unVar9.x9();
                return;
        }
    }
}
