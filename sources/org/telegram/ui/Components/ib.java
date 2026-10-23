package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27265a;
    public final Rect f27266b;
    public final GestureDetector f27267c;
    public boolean d;
    public boolean e;
    public float f27268f;
    public float h;
    public float f27269n;
    public boolean f27270r;
    public boolean f27271s;
    public boolean v;
    public boolean f27272w;
    public final FrameLayout f27273x;
    public final qc f27274y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27274y = qcVar;
        this.f27273x = frameLayout;
        this.f27266b = new Rect();
        this.f27265a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27267c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
