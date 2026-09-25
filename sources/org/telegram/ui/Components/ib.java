package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f24996a;
    public final Rect f24997b;
    public final GestureDetector f24998c;
    public boolean d;
    public boolean e;
    public float f24999f;
    public float h;
    public float f25000n;
    public boolean f25001r;
    public boolean f25002s;
    public boolean v;
    public boolean f25003w;
    public final FrameLayout f25004x;
    public final qc f25005y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25005y = qcVar;
        this.f25004x = frameLayout;
        this.f24997b = new Rect();
        this.f24996a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f24998c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
