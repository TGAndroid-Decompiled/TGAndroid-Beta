package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final q9[] f41648a;
    public int f41649b;
    public AnimatorSet f41650c;
    public long d;
    public final f8 f41651e;

    public w7(f8 f8Var, Context context) {
        super(context);
        this.f41651e = f8Var;
        this.f41648a = new q9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f41648a[i7] = new q9(context);
            this.f41648a[i7].getImageReceiver().f22634h1 = new ai.m1(this, i7, 7);
            this.f41648a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f41648a[i7].setVisibility(8);
            }
            addView(this.f41648a[i7], c8.na.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        f8 f8Var = this.f41651e;
        if (action == 0) {
            if (this.f41648a[this.f41649b].getImageReceiver().I()) {
                f8Var.X0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            f8Var.X0(false, true);
        }
        return true;
    }
}
