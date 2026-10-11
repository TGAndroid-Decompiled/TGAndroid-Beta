package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class f21 extends FrameLayout {
    public static final int f26206e = 0;
    public float f26207a;
    public float f26208b;
    public boolean f26209c;
    public final ThemeEditorView d;

    public f21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
