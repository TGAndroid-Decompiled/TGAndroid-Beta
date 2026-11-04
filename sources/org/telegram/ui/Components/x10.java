package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class x10 extends org.telegram.ui.ActionBar.t2 {
    public b5.l f40192j1;
    public u10 k1;
    public LinearLayout f40193l1;
    public TextView[] m1;
    public float f40194n1;
    public int f40195o1;

    public static void I0(org.telegram.ui.x20 x20Var) {
        TextView textView;
        TextView[] textViewArr = x20Var.m1;
        int i3 = x20Var.f40195o1;
        TextView textView2 = textViewArr[i3];
        if (i3 < textViewArr.length - 1) {
            textView = textViewArr[i3 + 1];
        } else {
            textView = null;
        }
        x20Var.f28586b.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (x20Var.f28586b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * x20Var.f40194n1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = x20Var.f40195o1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = x20Var.f40194n1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = x20Var.f40194n1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        x20Var.f40193l1.setTranslationX(measuredWidth2);
        x20Var.k1.invalidate();
    }
}
