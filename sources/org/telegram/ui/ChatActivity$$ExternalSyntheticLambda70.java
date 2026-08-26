package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Components.ReactionTabHolderView;

public final class ChatActivity$$ExternalSyntheticLambda70 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId = 0;
    public final FrameLayout f$0;
    public final float f$1;
    public final float f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda70(HorizontalScrollView horizontalScrollView, float f, float f2, ReactionTabHolderView reactionTabHolderView, ReactionTabHolderView reactionTabHolderView2) {
        this.f$0 = horizontalScrollView;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = reactionTabHolderView;
        this.f$4 = reactionTabHolderView2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$createMenu$256((HorizontalScrollView) this.f$0, this.f$1, this.f$2, (ReactionTabHolderView) this.f$3, (ReactionTabHolderView) this.f$4, valueAnimator);
                break;
            default:
                ((AboutLinkCell) this.f$0).lambda$updateCollapse$1((AtomicReference) this.f$3, this.f$1, this.f$2, (AboutLinkCell.SpringInterpolator) this.f$4, valueAnimator);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda70(AboutLinkCell aboutLinkCell, AtomicReference atomicReference, float f, float f2, AboutLinkCell.SpringInterpolator springInterpolator) {
        this.f$0 = aboutLinkCell;
        this.f$3 = atomicReference;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$4 = springInterpolator;
    }
}
