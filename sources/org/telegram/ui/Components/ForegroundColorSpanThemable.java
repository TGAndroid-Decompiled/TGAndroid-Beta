package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import org.telegram.ui.ActionBar.Theme;

public final class ForegroundColorSpanThemable extends CharacterStyle implements UpdateAppearance {
    public float alpha;
    public int color;
    public int colorKey;
    public final Theme.ResourcesProvider resourcesProvider;

    public ForegroundColorSpanThemable(int i) {
        this(i, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
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
