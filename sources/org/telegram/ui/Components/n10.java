package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n10 {
    public static final int f37674x;
    public static final int f37675y;
    public final int f37676a;
    public final int f37677b;
    public final int f37678c;
    public final int d;
    public final int f37679e;
    public final android.support.v4.media.session.q f37680f;
    public final m10 f37681g;
    public l10 h;
    public boolean f37682i;
    public boolean f37683j;
    public boolean f37684k;
    public boolean f37685l;
    public boolean f37686m;
    public MotionEvent f37687n;
    public MotionEvent f37688o;
    public MotionEvent f37689p;
    public boolean f37690q;
    public float f37691r;
    public float f37692s;
    public float f37693t;
    public float f37694u;
    public boolean v;
    public VelocityTracker f37695w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f37674x = ViewConfiguration.getTapTimeout();
        f37675y = ViewConfiguration.getDoubleTapTimeout();
    }

    public n10(Context context, PhotoViewer photoViewer) {
        this(context, (m10) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public n10(Context context, m10 m10Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f37680f = new android.support.v4.media.session.q(this, 5);
        this.f37681g = m10Var;
        if (m10Var instanceof l10) {
            this.h = (l10) m10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f37679e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f37679e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f37676a = i7 * i7;
        this.f37677b = scaledTouchSlop * scaledTouchSlop;
        this.f37678c = i10 * i10;
    }
}
