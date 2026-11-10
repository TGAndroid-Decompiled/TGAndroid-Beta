package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class b20 extends org.telegram.ui.ActionBar.w2 {
    public c5.k l1;
    public y10 f32089m1;
    public LinearLayout n1;
    public TextView[] f32090o1;
    public float f32091p1;
    public int f32092q1;

    public static void I0(org.telegram.ui.f30 f30Var) {
        TextView textView;
        TextView[] textViewArr = f30Var.f32090o1;
        int i7 = f30Var.f32092q1;
        TextView textView2 = textViewArr[i7];
        if (i7 < textViewArr.length - 1) {
            textView = textViewArr[i7 + 1];
        } else {
            textView = null;
        }
        f30Var.f28672b.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (f30Var.f28672b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * f30Var.f32091p1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = f30Var.f32092q1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = f30Var.f32091p1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = f30Var.f32091p1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        f30Var.n1.setTranslationX(measuredWidth2);
        f30Var.f32089m1.invalidate();
    }
}
