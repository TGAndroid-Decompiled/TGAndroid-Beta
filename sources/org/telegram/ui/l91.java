package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l91 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f38836a;
    public final TextView[] f38837b;
    public final TextView[] f38838c;

    public l91(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f38836a = new TextView[i11];
        this.f38837b = new TextView[i11];
        this.f38838c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e = org.telegram.messenger.wh.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e7 = org.telegram.messenger.wh.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.wh.e(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f38836a[i14] = new TextView(context);
                this.f38837b[i14] = new TextView(context);
                this.f38838c[i14] = new TextView(context);
                this.f38836a[i14].setTypeface(AndroidUtilities.bold());
                this.f38836a[i14].setTextSize(1, 17.0f);
                this.f38838c[i14].setTextSize(1, 13.0f);
                this.f38838c[i14].setGravity(3);
                this.f38837b[i14].setTextSize(1, 13.0f);
                this.f38837b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                e10.addView(this.f38836a[i14]);
                e10.addView(this.f38837b[i14]);
                e7.addView(e10);
                e7.addView(this.f38838c[i14]);
                e.addView(e7, w7.z5.l(1.0f, -1, -2));
            }
            addView(e, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 0));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f38836a[i10].setText(str);
        this.f38837b[i10].setText(str2);
        this.f38838c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f38836a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.h6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                this.f38838c[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21391z6, false));
                TextView[] textViewArr2 = this.f38837b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(n91 n91Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f38836a;
        textViewArr[0].setText(n91Var.f39389b);
        textViewArr[1].setText(n91Var.f39391f);
        textViewArr[2].setText(n91Var.f39394j);
        textViewArr[3].setText(n91Var.f39398n);
        TextView[] textViewArr2 = this.f38837b;
        textViewArr2[0].setText(n91Var.f39390c);
        TextView textView = textViewArr2[0];
        if (n91Var.d) {
            i10 = org.telegram.ui.ActionBar.h6.f21356x6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21207p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(n91Var.f39392g);
        TextView textView2 = textViewArr2[1];
        if (n91Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f21356x6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f21207p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(n91Var.f39395k);
        TextView textView3 = textViewArr2[2];
        if (n91Var.f39396l) {
            i12 = org.telegram.ui.ActionBar.h6.f21356x6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f21207p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(n91Var.f39399o);
        TextView textView4 = textViewArr2[3];
        if (n91Var.f39400p) {
            i13 = org.telegram.ui.ActionBar.h6.f21356x6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f21207p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f38838c;
        textViewArr3[0].setText(n91Var.f39388a);
        textViewArr3[1].setText(n91Var.e);
        textViewArr3[2].setText(n91Var.f39393i);
        textViewArr3[3].setText(n91Var.f39397m);
        b();
    }
}
