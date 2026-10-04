package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class np0 extends LinearLayout {
    public final bw0 f29045a;
    public final TextView f29046b;
    public final TextView f29047c;

    public np0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setLayoutParams(new s4.p0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        bw0 bw0Var = new bw0(context);
        this.f29045a = bw0Var;
        addView(bw0Var, w7.z5.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f29046b = textView;
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f29047c = textView2;
        textView2.setTextColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
