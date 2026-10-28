package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class i21 extends FrameLayout {
    public static final int e = 0;
    public float f29195a;
    public float f29196b;
    public boolean f29197c;
    public final ThemeEditorView d;

    public i21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
