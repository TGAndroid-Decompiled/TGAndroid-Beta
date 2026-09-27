package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f25073a;
    public final Rect f25074b;
    public final GestureDetector f25075c;
    public boolean d;
    public boolean e;
    public float f25076f;
    public float h;
    public float f25077n;
    public boolean f25078r;
    public boolean f25079s;
    public boolean v;
    public boolean f25080w;
    public final FrameLayout f25081x;
    public final qc f25082y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f25082y = qcVar;
        this.f25081x = frameLayout;
        this.f25074b = new Rect();
        this.f25073a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f25075c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
