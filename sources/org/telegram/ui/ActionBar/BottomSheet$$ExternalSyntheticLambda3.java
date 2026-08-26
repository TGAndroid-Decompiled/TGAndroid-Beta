package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public final class BottomSheet$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public BottomSheet$$ExternalSyntheticLambda3(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        switch (this.$r8$classId) {
            case 0:
                ((BottomSheet) this.f$0).lambda$dismissWithButtonClick$9(this.f$1, valueAnimator);
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$0;
                if (chatMessageCell.getMessageObject() != null && chatMessageCell.getMessageObject().getId() == this.f$1) {
                    chatMessageCell.setSelectedBackgroundProgress(fFloatValue);
                    break;
                }
                break;
            case 2:
                EditTextEmoji editTextEmoji = (EditTextEmoji) this.f$0;
                editTextEmoji.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                editTextEmoji.emojiView.setTranslationY(fFloatValue2);
                int i2 = this.f$1;
                float f = i2;
                float f2 = 1.0f - (fFloatValue2 / f);
                editTextEmoji.emojiViewAlpha = f2;
                if (i2 > 0 && ((i = editTextEmoji.currentStyle) == 2 || i == 3)) {
                    editTextEmoji.emojiView.setAlpha(f2);
                }
                editTextEmoji.bottomPanelTranslationY(fFloatValue2 - f);
                break;
            case 3:
                ((EmojiView) this.f$0).tabsMinusDy[this.f$1] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                MediaActivity mediaActivity = (MediaActivity) this.f$0;
                mediaActivity.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr = mediaActivity.subtitleT;
                int i3 = this.f$1;
                fArr[i3] = fFloatValue3;
                SimpleTextView[] simpleTextViewArr = mediaActivity.nameTextView;
                simpleTextViewArr[i3].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, fFloatValue3));
                simpleTextViewArr[i3].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i3]));
                simpleTextViewArr[i3].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i3]));
                mediaActivity.subtitleTextView[i3].setAlpha(fArr[i3]);
                break;
            case 5:
                ChatUsersActivity.AnonymousClass12 anonymousClass12 = (ChatUsersActivity.AnonymousClass12) this.f$0;
                anonymousClass12.getClass();
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = (RecyclerItemsEnterAnimator) anonymousClass12.this$0;
                recyclerItemsEnterAnimator.listAlphaItems.put(this.f$1, f3);
                recyclerItemsEnterAnimator.invalidateAlpha = true;
                recyclerItemsEnterAnimator.listView.invalidate();
                break;
            default:
                SpoilerEffect spoilerEffect = (SpoilerEffect) this.f$0;
                spoilerEffect.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                spoilerEffect.rippleProgress = fFloatValue4;
                spoilerEffect.setAlpha((int) ((1.0f - fFloatValue4) * this.f$1));
                spoilerEffect.shouldInvalidateColor = true;
                spoilerEffect.invalidateSelf();
                break;
        }
    }
}
