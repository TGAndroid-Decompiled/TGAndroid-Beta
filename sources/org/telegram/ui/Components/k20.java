package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class k20 {
    public static final int f25602x;
    public static final int f25603y;
    public final int f25604a;
    public final int f25605b;
    public final int f25606c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25607f;
    public final j20 f25608g;
    public i20 h;
    public boolean f25609i;
    public boolean f25610j;
    public boolean f25611k;
    public boolean f25612l;
    public boolean f25613m;
    public MotionEvent f25614n;
    public MotionEvent f25615o;
    public MotionEvent f25616p;
    public boolean f25617q;
    public float f25618r;
    public float f25619s;
    public float f25620t;
    public float f25621u;
    public boolean v;
    public VelocityTracker f25622w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25602x = ViewConfiguration.getTapTimeout();
        f25603y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25607f = new androidx.mediarouter.app.c(this, 7);
        this.f25608g = j20Var;
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
        this.f25604a = i10 * i10;
        this.f25605b = scaledTouchSlop * scaledTouchSlop;
        this.f25606c = i11 * i11;
    }
}
