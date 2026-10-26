package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ej extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f27883a;
    public final TextView f27884b;
    public final TextView f27885c;

    public ej(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f27883a = u6Var;
        setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.u(-1, -2, 17));
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        linearLayout.addView(y9Var, gb1.x(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f27884b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, gb1.x(-1, -2, 17, 32, 12, 32, 8), context);
        this.f27885c = e;
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        linearLayout.addView(e, gb1.x(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27883a;
        this.f27884b.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f27885c.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23748y6, u6Var));
    }
}
