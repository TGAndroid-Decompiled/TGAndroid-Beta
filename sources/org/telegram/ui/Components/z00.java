package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class z00 {
    public static final int f40795x;
    public static final int f40796y;
    public final int f40797a;
    public final int f40798b;
    public final int f40799c;
    public final int d;
    public final int f40800e;
    public final android.support.v4.media.session.q f40801f;
    public final y00 f40802g;
    public x00 h;
    public boolean f40803i;
    public boolean f40804j;
    public boolean f40805k;
    public boolean f40806l;
    public boolean f40807m;
    public MotionEvent f40808n;
    public MotionEvent f40809o;
    public MotionEvent f40810p;
    public boolean f40811q;
    public float f40812r;
    public float f40813s;
    public float f40814t;
    public float f40815u;
    public boolean v;
    public VelocityTracker f40816w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f40795x = ViewConfiguration.getTapTimeout();
        f40796y = ViewConfiguration.getDoubleTapTimeout();
    }

    public z00(Context context, PhotoViewer photoViewer) {
        this(context, (y00) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z00.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public z00(Context context, y00 y00Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f40801f = new android.support.v4.media.session.q(this, 5);
        this.f40802g = y00Var;
        if (y00Var instanceof x00) {
            this.h = (x00) y00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f40800e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f40800e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f40797a = i7 * i7;
        this.f40798b = scaledTouchSlop * scaledTouchSlop;
        this.f40799c = i10 * i10;
    }
}
