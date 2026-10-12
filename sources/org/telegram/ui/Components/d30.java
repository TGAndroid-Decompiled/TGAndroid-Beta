package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class d30 {
    public static final int f25205x;
    public static final int f25206y;
    public final int f25207a;
    public final int f25208b;
    public final int f25209c;
    public final int d;
    public final int f25210e;
    public final androidx.mediarouter.app.c f25211f;
    public final c30 f25212g;
    public b30 h;
    public boolean f25213i;
    public boolean f25214j;
    public boolean f25215k;
    public boolean f25216l;
    public boolean f25217m;
    public MotionEvent f25218n;
    public MotionEvent f25219o;
    public MotionEvent f25220p;
    public boolean f25221q;
    public float f25222r;
    public float f25223s;
    public float f25224t;
    public float f25225u;
    public boolean v;
    public VelocityTracker f25226w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25205x = ViewConfiguration.getTapTimeout();
        f25206y = ViewConfiguration.getDoubleTapTimeout();
    }

    public d30(Context context, PhotoViewer photoViewer) {
        this(context, (c30) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d30.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public d30(Context context, c30 c30Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f25211f = new androidx.mediarouter.app.c(this, 7);
        this.f25212g = c30Var;
        if (c30Var instanceof b30) {
            this.h = (b30) c30Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f25210e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f25210e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f25207a = i10 * i10;
        this.f25208b = scaledTouchSlop * scaledTouchSlop;
        this.f25209c = i11 * i11;
    }
}
