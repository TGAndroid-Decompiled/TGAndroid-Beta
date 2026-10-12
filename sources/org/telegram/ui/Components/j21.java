package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class j21 extends FrameLayout {
    public static final int f27345e = 0;
    public float f27346a;
    public float f27347b;
    public boolean f27348c;
    public final ThemeEditorView d;

    public j21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
