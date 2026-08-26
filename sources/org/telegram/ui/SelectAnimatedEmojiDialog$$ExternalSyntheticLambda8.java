package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog f$0;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda8(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialog;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
                View view = selectAnimatedEmojiDialog.contentViewForeground;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, selectAnimatedEmojiDialog.resourcesProvider), ColorUtils.setAlphaComponent(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = selectAnimatedEmojiDialog.bubble1View;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(iBlendOver, PorterDuff.Mode.MULTIPLY));
                }
                PaymentFormActivity.AnonymousClass2 anonymousClass2 = selectAnimatedEmojiDialog.bubble2View;
                if (anonymousClass2 != null) {
                    anonymousClass2.getBackground().setColorFilter(new PorterDuffColorFilter(iBlendOver, PorterDuff.Mode.MULTIPLY));
                }
                break;
            case 1:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.f$0;
                selectAnimatedEmojiDialog2.getClass();
                selectAnimatedEmojiDialog2.updateShow(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.f$0.invalidateParent();
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = this.f$0;
                selectAnimatedEmojiDialog3.getClass();
                float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                selectAnimatedEmojiDialog3.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(8.0f));
                View view3 = selectAnimatedEmojiDialog3.bubble1View;
                if (view3 != null) {
                    view3.setAlpha(fFloatValue);
                }
                PaymentFormActivity.AnonymousClass2 anonymousClass3 = selectAnimatedEmojiDialog3.bubble2View;
                if (anonymousClass3 != null) {
                    anonymousClass3.setAlpha(fFloatValue * fFloatValue);
                }
                SelectAnimatedEmojiDialog.AnonymousClass2 anonymousClass4 = selectAnimatedEmojiDialog3.contentView;
                anonymousClass4.setAlpha(fFloatValue);
                anonymousClass4.invalidate();
                selectAnimatedEmojiDialog3.invalidate();
                break;
        }
    }
}
