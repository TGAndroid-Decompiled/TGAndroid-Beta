package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class qi extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f31909a;

    public final TextView f31910b;

    public final TextView f31911c;

    public qi(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31909a = c6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.q(-1, -2, 17));
        n9 n9Var = new n9(context);
        n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        linearLayout.addView(n9Var, h7.z5.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f31910b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f31911c = textViewI;
        textViewI.setTextSize(1, 14.0f);
        textViewI.setGravity(17);
        linearLayout.addView(textViewI, h7.z5.t(-1, -2, 17, 32, 0, 32, 0));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31909a;
        this.f31910b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f31911c.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
