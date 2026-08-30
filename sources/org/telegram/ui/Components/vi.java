package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class vi extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f29491a;
    public final TextView f29492b;
    public final TextView f29493c;

    public vi(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29491a = f6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.q(-1, -2, 17));
        p9 p9Var = new p9(context);
        p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        linearLayout.addView(p9Var, k7.b6.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f29492b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView j10 = org.telegram.ui.yh.j(linearLayout, textView, k7.b6.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f29493c = j10;
        j10.setTextSize(1, 14.0f);
        j10.setGravity(17);
        linearLayout.addView(j10, k7.b6.t(-1, -2, 17, 32, 0, 32, 0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29491a;
        this.f29492b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f29493c.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
