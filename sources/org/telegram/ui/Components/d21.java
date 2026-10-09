package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class d21 extends FrameLayout {
    public static final int f25571e = 0;
    public float f25572a;
    public float f25573b;
    public boolean f25574c;
    public final ThemeEditorView d;

    public d21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
