package org.telegram.ui.Components;

import android.view.ViewGroup;

public class LerpedLayoutParams extends ViewGroup.MarginLayoutParams {
    private ViewGroup.LayoutParams from;
    private ViewGroup.LayoutParams to;

    public LerpedLayoutParams(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        super(layoutParams == null ? layoutParams2 : layoutParams);
        this.from = layoutParams;
        this.to = layoutParams2;
    }

    private int lerp(int i, int i2, float f) {
        return (int) (((i2 - i) * f) + i);
    }

    private int lerpSz(int i, int i2, float f) {
        if (i < 0 || i2 < 0) {
            return f < 0.5f ? i : i2;
        }
        return lerp(i, i2, f);
    }

    public void apply(float f) {
        float fMin = Math.min(Math.max(f, 0.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this).width = lerpSz(this.from.width, this.to.width, fMin);
        ((ViewGroup.MarginLayoutParams) this).height = lerpSz(this.from.height, this.to.height, fMin);
        ViewGroup.LayoutParams layoutParams = this.from;
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (z) {
            ViewGroup.LayoutParams layoutParams2 = this.to;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                ((ViewGroup.MarginLayoutParams) this).topMargin = lerp(marginLayoutParams.topMargin, marginLayoutParams2.topMargin, fMin);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = lerp(marginLayoutParams.leftMargin, marginLayoutParams2.leftMargin, fMin);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = lerp(marginLayoutParams.rightMargin, marginLayoutParams2.rightMargin, fMin);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = lerp(marginLayoutParams.bottomMargin, marginLayoutParams2.bottomMargin, fMin);
                return;
            }
        }
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams3.topMargin;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams3.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams3.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams3.bottomMargin;
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.to;
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams4.topMargin;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams4.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams4.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams4.bottomMargin;
        }
    }
}
