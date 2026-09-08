package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class j20 {
    public static final int f27331x;
    public static final int f27332y;
    public final int f27333a;
    public final int f27334b;
    public final int f27335c;
    public final int d;
    public final int f27336e;
    public final androidx.mediarouter.app.c f27337f;
    public final i20 f27338g;
    public h20 h;
    public boolean f27339i;
    public boolean f27340j;
    public boolean f27341k;
    public boolean f27342l;
    public boolean f27343m;
    public MotionEvent f27344n;
    public MotionEvent f27345o;
    public MotionEvent f27346p;
    public boolean f27347q;
    public float f27348r;
    public float f27349s;
    public float f27350t;
    public float f27351u;
    public boolean v;
    public VelocityTracker f27352w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f27331x = ViewConfiguration.getTapTimeout();
        f27332y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f27337f = new androidx.mediarouter.app.c(this, 7);
        this.f27338g = i20Var;
        if (i20Var instanceof h20) {
            this.h = (h20) i20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f27336e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f27336e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f27333a = i10 * i10;
        this.f27334b = scaledTouchSlop * scaledTouchSlop;
        this.f27335c = i11 * i11;
    }
}
