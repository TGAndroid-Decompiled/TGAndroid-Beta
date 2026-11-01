package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class bw0 extends s4.j {
    public int F = -1;
    public final ProfileActivity G;

    public bw0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final void N() {
        org.telegram.messenger.i0.g3(new vv0(this, 2));
    }

    @Override
    public final void P(s4.c1 c1Var) {
        RectF rectF = ProfileActivity.S6;
        this.G.p5();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47957p.isEmpty();
        boolean isEmpty2 = this.f47959r.isEmpty();
        boolean isEmpty3 = this.f47960s.isEmpty();
        boolean isEmpty4 = this.f47958q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a3(this, 24));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
