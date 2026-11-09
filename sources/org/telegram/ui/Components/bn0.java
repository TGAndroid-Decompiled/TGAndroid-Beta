package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class bn0 extends LinearLayout {
    public final kt0 f32331a;
    public final TextView f32332b;
    public final TextView f32333c;

    public bn0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setLayoutParams(new v4.o0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = L / 2;
        setPadding(L, i7, L, i7);
        kt0 kt0Var = new kt0(context);
        this.f32331a = kt0Var;
        addView(kt0Var, c8.ha.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f32332b = textView;
        int i10 = org.telegram.ui.ActionBar.l6.E8;
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f32333c = textView2;
        org.telegram.ui.ActionBar.s6.V(textView2, org.telegram.ui.ActionBar.s6.g(i10, 102), g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
