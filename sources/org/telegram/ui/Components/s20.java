package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class s20 {
    public static final int f26902x;
    public static final int f26903y;
    public final int f26904a;
    public final int f26905b;
    public final int f26906c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f26907f;
    public final r20 f26908g;
    public q20 h;
    public boolean f26909i;
    public boolean f26910j;
    public boolean f26911k;
    public boolean f26912l;
    public boolean f26913m;
    public MotionEvent f26914n;
    public MotionEvent f26915o;
    public MotionEvent f26916p;
    public boolean f26917q;
    public float f26918r;
    public float f26919s;
    public float f26920t;
    public float f26921u;
    public boolean v;
    public VelocityTracker f26922w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f26902x = ViewConfiguration.getTapTimeout();
        f26903y = ViewConfiguration.getDoubleTapTimeout();
    }

    public s20(Context context, PhotoViewer photoViewer) {
        this(context, (r20) photoViewer);
    }

    public final boolean a(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        this.v = false;
    }

    public s20(Context context, r20 r20Var) {
        int scaledTouchSlop;
        int i10;
        int i11;
        this.f26907f = new androidx.mediarouter.app.c(this, 7);
        this.f26908g = r20Var;
        if (r20Var instanceof q20) {
            this.h = (q20) r20Var;
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
        this.f26904a = i10 * i10;
        this.f26905b = scaledTouchSlop * scaledTouchSlop;
        this.f26906c = i11 * i11;
    }
}
