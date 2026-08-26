package org.telegram.ui.Components.Paint.Views;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;

public final class LPhotoPaintView$$ExternalSyntheticLambda21 implements Theme.ResourcesProvider, BlurredBackgroundProviderBuilder.ColorProvider {
    public final int $r8$classId;
    public final Theme.ResourcesProvider f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda21(Theme.ResourcesProvider resourcesProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = resourcesProvider;
    }

    @Override
    public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i, i2, f, f2);
    }

    @Override
    public ColorFilter getAnimatedEmojiColorFilter() {
        return Theme.chat_animatedEmojiTextColorFilter;
    }

    @Override
    public int getColor(int i) {
        return LPhotoPaintView.lambda$new$0(this.f$0, i);
    }

    @Override
    public int getColorOrDefault(int i) {
        return getColor(i);
    }

    @Override
    public int getCurrentColor(int i) {
        return getColor(i);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public Paint getPaint(String str) {
        return Theme.getThemePaint(str);
    }

    @Override
    public boolean hasGradientService() {
        return false;
    }

    @Override
    public boolean isDark() {
        return Theme.currentTheme.isDark();
    }

    @Override
    public void setAnimatedColor(int i, int i2) {
    }

    @Override
    public int getColor(Theme.ResourcesProvider resourcesProvider, boolean z) {
        switch (this.$r8$classId) {
            case 1:
                if (BlurredBackgroundProviderImpl.checkBlurEnabled(UserConfig.selectedAccount, this.f$0)) {
                    return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider));
                }
                return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider), 255);
            case 2:
                if (BlurredBackgroundProviderImpl.checkBlurEnabled(UserConfig.selectedAccount, this.f$0)) {
                    return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider));
                }
                return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider), 255);
            default:
                if (BlurredBackgroundProviderImpl.checkBlurEnabled(UserConfig.selectedAccount, this.f$0)) {
                    return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider));
                }
                return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider), 255);
        }
    }
}
