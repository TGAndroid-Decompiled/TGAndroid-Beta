package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class m20 {
    public static final int f26238x;
    public static final int f26239y;
    public final int f26240a;
    public final int f26241b;
    public final int f26242c;
    public final int d;
    public final int e;
    public final androidx.mediarouter.app.c f26243f;
    public final l20 f26244g;
    public k20 h;
    public boolean f26245i;
    public boolean f26246j;
    public boolean f26247k;
    public boolean f26248l;
    public boolean f26249m;
    public MotionEvent f26250n;
    public MotionEvent f26251o;
    public MotionEvent f26252p;
    public boolean f26253q;
    public float f26254r;
    public float f26255s;
    public float f26256t;
    public float f26257u;
    public boolean v;
    public VelocityTracker f26258w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f26238x = ViewConfiguration.getTapTimeout();
        f26239y = ViewConfiguration.getDoubleTapTimeout();
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
        this.f26243f = new androidx.mediarouter.app.c(this, 7);
        this.f26244g = l20Var;
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
        this.f26240a = i10 * i10;
        this.f26241b = scaledTouchSlop * scaledTouchSlop;
        this.f26242c = i11 * i11;
    }
}
