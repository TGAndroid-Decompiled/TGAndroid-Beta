package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import org.telegram.ui.ActionBar.Theme;

public class ForegroundColorSpanThemable extends CharacterStyle implements UpdateAppearance {
    private float alpha;
    private int color;
    private int colorKey;
    private final Theme.ResourcesProvider resourcesProvider;

    public ForegroundColorSpanThemable(int i) {
        this(i, null);
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setColorKey(int i) {
        this.colorKey = i;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.color = Theme.multAlpha(this.alpha, Theme.getColor(this.colorKey, this.resourcesProvider));
        int color = textPaint.getColor();
        int i = this.color;
        if (color != i) {
            textPaint.setColor(i);
        }
    }

    public ForegroundColorSpanThemable(int i, Theme.ResourcesProvider resourcesProvider) {
        this.alpha = 1.0f;
        this.colorKey = i;
        this.resourcesProvider = resourcesProvider;
    }
}
