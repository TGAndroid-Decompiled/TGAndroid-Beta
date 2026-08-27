package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class ni extends AnimatorListenerAdapter {

    public final int f40838a;

    public final rn f40839b;

    public ni(rn rnVar, int i10) {
        this.f40838a = i10;
        this.f40839b = rnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kj kjVar;
        switch (this.f40838a) {
            case 0:
                rn rnVar = this.f40839b;
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    wkVar.setIsMessageTransition(false);
                    rnVar.X2.h(true);
                    rnVar.X2.setVisibility(4);
                }
                break;
            case 1:
                float fDp = AndroidUtilities.dp(30.0f);
                rn rnVar2 = this.f40839b;
                rnVar2.f42261w9 = fDp;
                rnVar2.o9();
                break;
            case 2:
                rn rnVar3 = this.f40839b;
                if (rnVar3.fragmentView != null && (kjVar = rnVar3.f42213t0) != null) {
                    kjVar.invalidate();
                    rnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.f40839b.L.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ti(this, 3), 2000L);
                break;
            case 5:
                rn rnVar4 = this.f40839b;
                if (animator.equals(rnVar4.f42004c3)) {
                    rnVar4.f42004c3 = null;
                }
                break;
            case 6:
                rn rnVar5 = this.f40839b;
                if (animator.equals(rnVar5.f42004c3)) {
                    rnVar5.f42004c3 = null;
                }
                break;
            case 7:
                rn rnVar6 = this.f40839b;
                if (animator.equals(rnVar6.f42016d3)) {
                    rnVar6.f42030e3 = 1.0f;
                    rnVar6.lc();
                    rnVar6.f42016d3 = null;
                }
                break;
            case 8:
                rn rnVar7 = this.f40839b;
                if (animator.equals(rnVar7.f42016d3)) {
                    rnVar7.f42030e3 = 0.0f;
                    rnVar7.lc();
                    rnVar7.f42016d3 = null;
                }
                break;
            case 9:
                this.f40839b.P4 = null;
                break;
            case 10:
                rn rnVar8 = this.f40839b;
                rnVar8.f42300za = 1.0f;
                rnVar8.U.setVisibility(4);
                rnVar8.K0.setVisibility(4);
                rnVar8.o9();
                break;
            default:
                rn rnVar9 = this.f40839b;
                rnVar9.f42300za = 0.0f;
                rnVar9.o9();
                break;
        }
    }
}
