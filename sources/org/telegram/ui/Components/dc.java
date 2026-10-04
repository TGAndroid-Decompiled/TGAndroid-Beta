package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class dc extends ob {
    public final w9 f25696a;
    public final TextView f25697b;

    public dc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        w9 w9Var = new w9(getContext());
        this.f25696a = w9Var;
        TextView textView = new TextView(getContext());
        this.f25697b = textView;
        addView(w9Var, w7.z5.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.z5.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25697b.getText();
    }
}
