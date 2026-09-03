package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class b11 extends FrameLayout {
    public static final int f25467e = 0;
    public float f25468a;
    public float f25469b;
    public boolean f25470c;
    public final ThemeEditorView d;

    public b11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
