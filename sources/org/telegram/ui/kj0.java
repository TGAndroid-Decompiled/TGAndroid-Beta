package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f38078a;
    public final TextView[] f38079b;
    public final lj0 f38080c;

    public kj0(lj0 lj0Var, Context context) {
        super(context);
        float f7;
        this.f38080c = lj0Var;
        this.f38078a = new TextView[4];
        this.f38079b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f10 = org.telegram.messenger.vl.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f11 = org.telegram.messenger.vl.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.vl.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f38078a[i12] = new TextView(context);
                this.f38079b[i12] = new TextView(context);
                this.f38078a[i12].setTypeface(AndroidUtilities.bold());
                this.f38078a[i12].setTextSize(1, 17.0f);
                this.f38079b[i12].setTextSize(1, 13.0f);
                this.f38079b[i12].setGravity(3);
                f12.addView(this.f38078a[i12]);
                f11.addView(f12);
                f11.addView(this.f38079b[i12]);
                f10.addView(f11, w7.x5.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(f10, w7.x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f38078a[i10];
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            lj0 lj0Var = this.f38080c;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, lj0Var.getResourceProvider()));
            this.f38079b[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21061z6, lj0Var.getResourceProvider()));
        }
    }
}
