package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f32735a;
    public final TextView[] f32736b;
    public final dj0 f32737c;

    public cj0(dj0 dj0Var, Context context) {
        super(context);
        float f7;
        this.f32737c = dj0Var;
        this.f32735a = new TextView[4];
        this.f32736b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f10 = org.telegram.messenger.ok.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f11 = org.telegram.messenger.ok.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.ok.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f32735a[i12] = new TextView(context);
                this.f32736b[i12] = new TextView(context);
                this.f32735a[i12].setTypeface(AndroidUtilities.bold());
                this.f32735a[i12].setTextSize(1, 17.0f);
                this.f32736b[i12].setTextSize(1, 13.0f);
                this.f32736b[i12].setGravity(3);
                f12.addView(this.f32735a[i12]);
                f11.addView(f12);
                f11.addView(this.f32736b[i12]);
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
            TextView textView = this.f32735a[i10];
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            dj0 dj0Var = this.f32737c;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, dj0Var.getResourceProvider()));
            this.f32736b[i10].setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19461z6, dj0Var.getResourceProvider()));
        }
    }
}
