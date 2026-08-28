package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class za extends FrameLayout {
    public final lb f35253a;
    public final Rect f35254b;
    public final GestureDetector f35255c;
    public boolean d;
    public boolean f35256e;
    public float f35257f;
    public float h;
    public float f35258n;
    public boolean f35259r;
    public boolean f35260s;
    public boolean v;
    public boolean f35261w;
    public final FrameLayout f35262x;
    public final gc f35263y;

    public za(gc gcVar, lb lbVar, FrameLayout frameLayout) {
        super(lbVar.getContext());
        this.f35263y = gcVar;
        this.f35262x = frameLayout;
        this.f35254b = new Rect();
        this.f35253a = lbVar;
        GestureDetector gestureDetector = new GestureDetector(lbVar.getContext(), new vb(this, lbVar));
        this.f35255c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(lbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
