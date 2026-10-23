package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class u30 extends org.telegram.ui.ActionBar.h3 {
    public z4.h f31069b;
    public r30 f31070c;
    public LinearLayout d;
    public TextView[] e;
    public float f31071f;
    public int h;

    public static void m(org.telegram.ui.s40 s40Var) {
        TextView textView;
        TextView[] textViewArr = s40Var.e;
        int i10 = s40Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        s40Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (s40Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * s40Var.f31071f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = s40Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = s40Var.f31071f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = s40Var.f31071f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        s40Var.d.setTranslationX(measuredWidth2);
        s40Var.f31070c.invalidate();
    }
}
