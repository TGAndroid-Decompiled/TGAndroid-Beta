package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class oz0 extends FrameLayout {
    public static final int f38325e = 0;
    public float f38326a;
    public float f38327b;
    public boolean f38328c;
    public final ThemeEditorView d;

    public oz0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
