package org.telegram.ui.Components.blur3.drawable.color.impl;

import android.graphics.Color;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;

public abstract class BlurredBackgroundProviderImpl {
    public static BlurredBackgroundProviderBuilder attachMenuSearch(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(16);
        int i = 402653183;
        int i2 = 385875968;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i2, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i2, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(83886079, 285212672, 2);
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder bottomPanelChatActivity(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new LPhotoPaintView$$ExternalSyntheticLambda9(1, resourcesProvider);
        int i = -1;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(687865855, i, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(352321535, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(0, 536870912, 2);
        float fDpf2 = AndroidUtilities.dpf2(0.5f);
        float fDpf3 = AndroidUtilities.dpf2(0.5f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
        return blurredBackgroundProviderBuilder;
    }

    public static boolean checkBlurEnabled(int i, Theme.ResourcesProvider resourcesProvider) {
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        boolean zChatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (zChatBlurEnabled && !zIsDark && MessagesController.getInstance(i).config.disableBlurInLightTheme.get()) {
            zChatBlurEnabled = false;
        }
        if (zChatBlurEnabled && zIsDark && MessagesController.getInstance(i).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return zChatBlurEnabled;
    }

    public static BlurredBackgroundProviderBuilder emojiViewButton(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(21);
        int i = -1;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(687865855, i, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(352321535, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(0, 1073741824, 2);
        float fDpf2 = AndroidUtilities.dpf2(3.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.5f);
        float fDpf5 = AndroidUtilities.dpf2(0.5f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder inputFieldShareAlert(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(19);
        int i = 687865855;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        int i2 = 352321535;
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i2, i2, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(0, 536870912, 2);
        float fDpf2 = AndroidUtilities.dpf2(3.3333333f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder mainTabs(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(17);
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(117440511, 285212672, 2);
        int i = 536870912;
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(301989887, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(83886079, i, 2);
        float fDpf2 = AndroidUtilities.dpf2(2.667f);
        float fDpf3 = AndroidUtilities.dpf2(0.85f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder messageMenuBackground(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(9);
        int i = 0;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, 1157627903, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, 587202559, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, 939524096, 2);
        blurredBackgroundProviderBuilder.shadowRadius = AndroidUtilities.dpf2(3.5f);
        blurredBackgroundProviderBuilder.shadowDy = 0.0f;
        float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder messageMenuReactionsBackground(Theme.ResourcesProvider resourcesProvider) {
        return messageMenuBackground(resourcesProvider);
    }

    public static BlurredBackgroundProviderBuilder photoViewer(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(18);
        int i = 687865855;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        int i2 = 352321535;
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i2, i2, 2);
        float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder scrimMenuBackground(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(10);
        int i = 0;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, 1157627903, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, 587202559, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, 637534208, 2);
        blurredBackgroundProviderBuilder.shadowRadius = AndroidUtilities.dpf2(4.0f);
        blurredBackgroundProviderBuilder.shadowDy = 0.0f;
        float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder shadow(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        int i = 0;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(687865855, i, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(352321535, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(83886079, 805306368, 2);
        float fDpf2 = AndroidUtilities.dpf2(4.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        return blurredBackgroundProviderBuilder;
    }

    public static int solveSrcColor(float f, int i, int i2) {
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

    public static BlurredBackgroundProviderBuilder topPanel(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(11);
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(117440511, 285212672, 2);
        int i = 536870912;
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(301989887, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(83886079, i, 2);
        float fDpf2 = AndroidUtilities.dpf2(2.667f);
        float fDpf3 = AndroidUtilities.dpf2(0.85f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder topPanelChatActivity(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new LPhotoPaintView$$ExternalSyntheticLambda9(3, resourcesProvider);
        int i = -1;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(553648127, i, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(352321535, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(0, 536870912, 2);
        float fDpf2 = AndroidUtilities.dpf2(0.55f);
        float fDpf3 = AndroidUtilities.dpf2(0.55f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder topPanelChatActivitySearchListBg(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(22);
        int i = 0;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        blurredBackgroundProviderBuilder.shadowRadius = 0.0f;
        blurredBackgroundProviderBuilder.shadowDy = 0.0f;
        blurredBackgroundProviderBuilder.strokeWidthTop = 0.0f;
        blurredBackgroundProviderBuilder.strokeWidthBottom = 0.0f;
        return blurredBackgroundProviderBuilder;
    }

    public static BlurredBackgroundProviderBuilder topPanelChatActivityTags(Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new LPhotoPaintView$$ExternalSyntheticLambda9(2, resourcesProvider);
        int i = 0;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i, 2);
        blurredBackgroundProviderBuilder.shadowRadius = 0.0f;
        blurredBackgroundProviderBuilder.shadowDy = 0.0f;
        blurredBackgroundProviderBuilder.strokeWidthTop = 0.0f;
        blurredBackgroundProviderBuilder.strokeWidthBottom = 0.0f;
        return blurredBackgroundProviderBuilder;
    }
}
