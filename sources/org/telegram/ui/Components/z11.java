package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class z11 extends FrameLayout {
    public static final int e = 0;
    public float f33111a;
    public float f33112b;
    public boolean f33113c;
    public final ThemeEditorView d;

    public z11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
