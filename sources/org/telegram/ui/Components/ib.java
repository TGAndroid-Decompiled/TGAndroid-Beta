package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27175a;
    public final Rect f27176b;
    public final GestureDetector f27177c;
    public boolean d;
    public boolean e;
    public float f27178f;
    public float h;
    public float f27179n;
    public boolean f27180r;
    public boolean f27181s;
    public boolean v;
    public boolean f27182w;
    public final FrameLayout f27183x;
    public final qc f27184y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27184y = qcVar;
        this.f27183x = frameLayout;
        this.f27176b = new Rect();
        this.f27175a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27177c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
