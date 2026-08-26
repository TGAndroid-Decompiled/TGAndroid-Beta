package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

public final class QrActivity$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public QrActivity$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) this.f$0).lambda$onItemSelected$12((int[]) this.f$1, valueAnimator);
                break;
            case 1:
                ((DialogsActivity.AnonymousClass14) this.f$0).lambda$onScrollStateChanged$0((DialogsActivity.ViewPage) this.f$1, valueAnimator);
                break;
            case 2:
                ((ChatActivity) this.f$0).lambda$onCustomTransitionAnimation$396((ChatActivity) this.f$1, valueAnimator);
                break;
            case 3:
                ((ChatEditActivity) this.f$0).lambda$updateHistoryShow$69((ArrayList) this.f$1, valueAnimator);
                break;
            case 4:
                ((PhotoViewer) this.f$0).lambda$checkChangedTextureView$4((View) this.f$1, valueAnimator);
                break;
            case 5:
                ((RecyclerListViewScroller) this.f$0).lambda$smoothScrollBy$0((int[]) this.f$1, valueAnimator);
                break;
            default:
                ((VoiceMessageEnterTransition) this.f$0).lambda$new$0((MessageEnterTransitionContainer) this.f$1, valueAnimator);
                break;
        }
    }
}
