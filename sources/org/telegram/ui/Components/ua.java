package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ua extends FrameLayout {
    public final cc D;
    public final gb f38565a;
    public final Rect f38566b;
    public final GestureDetector f38567c;
    public boolean d;
    public boolean f38568e;
    public float f38569f;
    public float h;
    public float f38570n;
    public boolean f38571r;
    public boolean f38572s;
    public boolean f38573w;
    public boolean f38574x;
    public final FrameLayout f38575y;

    public ua(cc ccVar, gb gbVar, FrameLayout frameLayout) {
        super(gbVar.getContext());
        this.D = ccVar;
        this.f38575y = frameLayout;
        this.f38566b = new Rect();
        this.f38565a = gbVar;
        GestureDetector gestureDetector = new GestureDetector(gbVar.getContext(), new rb(this, gbVar));
        this.f38567c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(gbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
