package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class cy0 extends f2.l {
    public int F = -1;
    public final ProfileActivity G;

    public cy0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new zk0(this, 29));
    }

    @Override
    public final void P(f2.o1 o1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean zIsEmpty = this.f5738p.isEmpty();
        boolean zIsEmpty2 = this.f5740r.isEmpty();
        boolean zIsEmpty3 = this.f5741s.isEmpty();
        boolean zIsEmpty4 = this.f5739q.isEmpty();
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 26));
            valueAnimatorOfFloat.setDuration(this.f5843e);
            valueAnimatorOfFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
