package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class b30 {
    public static final int f24813x;
    public static final int f24814y;
    public final int f24815a;
    public final int f24816b;
    public final int f24817c;
    public final int d;
    public final int f24818e;
    public final androidx.mediarouter.app.c f24819f;
    public final a30 f24820g;
    public z20 h;
    public boolean f24821i;
    public boolean f24822j;
    public boolean f24823k;
    public boolean f24824l;
    public boolean f24825m;
    public MotionEvent f24826n;
    public MotionEvent f24827o;
    public MotionEvent f24828p;
    public boolean f24829q;
    public float f24830r;
    public float f24831s;
    public float f24832t;
    public float f24833u;
    public boolean v;
    public VelocityTracker f24834w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f24813x = ViewConfiguration.getTapTimeout();
        f24814y = ViewConfiguration.getDoubleTapTimeout();
    }

    public b30(Context context, PhotoViewer photoViewer) {
        this(context, (a30) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b30.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public b30(Context context, a30 a30Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f24819f = new androidx.mediarouter.app.c(this, 7);
        this.f24820g = a30Var;
        if (a30Var instanceof z20) {
            this.h = (z20) a30Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f24818e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24818e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f24815a = i10 * i10;
        this.f24816b = scaledTouchSlop * scaledTouchSlop;
        this.f24817c = i11 * i11;
    }
}
