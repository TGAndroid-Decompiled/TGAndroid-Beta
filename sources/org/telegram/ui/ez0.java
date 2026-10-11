package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ez0 extends s4.j {
    public int F = -1;
    public final ProfileActivity G;

    public ez0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new sk0(this, 29));
    }

    @Override
    public final void P(s4.d1 d1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47843p.isEmpty();
        boolean isEmpty2 = this.f47845r.isEmpty();
        boolean isEmpty3 = this.f47846s.isEmpty();
        boolean isEmpty4 = this.f47844q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(this, 26));
            ofFloat.setDuration(this.f47875e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
