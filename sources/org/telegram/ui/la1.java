package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class la1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f35304a;
    public final TextView[] f35305b;
    public final TextView[] f35306c;

    public la1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f35304a = new TextView[i11];
        this.f35305b = new TextView[i11];
        this.f35306c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.qk.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.qk.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.qk.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f35304a[i14] = new TextView(context);
                this.f35305b[i14] = new TextView(context);
                this.f35306c[i14] = new TextView(context);
                this.f35304a[i14].setTypeface(AndroidUtilities.bold());
                this.f35304a[i14].setTextSize(1, 17.0f);
                this.f35306c[i14].setTextSize(1, 13.0f);
                this.f35306c[i14].setGravity(3);
                this.f35305b[i14].setTextSize(1, 13.0f);
                this.f35305b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f11.addView(this.f35304a[i14]);
                f11.addView(this.f35305b[i14]);
                f10.addView(f11);
                f10.addView(this.f35306c[i14]);
                f7.addView(f10, w7.y5.l(1.0f, -1, -2));
            }
            addView(f7, w7.y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f35304a[i10].setText(str);
        this.f35305b[i10].setText(str2);
        this.f35306c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f35304a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.i6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                this.f35306c[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19461z6, false));
                TextView[] textViewArr2 = this.f35305b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(na1 na1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f35304a;
        textViewArr[0].setText(na1Var.f35911b);
        textViewArr[1].setText(na1Var.f35913f);
        textViewArr[2].setText(na1Var.f35916j);
        textViewArr[3].setText(na1Var.f35920n);
        TextView[] textViewArr2 = this.f35305b;
        textViewArr2[0].setText(na1Var.f35912c);
        TextView textView = textViewArr2[0];
        if (na1Var.d) {
            i10 = org.telegram.ui.ActionBar.i6.f19425x6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f19278p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(na1Var.f35914g);
        TextView textView2 = textViewArr2[1];
        if (na1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f19425x6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f19278p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(na1Var.f35917k);
        TextView textView3 = textViewArr2[2];
        if (na1Var.f35918l) {
            i12 = org.telegram.ui.ActionBar.i6.f19425x6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.f19278p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(na1Var.f35921o);
        TextView textView4 = textViewArr2[3];
        if (na1Var.f35922p) {
            i13 = org.telegram.ui.ActionBar.i6.f19425x6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f19278p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f35306c;
        textViewArr3[0].setText(na1Var.f35910a);
        textViewArr3[1].setText(na1Var.e);
        textViewArr3[2].setText(na1Var.f35915i);
        textViewArr3[3].setText(na1Var.f35919m);
        b();
    }
}
