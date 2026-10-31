package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class li extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f28115a;
    public final TextView f28116b;
    public final TextView f28117c;

    public li(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f28115a = p6Var;
        setPadding(0, org.telegram.messenger.i0.L(42.0f), 0, org.telegram.messenger.i0.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.r(-1, -2, 17));
        g9 g9Var = new g9(context);
        g9Var.setImageDrawable(new bi0(2131624317, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
        linearLayout.addView(g9Var, w7.b6.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f28116b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        TextView f7 = org.telegram.messenger.z20.f(linearLayout, textView, w7.b6.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f28117c = f7;
        f7.setTextSize(1, 14.0f);
        f7.setGravity(17);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f28115a;
        this.f28116b.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f28117c.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, p6Var));
    }
}
