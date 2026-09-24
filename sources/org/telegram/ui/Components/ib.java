package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f24970a;
    public final Rect f24971b;
    public final GestureDetector f24972c;
    public boolean d;
    public boolean e;
    public float f24973f;
    public float h;
    public float f24974n;
    public boolean f24975r;
    public boolean f24976s;
    public boolean v;
    public boolean f24977w;
    public final FrameLayout f24978x;
    public final qc f24979y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f24979y = qcVar;
        this.f24978x = frameLayout;
        this.f24971b = new Rect();
        this.f24970a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f24972c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
