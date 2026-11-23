package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class on0 extends LinearLayout {
    public final tt0 f38220a;
    public final TextView f38221b;
    public final TextView f38222c;

    public on0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setLayoutParams(new v4.q0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = L / 2;
        setPadding(L, i7, L, i7);
        tt0 tt0Var = new tt0(context);
        this.f38220a = tt0Var;
        addView(tt0Var, c8.na.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f38221b = textView;
        int i10 = org.telegram.ui.ActionBar.n6.E8;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f38222c = textView2;
        org.telegram.ui.ActionBar.u6.V(textView2, org.telegram.ui.ActionBar.u6.g(i10, 102), i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
