package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class iz0 extends s4.j {
    public int F = -1;
    public final ProfileActivity G;

    public iz0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new sl0(this, 28));
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f42755p.isEmpty();
        boolean isEmpty2 = this.f42757r.isEmpty();
        boolean isEmpty3 = this.f42758s.isEmpty();
        boolean isEmpty4 = this.f42756q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(this, 25));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
