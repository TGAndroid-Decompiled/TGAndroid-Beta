package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.z9;
public final class b9 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f32710a;
    public final z9 f32711b;
    public final TextView f32712c;
    public final TextView d;

    public b9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f32710a = c6Var;
        z9 z9Var = new z9(context);
        this.f32711b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        addView(z9Var, w7.z5.a(28.0f, 18.0f, 0.0f, 0.0f, 0.0f, 28, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.a(-2.0f, 62.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        TextView textView = new TextView(context);
        this.f32712c = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = i10;
        i10.setTextSize(1, 14.0f);
        linearLayout.addView(i10, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f32710a;
        this.f32712c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
