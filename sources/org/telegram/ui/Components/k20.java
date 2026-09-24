package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class k20 {
    public static final int f25583x;
    public static final int f25584y;
    public final int f25585a;
    public final int f25586b;
    public final int f25587c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25588f;
    public final j20 f25589g;
    public i20 h;
    public boolean f25590i;
    public boolean f25591j;
    public boolean f25592k;
    public boolean f25593l;
    public boolean f25594m;
    public MotionEvent f25595n;
    public MotionEvent f25596o;
    public MotionEvent f25597p;
    public boolean f25598q;
    public float f25599r;
    public float f25600s;
    public float f25601t;
    public float f25602u;
    public boolean v;
    public VelocityTracker f25603w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25583x = ViewConfiguration.getTapTimeout();
        f25584y = ViewConfiguration.getDoubleTapTimeout();
    }

    public k20(Context context, PhotoViewer photoViewer) {
        this(context, (j20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public k20(Context context, j20 j20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f25588f = new androidx.mediarouter.app.c(this, 7);
        this.f25589g = j20Var;
        if (j20Var instanceof i20) {
            this.h = (i20) j20Var;
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
        this.f25585a = i10 * i10;
        this.f25586b = scaledTouchSlop * scaledTouchSlop;
        this.f25587c = i11 * i11;
    }
}
