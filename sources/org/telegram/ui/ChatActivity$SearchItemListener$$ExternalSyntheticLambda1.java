package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

public final class ChatActivity$SearchItemListener$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivity.SearchItemListener f$0;

    public ChatActivity$SearchItemListener$$ExternalSyntheticLambda1(ChatActivity.SearchItemListener searchItemListener, int i) {
        this.$r8$classId = i;
        this.f$0 = searchItemListener;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.SearchItemListener searchItemListener = this.f$0;
                searchItemListener.getClass();
                searchItemListener.searchAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ChatActivity.this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 1:
                ChatActivity.SearchItemListener searchItemListener2 = this.f$0;
                searchItemListener2.getClass();
                searchItemListener2.searchAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = ChatActivity.this.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            default:
                ChatActivity.SearchItemListener searchItemListener3 = this.f$0;
                searchItemListener3.getClass();
                searchItemListener3.searchAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = ChatActivity.this.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                }
                break;
        }
    }
}
