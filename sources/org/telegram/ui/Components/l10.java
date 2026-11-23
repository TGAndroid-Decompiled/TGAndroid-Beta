package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class l10 {
    public static final int f36975x;
    public static final int f36976y;
    public final int f36977a;
    public final int f36978b;
    public final int f36979c;
    public final int d;
    public final int f36980e;
    public final android.support.v4.media.session.q f36981f;
    public final k10 f36982g;
    public j10 h;
    public boolean f36983i;
    public boolean f36984j;
    public boolean f36985k;
    public boolean f36986l;
    public boolean f36987m;
    public MotionEvent f36988n;
    public MotionEvent f36989o;
    public MotionEvent f36990p;
    public boolean f36991q;
    public float f36992r;
    public float f36993s;
    public float f36994t;
    public float f36995u;
    public boolean v;
    public VelocityTracker f36996w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f36975x = ViewConfiguration.getTapTimeout();
        f36976y = ViewConfiguration.getDoubleTapTimeout();
    }

    public l10(Context context, PhotoViewer photoViewer) {
        this(context, (k10) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l10.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public l10(Context context, k10 k10Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f36981f = new android.support.v4.media.session.q(this, 5);
        this.f36982g = k10Var;
        if (k10Var instanceof j10) {
            this.h = (j10) k10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f36980e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f36980e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f36977a = i7 * i7;
        this.f36978b = scaledTouchSlop * scaledTouchSlop;
        this.f36979c = i10 * i10;
    }
}
