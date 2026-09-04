package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class x01 extends FrameLayout {
    public static final int f32380e = 0;
    public float f32381a;
    public float f32382b;
    public boolean f32383c;
    public final ThemeEditorView d;

    public x01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
