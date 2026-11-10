package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class r7 extends FrameLayout {
    public final k9[] f37526a;
    public int f37527b;
    public AnimatorSet f37528c;
    public long d;
    public final a8 f37529e;

    public r7(a8 a8Var, Context context) {
        super(context);
        this.f37529e = a8Var;
        this.f37526a = new k9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f37526a[i7] = new k9(context);
            this.f37526a[i7].getImageReceiver().f21200g1 = new l2.q(this, i7, 5);
            this.f37526a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.f37526a[i7].setVisibility(8);
            }
            addView(this.f37526a[i7], c8.ha.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        a8 a8Var = this.f37529e;
        if (action == 0) {
            if (this.f37526a[this.f37527b].getImageReceiver().I()) {
                a8Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            a8Var.W0(false, true);
        }
        return true;
    }
}
