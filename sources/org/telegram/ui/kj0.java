package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f39351a;
    public final TextView[] f39352b;
    public final lj0 f39353c;

    public kj0(lj0 lj0Var, Context context) {
        super(context);
        float f7;
        this.f39353c = lj0Var;
        this.f39351a = new TextView[4];
        this.f39352b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout e10 = org.telegram.messenger.bi.e(context, 1);
                LinearLayout e11 = org.telegram.messenger.bi.e(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f39351a[i12] = new TextView(context);
                this.f39352b[i12] = new TextView(context);
                this.f39351a[i12].setTypeface(AndroidUtilities.bold());
                this.f39351a[i12].setTextSize(1, 17.0f);
                this.f39352b[i12].setTextSize(1, 13.0f);
                this.f39352b[i12].setGravity(3);
                e11.addView(this.f39351a[i12]);
                e10.addView(e11);
                e10.addView(this.f39352b[i12]);
                e7.addView(e10, w7.x5.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(e7, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 0));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f39351a[i10];
            int i11 = org.telegram.ui.ActionBar.i6.G6;
            lj0 lj0Var = this.f39353c;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, lj0Var.getResourceProvider()));
            this.f39352b[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, lj0Var.getResourceProvider()));
        }
    }
}
