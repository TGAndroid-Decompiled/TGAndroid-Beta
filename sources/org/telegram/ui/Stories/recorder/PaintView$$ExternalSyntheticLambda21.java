package org.telegram.ui.Stories.recorder;

import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.PaintTypefaceListView;

public final class PaintView$$ExternalSyntheticLambda21 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final PaintView f$0;
    public final boolean f$1;

    public PaintView$$ExternalSyntheticLambda21(PaintView paintView, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = paintView;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                PaintView paintView = this.f$0;
                if (dynamicAnimation == paintView.toolsTransformAnimation) {
                    paintView.toolsTransformAnimation = null;
                    if (!this.f$1) {
                        PaintView.AnonymousClass11 anonymousClass11 = paintView.colorsListView;
                        anonymousClass11.setVisibility(8);
                        PersistColorPalette.getInstance(paintView.currentAccount).saveColors();
                        anonymousClass11.getAdapter().notifyDataSetChanged();
                    }
                }
                break;
            default:
                PaintView paintView2 = this.f$0;
                if (dynamicAnimation == paintView2.typefaceMenuTransformAnimation) {
                    paintView2.typefaceMenuTransformAnimation = null;
                    boolean z2 = this.f$1;
                    PaintTypefaceListView paintTypefaceListView = paintView2.typefaceListView;
                    if (!z2) {
                        paintTypefaceListView.setVisibility(8);
                    }
                    paintTypefaceListView.setMaskProvider(null);
                }
                break;
        }
    }
}
