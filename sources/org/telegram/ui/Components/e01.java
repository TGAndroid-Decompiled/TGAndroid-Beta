package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class e01 extends FrameLayout {
    public static final int f27888e = 0;
    public float f27889a;
    public float f27890b;
    public boolean f27891c;
    public final ThemeEditorView d;

    public e01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
