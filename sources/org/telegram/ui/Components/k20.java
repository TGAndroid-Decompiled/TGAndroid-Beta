package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class k20 {
    public static final int f25601x;
    public static final int f25602y;
    public final int f25603a;
    public final int f25604b;
    public final int f25605c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25606f;
    public final j20 f25607g;
    public i20 h;
    public boolean f25608i;
    public boolean f25609j;
    public boolean f25610k;
    public boolean f25611l;
    public boolean f25612m;
    public MotionEvent f25613n;
    public MotionEvent f25614o;
    public MotionEvent f25615p;
    public boolean f25616q;
    public float f25617r;
    public float f25618s;
    public float f25619t;
    public float f25620u;
    public boolean v;
    public VelocityTracker f25621w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25601x = ViewConfiguration.getTapTimeout();
        f25602y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25606f = new androidx.mediarouter.app.c(this, 7);
        this.f25607g = j20Var;
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
        this.f25603a = i10 * i10;
        this.f25604b = scaledTouchSlop * scaledTouchSlop;
        this.f25605c = i11 * i11;
    }
}
