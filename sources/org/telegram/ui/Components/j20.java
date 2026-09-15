package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25192x;
    public static final int f25193y;
    public final int f25194a;
    public final int f25195b;
    public final int f25196c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25197f;
    public final i20 f25198g;
    public h20 h;
    public boolean f25199i;
    public boolean f25200j;
    public boolean f25201k;
    public boolean f25202l;
    public boolean f25203m;
    public MotionEvent f25204n;
    public MotionEvent f25205o;
    public MotionEvent f25206p;
    public boolean f25207q;
    public float f25208r;
    public float f25209s;
    public float f25210t;
    public float f25211u;
    public boolean v;
    public VelocityTracker f25212w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25192x = ViewConfiguration.getTapTimeout();
        f25193y = ViewConfiguration.getDoubleTapTimeout();
    }

    public j20(Context context, PhotoViewer photoViewer) {
        this(context, (i20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public j20(Context context, i20 i20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f25197f = new androidx.mediarouter.app.c(this, 7);
        this.f25198g = i20Var;
        if (i20Var instanceof h20) {
            this.h = (h20) i20Var;
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
        this.f25194a = i10 * i10;
        this.f25195b = scaledTouchSlop * scaledTouchSlop;
        this.f25196c = i11 * i11;
    }
}
