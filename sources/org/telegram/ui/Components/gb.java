package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class gb extends FrameLayout {
    public final sb f24155a;
    public final Rect f24156b;
    public final GestureDetector f24157c;
    public boolean d;
    public boolean e;
    public float f24158f;
    public float h;
    public float f24159n;
    public boolean f24160r;
    public boolean f24161s;
    public boolean v;
    public boolean f24162w;
    public final FrameLayout f24163x;
    public final oc f24164y;

    public gb(oc ocVar, sb sbVar, FrameLayout frameLayout) {
        super(sbVar.getContext());
        this.f24164y = ocVar;
        this.f24163x = frameLayout;
        this.f24156b = new Rect();
        this.f24155a = sbVar;
        GestureDetector gestureDetector = new GestureDetector(sbVar.getContext(), new dc(this, sbVar));
        this.f24157c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(sbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
