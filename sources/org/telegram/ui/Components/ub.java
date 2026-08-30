package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class ub extends eb {
    public final p9 f29175a;
    public final TextView f29176b;

    public ub(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        p9 p9Var = new p9(getContext());
        this.f29175a = p9Var;
        TextView textView = new TextView(getContext());
        this.f29176b = textView;
        addView(p9Var, k7.b6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, k7.b6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29176b.getText();
    }
}
