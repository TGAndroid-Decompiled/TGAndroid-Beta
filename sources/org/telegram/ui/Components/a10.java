package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class a10 {
    public static final int f31647x;
    public static final int f31648y;
    public final int f31649a;
    public final int f31650b;
    public final int f31651c;
    public final int d;
    public final int f31652e;
    public final android.support.v4.media.session.q f31653f;
    public final z00 f31654g;
    public y00 h;
    public boolean f31655i;
    public boolean f31656j;
    public boolean f31657k;
    public boolean f31658l;
    public boolean f31659m;
    public MotionEvent f31660n;
    public MotionEvent f31661o;
    public MotionEvent f31662p;
    public boolean f31663q;
    public float f31664r;
    public float f31665s;
    public float f31666t;
    public float f31667u;
    public boolean v;
    public VelocityTracker f31668w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f31647x = ViewConfiguration.getTapTimeout();
        f31648y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f31653f = new android.support.v4.media.session.q(this, 5);
        this.f31654g = z00Var;
        if (z00Var instanceof y00) {
            this.h = (y00) z00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f31652e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f31652e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f31649a = i7 * i7;
        this.f31650b = scaledTouchSlop * scaledTouchSlop;
        this.f31651c = i10 * i10;
    }
}
