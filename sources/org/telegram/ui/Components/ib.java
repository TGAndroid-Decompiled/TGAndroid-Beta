package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27086a;
    public final Rect f27087b;
    public final GestureDetector f27088c;
    public boolean d;
    public boolean f27089e;
    public float f27090f;
    public float h;
    public float f27091n;
    public boolean f27092r;
    public boolean f27093s;
    public boolean v;
    public boolean f27094w;
    public final FrameLayout f27095x;
    public final qc f27096y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27096y = qcVar;
        this.f27095x = frameLayout;
        this.f27087b = new Rect();
        this.f27086a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27088c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
