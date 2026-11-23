package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class d01 extends EditTextBoldCursor {
    public final f01 M1;

    public d01(f01 f01Var, Context context) {
        super(context);
        this.M1 = f01Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.M1.f34939c;
        int i7 = ThemeEditorView.EditorAlert.H1;
        obtain.setLocation(rawX, rawY - editorAlert.f30226b.getTranslationY());
        editorAlert.n1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
