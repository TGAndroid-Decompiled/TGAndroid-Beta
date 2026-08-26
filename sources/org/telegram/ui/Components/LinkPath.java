package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;

public final class LinkPath extends CornerPath {
    public static CornerPathEffect roundedEffect;
    public static int roundedEffectRadius;
    public boolean allowReset;
    public int baselineShift;
    public Layout currentLayout;
    public int currentLine;
    public float insetHoriz;
    public float insetVert;
    public float lastTop;
    public int lineHeight;
    public float maxX;
    public float maxY;
    public float minX;
    public float minY;
    public final boolean useRoundRect;
    public float xOffset;
    public float yOffset;

    public LinkPath() {
        this.lastTop = -1.0f;
        this.allowReset = true;
        this.minX = Float.MAX_VALUE;
        this.minY = Float.MAX_VALUE;
        this.useCornerPathImplementation = false;
    }

    public static CornerPathEffect getRoundedEffect() {
        if (roundedEffect == null || roundedEffectRadius != AndroidUtilities.dp(5.0f)) {
            int iDp = AndroidUtilities.dp(5.0f);
            roundedEffectRadius = iDp;
            roundedEffect = new CornerPathEffect(iDp);
        }
        return roundedEffect;
    }

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        Layout layout = this.currentLayout;
        if (layout == null) {
            superAddRect(f, f2, f3, f4, direction);
            return;
        }
        try {
            float f5 = this.yOffset;
            float f6 = f2 + f5;
            float spacingAdd = f4 + f5;
            float f7 = this.lastTop;
            if (f7 == -1.0f) {
                this.lastTop = f6;
            } else if (f7 != f6) {
                this.lastTop = f6;
                this.currentLine++;
            }
            float lineRight = layout.getLineRight(this.currentLine);
            float lineLeft = this.currentLayout.getLineLeft(this.currentLine);
            if (f < lineRight) {
                if (f > lineLeft || f3 > lineLeft) {
                    if (f3 > lineRight) {
                        f3 = lineRight;
                    }
                    if (f < lineLeft) {
                        f = lineLeft;
                    }
                    float f8 = this.xOffset;
                    float f9 = f + f8;
                    float f10 = f3 + f8;
                    if (Build.VERSION.SDK_INT < 28) {
                        spacingAdd -= spacingAdd != ((float) this.currentLayout.getHeight()) ? this.currentLayout.getSpacingAdd() : 0.0f;
                    } else if (spacingAdd - f6 > this.lineHeight) {
                        spacingAdd = this.yOffset + (spacingAdd != ((float) this.currentLayout.getHeight()) ? this.currentLayout.getLineBottom(this.currentLine) - this.currentLayout.getSpacingAdd() : 0.0f);
                    }
                    int i = this.baselineShift;
                    if (i < 0) {
                        spacingAdd += i;
                    } else if (i > 0) {
                        f6 += i;
                    }
                    float f11 = f6;
                    float f12 = spacingAdd;
                    if (this.useRoundRect) {
                        superAddRect(f9 - (AndroidUtilities.dp(5.0f) / 2.0f), f11, f10 + (AndroidUtilities.dp(5.0f) / 2.0f), f12, direction);
                    } else {
                        superAddRect(f9, f11, f10, f12, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void reset() {
        if (this.allowReset) {
            super.reset();
        }
    }

    public final void setCurrentLayout(Layout layout, int i, float f, float f2) {
        int lineCount;
        if (layout == null) {
            this.currentLayout = null;
            this.currentLine = 0;
            this.lastTop = -1.0f;
            this.xOffset = f;
            this.yOffset = f2;
            return;
        }
        this.currentLayout = layout;
        this.currentLine = layout.getLineForOffset(i);
        this.lastTop = -1.0f;
        this.xOffset = f;
        this.yOffset = f2;
        if (Build.VERSION.SDK_INT < 28 || (lineCount = layout.getLineCount()) <= 0) {
            return;
        }
        int i2 = lineCount - 1;
        this.lineHeight = layout.getLineBottom(i2) - layout.getLineTop(i2);
    }

    public final void superAddRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5 = this.insetHoriz;
        float f6 = f - f5;
        float f7 = this.insetVert;
        float f8 = f2 - f7;
        float f9 = f3 + f5;
        float f10 = f4 + f7;
        this.minX = Math.min(this.minX, Math.min(f6, f9));
        this.minY = Math.min(this.minY, Math.min(f8, f10));
        this.maxX = Math.max(this.maxX, Math.max(f6, f9));
        this.maxY = Math.max(this.maxY, Math.max(f8, f10));
        super.addRect(f6, f8, f9, f10, direction);
    }

    public LinkPath(int i) {
        this.lastTop = -1.0f;
        this.allowReset = true;
        this.minX = Float.MAX_VALUE;
        this.minY = Float.MAX_VALUE;
        this.useRoundRect = true;
        this.useCornerPathImplementation = false;
    }
}
