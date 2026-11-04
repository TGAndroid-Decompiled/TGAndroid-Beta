package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class v00 {
    public static final int f38920x;
    public static final int f38921y;
    public final int f38922a;
    public final int f38923b;
    public final int f38924c;
    public final int d;
    public final int f38925e;
    public final android.support.v4.media.session.q f38926f;
    public final u00 f38927g;
    public t00 h;
    public boolean f38928i;
    public boolean f38929j;
    public boolean f38930k;
    public boolean f38931l;
    public boolean f38932m;
    public MotionEvent f38933n;
    public MotionEvent f38934o;
    public MotionEvent f38935p;
    public boolean f38936q;
    public float f38937r;
    public float f38938s;
    public float f38939t;
    public float f38940u;
    public boolean v;
    public VelocityTracker f38941w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f38920x = ViewConfiguration.getTapTimeout();
        f38921y = ViewConfiguration.getDoubleTapTimeout();
    }

    public v00(Context context, PhotoViewer photoViewer) {
        this(context, (u00) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v00.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public v00(Context context, u00 u00Var) {
        int scaledTouchSlop;
        int i3;
        int i10;
        this.f38926f = new android.support.v4.media.session.q(this, 6);
        this.f38927g = u00Var;
        if (u00Var instanceof t00) {
            this.h = (t00) u00Var;
        }
        this.v = true;
        if (context == null) {
            i3 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f38925e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i3;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f38925e = viewConfiguration.getScaledMaximumFlingVelocity();
            i3 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f38922a = i3 * i3;
        this.f38923b = scaledTouchSlop * scaledTouchSlop;
        this.f38924c = i10 * i10;
    }
}
