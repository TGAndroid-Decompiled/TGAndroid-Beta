package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class n91 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView[] f39785a;
    public final TextView[] f39786b;
    public final TextView[] f39787c;

    public n91(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f39785a = new TextView[i11];
        this.f39786b = new TextView[i11];
        this.f39787c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e = org.telegram.messenger.tl.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e7 = org.telegram.messenger.tl.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.tl.e(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f39785a[i14] = new TextView(context);
                this.f39786b[i14] = new TextView(context);
                this.f39787c[i14] = new TextView(context);
                this.f39785a[i14].setTypeface(AndroidUtilities.bold());
                this.f39785a[i14].setTextSize(1, 17.0f);
                this.f39787c[i14].setTextSize(1, 13.0f);
                this.f39787c[i14].setGravity(3);
                this.f39786b[i14].setTextSize(1, 13.0f);
                this.f39786b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                e10.addView(this.f39785a[i14]);
                e10.addView(this.f39786b[i14]);
                e7.addView(e10);
                e7.addView(this.f39787c[i14]);
                e.addView(e7, w7.z5.l(1.0f, -1, -2));
            }
            addView(e, w7.z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f39785a[i10].setText(str);
        this.f39786b[i10].setText(str2);
        this.f39787c[i10].setText(str3);
        updateColors();
    }

    public void setData(p91 p91Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f39785a;
        textViewArr[0].setText(p91Var.f40402b);
        textViewArr[1].setText(p91Var.f40404f);
        textViewArr[2].setText(p91Var.f40407j);
        textViewArr[3].setText(p91Var.f40411n);
        TextView[] textViewArr2 = this.f39786b;
        textViewArr2[0].setText(p91Var.f40403c);
        TextView textView = textViewArr2[0];
        if (p91Var.d) {
            i10 = org.telegram.ui.ActionBar.k6.f21554x6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21405p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(p91Var.f40405g);
        TextView textView2 = textViewArr2[1];
        if (p91Var.h) {
            i11 = org.telegram.ui.ActionBar.k6.f21554x6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21405p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(p91Var.f40408k);
        TextView textView3 = textViewArr2[2];
        if (p91Var.f40409l) {
            i12 = org.telegram.ui.ActionBar.k6.f21554x6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21405p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(p91Var.f40412o);
        TextView textView4 = textViewArr2[3];
        if (p91Var.f40413p) {
            i13 = org.telegram.ui.ActionBar.k6.f21554x6;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f21405p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f39787c;
        textViewArr3[0].setText(p91Var.f40401a);
        textViewArr3[1].setText(p91Var.e);
        textViewArr3[2].setText(p91Var.f40406i);
        textViewArr3[3].setText(p91Var.f40410m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f39785a;
        if (textViewArr3 != null && (textViewArr = this.f39786b) != null && (textViewArr2 = this.f39787c) != null) {
            for (int i10 = 0; i10 < textViewArr3.length; i10++) {
                TextView textView = textViewArr3[i10];
                int i11 = org.telegram.ui.ActionBar.k6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21589z6, false));
                Integer num = (Integer) textViewArr[i10].getTag();
                if (num != null) {
                    textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
