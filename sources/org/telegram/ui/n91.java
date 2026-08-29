package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n91 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f40757a;
    public final TextView[] f40758b;
    public final TextView[] f40759c;

    public n91(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f40757a = new TextView[i11];
        this.f40758b = new TextView[i11];
        this.f40759c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout g11 = org.telegram.messenger.x3.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.x3.g(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f40757a[i14] = new TextView(context);
                this.f40758b[i14] = new TextView(context);
                this.f40759c[i14] = new TextView(context);
                this.f40757a[i14].setTypeface(AndroidUtilities.bold());
                this.f40757a[i14].setTextSize(1, 17.0f);
                this.f40759c[i14].setTextSize(1, 13.0f);
                this.f40759c[i14].setGravity(3);
                this.f40758b[i14].setTextSize(1, 13.0f);
                this.f40758b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                g12.addView(this.f40757a[i14]);
                g12.addView(this.f40758b[i14]);
                g11.addView(g12);
                g11.addView(this.f40759c[i14]);
                g10.addView(g11, i7.f6.l(1.0f, -1, -2));
            }
            addView(g10, i7.f6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f40757a[i10].setText(str);
        this.f40758b[i10].setText(str2);
        this.f40759c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f40757a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                this.f40759c[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false));
                TextView[] textViewArr2 = this.f40758b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(p91 p91Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f40757a;
        textViewArr[0].setText(p91Var.f41330b);
        textViewArr[1].setText(p91Var.f41333f);
        textViewArr[2].setText(p91Var.f41336j);
        textViewArr[3].setText(p91Var.f41340n);
        TextView[] textViewArr2 = this.f40758b;
        textViewArr2[0].setText(p91Var.f41331c);
        TextView textView = textViewArr2[0];
        if (p91Var.d) {
            i10 = org.telegram.ui.ActionBar.g6.f23418x6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23279p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(p91Var.f41334g);
        TextView textView2 = textViewArr2[1];
        if (p91Var.h) {
            i11 = org.telegram.ui.ActionBar.g6.f23418x6;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f23279p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(p91Var.f41337k);
        TextView textView3 = textViewArr2[2];
        if (p91Var.f41338l) {
            i12 = org.telegram.ui.ActionBar.g6.f23418x6;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.f23279p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(p91Var.f41341o);
        TextView textView4 = textViewArr2[3];
        if (p91Var.f41342p) {
            i13 = org.telegram.ui.ActionBar.g6.f23418x6;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.f23279p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f40759c;
        textViewArr3[0].setText(p91Var.f41329a);
        textViewArr3[1].setText(p91Var.f41332e);
        textViewArr3[2].setText(p91Var.f41335i);
        textViewArr3[3].setText(p91Var.f41339m);
        b();
    }
}
