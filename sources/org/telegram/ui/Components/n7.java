package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class n7 extends FrameLayout {
    public final g9[] f28695a;
    public int f28696b;
    public AnimatorSet f28697c;
    public long d;
    public final w7 e;

    public n7(w7 w7Var, Context context) {
        super(context);
        this.e = w7Var;
        this.f28695a = new g9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f28695a[i10] = new g9(context);
            this.f28695a[i10].getImageReceiver().f14382g1 = new i2.q(this, i10, 7);
            this.f28695a[i10].setRoundRadius(org.telegram.messenger.i0.L(4.0f));
            if (i10 == 1) {
                this.f28695a[i10].setVisibility(8);
            }
            addView(this.f28695a[i10], w7.b6.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        w7 w7Var = this.e;
        if (action == 0) {
            if (this.f28695a[this.f28696b].getImageReceiver().I()) {
                w7Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            w7Var.W0(false, true);
        }
        return true;
    }
}
