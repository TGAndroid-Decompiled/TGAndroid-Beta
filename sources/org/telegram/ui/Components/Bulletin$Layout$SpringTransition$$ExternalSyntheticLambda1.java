package org.telegram.ui.Components;

import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;

public final class Bulletin$Layout$SpringTransition$$ExternalSyntheticLambda1 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final Consumer f$0;
    public final Bulletin.Layout f$1;

    public Bulletin$Layout$SpringTransition$$ExternalSyntheticLambda1(Consumer consumer, Bulletin.Layout layout, int i) {
        this.$r8$classId = i;
        this.f$0 = consumer;
        this.f$1 = layout;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity$$ExternalSyntheticLambda211) this.f$0).accept(Float.valueOf(this.f$1.getTranslationY()));
                break;
            default:
                ((Bulletin$2$$ExternalSyntheticLambda2) this.f$0).accept(Float.valueOf(this.f$1.getTranslationY()));
                break;
        }
    }
}
