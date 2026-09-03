package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wi extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f32759a;
    public final TextView f32760b;
    public final TextView f32761c;

    public wi(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f32759a = g6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.q(-1, -2, 17));
        p9 p9Var = new p9(context);
        p9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout.addView(p9Var, k7.c6.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f32760b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView i10 = org.telegram.ui.yh.i(linearLayout, textView, k7.c6.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f32761c = i10;
        i10.setTextSize(1, 14.0f);
        i10.setGravity(17);
        linearLayout.addView(i10, k7.c6.t(-1, -2, 17, 32, 0, 32, 0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f32759a;
        this.f32760b.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f32761c.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, g6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
