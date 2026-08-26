package org.telegram.ui.bots;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;

public final class BotWebViewMenuContainer$ActionBarColorsAnimating {
    public float progress;
    public final SparseIntArray fromColors = new SparseIntArray();
    public final SparseIntArray toColors = new SparseIntArray();
    public final int[] colorKeys = {Theme.key_windowBackgroundWhiteBlackText, Theme.key_actionBarWhiteSelector, Theme.key_actionBarDefaultSubmenuBackground, Theme.key_actionBarDefaultSubmenuItem, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_dialogButtonSelector, Theme.key_sheet_scrollUp};

    public final int getColor(int i) {
        return ColorUtils.blendARGB(this.progress, this.fromColors.get(i), this.toColors.get(i));
    }

    public final void updateActionBar(ActionBar actionBar, float f) {
        this.progress = f;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(getColor(i));
        actionBar.setSubtitleColor(Theme.multAlpha(0.45f, getColor(i)));
        actionBar.setItemsColor(getColor(i), false);
        ImageView imageView = actionBar.backButtonImageView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getColor(i), PorterDuff.Mode.SRC_IN));
        }
        actionBar.setItemsBackgroundColor(getColor(Theme.key_actionBarWhiteSelector), false);
    }

    public final void updateColors(SparseIntArray sparseIntArray, int i, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int[] iArr = this.colorKeys;
        int i3 = 0;
        if (i == 0) {
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                sparseIntArray.put(i4, Theme.getColor(i4, resourcesProvider));
                i3++;
            }
            return;
        }
        int i5 = ColorUtils.calculateLuminance(i) < 0.5d ? -1 : -16777216;
        int alphaComponent = ColorUtils.setAlphaComponent(i5, 60);
        while (i3 < iArr.length) {
            int i6 = iArr[i3];
            if (i6 == Theme.key_actionBarDefaultSubmenuBackground || i6 == Theme.key_actionBarDefaultSubmenuItem || i6 == Theme.key_actionBarDefaultSubmenuItemIcon || i6 == (i2 = Theme.key_dialogButtonSelector)) {
                sparseIntArray.put(i6, Theme.getColor(i6, resourcesProvider));
            } else if (i6 == Theme.key_sheet_scrollUp) {
                sparseIntArray.put(i6, ColorUtils.blendARGB(0.5f, i, i5));
            } else if (i6 == Theme.key_actionBarWhiteSelector || i6 == i2) {
                sparseIntArray.put(i6, alphaComponent);
            } else {
                sparseIntArray.put(i6, i5);
            }
            i3++;
        }
    }
}
