package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class y10 {

    public static final int f34758w = ViewConfiguration.getTapTimeout();

    public final int f34759a;

    public final int f34760b;

    public final int f34761c;
    public final int d;

    public final z10 f34763f;

    public final z10 f34764g;
    public boolean h;

    public boolean f34765i;

    public boolean f34766j;

    public boolean f34767k;

    public boolean f34768l;

    public MotionEvent f34769m;

    public MotionEvent f34770n;

    public boolean f34771o;

    public float f34772p;

    public float f34773q;

    public float f34774r;

    public float f34775s;

    public boolean f34776t;
    public VelocityTracker v;

    public long f34777u = ViewConfiguration.getLongPressTimeout();

    public final androidx.mediarouter.app.c f34762e = new androidx.mediarouter.app.c(this, 7);

    public y10(Context context, z10 z10Var) {
        this.f34763f = z10Var;
        this.f34764g = z10Var;
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.f34776t = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.f34761c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f34759a = scaledTouchSlop * scaledTouchSlop;
        this.f34760b = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }
}
