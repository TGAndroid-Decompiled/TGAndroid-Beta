package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class v20 {
    public static final int f33539w = ViewConfiguration.getTapTimeout();
    public final int f33540a;
    public final int f33541b;
    public final int f33542c;
    public final int d;
    public final w20 f33543f;
    public final w20 f33544g;
    public boolean h;
    public boolean f33545i;
    public boolean f33546j;
    public boolean f33547k;
    public boolean f33548l;
    public MotionEvent f33549m;
    public MotionEvent f33550n;
    public boolean f33551o;
    public float f33552p;
    public float f33553q;
    public float f33554r;
    public float f33555s;
    public boolean f33556t;
    public VelocityTracker v;
    public long f33557u = ViewConfiguration.getLongPressTimeout();
    public final androidx.mediarouter.app.c e = new androidx.mediarouter.app.c(this, 9);

    public v20(Context context, w20 w20Var) {
        this.f33543f = w20Var;
        this.f33544g = w20Var;
        if (context != null) {
            this.f33556t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f33542c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f33540a = scaledTouchSlop * scaledTouchSlop;
            this.f33541b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
