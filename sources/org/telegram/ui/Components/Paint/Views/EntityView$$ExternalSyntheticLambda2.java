package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class EntityView$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final EntityView f$0;

    public EntityView$$ExternalSyntheticLambda2(EntityView entityView, int i) {
        this.$r8$classId = i;
        this.f$0 = entityView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                EntityView entityView = this.f$0;
                entityView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                entityView.selectT = fFloatValue;
                EntityView.SelectionView selectionView = entityView.selectionView;
                if (selectionView != null) {
                    selectionView.setScaleX(Utilities.clamp(entityView.trashScale * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, fFloatValue));
                    entityView.selectionView.setScaleY(Utilities.clamp(entityView.trashScale * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, entityView.selectT));
                    entityView.selectionView.setAlpha(Math.max(0.0f, entityView.trashScale - 0.8f) * entityView.selectT * 5.0f);
                }
                break;
            case 1:
                this.f$0.updatePosition();
                break;
            case 2:
                EntityView entityView2 = this.f$0;
                float fLerpAngle = AndroidUtilities.lerpAngle(entityView2.angle, entityView2.currentStickyAngle, valueAnimator.getAnimatedFraction());
                entityView2.stickyAnimatedAngle = fLerpAngle;
                entityView2.setRotation(fLerpAngle);
                if (entityView2.stickyX != 0 || entityView2.stickyY != 0) {
                    entityView2.updatePosition();
                }
                EntityView.SelectionView selectionView2 = entityView2.selectionView;
                if (selectionView2 != null) {
                    selectionView2.updatePosition();
                }
                break;
            case 3:
                EntityView entityView3 = this.f$0;
                entityView3.setRotation(AndroidUtilities.lerpAngle(entityView3.currentStickyAngle, entityView3.angle, entityView3.fromStickyAngleAnimator.getAnimatedFraction()));
                if (entityView3.stickyX != 0 || entityView3.stickyY != 0) {
                    entityView3.updatePosition();
                }
                EntityView.SelectionView selectionView3 = entityView3.selectionView;
                if (selectionView3 != null) {
                    selectionView3.updatePosition();
                }
                break;
            case 4:
                EntityView entityView4 = this.f$0;
                entityView4.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                entityView4.trashScale = fFloatValue2;
                entityView4.setAlpha(fFloatValue2);
                EntityView.SelectionView selectionView4 = entityView4.selectionView;
                if (selectionView4 != null) {
                    selectionView4.setScaleX(Utilities.clamp(entityView4.trashScale * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, entityView4.selectT));
                    entityView4.selectionView.setScaleY(Utilities.clamp(entityView4.trashScale * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, entityView4.selectT));
                    entityView4.selectionView.setAlpha(Math.max(0.0f, entityView4.trashScale - 0.8f) * entityView4.selectT * 5.0f);
                }
                entityView4.invalidate();
                break;
            default:
                this.f$0.updatePosition();
                break;
        }
    }
}
