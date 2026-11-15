package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class tb extends va {
    public final i9 f39628a;
    public final TextView f39629b;
    public final TextView f39630c;

    public tb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        getThemedColor(i7);
        i9 i9Var = new i9(context);
        this.f39628a = i9Var;
        addView(i9Var, c8.ja.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f39629b = textView;
        textView.setSingleLine();
        org.telegram.messenger.k5.m(textView, i7, e6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f39630c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.q6.U(textView2, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(textView2, org.telegram.ui.ActionBar.j6.xj, e6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39629b.getText()) + ".\n" + ((Object) this.f39630c.getText());
    }
}
