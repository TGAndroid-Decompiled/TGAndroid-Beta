package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class nz0 extends FrameLayout {
    public static final int f37910e = 0;
    public float f37911a;
    public float f37912b;
    public boolean f37913c;
    public final ThemeEditorView d;

    public nz0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
