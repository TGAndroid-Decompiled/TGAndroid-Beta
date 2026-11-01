package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ThemeEditorView;
public final class y01 extends EditTextBoldCursor {
    public final a11 G1;

    public y01(a11 a11Var, Context context) {
        super(context);
        this.G1 = a11Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.G1.f24268c;
        int i10 = ThemeEditorView.EditorAlert.D1;
        obtain.setLocation(rawX, rawY - editorAlert.f21587b.getTranslationY());
        editorAlert.f24222j1.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
