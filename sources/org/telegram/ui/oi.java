package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class oi extends AnimatorListenerAdapter {
    public final int f40202a;
    public final sn f40203b;

    public oi(sn snVar, int i10) {
        this.f40202a = i10;
        this.f40203b = snVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nj njVar;
        switch (this.f40202a) {
            case 0:
                sn snVar = this.f40203b;
                org.telegram.ui.Components.q60 q60Var = snVar.f41610n3;
                if (q60Var != null) {
                    q60Var.setIsMessageTransition(false);
                    snVar.f41610n3.c(true);
                    snVar.f41610n3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f40203b;
                snVar2.M9 = AndroidUtilities.dp(30.0f);
                snVar2.t9();
                return;
            case 2:
                sn snVar3 = this.f40203b;
                if (snVar3.fragmentView != null && (njVar = snVar3.f41734x0) != null) {
                    njVar.invalidate();
                    snVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f40203b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ti(this, 4), 2000L);
                return;
            case 5:
                sn snVar4 = this.f40203b;
                if (animator.equals(snVar4.f41672s3)) {
                    snVar4.f41672s3 = null;
                    return;
                }
                return;
            case 6:
                sn snVar5 = this.f40203b;
                if (animator.equals(snVar5.f41672s3)) {
                    snVar5.f41672s3 = null;
                    return;
                }
                return;
            case 7:
                sn snVar6 = this.f40203b;
                if (animator.equals(snVar6.f41685t3)) {
                    snVar6.f41698u3 = 1.0f;
                    snVar6.sc();
                    snVar6.f41685t3 = null;
                    return;
                }
                return;
            case 8:
                sn snVar7 = this.f40203b;
                if (animator.equals(snVar7.f41685t3)) {
                    snVar7.f41698u3 = 0.0f;
                    snVar7.sc();
                    snVar7.f41685t3 = null;
                    return;
                }
                return;
            case 9:
                this.f40203b.f41515f5 = null;
                return;
            case 10:
                sn snVar8 = this.f40203b;
                snVar8.Qa = 1.0f;
                snVar8.Y.setVisibility(4);
                snVar8.f41446a1.setVisibility(4);
                snVar8.t9();
                return;
            default:
                sn snVar9 = this.f40203b;
                snVar9.Qa = 0.0f;
                snVar9.t9();
                return;
        }
    }
}
