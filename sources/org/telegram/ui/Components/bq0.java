package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bq0 extends LinearLayout {
    public final nw0 f26892a;
    public final TextView f26893b;
    public final TextView f26894c;

    public bq0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setLayoutParams(new s4.q0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        nw0 nw0Var = new nw0(context);
        this.f26892a = nw0Var;
        addView(nw0Var, kb1.g(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.q(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f26893b = textView;
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f26894c = textView2;
        org.telegram.ui.ActionBar.f7.W(textView2, org.telegram.ui.ActionBar.f7.h(i11, 102), u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
