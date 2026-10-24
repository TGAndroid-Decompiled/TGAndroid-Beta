package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class cj extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f25341a;
    public final TextView f25342b;
    public final TextView f25343c;

    public cj(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25341a = g6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.q(-1, -2, 17));
        u9 u9Var = new u9(context);
        u9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout.addView(u9Var, w7.z5.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f25342b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView f7 = org.telegram.messenger.tl.f(linearLayout, textView, w7.z5.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f25343c = f7;
        f7.setTextSize(1, 14.0f);
        f7.setGravity(17);
        linearLayout.addView(f7, w7.z5.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25341a;
        this.f25342b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f25343c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var));
    }
}
