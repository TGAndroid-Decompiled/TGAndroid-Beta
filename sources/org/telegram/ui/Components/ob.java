package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class ob extends za {
    public final l9 f36685a;
    public final TextView f36686b;

    public ob(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        l9 l9Var = new l9(getContext());
        this.f36685a = l9Var;
        TextView textView = new TextView(getContext());
        this.f36686b = textView;
        addView(l9Var, c8.ha.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.vj, g6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ha.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f36686b.getText();
    }
}
