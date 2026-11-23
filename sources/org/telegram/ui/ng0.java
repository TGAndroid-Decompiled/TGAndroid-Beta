package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ng0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f50192a;
    public final TextView[] f50193b;
    public final og0 f50194c;

    public ng0(og0 og0Var, Context context) {
        super(context);
        float f10;
        this.f50194c = og0Var;
        this.f50192a = new TextView[4];
        this.f50193b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.f3.g(context, 0);
                int i11 = (i7 * 2) + i10;
                this.f50192a[i11] = new TextView(context);
                this.f50193b[i11] = new TextView(context);
                this.f50192a[i11].setTypeface(org.telegram.messenger.g0.o());
                this.f50192a[i11].setTextSize(1, 17.0f);
                this.f50193b[i11].setTextSize(1, 13.0f);
                this.f50193b[i11].setGravity(3);
                g12.addView(this.f50192a[i11]);
                g11.addView(g12);
                g11.addView(this.f50193b[i11]);
                g10.addView(g11, c8.ma.l(1.0f, -1, -2));
            }
            if (i7 == 0) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            addView(g10, c8.ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f10));
        }
    }

    public final void a() {
        for (int i7 = 0; i7 < 4; i7++) {
            TextView textView = this.f50192a[i7];
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            og0 og0Var = this.f50194c;
            textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, og0Var.getResourceProvider()));
            this.f50193b[i7].setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29792z6, og0Var.getResourceProvider()));
        }
    }
}
