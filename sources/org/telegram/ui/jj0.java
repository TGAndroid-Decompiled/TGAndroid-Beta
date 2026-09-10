package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f34123a;
    public final TextView[] f34124b;
    public final kj0 f34125c;

    public jj0(kj0 kj0Var, Context context) {
        super(context);
        float f7;
        this.f34125c = kj0Var;
        this.f34123a = new TextView[4];
        this.f34124b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f10 = org.telegram.messenger.em.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f11 = org.telegram.messenger.em.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.em.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f34123a[i12] = new TextView(context);
                this.f34124b[i12] = new TextView(context);
                this.f34123a[i12].setTypeface(AndroidUtilities.bold());
                this.f34123a[i12].setTextSize(1, 17.0f);
                this.f34124b[i12].setTextSize(1, 13.0f);
                this.f34124b[i12].setGravity(3);
                f12.addView(this.f34123a[i12]);
                f11.addView(f12);
                f11.addView(this.f34124b[i12]);
                f10.addView(f11, w7.a6.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(f10, w7.a6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f34123a[i10];
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            kj0 kj0Var = this.f34125c;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, kj0Var.getResourceProvider()));
            this.f34124b[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, kj0Var.getResourceProvider()));
        }
    }
}
