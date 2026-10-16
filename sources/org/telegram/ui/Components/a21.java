package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class a21 extends FrameLayout {
    public static final int e = 0;
    public float f23111a;
    public float f23112b;
    public boolean f23113c;
    public final ThemeEditorView d;

    public a21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
