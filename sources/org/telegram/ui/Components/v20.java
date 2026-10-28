package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class v20 {
    public static final int f33524w = ViewConfiguration.getTapTimeout();
    public final int f33525a;
    public final int f33526b;
    public final int f33527c;
    public final int d;
    public final w20 f33528f;
    public final w20 f33529g;
    public boolean h;
    public boolean f33530i;
    public boolean f33531j;
    public boolean f33532k;
    public boolean f33533l;
    public MotionEvent f33534m;
    public MotionEvent f33535n;
    public boolean f33536o;
    public float f33537p;
    public float f33538q;
    public float f33539r;
    public float f33540s;
    public boolean f33541t;
    public VelocityTracker v;
    public long f33542u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 9);

    public v20(Context context, w20 w20Var) {
        this.f33528f = w20Var;
        this.f33529g = w20Var;
        if (context != null) {
            this.f33541t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f33527c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f33525a = scaledTouchSlop * scaledTouchSlop;
            this.f33526b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
