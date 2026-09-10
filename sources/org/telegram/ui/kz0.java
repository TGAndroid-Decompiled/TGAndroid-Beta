package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class kz0 extends s4.j {
    public int F = -1;
    public final ProfileActivity G;

    public kz0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new ql0(this, 28));
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f41668p.isEmpty();
        boolean isEmpty2 = this.f41670r.isEmpty();
        boolean isEmpty3 = this.f41671s.isEmpty();
        boolean isEmpty4 = this.f41669q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
