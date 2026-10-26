package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class cc extends nb {
    public final y9 f27113a;
    public final TextView f27114b;

    public cc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        y9 y9Var = new y9(getContext());
        this.f27113a = y9Var;
        TextView textView = new TextView(getContext());
        this.f27114b = textView;
        addView(y9Var, gb1.m(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Hi, u6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, gb1.m(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27114b.getText();
    }
}
