package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class sb extends eb {
    public final q9 f39544a;
    public final TextView f39545b;

    public sb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        q9 q9Var = new q9(getContext());
        this.f39544a = q9Var;
        TextView textView = new TextView(getContext());
        this.f39545b = textView;
        addView(q9Var, c8.ma.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.yj, h6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ma.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f39545b.getText();
    }
}
