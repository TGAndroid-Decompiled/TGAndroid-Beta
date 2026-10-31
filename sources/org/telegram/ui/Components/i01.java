package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class i01 extends FrameLayout {
    public static final int e = 0;
    public float f26858a;
    public float f26859b;
    public boolean f26860c;
    public final ThemeEditorView d;

    public i01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
