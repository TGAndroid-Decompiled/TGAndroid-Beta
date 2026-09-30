package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n20 {
    public static final int f26529x;
    public static final int f26530y;
    public final int f26531a;
    public final int f26532b;
    public final int f26533c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f26534f;
    public final m20 f26535g;
    public l20 h;
    public boolean f26536i;
    public boolean f26537j;
    public boolean f26538k;
    public boolean f26539l;
    public boolean f26540m;
    public MotionEvent f26541n;
    public MotionEvent f26542o;
    public MotionEvent f26543p;
    public boolean f26544q;
    public float f26545r;
    public float f26546s;
    public float f26547t;
    public float f26548u;
    public boolean v;
    public VelocityTracker f26549w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f26529x = ViewConfiguration.getTapTimeout();
        f26530y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f26534f = new androidx.mediarouter.app.c(this, 7);
        this.f26535g = m20Var;
        if (m20Var instanceof l20) {
            this.h = (l20) m20Var;
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
        this.f26531a = i10 * i10;
        this.f26532b = scaledTouchSlop * scaledTouchSlop;
        this.f26533c = i11 * i11;
    }
}
