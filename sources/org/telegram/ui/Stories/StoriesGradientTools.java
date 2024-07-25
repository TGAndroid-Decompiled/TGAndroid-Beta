package org.telegram.ui.Stories;

import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.GradientTools;
public class StoriesGradientTools extends GradientTools {
    int colorKey1;
    int colorKey2;

    public StoriesGradientTools() {
        int i = Theme.key_voipgroup_overlayGreen1;
        this.colorKey1 = i;
        this.colorKey2 = Theme.key_voipgroup_overlayBlue1;
        this.isDiagonal = true;
        setColors(Theme.getColor(i), Theme.getColor(this.colorKey2));
    }

    @Override
    public void updateBounds() {
        setColors(Theme.getColor(this.colorKey1), Theme.getColor(this.colorKey2));
        super.updateBounds();
    }
}
