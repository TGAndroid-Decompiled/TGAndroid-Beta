package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class m20 {
    public static final int f26294x;
    public static final int f26295y;
    public final int f26296a;
    public final int f26297b;
    public final int f26298c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f26299f;
    public final l20 f26300g;
    public k20 h;
    public boolean f26301i;
    public boolean f26302j;
    public boolean f26303k;
    public boolean f26304l;
    public boolean f26305m;
    public MotionEvent f26306n;
    public MotionEvent f26307o;
    public MotionEvent f26308p;
    public boolean f26309q;
    public float f26310r;
    public float f26311s;
    public float f26312t;
    public float f26313u;
    public boolean v;
    public VelocityTracker f26314w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f26294x = ViewConfiguration.getTapTimeout();
        f26295y = ViewConfiguration.getDoubleTapTimeout();
    }

    public m20(Context context, PhotoViewer photoViewer) {
        this(context, (l20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public m20(Context context, l20 l20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f26299f = new androidx.mediarouter.app.c(this, 7);
        this.f26300g = l20Var;
        if (l20Var instanceof k20) {
            this.h = (k20) l20Var;
        }
        this.v = true;
        if (context == null) {
            i10 = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i11 = 100;
            scaledTouchSlop = i10;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i10 = scaledTouchSlop2;
            i11 = scaledDoubleTapSlop;
        }
        this.f26296a = i10 * i10;
        this.f26297b = scaledTouchSlop * scaledTouchSlop;
        this.f26298c = i11 * i11;
    }
}
