package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final q9[] f41674a;
    public int f41675b;
    public AnimatorSet f41676c;
    public long d;
    public final f8 f41677e;

    public w7(f8 f8Var, Context context) {
        super(context);
        this.f41677e = f8Var;
        this.f41674a = new q9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f41674a[i7] = new q9(context);
            this.f41674a[i7].getImageReceiver().f22670h1 = new ai.v1(this, i7, 8);
            this.f41674a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f41674a[i7].setVisibility(8);
            }
            addView(this.f41674a[i7], c8.ma.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        f8 f8Var = this.f41677e;
        if (action == 0) {
            if (this.f41674a[this.f41675b].getImageReceiver().I()) {
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
