package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gj0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f36689a;
    public final TextView[] f36690b;
    public final hj0 f36691c;

    public gj0(hj0 hj0Var, Context context) {
        super(context);
        float f7;
        this.f36691c = hj0Var;
        this.f36689a = new TextView[4];
        this.f36690b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout e10 = org.telegram.messenger.bi.e(context, 1);
                LinearLayout e11 = org.telegram.messenger.bi.e(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f36689a[i12] = new TextView(context);
                this.f36690b[i12] = new TextView(context);
                this.f36689a[i12].setTypeface(AndroidUtilities.bold());
                this.f36689a[i12].setTextSize(1, 17.0f);
                this.f36690b[i12].setTextSize(1, 13.0f);
                this.f36690b[i12].setGravity(3);
                e11.addView(this.f36689a[i12]);
                e10.addView(e11);
                e10.addView(this.f36690b[i12]);
                e7.addView(e10, w7.z5.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(e7, w7.z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f36689a[i10];
            int i11 = org.telegram.ui.ActionBar.i6.G6;
            hj0 hj0Var = this.f36691c;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, hj0Var.getResourceProvider()));
            this.f36690b[i10].setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, hj0Var.getResourceProvider()));
        }
    }
}
