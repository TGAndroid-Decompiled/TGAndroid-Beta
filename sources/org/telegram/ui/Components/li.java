package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class li extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f35678a;
    public final TextView f35679b;
    public final TextView f35680c;

    public li(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f35678a = h6Var;
        setPadding(0, org.telegram.messenger.g0.L(42.0f), 0, org.telegram.messenger.g0.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.r(-1, -2, 17));
        k9 k9Var = new k9(context);
        k9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        linearLayout.addView(k9Var, c8.ha.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f35679b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f35680c = f10;
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35678a;
        this.f35679b.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f35680c.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, h6Var));
    }
}
