package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ua extends FrameLayout {
    public final cc D;
    public final gb f38561a;
    public final Rect f38562b;
    public final GestureDetector f38563c;
    public boolean d;
    public boolean f38564e;
    public float f38565f;
    public float h;
    public float f38566n;
    public boolean f38567r;
    public boolean f38568s;
    public boolean f38569w;
    public boolean f38570x;
    public final FrameLayout f38571y;

    public ua(cc ccVar, gb gbVar, FrameLayout frameLayout) {
        super(gbVar.getContext());
        this.D = ccVar;
        this.f38571y = frameLayout;
        this.f38562b = new Rect();
        this.f38561a = gbVar;
        GestureDetector gestureDetector = new GestureDetector(gbVar.getContext(), new rb(this, gbVar));
        this.f38563c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(gbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
