package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25240x;
    public static final int f25241y;
    public final int f25242a;
    public final int f25243b;
    public final int f25244c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25245f;
    public final i20 f25246g;
    public h20 h;
    public boolean f25247i;
    public boolean f25248j;
    public boolean f25249k;
    public boolean f25250l;
    public boolean f25251m;
    public MotionEvent f25252n;
    public MotionEvent f25253o;
    public MotionEvent f25254p;
    public boolean f25255q;
    public float f25256r;
    public float f25257s;
    public float f25258t;
    public float f25259u;
    public boolean v;
    public VelocityTracker f25260w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25240x = ViewConfiguration.getTapTimeout();
        f25241y = ViewConfiguration.getDoubleTapTimeout();
    }

    public j20(Context context, PhotoViewer photoViewer) {
        this(context, (i20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public j20(Context context, i20 i20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f25245f = new androidx.mediarouter.app.c(this, 7);
        this.f25246g = i20Var;
        if (i20Var instanceof h20) {
            this.h = (h20) i20Var;
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
        this.f25242a = i10 * i10;
        this.f25243b = scaledTouchSlop * scaledTouchSlop;
        this.f25244c = i11 * i11;
    }
}
