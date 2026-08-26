package org.telegram.ui.Components.blur3.drawable.color;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.Theme;

public class BlurredBackgroundColorProviderThemed implements BlurredBackgroundColorProvider {
    private float alpha;
    private int backgroundColor;
    private final int backgroundColorId;
    private final Theme.ResourcesProvider resourcesProvider;
    private int shadowColor;
    private int strokeColorBottom;
    private int strokeColorTop;

    public BlurredBackgroundColorProviderThemed(Theme.ResourcesProvider resourcesProvider, int i) {
        this(resourcesProvider, i, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override
    public int getShadowColor() {
        return this.shadowColor;
    }

    @Override
    public int getStrokeColorBottom() {
        return this.strokeColorBottom;
    }

    @Override
    public int getStrokeColorTop() {
        return this.strokeColorTop;
    }

    public boolean isDark() {
        return AndroidUtilities.computePerceivedBrightness(Theme.getColor(this.backgroundColorId, this.resourcesProvider)) < 0.721f;
    }

    public void setAlpha(float f) {
        this.alpha = f;
        updateColors();
    }

    public void updateColors() {
        this.backgroundColor = Theme.multAlpha(this.alpha, Theme.getColor(this.backgroundColorId, this.resourcesProvider));
        if (isDark()) {
            this.strokeColorTop = 687865855;
            this.strokeColorBottom = 352321535;
            this.shadowColor = 0;
        } else {
            this.strokeColorTop = -1;
            this.strokeColorBottom = -1;
            this.shadowColor = 536870912;
        }
    }

    public BlurredBackgroundColorProviderThemed(Theme.ResourcesProvider resourcesProvider, int i, float f) {
        this.resourcesProvider = resourcesProvider;
        this.backgroundColorId = i;
        this.alpha = f;
        updateColors();
    }
}
