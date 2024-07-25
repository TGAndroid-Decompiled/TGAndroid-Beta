package org.telegram.ui.bots;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
public class BotWebViewMenuContainer$ActionBarColorsAnimating {
    public float progress;
    SparseIntArray fromColors = new SparseIntArray();
    SparseIntArray toColors = new SparseIntArray();
    int[] colorKeys = {Theme.key_windowBackgroundWhiteBlackText, Theme.key_actionBarWhiteSelector, Theme.key_actionBarDefaultSubmenuBackground, Theme.key_actionBarDefaultSubmenuItem, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_dialogButtonSelector, Theme.key_sheet_scrollUp};

    public void setFrom(int i, Theme.ResourcesProvider resourcesProvider) {
        updateColors(this.fromColors, i, resourcesProvider);
    }

    public void setTo(int i, Theme.ResourcesProvider resourcesProvider) {
        updateColors(this.toColors, i, resourcesProvider);
    }

    private void updateColors(SparseIntArray sparseIntArray, int i, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3 = 0;
        if (i == 0) {
            while (true) {
                int[] iArr = this.colorKeys;
                if (i3 >= iArr.length) {
                    return;
                }
                int i4 = iArr[i3];
                sparseIntArray.put(i4, Theme.getColor(i4, resourcesProvider));
                i3++;
            }
        } else {
            int i5 = ColorUtils.calculateLuminance(i) < 0.5d ? -1 : -16777216;
            int alphaComponent = ColorUtils.setAlphaComponent(i5, 60);
            while (true) {
                int[] iArr2 = this.colorKeys;
                if (i3 >= iArr2.length) {
                    return;
                }
                int i6 = iArr2[i3];
                if (i6 == Theme.key_actionBarDefaultSubmenuBackground || i6 == Theme.key_actionBarDefaultSubmenuItem || i6 == Theme.key_actionBarDefaultSubmenuItemIcon || i6 == (i2 = Theme.key_dialogButtonSelector)) {
                    sparseIntArray.put(i6, Theme.getColor(i6, resourcesProvider));
                } else if (i6 == Theme.key_sheet_scrollUp) {
                    sparseIntArray.put(i6, ColorUtils.blendARGB(i, i5, 0.5f));
                } else if (i6 == Theme.key_actionBarWhiteSelector || i6 == i2) {
                    sparseIntArray.put(i6, alphaComponent);
                } else {
                    sparseIntArray.put(i6, i5);
                }
                i3++;
            }
        }
    }

    public int getColor(int i) {
        return ColorUtils.blendARGB(this.fromColors.get(i), this.toColors.get(i), this.progress);
    }

    public void updateActionBar(ActionBar actionBar, float f) {
        this.progress = f;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(getColor(i));
        actionBar.setSubtitleColor(Theme.multAlpha(getColor(i), 0.45f));
        actionBar.setItemsColor(getColor(i), false);
        ImageView imageView = actionBar.backButtonImageView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getColor(i), PorterDuff.Mode.SRC_IN));
        }
        actionBar.setItemsBackgroundColor(getColor(Theme.key_actionBarWhiteSelector), false);
    }
}
