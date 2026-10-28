package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class u20 {
    public static final int f33194x;
    public static final int f33195y;
    public final int f33196a;
    public final int f33197b;
    public final int f33198c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f33199f;
    public final t20 f33200g;
    public s20 h;
    public boolean f33201i;
    public boolean f33202j;
    public boolean f33203k;
    public boolean f33204l;
    public boolean f33205m;
    public MotionEvent f33206n;
    public MotionEvent f33207o;
    public MotionEvent f33208p;
    public boolean f33209q;
    public float f33210r;
    public float f33211s;
    public float f33212t;
    public float f33213u;
    public boolean v;
    public VelocityTracker f33214w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f33194x = ViewConfiguration.getTapTimeout();
        f33195y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f33199f = new androidx.mediarouter.app.c(this, 8);
        this.f33200g = t20Var;
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
        this.f33196a = i10 * i10;
        this.f33197b = scaledTouchSlop * scaledTouchSlop;
        this.f33198c = i11 * i11;
    }
}
