package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class x01 extends EditTextBoldCursor {
    public final z01 G1;

    public x01(z01 z01Var, Context context) {
        super(context);
        this.G1 = z01Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.G1.f32864c;
        int i10 = ThemeEditorView.EditorAlert.D1;
        obtain.setLocation(rawX, rawY - editorAlert.f21586b.getTranslationY());
        editorAlert.f24221j1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
