package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ha1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f37314a;
    public final TextView[] f37315b;
    public final TextView[] f37316c;

    public ha1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f37314a = new TextView[i11];
        this.f37315b = new TextView[i11];
        this.f37316c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.y3.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f37314a[i14] = new TextView(context);
                this.f37315b[i14] = new TextView(context);
                this.f37316c[i14] = new TextView(context);
                this.f37314a[i14].setTypeface(AndroidUtilities.bold());
                this.f37314a[i14].setTextSize(1, 17.0f);
                this.f37316c[i14].setTextSize(1, 13.0f);
                this.f37316c[i14].setGravity(3);
                this.f37315b[i14].setTextSize(1, 13.0f);
                this.f37315b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f12.addView(this.f37314a[i14]);
                f12.addView(this.f37315b[i14]);
                f11.addView(f12);
                f11.addView(this.f37316c[i14]);
                f10.addView(f11, k7.c6.l(1.0f, -1, -2));
            }
            addView(f10, k7.c6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f37314a[i10].setText(str);
        this.f37315b[i10].setText(str2);
        this.f37316c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f37314a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.k6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                this.f37316c[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z6, false));
                TextView[] textViewArr2 = this.f37315b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(ja1 ja1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f37314a;
        textViewArr[0].setText(ja1Var.f37924b);
        textViewArr[1].setText(ja1Var.f37927f);
        textViewArr[2].setText(ja1Var.f37930j);
        textViewArr[3].setText(ja1Var.f37934n);
        TextView[] textViewArr2 = this.f37315b;
        textViewArr2[0].setText(ja1Var.f37925c);
        TextView textView = textViewArr2[0];
        if (ja1Var.d) {
            i10 = org.telegram.ui.ActionBar.k6.f22019x6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21878p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(ja1Var.f37928g);
        TextView textView2 = textViewArr2[1];
        if (ja1Var.h) {
            i11 = org.telegram.ui.ActionBar.k6.f22019x6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21878p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(ja1Var.f37931k);
        TextView textView3 = textViewArr2[2];
        if (ja1Var.f37932l) {
            i12 = org.telegram.ui.ActionBar.k6.f22019x6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21878p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(ja1Var.f37935o);
        TextView textView4 = textViewArr2[3];
        if (ja1Var.f37936p) {
            i13 = org.telegram.ui.ActionBar.k6.f22019x6;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f21878p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f37316c;
        textViewArr3[0].setText(ja1Var.f37923a);
        textViewArr3[1].setText(ja1Var.f37926e);
        textViewArr3[2].setText(ja1Var.f37929i);
        textViewArr3[3].setText(ja1Var.f37933m);
        b();
    }
}
