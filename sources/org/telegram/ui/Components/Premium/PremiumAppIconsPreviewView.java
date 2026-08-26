package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LauncherIconController;

public final class PremiumAppIconsPreviewView extends FrameLayout implements PagerHeaderView {
    public final AdaptiveIconImageView bottomLeftIcon;
    public final AdaptiveIconImageView bottomRightIcon;
    public final ArrayList icons;
    public final boolean isEmpty;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AdaptiveIconImageView topIcon;

    public final class AdaptiveIconImageView extends AppIconsSelectorCell.AdaptiveIconImageView {
        public final StarParticlesView.Drawable drawable;
        public final Paint paint;
        public float particlesScale;

        public AdaptiveIconImageView(PremiumAppIconsPreviewView premiumAppIconsPreviewView, Context context, int i) {
            super(context);
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(20);
            this.drawable = drawable;
            Paint paint = new Paint(1);
            this.paint = paint;
            drawable.size1 = 12;
            drawable.size2 = 8;
            drawable.size3 = 6;
            if (i == 1) {
                drawable.type = 1001;
            }
            if (i == 0) {
                drawable.type = 1002;
            }
            drawable.resourcesProvider = premiumAppIconsPreviewView.resourcesProvider;
            drawable.colorKey = Theme.key_premiumStartSmallStarsColor2;
            drawable.init();
            paint.setColor(-1);
        }

        @Override
        public final void draw(Canvas canvas) {
            int iDp = AndroidUtilities.dp(10.0f);
            StarParticlesView.Drawable drawable = this.drawable;
            drawable.excludeRect.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), getMeasuredWidth() - AndroidUtilities.dp(5.0f), getMeasuredHeight() - AndroidUtilities.dp(5.0f));
            float f = -iDp;
            drawable.rect.set(f, f, getWidth() + iDp, getHeight() + iDp);
            canvas.save();
            float f2 = 1.0f - this.particlesScale;
            canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            drawable.onDraw(canvas, 1.0f);
            canvas.restore();
            invalidate();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
            super.draw(canvas);
        }
    }

    public PremiumAppIconsPreviewView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.icons = new ArrayList();
        this.resourcesProvider = resourcesProvider;
        for (LauncherIconController.LauncherIcon launcherIcon : LauncherIconController.LauncherIcon.values()) {
            if (launcherIcon.premium) {
                this.icons.add(launcherIcon);
            }
            if (this.icons.size() == 3) {
                break;
            }
        }
        if (this.icons.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.isEmpty = true;
        } else {
            this.topIcon = newIconView(context, 0);
            this.bottomLeftIcon = newIconView(context, 1);
            this.bottomRightIcon = newIconView(context, 2);
            setClipChildren(false);
        }
    }

    public final AdaptiveIconImageView newIconView(Context context, int i) {
        LauncherIconController.LauncherIcon launcherIcon = (LauncherIconController.LauncherIcon) this.icons.get(i);
        AdaptiveIconImageView adaptiveIconImageView = new AdaptiveIconImageView(this, context, i);
        adaptiveIconImageView.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        adaptiveIconImageView.setForeground(launcherIcon.foreground);
        adaptiveIconImageView.setBackgroundResource(launcherIcon.background);
        adaptiveIconImageView.setPadding(AndroidUtilities.dp(8.0f));
        adaptiveIconImageView.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(adaptiveIconImageView);
        return adaptiveIconImageView;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.isEmpty) {
            return;
        }
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int iDp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.topIcon.getLayoutParams();
        layoutParams.height = iDp;
        layoutParams.width = iDp;
        float f = iDp;
        layoutParams.bottomMargin = (int) ((iMin * 0.1f) + f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.bottomLeftIcon.getLayoutParams();
        layoutParams2.height = iDp;
        layoutParams2.width = iDp;
        int i3 = (int) (f * 0.95f);
        layoutParams2.rightMargin = i3;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.bottomRightIcon.getLayoutParams();
        layoutParams3.height = iDp;
        layoutParams3.width = iDp;
        layoutParams3.leftMargin = i3;
    }

    @Override
    public void setOffset(float f) {
        if (this.isEmpty) {
            return;
        }
        float fAbs = Math.abs(f / getMeasuredWidth());
        float interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(fAbs);
        int right = getRight();
        AdaptiveIconImageView adaptiveIconImageView = this.bottomRightIcon;
        adaptiveIconImageView.setTranslationX(((adaptiveIconImageView.getWidth() * 1.5f) + (right - adaptiveIconImageView.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        adaptiveIconImageView.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float fClamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        adaptiveIconImageView.setScaleX(fClamp);
        adaptiveIconImageView.setScaleY(fClamp);
        int top = getTop();
        AdaptiveIconImageView adaptiveIconImageView2 = this.topIcon;
        adaptiveIconImageView2.setTranslationY((((top - adaptiveIconImageView2.getTop()) - (adaptiveIconImageView2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * fAbs);
        adaptiveIconImageView2.setTranslationX(AndroidUtilities.dp(16.0f) * fAbs);
        float fClamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, fAbs), 1.0f, 0.0f);
        adaptiveIconImageView2.setScaleX(fClamp2);
        adaptiveIconImageView2.setScaleY(fClamp2);
        float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(fAbs);
        int left = getLeft();
        AdaptiveIconImageView adaptiveIconImageView3 = this.bottomLeftIcon;
        adaptiveIconImageView3.setTranslationX((((left - adaptiveIconImageView3.getLeft()) - (adaptiveIconImageView3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        adaptiveIconImageView3.setTranslationY(((adaptiveIconImageView3.getHeight() * 2.5f) + (getBottom() - adaptiveIconImageView3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float fClamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, fAbs), 1.0f, 0.0f);
        adaptiveIconImageView3.setScaleX(fClamp3);
        adaptiveIconImageView3.setScaleY(fClamp3);
        float f2 = fAbs < 0.4f ? fAbs / 0.4f : 1.0f;
        adaptiveIconImageView.particlesScale = f2;
        adaptiveIconImageView2.particlesScale = f2;
        adaptiveIconImageView3.particlesScale = f2;
    }
}
