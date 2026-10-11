package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class b30 {
    public static final int f24871x;
    public static final int f24872y;
    public final int f24873a;
    public final int f24874b;
    public final int f24875c;
    public final int d;
    public final int f24876e;
    public final androidx.mediarouter.app.c f24877f;
    public final a30 f24878g;
    public z20 h;
    public boolean f24879i;
    public boolean f24880j;
    public boolean f24881k;
    public boolean f24882l;
    public boolean f24883m;
    public MotionEvent f24884n;
    public MotionEvent f24885o;
    public MotionEvent f24886p;
    public boolean f24887q;
    public float f24888r;
    public float f24889s;
    public float f24890t;
    public float f24891u;
    public boolean v;
    public VelocityTracker f24892w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f24871x = ViewConfiguration.getTapTimeout();
        f24872y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f24877f = new androidx.mediarouter.app.c(this, 7);
        this.f24878g = a30Var;
        if (a30Var instanceof z20) {
            this.h = (z20) a30Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f24876e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f24876e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f24873a = i10 * i10;
        this.f24874b = scaledTouchSlop * scaledTouchSlop;
        this.f24875c = i11 * i11;
    }
}
