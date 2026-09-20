package org.telegram.ui.Components;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class m11 extends FrameLayout {
    public static final int e = 0;
    public float f26296a;
    public float f26297b;
    public boolean f26298c;
    public final ThemeEditorView d;

    public m11(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
