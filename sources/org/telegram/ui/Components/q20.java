package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class q20 {
    public static final int f29756x;
    public static final int f29757y;
    public final int f29758a;
    public final int f29759b;
    public final int f29760c;
    public final int d;
    public final int e;
    public final ab.o0 f29761f;
    public final p20 f29762g;
    public o20 h;
    public boolean f29763i;
    public boolean f29764j;
    public boolean f29765k;
    public boolean f29766l;
    public boolean f29767m;
    public MotionEvent f29768n;
    public MotionEvent f29769o;
    public MotionEvent f29770p;
    public boolean f29771q;
    public float f29772r;
    public float f29773s;
    public float f29774t;
    public float f29775u;
    public boolean v;
    public VelocityTracker f29776w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f29756x = ViewConfiguration.getTapTimeout();
        f29757y = ViewConfiguration.getDoubleTapTimeout();
    }

    public q20(Context context, PhotoViewer photoViewer) {
        this(context, (p20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public q20(Context context, p20 p20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f29761f = new ab.o0(this, 8);
        this.f29762g = p20Var;
        if (p20Var instanceof o20) {
            this.h = (o20) p20Var;
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
        this.f29758a = i10 * i10;
        this.f29759b = scaledTouchSlop * scaledTouchSlop;
        this.f29760c = i11 * i11;
    }
}
