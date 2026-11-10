package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class nb extends ya {
    public final k9 f36275a;
    public final TextView f36276b;

    public nb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        k9 k9Var = new k9(getContext());
        this.f36275a = k9Var;
        TextView textView = new TextView(getContext());
        this.f36276b = textView;
        addView(k9Var, c8.ha.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.vj, h6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ha.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f36276b.getText();
    }
}
