package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.PaintView;

public final class GroupCallUserCell$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;

    public GroupCallUserCell$$ExternalSyntheticLambda0(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) this.f$0;
                groupCallUserCell.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(this.f$1, this.f$2, valueAnimator.getAnimatedFraction(), 1.0f);
                RLottieImageView rLottieImageView = groupCallUserCell.muteButton;
                rLottieImageView.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                Theme.setSelectorDrawableColor(rLottieImageView.getDrawable(), offsetColor & 620756991, true);
                break;
            case 1:
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.f$0;
                animatedTextDrawable.getClass();
                int iBlendARGB = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f$1, this.f$2);
                animatedTextDrawable.textPaint.setColor(iBlendARGB);
                animatedTextDrawable.alpha = Color.alpha(iBlendARGB);
                animatedTextDrawable.invalidateSelf();
                break;
            case 2:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                lPhotoPaintView.getClass();
                lPhotoPaintView.colorSwatch.color = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f$1, this.f$2);
                lPhotoPaintView.bottomLayout.invalidate();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f$0;
                scrollSlidingTextTabStrip.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.indicatorXAnimationDx = this.f$1 * fFloatValue;
                scrollSlidingTextTabStrip.indicatorWidthAnimationDx = this.f$2 * fFloatValue;
                scrollSlidingTextTabStrip.tabsContainer.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                PhotoViewer.AnonymousClass75 anonymousClass75 = (PhotoViewer.AnonymousClass75) this.f$0;
                anonymousClass75.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                StickersAlert stickersAlert = (StickersAlert) anonymousClass75.this$0;
                stickersAlert.gridView.setAlpha(animatedFraction);
                stickersAlert.titleTextView.setAlpha(animatedFraction);
                int i = this.f$1;
                if (i != 0) {
                    int i2 = (int) ((1.0f - animatedFraction) * i);
                    stickersAlert.setScrollOffsetY$1(this.f$2 + i2);
                    stickersAlert.gridView.setTranslationY(i2);
                }
                break;
            default:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                paintView.colorSwatch.color = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f$1, this.f$2);
                paintView.bottomLayout.invalidate();
                break;
        }
    }
}
