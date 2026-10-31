package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class ib extends ta {
    public final g9 f26947a;
    public final TextView f26948b;

    public ib(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        g9 g9Var = new g9(getContext());
        this.f26947a = g9Var;
        TextView textView = new TextView(getContext());
        this.f26948b = textView;
        addView(g9Var, w7.b6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.vj, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.b6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f26948b.getText();
    }
}
