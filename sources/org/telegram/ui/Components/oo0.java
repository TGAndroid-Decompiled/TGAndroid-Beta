package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 extends LinearLayout {
    public final xu0 f31442a;
    public final TextView f31443b;
    public final TextView f31444c;

    public oo0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setLayoutParams(new f2.x0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        xu0 xu0Var = new xu0(context);
        this.f31442a = xu0Var;
        addView(xu0Var, i7.f6.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f31443b = textView;
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f31444c = textView2;
        textView2.setTextColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
