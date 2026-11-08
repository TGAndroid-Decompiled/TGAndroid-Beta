package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class yb extends za {
    public final l9 f40639a;
    public final TextView f40640b;
    public final TextView f40641c;

    public yb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i7 = org.telegram.ui.ActionBar.k6.vj;
        getThemedColor(i7);
        l9 l9Var = new l9(context);
        this.f40639a = l9Var;
        addView(l9Var, c8.ha.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f40640b = textView;
        textView.setSingleLine();
        org.telegram.messenger.k5.n(textView, i7, f6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f40641c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.uj, f6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40640b.getText()) + ".\n" + ((Object) this.f40641c.getText());
    }
}
