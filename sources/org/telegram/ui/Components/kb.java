package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final wb f26653a;
    public final Rect f26654b;
    public final GestureDetector f26655c;
    public boolean d;
    public boolean e;
    public float f26656f;
    public float h;
    public float f26657n;
    public boolean f26658r;
    public boolean f26659s;
    public boolean v;
    public boolean f26660w;
    public final FrameLayout f26661x;
    public final sc f26662y;

    public kb(sc scVar, wb wbVar, FrameLayout frameLayout) {
        super(wbVar.getContext());
        this.f26662y = scVar;
        this.f26661x = frameLayout;
        this.f26654b = new Rect();
        this.f26653a = wbVar;
        GestureDetector gestureDetector = new GestureDetector(wbVar.getContext(), new hc(this, wbVar));
        this.f26655c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(wbVar);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
