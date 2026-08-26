package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;

public final class TextSelectionHelper$$ExternalSyntheticLambda10 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;

    public TextSelectionHelper$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((TextSelectionHelper) this.f$0).lambda$showActions$2(view, motionEvent);
            default:
                return ((LPhotoPaintView) this.f$0).lambda$showPopup$42(view, motionEvent);
        }
    }
}
