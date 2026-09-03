package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yo0 extends LinearLayout {
    public final fv0 f33579a;
    public final TextView f33580b;
    public final TextView f33581c;

    public yo0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setLayoutParams(new f2.x0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        fv0 fv0Var = new fv0(context);
        this.f33579a = fv0Var;
        addView(fv0Var, k7.c6.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f33580b = textView;
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f33581c = textView2;
        textView2.setTextColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
