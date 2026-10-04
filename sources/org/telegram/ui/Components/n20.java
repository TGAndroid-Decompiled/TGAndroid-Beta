package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n20 {
    public static final int f28827x;
    public static final int f28828y;
    public final int f28829a;
    public final int f28830b;
    public final int f28831c;
    public final int d;
    public final int f28832e;
    public final androidx.mediarouter.app.c f28833f;
    public final m20 f28834g;
    public l20 h;
    public boolean f28835i;
    public boolean f28836j;
    public boolean f28837k;
    public boolean f28838l;
    public boolean f28839m;
    public MotionEvent f28840n;
    public MotionEvent f28841o;
    public MotionEvent f28842p;
    public boolean f28843q;
    public float f28844r;
    public float f28845s;
    public float f28846t;
    public float f28847u;
    public boolean v;
    public VelocityTracker f28848w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28827x = ViewConfiguration.getTapTimeout();
        f28828y = ViewConfiguration.getDoubleTapTimeout();
    }

    public n20(Context context, PhotoViewer photoViewer) {
        this(context, (m20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public n20(Context context, m20 m20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f28833f = new androidx.mediarouter.app.c(this, 7);
        this.f28834g = m20Var;
        if (m20Var instanceof l20) {
            this.h = (l20) m20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28832e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28832e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28829a = i10 * i10;
        this.f28830b = scaledTouchSlop * scaledTouchSlop;
        this.f28831c = i11 * i11;
    }
}
