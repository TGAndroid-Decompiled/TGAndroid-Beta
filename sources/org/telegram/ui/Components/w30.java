package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class w30 extends org.telegram.ui.ActionBar.k3 {
    public a5.m f34349b;
    public t30 f34350c;
    public LinearLayout d;
    public TextView[] e;
    public float f34351f;
    public int h;

    public static void m(org.telegram.ui.u40 u40Var) {
        TextView textView;
        TextView[] textViewArr = u40Var.e;
        int i10 = u40Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        u40Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (u40Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * u40Var.f34351f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = u40Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = u40Var.f34351f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = u40Var.f34351f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        u40Var.d.setTranslationX(measuredWidth2);
        u40Var.f34350c.invalidate();
    }
}
