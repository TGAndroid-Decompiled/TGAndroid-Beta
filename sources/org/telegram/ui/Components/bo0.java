package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class bo0 extends LinearLayout {
    public final lu0 f24847a;
    public final TextView f24848b;
    public final TextView f24849c;

    public bo0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setLayoutParams(new s4.o0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.i0.L(14.0f);
        int i10 = L / 2;
        setPadding(L, i10, L, i10);
        lu0 lu0Var = new lu0(context);
        this.f24847a = lu0Var;
        addView(lu0Var, w7.b6.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f24848b = textView;
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f24849c = textView2;
        org.telegram.ui.ActionBar.a7.W(textView2, org.telegram.ui.ActionBar.a7.h(i11, 102), p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
