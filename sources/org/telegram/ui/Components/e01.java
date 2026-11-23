package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class e01 extends EditTextBoldCursor {
    public final g01 M1;

    public e01(g01 g01Var, Context context) {
        super(context);
        this.M1 = g01Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.M1.f35321c;
        int i7 = ThemeEditorView.EditorAlert.H1;
        obtain.setLocation(rawX, rawY - editorAlert.f30142b.getTranslationY());
        editorAlert.n1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
