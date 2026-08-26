package org.telegram.ui.Components.Paint.Views;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;

public final class LPhotoPaintView$$ExternalSyntheticLambda9 implements Theme.ResourcesProvider, BlurredBackgroundProviderBuilder.ColorProvider {
    public final int $r8$classId;
    public final Theme.ResourcesProvider f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda9(int i, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = i;
        this.f$0 = resourcesProvider;
    }

    @Override
    public void applyServiceShaderMatrix(float f, float f2, int i, int i2) {
        ArticleViewer.IBlock.CC.$default$applyServiceShaderMatrix(f, f2, i, i2);
    }

    @Override
    public ColorFilter getAnimatedEmojiColorFilter() {
        return Theme.chat_animatedEmojiTextColorFilter;
    }

    @Override
    public int getColor(int i) {
        if (i == Theme.key_actionBarDefaultSubmenuBackground) {
            return -14145495;
        }
        if (i == Theme.key_actionBarDefaultSubmenuItem) {
            return -1;
        }
        if (i == Theme.key_dialogBackground) {
            return -14737633;
        }
        if (i == Theme.key_dialogTextBlack) {
            return -592138;
        }
        if (i == Theme.key_dialogTextGray3) {
            return -8553091;
        }
        if (i == Theme.key_chat_emojiPanelBackground) {
            return -16777216;
        }
        if (i == Theme.key_chat_emojiPanelShadowLine) {
            return -1610612736;
        }
        if (i == Theme.key_chat_emojiBottomPanelIcon || i == Theme.key_chat_emojiPanelBackspace || i == Theme.key_chat_emojiPanelIcon) {
            return -9539985;
        }
        if (i == Theme.key_windowBackgroundWhiteBlackText) {
            return -1;
        }
        int i2 = Theme.key_featuredStickers_addedIcon;
        if (i == i2) {
            return -11754001;
        }
        if (i == Theme.key_listSelector) {
            return 536870911;
        }
        if (i == Theme.key_profile_tabSelectedText || i == Theme.key_profile_tabText || i == Theme.key_profile_tabSelectedLine) {
            return -1;
        }
        if (i == Theme.key_profile_tabSelector) {
            return 352321535;
        }
        if (i == Theme.key_chat_emojiSearchIcon || i == i2) {
            return -7895161;
        }
        if (i == Theme.key_chat_emojiSearchBackground) {
            return 780633991;
        }
        if (i == Theme.key_windowBackgroundGray) {
            return -15921907;
        }
        if (i == Theme.key_fastScrollInactive) {
            return -12500671;
        }
        if (i == Theme.key_fastScrollActive) {
            return -13133079;
        }
        if (i == Theme.key_fastScrollText) {
            return -1;
        }
        if (i == Theme.key_windowBackgroundWhite) {
            return -15198183;
        }
        if (i == Theme.key_divider) {
            return -16777216;
        }
        Theme.ResourcesProvider resourcesProvider = this.f$0;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
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
                if (!BlurredBackgroundProviderImpl.checkBlurEnabled(UserConfig.selectedAccount, this.f$0)) {
                    return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider), 255);
                }
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider));
            case 2:
                if (!BlurredBackgroundProviderImpl.checkBlurEnabled(UserConfig.selectedAccount, this.f$0)) {
                    return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider), 255);
                }
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider));
            default:
                if (!BlurredBackgroundProviderImpl.checkBlurEnabled(UserConfig.selectedAccount, this.f$0)) {
                    return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider), 255);
                }
                return Theme.multAlpha(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider));
        }
    }
}
