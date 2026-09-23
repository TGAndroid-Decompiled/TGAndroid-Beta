package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class k20 {
    public static final int f25465x;
    public static final int f25466y;
    public final int f25467a;
    public final int f25468b;
    public final int f25469c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25470f;
    public final j20 f25471g;
    public i20 h;
    public boolean f25472i;
    public boolean f25473j;
    public boolean f25474k;
    public boolean f25475l;
    public boolean f25476m;
    public MotionEvent f25477n;
    public MotionEvent f25478o;
    public MotionEvent f25479p;
    public boolean f25480q;
    public float f25481r;
    public float f25482s;
    public float f25483t;
    public float f25484u;
    public boolean v;
    public VelocityTracker f25485w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25465x = ViewConfiguration.getTapTimeout();
        f25466y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25470f = new androidx.mediarouter.app.c(this, 7);
        this.f25471g = j20Var;
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
        this.f25467a = i10 * i10;
        this.f25468b = scaledTouchSlop * scaledTouchSlop;
        this.f25469c = i11 * i11;
    }
}
