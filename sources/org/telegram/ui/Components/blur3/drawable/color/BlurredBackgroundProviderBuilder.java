package org.telegram.ui.Components.blur3.drawable.color;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class BlurredBackgroundProviderBuilder implements BlurredBackgroundProvider {
    public ColorProvider backgroundColor;
    public final Theme.ResourcesProvider resourcesProvider;
    public ColorProvider shadowColor;
    public float shadowDy;
    public float shadowRadius;
    public ColorProvider strokeColorBottom;
    public ColorProvider strokeColorTop;
    public float strokeWidthBottom;
    public float strokeWidthTop;

    public interface ColorProvider {
        int getColor(Theme.ResourcesProvider resourcesProvider, boolean z);
    }

    public BlurredBackgroundProviderBuilder(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        float fDpf2 = AndroidUtilities.dpf2(1.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        this.shadowRadius = fDpf2;
        this.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        this.strokeWidthTop = fDpf4;
        this.strokeWidthBottom = fDpf5;
    }

    public final int get(ColorProvider colorProvider) {
        if (colorProvider == null) {
            return 0;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return colorProvider.getColor(resourcesProvider, ((resourcesProvider instanceof DarkThemeResourceProvider) || resourcesProvider != null) ? resourcesProvider.isDark() : Theme.currentTheme.isDark());
    }

    @Override
    public final int getBackgroundColor() {
        return get(this.backgroundColor);
    }

    @Override
    public final int getShadowColor() {
        return get(this.shadowColor);
    }

    @Override
    public final int getStrokeColorBottom() {
        return get(this.strokeColorBottom);
    }

    @Override
    public final int getStrokeColorTop() {
        return get(this.strokeColorTop);
    }
}
