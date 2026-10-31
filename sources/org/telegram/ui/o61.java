package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class o61 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView[] f40155a;
    public final TextView[] f40156b;
    public final TextView[] f40157c;

    public o61(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f40155a = new TextView[i11];
        this.f40156b = new TextView[i11];
        this.f40157c = new TextView[i11];
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.m5.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f40155a[i14] = new TextView(context);
                this.f40156b[i14] = new TextView(context);
                this.f40157c[i14] = new TextView(context);
                this.f40155a[i14].setTypeface(org.telegram.messenger.i0.o());
                this.f40155a[i14].setTextSize(1, 17.0f);
                this.f40157c[i14].setTextSize(1, 13.0f);
                this.f40157c[i14].setGravity(3);
                this.f40156b[i14].setTextSize(1, 13.0f);
                this.f40156b[i14].setPadding(org.telegram.messenger.i0.L(4.0f), 0, 0, 0);
                f11.addView(this.f40155a[i14]);
                f11.addView(this.f40156b[i14]);
                f10.addView(f11);
                f10.addView(this.f40157c[i14]);
                f7.addView(f10, w7.b6.l(1.0f, -1, -2));
            }
            addView(f7, w7.b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f40155a[i10].setText(str);
        this.f40156b[i10].setText(str2);
        this.f40157c[i10].setText(str3);
        updateColors();
    }

    public void setData(q61 q61Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f40155a;
        textViewArr[0].setText(q61Var.f40878b);
        textViewArr[1].setText(q61Var.f40880f);
        textViewArr[2].setText(q61Var.f40883j);
        textViewArr[3].setText(q61Var.f40887n);
        TextView[] textViewArr2 = this.f40156b;
        textViewArr2[0].setText(q61Var.f40879c);
        TextView textView = textViewArr2[0];
        if (q61Var.d) {
            i10 = org.telegram.ui.ActionBar.t6.f21295x6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21153p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(q61Var.f40881g);
        TextView textView2 = textViewArr2[1];
        if (q61Var.h) {
            i11 = org.telegram.ui.ActionBar.t6.f21295x6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21153p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(q61Var.f40884k);
        TextView textView3 = textViewArr2[2];
        if (q61Var.f40885l) {
            i12 = org.telegram.ui.ActionBar.t6.f21295x6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.f21153p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(q61Var.f40888o);
        TextView textView4 = textViewArr2[3];
        if (q61Var.f40889p) {
            i13 = org.telegram.ui.ActionBar.t6.f21295x6;
        } else {
            i13 = org.telegram.ui.ActionBar.t6.f21153p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f40157c;
        textViewArr3[0].setText(q61Var.f40877a);
        textViewArr3[1].setText(q61Var.e);
        textViewArr3[2].setText(q61Var.f40882i);
        textViewArr3[3].setText(q61Var.f40886m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f40155a;
        if (textViewArr3 != null && (textViewArr = this.f40156b) != null && (textViewArr2 = this.f40157c) != null) {
            for (int i10 = 0; i10 < textViewArr3.length; i10++) {
                TextView textView = textViewArr3[i10];
                int i11 = org.telegram.ui.ActionBar.t6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21330z6, false));
                Integer num = (Integer) textViewArr[i10].getTag();
                if (num != null) {
                    textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
