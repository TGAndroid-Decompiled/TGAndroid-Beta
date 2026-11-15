package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class e20 extends org.telegram.ui.ActionBar.u2 {
    public c5.l f34152m1;
    public b20 n1;
    public LinearLayout f34153o1;
    public TextView[] f34154p1;
    public float f34155q1;
    public int f34156r1;

    public static void I0(org.telegram.ui.d30 d30Var) {
        TextView textView;
        TextView[] textViewArr = d30Var.f34154p1;
        int i7 = d30Var.f34156r1;
        TextView textView2 = textViewArr[i7];
        if (i7 < textViewArr.length - 1) {
            textView = textViewArr[i7 + 1];
        } else {
            textView = null;
        }
        d30Var.f29682b.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (d30Var.f29682b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * d30Var.f34155q1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = d30Var.f34156r1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = d30Var.f34155q1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = d30Var.f34155q1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        d30Var.f34153o1.setTranslationX(measuredWidth2);
        d30Var.n1.invalidate();
    }
}
