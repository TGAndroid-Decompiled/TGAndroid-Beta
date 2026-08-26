package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Stories.recorder.PaintView;

public final class GroupCallUserCell$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final int f$1;
    public final int f$2;

    public GroupCallUserCell$$ExternalSyntheticLambda0(FrameLayout frameLayout, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = frameLayout;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((GroupCallUserCell) this.f$0).lambda$applyParticipantChanges$6(this.f$1, this.f$2, valueAnimator);
                break;
            case 1:
                ((ActionBarMenuSubItem) this.f$0).lambda$setEnabledByColor$0(this.f$1, this.f$2, valueAnimator);
                break;
            case 2:
                ((LPhotoPaintView) this.f$0).lambda$setNewColor$12(this.f$1, this.f$2, valueAnimator);
                break;
            default:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paintView.colorSwatch.color = ColorUtils.blendARGB(fFloatValue, this.f$1, this.f$2);
                paintView.bottomLayout.invalidate();
                break;
        }
    }
}
