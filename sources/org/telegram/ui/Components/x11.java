package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class x11 extends FrameLayout {
    public static final int f32795e = 0;
    public float f32796a;
    public float f32797b;
    public boolean f32798c;
    public final ThemeEditorView d;

    public x11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
