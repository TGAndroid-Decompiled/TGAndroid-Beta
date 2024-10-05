package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.Theme;

public class WrappedResourceProvider implements Theme.ResourcesProvider {
    Theme.ResourcesProvider resourcesProvider;
    public SparseIntArray sparseIntArray = new SparseIntArray();

    public WrappedResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        appendColors();
    }

    public void appendColors() {
    }

    @Override
    public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider == null) {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        } else {
            resourcesProvider.applyServiceShaderMatrix(i, i2, f, f2);
        }
    }

    @Override
    public ColorFilter getAnimatedEmojiColorFilter() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.getAnimatedEmojiColorFilter(null) : resourcesProvider.getAnimatedEmojiColorFilter();
    }

    @Override
    public int getColor(int i) {
        int indexOfKey = this.sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.sparseIntArray.valueAt(indexOfKey);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.getColor(i) : resourcesProvider.getColor(i);
    }

    @Override
    public int getColorOrDefault(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.getColor(i) : resourcesProvider.getColorOrDefault(i);
    }

    @Override
    public int getCurrentColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.getColor(i) : resourcesProvider.getCurrentColor(i);
    }

    @Override
    public Drawable getDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.getThemeDrawable(str) : resourcesProvider.getDrawable(str);
    }

    @Override
    public Paint getPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.getThemePaint(str) : resourcesProvider.getPaint(str);
    }

    @Override
    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService();
    }

    @Override
    public boolean isDark() {
        boolean isCurrentThemeDark;
        isCurrentThemeDark = Theme.isCurrentThemeDark();
        return isCurrentThemeDark;
    }

    @Override
    public void setAnimatedColor(int i, int i2) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.setAnimatedColor(i, i2);
        }
    }
}
