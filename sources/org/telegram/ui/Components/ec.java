package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class ec extends pb {
    public final y9 f25968a;
    public final TextView f25969b;

    public ec(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        y9 y9Var = new y9(getContext());
        this.f25968a = y9Var;
        TextView textView = new TextView(getContext());
        this.f25969b = textView;
        addView(y9Var, w7.x5.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25969b.getText();
    }
}
