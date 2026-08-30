package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ny0 extends f2.l {
    public int F = -1;
    public final ProfileActivity G;

    public ny0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new el0(this, 29));
    }

    @Override
    public final void P(f2.l1 l1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5774p.isEmpty();
        boolean isEmpty2 = this.f5776r.isEmpty();
        boolean isEmpty3 = this.f5777s.isEmpty();
        boolean isEmpty4 = this.f5775q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new e3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
