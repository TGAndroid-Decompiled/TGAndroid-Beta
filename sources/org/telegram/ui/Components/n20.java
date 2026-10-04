package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n20 {
    public static final int f28821x;
    public static final int f28822y;
    public final int f28823a;
    public final int f28824b;
    public final int f28825c;
    public final int d;
    public final int f28826e;
    public final androidx.mediarouter.app.c f28827f;
    public final m20 f28828g;
    public l20 h;
    public boolean f28829i;
    public boolean f28830j;
    public boolean f28831k;
    public boolean f28832l;
    public boolean f28833m;
    public MotionEvent f28834n;
    public MotionEvent f28835o;
    public MotionEvent f28836p;
    public boolean f28837q;
    public float f28838r;
    public float f28839s;
    public float f28840t;
    public float f28841u;
    public boolean v;
    public VelocityTracker f28842w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28821x = ViewConfiguration.getTapTimeout();
        f28822y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f28827f = new androidx.mediarouter.app.c(this, 7);
        this.f28828g = m20Var;
        if (m20Var instanceof l20) {
            this.h = (l20) m20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28826e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28826e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28823a = i10 * i10;
        this.f28824b = scaledTouchSlop * scaledTouchSlop;
        this.f28825c = i11 * i11;
    }
}
