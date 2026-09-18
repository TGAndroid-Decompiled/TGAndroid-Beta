package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class z01 extends FrameLayout {
    public static final int e = 0;
    public float f30360a;
    public float f30361b;
    public boolean f30362c;
    public final ThemeEditorView d;

    public z01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
