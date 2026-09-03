package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class l20 {
    public static final int f26533x;
    public static final int f26534y;
    public final int f26535a;
    public final int f26536b;
    public final int f26537c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.d f26538f;
    public final k20 f26539g;
    public j20 h;
    public boolean f26540i;
    public boolean f26541j;
    public boolean f26542k;
    public boolean f26543l;
    public boolean f26544m;
    public MotionEvent f26545n;
    public MotionEvent f26546o;
    public MotionEvent f26547p;
    public boolean f26548q;
    public float f26549r;
    public float f26550s;
    public float f26551t;
    public float f26552u;
    public boolean v;
    public VelocityTracker f26553w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f26533x = ViewConfiguration.getTapTimeout();
        f26534y = ViewConfiguration.getDoubleTapTimeout();
    }

    public l20(Context context, PhotoViewer photoViewer) {
        this(context, (k20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public l20(Context context, k20 k20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f26538f = new androidx.mediarouter.app.d(this, 9);
        this.f26539g = k20Var;
        if (k20Var instanceof j20) {
            this.h = (j20) k20Var;
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
        this.f26535a = i10 * i10;
        this.f26536b = scaledTouchSlop * scaledTouchSlop;
        this.f26537c = i11 * i11;
    }
}
