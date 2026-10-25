package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.ThemeEditorView;
public final class w21 extends EditTextBoldCursor {
    public final y21 f34348b;

    public w21(y21 y21Var, Context context) {
        super(context);
        this.f34348b = y21Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float rawX = obtain.getRawX();
        float rawY = obtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.f34348b.f34913c;
        viewGroup = ((org.telegram.ui.ActionBar.k3) editorAlert).containerView;
        obtain.setLocation(rawX, rawY - viewGroup.getTranslationY());
        editorAlert.f26337c.dispatchTouchEvent(obtain);
        obtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
