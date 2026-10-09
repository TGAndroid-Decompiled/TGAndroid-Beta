package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class a30 {
    public static final int f24558x;
    public static final int f24559y;
    public final int f24560a;
    public final int f24561b;
    public final int f24562c;
    public final int d;
    public final int f24563e;
    public final androidx.mediarouter.app.c f24564f;
    public final z20 f24565g;
    public y20 h;
    public boolean f24566i;
    public boolean f24567j;
    public boolean f24568k;
    public boolean f24569l;
    public boolean f24570m;
    public MotionEvent f24571n;
    public MotionEvent f24572o;
    public MotionEvent f24573p;
    public boolean f24574q;
    public float f24575r;
    public float f24576s;
    public float f24577t;
    public float f24578u;
    public boolean v;
    public VelocityTracker f24579w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f24558x = ViewConfiguration.getTapTimeout();
        f24559y = ViewConfiguration.getDoubleTapTimeout();
    }

    public a30(Context context, PhotoViewer photoViewer) {
        this(context, (z20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a30.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public a30(Context context, z20 z20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f24564f = new androidx.mediarouter.app.c(this, 7);
        this.f24565g = z20Var;
        if (z20Var instanceof y20) {
            this.h = (y20) z20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f24563e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24563e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f24560a = i10 * i10;
        this.f24561b = scaledTouchSlop * scaledTouchSlop;
        this.f24562c = i11 * i11;
    }
}
