package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class m20 {
    public static final int f28940w = ViewConfiguration.getTapTimeout();
    public final int f28941a;
    public final int f28942b;
    public final int f28943c;
    public final int d;
    public final n20 f28945f;
    public final n20 f28946g;
    public boolean h;
    public boolean f28947i;
    public boolean f28948j;
    public boolean f28949k;
    public boolean f28950l;
    public MotionEvent f28951m;
    public MotionEvent f28952n;
    public boolean f28953o;
    public float f28954p;
    public float f28955q;
    public float f28956r;
    public float f28957s;
    public boolean f28958t;
    public VelocityTracker v;
    public long f28959u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.d f28944e = new androidx.mediarouter.app.d(this, 10);

    public m20(Context context, n20 n20Var) {
        this.f28945f = n20Var;
        this.f28946g = n20Var;
        if (context != null) {
            this.f28958t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f28943c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f28941a = scaledTouchSlop * scaledTouchSlop;
            this.f28942b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
