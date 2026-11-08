package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ua extends FrameLayout {
    public final cc D;
    public final gb f38576a;
    public final Rect f38577b;
    public final GestureDetector f38578c;
    public boolean d;
    public boolean f38579e;
    public float f38580f;
    public float h;
    public float f38581n;
    public boolean f38582r;
    public boolean f38583s;
    public boolean f38584w;
    public boolean f38585x;
    public final FrameLayout f38586y;

    public ua(cc ccVar, gb gbVar, FrameLayout frameLayout) {
        super(gbVar.getContext());
        this.D = ccVar;
        this.f38586y = frameLayout;
        this.f38577b = new Rect();
        this.f38576a = gbVar;
        GestureDetector gestureDetector = new GestureDetector(gbVar.getContext(), new rb(this, gbVar));
        this.f38578c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(gbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
