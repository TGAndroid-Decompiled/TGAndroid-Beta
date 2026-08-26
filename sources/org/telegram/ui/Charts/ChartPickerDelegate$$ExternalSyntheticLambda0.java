package org.telegram.ui.Charts;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.SenderSelectView;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.RoundVideoRecorder;

public final class ChartPickerDelegate$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;
    public final float f$3;
    public final float f$4;

    public ChartPickerDelegate$$ExternalSyntheticLambda0(Object obj, float f, float f2, float f3, float f4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
        this.f$4 = f4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChartPickerDelegate chartPickerDelegate = (ChartPickerDelegate) this.f$0;
                chartPickerDelegate.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = this.f$2;
                float f2 = this.f$1;
                chartPickerDelegate.pickerStart = DiffUtil.m(f, f2, fFloatValue, f2);
                float f3 = this.f$4;
                float f4 = this.f$3;
                chartPickerDelegate.pickerEnd = DiffUtil.m(f3, f4, fFloatValue, f4);
                chartPickerDelegate.view.onPickerJumpTo(f, f3, false);
                break;
            case 1:
                ((AnimatedEmojiSpan) this.f$0).lambda$animateChanges$2(this.f$1, this.f$2, this.f$3, this.f$4, valueAnimator);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                chatActivityEnterView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f5 = this.f$2;
                float f6 = this.f$1;
                float fM = DiffUtil.m(f5, f6, fFloatValue2, f6);
                SenderSelectView senderSelectView = chatActivityEnterView.senderSelectView;
                if (senderSelectView != null) {
                    float f7 = this.f$4;
                    float f8 = this.f$3;
                    senderSelectView.setAlpha(((f7 - f8) * fFloatValue2) + f8);
                    chatActivityEnterView.senderSelectView.setTranslationX(fM);
                }
                chatActivityEnterView.emojiButton.setTranslationX(fM);
                chatActivityEnterView.messageTextTranslationX = fM;
                chatActivityEnterView.updateMessageTextParams();
                break;
            default:
                CaptionStory.AnonymousClass1 anonymousClass1 = (CaptionStory.AnonymousClass1) this.f$0;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f9 = this.f$1;
                float f10 = this.f$2;
                float fLerp = AndroidUtilities.lerp(f9, f10, fFloatValue3);
                RoundVideoRecorder.AnonymousClass1 anonymousClass2 = anonymousClass1.cameraView;
                anonymousClass2.setScaleX(fLerp);
                anonymousClass2.setScaleY(AndroidUtilities.lerp(f9, f10, fFloatValue3));
                anonymousClass2.setTranslationX(this.f$3 * fFloatValue3);
                anonymousClass2.setTranslationY(this.f$4 * fFloatValue3);
                float f11 = 1.0f - fFloatValue3;
                anonymousClass2.setAlpha(f11);
                anonymousClass1.alpha = f11;
                anonymousClass1.invalidate();
                break;
        }
    }
}
