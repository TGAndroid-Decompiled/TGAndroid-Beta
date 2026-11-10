package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class lg0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f47606a;
    public final TextView[] f47607b;
    public final mg0 f47608c;

    public lg0(mg0 mg0Var, Context context) {
        super(context);
        float f10;
        this.f47608c = mg0Var;
        this.f47606a = new TextView[4];
        this.f47607b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f13 = org.telegram.messenger.k5.f(context, 0);
                int i11 = (i7 * 2) + i10;
                this.f47606a[i11] = new TextView(context);
                this.f47607b[i11] = new TextView(context);
                this.f47606a[i11].setTypeface(org.telegram.messenger.g0.o());
                this.f47606a[i11].setTextSize(1, 17.0f);
                this.f47607b[i11].setTextSize(1, 13.0f);
                this.f47607b[i11].setGravity(3);
                f13.addView(this.f47606a[i11]);
                f12.addView(f13);
                f12.addView(this.f47607b[i11]);
                f11.addView(f12, c8.ha.l(1.0f, -1, -2));
            }
            if (i7 == 0) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            addView(f11, c8.ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f10));
        }
    }

    public final void a() {
        for (int i7 = 0; i7 < 4; i7++) {
            TextView textView = this.f47606a[i7];
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            mg0 mg0Var = this.f47608c;
            textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, mg0Var.getResourceProvider()));
            this.f47607b[i7].setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, mg0Var.getResourceProvider()));
        }
    }
}
