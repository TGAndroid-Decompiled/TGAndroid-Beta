package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class sb extends ta {
    public final g9 f30254a;
    public final TextView f30255b;
    public final TextView f30256c;

    public sb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        getThemedColor(i10);
        g9 g9Var = new g9(context);
        this.f30254a = g9Var;
        addView(g9Var, w7.b6.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f30255b = textView;
        textView.setSingleLine();
        org.telegram.messenger.m5.m(textView, i10, p6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f30256c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.a7.V(textView2, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(textView2, org.telegram.ui.ActionBar.t6.uj, p6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f30255b.getText()) + ".\n" + ((Object) this.f30256c.getText());
    }
}
