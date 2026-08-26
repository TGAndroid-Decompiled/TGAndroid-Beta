package org.telegram.ui;

import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public class DarkBlueThemeResourcesProvider extends DarkThemeResourceProvider {
    public DarkBlueThemeResourcesProvider() {
        this.sparseIntArray.put(Theme.key_windowBackgroundWhite, -14537933);
        this.sparseIntArray.put(Theme.key_dialogBackground, -14537933);
        this.sparseIntArray.put(Theme.key_windowBackgroundGray, -13616313);
        this.sparseIntArray.put(Theme.key_graySection, -14142917);
        this.sparseIntArray.put(Theme.key_graySectionText, -8090220);
        this.sparseIntArray.put(Theme.key_groupcreate_spanBackground, -14142917);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuBackground, -13616313);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuSeparator, -14733761);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItemIcon, -1);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItem, -1);
        this.sparseIntArray.put(Theme.key_undo_background, -231982259);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueIcon, -11683585);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueButton, -10637330);
        this.sparseIntArray.put(Theme.key_checkboxSquareBackground, -12692893);
        this.sparseIntArray.put(Theme.key_checkbox, -15033089);
    }

    @Override
    public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i, i2, f, f2);
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
}
