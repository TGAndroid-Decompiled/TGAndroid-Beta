package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ua extends FrameLayout {
    public final cc D;
    public final gb f38662a;
    public final Rect f38663b;
    public final GestureDetector f38664c;
    public boolean d;
    public boolean f38665e;
    public float f38666f;
    public float h;
    public float f38667n;
    public boolean f38668r;
    public boolean f38669s;
    public boolean f38670w;
    public boolean f38671x;
    public final FrameLayout f38672y;

    public ua(cc ccVar, gb gbVar, FrameLayout frameLayout) {
        super(gbVar.getContext());
        this.D = ccVar;
        this.f38672y = frameLayout;
        this.f38663b = new Rect();
        this.f38662a = gbVar;
        GestureDetector gestureDetector = new GestureDetector(gbVar.getContext(), new rb(this, gbVar));
        this.f38664c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(gbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
