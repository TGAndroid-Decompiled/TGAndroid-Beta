package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ChatAttachAlert$19$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatAttachAlert$19$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlert.AnonymousClass19) this.f$0).lambda$dispatchDraw$0((EditTextCaption) this.f$1, valueAnimator);
                break;
            case 1:
                AudioPlayerAlert.CoverContainer.lambda$switchImageViews$2((BackupImageView) this.f$0, (BackupImageView) this.f$1, valueAnimator);
                break;
            case 2:
                ((EllipsizeSpanAnimator) this.f$0).lambda$createEllipsizeAnimator$0((EllipsizeSpanAnimator.TextAlphaSpan) this.f$1, valueAnimator);
                break;
            default:
                ((StorageDiagramView) this.f$0).lambda$update$0((StorageDiagramView.ClearViewData[]) this.f$1, valueAnimator);
                break;
        }
    }
}
