package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class lj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f39770a;
    public final TextView[] f39771b;
    public final mj0 f39772c;

    public lj0(mj0 mj0Var, Context context) {
        super(context);
        float f7;
        this.f39772c = mj0Var;
        this.f39770a = new TextView[4];
        this.f39771b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout e7 = org.telegram.messenger.am.e(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout e10 = org.telegram.messenger.am.e(context, 1);
                LinearLayout e11 = org.telegram.messenger.am.e(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f39770a[i12] = new TextView(context);
                this.f39771b[i12] = new TextView(context);
                this.f39770a[i12].setTypeface(AndroidUtilities.bold());
                this.f39770a[i12].setTextSize(1, 17.0f);
                this.f39771b[i12].setTextSize(1, 13.0f);
                this.f39771b[i12].setGravity(3);
                e11.addView(this.f39770a[i12]);
                e10.addView(e11);
                e10.addView(this.f39771b[i12]);
                e7.addView(e10, w7.w5.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(e7, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 0));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f39770a[i10];
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            mj0 mj0Var = this.f39772c;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, mj0Var.getResourceProvider()));
            this.f39771b[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, mj0Var.getResourceProvider()));
        }
    }
}
