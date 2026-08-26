package org.telegram.ui.Components;

import android.widget.FrameLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintTypefaceListView;

public final class MentionsContainerView$$ExternalSyntheticLambda3 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final boolean f$1;

    public MentionsContainerView$$ExternalSyntheticLambda3(FrameLayout frameLayout, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                MentionsContainerView mentionsContainerView = (MentionsContainerView) this.f$0;
                if (!z) {
                    mentionsContainerView.listViewTranslationAnimator = null;
                    boolean z2 = this.f$1;
                    mentionsContainerView.setVisibility(z2 ? 8 : 0);
                    if (mentionsContainerView.switchLayoutManagerOnEnd && z2) {
                        mentionsContainerView.switchLayoutManagerOnEnd = false;
                        mentionsContainerView.listView.setLayoutManager(mentionsContainerView.getNeededLayoutManager());
                        mentionsContainerView.shown = true;
                        mentionsContainerView.updateVisibility(true);
                        break;
                    }
                }
                break;
            case 1:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                if (dynamicAnimation == lPhotoPaintView.typefaceMenuTransformAnimation) {
                    lPhotoPaintView.typefaceMenuTransformAnimation = null;
                    boolean z3 = this.f$1;
                    PaintTypefaceListView paintTypefaceListView = lPhotoPaintView.typefaceListView;
                    if (!z3) {
                        paintTypefaceListView.setVisibility(8);
                    }
                    paintTypefaceListView.setMaskProvider(null);
                }
                break;
            default:
                LPhotoPaintView lPhotoPaintView2 = (LPhotoPaintView) this.f$0;
                if (dynamicAnimation == lPhotoPaintView2.toolsTransformAnimation) {
                    lPhotoPaintView2.toolsTransformAnimation = null;
                    if (!this.f$1) {
                        LPhotoPaintView.AnonymousClass9 anonymousClass9 = lPhotoPaintView2.colorsListView;
                        anonymousClass9.setVisibility(8);
                        PersistColorPalette.getInstance(lPhotoPaintView2.currentAccount).saveColors();
                        anonymousClass9.getAdapter().notifyDataSetChanged();
                    }
                }
                break;
        }
    }
}
