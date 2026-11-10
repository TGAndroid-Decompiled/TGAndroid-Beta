package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class xb extends ya {
    public final k9 f40279a;
    public final TextView f40280b;
    public final TextView f40281c;

    public xb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.vj;
        getThemedColor(i7);
        k9 k9Var = new k9(context);
        this.f40279a = k9Var;
        addView(k9Var, c8.ha.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f40280b = textView;
        textView.setSingleLine();
        org.telegram.messenger.k5.n(textView, i7, h6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f40281c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(textView2, org.telegram.ui.ActionBar.m6.uj, h6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40280b.getText()) + ".\n" + ((Object) this.f40281c.getText());
    }
}
