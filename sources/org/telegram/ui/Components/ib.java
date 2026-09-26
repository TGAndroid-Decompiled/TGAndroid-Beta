package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f24995a;
    public final Rect f24996b;
    public final GestureDetector f24997c;
    public boolean d;
    public boolean e;
    public float f24998f;
    public float h;
    public float f24999n;
    public boolean f25000r;
    public boolean f25001s;
    public boolean v;
    public boolean f25002w;
    public final FrameLayout f25003x;
    public final qc f25004y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25004y = qcVar;
        this.f25003x = frameLayout;
        this.f24996b = new Rect();
        this.f24995a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f24997c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
