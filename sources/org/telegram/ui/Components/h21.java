package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class h21 extends FrameLayout {
    public static final int e = 0;
    public float f28784a;
    public float f28785b;
    public boolean f28786c;
    public final ThemeEditorView d;

    public h21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
