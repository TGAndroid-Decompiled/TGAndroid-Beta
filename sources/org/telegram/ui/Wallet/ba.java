package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
public final class ba extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f36401a;
    public final org.telegram.ui.Components.y9 f36402b;
    public final TextView f36403c;
    public final TextView d;

    public ba(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f36401a = u6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f36402b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        addView(y9Var, gb1.h(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.h(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f36403c = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = vh.e(linearLayout, textView, gb1.o(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = e;
        e.setTextSize(1, 14.0f);
        linearLayout.addView(e, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36401a;
        this.f36403c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23765z6, u6Var));
    }
}
