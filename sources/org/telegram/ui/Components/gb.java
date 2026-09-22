package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class gb extends FrameLayout {
    public final sb f24283a;
    public final Rect f24284b;
    public final GestureDetector f24285c;
    public boolean d;
    public boolean e;
    public float f24286f;
    public float h;
    public float f24287n;
    public boolean f24288r;
    public boolean f24289s;
    public boolean v;
    public boolean f24290w;
    public final FrameLayout f24291x;
    public final oc f24292y;

    public gb(oc ocVar, sb sbVar, FrameLayout frameLayout) {
        super(sbVar.getContext());
        this.f24292y = ocVar;
        this.f24291x = frameLayout;
        this.f24284b = new Rect();
        this.f24283a = sbVar;
        GestureDetector gestureDetector = new GestureDetector(sbVar.getContext(), new dc(this, sbVar));
        this.f24285c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(sbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
