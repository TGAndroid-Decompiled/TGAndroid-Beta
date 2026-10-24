package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class y11 extends FrameLayout {
    public static final int e = 0;
    public float f32782a;
    public float f32783b;
    public boolean f32784c;
    public final ThemeEditorView d;

    public y11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
