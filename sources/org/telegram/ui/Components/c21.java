package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.ThemeEditorView;
public final class c21 extends EditTextBoldCursor {
    public final e21 f23174b;

    public c21(e21 e21Var, Context context) {
        super(context);
        this.f23174b = e21Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.f23174b.f23842c;
        viewGroup = ((org.telegram.ui.ActionBar.e3) editorAlert).containerView;
        obtain.setLocation(rawX, rawY - viewGroup.getTranslationY());
        editorAlert.f22442c.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
