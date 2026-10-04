package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public class nc extends ob {
    public final w9 f28925a;
    public final TextView f28926b;
    public final TextView f28927c;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Hi);
        w9 w9Var = new w9(context);
        this.f28925a = w9Var;
        addView(w9Var, w7.z5.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f28926b = textView;
        textView.setSingleLine();
        textView.setTextColor(themedColor);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f28927c = textView2;
        textView2.setMaxLines(2);
        textView2.setTextColor(themedColor);
        textView2.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28926b.getText()) + ".\n" + ((Object) this.f28927c.getText());
    }
}
