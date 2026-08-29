package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class q01 extends FrameLayout {
    public static final int f31814e = 0;
    public float f31815a;
    public float f31816b;
    public boolean f31817c;
    public final ThemeEditorView d;

    public q01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
