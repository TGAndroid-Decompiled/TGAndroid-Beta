package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class gj extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f24985a;
    public final TextView f24986b;
    public final TextView f24987c;

    public gj(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24985a = c6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.q(-1, -2, 17));
        z9 z9Var = new z9(context);
        z9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout.addView(z9Var, w7.z5.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24986b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f24987c = i10;
        i10.setTextSize(1, 14.0f);
        i10.setGravity(17);
        linearLayout.addView(i10, w7.z5.t(-1, -2, 17, 32, 0, 32, 0));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24985a;
        this.f24986b.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.f24987c.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
