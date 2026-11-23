package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class n10 {
    public static final int f37718x;
    public static final int f37719y;
    public final int f37720a;
    public final int f37721b;
    public final int f37722c;
    public final int d;
    public final int f37723e;
    public final android.support.v4.media.session.q f37724f;
    public final m10 f37725g;
    public l10 h;
    public boolean f37726i;
    public boolean f37727j;
    public boolean f37728k;
    public boolean f37729l;
    public boolean f37730m;
    public MotionEvent f37731n;
    public MotionEvent f37732o;
    public MotionEvent f37733p;
    public boolean f37734q;
    public float f37735r;
    public float f37736s;
    public float f37737t;
    public float f37738u;
    public boolean v;
    public VelocityTracker f37739w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f37718x = ViewConfiguration.getTapTimeout();
        f37719y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f37724f = new android.support.v4.media.session.q(this, 5);
        this.f37725g = m10Var;
        if (m10Var instanceof l10) {
            this.h = (l10) m10Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f37723e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f37723e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f37720a = i7 * i7;
        this.f37721b = scaledTouchSlop * scaledTouchSlop;
        this.f37722c = i10 * i10;
    }
}
