package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ky0 extends s4.k {
    public int F = -1;
    public final ProfileActivity G;

    public ky0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new ek0(this, 29));
    }

    @Override
    public final void P(s4.b1 b1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f46022p.isEmpty();
        boolean isEmpty2 = this.f46024r.isEmpty();
        boolean isEmpty3 = this.f46025s.isEmpty();
        boolean isEmpty4 = this.f46023q.isEmpty();
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
