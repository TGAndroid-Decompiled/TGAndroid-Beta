package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class gz0 extends FrameLayout {
    public static final int f35127e = 0;
    public float f35128a;
    public float f35129b;
    public boolean f35130c;
    public final ThemeEditorView d;

    public gz0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
