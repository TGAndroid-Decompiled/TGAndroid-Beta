package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class g20 {
    public static final int f28718w = ViewConfiguration.getTapTimeout();
    public final int f28719a;
    public final int f28720b;
    public final int f28721c;
    public final int d;
    public final h20 f28723f;
    public final h20 f28724g;
    public boolean h;
    public boolean f28725i;
    public boolean f28726j;
    public boolean f28727k;
    public boolean f28728l;
    public MotionEvent f28729m;
    public MotionEvent f28730n;
    public boolean f28731o;
    public float f28732p;
    public float f28733q;
    public float f28734r;
    public float f28735s;
    public boolean f28736t;
    public VelocityTracker v;
    public long f28737u = ViewConfiguration.getLongPressTimeout();
    public final a4.d f28722e = new a4.d(this, 8);

    public g20(Context context, h20 h20Var) {
        this.f28723f = h20Var;
        this.f28724g = h20Var;
        if (context != null) {
            this.f28736t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f28721c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f28719a = scaledTouchSlop * scaledTouchSlop;
            this.f28720b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
