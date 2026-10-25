package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f29253a;
    public final Rect f29254b;
    public final GestureDetector f29255c;
    public boolean d;
    public boolean e;
    public float f29256f;
    public float h;
    public float f29257n;
    public boolean f29258r;
    public boolean f29259s;
    public boolean v;
    public boolean f29260w;
    public final FrameLayout f29261x;
    public final qc f29262y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f29262y = qcVar;
        this.f29261x = frameLayout;
        this.f29254b = new Rect();
        this.f29253a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f29255c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
