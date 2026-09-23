package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class gj extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f24306a;
    public final TextView f24307b;
    public final TextView f24308c;

    public gj(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24306a = d6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.q(-1, -2, 17));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new yi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout.addView(w9Var, w7.x5.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24307b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f24308c = h;
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        linearLayout.addView(h, w7.x5.t(-1, -2, 17, 32, 0, 32, 0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24306a;
        this.f24307b.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.f24308c.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19170y6, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
