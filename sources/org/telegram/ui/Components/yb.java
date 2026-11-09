package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class yb extends za {
    public final l9 f40692a;
    public final TextView f40693b;
    public final TextView f40694c;

    public yb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i7 = org.telegram.ui.ActionBar.l6.vj;
        getThemedColor(i7);
        l9 l9Var = new l9(context);
        this.f40692a = l9Var;
        addView(l9Var, c8.ha.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f40693b = textView;
        textView.setSingleLine();
        org.telegram.messenger.k5.n(textView, i7, g6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f40694c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.s6.U(textView2, i7, g6Var);
        org.telegram.ui.ActionBar.s6.G(textView2, org.telegram.ui.ActionBar.l6.uj, g6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40693b.getText()) + ".\n" + ((Object) this.f40694c.getText());
    }
}
