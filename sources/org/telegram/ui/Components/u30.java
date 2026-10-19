package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class u30 extends org.telegram.ui.ActionBar.f3 {
    public z4.g f30875b;
    public r30 f30876c;
    public LinearLayout d;
    public TextView[] e;
    public float f30877f;
    public int h;

    public static void n(org.telegram.ui.p40 p40Var) {
        TextView textView;
        TextView[] textViewArr = p40Var.e;
        int i10 = p40Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        p40Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (p40Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * p40Var.f30877f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = p40Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = p40Var.f30877f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = p40Var.f30877f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        p40Var.d.setTranslationX(measuredWidth2);
        p40Var.f30876c.invalidate();
    }
}
