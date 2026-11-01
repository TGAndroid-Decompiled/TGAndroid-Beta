package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ph0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f40486a;
    public final TextView[] f40487b;
    public final qh0 f40488c;

    public ph0(qh0 qh0Var, Context context) {
        super(context);
        float f7;
        this.f40488c = qh0Var;
        this.f40486a = new TextView[4];
        this.f40487b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.m5.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f40486a[i12] = new TextView(context);
                this.f40487b[i12] = new TextView(context);
                this.f40486a[i12].setTypeface(org.telegram.messenger.i0.o());
                this.f40486a[i12].setTextSize(1, 17.0f);
                this.f40487b[i12].setTextSize(1, 13.0f);
                this.f40487b[i12].setGravity(3);
                f12.addView(this.f40486a[i12]);
                f11.addView(f12);
                f11.addView(this.f40487b[i12]);
                f10.addView(f11, w7.b6.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(f10, w7.b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f40486a[i10];
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            qh0 qh0Var = this.f40488c;
            textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, qh0Var.getResourceProvider()));
            this.f40487b[i10].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, qh0Var.getResourceProvider()));
        }
    }
}
