package org.telegram.ui.Components.blur3.drawable.color.impl;

import android.graphics.Color;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;

public abstract class BlurredBackgroundProviderImpl {
    public static BlurredBackgroundProvider mainTabs(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                return BlurredBackgroundProviderImpl.lambda$mainTabs$0(resourcesProvider2, z);
            }
        }).setStrokeColorTop(285212672, 117440511).setStrokeColorBottom(536870912, 301989887).setShadowColor(536870912, 83886079).setShadowLayer(AndroidUtilities.dpf2(2.667f), 0.0f, AndroidUtilities.dpf2(0.85f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    public static int lambda$mainTabs$0(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTabs, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider topPanel(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                return BlurredBackgroundProviderImpl.lambda$topPanel$1(resourcesProvider2, z);
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(637534208, 83886079).setShadowLayer(AndroidUtilities.dpf2(3.3333333f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    public static int lambda$topPanel$1(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTopPanel, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider topPanelChatActivity(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                return BlurredBackgroundProviderImpl.lambda$topPanelChatActivity$2(resourcesProvider2, z);
            }
        }).setStrokeColorTop(-1, 687865855).setStrokeColorBottom(-1, 352321535).setShadowColor(536870912, 0).setStrokeWidth(AndroidUtilities.dpf2(0.5f), AndroidUtilities.dpf2(0.5f)).build();
    }

    public static int lambda$topPanelChatActivity$2(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider inputFieldDialogActivity(Theme.ResourcesProvider resourcesProvider) {
        return topPanel(resourcesProvider);
    }

    public static BlurredBackgroundProvider inputFieldShareAlert(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                return BlurredBackgroundProviderImpl.lambda$inputFieldShareAlert$3(resourcesProvider2, z);
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(637534208, 83886079).setShadowLayer(AndroidUtilities.dpf2(3.3333333f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    public static int lambda$inputFieldShareAlert$3(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static int solveSrcColor(int i, int i2, float f) {
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (fClamp <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (fClamp >= 1.0f) {
            return Color.argb(255, Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        float f2 = 1.0f - fClamp;
        return Color.argb(MathUtils.clamp(Math.round(fClamp * 255.0f), 0, 255), MathUtils.clamp(Math.round((Color.red(i2) - (iRed * f2)) / fClamp), 0, 255), MathUtils.clamp(Math.round((Color.green(i2) - (iGreen * f2)) / fClamp), 0, 255), MathUtils.clamp(Math.round((Color.blue(i2) - (iBlue * f2)) / fClamp), 0, 255));
    }
}
