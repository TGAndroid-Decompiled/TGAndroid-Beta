package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CombinedDrawable;

public final class TextInfoCell extends TextInfoPrivacyCell {
    public final Theme.ResourcesProvider resourcesProvider;

    public TextInfoCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, 24, resourcesProvider);
        this.resourcesProvider = resourcesProvider;
    }

    public void setBackground(boolean z) {
        Context context = getContext();
        int i = z ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i2 = Theme.key_windowBackgroundGrayShadow;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider)), Theme.getThemedDrawable(context, i, Theme.getColor(i2, resourcesProvider)), 0, 0);
        combinedDrawable.fullSize = true;
        setBackground(combinedDrawable);
    }
}
