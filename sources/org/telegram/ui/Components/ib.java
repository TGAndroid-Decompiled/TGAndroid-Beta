package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f27210a;
    public final Rect f27211b;
    public final GestureDetector f27212c;
    public boolean d;
    public boolean e;
    public float f27213f;
    public float h;
    public float f27214n;
    public boolean f27215r;
    public boolean f27216s;
    public boolean v;
    public boolean f27217w;
    public final FrameLayout f27218x;
    public final qc f27219y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f27219y = qcVar;
        this.f27218x = frameLayout;
        this.f27211b = new Rect();
        this.f27210a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f27212c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
