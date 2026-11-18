package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final q9[] f41573a;
    public int f41574b;
    public AnimatorSet f41575c;
    public long d;
    public final g8 f41576e;

    public w7(g8 g8Var, Context context) {
        super(context);
        this.f41576e = g8Var;
        this.f41573a = new q9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f41573a[i7] = new q9(context);
            this.f41573a[i7].getImageReceiver().f22639h1 = new ai.s1(this, i7, 8);
            this.f41573a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f41573a[i7].setVisibility(8);
            }
            addView(this.f41573a[i7], c8.ma.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        g8 g8Var = this.f41576e;
        if (action == 0) {
            if (this.f41573a[this.f41574b].getImageReceiver().I()) {
                g8Var.X0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            g8Var.X0(false, true);
        }
        return true;
    }
}
