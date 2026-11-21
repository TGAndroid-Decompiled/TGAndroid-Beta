package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n10 {
    public static final int f37721x;
    public static final int f37722y;
    public final int f37723a;
    public final int f37724b;
    public final int f37725c;
    public final int d;
    public final int f37726e;
    public final android.support.v4.media.session.q f37727f;
    public final m10 f37728g;
    public l10 h;
    public boolean f37729i;
    public boolean f37730j;
    public boolean f37731k;
    public boolean f37732l;
    public boolean f37733m;
    public MotionEvent f37734n;
    public MotionEvent f37735o;
    public MotionEvent f37736p;
    public boolean f37737q;
    public float f37738r;
    public float f37739s;
    public float f37740t;
    public float f37741u;
    public boolean v;
    public VelocityTracker f37742w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f37721x = ViewConfiguration.getTapTimeout();
        f37722y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f37727f = new android.support.v4.media.session.q(this, 5);
        this.f37728g = m10Var;
        if (m10Var instanceof l10) {
            this.h = (l10) m10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f37726e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f37726e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f37723a = i7 * i7;
        this.f37724b = scaledTouchSlop * scaledTouchSlop;
        this.f37725c = i10 * i10;
    }
}
