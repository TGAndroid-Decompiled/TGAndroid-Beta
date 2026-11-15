package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class p7 extends FrameLayout {
    public final i9[] f38230a;
    public int f38231b;
    public AnimatorSet f38232c;
    public long d;
    public final y7 f38233e;

    public p7(y7 y7Var, Context context) {
        super(context);
        this.f38233e = y7Var;
        this.f38230a = new i9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f38230a[i7] = new i9(context);
            this.f38230a[i7].getImageReceiver().f22276h1 = new ai.r1(this, i7, 8);
            this.f38230a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f38230a[i7].setVisibility(8);
            }
            addView(this.f38230a[i7], c8.ja.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        y7 y7Var = this.f38233e;
        if (action == 0) {
            if (this.f38230a[this.f38231b].getImageReceiver().I()) {
                y7Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            y7Var.W0(false, true);
        }
        return true;
    }
}
