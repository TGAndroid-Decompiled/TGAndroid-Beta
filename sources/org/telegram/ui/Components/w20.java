package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class w20 {
    public static final int f30752x;
    public static final int f30753y;
    public final int f30754a;
    public final int f30755b;
    public final int f30756c;
    public final int d;
    public final int e;
    public final ab.o0 f30757f;
    public final v20 f30758g;
    public u20 h;
    public boolean f30759i;
    public boolean f30760j;
    public boolean f30761k;
    public boolean f30762l;
    public boolean f30763m;
    public MotionEvent f30764n;
    public MotionEvent f30765o;
    public MotionEvent f30766p;
    public boolean f30767q;
    public float f30768r;
    public float f30769s;
    public float f30770t;
    public float f30771u;
    public boolean v;
    public VelocityTracker f30772w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30752x = ViewConfiguration.getTapTimeout();
        f30753y = ViewConfiguration.getDoubleTapTimeout();
    }

    public w20(Context context, PhotoViewer photoViewer) {
        this(context, (v20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public w20(Context context, v20 v20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f30757f = new ab.o0(this, 8);
        this.f30758g = v20Var;
        if (v20Var instanceof u20) {
            this.h = (u20) v20Var;
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
        this.f30754a = i10 * i10;
        this.f30755b = scaledTouchSlop * scaledTouchSlop;
        this.f30756c = i11 * i11;
    }
}
