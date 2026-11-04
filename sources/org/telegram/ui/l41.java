package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class l41 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView[] f47101a;
    public final TextView[] f47102b;
    public final TextView[] f47103c;

    public l41(Context context, int i3) {
        super(context);
        int i10 = i3 * 2;
        this.f47101a = new TextView[i10];
        this.f47102b = new TextView[i10];
        this.f47103c = new TextView[i10];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        for (int i11 = 0; i11 < i3; i11++) {
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                int i13 = (i11 * 2) + i12;
                this.f47101a[i13] = new TextView(context);
                this.f47102b[i13] = new TextView(context);
                this.f47103c[i13] = new TextView(context);
                this.f47101a[i13].setTypeface(org.telegram.messenger.g0.o());
                this.f47101a[i13].setTextSize(1, 17.0f);
                this.f47103c[i13].setTextSize(1, 13.0f);
                this.f47103c[i13].setGravity(3);
                this.f47102b[i13].setTextSize(1, 13.0f);
                this.f47102b[i13].setPadding(org.telegram.messenger.g0.L(4.0f), 0, 0, 0);
                f12.addView(this.f47101a[i13]);
                f12.addView(this.f47102b[i13]);
                f11.addView(f12);
                f11.addView(this.f47103c[i13]);
                f10.addView(f11, b8.mf.l(1.0f, -1, -2));
            }
            addView(f10, b8.mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i3, String str2, String str3) {
        this.f47101a[i3].setText(str);
        this.f47102b[i3].setText(str2);
        this.f47103c[i3].setText(str3);
        updateColors();
    }

    public void setData(n41 n41Var) {
        int i3;
        int i10;
        int i11;
        int i12;
        TextView[] textViewArr = this.f47101a;
        textViewArr[0].setText(n41Var.f47867b);
        textViewArr[1].setText(n41Var.f47870f);
        textViewArr[2].setText(n41Var.f47873j);
        textViewArr[3].setText(n41Var.f47877n);
        TextView[] textViewArr2 = this.f47102b;
        textViewArr2[0].setText(n41Var.f47868c);
        TextView textView = textViewArr2[0];
        if (n41Var.d) {
            i3 = org.telegram.ui.ActionBar.k6.f28254x6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        }
        textView.setTag(Integer.valueOf(i3));
        textViewArr2[1].setText(n41Var.f47871g);
        TextView textView2 = textViewArr2[1];
        if (n41Var.h) {
            i10 = org.telegram.ui.ActionBar.k6.f28254x6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f28102p7;
        }
        textView2.setTag(Integer.valueOf(i10));
        textViewArr2[2].setText(n41Var.f47874k);
        TextView textView3 = textViewArr2[2];
        if (n41Var.f47875l) {
            i11 = org.telegram.ui.ActionBar.k6.f28254x6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28102p7;
        }
        textView3.setTag(Integer.valueOf(i11));
        textViewArr2[3].setText(n41Var.f47878o);
        TextView textView4 = textViewArr2[3];
        if (n41Var.f47879p) {
            i12 = org.telegram.ui.ActionBar.k6.f28254x6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f28102p7;
        }
        textView4.setTag(Integer.valueOf(i12));
        TextView[] textViewArr3 = this.f47103c;
        textViewArr3[0].setText(n41Var.f47866a);
        textViewArr3[1].setText(n41Var.f47869e);
        textViewArr3[2].setText(n41Var.f47872i);
        textViewArr3[3].setText(n41Var.f47876m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f47101a;
        if (textViewArr3 != null && (textViewArr = this.f47102b) != null && (textViewArr2 = this.f47103c) != null) {
            for (int i3 = 0; i3 < textViewArr3.length; i3++) {
                TextView textView = textViewArr3[i3];
                int i10 = org.telegram.ui.ActionBar.k6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                textViewArr2[i3].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28290z6, false));
                Integer num = (Integer) textViewArr[i3].getTag();
                if (num != null) {
                    textViewArr[i3].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i3].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
