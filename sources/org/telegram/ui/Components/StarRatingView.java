package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public final class StarRatingView extends View {
    public final Colors colors;
    public Delegate delegate;
    public final BadgeLevelDrawable drawable;
    public boolean isVisible;
    public final AnimatedFloat isVisibleAnimator;
    public boolean isVisibleExternal;
    public boolean isVisibleInternal;

    public final class Colors {
        public int backgroundColor;
        public int fillingColor;
        public float parentExpanded;
        public MessagesController.PeerColor peerColor;
        public Theme.ResourcesProvider resourcesProvider;

        public final void update(MessagesController.PeerColor peerColor) {
            this.peerColor = peerColor;
            if (peerColor == null) {
                this.backgroundColor = Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider);
                this.fillingColor = Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider);
                this.backgroundColor = ColorUtils.blendARGB(this.parentExpanded, this.backgroundColor, 603979776);
                this.fillingColor = ColorUtils.blendARGB(this.parentExpanded, this.fillingColor, -1);
                return;
            }
            int bgColor1 = peerColor.getBgColor1(Theme.currentTheme.isDark());
            int bgColor2 = peerColor.getBgColor2(Theme.currentTheme.isDark());
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int iBlendARGB = ColorUtils.blendARGB(0.75f, bgColor2, bgColor1);
            int color = AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.721f ? Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider) : Theme.adaptHSV(0.08f, -0.08f, iBlendARGB);
            this.backgroundColor = color;
            this.fillingColor = AndroidUtilities.computePerceivedBrightness(color) > 0.721f ? -16777216 : -1;
            this.backgroundColor = ColorUtils.blendARGB(this.parentExpanded, this.backgroundColor, 603979776);
            this.fillingColor = ColorUtils.blendARGB(this.parentExpanded, this.fillingColor, -1);
        }
    }

    public interface Delegate {
    }

    public StarRatingView(Context context) {
        super(context);
        Colors colors = new Colors();
        colors.backgroundColor = -16777216;
        colors.fillingColor = -1;
        this.colors = colors;
        AnimatedFloat animatedFloat = new AnimatedFloat(new StarRatingView$$ExternalSyntheticLambda0(this, 0), 380L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.isVisibleAnimator = animatedFloat;
        BadgeLevelDrawable badgeLevelDrawable = new BadgeLevelDrawable(context);
        this.drawable = badgeLevelDrawable;
        badgeLevelDrawable.setCallback(this);
        this.isVisible = false;
        animatedFloat.set(0.0f, false);
        checkVisibility();
    }

    public final void checkVisibility() {
        boolean z = this.isVisibleExternal && this.isVisibleInternal;
        this.isVisible = z;
        this.isVisibleAnimator.set(z);
        setEnabled(this.isVisible);
        setClickable(this.isVisible);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.isVisibleAnimator.value;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drawable.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drawable.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.isVisibleAnimator.set(this.isVisible);
        int iM$2 = OKLCH.m$2(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(iM$2, measuredHeight);
        canvas.scale(f, f, 0.0f, AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(24.0f);
        int iDp2 = AndroidUtilities.dp(24.0f);
        BadgeLevelDrawable badgeLevelDrawable = this.drawable;
        badgeLevelDrawable.setBounds(0, 0, iDp, iDp2);
        Colors colors = this.colors;
        int i = colors.backgroundColor;
        if (badgeLevelDrawable.outerColor != i) {
            badgeLevelDrawable.outerColor = i;
            if (badgeLevelDrawable.inner != null) {
                badgeLevelDrawable.outer.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                badgeLevelDrawable.invalidateSelf();
            }
        }
        int i2 = colors.fillingColor;
        if (badgeLevelDrawable.innerColor != i2) {
            badgeLevelDrawable.innerColor = i2;
            Drawable drawable = badgeLevelDrawable.inner;
            if (drawable != null) {
                drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                badgeLevelDrawable.invalidateSelf();
            }
        }
        int i3 = colors.backgroundColor | (-16777216);
        if (badgeLevelDrawable.textColor != i3) {
            badgeLevelDrawable.textColor = i3;
            badgeLevelDrawable.text.setTextColor(i3, false);
            badgeLevelDrawable.invalidateSelf();
        }
        badgeLevelDrawable.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        int iClamp;
        this.isVisibleInternal = tl_starsRating != null;
        checkVisibility();
        if (tl_starsRating == null) {
            return;
        }
        int i = tl_starsRating.level;
        BadgeLevelDrawable badgeLevelDrawable = this.drawable;
        if (badgeLevelDrawable.level != i || badgeLevelDrawable.inner == null || badgeLevelDrawable.outer == null) {
            badgeLevelDrawable.text.setText(i >= 0 ? Integer.toString(i) : "!", true, true);
            badgeLevelDrawable.level = i;
            if (i < 0) {
                iClamp = 18;
            } else {
                iClamp = MathUtils.clamp(i <= 10 ? i - 1 : (i / 10) + 8, 0, 17);
            }
            if (badgeLevelDrawable.lastLevelIndex != iClamp || badgeLevelDrawable.inner == null || badgeLevelDrawable.outer == null) {
                Context context = badgeLevelDrawable.context;
                int i2 = iClamp * 2;
                Drawable drawableMutate = context.getResources().getDrawable(BadgeLevelDrawable.res[i2]).mutate();
                badgeLevelDrawable.inner = drawableMutate;
                int i3 = badgeLevelDrawable.innerColor;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(i3, mode);
                Drawable drawableMutate2 = context.getResources().getDrawable(BadgeLevelDrawable.res[i2 + 1]).mutate();
                badgeLevelDrawable.outer = drawableMutate2;
                drawableMutate2.setColorFilter(badgeLevelDrawable.outerColor, mode);
                badgeLevelDrawable.lastLevelIndex = iClamp;
                Drawable drawable = badgeLevelDrawable.inner;
                if (drawable != null) {
                    drawable.setBounds(badgeLevelDrawable.getBounds());
                }
                Drawable drawable2 = badgeLevelDrawable.outer;
                if (drawable2 != null) {
                    drawable2.setBounds(badgeLevelDrawable.getBounds());
                }
            }
            badgeLevelDrawable.invalidateSelf();
        }
        StringBuilder sb = new StringBuilder();
        zzlf.m(R.string.AccDescrProfileRatingLevel, " ", sb);
        sb.append(tl_starsRating.level);
        setContentDescription(sb.toString());
        invalidate();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setParentExpanded(float f) {
        Colors colors = this.colors;
        colors.parentExpanded = f;
        colors.update(colors.peerColor);
        invalidate();
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.colors.resourcesProvider = resourcesProvider;
    }

    public void setVisibility(boolean z) {
        this.isVisibleExternal = z;
        checkVisibility();
    }

    public final void updateColors(MessagesController.PeerColor peerColor) {
        this.colors.update(peerColor);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.drawable;
    }
}
