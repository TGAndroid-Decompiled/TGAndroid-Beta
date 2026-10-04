package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class w11 extends FrameLayout {
    public static final int f32442e = 0;
    public float f32443a;
    public float f32444b;
    public boolean f32445c;
    public final ThemeEditorView d;

    public w11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
