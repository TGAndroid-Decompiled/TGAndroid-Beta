package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27165a;
    public final Rect f27166b;
    public final GestureDetector f27167c;
    public boolean d;
    public boolean e;
    public float f27168f;
    public float h;
    public float f27169n;
    public boolean f27170r;
    public boolean f27171s;
    public boolean v;
    public boolean f27172w;
    public final FrameLayout f27173x;
    public final qc f27174y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27174y = qcVar;
        this.f27173x = frameLayout;
        this.f27166b = new Rect();
        this.f27165a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27167c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
