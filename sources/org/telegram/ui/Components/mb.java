package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class mb extends ya {
    public final k9 f36116a;
    public final TextView f36117b;

    public mb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        k9 k9Var = new k9(getContext());
        this.f36116a = k9Var;
        TextView textView = new TextView(getContext());
        this.f36117b = textView;
        addView(k9Var, b8.mf.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.vj, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, b8.mf.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f36117b.getText();
    }
}
