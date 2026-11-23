package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final gc E;
    public final lb f42742a;
    public final Rect f42743b;
    public final GestureDetector f42744c;
    public boolean d;
    public boolean f42745e;
    public float f42746f;
    public float h;
    public float f42747n;
    public boolean f42748r;
    public boolean f42749s;
    public boolean f42750w;
    public boolean f42751x;
    public final FrameLayout f42752y;

    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.E = gcVar;
        this.f42752y = frameLayout;
        this.f42743b = new Rect();
        this.f42742a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.f42744c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
