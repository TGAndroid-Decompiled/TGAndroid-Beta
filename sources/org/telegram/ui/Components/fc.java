package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class fc extends qb {
    public final y9 f26385a;
    public final TextView f26386b;

    public fc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        y9 y9Var = new y9(getContext());
        this.f26385a = y9Var;
        TextView textView = new TextView(getContext());
        this.f26386b = textView;
        addView(y9Var, w7.x5.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f26386b.getText();
    }
}
