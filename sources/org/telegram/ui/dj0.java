package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f33117a;
    public final TextView[] f33118b;
    public final ej0 f33119c;

    public dj0(ej0 ej0Var, Context context) {
        super(context);
        float f7;
        this.f33119c = ej0Var;
        this.f33117a = new TextView[4];
        this.f33118b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f10 = org.telegram.messenger.ok.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f11 = org.telegram.messenger.ok.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.ok.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f33117a[i12] = new TextView(context);
                this.f33118b[i12] = new TextView(context);
                this.f33117a[i12].setTypeface(AndroidUtilities.bold());
                this.f33117a[i12].setTextSize(1, 17.0f);
                this.f33118b[i12].setTextSize(1, 13.0f);
                this.f33118b[i12].setGravity(3);
                f12.addView(this.f33117a[i12]);
                f11.addView(f12);
                f11.addView(this.f33118b[i12]);
                f10.addView(f11, w7.y5.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(f10, w7.y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f33117a[i10];
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            ej0 ej0Var = this.f33119c;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, ej0Var.getResourceProvider()));
            this.f33118b[i10].setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19447z6, ej0Var.getResourceProvider()));
        }
    }
}
