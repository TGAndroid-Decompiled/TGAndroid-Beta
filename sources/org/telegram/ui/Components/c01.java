package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class c01 extends EditTextBoldCursor {
    public final e01 M1;

    public c01(e01 e01Var, Context context) {
        super(context);
        this.M1 = e01Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.M1.f34557c;
        int i7 = ThemeEditorView.EditorAlert.H1;
        obtain.setLocation(rawX, rawY - editorAlert.f30190b.getTranslationY());
        editorAlert.n1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
