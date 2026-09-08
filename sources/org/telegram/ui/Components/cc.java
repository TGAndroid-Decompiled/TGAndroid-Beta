package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class cc extends nb {
    public final x9 f24992a;
    public final TextView f24993b;

    public cc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        x9 x9Var = new x9(getContext());
        this.f24992a = x9Var;
        TextView textView = new TextView(getContext());
        this.f24993b = textView;
        addView(x9Var, w7.x5.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f24993b.getText();
    }
}
