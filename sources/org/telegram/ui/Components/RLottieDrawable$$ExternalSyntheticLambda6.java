package org.telegram.ui.Components;

import org.telegram.messenger.utils.Choreographer60FpsContent;

public final class RLottieDrawable$$ExternalSyntheticLambda6 implements Choreographer60FpsContent.FrameCallback {
    public final int $r8$classId;
    public final Object f$0;

    public RLottieDrawable$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void doFrame(long j) {
        switch (this.$r8$classId) {
            case 0:
                ((RLottieDrawable) this.f$0).onChoreographerFrame(j);
                break;
            case 1:
                ((AnimatedFileDrawable) this.f$0).onChoreographerFrame(j);
                break;
            default:
                ((EditTextBoldCursor) this.f$0).lambda$new$0(j);
                break;
        }
    }
}
