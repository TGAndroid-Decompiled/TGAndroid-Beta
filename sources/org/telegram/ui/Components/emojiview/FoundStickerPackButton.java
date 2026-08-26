package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class FoundStickerPackButton extends ButtonWithCounterView implements FactorAnimator.Target {
    public final BoolAnimator animatorIsPrimary;
    public final Theme.ResourcesProvider resourcesProvider;

    public FoundStickerPackButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, true);
        this.animatorIsPrimary = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, true);
        this.resourcesProvider = resourcesProvider;
        setRoundRadius(24);
        setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        float f3 = this.animatorIsPrimary.floatValue;
        setElevation((1.0f - f3) * AndroidUtilities.dp(1.0f));
        int i2 = Theme.key_windowBackgroundWhite;
        int color = resourcesProvider != null ? resourcesProvider.getColor(i2) : Theme.getColor(null, i2, false);
        int i3 = Theme.key_featuredStickers_addButton;
        setColor(ColorUtils.blendARGB(f3, color, resourcesProvider != null ? resourcesProvider.getColor(i3) : Theme.getColor(null, i3, false)));
        int i4 = Theme.key_text_RedBold;
        int color2 = resourcesProvider != null ? resourcesProvider.getColor(i4) : Theme.getColor(null, i4, false);
        int i5 = Theme.key_featuredStickers_buttonText;
        setTextColor(ColorUtils.blendARGB(f3, color2, resourcesProvider != null ? resourcesProvider.getColor(i5) : Theme.getColor(null, i5, false)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (zIsDark) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }
}
