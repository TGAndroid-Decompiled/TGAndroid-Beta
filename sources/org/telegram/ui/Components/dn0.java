package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class dn0 extends LinearLayout {
    public final ht0 f33169a;
    public final TextView f33170b;
    public final TextView f33171c;

    public dn0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setLayoutParams(new u4.p0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i3 = L / 2;
        setPadding(L, i3, L, i3);
        ht0 ht0Var = new ht0(context);
        this.f33169a = ht0Var;
        addView(ht0Var, b8.mf.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f33170b = textView;
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f33171c = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.r6.h(i10, 102), e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
