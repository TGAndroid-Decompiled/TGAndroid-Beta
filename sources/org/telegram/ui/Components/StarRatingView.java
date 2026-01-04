package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;

public class StarRatingView extends View {
    private final Colors colors;
    private Delegate delegate;
    private final BadgeLevelDrawable drawable;
    private boolean isVisible;
    private final AnimatedFloat isVisibleAnimator;
    private boolean isVisibleExternal;
    private boolean isVisibleInternal;

    public interface Delegate {
        void onUpdateState(float f);
    }

    public StarRatingView(Context context) {
        super(context);
        this.colors = new Colors();
        AnimatedFloat animatedFloat = new AnimatedFloat(new Runnable() {
            @Override
            public final void run() {
                this.f$0.onUpdateVisibilityFactor();
            }
        }, 380L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.isVisibleAnimator = animatedFloat;
        BadgeLevelDrawable badgeLevelDrawable = new BadgeLevelDrawable(context);
        this.drawable = badgeLevelDrawable;
        badgeLevelDrawable.setCallback(this);
        this.isVisible = false;
        animatedFloat.set(false);
        checkVisibility();
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.colors.resourcesProvider = resourcesProvider;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.drawable;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        this.isVisibleInternal = tl_starsRating != null;
        checkVisibility();
        if (tl_starsRating == null) {
            return;
        }
        this.drawable.setBadgeLevel(tl_starsRating.level, true);
        invalidate();
    }

    public void setVisibility(boolean z) {
        this.isVisibleExternal = z;
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

    @Override
    protected void onDraw(Canvas canvas) {
        float f = this.isVisibleAnimator.set(this.isVisible);
        int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(measuredWidth, measuredHeight);
        canvas.scale(f, f, 0.0f, AndroidUtilities.dp(12.0f));
        this.drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        this.drawable.setOuterColor(this.colors.backgroundColor);
        this.drawable.setInnerColor(this.colors.fillingColor);
        this.drawable.setTextColor(this.colors.backgroundColor | (-16777216));
        this.drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drawable.debugUpdateStart();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drawable.debugUpdateStop();
    }

    public void onUpdateVisibilityFactor() {
        invalidate();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onUpdateVisibilityFactor$0();
            }
        });
    }

    public void lambda$onUpdateVisibilityFactor$0() {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onUpdateState(getVisibilityFactor());
        }
    }

    public float getVisibilityFactor() {
        return this.isVisibleAnimator.get();
    }

    public void updateColors(MessagesController.PeerColor peerColor) {
        this.colors.update(peerColor);
        invalidate();
    }

    public void setParentExpanded(float f) {
        this.colors.setParentExpanded(f);
        invalidate();
    }

    private static class Colors {
        public int backgroundColor;
        public int fillingColor;
        private float parentExpanded;
        public MessagesController.PeerColor peerColor;
        private Theme.ResourcesProvider resourcesProvider;

        private Colors() {
            this.backgroundColor = -16777216;
            this.fillingColor = -1;
        }

        public void update(MessagesController.PeerColor peerColor) {
            this.peerColor = peerColor;
            if (peerColor == null) {
                reset();
                return;
            }
            int tabsViewBackgroundColor = StarRatingView.getTabsViewBackgroundColor(this.resourcesProvider, peerColor.getBgColor2(Theme.isCurrentThemeDark()), peerColor.getBgColor1(Theme.isCurrentThemeDark()));
            this.backgroundColor = tabsViewBackgroundColor;
            this.fillingColor = AndroidUtilities.computePerceivedBrightness(tabsViewBackgroundColor) > 0.721f ? -16777216 : -1;
            this.backgroundColor = ColorUtils.blendARGB(this.backgroundColor, 603979776, this.parentExpanded);
            this.fillingColor = ColorUtils.blendARGB(this.fillingColor, -1, this.parentExpanded);
        }

        public void reset() {
            this.backgroundColor = Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider);
            this.fillingColor = Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider);
            this.backgroundColor = ColorUtils.blendARGB(this.backgroundColor, 603979776, this.parentExpanded);
            this.fillingColor = ColorUtils.blendARGB(this.fillingColor, -1, this.parentExpanded);
        }

        public void setParentExpanded(float f) {
            this.parentExpanded = f;
            update(this.peerColor);
        }
    }

    public static int getTabsViewBackgroundColor(Theme.ResourcesProvider resourcesProvider, int i, int i2) {
        int iBlendARGB = ColorUtils.blendARGB(i, i2, 0.75f);
        if (AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.721f) {
            return Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider);
        }
        return Theme.adaptHSV(iBlendARGB, 0.08f, -0.08f);
    }
}
