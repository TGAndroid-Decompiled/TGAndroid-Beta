package org.telegram.ui.Cells;

import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Stories.StoryCaptionView;

public final class ShareDialogCell$$ExternalSyntheticLambda1 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final FrameLayout f$0;

    public ShareDialogCell$$ExternalSyntheticLambda1(FrameLayout frameLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((ShareDialogCell) this.f$0).lambda$setTopic$1(dynamicAnimation, f, f2);
                break;
            case 1:
                FloatingDebugView floatingDebugView = (FloatingDebugView) this.f$0;
                floatingDebugView.getClass();
                float f3 = f / 1000.0f;
                float fDp = AndroidUtilities.dp(28.0f);
                FloatingDebugView.AnonymousClass2 anonymousClass2 = floatingDebugView.floatingButtonContainer;
                anonymousClass2.setPivotX(fDp);
                anonymousClass2.setPivotY(AndroidUtilities.dp(28.0f));
                anonymousClass2.setScaleX(f3);
                anonymousClass2.setScaleY(f3);
                anonymousClass2.setAlpha(MathUtils.clamp(f3, 0.0f, 1.0f));
                floatingDebugView.invalidate();
                break;
            case 2:
                ((LPhotoPaintView) this.f$0).lambda$showTypefaceMenu$27(dynamicAnimation, f, f2);
                break;
            default:
                StoryCaptionView storyCaptionView = (StoryCaptionView) this.f$0;
                storyCaptionView.overScrollY = f;
                storyCaptionView.velocityY = f2;
                break;
        }
    }
}
