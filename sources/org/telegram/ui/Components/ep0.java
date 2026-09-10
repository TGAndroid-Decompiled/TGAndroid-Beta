package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ep0 extends LinearLayout {
    public final pv0 f22739a;
    public final TextView f22740b;
    public final TextView f22741c;

    public ep0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setLayoutParams(new s4.p0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        pv0 pv0Var = new pv0(context);
        this.f22739a = pv0Var;
        addView(pv0Var, w7.a6.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f22740b = textView;
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f22741c = textView2;
        textView2.setTextColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
