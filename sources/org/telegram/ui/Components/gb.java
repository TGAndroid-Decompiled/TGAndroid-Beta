package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class gb extends FrameLayout {
    public final sb f26605a;
    public final Rect f26606b;
    public final GestureDetector f26607c;
    public boolean d;
    public boolean e;
    public float f26608f;
    public float h;
    public float f26609n;
    public boolean f26610r;
    public boolean f26611s;
    public boolean v;
    public boolean f26612w;
    public final FrameLayout f26613x;
    public final oc f26614y;

    public gb(oc ocVar, sb sbVar, FrameLayout frameLayout) {
        super(sbVar.getContext());
        this.f26614y = ocVar;
        this.f26613x = frameLayout;
        this.f26606b = new Rect();
        this.f26605a = sbVar;
        GestureDetector gestureDetector = new GestureDetector(sbVar.getContext(), new dc(this, sbVar));
        this.f26607c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(sbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
