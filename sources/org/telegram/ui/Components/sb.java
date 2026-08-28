package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class sb extends eb {
    public final o9 f32417a;
    public final TextView f32418b;

    public sb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        o9 o9Var = new o9(getContext());
        this.f32417a = o9Var;
        TextView textView = new TextView(getContext());
        this.f32418b = textView;
        addView(o9Var, g7.e6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, g7.e6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f32418b.getText();
    }
}
