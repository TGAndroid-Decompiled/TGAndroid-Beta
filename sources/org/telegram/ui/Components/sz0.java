package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class sz0 extends EditTextBoldCursor {
    public final uz0 H1;

    public sz0(uz0 uz0Var, Context context) {
        super(context);
        this.H1 = uz0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.H1.f38915c;
        int i3 = ThemeEditorView.EditorAlert.E1;
        obtain.setLocation(rawX, rawY - editorAlert.f28586b.getTranslationY());
        editorAlert.k1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
