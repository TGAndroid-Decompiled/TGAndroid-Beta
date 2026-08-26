package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ChatActivity$SearchItemListener$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatActivity.SearchItemListener f$0;

    public ChatActivity$SearchItemListener$$ExternalSyntheticLambda0(ChatActivity.SearchItemListener searchItemListener, int i) {
        this.$r8$classId = i;
        this.f$0 = searchItemListener;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSearchPressed$3(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$onSearchExpand$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$onSearchCollapse$0(valueAnimator);
                break;
        }
    }
}
