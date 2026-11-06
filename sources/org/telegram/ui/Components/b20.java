package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class b20 extends org.telegram.ui.ActionBar.v2 {
    public c5.k f31984i1;
    public y10 f31985j1;
    public LinearLayout f31986k1;
    public TextView[] l1;
    public float f31987m1;
    public int n1;

    public static void I0(org.telegram.ui.c30 c30Var) {
        TextView textView;
        TextView[] textViewArr = c30Var.l1;
        int i7 = c30Var.n1;
        TextView textView2 = textViewArr[i7];
        if (i7 < textViewArr.length - 1) {
            textView = textViewArr[i7 + 1];
        } else {
            textView = null;
        }
        c30Var.f28615b.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (c30Var.f28615b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * c30Var.f31987m1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = c30Var.n1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = c30Var.f31987m1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = c30Var.f31987m1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        c30Var.f31986k1.setTranslationX(measuredWidth2);
        c30Var.f31985j1.invalidate();
    }
}
