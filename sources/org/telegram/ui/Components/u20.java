package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class u20 {
    public static final int f33206x;
    public static final int f33207y;
    public final int f33208a;
    public final int f33209b;
    public final int f33210c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f33211f;
    public final t20 f33212g;
    public s20 h;
    public boolean f33213i;
    public boolean f33214j;
    public boolean f33215k;
    public boolean f33216l;
    public boolean f33217m;
    public MotionEvent f33218n;
    public MotionEvent f33219o;
    public MotionEvent f33220p;
    public boolean f33221q;
    public float f33222r;
    public float f33223s;
    public float f33224t;
    public float f33225u;
    public boolean v;
    public VelocityTracker f33226w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f33206x = ViewConfiguration.getTapTimeout();
        f33207y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f33211f = new androidx.mediarouter.app.c(this, 8);
        this.f33212g = t20Var;
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
        this.f33208a = i10 * i10;
        this.f33209b = scaledTouchSlop * scaledTouchSlop;
        this.f33210c = i11 * i11;
    }
}
