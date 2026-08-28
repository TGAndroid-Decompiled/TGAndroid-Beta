package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class cy0 extends f2.n {
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
    public final void P(f2.q1 q1Var) {
        this.G.U4();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5450p.isEmpty();
        boolean isEmpty2 = this.f5452r.isEmpty();
        boolean isEmpty3 = this.f5453s.isEmpty();
        boolean isEmpty4 = this.f5451q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new f3(this, 26));
            ofFloat.setDuration(this.f5549e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
