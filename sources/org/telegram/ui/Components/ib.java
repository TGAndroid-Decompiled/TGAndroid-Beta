package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27214a;
    public final Rect f27215b;
    public final GestureDetector f27216c;
    public boolean d;
    public boolean e;
    public float f27217f;
    public float h;
    public float f27218n;
    public boolean f27219r;
    public boolean f27220s;
    public boolean v;
    public boolean f27221w;
    public final FrameLayout f27222x;
    public final qc f27223y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27223y = qcVar;
        this.f27222x = frameLayout;
        this.f27215b = new Rect();
        this.f27214a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27216c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
