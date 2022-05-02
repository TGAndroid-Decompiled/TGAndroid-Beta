package org.telegram.p009ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;

public class LinkPath extends Path {
    private static CornerPathEffect roundedEffect;
    private static int roundedEffectRadius;
    private int baselineShift;
    private Layout currentLayout;
    private int currentLine;
    private float heightOffset;
    private int lineHeight;
    private boolean useRoundRect;
    private float lastTop = -1.0f;
    private boolean allowReset = true;

    public static int getRadius() {
        return AndroidUtilities.m34dp(4.0f);
    }

    public static CornerPathEffect getRoundedEffect() {
        if (roundedEffect == null || roundedEffectRadius != getRadius()) {
            int radius = getRadius();
            roundedEffectRadius = radius;
            roundedEffect = new CornerPathEffect(radius);
        }
        return roundedEffect;
    }

    public LinkPath() {
    }

    public LinkPath(boolean z) {
        this.useRoundRect = z;
    }

    public void setCurrentLayout(Layout layout, int i, float f) {
        int lineCount;
        this.currentLayout = layout;
        this.currentLine = layout.getLineForOffset(i);
        this.lastTop = -1.0f;
        this.heightOffset = f;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i2 = lineCount - 1;
            this.lineHeight = layout.getLineBottom(i2) - layout.getLineTop(i2);
        }
    }

    public void setAllowReset(boolean z) {
        this.allowReset = z;
    }

    public void setUseRoundRect(boolean z) {
        this.useRoundRect = z;
    }

    public void setBaselineShift(int i) {
        this.baselineShift = i;
    }

    @Override
    public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5 = this.heightOffset;
        float f6 = f2 + f5;
        float f7 = f5 + f4;
        float f8 = this.lastTop;
        if (f8 == -1.0f) {
            this.lastTop = f6;
        } else if (f8 != f6) {
            this.lastTop = f6;
            this.currentLine++;
        }
        float lineRight = this.currentLayout.getLineRight(this.currentLine);
        float lineLeft = this.currentLayout.getLineLeft(this.currentLine);
        if (f >= lineRight) {
            return;
        }
        if (f > lineLeft || f3 > lineLeft) {
            float f9 = f3 > lineRight ? lineRight : f3;
            if (f >= lineLeft) {
                lineLeft = f;
            }
            float f10 = 0.0f;
            if (Build.VERSION.SDK_INT < 28) {
                if (f7 != this.currentLayout.getHeight()) {
                    f10 = this.currentLayout.getSpacingAdd();
                }
                f7 -= f10;
            } else if (f7 - f6 > this.lineHeight) {
                float f11 = this.heightOffset;
                if (f7 != this.currentLayout.getHeight()) {
                    f10 = this.currentLayout.getLineBottom(this.currentLine) - this.currentLayout.getSpacingAdd();
                }
                f7 = f11 + f10;
            }
            int i = this.baselineShift;
            if (i < 0) {
                f7 += i;
            } else if (i > 0) {
                f6 += i;
            }
            float f12 = f7;
            float f13 = f6;
            if (this.useRoundRect) {
                super.addRect(lineLeft - (getRadius() / 2.0f), f13, f9 + (getRadius() / 2.0f), f12, direction);
            } else {
                super.addRect(lineLeft, f13, f9, f12, direction);
            }
        }
    }

    @Override
    public void reset() {
        if (this.allowReset) {
            super.reset();
        }
    }
}
