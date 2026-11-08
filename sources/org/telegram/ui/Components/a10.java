package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class a10 {
    public static final int f31643x;
    public static final int f31644y;
    public final int f31645a;
    public final int f31646b;
    public final int f31647c;
    public final int d;
    public final int f31648e;
    public final android.support.v4.media.session.q f31649f;
    public final z00 f31650g;
    public y00 h;
    public boolean f31651i;
    public boolean f31652j;
    public boolean f31653k;
    public boolean f31654l;
    public boolean f31655m;
    public MotionEvent f31656n;
    public MotionEvent f31657o;
    public MotionEvent f31658p;
    public boolean f31659q;
    public float f31660r;
    public float f31661s;
    public float f31662t;
    public float f31663u;
    public boolean v;
    public VelocityTracker f31664w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f31643x = ViewConfiguration.getTapTimeout();
        f31644y = ViewConfiguration.getDoubleTapTimeout();
    }

    public a10(Context context, PhotoViewer photoViewer) {
        this(context, (z00) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public a10(Context context, z00 z00Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f31649f = new android.support.v4.media.session.q(this, 5);
        this.f31650g = z00Var;
        if (z00Var instanceof y00) {
            this.h = (y00) z00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f31648e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f31648e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f31645a = i7 * i7;
        this.f31646b = scaledTouchSlop * scaledTouchSlop;
        this.f31647c = i10 * i10;
    }
}
