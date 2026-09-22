package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class bc extends mb {
    public final v9 f22939a;
    public final TextView f22940b;

    public bc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        v9 v9Var = new v9(getContext());
        this.f22939a = v9Var;
        TextView textView = new TextView(getContext());
        this.f22940b = textView;
        addView(v9Var, w7.y5.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.y5.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f22940b.getText();
    }
}
