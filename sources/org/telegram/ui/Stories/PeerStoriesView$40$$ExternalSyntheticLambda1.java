package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class PeerStoriesView$40$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public PeerStoriesView$40$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass40 anonymousClass40 = (PeerStoriesView.AnonymousClass40) this.f$0;
                float fFloatValue = ((Float) ((ValueAnimator) this.f$1).getAnimatedValue()).floatValue();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass40.this$0;
                anonymousClass1.movingReactionProgress = fFloatValue;
                anonymousClass1.invalidate();
                if (anonymousClass1.movingReactionProgress > 0.8f) {
                    boolean[] zArr = (boolean[]) this.f$2;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        anonymousClass1.drawReactionEffect = true;
                        try {
                            anonymousClass1.performHapticFeedback(3);
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                ((LPhotoPaintView) this.f$0).lambda$switchTab$17((ViewGroup) this.f$1, (ViewGroup) this.f$2, valueAnimator);
                break;
            default:
                ChatListItemAnimator.lambda$animateMoveImpl$3((ChatListItemAnimator.MoveInfoExtended) this.f$0, (ChatMessageCell.TransitionParams) this.f$1, (ChatMessageCell) this.f$2, valueAnimator);
                break;
        }
    }
}
