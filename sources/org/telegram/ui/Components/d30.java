package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class d30 {
    public static final int f25213x;
    public static final int f25214y;
    public final int f25215a;
    public final int f25216b;
    public final int f25217c;
    public final int d;
    public final int f25218e;
    public final androidx.mediarouter.app.c f25219f;
    public final c30 f25220g;
    public b30 h;
    public boolean f25221i;
    public boolean f25222j;
    public boolean f25223k;
    public boolean f25224l;
    public boolean f25225m;
    public MotionEvent f25226n;
    public MotionEvent f25227o;
    public MotionEvent f25228p;
    public boolean f25229q;
    public float f25230r;
    public float f25231s;
    public float f25232t;
    public float f25233u;
    public boolean v;
    public VelocityTracker f25234w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f25213x = ViewConfiguration.getTapTimeout();
        f25214y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f25219f = new androidx.mediarouter.app.c(this, 7);
        this.f25220g = c30Var;
        if (c30Var instanceof b30) {
            this.h = (b30) c30Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f25218e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f25218e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f25215a = i10 * i10;
        this.f25216b = scaledTouchSlop * scaledTouchSlop;
        this.f25217c = i11 * i11;
    }
}
