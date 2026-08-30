package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class k20 {
    public static final int f26107x;
    public static final int f26108y;
    public final int f26109a;
    public final int f26110b;
    public final int f26111c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.d f26112f;
    public final j20 f26113g;
    public i20 h;
    public boolean f26114i;
    public boolean f26115j;
    public boolean f26116k;
    public boolean f26117l;
    public boolean f26118m;
    public MotionEvent f26119n;
    public MotionEvent f26120o;
    public MotionEvent f26121p;
    public boolean f26122q;
    public float f26123r;
    public float f26124s;
    public float f26125t;
    public float f26126u;
    public boolean v;
    public VelocityTracker f26127w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f26107x = ViewConfiguration.getTapTimeout();
        f26108y = ViewConfiguration.getDoubleTapTimeout();
    }

    public k20(Context context, PhotoViewer photoViewer) {
        this(context, (j20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public k20(Context context, j20 j20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f26112f = new androidx.mediarouter.app.d(this, 9);
        this.f26113g = j20Var;
        if (j20Var instanceof i20) {
            this.h = (i20) j20Var;
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
        this.f26109a = i10 * i10;
        this.f26110b = scaledTouchSlop * scaledTouchSlop;
        this.f26111c = i11 * i11;
    }
}
