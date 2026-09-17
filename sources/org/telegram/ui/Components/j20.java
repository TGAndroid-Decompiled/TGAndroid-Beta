package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25074x;
    public static final int f25075y;
    public final int f25076a;
    public final int f25077b;
    public final int f25078c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25079f;
    public final i20 f25080g;
    public h20 h;
    public boolean f25081i;
    public boolean f25082j;
    public boolean f25083k;
    public boolean f25084l;
    public boolean f25085m;
    public MotionEvent f25086n;
    public MotionEvent f25087o;
    public MotionEvent f25088p;
    public boolean f25089q;
    public float f25090r;
    public float f25091s;
    public float f25092t;
    public float f25093u;
    public boolean v;
    public VelocityTracker f25094w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25074x = ViewConfiguration.getTapTimeout();
        f25075y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25079f = new androidx.mediarouter.app.c(this, 7);
        this.f25080g = i20Var;
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
        this.f25076a = i10 * i10;
        this.f25077b = scaledTouchSlop * scaledTouchSlop;
        this.f25078c = i11 * i11;
    }
}
