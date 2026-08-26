package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class StarRatingView extends View {
    private final Colors colors;
    private Delegate delegate;
    private final BadgeLevelDrawable drawable;
    private boolean isVisible;
    private final AnimatedFloat isVisibleAnimator;
    private boolean isVisibleExternal;
    private boolean isVisibleInternal;

    public static class Colors {
        public int backgroundColor;
        public int fillingColor;
        private float parentExpanded;
        public MessagesController.PeerColor peerColor;
        private Theme.ResourcesProvider resourcesProvider;

        private Colors() {
            this.backgroundColor = -16777216;
            this.fillingColor = -1;
        }

        public void reset() {
            this.backgroundColor = Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider);
            this.fillingColor = Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider);
            this.backgroundColor = ColorUtils.blendARGB(this.parentExpanded, this.backgroundColor, 603979776);
            this.fillingColor = ColorUtils.blendARGB(this.parentExpanded, this.fillingColor, -1);
        }

        public void setParentExpanded(float f) {
            this.parentExpanded = f;
            update(this.peerColor);
        }

        public void update(MessagesController.PeerColor peerColor) {
            this.peerColor = peerColor;
            if (peerColor == null) {
                reset();
                return;
            }
            int tabsViewBackgroundColor = StarRatingView.getTabsViewBackgroundColor(this.resourcesProvider, peerColor.getBgColor2(Theme.currentTheme.isDark()), peerColor.getBgColor1(Theme.currentTheme.isDark()));
            this.backgroundColor = tabsViewBackgroundColor;
            this.fillingColor = AndroidUtilities.computePerceivedBrightness(tabsViewBackgroundColor) > 0.721f ? -16777216 : -1;
            this.backgroundColor = ColorUtils.blendARGB(this.parentExpanded, this.backgroundColor, 603979776);
            this.fillingColor = ColorUtils.blendARGB(this.parentExpanded, this.fillingColor, -1);
        }
    }

    public interface Delegate {
        void onUpdateState(float f);
    }

    public StarRatingView(Context context) {
        super(context);
        this.colors = new Colors();
        AnimatedFloat animatedFloat = new AnimatedFloat(new StarRatingView$$ExternalSyntheticLambda0(this, 0), 380L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.isVisibleAnimator = animatedFloat;
        BadgeLevelDrawable badgeLevelDrawable = new BadgeLevelDrawable(context);
        this.drawable = badgeLevelDrawable;
        badgeLevelDrawable.setCallback(this);
        this.isVisible = false;
        animatedFloat.set(false);
        checkVisibility();
    }

    private void checkVisibility() {
        boolean z = this.isVisibleExternal && this.isVisibleInternal;
        this.isVisible = z;
        this.isVisibleAnimator.set(z);
        setEnabled(this.isVisible);
        setClickable(this.isVisible);
        invalidate();
    }

    public static int getTabsViewBackgroundColor(Theme.ResourcesProvider resourcesProvider, int i, int i2) {
        int iBlendARGB = ColorUtils.blendARGB(0.75f, i, i2);
        return AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.721f ? Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider) : Theme.adaptHSV(0.08f, -0.08f, iBlendARGB);
    }

    public void lambda$onUpdateVisibilityFactor$0() {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onUpdateState(getVisibilityFactor());
        }
    }

    public void onUpdateVisibilityFactor() {
        invalidate();
        AndroidUtilities.runOnUIThread(new StarRatingView$$ExternalSyntheticLambda0(this, 1));
    }

    public float getVisibilityFactor() {
        return this.isVisibleAnimator.get();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drawable.debugUpdateStart();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drawable.debugUpdateStop();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f = this.isVisibleAnimator.set(this.isVisible);
        int iM$2 = OKLCH.m$2(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(iM$2, measuredHeight);
        canvas.scale(f, f, 0.0f, AndroidUtilities.dp(12.0f));
        this.drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        this.drawable.setOuterColor(this.colors.backgroundColor);
        this.drawable.setInnerColor(this.colors.fillingColor);
        this.drawable.setTextColor(this.colors.backgroundColor | (-16777216));
        this.drawable.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        this.isVisibleInternal = tl_starsRating != null;
        checkVisibility();
        if (tl_starsRating == null) {
            return;
        }
        this.drawable.setBadgeLevel(tl_starsRating.level, true);
        StringBuilder sb = new StringBuilder();
        zzko.m(R.string.AccDescrProfileRatingLevel, " ", sb);
        sb.append(tl_starsRating.level);
        setContentDescription(sb.toString());
        invalidate();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setParentExpanded(float f) {
        this.colors.setParentExpanded(f);
        invalidate();
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.colors.resourcesProvider = resourcesProvider;
    }

    public void setVisibility(boolean z) {
        this.isVisibleExternal = z;
        checkVisibility();
    }

    public void updateColors(MessagesController.PeerColor peerColor) {
        this.colors.update(peerColor);
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.drawable;
    }
}
