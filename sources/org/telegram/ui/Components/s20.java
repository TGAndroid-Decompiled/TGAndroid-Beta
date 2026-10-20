package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f30138x;
    public static final int f30139y;
    public final int f30140a;
    public final int f30141b;
    public final int f30142c;
    public final int d;
    public final int e;
    public final ab.o0 f30143f;
    public final r20 f30144g;
    public q20 h;
    public boolean f30145i;
    public boolean f30146j;
    public boolean f30147k;
    public boolean f30148l;
    public boolean f30149m;
    public MotionEvent f30150n;
    public MotionEvent f30151o;
    public MotionEvent f30152p;
    public boolean f30153q;
    public float f30154r;
    public float f30155s;
    public float f30156t;
    public float f30157u;
    public boolean v;
    public VelocityTracker f30158w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30138x = ViewConfiguration.getTapTimeout();
        f30139y = ViewConfiguration.getDoubleTapTimeout();
    }

    public s20(Context context, PhotoViewer photoViewer) {
        this(context, (r20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public s20(Context context, r20 r20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f30143f = new ab.o0(this, 8);
        this.f30144g = r20Var;
        if (r20Var instanceof q20) {
            this.h = (q20) r20Var;
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
        this.f30140a = i10 * i10;
        this.f30141b = scaledTouchSlop * scaledTouchSlop;
        this.f30142c = i11 * i11;
    }
}
