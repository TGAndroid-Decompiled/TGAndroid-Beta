package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n20 {
    public static final int f28822x;
    public static final int f28823y;
    public final int f28824a;
    public final int f28825b;
    public final int f28826c;
    public final int d;
    public final int f28827e;
    public final androidx.mediarouter.app.c f28828f;
    public final m20 f28829g;
    public l20 h;
    public boolean f28830i;
    public boolean f28831j;
    public boolean f28832k;
    public boolean f28833l;
    public boolean f28834m;
    public MotionEvent f28835n;
    public MotionEvent f28836o;
    public MotionEvent f28837p;
    public boolean f28838q;
    public float f28839r;
    public float f28840s;
    public float f28841t;
    public float f28842u;
    public boolean v;
    public VelocityTracker f28843w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28822x = ViewConfiguration.getTapTimeout();
        f28823y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f28828f = new androidx.mediarouter.app.c(this, 7);
        this.f28829g = m20Var;
        if (m20Var instanceof l20) {
            this.h = (l20) m20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28827e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28827e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28824a = i10 * i10;
        this.f28825b = scaledTouchSlop * scaledTouchSlop;
        this.f28826c = i11 * i11;
    }
}
