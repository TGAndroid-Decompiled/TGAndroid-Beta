package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class fz0 extends FrameLayout {
    public static final int f33801e = 0;
    public float f33802a;
    public float f33803b;
    public boolean f33804c;
    public final ThemeEditorView d;

    public fz0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
