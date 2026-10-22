package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27213a;
    public final Rect f27214b;
    public final GestureDetector f27215c;
    public boolean d;
    public boolean e;
    public float f27216f;
    public float h;
    public float f27217n;
    public boolean f27218r;
    public boolean f27219s;
    public boolean v;
    public boolean f27220w;
    public final FrameLayout f27221x;
    public final qc f27222y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27222y = qcVar;
        this.f27221x = frameLayout;
        this.f27214b = new Rect();
        this.f27213a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27215c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
