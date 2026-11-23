package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class v7 extends FrameLayout {
    public final p9[] f40574a;
    public int f40575b;
    public AnimatorSet f40576c;
    public long d;
    public final e8 f40577e;

    public v7(e8 e8Var, Context context) {
        super(context);
        this.f40577e = e8Var;
        this.f40574a = new p9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f40574a[i7] = new p9(context);
            this.f40574a[i7].getImageReceiver().f22737h1 = new ai.n1(this, i7, 7);
            this.f40574a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f40574a[i7].setVisibility(8);
            }
            addView(this.f40574a[i7], c8.na.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        e8 e8Var = this.f40577e;
        if (action == 0) {
            if (this.f40574a[this.f40575b].getImageReceiver().J()) {
                e8Var.X0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            e8Var.X0(false, true);
        }
        return true;
    }
}
