package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n10 {
    public static final int f37719x;
    public static final int f37720y;
    public final int f37721a;
    public final int f37722b;
    public final int f37723c;
    public final int d;
    public final int f37724e;
    public final android.support.v4.media.session.q f37725f;
    public final m10 f37726g;
    public l10 h;
    public boolean f37727i;
    public boolean f37728j;
    public boolean f37729k;
    public boolean f37730l;
    public boolean f37731m;
    public MotionEvent f37732n;
    public MotionEvent f37733o;
    public MotionEvent f37734p;
    public boolean f37735q;
    public float f37736r;
    public float f37737s;
    public float f37738t;
    public float f37739u;
    public boolean v;
    public VelocityTracker f37740w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f37719x = ViewConfiguration.getTapTimeout();
        f37720y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f37725f = new android.support.v4.media.session.q(this, 5);
        this.f37726g = m10Var;
        if (m10Var instanceof l10) {
            this.h = (l10) m10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f37724e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f37724e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f37721a = i7 * i7;
        this.f37722b = scaledTouchSlop * scaledTouchSlop;
        this.f37723c = i10 * i10;
    }
}
