package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27173a;
    public final Rect f27174b;
    public final GestureDetector f27175c;
    public boolean d;
    public boolean e;
    public float f27176f;
    public float h;
    public float f27177n;
    public boolean f27178r;
    public boolean f27179s;
    public boolean v;
    public boolean f27180w;
    public final FrameLayout f27181x;
    public final qc f27182y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27182y = qcVar;
        this.f27181x = frameLayout;
        this.f27174b = new Rect();
        this.f27173a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27175c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
