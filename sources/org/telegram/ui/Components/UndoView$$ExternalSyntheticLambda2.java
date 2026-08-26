package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

public final class UndoView$$ExternalSyntheticLambda2 implements View.OnTouchListener {
    public final int $r8$classId;

    public UndoView$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return UndoView.lambda$new$1(view, motionEvent);
            default:
                return UndoView.lambda$showWithAction$3(view, motionEvent);
        }
    }
}
