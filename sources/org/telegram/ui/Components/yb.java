package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class yb extends jb {
    public final t9 f35010a;
    public final TextView f35011b;

    public yb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        t9 t9Var = new t9(getContext());
        this.f35010a = t9Var;
        TextView textView = new TextView(getContext());
        this.f35011b = textView;
        addView(t9Var, i7.f6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, i7.f6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f35011b.getText();
    }
}
