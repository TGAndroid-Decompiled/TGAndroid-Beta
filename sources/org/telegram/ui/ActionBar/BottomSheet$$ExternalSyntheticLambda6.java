package org.telegram.ui.ActionBar;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;

public final class BottomSheet$$ExternalSyntheticLambda6 implements View.OnTouchListener {
    public final int $r8$classId;

    public BottomSheet$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return BottomSheet.lambda$onCreateInternal$3(view, motionEvent);
            case 2:
                int i = DialogsEmptyCell.$r8$clinit;
            case 1:
                return true;
            default:
                int i2 = BotPreviewsEditContainer.BotPreviewsEditLangContainer.$r8$clinit;
                return true;
        }
    }
}
