package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import androidx.core.util.Consumer;

public final class DialogsEmptyCell$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final DialogsEmptyCell f$0;

    public DialogsEmptyCell$$ExternalSyntheticLambda3(DialogsEmptyCell dialogsEmptyCell, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsEmptyCell;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                DialogsEmptyCell dialogsEmptyCell = this.f$0;
                dialogsEmptyCell.getClass();
                dialogsEmptyCell.utyanCollapseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dialogsEmptyCell.requestLayout();
                Consumer consumer = dialogsEmptyCell.onUtyanAnimationUpdateListener;
                if (consumer != null) {
                    consumer.accept(Float.valueOf(dialogsEmptyCell.utyanCollapseProgress));
                }
                break;
            default:
                DialogsEmptyCell dialogsEmptyCell2 = this.f$0;
                dialogsEmptyCell2.getClass();
                dialogsEmptyCell2.utyanCollapseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dialogsEmptyCell2.requestLayout();
                Consumer consumer2 = dialogsEmptyCell2.onUtyanAnimationUpdateListener;
                if (consumer2 != null) {
                    consumer2.accept(Float.valueOf(dialogsEmptyCell2.utyanCollapseProgress));
                }
                break;
        }
    }
}
