package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final gc E;
    public final lb f42739a;
    public final Rect f42740b;
    public final GestureDetector f42741c;
    public boolean d;
    public boolean f42742e;
    public float f42743f;
    public float h;
    public float f42744n;
    public boolean f42745r;
    public boolean f42746s;
    public boolean f42747w;
    public boolean f42748x;
    public final FrameLayout f42749y;

    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.E = gcVar;
        this.f42749y = frameLayout;
        this.f42740b = new Rect();
        this.f42739a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.f42741c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
