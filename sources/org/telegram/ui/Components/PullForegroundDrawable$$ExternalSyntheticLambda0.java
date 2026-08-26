package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Cells.DialogCell;

public final class PullForegroundDrawable$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PullForegroundDrawable f$0;

    public PullForegroundDrawable$$ExternalSyntheticLambda0(PullForegroundDrawable pullForegroundDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = pullForegroundDrawable;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PullForegroundDrawable pullForegroundDrawable = this.f$0;
                pullForegroundDrawable.getClass();
                pullForegroundDrawable.accentRevalProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DialogCell dialogCell = pullForegroundDrawable.cell;
                if (dialogCell != null) {
                    dialogCell.invalidate();
                }
                BlurredRecyclerView blurredRecyclerView = pullForegroundDrawable.listView;
                if (blurredRecyclerView != null) {
                    blurredRecyclerView.invalidate();
                }
                break;
            case 1:
                PullForegroundDrawable pullForegroundDrawable2 = this.f$0;
                pullForegroundDrawable2.getClass();
                pullForegroundDrawable2.accentRevalProgressOut = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DialogCell dialogCell2 = pullForegroundDrawable2.cell;
                if (dialogCell2 != null) {
                    dialogCell2.invalidate();
                }
                BlurredRecyclerView blurredRecyclerView2 = pullForegroundDrawable2.listView;
                if (blurredRecyclerView2 != null) {
                    blurredRecyclerView2.invalidate();
                }
                break;
            case 2:
                PullForegroundDrawable pullForegroundDrawable3 = this.f$0;
                pullForegroundDrawable3.getClass();
                pullForegroundDrawable3.arrowRotateProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DialogCell dialogCell3 = pullForegroundDrawable3.cell;
                if (dialogCell3 != null) {
                    dialogCell3.invalidate();
                }
                break;
            case 3:
                PullForegroundDrawable pullForegroundDrawable4 = this.f$0;
                pullForegroundDrawable4.getClass();
                pullForegroundDrawable4.textSwappingProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DialogCell dialogCell4 = pullForegroundDrawable4.cell;
                if (dialogCell4 != null) {
                    dialogCell4.invalidate();
                }
                break;
            case 4:
                PullForegroundDrawable pullForegroundDrawable5 = this.f$0;
                pullForegroundDrawable5.getClass();
                pullForegroundDrawable5.textInProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DialogCell dialogCell5 = pullForegroundDrawable5.cell;
                if (dialogCell5 != null) {
                    dialogCell5.invalidate();
                }
                break;
            case 5:
                PullForegroundDrawable pullForegroundDrawable6 = this.f$0;
                pullForegroundDrawable6.getClass();
                pullForegroundDrawable6.setOutProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                DialogCell dialogCell6 = pullForegroundDrawable6.cell;
                if (dialogCell6 != null) {
                    dialogCell6.invalidate();
                }
                break;
            case 6:
                PullForegroundDrawable pullForegroundDrawable7 = this.f$0;
                pullForegroundDrawable7.getClass();
                pullForegroundDrawable7.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pullForegroundDrawable7.bounceIn = true;
                DialogCell dialogCell7 = pullForegroundDrawable7.cell;
                if (dialogCell7 != null) {
                    dialogCell7.invalidate();
                }
                break;
            default:
                PullForegroundDrawable pullForegroundDrawable8 = this.f$0;
                pullForegroundDrawable8.getClass();
                pullForegroundDrawable8.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pullForegroundDrawable8.bounceIn = false;
                DialogCell dialogCell8 = pullForegroundDrawable8.cell;
                if (dialogCell8 != null) {
                    dialogCell8.invalidate();
                }
                break;
        }
    }
}
