package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f39243a;
    public final TextView[] f39244b;
    public final qj0 f39245c;

    public pj0(qj0 qj0Var, Context context) {
        super(context);
        float f7;
        this.f39245c = qj0Var;
        this.f39243a = new TextView[4];
        this.f39244b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout e = org.telegram.messenger.yh.e(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout e7 = org.telegram.messenger.yh.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.yh.e(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f39243a[i12] = new TextView(context);
                this.f39244b[i12] = new TextView(context);
                this.f39243a[i12].setTypeface(AndroidUtilities.bold());
                this.f39243a[i12].setTextSize(1, 17.0f);
                this.f39244b[i12].setTextSize(1, 13.0f);
                this.f39244b[i12].setGravity(3);
                e10.addView(this.f39243a[i12]);
                e7.addView(e10);
                e7.addView(this.f39244b[i12]);
                e.addView(e7, w7.a6.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(e, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 0));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f39243a[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            qj0 qj0Var = this.f39245c;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, qj0Var.getResourceProvider()));
            this.f39244b[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, qj0Var.getResourceProvider()));
        }
    }
}
