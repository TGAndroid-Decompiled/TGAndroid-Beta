package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final ub f24927a;
    public final Rect f24928b;
    public final GestureDetector f24929c;
    public boolean d;
    public boolean e;
    public float f24930f;
    public float h;
    public float f24931n;
    public boolean f24932r;
    public boolean f24933s;
    public boolean v;
    public boolean f24934w;
    public final FrameLayout f24935x;
    public final qc f24936y;

    public ib(qc qcVar, ub ubVar, FrameLayout frameLayout) {
        super(ubVar.getContext());
        this.f24936y = qcVar;
        this.f24935x = frameLayout;
        this.f24928b = new Rect();
        this.f24927a = ubVar;
        GestureDetector gestureDetector = new GestureDetector(ubVar.getContext(), new fc(this, ubVar));
        this.f24929c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(ubVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
