package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class iu0 extends u4.k {
    public int F = -1;
    public final ProfileActivity G;

    public iu0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final void N() {
        org.telegram.messenger.g0.h3(new sg0(this, 29));
    }

    @Override
    public final void P(u4.d1 d1Var) {
        RectF rectF = ProfileActivity.T6;
        this.G.p5();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f55598p.isEmpty();
        boolean isEmpty2 = this.f55600r.isEmpty();
        boolean isEmpty3 = this.f55601s.isEmpty();
        boolean isEmpty4 = this.f55599q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(this, 24));
            ofFloat.setDuration(this.f55617e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
