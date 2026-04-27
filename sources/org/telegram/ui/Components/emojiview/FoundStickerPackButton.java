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

public class FoundStickerPackButton extends ButtonWithCounterView implements FactorAnimator.Target {
    private final BoolAnimator animatorIsPrimary;
    private final Theme.ResourcesProvider resourcesProvider;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public FoundStickerPackButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.animatorIsPrimary = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, true);
        this.resourcesProvider = resourcesProvider;
        setRound();
        setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
    }

    public void setIsPrimary(boolean z, boolean z2) {
        this.animatorIsPrimary.setValue(z, z2);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        checkUi_colors();
    }

    private void checkUi_colors() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        float floatValue = this.animatorIsPrimary.getFloatValue();
        setElevation(AndroidUtilities.dp(1.0f) * (1.0f - floatValue));
        setColor(ColorUtils.blendARGB(getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_featuredStickers_addButton), floatValue));
        setTextColor(ColorUtils.blendARGB(getThemedColor(Theme.key_text_RedBold), getThemedColor(Theme.key_featuredStickers_buttonText), floatValue));
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

    private int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }
}
