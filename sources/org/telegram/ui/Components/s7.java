package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class s7 extends FrameLayout {
    public final l9[] f37962a;
    public int f37963b;
    public AnimatorSet f37964c;
    public long d;
    public final b8 f37965e;

    public s7(b8 b8Var, Context context) {
        super(context);
        this.f37965e = b8Var;
        this.f37962a = new l9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f37962a[i7] = new l9(context);
            this.f37962a[i7].getImageReceiver().f21192g1 = new l2.q(this, i7, 5);
            this.f37962a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f37962a[i7].setVisibility(8);
            }
            addView(this.f37962a[i7], c8.ha.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        b8 b8Var = this.f37965e;
        if (action == 0) {
            if (this.f37962a[this.f37963b].getImageReceiver().I()) {
                b8Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            b8Var.W0(false, true);
        }
        return true;
    }
}
