package org.telegram.ui.Components;

import android.view.KeyEvent;
import androidx.dynamicanimation.animation.DynamicAnimation;

public final class ChatAttachAlert$$ExternalSyntheticLambda24 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final float f$1;
    public final float f$2;
    public final boolean f$3;

    public ChatAttachAlert$$ExternalSyntheticLambda24(ChatAttachAlert chatAttachAlert, float f, float f2, boolean z) {
        this.f$0 = chatAttachAlert;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = z;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlert) this.f$0).lambda$showLayout$51(this.f$1, this.f$2, this.f$3, dynamicAnimation, f, f2);
                break;
            default:
                ((SenderSelectView) this.f$0).lambda$setProgress$2(this.f$3, this.f$1, this.f$2, dynamicAnimation, f, f2);
                break;
        }
    }

    public ChatAttachAlert$$ExternalSyntheticLambda24(SenderSelectView senderSelectView, boolean z, float f, float f2) {
        this.f$0 = senderSelectView;
        this.f$3 = z;
        this.f$1 = f;
        this.f$2 = f2;
    }
}
