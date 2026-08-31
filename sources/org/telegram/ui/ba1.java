package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ba1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f35403a;
    public final TextView[] f35404b;
    public final TextView[] f35405c;

    public ba1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f35403a = new TextView[i11];
        this.f35404b = new TextView[i11];
        this.f35405c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.y3.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f35403a[i14] = new TextView(context);
                this.f35404b[i14] = new TextView(context);
                this.f35405c[i14] = new TextView(context);
                this.f35403a[i14].setTypeface(AndroidUtilities.bold());
                this.f35403a[i14].setTextSize(1, 17.0f);
                this.f35405c[i14].setTextSize(1, 13.0f);
                this.f35405c[i14].setGravity(3);
                this.f35404b[i14].setTextSize(1, 13.0f);
                this.f35404b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f12.addView(this.f35403a[i14]);
                f12.addView(this.f35404b[i14]);
                f11.addView(f12);
                f11.addView(this.f35405c[i14]);
                f10.addView(f11, k7.c6.l(1.0f, -1, -2));
            }
            addView(f10, k7.c6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f35403a[i10].setText(str);
        this.f35404b[i10].setText(str2);
        this.f35405c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f35403a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.k6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                this.f35405c[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22053z6, false));
                TextView[] textViewArr2 = this.f35404b;
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

    public void setData(da1 da1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f35403a;
        textViewArr[0].setText(da1Var.f36158b);
        textViewArr[1].setText(da1Var.f36161f);
        textViewArr[2].setText(da1Var.f36164j);
        textViewArr[3].setText(da1Var.f36168n);
        TextView[] textViewArr2 = this.f35404b;
        textViewArr2[0].setText(da1Var.f36159c);
        TextView textView = textViewArr2[0];
        if (da1Var.d) {
            i10 = org.telegram.ui.ActionBar.k6.f22017x6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21876p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(da1Var.f36162g);
        TextView textView2 = textViewArr2[1];
        if (da1Var.h) {
            i11 = org.telegram.ui.ActionBar.k6.f22017x6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21876p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(da1Var.f36165k);
        TextView textView3 = textViewArr2[2];
        if (da1Var.f36166l) {
            i12 = org.telegram.ui.ActionBar.k6.f22017x6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21876p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(da1Var.f36169o);
        TextView textView4 = textViewArr2[3];
        if (da1Var.f36170p) {
            i13 = org.telegram.ui.ActionBar.k6.f22017x6;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f21876p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f35405c;
        textViewArr3[0].setText(da1Var.f36157a);
        textViewArr3[1].setText(da1Var.f36160e);
        textViewArr3[2].setText(da1Var.f36163i);
        textViewArr3[3].setText(da1Var.f36167m);
        b();
    }
}
