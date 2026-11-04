package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class cg0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f44349a;
    public final TextView[] f44350b;
    public final dg0 f44351c;

    public cg0(dg0 dg0Var, Context context) {
        super(context);
        float f10;
        this.f44351c = dg0Var;
        this.f44349a = new TextView[4];
        this.f44350b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        for (int i3 = 0; i3 < 2; i3++) {
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f13 = org.telegram.messenger.k5.f(context, 0);
                int i11 = (i3 * 2) + i10;
                this.f44349a[i11] = new TextView(context);
                this.f44350b[i11] = new TextView(context);
                this.f44349a[i11].setTypeface(org.telegram.messenger.g0.o());
                this.f44349a[i11].setTextSize(1, 17.0f);
                this.f44350b[i11].setTextSize(1, 13.0f);
                this.f44350b[i11].setGravity(3);
                f13.addView(this.f44349a[i11]);
                f12.addView(f13);
                f12.addView(this.f44350b[i11]);
                f11.addView(f12, b8.mf.l(1.0f, -1, -2));
            }
            if (i3 == 0) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            addView(f11, b8.mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f10));
        }
    }

    public final void a() {
        for (int i3 = 0; i3 < 4; i3++) {
            TextView textView = this.f44349a[i3];
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            dg0 dg0Var = this.f44351c;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, dg0Var.getResourceProvider()));
            this.f44350b[i3].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, dg0Var.getResourceProvider()));
        }
    }
}
