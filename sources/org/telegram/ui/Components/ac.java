package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public class ac extends cb {

    public final n9 f26723a;

    public final TextView f26724b;

    public final TextView f26725c;

    public ac(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Hi);
        n9 n9Var = new n9(context);
        this.f26723a = n9Var;
        addView(n9Var, h7.z5.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f26724b = textView;
        textView.setSingleLine();
        textView.setTextColor(themedColor);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f26725c = textView2;
        textView2.setMaxLines(2);
        textView2.setTextColor(themedColor);
        textView2.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26724b.getText()) + ".\n" + ((Object) this.f26725c.getText());
    }
}
