package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ChatActivity$$ExternalSyntheticLambda33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda33(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                chatActivity.searchExpandProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity.invalidateChatListViewTopPadding();
                break;
            case 1:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                chatActivity2.scrimViewAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView = chatActivity2.contentView;
                if (chatActivityFragmentView != null) {
                    chatActivityFragmentView.invalidate();
                    chatActivity2.chatListView.invalidate();
                }
                break;
            case 2:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                chatActivity3.floatingTopicViewAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity3.updateFloatingTopicView();
                break;
            case 3:
                ChatActivity chatActivity4 = this.f$0;
                chatActivity4.getClass();
                chatActivity4.floatingTopicViewAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity4.updateFloatingTopicView();
                break;
            default:
                ChatActivity chatActivity5 = this.f$0;
                chatActivity5.getClass();
                chatActivity5.searchExpandProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivity5.invalidateChatListViewTopPadding();
                break;
        }
    }
}
