package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xi extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f34727a;
    public final TextView f34728b;
    public final TextView f34729c;

    public xi(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f34727a = c6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.q(-1, -2, 17));
        t9 t9Var = new t9(context);
        t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        linearLayout.addView(t9Var, i7.f6.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f34728b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView i10 = org.telegram.ui.th.i(linearLayout, textView, i7.f6.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f34729c = i10;
        i10.setTextSize(1, 14.0f);
        i10.setGravity(17);
        linearLayout.addView(i10, i7.f6.t(-1, -2, 17, 32, 0, 32, 0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34727a;
        this.f34728b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f34729c.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
