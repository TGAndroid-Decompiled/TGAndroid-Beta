package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class v01 extends EditTextBoldCursor {

    public final x01 f33242b;

    public v01(x01 x01Var, Context context) {
        super(context);
        this.f33242b = x01Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float rawX = motionEventObtain.getRawX();
        float rawY = motionEventObtain.getRawY();
        ThemeEditorView.EditorAlert editorAlert = this.f33242b.f34414c;
        motionEventObtain.setLocation(rawX, rawY - ((org.telegram.ui.ActionBar.e3) editorAlert).containerView.getTranslationY());
        editorAlert.f26562c.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return super.dispatchTouchEvent(motionEvent);
    }
}
