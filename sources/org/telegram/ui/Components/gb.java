package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class gb extends FrameLayout {
    public final sb f24286a;
    public final Rect f24287b;
    public final GestureDetector f24288c;
    public boolean d;
    public boolean e;
    public float f24289f;
    public float h;
    public float f24290n;
    public boolean f24291r;
    public boolean f24292s;
    public boolean v;
    public boolean f24293w;
    public final FrameLayout f24294x;
    public final oc f24295y;

    public gb(oc ocVar, sb sbVar, FrameLayout frameLayout) {
        super(sbVar.getContext());
        this.f24295y = ocVar;
        this.f24294x = frameLayout;
        this.f24287b = new Rect();
        this.f24286a = sbVar;
        GestureDetector gestureDetector = new GestureDetector(sbVar.getContext(), new dc(this, sbVar));
        this.f24288c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(sbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
