package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class ez0 extends FrameLayout {
    public static final int f33411e = 0;
    public float f33412a;
    public float f33413b;
    public boolean f33414c;
    public final ThemeEditorView d;

    public ez0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ez0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
