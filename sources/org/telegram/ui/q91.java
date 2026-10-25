package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class q91 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView[] f42778a;
    public final TextView[] f42779b;
    public final TextView[] f42780c;

    public q91(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f42778a = new TextView[i11];
        this.f42779b = new TextView[i11];
        this.f42780c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout d = org.telegram.messenger.vh.d(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout d10 = org.telegram.messenger.vh.d(context, 1);
                LinearLayout d11 = org.telegram.messenger.vh.d(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f42778a[i14] = new TextView(context);
                this.f42779b[i14] = new TextView(context);
                this.f42780c[i14] = new TextView(context);
                this.f42778a[i14].setTypeface(AndroidUtilities.bold());
                this.f42778a[i14].setTextSize(1, 17.0f);
                this.f42780c[i14].setTextSize(1, 13.0f);
                this.f42780c[i14].setGravity(3);
                this.f42779b[i14].setTextSize(1, 13.0f);
                this.f42779b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                d11.addView(this.f42778a[i14]);
                d11.addView(this.f42779b[i14]);
                d10.addView(d11);
                d10.addView(this.f42780c[i14]);
                d.addView(d10, org.telegram.ui.Components.gb1.p(1.0f, -1, -2));
            }
            addView(d, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f42778a[i10].setText(str);
        this.f42779b[i10].setText(str2);
        this.f42780c[i10].setText(str3);
        updateColors();
    }

    public void setData(s91 s91Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f42778a;
        textViewArr[0].setText(s91Var.f43418b);
        textViewArr[1].setText(s91Var.f43420f);
        textViewArr[2].setText(s91Var.f43423j);
        textViewArr[3].setText(s91Var.f43427n);
        TextView[] textViewArr2 = this.f42779b;
        textViewArr2[0].setText(s91Var.f43419c);
        TextView textView = textViewArr2[0];
        if (s91Var.d) {
            i10 = org.telegram.ui.ActionBar.y6.f23729x6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23579p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(s91Var.f43421g);
        TextView textView2 = textViewArr2[1];
        if (s91Var.h) {
            i11 = org.telegram.ui.ActionBar.y6.f23729x6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23579p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(s91Var.f43424k);
        TextView textView3 = textViewArr2[2];
        if (s91Var.f43425l) {
            i12 = org.telegram.ui.ActionBar.y6.f23729x6;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.f23579p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(s91Var.f43428o);
        TextView textView4 = textViewArr2[3];
        if (s91Var.f43429p) {
            i13 = org.telegram.ui.ActionBar.y6.f23729x6;
        } else {
            i13 = org.telegram.ui.ActionBar.y6.f23579p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f42780c;
        textViewArr3[0].setText(s91Var.f43417a);
        textViewArr3[1].setText(s91Var.e);
        textViewArr3[2].setText(s91Var.f43422i);
        textViewArr3[3].setText(s91Var.f43426m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f42778a;
        if (textViewArr3 != null && (textViewArr = this.f42779b) != null && (textViewArr2 = this.f42780c) != null) {
            for (int i10 = 0; i10 < textViewArr3.length; i10++) {
                TextView textView = textViewArr3[i10];
                int i11 = org.telegram.ui.ActionBar.y6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23765z6, false));
                Integer num = (Integer) textViewArr[i10].getTag();
                if (num != null) {
                    textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i10].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
