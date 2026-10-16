package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.ThemeEditorView;
public final class q21 extends EditTextBoldCursor {
    public final s21 f28171b;

    public q21(s21 s21Var, Context context) {
        super(context);
        this.f28171b = s21Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.f28171b.f28710c;
        viewGroup = ((org.telegram.ui.ActionBar.e3) editorAlert).containerView;
        obtain.setLocation(rawX, rawY - viewGroup.getTranslationY());
        editorAlert.f23039c.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
