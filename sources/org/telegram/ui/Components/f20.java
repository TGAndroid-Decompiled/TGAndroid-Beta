package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class f20 {
    public static final int f28270x;
    public static final int f28271y;
    public final int f28272a;
    public final int f28273b;
    public final int f28274c;
    public final int d;
    public final int f28275e;
    public final a4.d f28276f;
    public final e20 f28277g;
    public d20 h;
    public boolean f28278i;
    public boolean f28279j;
    public boolean f28280k;
    public boolean f28281l;
    public boolean f28282m;
    public MotionEvent f28283n;
    public MotionEvent f28284o;
    public MotionEvent f28285p;
    public boolean f28286q;
    public float f28287r;
    public float f28288s;
    public float f28289t;
    public float f28290u;
    public boolean v;
    public VelocityTracker f28291w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28270x = ViewConfiguration.getTapTimeout();
        f28271y = ViewConfiguration.getDoubleTapTimeout();
    }

    public f20(Context context, PhotoViewer photoViewer) {
        this(context, (e20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public f20(Context context, e20 e20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f28276f = new a4.d(this, 7);
        this.f28277g = e20Var;
        if (e20Var instanceof d20) {
            this.h = (d20) e20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28275e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28275e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28272a = i10 * i10;
        this.f28273b = scaledTouchSlop * scaledTouchSlop;
        this.f28274c = i11 * i11;
    }
}
