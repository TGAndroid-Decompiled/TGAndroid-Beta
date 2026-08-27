package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class k91 extends LinearLayout {
    public static final int d = 0;

    public final TextView[] f39666a;

    public final TextView[] f39667b;

    public final TextView[] f39668c;

    public k91(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f39666a = new TextView[i11];
        this.f39667b = new TextView[i11];
        this.f39668c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context, 1);
                LinearLayout linearLayoutG3 = org.telegram.messenger.y1.g(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f39666a[i14] = new TextView(context);
                this.f39667b[i14] = new TextView(context);
                this.f39668c[i14] = new TextView(context);
                this.f39666a[i14].setTypeface(AndroidUtilities.bold());
                this.f39666a[i14].setTextSize(1, 17.0f);
                this.f39668c[i14].setTextSize(1, 13.0f);
                this.f39668c[i14].setGravity(3);
                this.f39667b[i14].setTextSize(1, 13.0f);
                this.f39667b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                linearLayoutG3.addView(this.f39666a[i14]);
                linearLayoutG3.addView(this.f39667b[i14]);
                linearLayoutG2.addView(linearLayoutG3);
                linearLayoutG2.addView(this.f39668c[i14]);
                linearLayoutG.addView(linearLayoutG2, h7.z5.l(1.0f, -1, -2));
            }
            addView(linearLayoutG, h7.z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f39666a[i10].setText(str);
        this.f39667b[i10].setText(str2);
        this.f39668c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f39666a;
            if (i10 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.f39668c[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
            TextView[] textViewArr2 = this.f39667b;
            Integer num = (Integer) textViewArr2[i10].getTag();
            if (num != null) {
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, num.intValue(), false));
            } else {
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            }
            i10++;
        }
    }

    public void setData(m91 m91Var) {
        TextView[] textViewArr = this.f39666a;
        textViewArr[0].setText(m91Var.f40407b);
        textViewArr[1].setText(m91Var.f40410f);
        textViewArr[2].setText(m91Var.f40413j);
        textViewArr[3].setText(m91Var.f40417n);
        TextView[] textViewArr2 = this.f39667b;
        textViewArr2[0].setText(m91Var.f40408c);
        textViewArr2[0].setTag(Integer.valueOf(m91Var.d ? org.telegram.ui.ActionBar.g6.f23406x6 : org.telegram.ui.ActionBar.g6.f23269p7));
        textViewArr2[1].setText(m91Var.f40411g);
        textViewArr2[1].setTag(Integer.valueOf(m91Var.h ? org.telegram.ui.ActionBar.g6.f23406x6 : org.telegram.ui.ActionBar.g6.f23269p7));
        textViewArr2[2].setText(m91Var.f40414k);
        textViewArr2[2].setTag(Integer.valueOf(m91Var.f40415l ? org.telegram.ui.ActionBar.g6.f23406x6 : org.telegram.ui.ActionBar.g6.f23269p7));
        textViewArr2[3].setText(m91Var.f40418o);
        textViewArr2[3].setTag(Integer.valueOf(m91Var.f40419p ? org.telegram.ui.ActionBar.g6.f23406x6 : org.telegram.ui.ActionBar.g6.f23269p7));
        TextView[] textViewArr3 = this.f39668c;
        textViewArr3[0].setText(m91Var.f40406a);
        textViewArr3[1].setText(m91Var.f40409e);
        textViewArr3[2].setText(m91Var.f40412i);
        textViewArr3[3].setText(m91Var.f40416m);
        b();
    }
}
