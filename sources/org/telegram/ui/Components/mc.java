package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class mc extends nb {
    public final w9 f28631a;
    public final TextView f28632b;
    public final TextView f28633c;

    public mc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        w9 w9Var = new w9(context);
        this.f28631a = w9Var;
        addView(w9Var, w7.z5.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f28632b = textView;
        textView.setSingleLine();
        org.telegram.messenger.v0.q(textView, i10, g6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f28633c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.r6.W(textView2, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(textView2, org.telegram.ui.ActionBar.k6.Gi, g6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28632b.getText()) + ".\n" + ((Object) this.f28633c.getText());
    }
}
