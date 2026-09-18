package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25123x;
    public static final int f25124y;
    public final int f25125a;
    public final int f25126b;
    public final int f25127c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25128f;
    public final i20 f25129g;
    public h20 h;
    public boolean f25130i;
    public boolean f25131j;
    public boolean f25132k;
    public boolean f25133l;
    public boolean f25134m;
    public MotionEvent f25135n;
    public MotionEvent f25136o;
    public MotionEvent f25137p;
    public boolean f25138q;
    public float f25139r;
    public float f25140s;
    public float f25141t;
    public float f25142u;
    public boolean v;
    public VelocityTracker f25143w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25123x = ViewConfiguration.getTapTimeout();
        f25124y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25128f = new androidx.mediarouter.app.c(this, 7);
        this.f25129g = i20Var;
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
        this.f25125a = i10 * i10;
        this.f25126b = scaledTouchSlop * scaledTouchSlop;
        this.f25127c = i11 * i11;
    }
}
