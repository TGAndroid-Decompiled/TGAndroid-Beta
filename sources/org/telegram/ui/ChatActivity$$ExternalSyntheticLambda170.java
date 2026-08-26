package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ChatActionCell;

public final class ChatActivity$$ExternalSyntheticLambda170 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final ChatActionCell f$1;

    public ChatActivity$$ExternalSyntheticLambda170(ChatActivity chatActivity, ChatActionCell chatActionCell, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = chatActionCell;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity.topViewOffset = AndroidUtilities.dp(30.0f) * fFloatValue;
                chatActivity.invalidateChatListViewTopPadding();
                this.f$1.setAlpha(fFloatValue);
                break;
            default:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity2.topViewOffset = AndroidUtilities.dp(30.0f) * fFloatValue2;
                chatActivity2.invalidateChatListViewTopPadding();
                chatActivity2.invalidateMessagesVisiblePart();
                this.f$1.setAlpha(fFloatValue2);
                break;
        }
    }
}
