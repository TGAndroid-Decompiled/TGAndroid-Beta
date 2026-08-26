package org.telegram.ui.Stories;

import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.GradientTools;

public final class StoriesGradientTools extends GradientTools {
    public final int colorKey1;
    public final int colorKey2;

    public StoriesGradientTools() {
        int i = Theme.key_voipgroup_overlayGreen1;
        this.colorKey1 = i;
        int i2 = Theme.key_voipgroup_overlayBlue1;
        this.colorKey2 = i2;
        this.isDiagonal = true;
        setColors(Theme.getColor(null, i, false), Theme.getColor(null, i2, false), 0, 0);
    }

    @Override
    public final void updateBounds() {
        setColors(Theme.getColor(null, this.colorKey1, false), Theme.getColor(null, this.colorKey2, false), 0, 0);
        super.updateBounds();
    }
}
