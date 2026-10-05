package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n20 {
    public static final int f28932x;
    public static final int f28933y;
    public final int f28934a;
    public final int f28935b;
    public final int f28936c;
    public final int d;
    public final int f28937e;
    public final androidx.mediarouter.app.c f28938f;
    public final m20 f28939g;
    public l20 h;
    public boolean f28940i;
    public boolean f28941j;
    public boolean f28942k;
    public boolean f28943l;
    public boolean f28944m;
    public MotionEvent f28945n;
    public MotionEvent f28946o;
    public MotionEvent f28947p;
    public boolean f28948q;
    public float f28949r;
    public float f28950s;
    public float f28951t;
    public float f28952u;
    public boolean v;
    public VelocityTracker f28953w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f28932x = ViewConfiguration.getTapTimeout();
        f28933y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f28938f = new androidx.mediarouter.app.c(this, 7);
        this.f28939g = m20Var;
        if (m20Var instanceof l20) {
            this.h = (l20) m20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f28937e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f28937e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f28934a = i10 * i10;
        this.f28935b = scaledTouchSlop * scaledTouchSlop;
        this.f28936c = i11 * i11;
    }
}
