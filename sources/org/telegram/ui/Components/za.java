package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final gc E;
    public final lb f42700a;
    public final Rect f42701b;
    public final GestureDetector f42702c;
    public boolean d;
    public boolean f42703e;
    public float f42704f;
    public float h;
    public float f42705n;
    public boolean f42706r;
    public boolean f42707s;
    public boolean f42708w;
    public boolean f42709x;
    public final FrameLayout f42710y;

    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.E = gcVar;
        this.f42710y = frameLayout;
        this.f42701b = new Rect();
        this.f42700a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.f42702c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
