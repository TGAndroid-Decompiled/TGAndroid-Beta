package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class d40 extends org.telegram.ui.ActionBar.e3 {
    public z4.g f25426b;
    public a40 f25427c;
    public LinearLayout d;
    public TextView[] f25428e;
    public float f25429f;
    public int h;

    public static void o(org.telegram.ui.f50 f50Var) {
        TextView textView;
        TextView[] textViewArr = f50Var.f25428e;
        int i10 = f50Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        f50Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (f50Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * f50Var.f25429f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = f50Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = f50Var.f25429f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = f50Var.f25429f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        f50Var.d.setTranslationX(measuredWidth2);
        f50Var.f25427c.invalidate();
    }
}
