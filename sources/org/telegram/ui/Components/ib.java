package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27058a;
    public final Rect f27059b;
    public final GestureDetector f27060c;
    public boolean d;
    public boolean f27061e;
    public float f27062f;
    public float h;
    public float f27063n;
    public boolean f27064r;
    public boolean f27065s;
    public boolean v;
    public boolean f27066w;
    public final FrameLayout f27067x;
    public final qc f27068y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27068y = qcVar;
        this.f27067x = frameLayout;
        this.f27059b = new Rect();
        this.f27058a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27060c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
