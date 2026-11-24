package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class e0 extends EditTextBoldCursor {
    public final g0 M1;

    public e0(g0 g0Var, Context context) {
        super(context);
        this.M1 = g0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.M1.c;
        int i = ThemeEditorView.EditorAlert.G1;
        obtain.setLocation(rawX, rawY - editorAlert.b.getTranslationY());
        editorAlert.m1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
