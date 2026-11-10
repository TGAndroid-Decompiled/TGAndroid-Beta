package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class an0 extends LinearLayout {
    public final jt0 f31934a;
    public final TextView f31935b;
    public final TextView f31936c;

    public an0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setLayoutParams(new v4.o0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = L / 2;
        setPadding(L, i7, L, i7);
        jt0 jt0Var = new jt0(context);
        this.f31934a = jt0Var;
        addView(jt0Var, c8.ha.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f31935b = textView;
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f31936c = textView2;
        org.telegram.ui.ActionBar.t6.V(textView2, org.telegram.ui.ActionBar.t6.g(i10, 102), h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
