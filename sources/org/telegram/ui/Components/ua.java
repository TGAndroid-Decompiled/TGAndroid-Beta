package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ua extends FrameLayout {
    public final cc D;
    public final gb f38574a;
    public final Rect f38575b;
    public final GestureDetector f38576c;
    public boolean d;
    public boolean f38577e;
    public float f38578f;
    public float h;
    public float f38579n;
    public boolean f38580r;
    public boolean f38581s;
    public boolean f38582w;
    public boolean f38583x;
    public final FrameLayout f38584y;

    public ua(cc ccVar, gb gbVar, FrameLayout frameLayout) {
        super(gbVar.getContext());
        this.D = ccVar;
        this.f38584y = frameLayout;
        this.f38575b = new Rect();
        this.f38574a = gbVar;
        GestureDetector gestureDetector = new GestureDetector(gbVar.getContext(), new rb(this, gbVar));
        this.f38576c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(gbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
