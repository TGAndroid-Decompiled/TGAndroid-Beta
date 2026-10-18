package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class aa extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f33988a;
    public final org.telegram.ui.Components.w9 f33989b;
    public final TextView f33990c;
    public final TextView d;

    public aa(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f33988a = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f33989b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        addView(w9Var, w7.z5.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33990c = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = i10;
        i10.setTextSize(1, 14.0f);
        linearLayout.addView(i10, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f33988a;
        this.f33990c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, d6Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
