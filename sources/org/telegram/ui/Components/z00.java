package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class z00 {
    public static final int f40798x;
    public static final int f40799y;
    public final int f40800a;
    public final int f40801b;
    public final int f40802c;
    public final int d;
    public final int f40803e;
    public final android.support.v4.media.session.q f40804f;
    public final y00 f40805g;
    public x00 h;
    public boolean f40806i;
    public boolean f40807j;
    public boolean f40808k;
    public boolean f40809l;
    public boolean f40810m;
    public MotionEvent f40811n;
    public MotionEvent f40812o;
    public MotionEvent f40813p;
    public boolean f40814q;
    public float f40815r;
    public float f40816s;
    public float f40817t;
    public float f40818u;
    public boolean v;
    public VelocityTracker f40819w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f40798x = ViewConfiguration.getTapTimeout();
        f40799y = ViewConfiguration.getDoubleTapTimeout();
    }

    public z00(Context context, PhotoViewer photoViewer) {
        this(context, (y00) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z00.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public z00(Context context, y00 y00Var) {
        int scaledTouchSlop;
        int i7;
        int i10;
        this.f40804f = new android.support.v4.media.session.q(this, 5);
        this.f40805g = y00Var;
        if (y00Var instanceof x00) {
            this.h = (x00) y00Var;
        }
        this.v = true;
        if (context == null) {
            i7 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f40803e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = i7;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f40803e = viewConfiguration.getScaledMaximumFlingVelocity();
            i7 = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f40800a = i7 * i7;
        this.f40801b = scaledTouchSlop * scaledTouchSlop;
        this.f40802c = i10 * i10;
    }
}
