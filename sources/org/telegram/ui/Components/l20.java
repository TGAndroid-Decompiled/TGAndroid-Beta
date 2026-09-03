package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class l20 {
    public static final int f28587x;
    public static final int f28588y;
    public final int f28589a;
    public final int f28590b;
    public final int f28591c;
    public final int d;
    public final int f28592e;
    public final androidx.mediarouter.app.d f28593f;
    public final k20 f28594g;
    public j20 h;
    public boolean f28595i;
    public boolean f28596j;
    public boolean f28597k;
    public boolean f28598l;
    public boolean f28599m;
    public MotionEvent f28600n;
    public MotionEvent f28601o;
    public MotionEvent f28602p;
    public boolean f28603q;
    public float f28604r;
    public float f28605s;
    public float f28606t;
    public float f28607u;
    public boolean v;
    public VelocityTracker f28608w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28587x = ViewConfiguration.getTapTimeout();
        f28588y = ViewConfiguration.getDoubleTapTimeout();
    }

    public l20(Context context, PhotoViewer photoViewer) {
        this(context, (k20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public l20(Context context, k20 k20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f28593f = new androidx.mediarouter.app.d(this, 9);
        this.f28594g = k20Var;
        if (k20Var instanceof j20) {
            this.h = (j20) k20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28592e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28592e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28589a = i10 * i10;
        this.f28590b = scaledTouchSlop * scaledTouchSlop;
        this.f28591c = i11 * i11;
    }
}
