package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gz0 extends s4.j {
    public int F = -1;
    public final ProfileActivity G;

    public gz0(ProfileActivity profileActivity) {
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
        boolean isEmpty = this.f43053p.isEmpty();
        boolean isEmpty2 = this.f43055r.isEmpty();
        boolean isEmpty3 = this.f43056s.isEmpty();
        boolean isEmpty4 = this.f43054q.isEmpty();
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
