package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f42655a;
    public final org.telegram.ui.Components.k9 f42656b;
    public final TextView f42657c;
    public final TextView d;

    public ia(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f42655a = h6Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f42656b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
        addView(k9Var, c8.ha.d(28, 28.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 23, 62.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42657c = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f42655a;
        this.f42657c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var));
    }
}
