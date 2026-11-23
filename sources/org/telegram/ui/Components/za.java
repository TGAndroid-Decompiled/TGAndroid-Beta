package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final gc E;
    public final lb f42743a;
    public final Rect f42744b;
    public final GestureDetector f42745c;
    public boolean d;
    public boolean f42746e;
    public float f42747f;
    public float h;
    public float f42748n;
    public boolean f42749r;
    public boolean f42750s;
    public boolean f42751w;
    public boolean f42752x;
    public final FrameLayout f42753y;

    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.E = gcVar;
        this.f42753y = frameLayout;
        this.f42744b = new Rect();
        this.f42743a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.f42745c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
