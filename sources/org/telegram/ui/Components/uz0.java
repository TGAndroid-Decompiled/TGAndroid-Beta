package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class uz0 extends EditTextBoldCursor {
    public final wz0 G1;

    public uz0(wz0 wz0Var, Context context) {
        super(context);
        this.G1 = wz0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.G1.f40264c;
        int i7 = ThemeEditorView.EditorAlert.D1;
        obtain.setLocation(rawX, rawY - editorAlert.f28624b.getTranslationY());
        editorAlert.f31586j1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
