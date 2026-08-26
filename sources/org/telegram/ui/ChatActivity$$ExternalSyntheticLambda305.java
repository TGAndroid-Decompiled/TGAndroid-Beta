package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CheckBox2;

public final class ChatActivity$$ExternalSyntheticLambda305 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public ChatActivity$$ExternalSyntheticLambda305(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity.scrimPaintAlpha = fFloatValue;
                chatActivity.scrimViewProgress = fFloatValue / this.f$1;
                View view = chatActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 1:
                float fFloatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f$0;
                    if (i < arrayList.size()) {
                        View view2 = (View) arrayList.get(i);
                        if (view2 != null) {
                            view2.setTranslationY(this.f$1 * fFloatValue2);
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 2:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.getClass();
                chatAttachAlertPollLayout.emojiView.setTranslationY(AndroidUtilities.lerp(this.f$1, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                PollCreateActivity pollCreateActivity = (PollCreateActivity) this.f$0;
                pollCreateActivity.getClass();
                pollCreateActivity.emojiView.setTranslationY(AndroidUtilities.lerp(this.f$1, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                ProxyListActivity.TextDetailProxyCell textDetailProxyCell = (ProxyListActivity.TextDetailProxyCell) this.f$0;
                textDetailProxyCell.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fLerp = AndroidUtilities.lerp(0.0f, this.f$1, fFloatValue3);
                textDetailProxyCell.textView.setTranslationX(fLerp);
                textDetailProxyCell.valueTextView.setTranslationX(fLerp);
                ImageView imageView = textDetailProxyCell.checkImageView;
                imageView.setTranslationX(fLerp);
                CheckBox2 checkBox2 = textDetailProxyCell.checkBox;
                checkBox2.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + fLerp);
                float f = (fFloatValue3 * 0.5f) + 0.5f;
                checkBox2.setScaleX(f);
                checkBox2.setScaleY(f);
                checkBox2.setAlpha(fFloatValue3);
                float f2 = 1.0f - fFloatValue3;
                float f3 = (f2 * 0.5f) + 0.5f;
                imageView.setScaleX(f3);
                imageView.setScaleY(f3);
                imageView.setAlpha(f2);
                break;
        }
    }
}
