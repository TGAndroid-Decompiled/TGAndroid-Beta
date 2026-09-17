package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27059a;
    public final Rect f27060b;
    public final GestureDetector f27061c;
    public boolean d;
    public boolean f27062e;
    public float f27063f;
    public float h;
    public float f27064n;
    public boolean f27065r;
    public boolean f27066s;
    public boolean v;
    public boolean f27067w;
    public final FrameLayout f27068x;
    public final qc f27069y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27069y = qcVar;
        this.f27068x = frameLayout;
        this.f27060b = new Rect();
        this.f27059a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27061c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
