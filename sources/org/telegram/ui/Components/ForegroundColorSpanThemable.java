package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import org.telegram.ui.ActionBar.Theme;
public class ForegroundColorSpanThemable extends CharacterStyle implements UpdateAppearance {
    private int color;
    private String colorKey;
    private final Theme.ResourcesProvider resourcesProvider;

    public ForegroundColorSpanThemable(String str) {
        this(str, null);
    }

    public ForegroundColorSpanThemable(String str, Theme.ResourcesProvider resourcesProvider) {
        this.colorKey = str;
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.color = Theme.getColor(this.colorKey, this.resourcesProvider);
        int color = textPaint.getColor();
        int i = this.color;
        if (color != i) {
            textPaint.setColor(i);
        }
    }
}
