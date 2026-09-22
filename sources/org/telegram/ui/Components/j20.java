package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25189x;
    public static final int f25190y;
    public final int f25191a;
    public final int f25192b;
    public final int f25193c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25194f;
    public final i20 f25195g;
    public h20 h;
    public boolean f25196i;
    public boolean f25197j;
    public boolean f25198k;
    public boolean f25199l;
    public boolean f25200m;
    public MotionEvent f25201n;
    public MotionEvent f25202o;
    public MotionEvent f25203p;
    public boolean f25204q;
    public float f25205r;
    public float f25206s;
    public float f25207t;
    public float f25208u;
    public boolean v;
    public VelocityTracker f25209w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25189x = ViewConfiguration.getTapTimeout();
        f25190y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25194f = new androidx.mediarouter.app.c(this, 7);
        this.f25195g = i20Var;
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
        this.f25191a = i10 * i10;
        this.f25192b = scaledTouchSlop * scaledTouchSlop;
        this.f25193c = i11 * i11;
    }
}
