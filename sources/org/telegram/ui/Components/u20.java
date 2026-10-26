package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class u20 {
    public static final int f33209x;
    public static final int f33210y;
    public final int f33211a;
    public final int f33212b;
    public final int f33213c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f33214f;
    public final t20 f33215g;
    public s20 h;
    public boolean f33216i;
    public boolean f33217j;
    public boolean f33218k;
    public boolean f33219l;
    public boolean f33220m;
    public MotionEvent f33221n;
    public MotionEvent f33222o;
    public MotionEvent f33223p;
    public boolean f33224q;
    public float f33225r;
    public float f33226s;
    public float f33227t;
    public float f33228u;
    public boolean v;
    public VelocityTracker f33229w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f33209x = ViewConfiguration.getTapTimeout();
        f33210y = ViewConfiguration.getDoubleTapTimeout();
    }

    public u20(Context context, PhotoViewer photoViewer) {
        this(context, (t20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public u20(Context context, t20 t20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f33214f = new androidx.mediarouter.app.c(this, 8);
        this.f33215g = t20Var;
        if (t20Var instanceof s20) {
            this.h = (s20) t20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f33211a = i10 * i10;
        this.f33212b = scaledTouchSlop * scaledTouchSlop;
        this.f33213c = i11 * i11;
    }
}
