package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class c11 extends FrameLayout {
    public static final int f25752e = 0;
    public float f25753a;
    public float f25754b;
    public boolean f25755c;
    public final ThemeEditorView d;

    public c11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
