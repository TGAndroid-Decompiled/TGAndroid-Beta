package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class y01 extends FrameLayout {
    public static final int e = 0;
    public float f30119a;
    public float f30120b;
    public boolean f30121c;
    public final ThemeEditorView d;

    public y01(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y01.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
