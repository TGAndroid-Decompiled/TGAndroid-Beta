package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class w20 {
    public static final int f30428x;
    public static final int f30429y;
    public final int f30430a;
    public final int f30431b;
    public final int f30432c;
    public final int d;
    public final int e;
    public final ab.o0 f30433f;
    public final v20 f30434g;
    public u20 h;
    public boolean f30435i;
    public boolean f30436j;
    public boolean f30437k;
    public boolean f30438l;
    public boolean f30439m;
    public MotionEvent f30440n;
    public MotionEvent f30441o;
    public MotionEvent f30442p;
    public boolean f30443q;
    public float f30444r;
    public float f30445s;
    public float f30446t;
    public float f30447u;
    public boolean v;
    public VelocityTracker f30448w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f30428x = ViewConfiguration.getTapTimeout();
        f30429y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f30433f = new ab.o0(this, 8);
        this.f30434g = v20Var;
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
        this.f30430a = i10 * i10;
        this.f30431b = scaledTouchSlop * scaledTouchSlop;
        this.f30432c = i11 * i11;
    }
}
