package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class l20 {
    public static final int f25911x;
    public static final int f25912y;
    public final int f25913a;
    public final int f25914b;
    public final int f25915c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25916f;
    public final k20 f25917g;
    public j20 h;
    public boolean f25918i;
    public boolean f25919j;
    public boolean f25920k;
    public boolean f25921l;
    public boolean f25922m;
    public MotionEvent f25923n;
    public MotionEvent f25924o;
    public MotionEvent f25925p;
    public boolean f25926q;
    public float f25927r;
    public float f25928s;
    public float f25929t;
    public float f25930u;
    public boolean v;
    public VelocityTracker f25931w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25911x = ViewConfiguration.getTapTimeout();
        f25912y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25916f = new androidx.mediarouter.app.c(this, 7);
        this.f25917g = k20Var;
        if (k20Var instanceof j20) {
            this.h = (j20) k20Var;
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
        this.f25913a = i10 * i10;
        this.f25914b = scaledTouchSlop * scaledTouchSlop;
        this.f25915c = i11 * i11;
    }
}
