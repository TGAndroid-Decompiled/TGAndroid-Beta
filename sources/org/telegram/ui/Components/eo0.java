package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class eo0 extends LinearLayout {

    public final pu0 f28107a;

    public final TextView f28108b;

    public final TextView f28109c;

    public eo0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setLayoutParams(new f2.y0(-1, -2));
        setOrientation(0);
        setGravity(16);
        int iDp = AndroidUtilities.dp(14.0f);
        int i10 = iDp / 2;
        setPadding(iDp, i10, iDp, i10);
        pu0 pu0Var = new pu0(context);
        this.f28107a = pu0Var;
        addView(pu0Var, h7.z5.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.f28108b = textView;
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f28109c = textView2;
        textView2.setTextColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), 102));
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
