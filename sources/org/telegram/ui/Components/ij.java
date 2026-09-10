package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ij extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f24035a;
    public final TextView f24036b;
    public final TextView f24037c;

    public ij(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24035a = f6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.q(-1, -2, 17));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout.addView(w9Var, w7.a6.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24036b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f24037c = g10;
        g10.setTextSize(1, 14.0f);
        g10.setGravity(17);
        linearLayout.addView(g10, w7.a6.t(-1, -2, 17, 32, 0, 32, 0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24035a;
        this.f24036b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f24037c.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
