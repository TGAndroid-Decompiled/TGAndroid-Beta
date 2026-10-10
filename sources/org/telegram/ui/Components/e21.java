package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class e21 extends FrameLayout {
    public static final int f25875e = 0;
    public float f25876a;
    public float f25877b;
    public boolean f25878c;
    public final ThemeEditorView d;

    public e21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
