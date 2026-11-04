package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class q7 extends FrameLayout {
    public final k9[] f37365a;
    public int f37366b;
    public AnimatorSet f37367c;
    public long d;
    public final z7 f37368e;

    public q7(z7 z7Var, Context context) {
        super(context);
        this.f37368e = z7Var;
        this.f37365a = new k9[2];
        for (int i3 = 0; i3 < 2; i3++) {
            this.f37365a[i3] = new k9(context);
            this.f37365a[i3].getImageReceiver().f21247h1 = new k2.q(this, i3, 6);
            this.f37365a[i3].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i3 == 1) {
                this.f37365a[i3].setVisibility(8);
            }
            addView(this.f37365a[i3], b8.mf.c(-1.0f, -1));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        z7 z7Var = this.f37368e;
        if (action == 0) {
            if (this.f37365a[this.f37366b].getImageReceiver().I()) {
                z7Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            z7Var.W0(false, true);
        }
        return true;
    }
}
