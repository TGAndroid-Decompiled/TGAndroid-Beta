package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class fa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f42489a;
    public final org.telegram.ui.Components.l9 f42490b;
    public final TextView f42491c;
    public final TextView d;

    public fa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42489a = g6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f42490b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
        addView(l9Var, c8.ha.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42491c = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f42489a;
        this.f42491c.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28275z6, g6Var));
    }
}
