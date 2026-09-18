package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f25077x;
    public static final int f25078y;
    public final int f25079a;
    public final int f25080b;
    public final int f25081c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f25082f;
    public final i20 f25083g;
    public h20 h;
    public boolean f25084i;
    public boolean f25085j;
    public boolean f25086k;
    public boolean f25087l;
    public boolean f25088m;
    public MotionEvent f25089n;
    public MotionEvent f25090o;
    public MotionEvent f25091p;
    public boolean f25092q;
    public float f25093r;
    public float f25094s;
    public float f25095t;
    public float f25096u;
    public boolean v;
    public VelocityTracker f25097w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25077x = ViewConfiguration.getTapTimeout();
        f25078y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25082f = new androidx.mediarouter.app.c(this, 7);
        this.f25083g = i20Var;
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
        this.f25079a = i10 * i10;
        this.f25080b = scaledTouchSlop * scaledTouchSlop;
        this.f25081c = i11 * i11;
    }
}
