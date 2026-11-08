package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class an0 extends LinearLayout {
    public final it0 f31865a;
    public final TextView f31866b;
    public final TextView f31867c;

    public an0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setLayoutParams(new v4.o0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = L / 2;
        setPadding(L, i7, L, i7);
        it0 it0Var = new it0(context);
        this.f31865a = it0Var;
        addView(it0Var, c8.ha.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f31866b = textView;
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f31867c = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.r6.h(i10, 102), f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
