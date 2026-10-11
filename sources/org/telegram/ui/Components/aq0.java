package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class aq0 extends LinearLayout {
    public final jw0 f24649a;
    public final TextView f24650b;
    public final TextView f24651c;

    public aq0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setLayoutParams(new s4.q0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        jw0 jw0Var = new jw0(context);
        this.f24649a = jw0Var;
        addView(jw0Var, w7.x5.d(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f24650b = textView;
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f24651c = textView2;
        textView2.setTextColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
