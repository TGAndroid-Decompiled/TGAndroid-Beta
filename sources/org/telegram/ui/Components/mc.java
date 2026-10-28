package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class mc extends nb {
    public final y9 f30492a;
    public final TextView f30493b;
    public final TextView f30494c;

    public mc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        getThemedColor(i10);
        y9 y9Var = new y9(context);
        this.f30492a = y9Var;
        addView(y9Var, kb1.m(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.m(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f30493b = textView;
        textView.setSingleLine();
        org.telegram.messenger.t.r(textView, i10, u6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f30494c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(textView2, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f30493b.getText()) + ".\n" + ((Object) this.f30494c.getText());
    }
}
