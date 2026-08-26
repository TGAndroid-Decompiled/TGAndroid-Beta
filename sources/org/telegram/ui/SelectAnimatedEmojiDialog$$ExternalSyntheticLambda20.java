package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog f$0;
    public final boolean f$1;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda20(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
                selectAnimatedEmojiDialog.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f$1) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                float f = 1.0f - fFloatValue;
                SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = selectAnimatedEmojiDialog.emojiGridView;
                anonymousClass7.setAlpha(f);
                anonymousClass7.setTranslationY(AndroidUtilities.dp(8.0f) * fFloatValue);
                SelectAnimatedEmojiDialog.AnonymousClass13 anonymousClass13 = selectAnimatedEmojiDialog.emojiSearchGridView;
                anonymousClass13.setAlpha(fFloatValue);
                anonymousClass13.setTranslationY(AndroidUtilities.dp(8.0f) * f);
                selectAnimatedEmojiDialog.emojiSearchEmptyView.setAlpha(anonymousClass13.getAlpha() * fFloatValue);
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.f$0;
                selectAnimatedEmojiDialog2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f$1) {
                    fFloatValue2 = 1.0f - fFloatValue2;
                }
                selectAnimatedEmojiDialog2.emojiSearchEmptyView.setAlpha(selectAnimatedEmojiDialog2.emojiSearchGridView.getAlpha() * fFloatValue2);
                break;
        }
    }
}
