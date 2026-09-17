package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f27332x;
    public static final int f27333y;
    public final int f27334a;
    public final int f27335b;
    public final int f27336c;
    public final int d;
    public final int f27337e;
    public final androidx.mediarouter.app.c f27338f;
    public final i20 f27339g;
    public h20 h;
    public boolean f27340i;
    public boolean f27341j;
    public boolean f27342k;
    public boolean f27343l;
    public boolean f27344m;
    public MotionEvent f27345n;
    public MotionEvent f27346o;
    public MotionEvent f27347p;
    public boolean f27348q;
    public float f27349r;
    public float f27350s;
    public float f27351t;
    public float f27352u;
    public boolean v;
    public VelocityTracker f27353w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f27332x = ViewConfiguration.getTapTimeout();
        f27333y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f27338f = new androidx.mediarouter.app.c(this, 7);
        this.f27339g = i20Var;
        if (i20Var instanceof h20) {
            this.h = (h20) i20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f27337e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f27337e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f27334a = i10 * i10;
        this.f27335b = scaledTouchSlop * scaledTouchSlop;
        this.f27336c = i11 * i11;
    }
}
