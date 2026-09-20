package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25179x;
    public static final int f25180y;
    public final int f25181a;
    public final int f25182b;
    public final int f25183c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25184f;
    public final i20 f25185g;
    public h20 h;
    public boolean f25186i;
    public boolean f25187j;
    public boolean f25188k;
    public boolean f25189l;
    public boolean f25190m;
    public MotionEvent f25191n;
    public MotionEvent f25192o;
    public MotionEvent f25193p;
    public boolean f25194q;
    public float f25195r;
    public float f25196s;
    public float f25197t;
    public float f25198u;
    public boolean v;
    public VelocityTracker f25199w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25179x = ViewConfiguration.getTapTimeout();
        f25180y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25184f = new androidx.mediarouter.app.c(this, 7);
        this.f25185g = i20Var;
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
        this.f25181a = i10 * i10;
        this.f25182b = scaledTouchSlop * scaledTouchSlop;
        this.f25183c = i11 * i11;
    }
}
