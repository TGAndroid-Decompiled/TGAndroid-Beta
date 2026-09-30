package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.ThemeEditorView;
public final class d21 extends EditTextBoldCursor {
    public final f21 f23493b;

    public d21(f21 f21Var, Context context) {
        super(context);
        this.f23493b = f21Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.f23493b.f24144c;
        viewGroup = ((org.telegram.ui.ActionBar.e3) editorAlert).containerView;
        obtain.setLocation(rawX, rawY - viewGroup.getTranslationY());
        editorAlert.f22464c.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
