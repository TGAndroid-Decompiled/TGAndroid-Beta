package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m91 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f40358a;
    public final TextView[] f40359b;
    public final TextView[] f40360c;

    public m91(Context context, int i9) {
        super(context);
        int i10 = i9 * 2;
        this.f40358a = new TextView[i10];
        this.f40359b = new TextView[i10];
        this.f40360c = new TextView[i10];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i11 = 0; i11 < i9; i11++) {
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout f11 = org.telegram.messenger.ll.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.ll.f(context, 0);
                int i13 = (i11 * 2) + i12;
                this.f40358a[i13] = new TextView(context);
                this.f40359b[i13] = new TextView(context);
                this.f40360c[i13] = new TextView(context);
                this.f40358a[i13].setTypeface(AndroidUtilities.bold());
                this.f40358a[i13].setTextSize(1, 17.0f);
                this.f40360c[i13].setTextSize(1, 13.0f);
                this.f40360c[i13].setGravity(3);
                this.f40359b[i13].setTextSize(1, 13.0f);
                this.f40359b[i13].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f12.addView(this.f40358a[i13]);
                f12.addView(this.f40359b[i13]);
                f11.addView(f12);
                f11.addView(this.f40360c[i13]);
                f10.addView(f11, g7.e6.l(1.0f, -1, -2));
            }
            addView(f10, g7.e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i9, String str2, String str3) {
        this.f40358a[i9].setText(str);
        this.f40359b[i9].setText(str2);
        this.f40360c[i9].setText(str3);
        b();
    }

    public final void b() {
        int i9 = 0;
        while (true) {
            TextView[] textViewArr = this.f40358a;
            if (i9 < textViewArr.length) {
                TextView textView = textViewArr[i9];
                int i10 = org.telegram.ui.ActionBar.f6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                this.f40360c[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false));
                TextView[] textViewArr2 = this.f40359b;
                Integer num = (Integer) textViewArr2[i9].getTag();
                if (num != null) {
                    textViewArr2[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, num.intValue(), false));
                } else {
                    textViewArr2[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public void setData(o91 o91Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        TextView[] textViewArr = this.f40358a;
        textViewArr[0].setText(o91Var.f41018b);
        textViewArr[1].setText(o91Var.f41021f);
        textViewArr[2].setText(o91Var.f41024j);
        textViewArr[3].setText(o91Var.f41028n);
        TextView[] textViewArr2 = this.f40359b;
        textViewArr2[0].setText(o91Var.f41019c);
        TextView textView = textViewArr2[0];
        if (o91Var.d) {
            i9 = org.telegram.ui.ActionBar.f6.f23351x6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23212p7;
        }
        textView.setTag(Integer.valueOf(i9));
        textViewArr2[1].setText(o91Var.f41022g);
        TextView textView2 = textViewArr2[1];
        if (o91Var.h) {
            i10 = org.telegram.ui.ActionBar.f6.f23351x6;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23212p7;
        }
        textView2.setTag(Integer.valueOf(i10));
        textViewArr2[2].setText(o91Var.f41025k);
        TextView textView3 = textViewArr2[2];
        if (o91Var.f41026l) {
            i11 = org.telegram.ui.ActionBar.f6.f23351x6;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.f23212p7;
        }
        textView3.setTag(Integer.valueOf(i11));
        textViewArr2[3].setText(o91Var.f41029o);
        TextView textView4 = textViewArr2[3];
        if (o91Var.f41030p) {
            i12 = org.telegram.ui.ActionBar.f6.f23351x6;
        } else {
            i12 = org.telegram.ui.ActionBar.f6.f23212p7;
        }
        textView4.setTag(Integer.valueOf(i12));
        TextView[] textViewArr3 = this.f40360c;
        textViewArr3[0].setText(o91Var.f41017a);
        textViewArr3[1].setText(o91Var.f41020e);
        textViewArr3[2].setText(o91Var.f41023i);
        textViewArr3[3].setText(o91Var.f41027m);
        b();
    }
}
