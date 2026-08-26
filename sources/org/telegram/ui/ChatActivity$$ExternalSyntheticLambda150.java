package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class ChatActivity$$ExternalSyntheticLambda150 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public ChatActivity$$ExternalSyntheticLambda150(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$dimBehindView$110(this.f$1, valueAnimator);
                break;
            case 1:
                ChatEditTypeActivity.AnonymousClass6.lambda$onLayout$0((ArrayList) this.f$0, this.f$1, valueAnimator);
                break;
            case 2:
                ((PhotoViewer.PhotoViewerActionBarContainer) this.f$0).lambda$updateRightPadding$0(this.f$1, valueAnimator);
                break;
            default:
                ((ProxyListActivity.TextDetailProxyCell) this.f$0).lambda$setSelectionEnabled$1(0.0f, this.f$1, valueAnimator);
                break;
        }
    }
}
