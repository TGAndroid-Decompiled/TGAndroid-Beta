package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class m61 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView[] f39446a;
    public final TextView[] f39447b;
    public final TextView[] f39448c;

    public m61(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f39446a = new TextView[i11];
        this.f39447b = new TextView[i11];
        this.f39448c = new TextView[i11];
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.m5.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f39446a[i14] = new TextView(context);
                this.f39447b[i14] = new TextView(context);
                this.f39448c[i14] = new TextView(context);
                this.f39446a[i14].setTypeface(org.telegram.messenger.i0.o());
                this.f39446a[i14].setTextSize(1, 17.0f);
                this.f39448c[i14].setTextSize(1, 13.0f);
                this.f39448c[i14].setGravity(3);
                this.f39447b[i14].setTextSize(1, 13.0f);
                this.f39447b[i14].setPadding(org.telegram.messenger.i0.L(4.0f), 0, 0, 0);
                f11.addView(this.f39446a[i14]);
                f11.addView(this.f39447b[i14]);
                f10.addView(f11);
                f10.addView(this.f39448c[i14]);
                f7.addView(f10, w7.b6.l(1.0f, -1, -2));
            }
            addView(f7, w7.b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f39446a[i10].setText(str);
        this.f39447b[i10].setText(str2);
        this.f39448c[i10].setText(str3);
        updateColors();
    }

    public void setData(o61 o61Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f39446a;
        textViewArr[0].setText(o61Var.f40053b);
        textViewArr[1].setText(o61Var.f40055f);
        textViewArr[2].setText(o61Var.f40058j);
        textViewArr[3].setText(o61Var.f40062n);
        TextView[] textViewArr2 = this.f39447b;
        textViewArr2[0].setText(o61Var.f40054c);
        TextView textView = textViewArr2[0];
        if (o61Var.d) {
            i10 = org.telegram.ui.ActionBar.t6.f21296x6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21154p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(o61Var.f40056g);
        TextView textView2 = textViewArr2[1];
        if (o61Var.h) {
            i11 = org.telegram.ui.ActionBar.t6.f21296x6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21154p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(o61Var.f40059k);
        TextView textView3 = textViewArr2[2];
        if (o61Var.f40060l) {
            i12 = org.telegram.ui.ActionBar.t6.f21296x6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.f21154p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(o61Var.f40063o);
        TextView textView4 = textViewArr2[3];
        if (o61Var.f40064p) {
            i13 = org.telegram.ui.ActionBar.t6.f21296x6;
        } else {
            i13 = org.telegram.ui.ActionBar.t6.f21154p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f39448c;
        textViewArr3[0].setText(o61Var.f40052a);
        textViewArr3[1].setText(o61Var.e);
        textViewArr3[2].setText(o61Var.f40057i);
        textViewArr3[3].setText(o61Var.f40061m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f39446a;
        if (textViewArr3 != null && (textViewArr = this.f39447b) != null && (textViewArr2 = this.f39448c) != null) {
            for (int i10 = 0; i10 < textViewArr3.length; i10++) {
                TextView textView = textViewArr3[i10];
                int i11 = org.telegram.ui.ActionBar.t6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21331z6, false));
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
