package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vp0 extends LinearLayout {
    public final ew0 f32038a;
    public final TextView f32039b;
    public final TextView f32040c;

    public vp0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setLayoutParams(new s4.o0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = dp / 2;
        setPadding(dp, i10, dp, i10);
        ew0 ew0Var = new ew0(context);
        this.f32038a = ew0Var;
        addView(ew0Var, w7.z5.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f32039b = textView;
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f32040c = textView2;
        org.telegram.ui.ActionBar.r6.X(textView2, org.telegram.ui.ActionBar.r6.h(i11, 102), g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
