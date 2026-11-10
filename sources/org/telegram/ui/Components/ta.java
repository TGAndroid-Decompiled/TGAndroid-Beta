package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class ta extends FrameLayout {
    public final bc D;
    public final fb f38250a;
    public final Rect f38251b;
    public final GestureDetector f38252c;
    public boolean d;
    public boolean f38253e;
    public float f38254f;
    public float h;
    public float f38255n;
    public boolean f38256r;
    public boolean f38257s;
    public boolean f38258w;
    public boolean f38259x;
    public final FrameLayout f38260y;

    public ta(bc bcVar, fb fbVar, FrameLayout frameLayout) {
        super(fbVar.getContext());
        this.D = bcVar;
        this.f38260y = frameLayout;
        this.f38251b = new Rect();
        this.f38250a = fbVar;
        GestureDetector gestureDetector = new GestureDetector(fbVar.getContext(), new qb(this, fbVar));
        this.f38252c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(fbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
