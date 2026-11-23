package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class rb extends db {
    public final p9 f39267a;
    public final TextView f39268b;

    public rb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        p9 p9Var = new p9(getContext());
        this.f39267a = p9Var;
        TextView textView = new TextView(getContext());
        this.f39268b = textView;
        addView(p9Var, c8.na.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.yj, i6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.na.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f39268b.getText();
    }
}
