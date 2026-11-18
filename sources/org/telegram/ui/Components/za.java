package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final gc E;
    public final lb f42830a;
    public final Rect f42831b;
    public final GestureDetector f42832c;
    public boolean d;
    public boolean f42833e;
    public float f42834f;
    public float h;
    public float f42835n;
    public boolean f42836r;
    public boolean f42837s;
    public boolean f42838w;
    public boolean f42839x;
    public final FrameLayout f42840y;

    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.E = gcVar;
        this.f42840y = frameLayout;
        this.f42831b = new Rect();
        this.f42830a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.f42832c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
