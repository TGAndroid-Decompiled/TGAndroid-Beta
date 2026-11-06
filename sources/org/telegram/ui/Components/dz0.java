package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class dz0 extends FrameLayout {
    public static final int f33060e = 0;
    public float f33061a;
    public float f33062b;
    public boolean f33063c;
    public final ThemeEditorView d;

    public dz0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dz0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
